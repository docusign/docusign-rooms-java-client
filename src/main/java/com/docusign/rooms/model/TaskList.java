package com.docusign.rooms.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.rooms.model.TaskSummary;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;

/**
 * TaskList
 */

public class TaskList {
  @JsonProperty("taskListId")
  private Integer taskListId = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("taskListTemplateId")
  private Integer taskListTemplateId = null;

  @JsonProperty("submittedForReviewDate")
  private DateTime submittedForReviewDate = null;

  @JsonProperty("approvalDate")
  private DateTime approvalDate = null;

  @JsonProperty("rejectedDate")
  private DateTime rejectedDate = null;

  @JsonProperty("createdDate")
  private DateTime createdDate = null;

  @JsonProperty("approvedByUserId")
  private Integer approvedByUserId = null;

  @JsonProperty("rejectedByUserId")
  private Integer rejectedByUserId = null;

  @JsonProperty("comment")
  private String comment = null;

  @JsonProperty("tasks")
  private java.util.List<TaskSummary> tasks = null;

  public TaskList taskListId(Integer taskListId) {
    this.taskListId = taskListId;
    return this;
  }

   /**
   * Get taskListId
   * @return taskListId
  **/
  @ApiModelProperty(value = "")
  public Integer getTaskListId() {
    return taskListId;
  }

  public void setTaskListId(Integer taskListId) {
    this.taskListId = taskListId;
  }

  public TaskList name(String name) {
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

  public TaskList taskListTemplateId(Integer taskListTemplateId) {
    this.taskListTemplateId = taskListTemplateId;
    return this;
  }

   /**
   * Get taskListTemplateId
   * @return taskListTemplateId
  **/
  @ApiModelProperty(value = "")
  public Integer getTaskListTemplateId() {
    return taskListTemplateId;
  }

  public void setTaskListTemplateId(Integer taskListTemplateId) {
    this.taskListTemplateId = taskListTemplateId;
  }

  public TaskList submittedForReviewDate(DateTime submittedForReviewDate) {
    this.submittedForReviewDate = submittedForReviewDate;
    return this;
  }

   /**
   * Get submittedForReviewDate
   * @return submittedForReviewDate
  **/
  @ApiModelProperty(value = "")
  public DateTime getSubmittedForReviewDate() {
    return submittedForReviewDate;
  }

  public void setSubmittedForReviewDate(DateTime submittedForReviewDate) {
    this.submittedForReviewDate = submittedForReviewDate;
  }

  public TaskList approvalDate(DateTime approvalDate) {
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

  public TaskList rejectedDate(DateTime rejectedDate) {
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

  public TaskList createdDate(DateTime createdDate) {
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

  public TaskList approvedByUserId(Integer approvedByUserId) {
    this.approvedByUserId = approvedByUserId;
    return this;
  }

   /**
   * Get approvedByUserId
   * @return approvedByUserId
  **/
  @ApiModelProperty(value = "")
  public Integer getApprovedByUserId() {
    return approvedByUserId;
  }

  public void setApprovedByUserId(Integer approvedByUserId) {
    this.approvedByUserId = approvedByUserId;
  }

  public TaskList rejectedByUserId(Integer rejectedByUserId) {
    this.rejectedByUserId = rejectedByUserId;
    return this;
  }

   /**
   * Get rejectedByUserId
   * @return rejectedByUserId
  **/
  @ApiModelProperty(value = "")
  public Integer getRejectedByUserId() {
    return rejectedByUserId;
  }

  public void setRejectedByUserId(Integer rejectedByUserId) {
    this.rejectedByUserId = rejectedByUserId;
  }

  public TaskList comment(String comment) {
    this.comment = comment;
    return this;
  }

   /**
   * Get comment
   * @return comment
  **/
  @ApiModelProperty(value = "")
  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public TaskList tasks(java.util.List<TaskSummary> tasks) {
    this.tasks = tasks;
    return this;
  }

  public TaskList addTasksItem(TaskSummary tasksItem) {
    if (this.tasks == null) {
      this.tasks = new java.util.ArrayList<TaskSummary>();
    }
    this.tasks.add(tasksItem);
    return this;
  }

   /**
   * Get tasks
   * @return tasks
  **/
  @ApiModelProperty(value = "")
  public java.util.List<TaskSummary> getTasks() {
    return tasks;
  }

  public void setTasks(java.util.List<TaskSummary> tasks) {
    this.tasks = tasks;
  }


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

  @Override
  public int hashCode() {
    return Objects.hash(taskListId, name, taskListTemplateId, submittedForReviewDate, approvalDate, rejectedDate, createdDate, approvedByUserId, rejectedByUserId, comment, tasks);
  }


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

