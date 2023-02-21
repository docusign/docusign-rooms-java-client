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
 * GlobalPropertyTypes.
 *
 */

public class GlobalPropertyTypes {
  @JsonProperty("propertyTypes")
  private java.util.List<PropertyType> propertyTypes = null;


  /**
   * propertyTypes.
   *
   * @return GlobalPropertyTypes
   **/
  public GlobalPropertyTypes propertyTypes(java.util.List<PropertyType> propertyTypes) {
    this.propertyTypes = propertyTypes;
    return this;
  }
  
  /**
   * addPropertyTypesItem.
   *
   * @return GlobalPropertyTypes
   **/
  public GlobalPropertyTypes addPropertyTypesItem(PropertyType propertyTypesItem) {
    if (this.propertyTypes == null) {
      this.propertyTypes = new java.util.ArrayList<>();
    }
    this.propertyTypes.add(propertyTypesItem);
    return this;
  }

  /**
   * Get propertyTypes.
   * @return propertyTypes
   **/
  @ApiModelProperty(value = "")
  public java.util.List<PropertyType> getPropertyTypes() {
    return propertyTypes;
  }

  /**
   * setPropertyTypes.
   **/
  public void setPropertyTypes(java.util.List<PropertyType> propertyTypes) {
    this.propertyTypes = propertyTypes;
  }


  /**
   * Compares objects.
   *
   * @return true or false depending on comparison result.
   */
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

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(propertyTypes);
  }


  /**
   * Converts the given object to string.
   */
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

