package com.docusign.rooms.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.rooms.model.UserSummary;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * UserSummaryList
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

  public UserSummaryList userSummaries(java.util.List<UserSummary> userSummaries) {
    this.userSummaries = userSummaries;
    return this;
  }

  public UserSummaryList addUserSummariesItem(UserSummary userSummariesItem) {
    if (this.userSummaries == null) {
      this.userSummaries = new java.util.ArrayList<UserSummary>();
    }
    this.userSummaries.add(userSummariesItem);
    return this;
  }

   /**
   * Get userSummaries
   * @return userSummaries
  **/
  @ApiModelProperty(value = "")
  public java.util.List<UserSummary> getUserSummaries() {
    return userSummaries;
  }

  public void setUserSummaries(java.util.List<UserSummary> userSummaries) {
    this.userSummaries = userSummaries;
  }

  public UserSummaryList resultSetSize(Integer resultSetSize) {
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

  public UserSummaryList startPosition(Integer startPosition) {
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

  public UserSummaryList nextUri(String nextUri) {
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

  public UserSummaryList priorUri(String priorUri) {
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
        Objects.equals(this.priorUri, userSummaryList.priorUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userSummaries, resultSetSize, startPosition, endPosition, nextUri, priorUri);
  }


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

