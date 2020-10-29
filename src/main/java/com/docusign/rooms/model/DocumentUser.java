package com.docusign.rooms.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * DocumentUser
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

  public DocumentUser userId(Integer userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @ApiModelProperty(value = "")
  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public DocumentUser documentId(Integer documentId) {
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

  public DocumentUser name(String name) {
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

  public DocumentUser hasAccess(Boolean hasAccess) {
    this.hasAccess = hasAccess;
    return this;
  }

   /**
   * Get hasAccess
   * @return hasAccess
  **/
  @ApiModelProperty(value = "")
  public Boolean isHasAccess() {
    return hasAccess;
  }

  public void setHasAccess(Boolean hasAccess) {
    this.hasAccess = hasAccess;
  }

  public DocumentUser canApproveTask(Boolean canApproveTask) {
    this.canApproveTask = canApproveTask;
    return this;
  }

   /**
   * Get canApproveTask
   * @return canApproveTask
  **/
  @ApiModelProperty(value = "")
  public Boolean isCanApproveTask() {
    return canApproveTask;
  }

  public void setCanApproveTask(Boolean canApproveTask) {
    this.canApproveTask = canApproveTask;
  }

  public DocumentUser canAssignToTaskList(Boolean canAssignToTaskList) {
    this.canAssignToTaskList = canAssignToTaskList;
    return this;
  }

   /**
   * Get canAssignToTaskList
   * @return canAssignToTaskList
  **/
  @ApiModelProperty(value = "")
  public Boolean isCanAssignToTaskList() {
    return canAssignToTaskList;
  }

  public void setCanAssignToTaskList(Boolean canAssignToTaskList) {
    this.canAssignToTaskList = canAssignToTaskList;
  }

  public DocumentUser canCopy(Boolean canCopy) {
    this.canCopy = canCopy;
    return this;
  }

   /**
   * Get canCopy
   * @return canCopy
  **/
  @ApiModelProperty(value = "")
  public Boolean isCanCopy() {
    return canCopy;
  }

  public void setCanCopy(Boolean canCopy) {
    this.canCopy = canCopy;
  }

  public DocumentUser canDelete(Boolean canDelete) {
    this.canDelete = canDelete;
    return this;
  }

   /**
   * Get canDelete
   * @return canDelete
  **/
  @ApiModelProperty(value = "")
  public Boolean isCanDelete() {
    return canDelete;
  }

  public void setCanDelete(Boolean canDelete) {
    this.canDelete = canDelete;
  }

  public DocumentUser canRemoveFromTaskList(Boolean canRemoveFromTaskList) {
    this.canRemoveFromTaskList = canRemoveFromTaskList;
    return this;
  }

   /**
   * Get canRemoveFromTaskList
   * @return canRemoveFromTaskList
  **/
  @ApiModelProperty(value = "")
  public Boolean isCanRemoveFromTaskList() {
    return canRemoveFromTaskList;
  }

  public void setCanRemoveFromTaskList(Boolean canRemoveFromTaskList) {
    this.canRemoveFromTaskList = canRemoveFromTaskList;
  }

  public DocumentUser canRemoveApproval(Boolean canRemoveApproval) {
    this.canRemoveApproval = canRemoveApproval;
    return this;
  }

   /**
   * Get canRemoveApproval
   * @return canRemoveApproval
  **/
  @ApiModelProperty(value = "")
  public Boolean isCanRemoveApproval() {
    return canRemoveApproval;
  }

  public void setCanRemoveApproval(Boolean canRemoveApproval) {
    this.canRemoveApproval = canRemoveApproval;
  }

  public DocumentUser canRename(Boolean canRename) {
    this.canRename = canRename;
    return this;
  }

   /**
   * Get canRename
   * @return canRename
  **/
  @ApiModelProperty(value = "")
  public Boolean isCanRename() {
    return canRename;
  }

  public void setCanRename(Boolean canRename) {
    this.canRename = canRename;
  }

  public DocumentUser canShare(Boolean canShare) {
    this.canShare = canShare;
    return this;
  }

   /**
   * Get canShare
   * @return canShare
  **/
  @ApiModelProperty(value = "")
  public Boolean isCanShare() {
    return canShare;
  }

  public void setCanShare(Boolean canShare) {
    this.canShare = canShare;
  }

  public DocumentUser canViewActivity(Boolean canViewActivity) {
    this.canViewActivity = canViewActivity;
    return this;
  }

   /**
   * Get canViewActivity
   * @return canViewActivity
  **/
  @ApiModelProperty(value = "")
  public Boolean isCanViewActivity() {
    return canViewActivity;
  }

  public void setCanViewActivity(Boolean canViewActivity) {
    this.canViewActivity = canViewActivity;
  }


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

  @Override
  public int hashCode() {
    return Objects.hash(userId, documentId, name, hasAccess, canApproveTask, canAssignToTaskList, canCopy, canDelete, canRemoveFromTaskList, canRemoveApproval, canRename, canShare, canViewActivity);
  }


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

