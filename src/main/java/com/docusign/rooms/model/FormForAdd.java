package com.docusign.rooms.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * FormForAdd
 */

public class FormForAdd {
  @JsonProperty("formId")
  private java.util.UUID formId = null;

  public FormForAdd formId(java.util.UUID formId) {
    this.formId = formId;
    return this;
  }

   /**
   * Get formId
   * @return formId
  **/
  @ApiModelProperty(required = true, value = "")
  public java.util.UUID getFormId() {
    return formId;
  }

  public void setFormId(java.util.UUID formId) {
    this.formId = formId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FormForAdd formForAdd = (FormForAdd) o;
    return Objects.equals(this.formId, formForAdd.formId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(formId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormForAdd {\n");
    
    sb.append("    formId: ").append(toIndentedString(formId)).append("\n");
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

