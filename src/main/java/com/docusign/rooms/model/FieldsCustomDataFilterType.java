package com.docusign.rooms.model;

import java.util.Objects;
import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets FieldsCustomDataFilterType
 */
public enum FieldsCustomDataFilterType {
  
  NONE("None"),
  
  ISREQUIREDONCREATE("IsRequiredOnCreate"),
  
  ISREQUIREDONSUBMIT("IsRequiredOnSubmit");

  private String value;

  FieldsCustomDataFilterType(String value) {
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
  public static FieldsCustomDataFilterType fromValue(String text) {
    for (FieldsCustomDataFilterType b : FieldsCustomDataFilterType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

