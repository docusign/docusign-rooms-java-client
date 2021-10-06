package com.docusign.rooms.model;

import java.util.Objects;
import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets RolesFilterContextTypes
 */
public enum RolesFilterContextTypes {
  
  ALLROLES("AllRoles"),
  
  ASSIGNABLEROLESBASEDONCOMPANYPERMISSIONS("AssignableRolesBasedOnCompanyPermissions"),
  
  ASSIGNABLEROLESBASEDONALLPERMISSIONS("AssignableRolesBasedOnAllPermissions");

  private String value;

  RolesFilterContextTypes(String value) {
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
  public static RolesFilterContextTypes fromValue(String value) {
    for (RolesFilterContextTypes b : RolesFilterContextTypes.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

