package com.docusign.rooms.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;

/**
 * FormGroupForm.
 *
 */

public class FormGroupForm {
  @JsonProperty("formId")
  private java.util.UUID formId = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("isRequired")
  private Boolean isRequired = null;

  @JsonProperty("lastUpdatedDate")
  private OffsetDateTime lastUpdatedDate = null;


  /**
   * formId.
   *
   * @return FormGroupForm
   **/
  public FormGroupForm formId(java.util.UUID formId) {
    this.formId = formId;
    return this;
  }

  /**
   * Get formId.
   * @return formId
   **/
  @ApiModelProperty(value = "")
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
   * name.
   *
   * @return FormGroupForm
   **/
  public FormGroupForm name(String name) {
    this.name = name;
    return this;
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
   * setName.
   **/
  public void setName(String name) {
    this.name = name;
  }


  /**
   * isRequired.
   *
   * @return FormGroupForm
   **/
  public FormGroupForm isRequired(Boolean isRequired) {
    this.isRequired = isRequired;
    return this;
  }

  /**
   * Get isRequired.
   * @return isRequired
   **/
  @ApiModelProperty(value = "")
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
   * lastUpdatedDate.
   *
   * @return FormGroupForm
   **/
  public FormGroupForm lastUpdatedDate(OffsetDateTime lastUpdatedDate) {
    this.lastUpdatedDate = lastUpdatedDate;
    return this;
  }

  /**
   * Get lastUpdatedDate.
   * @return lastUpdatedDate
   **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getLastUpdatedDate() {
    return lastUpdatedDate;
  }

  /**
   * setLastUpdatedDate.
   **/
  public void setLastUpdatedDate(OffsetDateTime lastUpdatedDate) {
    this.lastUpdatedDate = lastUpdatedDate;
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
    FormGroupForm formGroupForm = (FormGroupForm) o;
    return Objects.equals(this.formId, formGroupForm.formId) &&
        Objects.equals(this.name, formGroupForm.name) &&
        Objects.equals(this.isRequired, formGroupForm.isRequired) &&
        Objects.equals(this.lastUpdatedDate, formGroupForm.lastUpdatedDate);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(formId, name, isRequired, lastUpdatedDate);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormGroupForm {\n");
    
    sb.append("    formId: ").append(toIndentedString(formId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    isRequired: ").append(toIndentedString(isRequired)).append("\n");
    sb.append("    lastUpdatedDate: ").append(toIndentedString(lastUpdatedDate)).append("\n");
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

