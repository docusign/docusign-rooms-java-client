package com.docusign.rooms.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.time.OffsetDateTime;

/**
 * Document.
 *
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
  private OffsetDateTime createdDate = null;

  @JsonProperty("isSigned")
  private Boolean isSigned = null;

  @JsonProperty("contentType")
  private String contentType = null;

  @JsonProperty("base64Contents")
  private String base64Contents = null;

  @JsonProperty("isDynamic")
  private Boolean isDynamic = null;


  /**
   * documentId.
   *
   * @return Document
   **/
  public Document documentId(Integer documentId) {
    this.documentId = documentId;
    return this;
  }

  /**
   * Get documentId.
   * @return documentId
   **/
  @Schema(description = "")
  public Integer getDocumentId() {
    return documentId;
  }

  /**
   * setDocumentId.
   **/
  public void setDocumentId(Integer documentId) {
    this.documentId = documentId;
  }


  /**
   * name.
   *
   * @return Document
   **/
  public Document name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name.
   * @return name
   **/
  @Schema(required = true, description = "")
  public String getName() {
    return name;
  }

  /**
   * setName.
   **/
  public void setName(String name) {
    this.name = name;
  }


  /**
   * roomId.
   *
   * @return Document
   **/
  public Document roomId(Integer roomId) {
    this.roomId = roomId;
    return this;
  }

  /**
   * Get roomId.
   * @return roomId
   **/
  @Schema(description = "")
  public Integer getRoomId() {
    return roomId;
  }

  /**
   * setRoomId.
   **/
  public void setRoomId(Integer roomId) {
    this.roomId = roomId;
  }


  /**
   * ownerId.
   *
   * @return Document
   **/
  public Document ownerId(Integer ownerId) {
    this.ownerId = ownerId;
    return this;
  }

  /**
   * Get ownerId.
   * @return ownerId
   **/
  @Schema(description = "")
  public Integer getOwnerId() {
    return ownerId;
  }

  /**
   * setOwnerId.
   **/
  public void setOwnerId(Integer ownerId) {
    this.ownerId = ownerId;
  }


  /**
   * size.
   *
   * @return Document
   **/
  public Document size(Long size) {
    this.size = size;
    return this;
  }

  /**
   * Get size.
   * @return size
   **/
  @Schema(description = "")
  public Long getSize() {
    return size;
  }

  /**
   * setSize.
   **/
  public void setSize(Long size) {
    this.size = size;
  }


  /**
   * folderId.
   *
   * @return Document
   **/
  public Document folderId(Integer folderId) {
    this.folderId = folderId;
    return this;
  }

  /**
   * Get folderId.
   * @return folderId
   **/
  @Schema(description = "")
  public Integer getFolderId() {
    return folderId;
  }

  /**
   * setFolderId.
   **/
  public void setFolderId(Integer folderId) {
    this.folderId = folderId;
  }


  /**
   * createdDate.
   *
   * @return Document
   **/
  public Document createdDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
    return this;
  }

  /**
   * Get createdDate.
   * @return createdDate
   **/
  @Schema(description = "")
  public OffsetDateTime getCreatedDate() {
    return createdDate;
  }

  /**
   * setCreatedDate.
   **/
  public void setCreatedDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
  }


  /**
   * isSigned.
   *
   * @return Document
   **/
  public Document isSigned(Boolean isSigned) {
    this.isSigned = isSigned;
    return this;
  }

  /**
   * Get isSigned.
   * @return isSigned
   **/
  @Schema(description = "")
  public Boolean isIsSigned() {
    return isSigned;
  }

  /**
   * setIsSigned.
   **/
  public void setIsSigned(Boolean isSigned) {
    this.isSigned = isSigned;
  }


  /**
   * contentType.
   *
   * @return Document
   **/
  public Document contentType(String contentType) {
    this.contentType = contentType;
    return this;
  }

  /**
   * Get contentType.
   * @return contentType
   **/
  @Schema(description = "")
  public String getContentType() {
    return contentType;
  }

  /**
   * setContentType.
   **/
  public void setContentType(String contentType) {
    this.contentType = contentType;
  }


  /**
   * base64Contents.
   *
   * @return Document
   **/
  public Document base64Contents(String base64Contents) {
    this.base64Contents = base64Contents;
    return this;
  }

  /**
   * Get base64Contents.
   * @return base64Contents
   **/
  @Schema(required = true, description = "")
  public String getBase64Contents() {
    return base64Contents;
  }

  /**
   * setBase64Contents.
   **/
  public void setBase64Contents(String base64Contents) {
    this.base64Contents = base64Contents;
  }


  /**
   * isDynamic.
   *
   * @return Document
   **/
  public Document isDynamic(Boolean isDynamic) {
    this.isDynamic = isDynamic;
    return this;
  }

  /**
   * Get isDynamic.
   * @return isDynamic
   **/
  @Schema(description = "")
  public Boolean isIsDynamic() {
    return isDynamic;
  }

  /**
   * setIsDynamic.
   **/
  public void setIsDynamic(Boolean isDynamic) {
    this.isDynamic = isDynamic;
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
        Objects.equals(this.base64Contents, document.base64Contents) &&
        Objects.equals(this.isDynamic, document.isDynamic);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(documentId, name, roomId, ownerId, size, folderId, createdDate, isSigned, contentType, base64Contents, isDynamic);
  }


  /**
   * Converts the given object to string.
   */
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
    sb.append("    isDynamic: ").append(toIndentedString(isDynamic)).append("\n");
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

