package com.bfa.kafka.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestStreamHandler;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;
import java.util.stream.Collectors;
import org.apache.commons.lang3.reflect.TypeUtils;

/**
 * Enhance the RequestHandler's json parsing ability.
 * support the deserialize input and serialize output
 *
 * @param <Input>  input type
 * @param <Output> output type
 */
public interface RequestHandler<Input, Output> extends RequestStreamHandler {

  ObjectMapper OBJECT_MAPPER = JsonMapper.builder()
      .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
      .configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, true)
      .configure(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES, true)
      .configure(JsonParser.Feature.ALLOW_SINGLE_QUOTES, true)
      .configure(DeserializationFeature.ADJUST_DATES_TO_CONTEXT_TIME_ZONE, false)
      .configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false)
      .configure(JsonParser.Feature.AUTO_CLOSE_SOURCE, true)
      .serializationInclusion(Include.NON_NULL)
      .addModule(new JavaTimeModule())
      .build();
  default void handleRequest(InputStream input, OutputStream output, Context context) throws IOException {
    handleRequest(OBJECT_MAPPER.readTree(input), output, context);
  }

  default void handleRequest(final JsonNode jsonNode, OutputStream output, Context context) throws IOException {
    Map<String, JavaType> types = TypeUtils.getTypeArguments(getClass(), RequestHandler.class)
        .entrySet().stream()
        .filter(type -> RequestHandler.class.equals(type.getKey().getGenericDeclaration()))
        .collect(Collectors.toMap(type -> type.getKey().getName(), type -> OBJECT_MAPPER.constructType(type.getValue())));
    Output result = handleRequest(OBJECT_MAPPER.convertValue(jsonNode, types.get("Input")), context);
    if (output != null && types.get("Output").getRawClass() != Void.class)
      output.write(OBJECT_MAPPER.writeValueAsBytes(result));
  }

  Output handleRequest(final Input input, Context context) throws IOException;
}

