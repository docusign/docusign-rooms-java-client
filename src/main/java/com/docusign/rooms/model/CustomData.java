package com.docusign.rooms.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * CustomData.
 *
 */

public class CustomData {
  @JsonProperty("isRequiredOnCreate")
  private Boolean isRequiredOnCreate = null;

  @JsonProperty("isRequiredOnSubmit")
  private Boolean isRequiredOnSubmit = null;

  /**
   * Get isRequiredOnCreate.
   * @return isRequiredOnCreate
   **/
  @Schema(description = "")
  public Boolean isIsRequiredOnCreate() {
    return isRequiredOnCreate;
  }

  /**
   * Get isRequiredOnSubmit.
   * @return isRequiredOnSubmit
   **/
  @Schema(description = "")
  public Boolean isIsRequiredOnSubmit() {
    return isRequiredOnSubmit;
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
    CustomData customData = (CustomData) o;
    return Objects.equals(this.isRequiredOnCreate, customData.isRequiredOnCreate) &&
        Objects.equals(this.isRequiredOnSubmit, customData.isRequiredOnSubmit);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(isRequiredOnCreate, isRequiredOnSubmit);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomData {\n");
    
    sb.append("    isRequiredOnCreate: ").append(toIndentedString(isRequiredOnCreate)).append("\n");
    sb.append("    isRequiredOnSubmit: ").append(toIndentedString(isRequiredOnSubmit)).append("\n");
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

