package com.docusign.rooms.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.rooms.model.GroupForm;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * FormGroup.
 *
 */

public class FormGroup {
  @JsonProperty("formGroupId")
  private java.util.UUID formGroupId = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("officeIds")
  private java.util.List<Integer> officeIds = null;

  @JsonProperty("forms")
  private java.util.List<GroupForm> forms = null;

  /**
   * Get formGroupId.
   * @return formGroupId
   **/
  @Schema(description = "")
  public java.util.UUID getFormGroupId() {
    return formGroupId;
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
   * Get officeIds.
   * @return officeIds
   **/
  @Schema(description = "")
  public java.util.List<Integer> getOfficeIds() {
    return officeIds;
  }

  /**
   * Get forms.
   * @return forms
   **/
  @Schema(description = "")
  public java.util.List<GroupForm> getForms() {
    return forms;
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
    FormGroup formGroup = (FormGroup) o;
    return Objects.equals(this.formGroupId, formGroup.formGroupId) &&
        Objects.equals(this.name, formGroup.name) &&
        Objects.equals(this.officeIds, formGroup.officeIds) &&
        Objects.equals(this.forms, formGroup.forms);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(formGroupId, name, officeIds, forms);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormGroup {\n");
    
    sb.append("    formGroupId: ").append(toIndentedString(formGroupId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    officeIds: ").append(toIndentedString(officeIds)).append("\n");
    sb.append("    forms: ").append(toIndentedString(forms)).append("\n");
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

