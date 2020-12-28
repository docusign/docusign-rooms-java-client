package com.docusign.rooms.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.rooms.model.RoomDocument;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * RoomDocumentList
 */

public class RoomDocumentList {
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

  @JsonProperty("documents")
  private java.util.List<RoomDocument> documents = null;

  public RoomDocumentList resultSetSize(Integer resultSetSize) {
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

  public RoomDocumentList startPosition(Integer startPosition) {
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

  public RoomDocumentList nextUri(String nextUri) {
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

  public RoomDocumentList priorUri(String priorUri) {
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

  public RoomDocumentList totalRowCount(Integer totalRowCount) {
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

  public RoomDocumentList documents(java.util.List<RoomDocument> documents) {
    this.documents = documents;
    return this;
  }

  public RoomDocumentList addDocumentsItem(RoomDocument documentsItem) {
    if (this.documents == null) {
      this.documents = new java.util.ArrayList<RoomDocument>();
    }
    this.documents.add(documentsItem);
    return this;
  }

   /**
   * Get documents
   * @return documents
  **/
  @ApiModelProperty(value = "")
  public java.util.List<RoomDocument> getDocuments() {
    return documents;
  }

  public void setDocuments(java.util.List<RoomDocument> documents) {
    this.documents = documents;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoomDocumentList roomDocumentList = (RoomDocumentList) o;
    return Objects.equals(this.resultSetSize, roomDocumentList.resultSetSize) &&
        Objects.equals(this.startPosition, roomDocumentList.startPosition) &&
        Objects.equals(this.endPosition, roomDocumentList.endPosition) &&
        Objects.equals(this.nextUri, roomDocumentList.nextUri) &&
        Objects.equals(this.priorUri, roomDocumentList.priorUri) &&
        Objects.equals(this.totalRowCount, roomDocumentList.totalRowCount) &&
        Objects.equals(this.documents, roomDocumentList.documents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resultSetSize, startPosition, endPosition, nextUri, priorUri, totalRowCount, documents);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoomDocumentList {\n");
    
    sb.append("    resultSetSize: ").append(toIndentedString(resultSetSize)).append("\n");
    sb.append("    startPosition: ").append(toIndentedString(startPosition)).append("\n");
    sb.append("    endPosition: ").append(toIndentedString(endPosition)).append("\n");
    sb.append("    nextUri: ").append(toIndentedString(nextUri)).append("\n");
    sb.append("    priorUri: ").append(toIndentedString(priorUri)).append("\n");
    sb.append("    totalRowCount: ").append(toIndentedString(totalRowCount)).append("\n");
    sb.append("    documents: ").append(toIndentedString(documents)).append("\n");
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

