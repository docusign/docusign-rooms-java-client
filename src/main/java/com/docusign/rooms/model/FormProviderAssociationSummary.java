package com.docusign.rooms.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;


/**
 * FormProviderAssociationSummary.
 *
 */

public class FormProviderAssociationSummary {
  @JsonProperty("associationId")
  private String associationId = null;

  @JsonProperty("providerId")
  private String providerId = null;

  @JsonProperty("lastUpdateDate")
  private String lastUpdateDate = null;

  @JsonProperty("formProviderAssociationGuid")
  private java.util.UUID formProviderAssociationGuid = null;

  @JsonProperty("formProviderAssociationName")
  private String formProviderAssociationName = null;

  /**
   * Get associationId.
   * @return associationId
   **/
  @Schema(description = "")
  public String getAssociationId() {
    return associationId;
  }

  /**
   * Get providerId.
   * @return providerId
   **/
  @Schema(description = "")
  public String getProviderId() {
    return providerId;
  }

  /**
   * Get lastUpdateDate.
   * @return lastUpdateDate
   **/
  @Schema(description = "")
  public String getLastUpdateDate() {
    return lastUpdateDate;
  }

  /**
   * Get formProviderAssociationGuid.
   * @return formProviderAssociationGuid
   **/
  @Schema(description = "")
  public java.util.UUID getFormProviderAssociationGuid() {
    return formProviderAssociationGuid;
  }

  /**
   * Get formProviderAssociationName.
   * @return formProviderAssociationName
   **/
  @Schema(description = "")
  public String getFormProviderAssociationName() {
    return formProviderAssociationName;
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
    FormProviderAssociationSummary formProviderAssociationSummary = (FormProviderAssociationSummary) o;
    return Objects.equals(this.associationId, formProviderAssociationSummary.associationId) &&
        Objects.equals(this.providerId, formProviderAssociationSummary.providerId) &&
        Objects.equals(this.lastUpdateDate, formProviderAssociationSummary.lastUpdateDate) &&
        Objects.equals(this.formProviderAssociationGuid, formProviderAssociationSummary.formProviderAssociationGuid) &&
        Objects.equals(this.formProviderAssociationName, formProviderAssociationSummary.formProviderAssociationName);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(associationId, providerId, lastUpdateDate, formProviderAssociationGuid, formProviderAssociationName);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormProviderAssociationSummary {\n");
    
    sb.append("    associationId: ").append(toIndentedString(associationId)).append("\n");
    sb.append("    providerId: ").append(toIndentedString(providerId)).append("\n");
    sb.append("    lastUpdateDate: ").append(toIndentedString(lastUpdateDate)).append("\n");
    sb.append("    formProviderAssociationGuid: ").append(toIndentedString(formProviderAssociationGuid)).append("\n");
    sb.append("    formProviderAssociationName: ").append(toIndentedString(formProviderAssociationName)).append("\n");
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

