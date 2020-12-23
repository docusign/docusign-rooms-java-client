package com.docusign.rooms.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * FormGroupFormToAssign
 */

public class FormGroupFormToAssign {
  @JsonProperty("formId")
  private java.util.UUID formId = null;

  @JsonProperty("isRequired")
  private Boolean isRequired = null;

  public FormGroupFormToAssign formId(java.util.UUID formId) {
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

  public FormGroupFormToAssign isRequired(Boolean isRequired) {
    this.isRequired = isRequired;
    return this;
  }

   /**
   * Get isRequired
   * @return isRequired
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsRequired() {
    return isRequired;
  }

  public void setIsRequired(Boolean isRequired) {
    this.isRequired = isRequired;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FormGroupFormToAssign formGroupFormToAssign = (FormGroupFormToAssign) o;
    return Objects.equals(this.formId, formGroupFormToAssign.formId) &&
        Objects.equals(this.isRequired, formGroupFormToAssign.isRequired);
  }

  @Override
  public int hashCode() {
    return Objects.hash(formId, isRequired);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormGroupFormToAssign {\n");
    
    sb.append("    formId: ").append(toIndentedString(formId)).append("\n");
    sb.append("    isRequired: ").append(toIndentedString(isRequired)).append("\n");
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

