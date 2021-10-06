package com.docusign.rooms.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * PropertyType.
 *
 */

public class PropertyType {
  @JsonProperty("propertyTypeId")
  private String propertyTypeId = null;

  @JsonProperty("name")
  private String name = null;


  /**
   * propertyTypeId.
   *
   * @return PropertyType
   **/
  public PropertyType propertyTypeId(String propertyTypeId) {
    this.propertyTypeId = propertyTypeId;
    return this;
  }

  /**
   * Get propertyTypeId.
   * @return propertyTypeId
   **/
  @ApiModelProperty(value = "")
  public String getPropertyTypeId() {
    return propertyTypeId;
  }

  /**
   * setPropertyTypeId.
   **/
  public void setPropertyTypeId(String propertyTypeId) {
    this.propertyTypeId = propertyTypeId;
  }


  /**
   * name.
   *
   * @return PropertyType
   **/
  public PropertyType name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name.
   * @return name
   **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  /**
   * setName.
   **/
  public void setName(String name) {
    this.name = name;
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
    PropertyType propertyType = (PropertyType) o;
    return Objects.equals(this.propertyTypeId, propertyType.propertyTypeId) &&
        Objects.equals(this.name, propertyType.name);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(propertyTypeId, name);
  }


  /**
   * Converts the given object to string.
   */
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

