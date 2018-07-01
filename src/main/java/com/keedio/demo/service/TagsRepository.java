package com.keedio.demo.service;

import com.keedio.demo.domain.Tag;
import org.springframework.data.repository.Repository;

public interface TagsRepository extends Repository<Tag, Long> {

  Tag save(Tag persisted);
}