package com.docusign.rooms.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * FormGroupSummary
 */

public class FormGroupSummary {
  @JsonProperty("formGroupId")
  private String formGroupId = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("formCount")
  private Integer formCount = null;

   /**
   * Get formGroupId
   * @return formGroupId
  **/
  @ApiModelProperty(value = "")
  public String getFormGroupId() {
    return formGroupId;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

   /**
   * Get formCount
   * @return formCount
  **/
  @ApiModelProperty(value = "")
  public Integer getFormCount() {
    return formCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FormGroupSummary formGroupSummary = (FormGroupSummary) o;
    return Objects.equals(this.formGroupId, formGroupSummary.formGroupId) &&
        Objects.equals(this.name, formGroupSummary.name) &&
        Objects.equals(this.formCount, formGroupSummary.formCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(formGroupId, name, formCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormGroupSummary {\n");
    
    sb.append("    formGroupId: ").append(toIndentedString(formGroupId)).append("\n");
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

