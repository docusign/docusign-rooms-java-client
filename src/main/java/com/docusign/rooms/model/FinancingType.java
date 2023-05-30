package com.docusign.rooms.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * FinancingType.
 *
 */

public class FinancingType {
  @JsonProperty("financingTypeId")
  private String financingTypeId = null;

  @JsonProperty("name")
  private String name = null;


  /**
   * financingTypeId.
   *
   * @return FinancingType
   **/
  public FinancingType financingTypeId(String financingTypeId) {
    this.financingTypeId = financingTypeId;
    return this;
  }

  /**
   * Get financingTypeId.
   * @return financingTypeId
   **/
  @Schema(description = "")
  public String getFinancingTypeId() {
    return financingTypeId;
  }

  /**
   * setFinancingTypeId.
   **/
  public void setFinancingTypeId(String financingTypeId) {
    this.financingTypeId = financingTypeId;
  }


  /**
   * name.
   *
   * @return FinancingType
   **/
  public FinancingType name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name.
   * @return name
   **/
  @Schema(description = "")
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
    FinancingType financingType = (FinancingType) o;
    return Objects.equals(this.financingTypeId, financingType.financingTypeId) &&
        Objects.equals(this.name, financingType.name);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(financingTypeId, name);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FinancingType {\n");
    
    sb.append("    financingTypeId: ").append(toIndentedString(financingTypeId)).append("\n");
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

