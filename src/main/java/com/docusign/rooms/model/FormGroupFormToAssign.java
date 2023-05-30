package com.docusign.rooms.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * FormGroupFormToAssign.
 *
 */

public class FormGroupFormToAssign {
  @JsonProperty("formId")
  private java.util.UUID formId = null;

  @JsonProperty("isRequired")
  private Boolean isRequired = null;


  /**
   * formId.
   *
   * @return FormGroupFormToAssign
   **/
  public FormGroupFormToAssign formId(java.util.UUID formId) {
    this.formId = formId;
    return this;
  }

  /**
   * Get formId.
   * @return formId
   **/
  @Schema(required = true, description = "")
  public java.util.UUID getFormId() {
    return formId;
  }

  /**
   * setFormId.
   **/
  public void setFormId(java.util.UUID formId) {
    this.formId = formId;
  }


  /**
   * isRequired.
   *
   * @return FormGroupFormToAssign
   **/
  public FormGroupFormToAssign isRequired(Boolean isRequired) {
    this.isRequired = isRequired;
    return this;
  }

  /**
   * Get isRequired.
   * @return isRequired
   **/
  @Schema(description = "")
  public Boolean isIsRequired() {
    return isRequired;
  }

  /**
   * setIsRequired.
   **/
  public void setIsRequired(Boolean isRequired) {
    this.isRequired = isRequired;
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
    FormGroupFormToAssign formGroupFormToAssign = (FormGroupFormToAssign) o;
    return Objects.equals(this.formId, formGroupFormToAssign.formId) &&
        Objects.equals(this.isRequired, formGroupFormToAssign.isRequired);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(formId, isRequired);
  }


  /**
   * Converts the given object to string.
   */
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

