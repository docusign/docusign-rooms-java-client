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
 * GlobalSpecialCircumstanceTypes
 */

public class GlobalSpecialCircumstanceTypes {
  @JsonProperty("specialCircumstanceTypes")
  private java.util.List<SpecialCircumstanceType> specialCircumstanceTypes = null;

  public GlobalSpecialCircumstanceTypes specialCircumstanceTypes(java.util.List<SpecialCircumstanceType> specialCircumstanceTypes) {
    this.specialCircumstanceTypes = specialCircumstanceTypes;
    return this;
  }

  public GlobalSpecialCircumstanceTypes addSpecialCircumstanceTypesItem(SpecialCircumstanceType specialCircumstanceTypesItem) {
    if (this.specialCircumstanceTypes == null) {
      this.specialCircumstanceTypes = new java.util.ArrayList<SpecialCircumstanceType>();
    }
    this.specialCircumstanceTypes.add(specialCircumstanceTypesItem);
    return this;
  }

   /**
   * Get specialCircumstanceTypes
   * @return specialCircumstanceTypes
  **/
  @ApiModelProperty(value = "")
  public java.util.List<SpecialCircumstanceType> getSpecialCircumstanceTypes() {
    return specialCircumstanceTypes;
  }

  public void setSpecialCircumstanceTypes(java.util.List<SpecialCircumstanceType> specialCircumstanceTypes) {
    this.specialCircumstanceTypes = specialCircumstanceTypes;
  }


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

  @Override
  public int hashCode() {
    return Objects.hash(specialCircumstanceTypes);
  }


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

