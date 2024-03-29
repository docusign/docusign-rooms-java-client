package com.docusign.rooms.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.rooms.model.TaskSummary;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;


/**
 * TaskList.
 *
 */

public class TaskList {
  @JsonProperty("taskListId")
  private Integer taskListId = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("taskListTemplateId")
  private Integer taskListTemplateId = null;

  @JsonProperty("submittedForReviewDate")
  private String submittedForReviewDate = null;

  @JsonProperty("approvalDate")
  private String approvalDate = null;

  @JsonProperty("rejectedDate")
  private String rejectedDate = null;

  @JsonProperty("createdDate")
  private String createdDate = null;

  @JsonProperty("approvedByUserId")
  private Integer approvedByUserId = null;

  @JsonProperty("rejectedByUserId")
  private Integer rejectedByUserId = null;

  @JsonProperty("comment")
  private String comment = null;

  @JsonProperty("tasks")
  private java.util.List<TaskSummary> tasks = null;


  /**
   * taskListId.
   *
   * @return TaskList
   **/
  public TaskList taskListId(Integer taskListId) {
    this.taskListId = taskListId;
    return this;
  }

  /**
   * Get taskListId.
   * @return taskListId
   **/
  @Schema(description = "")
  public Integer getTaskListId() {
    return taskListId;
  }

  /**
   * setTaskListId.
   **/
  public void setTaskListId(Integer taskListId) {
    this.taskListId = taskListId;
  }


