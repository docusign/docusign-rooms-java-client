package com.docusign.rooms.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.rooms.model.UserSummary;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * UserSummaryList.
 *
 */

public class UserSummaryList {
  @JsonProperty("userSummaries")
  private java.util.List<UserSummary> userSummaries = null;

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
   * userSummaries.
   *
   * @return UserSummaryList
   **/
  public UserSummaryList userSummaries(java.util.List<UserSummary> userSummaries) {
    this.userSummaries = userSummaries;
    return this;
  }
  
  /**
   * addUserSummariesItem.
   *
   * @return UserSummaryList
   **/
  public UserSummaryList addUserSummariesItem(UserSummary userSummariesItem) {
    if (this.userSummaries == null) {
      this.userSummaries = new java.util.ArrayList<>();
    }
    this.userSummaries.add(userSummariesItem);
    return this;
  }

  /**
   * Get userSummaries.
   * @return userSummaries
   **/
  @Schema(description = "")
  public java.util.List<UserSummary> getUserSummaries() {
    return userSummaries;
  }

  /**
   * setUserSummaries.
   **/
  public void setUserSummaries(java.util.List<UserSummary> userSummaries) {
    this.userSummaries = userSummaries;
  }


  /**
   * resultSetSize.
   *
   * @return UserSummaryList
   **/
  public UserSummaryList resultSetSize(Integer resultSetSize) {
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
   * @return UserSummaryList
   **/
  public UserSummaryList startPosition(Integer startPosition) {
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
   * @return UserSummaryList
   **/
  public UserSummaryList nextUri(String nextUri) {
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
   * @return UserSummaryList
   **/
  public UserSummaryList priorUri(String priorUri) {
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
   * @return UserSummaryList
   **/
  public UserSummaryList totalRowCount(Integer totalRowCount) {
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
    UserSummaryList userSummaryList = (UserSummaryList) o;
    return Objects.equals(this.userSummaries, userSummaryList.userSummaries) &&
        Objects.equals(this.resultSetSize, userSummaryList.resultSetSize) &&
        Objects.equals(this.startPosition, userSummaryList.startPosition) &&
        Objects.equals(this.endPosition, userSummaryList.endPosition) &&
        Objects.equals(this.nextUri, userSummaryList.nextUri) &&
        Objects.equals(this.priorUri, userSummaryList.priorUri) &&
        Objects.equals(this.totalRowCount, userSummaryList.totalRowCount);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(userSummaries, resultSetSize, startPosition, endPosition, nextUri, priorUri, totalRowCount);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserSummaryList {\n");
    
    sb.append("    userSummaries: ").append(toIndentedString(userSummaries)).append("\n");
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

