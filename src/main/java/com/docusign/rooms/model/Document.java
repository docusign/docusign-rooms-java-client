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
 * Document
 */

public class Document {
  @JsonProperty("documentId")
  private Integer documentId = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("roomId")
  private Integer roomId = null;

  @JsonProperty("ownerId")
  private Integer ownerId = null;

  @JsonProperty("size")
  private Long size = null;

  @JsonProperty("folderId")
  private Integer folderId = null;

  @JsonProperty("createdDate")
  private DateTime createdDate = null;

  @JsonProperty("isSigned")
  private Boolean isSigned = null;

  @JsonProperty("contentType")
  private String contentType = null;

  @JsonProperty("base64Contents")
  private String base64Contents = null;

  public Document documentId(Integer documentId) {
    this.documentId = documentId;
    return this;
  }

   /**
   * Get documentId
   * @return documentId
  **/
  @ApiModelProperty(value = "")
  public Integer getDocumentId() {
    return documentId;
  }

  public void setDocumentId(Integer documentId) {
    this.documentId = documentId;
  }

  public Document name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Document roomId(Integer roomId) {
    this.roomId = roomId;
    return this;
  }

   /**
   * Get roomId
   * @return roomId
  **/
  @ApiModelProperty(value = "")
  public Integer getRoomId() {
    return roomId;
  }

  public void setRoomId(Integer roomId) {
    this.roomId = roomId;
  }

  public Document ownerId(Integer ownerId) {
    this.ownerId = ownerId;
    return this;
  }

   /**
   * Get ownerId
   * @return ownerId
  **/
  @ApiModelProperty(value = "")
  public Integer getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(Integer ownerId) {
    this.ownerId = ownerId;
  }

  public Document size(Long size) {
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @ApiModelProperty(value = "")
  public Long getSize() {
    return size;
  }

  public void setSize(Long size) {
    this.size = size;
  }

  public Document folderId(Integer folderId) {
    this.folderId = folderId;
    return this;
  }

   /**
   * Get folderId
   * @return folderId
  **/
  @ApiModelProperty(value = "")
  public Integer getFolderId() {
    return folderId;
  }

  public void setFolderId(Integer folderId) {
    this.folderId = folderId;
  }

  public Document createdDate(DateTime createdDate) {
    this.createdDate = createdDate;
    return this;
  }

   /**
   * Get createdDate
   * @return createdDate
  **/
  @ApiModelProperty(value = "")
  public DateTime getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(DateTime createdDate) {
    this.createdDate = createdDate;
  }

  public Document isSigned(Boolean isSigned) {
    this.isSigned = isSigned;
    return this;
  }

   /**
   * Get isSigned
   * @return isSigned
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsSigned() {
    return isSigned;
  }

  public void setIsSigned(Boolean isSigned) {
    this.isSigned = isSigned;
  }

  public Document contentType(String contentType) {
    this.contentType = contentType;
    return this;
  }

   /**
   * Get contentType
   * @return contentType
  **/
  @ApiModelProperty(value = "")
  public String getContentType() {
    return contentType;
  }

  public void setContentType(String contentType) {
    this.contentType = contentType;
  }

  public Document base64Contents(String base64Contents) {
    this.base64Contents = base64Contents;
    return this;
  }

   /**
   * Get base64Contents
   * @return base64Contents
  **/
  @ApiModelProperty(required = true, value = "")
  public String getBase64Contents() {
    return base64Contents;
  }

  public void setBase64Contents(String base64Contents) {
    this.base64Contents = base64Contents;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Document document = (Document) o;
    return Objects.equals(this.documentId, document.documentId) &&
        Objects.equals(this.name, document.name) &&
        Objects.equals(this.roomId, document.roomId) &&
        Objects.equals(this.ownerId, document.ownerId) &&
        Objects.equals(this.size, document.size) &&
        Objects.equals(this.folderId, document.folderId) &&
        Objects.equals(this.createdDate, document.createdDate) &&
        Objects.equals(this.isSigned, document.isSigned) &&
        Objects.equals(this.contentType, document.contentType) &&
        Objects.equals(this.base64Contents, document.base64Contents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentId, name, roomId, ownerId, size, folderId, createdDate, isSigned, contentType, base64Contents);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Document {\n");
    
    sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    roomId: ").append(toIndentedString(roomId)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    folderId: ").append(toIndentedString(folderId)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    isSigned: ").append(toIndentedString(isSigned)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    base64Contents: ").append(toIndentedString(base64Contents)).append("\n");
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