  /**
   * name.
   *
   * @return TaskList
   **/
  public TaskList name(String name) {
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
   * taskListTemplateId.
   *
   * @return TaskList
   **/
  public TaskList taskListTemplateId(Integer taskListTemplateId) {
    this.taskListTemplateId = taskListTemplateId;
    return this;
  }

  /**
   * Get taskListTemplateId.
   * @return taskListTemplateId
   **/
  @Schema(description = "")
  public Integer getTaskListTemplateId() {
    return taskListTemplateId;
  }

  /**
   * setTaskListTemplateId.
   **/
  public void setTaskListTemplateId(Integer taskListTemplateId) {
    this.taskListTemplateId = taskListTemplateId;
  }


  /**
   * submittedForReviewDate.
   *
   * @return TaskList
   **/
  public TaskList submittedForReviewDate(String submittedForReviewDate) {
    this.submittedForReviewDate = submittedForReviewDate;
    return this;
  }

  /**
   * Get submittedForReviewDate.
   * @return submittedForReviewDate
   **/
  @Schema(description = "")
  public String getSubmittedForReviewDate() {
    return submittedForReviewDate;
  }

  /**
   * setSubmittedForReviewDate.
   **/
  public void setSubmittedForReviewDate(String submittedForReviewDate) {
    this.submittedForReviewDate = submittedForReviewDate;
  }


  /**
   * approvalDate.
   *
   * @return TaskList
   **/
  public TaskList approvalDate(String approvalDate) {
    this.approvalDate = approvalDate;
    return this;
  }

  /**
   * Get approvalDate.
   * @return approvalDate
   **/
  @Schema(description = "")
  public String getApprovalDate() {
    return approvalDate;
  }

  /**
   * setApprovalDate.
   **/
  public void setApprovalDate(String approvalDate) {
    this.approvalDate = approvalDate;
  }


  /**
   * rejectedDate.
   *
   * @return TaskList
   **/
  public TaskList rejectedDate(String rejectedDate) {
    this.rejectedDate = rejectedDate;
    return this;
  }

  /**
   * Get rejectedDate.
   * @return rejectedDate
   **/
  @Schema(description = "")
  public String getRejectedDate() {
    return rejectedDate;
  }

  /**
   * setRejectedDate.
   **/
  public void setRejectedDate(String rejectedDate) {
    this.rejectedDate = rejectedDate;
  }


  /**
   * createdDate.
   *
   * @return TaskList
   **/
  public TaskList createdDate(String createdDate) {
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
   * approvedByUserId.
   *
   * @return TaskList
   **/
  public TaskList approvedByUserId(Integer approvedByUserId) {
    this.approvedByUserId = approvedByUserId;
    return this;
  }

  /**
   * Get approvedByUserId.
   * @return approvedByUserId
   **/
  @Schema(description = "")
  public Integer getApprovedByUserId() {
    return approvedByUserId;
  }

  /**
   * setApprovedByUserId.
   **/
  public void setApprovedByUserId(Integer approvedByUserId) {
    this.approvedByUserId = approvedByUserId;
  }


  /**
   * rejectedByUserId.
   *
   * @return TaskList
   **/
  public TaskList rejectedByUserId(Integer rejectedByUserId) {
    this.rejectedByUserId = rejectedByUserId;
    return this;
  }

  /**
   * Get rejectedByUserId.
   * @return rejectedByUserId
   **/
  @Schema(description = "")
  public Integer getRejectedByUserId() {
    return rejectedByUserId;
  }

  /**
   * setRejectedByUserId.
   **/
  public void setRejectedByUserId(Integer rejectedByUserId) {
    this.rejectedByUserId = rejectedByUserId;
  }


  /**
   * comment.
   *
   * @return TaskList
   **/
  public TaskList comment(String comment) {
    this.comment = comment;
    return this;
  }

  /**
   * Get comment.
   * @return comment
   **/
  @Schema(description = "")
  public String getComment() {
    return comment;
  }

  /**
   * setComment.
   **/
  public void setComment(String comment) {
    this.comment = comment;
  }


  /**
   * tasks.
   *
   * @return TaskList
   **/
  public TaskList tasks(java.util.List<TaskSummary> tasks) {
    this.tasks = tasks;
    return this;
  }
  
  /**
   * addTasksItem.
   *
   * @return TaskList
   **/
  public TaskList addTasksItem(TaskSummary tasksItem) {
    if (this.tasks == null) {
      this.tasks = new java.util.ArrayList<>();
    }
    this.tasks.add(tasksItem);
    return this;
  }

  /**
   * Get tasks.
   * @return tasks
   **/
  @Schema(description = "")
  public java.util.List<TaskSummary> getTasks() {
    return tasks;
  }

  /**
   * setTasks.
   **/
  public void setTasks(java.util.List<TaskSummary> tasks) {
    this.tasks = tasks;
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
    TaskList taskList = (TaskList) o;
    return Objects.equals(this.taskListId, taskList.taskListId) &&
        Objects.equals(this.name, taskList.name) &&
        Objects.equals(this.taskListTemplateId, taskList.taskListTemplateId) &&
        Objects.equals(this.submittedForReviewDate, taskList.submittedForReviewDate) &&
        Objects.equals(this.approvalDate, taskList.approvalDate) &&
        Objects.equals(this.rejectedDate, taskList.rejectedDate) &&
        Objects.equals(this.createdDate, taskList.createdDate) &&
        Objects.equals(this.approvedByUserId, taskList.approvedByUserId) &&
        Objects.equals(this.rejectedByUserId, taskList.rejectedByUserId) &&
        Objects.equals(this.comment, taskList.comment) &&
        Objects.equals(this.tasks, taskList.tasks);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(taskListId, name, taskListTemplateId, submittedForReviewDate, approvalDate, rejectedDate, createdDate, approvedByUserId, rejectedByUserId, comment, tasks);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskList {\n");
    
    sb.append("    taskListId: ").append(toIndentedString(taskListId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    taskListTemplateId: ").append(toIndentedString(taskListTemplateId)).append("\n");
    sb.append("    submittedForReviewDate: ").append(toIndentedString(submittedForReviewDate)).append("\n");
    sb.append("    approvalDate: ").append(toIndentedString(approvalDate)).append("\n");
    sb.append("    rejectedDate: ").append(toIndentedString(rejectedDate)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    approvedByUserId: ").append(toIndentedString(approvedByUserId)).append("\n");
    sb.append("    rejectedByUserId: ").append(toIndentedString(rejectedByUserId)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    tasks: ").append(toIndentedString(tasks)).append("\n");
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

