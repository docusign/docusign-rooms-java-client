package com.docusign.rooms.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.time.OffsetDateTime;

/**
 * GroupForm.
 *
 */

public class GroupForm {
  @JsonProperty("formId")
  private java.util.UUID formId = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("isRequired")
  private Boolean isRequired = null;

  @JsonProperty("lastUpdatedDate")
  private OffsetDateTime lastUpdatedDate = null;

  @JsonProperty("viewingUserHasAccess")
  private Boolean viewingUserHasAccess = null;

  /**
   * Get formId.
   * @return formId
   **/
  @Schema(description = "")
  public java.util.UUID getFormId() {
    return formId;
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
   * Get isRequired.
   * @return isRequired
   **/
  @Schema(description = "")
  public Boolean isIsRequired() {
    return isRequired;
  }

  /**
   * Get lastUpdatedDate.
   * @return lastUpdatedDate
   **/
  @Schema(description = "")
  public OffsetDateTime getLastUpdatedDate() {
    return lastUpdatedDate;
  }

  /**
   * Get viewingUserHasAccess.
   * @return viewingUserHasAccess
   **/
  @Schema(description = "")
  public Boolean isViewingUserHasAccess() {
    return viewingUserHasAccess;
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
    GroupForm groupForm = (GroupForm) o;
    return Objects.equals(this.formId, groupForm.formId) &&
        Objects.equals(this.name, groupForm.name) &&
        Objects.equals(this.isRequired, groupForm.isRequired) &&
        Objects.equals(this.lastUpdatedDate, groupForm.lastUpdatedDate) &&
        Objects.equals(this.viewingUserHasAccess, groupForm.viewingUserHasAccess);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(formId, name, isRequired, lastUpdatedDate, viewingUserHasAccess);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupForm {\n");
    
    sb.append("    formId: ").append(toIndentedString(formId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    isRequired: ").append(toIndentedString(isRequired)).append("\n");
    sb.append("    lastUpdatedDate: ").append(toIndentedString(lastUpdatedDate)).append("\n");
    sb.append("    viewingUserHasAccess: ").append(toIndentedString(viewingUserHasAccess)).append("\n");
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

