package com.docusign.rooms.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.rooms.model.RoomSummary;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * RoomSummaryList.
 *
 */

public class RoomSummaryList {
  @JsonProperty("rooms")
  private java.util.List<RoomSummary> rooms = null;

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
   * rooms.
   *
   * @return RoomSummaryList
   **/
  public RoomSummaryList rooms(java.util.List<RoomSummary> rooms) {
    this.rooms = rooms;
    return this;
  }
  
  /**
   * addRoomsItem.
   *
   * @return RoomSummaryList
   **/
  public RoomSummaryList addRoomsItem(RoomSummary roomsItem) {
    if (this.rooms == null) {
      this.rooms = new java.util.ArrayList<>();
    }
    this.rooms.add(roomsItem);
    return this;
  }

  /**
   * Get rooms.
   * @return rooms
   **/
  @Schema(description = "")
  public java.util.List<RoomSummary> getRooms() {
    return rooms;
  }

  /**
   * setRooms.
   **/
  public void setRooms(java.util.List<RoomSummary> rooms) {
    this.rooms = rooms;
  }


  /**
   * resultSetSize.
   *
   * @return RoomSummaryList
   **/
  public RoomSummaryList resultSetSize(Integer resultSetSize) {
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
   * @return RoomSummaryList
   **/
  public RoomSummaryList startPosition(Integer startPosition) {
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
   * @return RoomSummaryList
   **/
  public RoomSummaryList nextUri(String nextUri) {
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
   * @return RoomSummaryList
   **/
  public RoomSummaryList priorUri(String priorUri) {
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
   * @return RoomSummaryList
   **/
  public RoomSummaryList totalRowCount(Integer totalRowCount) {
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
    RoomSummaryList roomSummaryList = (RoomSummaryList) o;
    return Objects.equals(this.rooms, roomSummaryList.rooms) &&
        Objects.equals(this.resultSetSize, roomSummaryList.resultSetSize) &&
        Objects.equals(this.startPosition, roomSummaryList.startPosition) &&
        Objects.equals(this.endPosition, roomSummaryList.endPosition) &&
        Objects.equals(this.nextUri, roomSummaryList.nextUri) &&
        Objects.equals(this.priorUri, roomSummaryList.priorUri) &&
        Objects.equals(this.totalRowCount, roomSummaryList.totalRowCount);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(rooms, resultSetSize, startPosition, endPosition, nextUri, priorUri, totalRowCount);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoomSummaryList {\n");
    
    sb.append("    rooms: ").append(toIndentedString(rooms)).append("\n");
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

