package com.docusign.rooms.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.rooms.model.NullableFieldData;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;

/**
 * Room
 */

public class Room {
  @JsonProperty("roomId")
  private Integer roomId = null;

  @JsonProperty("companyId")
  private Integer companyId = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("officeId")
  private Integer officeId = null;

  @JsonProperty("createdDate")
  private DateTime createdDate = null;

  @JsonProperty("submittedForReviewDate")
  private DateTime submittedForReviewDate = null;

  @JsonProperty("closedDate")
  private DateTime closedDate = null;

  @JsonProperty("rejectedDate")
  private DateTime rejectedDate = null;

  @JsonProperty("createdByUserId")
  private Integer createdByUserId = null;

  @JsonProperty("rejectedByUserId")
  private Integer rejectedByUserId = null;

  @JsonProperty("closedStatusId")
  private String closedStatusId = null;

  @JsonProperty("fieldData")
  private NullableFieldData fieldData = null;

  public Room roomId(Integer roomId) {
    this.roomId = roomId;
    return this;
  }

   /**
   * Get roomId
   * @return roomId
  **/
  @ApiModelProperty(value = "")
  public Integer getRoomId() {
    return roomId;
  }

  public void setRoomId(Integer roomId) {
    this.roomId = roomId;
  }

  public Room companyId(Integer companyId) {
    this.companyId = companyId;
    return this;
  }

   /**
   * Get companyId
   * @return companyId
  **/
  @ApiModelProperty(value = "")
  public Integer getCompanyId() {
    return companyId;
  }

  public void setCompanyId(Integer companyId) {
    this.companyId = companyId;
  }

  public Room name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Room officeId(Integer officeId) {
    this.officeId = officeId;
    return this;
  }

   /**
   * Get officeId
   * @return officeId
  **/
  @ApiModelProperty(value = "")
  public Integer getOfficeId() {
    return officeId;
  }

  public void setOfficeId(Integer officeId) {
    this.officeId = officeId;
  }

  public Room createdDate(DateTime createdDate) {
    this.createdDate = createdDate;
    return this;
  }

   /**
   * Get createdDate
   * @return createdDate
  **/
  @ApiModelProperty(value = "")
  public DateTime getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(DateTime createdDate) {
    this.createdDate = createdDate;
  }

  public Room submittedForReviewDate(DateTime submittedForReviewDate) {
    this.submittedForReviewDate = submittedForReviewDate;
    return this;
  }

   /**
   * Get submittedForReviewDate
   * @return submittedForReviewDate
  **/
  @ApiModelProperty(value = "")
  public DateTime getSubmittedForReviewDate() {
    return submittedForReviewDate;
  }

  public void setSubmittedForReviewDate(DateTime submittedForReviewDate) {
    this.submittedForReviewDate = submittedForReviewDate;
  }

  public Room closedDate(DateTime closedDate) {
    this.closedDate = closedDate;
    return this;
  }

   /**
   * Get closedDate
   * @return closedDate
  **/
  @ApiModelProperty(value = "")
  public DateTime getClosedDate() {
    return closedDate;
  }

  public void setClosedDate(DateTime closedDate) {
    this.closedDate = closedDate;
  }

  public Room rejectedDate(DateTime rejectedDate) {
    this.rejectedDate = rejectedDate;
    return this;
  }

   /**
   * Get rejectedDate
   * @return rejectedDate
  **/
  @ApiModelProperty(value = "")
  public DateTime getRejectedDate() {
    return rejectedDate;
  }

  public void setRejectedDate(DateTime rejectedDate) {
    this.rejectedDate = rejectedDate;
  }

  public Room createdByUserId(Integer createdByUserId) {
    this.createdByUserId = createdByUserId;
    return this;
  }

   /**
   * Get createdByUserId
   * @return createdByUserId
  **/
  @ApiModelProperty(value = "")
  public Integer getCreatedByUserId() {
    return createdByUserId;
  }

  public void setCreatedByUserId(Integer createdByUserId) {
    this.createdByUserId = createdByUserId;
  }

  public Room rejectedByUserId(Integer rejectedByUserId) {
    this.rejectedByUserId = rejectedByUserId;
    return this;
  }

   /**
   * Get rejectedByUserId
   * @return rejectedByUserId
  **/
  @ApiModelProperty(value = "")
  public Integer getRejectedByUserId() {
    return rejectedByUserId;
  }

  public void setRejectedByUserId(Integer rejectedByUserId) {
    this.rejectedByUserId = rejectedByUserId;
  }

  public Room closedStatusId(String closedStatusId) {
    this.closedStatusId = closedStatusId;
    return this;
  }

   /**
   * Get closedStatusId
   * @return closedStatusId
  **/
  @ApiModelProperty(value = "")
  public String getClosedStatusId() {
    return closedStatusId;
  }

  public void setClosedStatusId(String closedStatusId) {
    this.closedStatusId = closedStatusId;
  }

  public Room fieldData(NullableFieldData fieldData) {
    this.fieldData = fieldData;
    return this;
  }

   /**
   * Get fieldData
   * @return fieldData
  **/
  @ApiModelProperty(value = "")
  public NullableFieldData getFieldData() {
    return fieldData;
  }

  public void setFieldData(NullableFieldData fieldData) {
    this.fieldData = fieldData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Room room = (Room) o;
    return Objects.equals(this.roomId, room.roomId) &&
        Objects.equals(this.companyId, room.companyId) &&
        Objects.equals(this.name, room.name) &&
        Objects.equals(this.officeId, room.officeId) &&
        Objects.equals(this.createdDate, room.createdDate) &&
        Objects.equals(this.submittedForReviewDate, room.submittedForReviewDate) &&
        Objects.equals(this.closedDate, room.closedDate) &&
        Objects.equals(this.rejectedDate, room.rejectedDate) &&
        Objects.equals(this.createdByUserId, room.createdByUserId) &&
        Objects.equals(this.rejectedByUserId, room.rejectedByUserId) &&
        Objects.equals(this.closedStatusId, room.closedStatusId) &&
        Objects.equals(this.fieldData, room.fieldData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(roomId, companyId, name, officeId, createdDate, submittedForReviewDate, closedDate, rejectedDate, createdByUserId, rejectedByUserId, closedStatusId, fieldData);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Room {\n");
    
    sb.append("    roomId: ").append(toIndentedString(roomId)).append("\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    officeId: ").append(toIndentedString(officeId)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    submittedForReviewDate: ").append(toIndentedString(submittedForReviewDate)).append("\n");
    sb.append("    closedDate: ").append(toIndentedString(closedDate)).append("\n");
    sb.append("    rejectedDate: ").append(toIndentedString(rejectedDate)).append("\n");
    sb.append("    createdByUserId: ").append(toIndentedString(createdByUserId)).append("\n");
    sb.append("    rejectedByUserId: ").append(toIndentedString(rejectedByUserId)).append("\n");
    sb.append("    closedStatusId: ").append(toIndentedString(closedStatusId)).append("\n");
    sb.append("    fieldData: ").append(toIndentedString(fieldData)).append("\n");
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

