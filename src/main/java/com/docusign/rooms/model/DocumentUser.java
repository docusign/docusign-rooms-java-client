package com.docusign.rooms.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * DocumentUser.
 *
 */

public class DocumentUser {
  @JsonProperty("userId")
  private Integer userId = null;

  @JsonProperty("documentId")
  private Integer documentId = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("hasAccess")
  private Boolean hasAccess = null;

  @JsonProperty("canApproveTask")
  private Boolean canApproveTask = null;

  @JsonProperty("canAssignToTaskList")
  private Boolean canAssignToTaskList = null;

  @JsonProperty("canCopy")
  private Boolean canCopy = null;

  @JsonProperty("canDelete")
  private Boolean canDelete = null;

  @JsonProperty("canRemoveFromTaskList")
  private Boolean canRemoveFromTaskList = null;

  @JsonProperty("canRemoveApproval")
  private Boolean canRemoveApproval = null;

  @JsonProperty("canRename")
  private Boolean canRename = null;

  @JsonProperty("canShare")
  private Boolean canShare = null;

  @JsonProperty("canViewActivity")
  private Boolean canViewActivity = null;


  /**
   * userId.
   *
   * @return DocumentUser
   **/
  public DocumentUser userId(Integer userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId.
   * @return userId
   **/
  @Schema(description = "")
  public Integer getUserId() {
    return userId;
  }

  /**
   * setUserId.
   **/
  public void setUserId(Integer userId) {
    this.userId = userId;
  }


  /**
   * documentId.
   *
   * @return DocumentUser
   **/
  public DocumentUser documentId(Integer documentId) {
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
   * @return DocumentUser
   **/
  public DocumentUser name(String name) {
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
   * hasAccess.
   *
   * @return DocumentUser
   **/
  public DocumentUser hasAccess(Boolean hasAccess) {
    this.hasAccess = hasAccess;
    return this;
  }

  /**
   * Get hasAccess.
   * @return hasAccess
   **/
  @Schema(description = "")
  public Boolean isHasAccess() {
    return hasAccess;
  }

  /**
   * setHasAccess.
   **/
  public void setHasAccess(Boolean hasAccess) {
    this.hasAccess = hasAccess;
  }


  /**
   * canApproveTask.
   *
   * @return DocumentUser
   **/
  public DocumentUser canApproveTask(Boolean canApproveTask) {
    this.canApproveTask = canApproveTask;
    return this;
  }

  /**
   * Get canApproveTask.
   * @return canApproveTask
   **/
  @Schema(description = "")
  public Boolean isCanApproveTask() {
    return canApproveTask;
  }

  /**
   * setCanApproveTask.
   **/
  public void setCanApproveTask(Boolean canApproveTask) {
    this.canApproveTask = canApproveTask;
  }


  /**
   * canAssignToTaskList.
   *
   * @return DocumentUser
   **/
  public DocumentUser canAssignToTaskList(Boolean canAssignToTaskList) {
    this.canAssignToTaskList = canAssignToTaskList;
    return this;
  }

  /**
   * Get canAssignToTaskList.
   * @return canAssignToTaskList
   **/
  @Schema(description = "")
  public Boolean isCanAssignToTaskList() {
    return canAssignToTaskList;
  }

  /**
   * setCanAssignToTaskList.
   **/
  public void setCanAssignToTaskList(Boolean canAssignToTaskList) {
    this.canAssignToTaskList = canAssignToTaskList;
  }


  /**
   * canCopy.
   *
   * @return DocumentUser
   **/
  public DocumentUser canCopy(Boolean canCopy) {
    this.canCopy = canCopy;
    return this;
  }

  /**
   * Get canCopy.
   * @return canCopy
   **/
  @Schema(description = "")
  public Boolean isCanCopy() {
    return canCopy;
  }

  /**
   * setCanCopy.
   **/
  public void setCanCopy(Boolean canCopy) {
    this.canCopy = canCopy;
  }


  /**
   * canDelete.
   *
   * @return DocumentUser
   **/
  public DocumentUser canDelete(Boolean canDelete) {
    this.canDelete = canDelete;
    return this;
  }

  /**
   * Get canDelete.
   * @return canDelete
   **/
  @Schema(description = "")
  public Boolean isCanDelete() {
    return canDelete;
  }

  /**
   * setCanDelete.
   **/
  public void setCanDelete(Boolean canDelete) {
    this.canDelete = canDelete;
  }


  /**
   * canRemoveFromTaskList.
   *
   * @return DocumentUser
   **/
  public DocumentUser canRemoveFromTaskList(Boolean canRemoveFromTaskList) {
    this.canRemoveFromTaskList = canRemoveFromTaskList;
    return this;
  }

  /**
   * Get canRemoveFromTaskList.
   * @return canRemoveFromTaskList
   **/
  @Schema(description = "")
  public Boolean isCanRemoveFromTaskList() {
    return canRemoveFromTaskList;
  }

  /**
   * setCanRemoveFromTaskList.
   **/
  public void setCanRemoveFromTaskList(Boolean canRemoveFromTaskList) {
    this.canRemoveFromTaskList = canRemoveFromTaskList;
  }


  /**
   * canRemoveApproval.
   *
   * @return DocumentUser
   **/
  public DocumentUser canRemoveApproval(Boolean canRemoveApproval) {
    this.canRemoveApproval = canRemoveApproval;
    return this;
  }

  /**
   * Get canRemoveApproval.
   * @return canRemoveApproval
   **/
  @Schema(description = "")
  public Boolean isCanRemoveApproval() {
    return canRemoveApproval;
  }

  /**
   * setCanRemoveApproval.
   **/
  public void setCanRemoveApproval(Boolean canRemoveApproval) {
    this.canRemoveApproval = canRemoveApproval;
  }


  /**
   * canRename.
   *
   * @return DocumentUser
   **/
  public DocumentUser canRename(Boolean canRename) {
    this.canRename = canRename;
    return this;
  }

  /**
   * Get canRename.
   * @return canRename
   **/
  @Schema(description = "")
  public Boolean isCanRename() {
    return canRename;
  }

  /**
   * setCanRename.
   **/
  public void setCanRename(Boolean canRename) {
    this.canRename = canRename;
  }


  /**
   * canShare.
   *
   * @return DocumentUser
   **/
  public DocumentUser canShare(Boolean canShare) {
    this.canShare = canShare;
    return this;
  }

  /**
   * Get canShare.
   * @return canShare
   **/
  @Schema(description = "")
  public Boolean isCanShare() {
    return canShare;
  }

  /**
   * setCanShare.
   **/
  public void setCanShare(Boolean canShare) {
    this.canShare = canShare;
  }


  /**
   * canViewActivity.
   *
   * @return DocumentUser
   **/
  public DocumentUser canViewActivity(Boolean canViewActivity) {
    this.canViewActivity = canViewActivity;
    return this;
  }

  /**
   * Get canViewActivity.
   * @return canViewActivity
   **/
  @Schema(description = "")
  public Boolean isCanViewActivity() {
    return canViewActivity;
  }

  /**
   * setCanViewActivity.
   **/
  public void setCanViewActivity(Boolean canViewActivity) {
    this.canViewActivity = canViewActivity;
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
    DocumentUser documentUser = (DocumentUser) o;
    return Objects.equals(this.userId, documentUser.userId) &&
        Objects.equals(this.documentId, documentUser.documentId) &&
        Objects.equals(this.name, documentUser.name) &&
        Objects.equals(this.hasAccess, documentUser.hasAccess) &&
        Objects.equals(this.canApproveTask, documentUser.canApproveTask) &&
        Objects.equals(this.canAssignToTaskList, documentUser.canAssignToTaskList) &&
        Objects.equals(this.canCopy, documentUser.canCopy) &&
        Objects.equals(this.canDelete, documentUser.canDelete) &&
        Objects.equals(this.canRemoveFromTaskList, documentUser.canRemoveFromTaskList) &&
        Objects.equals(this.canRemoveApproval, documentUser.canRemoveApproval) &&
        Objects.equals(this.canRename, documentUser.canRename) &&
        Objects.equals(this.canShare, documentUser.canShare) &&
        Objects.equals(this.canViewActivity, documentUser.canViewActivity);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(userId, documentId, name, hasAccess, canApproveTask, canAssignToTaskList, canCopy, canDelete, canRemoveFromTaskList, canRemoveApproval, canRename, canShare, canViewActivity);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentUser {\n");
    
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    hasAccess: ").append(toIndentedString(hasAccess)).append("\n");
    sb.append("    canApproveTask: ").append(toIndentedString(canApproveTask)).append("\n");
    sb.append("    canAssignToTaskList: ").append(toIndentedString(canAssignToTaskList)).append("\n");
    sb.append("    canCopy: ").append(toIndentedString(canCopy)).append("\n");
    sb.append("    canDelete: ").append(toIndentedString(canDelete)).append("\n");
    sb.append("    canRemoveFromTaskList: ").append(toIndentedString(canRemoveFromTaskList)).append("\n");
    sb.append("    canRemoveApproval: ").append(toIndentedString(canRemoveApproval)).append("\n");
    sb.append("    canRename: ").append(toIndentedString(canRename)).append("\n");
    sb.append("    canShare: ").append(toIndentedString(canShare)).append("\n");
    sb.append("    canViewActivity: ").append(toIndentedString(canViewActivity)).append("\n");
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

