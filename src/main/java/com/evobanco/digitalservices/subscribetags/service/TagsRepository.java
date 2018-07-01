package com.evobanco.digitalservices.subscribetags.service;

import com.evobanco.digitalservices.subscribetags.domain.Tag;
import org.springframework.data.repository.Repository;

public interface TagsRepository extends Repository<Tag, Long> {

  Tag save(Tag persisted);
}