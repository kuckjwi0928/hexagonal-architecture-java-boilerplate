package com.example.hexagonal.architecture.common;

import java.util.List;
import java.util.stream.Collectors;

public interface BaseMapper<DOMAIN, ENTITY> {
  ENTITY mapToEntity(DOMAIN domain);

  DOMAIN mapToDomain(ENTITY entity);

  default List<ENTITY> mapToEntities(List<DOMAIN> domains) {
    return domains.stream().map(this::mapToEntity).collect(Collectors.toList());
  }

  default List<DOMAIN> mapToDomains(List<ENTITY> entities) {
    return entities.stream().map(this::mapToDomain).collect(Collectors.toList());
  }
}
