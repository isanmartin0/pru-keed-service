package com.evobanco.digitalservices.subscribetags.web;


import com.evobanco.digitalservices.subscribetags.domain.Tag;
import com.evobanco.digitalservices.subscribetags.service.SubscribeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SubscribeController {

  private final SubscribeService subscribeService;

  @Autowired
  public SubscribeController(SubscribeService subscribeService) {
    this.subscribeService = subscribeService;
  }

  @GetMapping(value = "/hello")
  @ResponseStatus(HttpStatus.OK)
  public String hello() {
    return "Hello from Keedio";
  }

  @PostMapping("/")
  @Transactional(readOnly = true)
  public ResponseEntity<Tag> subscribeTags(@RequestBody Tag tags) {
    return new ResponseEntity<>(this.subscribeService.addTags(tags), HttpStatus.CREATED);
  }

}
