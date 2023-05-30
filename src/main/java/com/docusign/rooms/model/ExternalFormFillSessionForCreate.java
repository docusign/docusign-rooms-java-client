package com.docusign.rooms.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * ExternalFormFillSessionForCreate.
 *
 */

public class ExternalFormFillSessionForCreate {
  @JsonProperty("formId")
  private String formId = null;

  @JsonProperty("roomId")
  private Integer roomId = null;

  @JsonProperty("formIds")
  private java.util.List<java.util.UUID> formIds = null;

  @JsonProperty("xFrameAllowedUrl")
  private String xFrameAllowedUrl = null;


  /**
   * formId.
   *
   * @return ExternalFormFillSessionForCreate
   **/
  public ExternalFormFillSessionForCreate formId(String formId) {
    this.formId = formId;
    return this;
  }

  /**
   * Get formId.
   * @return formId
   **/
  @Schema(description = "")
  public String getFormId() {
    return formId;
  }

  /**
   * setFormId.
   **/
  public void setFormId(String formId) {
    this.formId = formId;
  }


  /**
   * roomId.
   *
   * @return ExternalFormFillSessionForCreate
   **/
  public ExternalFormFillSessionForCreate roomId(Integer roomId) {
    this.roomId = roomId;
    return this;
  }

  /**
   * Get roomId.
   * @return roomId
   **/
  @Schema(required = true, description = "")
  public Integer getRoomId() {
    return roomId;
  }

  /**
   * setRoomId.
   **/
  public void setRoomId(Integer roomId) {
    this.roomId = roomId;
  }


  /**
   * formIds.
   *
   * @return ExternalFormFillSessionForCreate
   **/
  public ExternalFormFillSessionForCreate formIds(java.util.List<java.util.UUID> formIds) {
    this.formIds = formIds;
    return this;
  }
  
  /**
   * addFormIdsItem.
   *
   * @return ExternalFormFillSessionForCreate
   **/
  public ExternalFormFillSessionForCreate addFormIdsItem(java.util.UUID formIdsItem) {
    if (this.formIds == null) {
      this.formIds = new java.util.ArrayList<>();
    }
    this.formIds.add(formIdsItem);
    return this;
  }

  /**
   * Get formIds.
   * @return formIds
   **/
  @Schema(description = "")
  public java.util.List<java.util.UUID> getFormIds() {
    return formIds;
  }

  /**
   * setFormIds.
   **/
  public void setFormIds(java.util.List<java.util.UUID> formIds) {
    this.formIds = formIds;
  }


  /**
   * xFrameAllowedUrl.
   *
   * @return ExternalFormFillSessionForCreate
   **/
  public ExternalFormFillSessionForCreate xFrameAllowedUrl(String xFrameAllowedUrl) {
    this.xFrameAllowedUrl = xFrameAllowedUrl;
    return this;
  }

  /**
   * Get xFrameAllowedUrl.
   * @return xFrameAllowedUrl
   **/
  @Schema(description = "")
  public String getXFrameAllowedUrl() {
    return xFrameAllowedUrl;
  }

  /**
   * setXFrameAllowedUrl.
   **/
  public void setXFrameAllowedUrl(String xFrameAllowedUrl) {
    this.xFrameAllowedUrl = xFrameAllowedUrl;
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
    ExternalFormFillSessionForCreate externalFormFillSessionForCreate = (ExternalFormFillSessionForCreate) o;
    return Objects.equals(this.formId, externalFormFillSessionForCreate.formId) &&
        Objects.equals(this.roomId, externalFormFillSessionForCreate.roomId) &&
        Objects.equals(this.formIds, externalFormFillSessionForCreate.formIds) &&
        Objects.equals(this.xFrameAllowedUrl, externalFormFillSessionForCreate.xFrameAllowedUrl);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(formId, roomId, formIds, xFrameAllowedUrl);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalFormFillSessionForCreate {\n");
    
    sb.append("    formId: ").append(toIndentedString(formId)).append("\n");
    sb.append("    roomId: ").append(toIndentedString(roomId)).append("\n");
    sb.append("    formIds: ").append(toIndentedString(formIds)).append("\n");
    sb.append("    xFrameAllowedUrl: ").append(toIndentedString(xFrameAllowedUrl)).append("\n");
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

