package com.bfa.kafka.lambda;

import com.bfa.models.tables.pojos.Author;
import com.bfa.models.tables.records.AuthorRecord;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.jooq.DSLContext;
import org.jooq.UpdatableRecord;

public class CollectionsTransformation implements Transformation<AuthorRecord, Author> {

  @Override
  public UpdatableRecord<AuthorRecord> handler(DSLContext dslContext, Author node) {


    return null;
  }
}
