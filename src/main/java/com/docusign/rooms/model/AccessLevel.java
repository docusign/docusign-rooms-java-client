package com.docusign.rooms.model;

import java.util.Objects;
import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets AccessLevel
 */
public enum AccessLevel {
  
  CONTRIBUTOR("Contributor"),
  
  OFFICE("Office"),
  
  REGION("Region"),
  
  COMPANY("Company"),
  
  ADMIN("Admin");

  private String value;

  AccessLevel(String value) {
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
  public static AccessLevel fromValue(String text) {
    for (AccessLevel b : AccessLevel.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

