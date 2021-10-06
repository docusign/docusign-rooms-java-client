package com.docusign.rooms.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.rooms.model.FormLibrarySummary;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * FormLibrarySummaryList.
 *
 */

public class FormLibrarySummaryList {
  @JsonProperty("formsLibrarySummaries")
  private java.util.List<FormLibrarySummary> formsLibrarySummaries = null;

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
   * formsLibrarySummaries.
   *
   * @return FormLibrarySummaryList
   **/
  public FormLibrarySummaryList formsLibrarySummaries(java.util.List<FormLibrarySummary> formsLibrarySummaries) {
    this.formsLibrarySummaries = formsLibrarySummaries;
    return this;
  }
  
  /**
   * addFormsLibrarySummariesItem.
   *
   * @return FormLibrarySummaryList
   **/
  public FormLibrarySummaryList addFormsLibrarySummariesItem(FormLibrarySummary formsLibrarySummariesItem) {
    if (this.formsLibrarySummaries == null) {
      this.formsLibrarySummaries = new java.util.ArrayList<FormLibrarySummary>();
    }
    this.formsLibrarySummaries.add(formsLibrarySummariesItem);
    return this;
  }

  /**
   * Get formsLibrarySummaries.
   * @return formsLibrarySummaries
   **/
  @ApiModelProperty(value = "")
  public java.util.List<FormLibrarySummary> getFormsLibrarySummaries() {
    return formsLibrarySummaries;
  }

  /**
   * setFormsLibrarySummaries.
   **/
  public void setFormsLibrarySummaries(java.util.List<FormLibrarySummary> formsLibrarySummaries) {
    this.formsLibrarySummaries = formsLibrarySummaries;
  }


  /**
   * resultSetSize.
   *
   * @return FormLibrarySummaryList
   **/
  public FormLibrarySummaryList resultSetSize(Integer resultSetSize) {
    this.resultSetSize = resultSetSize;
    return this;
  }

  /**
   * Get resultSetSize.
   * @return resultSetSize
   **/
  @ApiModelProperty(value = "")
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
   * @return FormLibrarySummaryList
   **/
  public FormLibrarySummaryList startPosition(Integer startPosition) {
    this.startPosition = startPosition;
    return this;
  }

  /**
   * Get startPosition.
   * @return startPosition
   **/
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "")
  public Integer getEndPosition() {
    return endPosition;
  }


  /**
   * nextUri.
   *
   * @return FormLibrarySummaryList
   **/
  public FormLibrarySummaryList nextUri(String nextUri) {
    this.nextUri = nextUri;
    return this;
  }

  /**
   * Get nextUri.
   * @return nextUri
   **/
  @ApiModelProperty(value = "")
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
   * @return FormLibrarySummaryList
   **/
  public FormLibrarySummaryList priorUri(String priorUri) {
    this.priorUri = priorUri;
    return this;
  }

  /**
   * Get priorUri.
   * @return priorUri
   **/
  @ApiModelProperty(value = "")
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
   * @return FormLibrarySummaryList
   **/
  public FormLibrarySummaryList totalRowCount(Integer totalRowCount) {
    this.totalRowCount = totalRowCount;
    return this;
  }

  /**
   * Get totalRowCount.
   * @return totalRowCount
   **/
  @ApiModelProperty(value = "")
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
    FormLibrarySummaryList formLibrarySummaryList = (FormLibrarySummaryList) o;
    return Objects.equals(this.formsLibrarySummaries, formLibrarySummaryList.formsLibrarySummaries) &&
        Objects.equals(this.resultSetSize, formLibrarySummaryList.resultSetSize) &&
        Objects.equals(this.startPosition, formLibrarySummaryList.startPosition) &&
        Objects.equals(this.endPosition, formLibrarySummaryList.endPosition) &&
        Objects.equals(this.nextUri, formLibrarySummaryList.nextUri) &&
        Objects.equals(this.priorUri, formLibrarySummaryList.priorUri) &&
        Objects.equals(this.totalRowCount, formLibrarySummaryList.totalRowCount);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(formsLibrarySummaries, resultSetSize, startPosition, endPosition, nextUri, priorUri, totalRowCount);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormLibrarySummaryList {\n");
    
    sb.append("    formsLibrarySummaries: ").append(toIndentedString(formsLibrarySummaries)).append("\n");
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

