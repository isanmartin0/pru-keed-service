package com.evobanco.digitalservices.subscribetags.service;

import com.evobanco.digitalservices.subscribetags.domain.Tag;
import org.springframework.data.repository.CrudRepository;

public interface TagsRepository extends CrudRepository<Tag, Long> {
}