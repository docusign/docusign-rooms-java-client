package com.docusign.rooms.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ExternalFormFillSessionForCreate
 */

public class ExternalFormFillSessionForCreate {
  @JsonProperty("formId")
  private String formId = null;

  @JsonProperty("roomId")
  private Integer roomId = null;

  @JsonProperty("xFrameAllowedUrl")
  private String xFrameAllowedUrl = null;

  public ExternalFormFillSessionForCreate formId(String formId) {
    this.formId = formId;
    return this;
  }

   /**
   * Get formId
   * @return formId
  **/
  @ApiModelProperty(required = true, value = "")
  public String getFormId() {
    return formId;
  }

  public void setFormId(String formId) {
    this.formId = formId;
  }

  public ExternalFormFillSessionForCreate roomId(Integer roomId) {
    this.roomId = roomId;
    return this;
  }

   /**
   * Get roomId
   * @return roomId
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getRoomId() {
    return roomId;
  }

  public void setRoomId(Integer roomId) {
    this.roomId = roomId;
  }

  public ExternalFormFillSessionForCreate xFrameAllowedUrl(String xFrameAllowedUrl) {
    this.xFrameAllowedUrl = xFrameAllowedUrl;
    return this;
  }

   /**
   * Get xFrameAllowedUrl
   * @return xFrameAllowedUrl
  **/
  @ApiModelProperty(value = "")
  public String getXFrameAllowedUrl() {
    return xFrameAllowedUrl;
  }

  public void setXFrameAllowedUrl(String xFrameAllowedUrl) {
    this.xFrameAllowedUrl = xFrameAllowedUrl;
  }


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
        Objects.equals(this.xFrameAllowedUrl, externalFormFillSessionForCreate.xFrameAllowedUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(formId, roomId, xFrameAllowedUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalFormFillSessionForCreate {\n");
    
    sb.append("    formId: ").append(toIndentedString(formId)).append("\n");
    sb.append("    roomId: ").append(toIndentedString(roomId)).append("\n");
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

