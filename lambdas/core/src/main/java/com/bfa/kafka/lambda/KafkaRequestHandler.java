package com.bfa.kafka.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.bfa.kafka.models.KafkaEvent;
import com.bfa.kafka.models.KafkaRecord;
import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public interface KafkaRequestHandler<ValueType, Output> extends RequestHandler<KafkaEvent<ValueType>, Output> {

  default Output handleRequest(final KafkaEvent<ValueType> input, Context context) throws IOException {
    var recordList = input.getRecords()
        .values()
        .stream()
        .flatMap(Collection::stream)
        .collect(Collectors.toList());
    return handleRequest(recordList, context);
  }
  Output handleRequest(final List<KafkaRecord<ValueType>> input, Context context);
}
