package com.bfa.kafka.models;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategies.LowerCamelCaseStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import java.util.List;
import java.util.Map;
import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;

@Jacksonized
@Builder
@Getter
@JsonNaming(LowerCamelCaseStrategy.class)
public class KafkaEvent<T> {
  private final String eventSource;
  private final String eventSourceArn;
  private final String bootstrapServers;
  private final Map<String, List<KafkaRecord<T>>> records;

  public static void main(String[] argv) throws Exception {
    ObjectMapper mapper = new ObjectMapper();
    var aa = KafkaEvent.builder().eventSource("adasf").eventSourceArn("arn").bootstrapServers("boot").build();
    System.out.println(mapper.writeValueAsString(aa));
  }
}
