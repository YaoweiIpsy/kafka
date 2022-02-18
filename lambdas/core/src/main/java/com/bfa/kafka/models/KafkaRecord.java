package com.bfa.kafka.models;

import com.fasterxml.jackson.databind.PropertyNamingStrategies.LowerCamelCaseStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import java.time.Instant;
import java.util.HashMap;
import java.util.Map;
import lombok.Builder;
import lombok.Builder.Default;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;

@Jacksonized
@Builder
@Getter
@JsonNaming(LowerCamelCaseStrategy.class)
public class KafkaRecord<T> {
  private final String topic;
  private final int partition;
  private final long offset;
  private final long timestamp;
  private final String timestampType;
  private final T value;
  private final String key;
//  @Default
//  private final Map<String, byte[]> headers = new HashMap<>();
}
