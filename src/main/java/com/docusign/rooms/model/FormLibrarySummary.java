package com.docusign.rooms.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * FormLibrarySummary.
 *
 */

public class FormLibrarySummary {
  @JsonProperty("formsLibraryId")
  private java.util.UUID formsLibraryId = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("formCount")
  private Integer formCount = null;

  /**
   * Get formsLibraryId.
   * @return formsLibraryId
   **/
  @ApiModelProperty(value = "")
  public java.util.UUID getFormsLibraryId() {
    return formsLibraryId;
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
   * Get formCount.
   * @return formCount
   **/
  @ApiModelProperty(value = "")
  public Integer getFormCount() {
    return formCount;
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
    FormLibrarySummary formLibrarySummary = (FormLibrarySummary) o;
    return Objects.equals(this.formsLibraryId, formLibrarySummary.formsLibraryId) &&
        Objects.equals(this.name, formLibrarySummary.name) &&
        Objects.equals(this.formCount, formLibrarySummary.formCount);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(formsLibraryId, name, formCount);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormLibrarySummary {\n");
    
    sb.append("    formsLibraryId: ").append(toIndentedString(formsLibraryId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    formCount: ").append(toIndentedString(formCount)).append("\n");
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

