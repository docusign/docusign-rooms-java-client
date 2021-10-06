package com.docusign.rooms.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.rooms.model.SpecialCircumstanceType;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * GlobalSpecialCircumstanceTypes.
 *
 */

public class GlobalSpecialCircumstanceTypes {
  @JsonProperty("specialCircumstanceTypes")
  private java.util.List<SpecialCircumstanceType> specialCircumstanceTypes = null;


  /**
   * specialCircumstanceTypes.
   *
   * @return GlobalSpecialCircumstanceTypes
   **/
  public GlobalSpecialCircumstanceTypes specialCircumstanceTypes(java.util.List<SpecialCircumstanceType> specialCircumstanceTypes) {
    this.specialCircumstanceTypes = specialCircumstanceTypes;
    return this;
  }
  
  /**
   * addSpecialCircumstanceTypesItem.
   *
   * @return GlobalSpecialCircumstanceTypes
   **/
  public GlobalSpecialCircumstanceTypes addSpecialCircumstanceTypesItem(SpecialCircumstanceType specialCircumstanceTypesItem) {
    if (this.specialCircumstanceTypes == null) {
      this.specialCircumstanceTypes = new java.util.ArrayList<SpecialCircumstanceType>();
    }
    this.specialCircumstanceTypes.add(specialCircumstanceTypesItem);
    return this;
  }

  /**
   * Get specialCircumstanceTypes.
   * @return specialCircumstanceTypes
   **/
  @ApiModelProperty(value = "")
  public java.util.List<SpecialCircumstanceType> getSpecialCircumstanceTypes() {
    return specialCircumstanceTypes;
  }

  /**
   * setSpecialCircumstanceTypes.
   **/
  public void setSpecialCircumstanceTypes(java.util.List<SpecialCircumstanceType> specialCircumstanceTypes) {
    this.specialCircumstanceTypes = specialCircumstanceTypes;
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
    GlobalSpecialCircumstanceTypes globalSpecialCircumstanceTypes = (GlobalSpecialCircumstanceTypes) o;
    return Objects.equals(this.specialCircumstanceTypes, globalSpecialCircumstanceTypes.specialCircumstanceTypes);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(specialCircumstanceTypes);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GlobalSpecialCircumstanceTypes {\n");
    
    sb.append("    specialCircumstanceTypes: ").append(toIndentedString(specialCircumstanceTypes)).append("\n");
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

