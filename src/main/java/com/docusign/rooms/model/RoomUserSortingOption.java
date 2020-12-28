package com.docusign.rooms.model;

import java.util.Objects;
import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets RoomUserSortingOption
 */
public enum RoomUserSortingOption {
  
  FIRSTNAMEASC("FirstNameAsc"),
  
  LASTNAMEASC("LastNameAsc"),
  
  EMAILASC("EmailAsc"),
  
  FIRSTNAMEDESC("FirstNameDesc"),
  
  LASTNAMEDESC("LastNameDesc"),
  
  EMAILDESC("EmailDesc");

  private String value;

  RoomUserSortingOption(String value) {
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
  public static RoomUserSortingOption fromValue(String text) {
    for (RoomUserSortingOption b : RoomUserSortingOption.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

