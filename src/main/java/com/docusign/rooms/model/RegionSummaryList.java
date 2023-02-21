package com.docusign.rooms.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.rooms.model.RegionSummary;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * RegionSummaryList.
 *
 */

public class RegionSummaryList {
  @JsonProperty("regionSummaries")
  private java.util.List<RegionSummary> regionSummaries = null;

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
   * regionSummaries.
   *
   * @return RegionSummaryList
   **/
  public RegionSummaryList regionSummaries(java.util.List<RegionSummary> regionSummaries) {
    this.regionSummaries = regionSummaries;
    return this;
  }
  
  /**
   * addRegionSummariesItem.
   *
   * @return RegionSummaryList
   **/
  public RegionSummaryList addRegionSummariesItem(RegionSummary regionSummariesItem) {
    if (this.regionSummaries == null) {
      this.regionSummaries = new java.util.ArrayList<>();
    }
    this.regionSummaries.add(regionSummariesItem);
    return this;
  }

  /**
   * Get regionSummaries.
   * @return regionSummaries
   **/
  @ApiModelProperty(value = "")
  public java.util.List<RegionSummary> getRegionSummaries() {
    return regionSummaries;
  }

  /**
   * setRegionSummaries.
   **/
  public void setRegionSummaries(java.util.List<RegionSummary> regionSummaries) {
    this.regionSummaries = regionSummaries;
  }


  /**
   * resultSetSize.
   *
   * @return RegionSummaryList
   **/
  public RegionSummaryList resultSetSize(Integer resultSetSize) {
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
   * @return RegionSummaryList
   **/
  public RegionSummaryList startPosition(Integer startPosition) {
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
   * @return RegionSummaryList
   **/
  public RegionSummaryList nextUri(String nextUri) {
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
   * @return RegionSummaryList
   **/
  public RegionSummaryList priorUri(String priorUri) {
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
   * @return RegionSummaryList
   **/
  public RegionSummaryList totalRowCount(Integer totalRowCount) {
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
    RegionSummaryList regionSummaryList = (RegionSummaryList) o;
    return Objects.equals(this.regionSummaries, regionSummaryList.regionSummaries) &&
        Objects.equals(this.resultSetSize, regionSummaryList.resultSetSize) &&
        Objects.equals(this.startPosition, regionSummaryList.startPosition) &&
        Objects.equals(this.endPosition, regionSummaryList.endPosition) &&
        Objects.equals(this.nextUri, regionSummaryList.nextUri) &&
        Objects.equals(this.priorUri, regionSummaryList.priorUri) &&
        Objects.equals(this.totalRowCount, regionSummaryList.totalRowCount);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(regionSummaries, resultSetSize, startPosition, endPosition, nextUri, priorUri, totalRowCount);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegionSummaryList {\n");
    
    sb.append("    regionSummaries: ").append(toIndentedString(regionSummaries)).append("\n");
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

