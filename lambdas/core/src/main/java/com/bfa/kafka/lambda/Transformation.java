package com.bfa.kafka.lambda;

import com.fasterxml.jackson.databind.JsonNode;
import org.jooq.DSLContext;
import org.jooq.UpdatableRecord;

public interface Transformation<T extends UpdatableRecord<T>, POJO> {
  UpdatableRecord<T>  handler(DSLContext dslContext, POJO pojo);
}
