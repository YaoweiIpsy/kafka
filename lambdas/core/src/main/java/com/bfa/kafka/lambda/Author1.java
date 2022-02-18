package com.bfa.kafka.lambda;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;

@Jacksonized
@Getter
@Builder
public class Author1 {
  private final String id;
}
