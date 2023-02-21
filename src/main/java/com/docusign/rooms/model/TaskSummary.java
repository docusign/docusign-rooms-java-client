package com.docusign.rooms.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;

/**
 * TaskSummary.
 *
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
  private OffsetDateTime fixedDueDate = null;

  @JsonProperty("ownerUserId")
  private Integer ownerUserId = null;

  @JsonProperty("completionDate")
  private OffsetDateTime completionDate = null;

  @JsonProperty("approvalDate")
  private OffsetDateTime approvalDate = null;

  @JsonProperty("rejectedDate")
  private OffsetDateTime rejectedDate = null;

  @JsonProperty("createdDate")
  private OffsetDateTime createdDate = null;

  @JsonProperty("isDocumentTask")
  private Boolean isDocumentTask = null;

  @JsonProperty("requiresReview")
  private Boolean requiresReview = null;


  /**
   * taskId.
   *
   * @return TaskSummary
   **/
  public TaskSummary taskId(Integer taskId) {
    this.taskId = taskId;
    return this;
  }

  /**
   * Get taskId.
   * @return taskId
   **/
  @ApiModelProperty(value = "")
  public Integer getTaskId() {
    return taskId;
  }

  /**
   * setTaskId.
   **/
  public void setTaskId(Integer taskId) {
    this.taskId = taskId;
  }


  /**
   * name.
   *
   * @return TaskSummary
   **/
  public TaskSummary name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name.
   * @return name
   **/
  @ApiModelProperty(value = "")
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
   * requiresApproval.
   *
   * @return TaskSummary
   **/
  public TaskSummary requiresApproval(Boolean requiresApproval) {
    this.requiresApproval = requiresApproval;
    return this;
  }

  /**
   * Get requiresApproval.
   * @return requiresApproval
   **/
  @ApiModelProperty(value = "")
  public Boolean isRequiresApproval() {
    return requiresApproval;
  }

  /**
   * setRequiresApproval.
   **/
  public void setRequiresApproval(Boolean requiresApproval) {
    this.requiresApproval = requiresApproval;
  }


  /**
   * dueDateTypeId.
   *
   * @return TaskSummary
   **/
  public TaskSummary dueDateTypeId(String dueDateTypeId) {
    this.dueDateTypeId = dueDateTypeId;
    return this;
  }

  /**
   * Get dueDateTypeId.
   * @return dueDateTypeId
   **/
  @ApiModelProperty(value = "")
  public String getDueDateTypeId() {
    return dueDateTypeId;
  }

  /**
   * setDueDateTypeId.
   **/
  public void setDueDateTypeId(String dueDateTypeId) {
    this.dueDateTypeId = dueDateTypeId;
  }


  /**
   * dueDateOffset.
   *
   * @return TaskSummary
   **/
  public TaskSummary dueDateOffset(Integer dueDateOffset) {
    this.dueDateOffset = dueDateOffset;
    return this;
  }

  /**
   * Get dueDateOffset.
   * @return dueDateOffset
   **/
  @ApiModelProperty(value = "")
  public Integer getDueDateOffset() {
    return dueDateOffset;
  }

  /**
   * setDueDateOffset.
   **/
  public void setDueDateOffset(Integer dueDateOffset) {
    this.dueDateOffset = dueDateOffset;
  }


  /**
   * fixedDueDate.
   *
   * @return TaskSummary
   **/
  public TaskSummary fixedDueDate(OffsetDateTime fixedDueDate) {
    this.fixedDueDate = fixedDueDate;
    return this;
  }

  /**
   * Get fixedDueDate.
   * @return fixedDueDate
   **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getFixedDueDate() {
    return fixedDueDate;
  }

  /**
   * setFixedDueDate.
   **/
  public void setFixedDueDate(OffsetDateTime fixedDueDate) {
    this.fixedDueDate = fixedDueDate;
  }


  /**
   * ownerUserId.
   *
   * @return TaskSummary
   **/
  public TaskSummary ownerUserId(Integer ownerUserId) {
    this.ownerUserId = ownerUserId;
    return this;
  }

  /**
   * Get ownerUserId.
   * @return ownerUserId
   **/
  @ApiModelProperty(value = "")
  public Integer getOwnerUserId() {
    return ownerUserId;
  }

  /**
   * setOwnerUserId.
   **/
  public void setOwnerUserId(Integer ownerUserId) {
    this.ownerUserId = ownerUserId;
  }


  /**
   * completionDate.
   *
   * @return TaskSummary
   **/
  public TaskSummary completionDate(OffsetDateTime completionDate) {
    this.completionDate = completionDate;
    return this;
  }

  /**
   * Get completionDate.
   * @return completionDate
   **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getCompletionDate() {
    return completionDate;
  }

  /**
   * setCompletionDate.
   **/
  public void setCompletionDate(OffsetDateTime completionDate) {
    this.completionDate = completionDate;
  }


  /**
   * approvalDate.
   *
   * @return TaskSummary
   **/
  public TaskSummary approvalDate(OffsetDateTime approvalDate) {
    this.approvalDate = approvalDate;
    return this;
  }

  /**
   * Get approvalDate.
   * @return approvalDate
   **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getApprovalDate() {
    return approvalDate;
  }

  /**
   * setApprovalDate.
   **/
  public void setApprovalDate(OffsetDateTime approvalDate) {
    this.approvalDate = approvalDate;
  }


  /**
   * rejectedDate.
   *
   * @return TaskSummary
   **/
  public TaskSummary rejectedDate(OffsetDateTime rejectedDate) {
    this.rejectedDate = rejectedDate;
    return this;
  }

  /**
   * Get rejectedDate.
   * @return rejectedDate
   **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getRejectedDate() {
    return rejectedDate;
  }

  /**
   * setRejectedDate.
   **/
  public void setRejectedDate(OffsetDateTime rejectedDate) {
    this.rejectedDate = rejectedDate;
  }


  /**
   * createdDate.
   *
   * @return TaskSummary
   **/
  public TaskSummary createdDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
    return this;
  }

  /**
   * Get createdDate.
   * @return createdDate
   **/
  @ApiModelProperty(value = "")
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
   * isDocumentTask.
   *
   * @return TaskSummary
   **/
  public TaskSummary isDocumentTask(Boolean isDocumentTask) {
    this.isDocumentTask = isDocumentTask;
    return this;
  }

  /**
   * Get isDocumentTask.
   * @return isDocumentTask
   **/
  @ApiModelProperty(value = "")
  public Boolean isIsDocumentTask() {
    return isDocumentTask;
  }

  /**
   * setIsDocumentTask.
   **/
  public void setIsDocumentTask(Boolean isDocumentTask) {
    this.isDocumentTask = isDocumentTask;
  }


  /**
   * requiresReview.
   *
   * @return TaskSummary
   **/
  public TaskSummary requiresReview(Boolean requiresReview) {
    this.requiresReview = requiresReview;
    return this;
  }

  /**
   * Get requiresReview.
   * @return requiresReview
   **/
  @ApiModelProperty(value = "")
  public Boolean isRequiresReview() {
    return requiresReview;
  }

  /**
   * setRequiresReview.
   **/
  public void setRequiresReview(Boolean requiresReview) {
    this.requiresReview = requiresReview;
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

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(taskId, name, requiresApproval, dueDateTypeId, dueDateOffset, fixedDueDate, ownerUserId, completionDate, approvalDate, rejectedDate, createdDate, isDocumentTask, requiresReview);
  }


  /**
   * Converts the given object to string.
   */
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

