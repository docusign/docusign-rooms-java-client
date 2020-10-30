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
 * TaskSummary
 */

public class TaskSummary {
  @JsonProperty("taskId")
  private Integer taskId = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("requiresApproval")
  private Boolean requiresApproval = null;

  @JsonProperty("dueDateTypeId")
  private String dueDateTypeId = null;

  @JsonProperty("dueDateOffset")
  private Integer dueDateOffset = null;

  @JsonProperty("fixedDueDate")
  private DateTime fixedDueDate = null;

  @JsonProperty("ownerUserId")
  private Integer ownerUserId = null;

  @JsonProperty("completionDate")
  private DateTime completionDate = null;

  @JsonProperty("approvalDate")
  private DateTime approvalDate = null;

  @JsonProperty("rejectedDate")
  private DateTime rejectedDate = null;

  @JsonProperty("createdDate")
  private DateTime createdDate = null;

  @JsonProperty("isDocumentTask")
  private Boolean isDocumentTask = null;

  @JsonProperty("requiresReview")
  private Boolean requiresReview = null;

  public TaskSummary taskId(Integer taskId) {
    this.taskId = taskId;
    return this;
  }

   /**
   * Get taskId
   * @return taskId
  **/
  @ApiModelProperty(value = "")
  public Integer getTaskId() {
    return taskId;
  }

  public void setTaskId(Integer taskId) {
    this.taskId = taskId;
  }

