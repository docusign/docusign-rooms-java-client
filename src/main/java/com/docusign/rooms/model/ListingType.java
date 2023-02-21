package com.docusign.rooms.model;

import java.util.Objects;
import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets ListingType
 */
public enum ListingType {
  
  PUBLICRECORDS("PublicRecords"),
  
  MLS("MLS");

  private String value;

  ListingType(String value) {
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
  public static ListingType fromValue(String value) {
    for (ListingType b : ListingType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

