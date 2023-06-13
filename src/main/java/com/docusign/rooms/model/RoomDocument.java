package com.docusign.rooms.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.rooms.model.RoomDocumentOwner;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;


/**
 * RoomDocument.
 *
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
  private String createdDate = null;

  @JsonProperty("isSigned")
  private Boolean isSigned = null;

  @JsonProperty("docuSignFormId")
  private String docuSignFormId = null;

  @JsonProperty("isArchived")
  private Boolean isArchived = null;

  @JsonProperty("isVirtual")
  private Boolean isVirtual = null;

  @JsonProperty("isDynamic")
  private Boolean isDynamic = null;

  @JsonProperty("owner")
  private RoomDocumentOwner owner = null;


  /**
   * documentId.
   *
   * @return RoomDocument
   **/
  public RoomDocument documentId(Integer documentId) {
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
   * @return RoomDocument
   **/
  public RoomDocument name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name.
   * @return name
   **/
  @Schema(description = "")
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
   * ownerId.
   *
   * @return RoomDocument
   **/
  public RoomDocument ownerId(Integer ownerId) {
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
   * @return RoomDocument
   **/
  public RoomDocument size(Long size) {
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
   * @return RoomDocument
   **/
  public RoomDocument folderId(Integer folderId) {
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
   * @return RoomDocument
   **/
  public RoomDocument createdDate(String createdDate) {
    this.createdDate = createdDate;
    return this;
  }

  /**
   * Get createdDate.
   * @return createdDate
   **/
  @Schema(description = "")
  public String getCreatedDate() {
    return createdDate;
  }

  /**
   * setCreatedDate.
   **/
  public void setCreatedDate(String createdDate) {
    this.createdDate = createdDate;
  }


  /**
   * isSigned.
   *
   * @return RoomDocument
   **/
  public RoomDocument isSigned(Boolean isSigned) {
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
   * docuSignFormId.
   *
   * @return RoomDocument
   **/
  public RoomDocument docuSignFormId(String docuSignFormId) {
    this.docuSignFormId = docuSignFormId;
    return this;
  }

  /**
   * Get docuSignFormId.
   * @return docuSignFormId
   **/
  @Schema(description = "")
  public String getDocuSignFormId() {
    return docuSignFormId;
  }

  /**
   * setDocuSignFormId.
   **/
  public void setDocuSignFormId(String docuSignFormId) {
    this.docuSignFormId = docuSignFormId;
  }


  /**
   * isArchived.
   *
   * @return RoomDocument
   **/
  public RoomDocument isArchived(Boolean isArchived) {
    this.isArchived = isArchived;
    return this;
  }

  /**
   * Get isArchived.
   * @return isArchived
   **/
  @Schema(description = "")
  public Boolean isIsArchived() {
    return isArchived;
  }

  /**
   * setIsArchived.
   **/
  public void setIsArchived(Boolean isArchived) {
    this.isArchived = isArchived;
  }


  /**
   * isVirtual.
   *
   * @return RoomDocument
   **/
  public RoomDocument isVirtual(Boolean isVirtual) {
    this.isVirtual = isVirtual;
    return this;
  }

  /**
   * Get isVirtual.
   * @return isVirtual
   **/
  @Schema(description = "")
  public Boolean isIsVirtual() {
    return isVirtual;
  }

  /**
   * setIsVirtual.
   **/
  public void setIsVirtual(Boolean isVirtual) {
    this.isVirtual = isVirtual;
  }


  /**
   * isDynamic.
   *
   * @return RoomDocument
   **/
  public RoomDocument isDynamic(Boolean isDynamic) {
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
   * owner.
   *
   * @return RoomDocument
   **/
  public RoomDocument owner(RoomDocumentOwner owner) {
    this.owner = owner;
    return this;
  }

  /**
   * Get owner.
   * @return owner
   **/
  @Schema(description = "")
  public RoomDocumentOwner getOwner() {
    return owner;
  }

  /**
   * setOwner.
   **/
  public void setOwner(RoomDocumentOwner owner) {
    this.owner = owner;
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
        Objects.equals(this.isDynamic, roomDocument.isDynamic) &&
        Objects.equals(this.owner, roomDocument.owner);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(documentId, name, ownerId, size, folderId, createdDate, isSigned, docuSignFormId, isArchived, isVirtual, isDynamic, owner);
  }


  /**
   * Converts the given object to string.
   */
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
    sb.append("    isDynamic: ").append(toIndentedString(isDynamic)).append("\n");
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

