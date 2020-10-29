package com.docusign.rooms.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * PropertyType
 */

public class PropertyType {
  @JsonProperty("propertyTypeId")
  private String propertyTypeId = null;

  @JsonProperty("name")
  private String name = null;

  public PropertyType propertyTypeId(String propertyTypeId) {
    this.propertyTypeId = propertyTypeId;
    return this;
  }

   /**
   * Get propertyTypeId
   * @return propertyTypeId
  **/
  @ApiModelProperty(value = "")
  public String getPropertyTypeId() {
    return propertyTypeId;
  }

  public void setPropertyTypeId(String propertyTypeId) {
    this.propertyTypeId = propertyTypeId;
  }

  public PropertyType name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PropertyType propertyType = (PropertyType) o;
    return Objects.equals(this.propertyTypeId, propertyType.propertyTypeId) &&
        Objects.equals(this.name, propertyType.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(propertyTypeId, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PropertyType {\n");
    
    sb.append("    propertyTypeId: ").append(toIndentedString(propertyTypeId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