  public TaskSummary name(String name) {
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

  public TaskSummary requiresApproval(Boolean requiresApproval) {
    this.requiresApproval = requiresApproval;
    return this;
  }

   /**
   * Get requiresApproval
   * @return requiresApproval
  **/
  @ApiModelProperty(value = "")
  public Boolean isRequiresApproval() {
    return requiresApproval;
  }

  public void setRequiresApproval(Boolean requiresApproval) {
    this.requiresApproval = requiresApproval;
  }

  public TaskSummary dueDateTypeId(String dueDateTypeId) {
    this.dueDateTypeId = dueDateTypeId;
    return this;
  }

   /**
   * Get dueDateTypeId
   * @return dueDateTypeId
  **/
  @ApiModelProperty(value = "")
  public String getDueDateTypeId() {
    return dueDateTypeId;
  }

  public void setDueDateTypeId(String dueDateTypeId) {
    this.dueDateTypeId = dueDateTypeId;
  }

  public TaskSummary dueDateOffset(Integer dueDateOffset) {
    this.dueDateOffset = dueDateOffset;
    return this;
  }

   /**
   * Get dueDateOffset
   * @return dueDateOffset
  **/
  @ApiModelProperty(value = "")
  public Integer getDueDateOffset() {
    return dueDateOffset;
  }

  public void setDueDateOffset(Integer dueDateOffset) {
    this.dueDateOffset = dueDateOffset;
  }

  public TaskSummary fixedDueDate(DateTime fixedDueDate) {
    this.fixedDueDate = fixedDueDate;
    return this;
  }

   /**
   * Get fixedDueDate
   * @return fixedDueDate
  **/
  @ApiModelProperty(value = "")
  public DateTime getFixedDueDate() {
    return fixedDueDate;
  }

  public void setFixedDueDate(DateTime fixedDueDate) {
    this.fixedDueDate = fixedDueDate;
  }

  public TaskSummary ownerUserId(Integer ownerUserId) {
    this.ownerUserId = ownerUserId;
    return this;
  }

   /**
   * Get ownerUserId
   * @return ownerUserId
  **/
  @ApiModelProperty(value = "")
  public Integer getOwnerUserId() {
    return ownerUserId;
  }

  public void setOwnerUserId(Integer ownerUserId) {
    this.ownerUserId = ownerUserId;
  }

  public TaskSummary completionDate(DateTime completionDate) {
    this.completionDate = completionDate;
    return this;
  }

   /**
   * Get completionDate
   * @return completionDate
  **/
  @ApiModelProperty(value = "")
  public DateTime getCompletionDate() {
    return completionDate;
  }

  public void setCompletionDate(DateTime completionDate) {
    this.completionDate = completionDate;
  }

  public TaskSummary approvalDate(DateTime approvalDate) {
    this.approvalDate = approvalDate;
    return this;
  }

   /**
   * Get approvalDate
   * @return approvalDate
  **/
  @ApiModelProperty(value = "")
  public DateTime getApprovalDate() {
    return approvalDate;
  }

  public void setApprovalDate(DateTime approvalDate) {
    this.approvalDate = approvalDate;
  }

  public TaskSummary rejectedDate(DateTime rejectedDate) {
    this.rejectedDate = rejectedDate;
    return this;
  }

   /**
   * Get rejectedDate
   * @return rejectedDate
  **/
  @ApiModelProperty(value = "")
  public DateTime getRejectedDate() {
    return rejectedDate;
  }

  public void setRejectedDate(DateTime rejectedDate) {
    this.rejectedDate = rejectedDate;
  }

  public TaskSummary createdDate(DateTime createdDate) {
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

  public TaskSummary isDocumentTask(Boolean isDocumentTask) {
    this.isDocumentTask = isDocumentTask;
    return this;
  }

   /**
   * Get isDocumentTask
   * @return isDocumentTask
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsDocumentTask() {
    return isDocumentTask;
  }

  public void setIsDocumentTask(Boolean isDocumentTask) {
    this.isDocumentTask = isDocumentTask;
  }

  public TaskSummary requiresReview(Boolean requiresReview) {
    this.requiresReview = requiresReview;
    return this;
  }

   /**
   * Get requiresReview
   * @return requiresReview
  **/
  @ApiModelProperty(value = "")
  public Boolean isRequiresReview() {
    return requiresReview;
  }

  public void setRequiresReview(Boolean requiresReview) {
    this.requiresReview = requiresReview;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskSummary taskSummary = (TaskSummary) o;
    return Objects.equals(this.taskId, taskSummary.taskId) &&
        Objects.equals(this.name, taskSummary.name) &&
        Objects.equals(this.requiresApproval, taskSummary.requiresApproval) &&
        Objects.equals(this.dueDateTypeId, taskSummary.dueDateTypeId) &&
        Objects.equals(this.dueDateOffset, taskSummary.dueDateOffset) &&
        Objects.equals(this.fixedDueDate, taskSummary.fixedDueDate) &&
        Objects.equals(this.ownerUserId, taskSummary.ownerUserId) &&
        Objects.equals(this.completionDate, taskSummary.completionDate) &&
        Objects.equals(this.approvalDate, taskSummary.approvalDate) &&
        Objects.equals(this.rejectedDate, taskSummary.rejectedDate) &&
        Objects.equals(this.createdDate, taskSummary.createdDate) &&
        Objects.equals(this.isDocumentTask, taskSummary.isDocumentTask) &&
        Objects.equals(this.requiresReview, taskSummary.requiresReview);
  }

  @Override
  public int hashCode() {
    return Objects.hash(taskId, name, requiresApproval, dueDateTypeId, dueDateOffset, fixedDueDate, ownerUserId, completionDate, approvalDate, rejectedDate, createdDate, isDocumentTask, requiresReview);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskSummary {\n");
    
    sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    requiresApproval: ").append(toIndentedString(requiresApproval)).append("\n");
    sb.append("    dueDateTypeId: ").append(toIndentedString(dueDateTypeId)).append("\n");
    sb.append("    dueDateOffset: ").append(toIndentedString(dueDateOffset)).append("\n");
    sb.append("    fixedDueDate: ").append(toIndentedString(fixedDueDate)).append("\n");
    sb.append("    ownerUserId: ").append(toIndentedString(ownerUserId)).append("\n");
    sb.append("    completionDate: ").append(toIndentedString(completionDate)).append("\n");
    sb.append("    approvalDate: ").append(toIndentedString(approvalDate)).append("\n");
    sb.append("    rejectedDate: ").append(toIndentedString(rejectedDate)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    isDocumentTask: ").append(toIndentedString(isDocumentTask)).append("\n");
    sb.append("    requiresReview: ").append(toIndentedString(requiresReview)).append("\n");
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

