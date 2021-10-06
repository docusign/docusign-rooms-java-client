package com.docusign.rooms.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * SpecialCircumstanceType.
 *
 */

public class SpecialCircumstanceType {
  @JsonProperty("specialCircumstanceTypeId")
  private String specialCircumstanceTypeId = null;

  @JsonProperty("name")
  private String name = null;


  /**
   * specialCircumstanceTypeId.
   *
   * @return SpecialCircumstanceType
   **/
  public SpecialCircumstanceType specialCircumstanceTypeId(String specialCircumstanceTypeId) {
    this.specialCircumstanceTypeId = specialCircumstanceTypeId;
    return this;
  }

  /**
   * Get specialCircumstanceTypeId.
   * @return specialCircumstanceTypeId
   **/
  @ApiModelProperty(value = "")
  public String getSpecialCircumstanceTypeId() {
    return specialCircumstanceTypeId;
  }

  /**
   * setSpecialCircumstanceTypeId.
   **/
  public void setSpecialCircumstanceTypeId(String specialCircumstanceTypeId) {
    this.specialCircumstanceTypeId = specialCircumstanceTypeId;
  }


  /**
   * name.
   *
   * @return SpecialCircumstanceType
   **/
  public SpecialCircumstanceType name(String name) {
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
    SpecialCircumstanceType specialCircumstanceType = (SpecialCircumstanceType) o;
    return Objects.equals(this.specialCircumstanceTypeId, specialCircumstanceType.specialCircumstanceTypeId) &&
        Objects.equals(this.name, specialCircumstanceType.name);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(specialCircumstanceTypeId, name);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpecialCircumstanceType {\n");
    
    sb.append("    specialCircumstanceTypeId: ").append(toIndentedString(specialCircumstanceTypeId)).append("\n");
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

