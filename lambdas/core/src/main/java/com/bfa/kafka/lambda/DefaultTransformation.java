package com.bfa.kafka.lambda;

import java.util.Map.Entry;
import java.util.stream.Collectors;
import lombok.SneakyThrows;
import org.apache.commons.lang3.reflect.TypeUtils;
import org.jooq.DSLContext;
import org.jooq.UpdatableRecord;

public class DefaultTransformation<T extends UpdatableRecord<T>, POJO> implements Transformation<T, POJO> {

  @SneakyThrows
  @Override
  public UpdatableRecord<T> handler(DSLContext dslContext, POJO pojo) {
    var types = TypeUtils.getTypeArguments(getClass(), DefaultTransformation.class)
        .entrySet().stream()
        .filter(type -> DefaultTransformation.class.equals(type.getKey().getGenericDeclaration()))
        .collect(Collectors.toMap(type -> type.getKey().getName(), Entry::getValue));
    Class<T> clazz = (Class<T>) types.get("T");
    UpdatableRecord<T> record = clazz.getDeclaredConstructor().newInstance();
    record.from(pojo);
    return record;
  }
}
