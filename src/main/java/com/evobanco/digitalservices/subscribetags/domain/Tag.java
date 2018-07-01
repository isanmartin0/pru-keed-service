package com.evobanco.digitalservices.subscribetags.domain;


import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Optional;

@Entity
@Table(name = "tbl_tags")
@Getter
@Setter
@NoArgsConstructor // <--- THIS is it
public class Tag implements Serializable {

  private @Id
  @Setter(AccessLevel.PROTECTED)
  @GeneratedValue(strategy = GenerationType.AUTO)
  Long id; // will be set when persisting

  private @NonNull String deviceId;
  private @NonNull String clientId = "DEFAULT-CLIENT-ID";
  private @NonNull String timestamp = String.valueOf(new Timestamp(System.currentTimeMillis()));

  public Tag(String deviceId, String clientId, String timestamp) {
    this.deviceId = deviceId;
    this.clientId = Optional.ofNullable(clientId).orElse("DEFAULT-CLIENT-ID");
    this.timestamp = Optional.ofNullable(timestamp).orElse(String.valueOf(new Timestamp(System.currentTimeMillis())));
  }
}
