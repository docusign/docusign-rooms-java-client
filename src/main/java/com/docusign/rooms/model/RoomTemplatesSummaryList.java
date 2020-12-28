package com.docusign.rooms.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.rooms.model.RoomTemplate;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * RoomTemplatesSummaryList
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

  public RoomTemplatesSummaryList roomTemplates(java.util.List<RoomTemplate> roomTemplates) {
    this.roomTemplates = roomTemplates;
    return this;
  }

  public RoomTemplatesSummaryList addRoomTemplatesItem(RoomTemplate roomTemplatesItem) {
    if (this.roomTemplates == null) {
      this.roomTemplates = new java.util.ArrayList<RoomTemplate>();
    }
    this.roomTemplates.add(roomTemplatesItem);
    return this;
  }

   /**
   * Get roomTemplates
   * @return roomTemplates
  **/
  @ApiModelProperty(value = "")
  public java.util.List<RoomTemplate> getRoomTemplates() {
    return roomTemplates;
  }

  public void setRoomTemplates(java.util.List<RoomTemplate> roomTemplates) {
    this.roomTemplates = roomTemplates;
  }

  public RoomTemplatesSummaryList resultSetSize(Integer resultSetSize) {
    this.resultSetSize = resultSetSize;
    return this;
  }

   /**
   * Get resultSetSize
   * @return resultSetSize
  **/
  @ApiModelProperty(value = "")
  public Integer getResultSetSize() {
    return resultSetSize;
  }

  public void setResultSetSize(Integer resultSetSize) {
    this.resultSetSize = resultSetSize;
  }

  public RoomTemplatesSummaryList startPosition(Integer startPosition) {
    this.startPosition = startPosition;
    return this;
  }

   /**
   * Get startPosition
   * @return startPosition
  **/
  @ApiModelProperty(value = "")
  public Integer getStartPosition() {
    return startPosition;
  }

  public void setStartPosition(Integer startPosition) {
    this.startPosition = startPosition;
  }

   /**
   * Get endPosition
   * @return endPosition
  **/
  @ApiModelProperty(value = "")
  public Integer getEndPosition() {
    return endPosition;
  }

  public RoomTemplatesSummaryList nextUri(String nextUri) {
    this.nextUri = nextUri;
    return this;
  }

   /**
   * Get nextUri
   * @return nextUri
  **/
  @ApiModelProperty(value = "")
  public String getNextUri() {
    return nextUri;
  }

  public void setNextUri(String nextUri) {
    this.nextUri = nextUri;
  }

  public RoomTemplatesSummaryList priorUri(String priorUri) {
    this.priorUri = priorUri;
    return this;
  }

   /**
   * Get priorUri
   * @return priorUri
  **/
  @ApiModelProperty(value = "")
  public String getPriorUri() {
    return priorUri;
  }

  public void setPriorUri(String priorUri) {
    this.priorUri = priorUri;
  }

  public RoomTemplatesSummaryList totalRowCount(Integer totalRowCount) {
    this.totalRowCount = totalRowCount;
    return this;
  }

   /**
   * Get totalRowCount
   * @return totalRowCount
  **/
  @ApiModelProperty(value = "")
  public Integer getTotalRowCount() {
    return totalRowCount;
  }

  public void setTotalRowCount(Integer totalRowCount) {
    this.totalRowCount = totalRowCount;
  }


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

  @Override
  public int hashCode() {
    return Objects.hash(roomTemplates, resultSetSize, startPosition, endPosition, nextUri, priorUri, totalRowCount);
  }


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

