package com.docusign.rooms.model;

import java.util.Objects;
import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets MemberSortingOption
 */
public enum MemberSortingOption {
  
  FIRSTNAMEASC("FirstNameAsc"),
  
  LASTNAMEASC("LastNameAsc"),
  
  EMAILASC("EmailAsc"),
  
  FIRSTNAMEDESC("FirstNameDesc"),
  
  LASTNAMEDESC("LastNameDesc"),
  
  EMAILDESC("EmailDesc");

  private String value;

  MemberSortingOption(String value) {
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
  public static MemberSortingOption fromValue(String value) {
    for (MemberSortingOption b : MemberSortingOption.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

