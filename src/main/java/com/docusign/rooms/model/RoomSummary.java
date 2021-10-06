package com.docusign.rooms.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;

/**
 * RoomSummary.
 *
 */

public class RoomSummary {
  @JsonProperty("roomId")
  private Integer roomId = null;

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

  @JsonProperty("fieldDataLastUpdatedDate")
  private DateTime fieldDataLastUpdatedDate = null;

  /**
   * Get roomId.
   * @return roomId
   **/
  @ApiModelProperty(value = "")
  public Integer getRoomId() {
    return roomId;
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
   * Get officeId.
   * @return officeId
   **/
  @ApiModelProperty(value = "")
  public Integer getOfficeId() {
    return officeId;
  }

  /**
   * Get createdDate.
   * @return createdDate
   **/
  @ApiModelProperty(value = "")
  public DateTime getCreatedDate() {
    return createdDate;
  }

  /**
   * Get submittedForReviewDate.
   * @return submittedForReviewDate
   **/
  @ApiModelProperty(value = "")
  public DateTime getSubmittedForReviewDate() {
    return submittedForReviewDate;
  }

  /**
   * Get closedDate.
   * @return closedDate
   **/
  @ApiModelProperty(value = "")
  public DateTime getClosedDate() {
    return closedDate;
  }

  /**
   * Get rejectedDate.
   * @return rejectedDate
   **/
  @ApiModelProperty(value = "")
  public DateTime getRejectedDate() {
    return rejectedDate;
  }

  /**
   * Get createdByUserId.
   * @return createdByUserId
   **/
  @ApiModelProperty(value = "")
  public Integer getCreatedByUserId() {
    return createdByUserId;
  }

  /**
   * Get rejectedByUserId.
   * @return rejectedByUserId
   **/
  @ApiModelProperty(value = "")
  public Integer getRejectedByUserId() {
    return rejectedByUserId;
  }

  /**
   * Get closedStatusId.
   * @return closedStatusId
   **/
  @ApiModelProperty(value = "")
  public String getClosedStatusId() {
    return closedStatusId;
  }

  /**
   * Get fieldDataLastUpdatedDate.
   * @return fieldDataLastUpdatedDate
   **/
  @ApiModelProperty(value = "")
  public DateTime getFieldDataLastUpdatedDate() {
    return fieldDataLastUpdatedDate;
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
    RoomSummary roomSummary = (RoomSummary) o;
    return Objects.equals(this.roomId, roomSummary.roomId) &&
        Objects.equals(this.name, roomSummary.name) &&
        Objects.equals(this.officeId, roomSummary.officeId) &&
        Objects.equals(this.createdDate, roomSummary.createdDate) &&
        Objects.equals(this.submittedForReviewDate, roomSummary.submittedForReviewDate) &&
        Objects.equals(this.closedDate, roomSummary.closedDate) &&
        Objects.equals(this.rejectedDate, roomSummary.rejectedDate) &&
        Objects.equals(this.createdByUserId, roomSummary.createdByUserId) &&
        Objects.equals(this.rejectedByUserId, roomSummary.rejectedByUserId) &&
        Objects.equals(this.closedStatusId, roomSummary.closedStatusId) &&
        Objects.equals(this.fieldDataLastUpdatedDate, roomSummary.fieldDataLastUpdatedDate);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(roomId, name, officeId, createdDate, submittedForReviewDate, closedDate, rejectedDate, createdByUserId, rejectedByUserId, closedStatusId, fieldDataLastUpdatedDate);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoomSummary {\n");
    
    sb.append("    roomId: ").append(toIndentedString(roomId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    officeId: ").append(toIndentedString(officeId)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    submittedForReviewDate: ").append(toIndentedString(submittedForReviewDate)).append("\n");
    sb.append("    closedDate: ").append(toIndentedString(closedDate)).append("\n");
    sb.append("    rejectedDate: ").append(toIndentedString(rejectedDate)).append("\n");
    sb.append("    createdByUserId: ").append(toIndentedString(createdByUserId)).append("\n");
    sb.append("    rejectedByUserId: ").append(toIndentedString(rejectedByUserId)).append("\n");
    sb.append("    closedStatusId: ").append(toIndentedString(closedStatusId)).append("\n");
    sb.append("    fieldDataLastUpdatedDate: ").append(toIndentedString(fieldDataLastUpdatedDate)).append("\n");
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

