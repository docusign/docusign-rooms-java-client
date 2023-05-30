package com.docusign.rooms.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.rooms.model.FieldData;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.time.OffsetDateTime;

/**
 * Room.
 *
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
  private OffsetDateTime createdDate = null;

  @JsonProperty("submittedForReviewDate")
  private OffsetDateTime submittedForReviewDate = null;

  @JsonProperty("closedDate")
  private OffsetDateTime closedDate = null;

  @JsonProperty("rejectedDate")
  private OffsetDateTime rejectedDate = null;

  @JsonProperty("createdByUserId")
  private Integer createdByUserId = null;

  @JsonProperty("roomOwnerIds")
  private java.util.List<Integer> roomOwnerIds = null;

  @JsonProperty("rejectedByUserId")
  private Integer rejectedByUserId = null;

  @JsonProperty("closedStatusId")
  private String closedStatusId = null;

  @JsonProperty("fieldDataLastUpdatedDate")
  private OffsetDateTime fieldDataLastUpdatedDate = null;

  @JsonProperty("fieldData")
  private FieldData fieldData = null;


  /**
   * roomId.
   *
   * @return Room
   **/
  public Room roomId(Integer roomId) {
    this.roomId = roomId;
    return this;
  }

  /**
   * Get roomId.
   * @return roomId
   **/
  @Schema(description = "")
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
   * companyId.
   *
   * @return Room
   **/
  public Room companyId(Integer companyId) {
    this.companyId = companyId;
    return this;
  }

  /**
   * Get companyId.
   * @return companyId
   **/
  @Schema(description = "")
  public Integer getCompanyId() {
    return companyId;
  }

  /**
   * setCompanyId.
   **/
  public void setCompanyId(Integer companyId) {
    this.companyId = companyId;
  }


  /**
   * name.
   *
   * @return Room
   **/
  public Room name(String name) {
    this.name = name;
    return this;
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
   * setName.
   **/
  public void setName(String name) {
    this.name = name;
  }


  /**
   * officeId.
   *
   * @return Room
   **/
  public Room officeId(Integer officeId) {
    this.officeId = officeId;
    return this;
  }

  /**
   * Get officeId.
   * @return officeId
   **/
  @Schema(description = "")
  public Integer getOfficeId() {
    return officeId;
  }

  /**
   * setOfficeId.
   **/
  public void setOfficeId(Integer officeId) {
    this.officeId = officeId;
  }


  /**
   * createdDate.
   *
   * @return Room
   **/
  public Room createdDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
    return this;
  }

  /**
   * Get createdDate.
   * @return createdDate
   **/
  @Schema(description = "")
  public OffsetDateTime getCreatedDate() {
    return createdDate;
  }

  /**
   * setCreatedDate.
   **/
  public void setCreatedDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
  }


  /**
   * submittedForReviewDate.
   *
   * @return Room
   **/
  public Room submittedForReviewDate(OffsetDateTime submittedForReviewDate) {
    this.submittedForReviewDate = submittedForReviewDate;
    return this;
  }

  /**
   * Get submittedForReviewDate.
   * @return submittedForReviewDate
   **/
  @Schema(description = "")
  public OffsetDateTime getSubmittedForReviewDate() {
    return submittedForReviewDate;
  }

  /**
   * setSubmittedForReviewDate.
   **/
  public void setSubmittedForReviewDate(OffsetDateTime submittedForReviewDate) {
    this.submittedForReviewDate = submittedForReviewDate;
  }


  /**
   * closedDate.
   *
   * @return Room
   **/
  public Room closedDate(OffsetDateTime closedDate) {
    this.closedDate = closedDate;
    return this;
  }

  /**
   * Get closedDate.
   * @return closedDate
   **/
  @Schema(description = "")
  public OffsetDateTime getClosedDate() {
    return closedDate;
  }

  /**
   * setClosedDate.
   **/
  public void setClosedDate(OffsetDateTime closedDate) {
    this.closedDate = closedDate;
  }


  /**
   * rejectedDate.
   *
   * @return Room
   **/
  public Room rejectedDate(OffsetDateTime rejectedDate) {
    this.rejectedDate = rejectedDate;
    return this;
  }

  /**
   * Get rejectedDate.
   * @return rejectedDate
   **/
  @Schema(description = "")
  public OffsetDateTime getRejectedDate() {
    return rejectedDate;
  }

  /**
   * setRejectedDate.
   **/
  public void setRejectedDate(OffsetDateTime rejectedDate) {
    this.rejectedDate = rejectedDate;
  }


  /**
   * createdByUserId.
   *
   * @return Room
   **/
  public Room createdByUserId(Integer createdByUserId) {
    this.createdByUserId = createdByUserId;
    return this;
  }

  /**
   * Get createdByUserId.
   * @return createdByUserId
   **/
  @Schema(description = "")
  public Integer getCreatedByUserId() {
    return createdByUserId;
  }

  /**
   * setCreatedByUserId.
   **/
  public void setCreatedByUserId(Integer createdByUserId) {
    this.createdByUserId = createdByUserId;
  }


  /**
   * roomOwnerIds.
   *
   * @return Room
   **/
  public Room roomOwnerIds(java.util.List<Integer> roomOwnerIds) {
    this.roomOwnerIds = roomOwnerIds;
    return this;
  }
  
  /**
   * addRoomOwnerIdsItem.
   *
   * @return Room
   **/
  public Room addRoomOwnerIdsItem(Integer roomOwnerIdsItem) {
    if (this.roomOwnerIds == null) {
      this.roomOwnerIds = new java.util.ArrayList<>();
    }
    this.roomOwnerIds.add(roomOwnerIdsItem);
    return this;
  }

  /**
   * Get roomOwnerIds.
   * @return roomOwnerIds
   **/
  @Schema(description = "")
  public java.util.List<Integer> getRoomOwnerIds() {
    return roomOwnerIds;
  }

  /**
   * setRoomOwnerIds.
   **/
  public void setRoomOwnerIds(java.util.List<Integer> roomOwnerIds) {
    this.roomOwnerIds = roomOwnerIds;
  }


  /**
   * rejectedByUserId.
   *
   * @return Room
   **/
  public Room rejectedByUserId(Integer rejectedByUserId) {
    this.rejectedByUserId = rejectedByUserId;
    return this;
  }

  /**
   * Get rejectedByUserId.
   * @return rejectedByUserId
   **/
  @Schema(description = "")
  public Integer getRejectedByUserId() {
    return rejectedByUserId;
  }

  /**
   * setRejectedByUserId.
   **/
  public void setRejectedByUserId(Integer rejectedByUserId) {
    this.rejectedByUserId = rejectedByUserId;
  }


  /**
   * closedStatusId.
   *
   * @return Room
   **/
  public Room closedStatusId(String closedStatusId) {
    this.closedStatusId = closedStatusId;
    return this;
  }

  /**
   * Get closedStatusId.
   * @return closedStatusId
   **/
  @Schema(description = "")
  public String getClosedStatusId() {
    return closedStatusId;
  }

  /**
   * setClosedStatusId.
   **/
  public void setClosedStatusId(String closedStatusId) {
    this.closedStatusId = closedStatusId;
  }


  /**
   * fieldDataLastUpdatedDate.
   *
   * @return Room
   **/
  public Room fieldDataLastUpdatedDate(OffsetDateTime fieldDataLastUpdatedDate) {
    this.fieldDataLastUpdatedDate = fieldDataLastUpdatedDate;
    return this;
  }

  /**
   * Get fieldDataLastUpdatedDate.
   * @return fieldDataLastUpdatedDate
   **/
  @Schema(description = "")
  public OffsetDateTime getFieldDataLastUpdatedDate() {
    return fieldDataLastUpdatedDate;
  }

  /**
   * setFieldDataLastUpdatedDate.
   **/
  public void setFieldDataLastUpdatedDate(OffsetDateTime fieldDataLastUpdatedDate) {
    this.fieldDataLastUpdatedDate = fieldDataLastUpdatedDate;
  }


  /**
   * fieldData.
   *
   * @return Room
   **/
  public Room fieldData(FieldData fieldData) {
    this.fieldData = fieldData;
    return this;
  }

  /**
   * Get fieldData.
   * @return fieldData
   **/
  @Schema(description = "")
  public FieldData getFieldData() {
    return fieldData;
  }

  /**
   * setFieldData.
   **/
  public void setFieldData(FieldData fieldData) {
    this.fieldData = fieldData;
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
        Objects.equals(this.roomOwnerIds, room.roomOwnerIds) &&
        Objects.equals(this.rejectedByUserId, room.rejectedByUserId) &&
        Objects.equals(this.closedStatusId, room.closedStatusId) &&
        Objects.equals(this.fieldDataLastUpdatedDate, room.fieldDataLastUpdatedDate) &&
        Objects.equals(this.fieldData, room.fieldData);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(roomId, companyId, name, officeId, createdDate, submittedForReviewDate, closedDate, rejectedDate, createdByUserId, roomOwnerIds, rejectedByUserId, closedStatusId, fieldDataLastUpdatedDate, fieldData);
  }


  /**
   * Converts the given object to string.
   */
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
    sb.append("    roomOwnerIds: ").append(toIndentedString(roomOwnerIds)).append("\n");
    sb.append("    rejectedByUserId: ").append(toIndentedString(rejectedByUserId)).append("\n");
    sb.append("    closedStatusId: ").append(toIndentedString(closedStatusId)).append("\n");
    sb.append("    fieldDataLastUpdatedDate: ").append(toIndentedString(fieldDataLastUpdatedDate)).append("\n");
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

