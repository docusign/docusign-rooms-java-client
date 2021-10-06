package com.docusign.rooms.model;

import java.util.Objects;
import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets RoomStatus
 */
public enum RoomStatus {
  
  ACTIVE("Active"),
  
  PENDING("Pending"),
  
  CLOSED("Closed"),
  
  OPEN("Open");

  private String value;

  RoomStatus(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static RoomStatus fromValue(String value) {
    for (RoomStatus b : RoomStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

