package com.evobanco.digitalservices.subscribetags.service;

import com.evobanco.digitalservices.subscribetags.domain.Tag;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component("subscribeService")
@Transactional
class SubscribeServiceImpl implements SubscribeService {

  private final TagsRepository tagsRepository;


  SubscribeServiceImpl(TagsRepository tagsRepository) {
    this.tagsRepository = tagsRepository;
  }


  @Override
  public Tag addTags(Tag tags) {
    return this.tagsRepository.save(tags);
  }

}