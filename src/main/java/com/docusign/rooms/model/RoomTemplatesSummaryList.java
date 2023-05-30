package com.docusign.rooms.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.rooms.model.RoomTemplate;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * RoomTemplatesSummaryList.
 *
 */

public class RoomTemplatesSummaryList {
  @JsonProperty("roomTemplates")
  private java.util.List<RoomTemplate> roomTemplates = null;

  @JsonProperty("resultSetSize")
  private Integer resultSetSize = null;

  @JsonProperty("startPosition")
  private Integer startPosition = null;

  @JsonProperty("endPosition")
  private Integer endPosition = null;

  @JsonProperty("nextUri")
  private String nextUri = null;

  @JsonProperty("priorUri")
  private String priorUri = null;

  @JsonProperty("totalRowCount")
  private Integer totalRowCount = null;


  /**
   * roomTemplates.
   *
   * @return RoomTemplatesSummaryList
   **/
  public RoomTemplatesSummaryList roomTemplates(java.util.List<RoomTemplate> roomTemplates) {
    this.roomTemplates = roomTemplates;
    return this;
  }
  
  /**
   * addRoomTemplatesItem.
   *
   * @return RoomTemplatesSummaryList
   **/
  public RoomTemplatesSummaryList addRoomTemplatesItem(RoomTemplate roomTemplatesItem) {
    if (this.roomTemplates == null) {
      this.roomTemplates = new java.util.ArrayList<>();
    }
    this.roomTemplates.add(roomTemplatesItem);
    return this;
  }

  /**
   * Get roomTemplates.
   * @return roomTemplates
   **/
  @Schema(description = "")
  public java.util.List<RoomTemplate> getRoomTemplates() {
    return roomTemplates;
  }

  /**
   * setRoomTemplates.
   **/
  public void setRoomTemplates(java.util.List<RoomTemplate> roomTemplates) {
    this.roomTemplates = roomTemplates;
  }


  /**
   * resultSetSize.
   *
   * @return RoomTemplatesSummaryList
   **/
  public RoomTemplatesSummaryList resultSetSize(Integer resultSetSize) {
    this.resultSetSize = resultSetSize;
    return this;
  }

  /**
   * Get resultSetSize.
   * @return resultSetSize
   **/
  @Schema(description = "")
  public Integer getResultSetSize() {
    return resultSetSize;
  }

  /**
   * setResultSetSize.
   **/
  public void setResultSetSize(Integer resultSetSize) {
    this.resultSetSize = resultSetSize;
  }


  /**
   * startPosition.
   *
   * @return RoomTemplatesSummaryList
   **/
  public RoomTemplatesSummaryList startPosition(Integer startPosition) {
    this.startPosition = startPosition;
    return this;
  }

  /**
   * Get startPosition.
   * @return startPosition
   **/
  @Schema(description = "")
  public Integer getStartPosition() {
    return startPosition;
  }

  /**
   * setStartPosition.
   **/
  public void setStartPosition(Integer startPosition) {
    this.startPosition = startPosition;
  }

  /**
   * Get endPosition.
   * @return endPosition
   **/
  @Schema(description = "")
  public Integer getEndPosition() {
    return endPosition;
  }


  /**
   * nextUri.
   *
   * @return RoomTemplatesSummaryList
   **/
  public RoomTemplatesSummaryList nextUri(String nextUri) {
    this.nextUri = nextUri;
    return this;
  }

  /**
   * Get nextUri.
   * @return nextUri
   **/
  @Schema(description = "")
  public String getNextUri() {
    return nextUri;
  }

  /**
   * setNextUri.
   **/
  public void setNextUri(String nextUri) {
    this.nextUri = nextUri;
  }


  /**
   * priorUri.
   *
   * @return RoomTemplatesSummaryList
   **/
  public RoomTemplatesSummaryList priorUri(String priorUri) {
    this.priorUri = priorUri;
    return this;
  }

  /**
   * Get priorUri.
   * @return priorUri
   **/
  @Schema(description = "")
  public String getPriorUri() {
    return priorUri;
  }

  /**
   * setPriorUri.
   **/
  public void setPriorUri(String priorUri) {
    this.priorUri = priorUri;
  }


  /**
   * totalRowCount.
   *
   * @return RoomTemplatesSummaryList
   **/
  public RoomTemplatesSummaryList totalRowCount(Integer totalRowCount) {
    this.totalRowCount = totalRowCount;
    return this;
  }

  /**
   * Get totalRowCount.
   * @return totalRowCount
   **/
  @Schema(description = "")
  public Integer getTotalRowCount() {
    return totalRowCount;
  }

  /**
   * setTotalRowCount.
   **/
  public void setTotalRowCount(Integer totalRowCount) {
    this.totalRowCount = totalRowCount;
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
    RoomTemplatesSummaryList roomTemplatesSummaryList = (RoomTemplatesSummaryList) o;
    return Objects.equals(this.roomTemplates, roomTemplatesSummaryList.roomTemplates) &&
        Objects.equals(this.resultSetSize, roomTemplatesSummaryList.resultSetSize) &&
        Objects.equals(this.startPosition, roomTemplatesSummaryList.startPosition) &&
        Objects.equals(this.endPosition, roomTemplatesSummaryList.endPosition) &&
        Objects.equals(this.nextUri, roomTemplatesSummaryList.nextUri) &&
        Objects.equals(this.priorUri, roomTemplatesSummaryList.priorUri) &&
        Objects.equals(this.totalRowCount, roomTemplatesSummaryList.totalRowCount);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(roomTemplates, resultSetSize, startPosition, endPosition, nextUri, priorUri, totalRowCount);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoomTemplatesSummaryList {\n");
    
    sb.append("    roomTemplates: ").append(toIndentedString(roomTemplates)).append("\n");
    sb.append("    resultSetSize: ").append(toIndentedString(resultSetSize)).append("\n");
    sb.append("    startPosition: ").append(toIndentedString(startPosition)).append("\n");
    sb.append("    endPosition: ").append(toIndentedString(endPosition)).append("\n");
    sb.append("    nextUri: ").append(toIndentedString(nextUri)).append("\n");
    sb.append("    priorUri: ").append(toIndentedString(priorUri)).append("\n");
    sb.append("    totalRowCount: ").append(toIndentedString(totalRowCount)).append("\n");
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

