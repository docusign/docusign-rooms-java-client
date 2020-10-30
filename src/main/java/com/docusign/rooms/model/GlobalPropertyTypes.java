package com.docusign.rooms.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.rooms.model.PropertyType;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * GlobalPropertyTypes
 */

public class GlobalPropertyTypes {
  @JsonProperty("propertyTypes")
  private java.util.List<PropertyType> propertyTypes = null;

  public GlobalPropertyTypes propertyTypes(java.util.List<PropertyType> propertyTypes) {
    this.propertyTypes = propertyTypes;
    return this;
  }

  public GlobalPropertyTypes addPropertyTypesItem(PropertyType propertyTypesItem) {
    if (this.propertyTypes == null) {
      this.propertyTypes = new java.util.ArrayList<PropertyType>();
    }
    this.propertyTypes.add(propertyTypesItem);
    return this;
  }

   /**
   * Get propertyTypes
   * @return propertyTypes
  **/
  @ApiModelProperty(value = "")
  public java.util.List<PropertyType> getPropertyTypes() {
    return propertyTypes;
  }

  public void setPropertyTypes(java.util.List<PropertyType> propertyTypes) {
    this.propertyTypes = propertyTypes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GlobalPropertyTypes globalPropertyTypes = (GlobalPropertyTypes) o;
    return Objects.equals(this.propertyTypes, globalPropertyTypes.propertyTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(propertyTypes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GlobalPropertyTypes {\n");
    
    sb.append("    propertyTypes: ").append(toIndentedString(propertyTypes)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

