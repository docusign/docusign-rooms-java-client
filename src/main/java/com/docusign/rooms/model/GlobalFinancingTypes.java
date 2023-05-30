package com.docusign.rooms.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.rooms.model.FinancingType;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * GlobalFinancingTypes.
 *
 */

public class GlobalFinancingTypes {
  @JsonProperty("financingTypes")
  private java.util.List<FinancingType> financingTypes = null;


  /**
   * financingTypes.
   *
   * @return GlobalFinancingTypes
   **/
  public GlobalFinancingTypes financingTypes(java.util.List<FinancingType> financingTypes) {
    this.financingTypes = financingTypes;
    return this;
  }
  
  /**
   * addFinancingTypesItem.
   *
   * @return GlobalFinancingTypes
   **/
  public GlobalFinancingTypes addFinancingTypesItem(FinancingType financingTypesItem) {
    if (this.financingTypes == null) {
      this.financingTypes = new java.util.ArrayList<>();
    }
    this.financingTypes.add(financingTypesItem);
    return this;
  }

  /**
   * Get financingTypes.
   * @return financingTypes
   **/
  @Schema(description = "")
  public java.util.List<FinancingType> getFinancingTypes() {
    return financingTypes;
  }

  /**
   * setFinancingTypes.
   **/
  public void setFinancingTypes(java.util.List<FinancingType> financingTypes) {
    this.financingTypes = financingTypes;
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
    GlobalFinancingTypes globalFinancingTypes = (GlobalFinancingTypes) o;
    return Objects.equals(this.financingTypes, globalFinancingTypes.financingTypes);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(financingTypes);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GlobalFinancingTypes {\n");
    
    sb.append("    financingTypes: ").append(toIndentedString(financingTypes)).append("\n");
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

