package com.docusign.rooms.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.rooms.model.RoomDocumentOwner;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;

/**
 * RoomDocument
 */

public class RoomDocument {
  @JsonProperty("documentId")
  private Integer documentId = null;

  @JsonProperty("name")
  private String name = null;

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

  @JsonProperty("docuSignFormId")
  private String docuSignFormId = null;

  @JsonProperty("isArchived")
  private Boolean isArchived = null;

  @JsonProperty("isVirtual")
  private Boolean isVirtual = null;

  @JsonProperty("owner")
  private RoomDocumentOwner owner = null;

  public RoomDocument documentId(Integer documentId) {
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

  public RoomDocument name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public RoomDocument ownerId(Integer ownerId) {
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

  public RoomDocument size(Long size) {
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

  public RoomDocument folderId(Integer folderId) {
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

  public RoomDocument createdDate(DateTime createdDate) {
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

  public RoomDocument isSigned(Boolean isSigned) {
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

  public RoomDocument docuSignFormId(String docuSignFormId) {
    this.docuSignFormId = docuSignFormId;
    return this;
  }

   /**
   * Get docuSignFormId
   * @return docuSignFormId
  **/
  @ApiModelProperty(value = "")
  public String getDocuSignFormId() {
    return docuSignFormId;
  }

  public void setDocuSignFormId(String docuSignFormId) {
    this.docuSignFormId = docuSignFormId;
  }

  public RoomDocument isArchived(Boolean isArchived) {
    this.isArchived = isArchived;
    return this;
  }

   /**
   * Get isArchived
   * @return isArchived
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsArchived() {
    return isArchived;
  }

  public void setIsArchived(Boolean isArchived) {
    this.isArchived = isArchived;
  }

  public RoomDocument isVirtual(Boolean isVirtual) {
    this.isVirtual = isVirtual;
    return this;
  }

   /**
   * Get isVirtual
   * @return isVirtual
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsVirtual() {
    return isVirtual;
  }

  public void setIsVirtual(Boolean isVirtual) {
    this.isVirtual = isVirtual;
  }

  public RoomDocument owner(RoomDocumentOwner owner) {
    this.owner = owner;
    return this;
  }

   /**
   * Get owner
   * @return owner
  **/
  @ApiModelProperty(value = "")
  public RoomDocumentOwner getOwner() {
    return owner;
  }

  public void setOwner(RoomDocumentOwner owner) {
    this.owner = owner;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoomDocument roomDocument = (RoomDocument) o;
    return Objects.equals(this.documentId, roomDocument.documentId) &&
        Objects.equals(this.name, roomDocument.name) &&
        Objects.equals(this.ownerId, roomDocument.ownerId) &&
        Objects.equals(this.size, roomDocument.size) &&
        Objects.equals(this.folderId, roomDocument.folderId) &&
        Objects.equals(this.createdDate, roomDocument.createdDate) &&
        Objects.equals(this.isSigned, roomDocument.isSigned) &&
        Objects.equals(this.docuSignFormId, roomDocument.docuSignFormId) &&
        Objects.equals(this.isArchived, roomDocument.isArchived) &&
        Objects.equals(this.isVirtual, roomDocument.isVirtual) &&
        Objects.equals(this.owner, roomDocument.owner);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentId, name, ownerId, size, folderId, createdDate, isSigned, docuSignFormId, isArchived, isVirtual, owner);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoomDocument {\n");
    
    sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    folderId: ").append(toIndentedString(folderId)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    isSigned: ").append(toIndentedString(isSigned)).append("\n");
    sb.append("    docuSignFormId: ").append(toIndentedString(docuSignFormId)).append("\n");
    sb.append("    isArchived: ").append(toIndentedString(isArchived)).append("\n");
    sb.append("    isVirtual: ").append(toIndentedString(isVirtual)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
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

