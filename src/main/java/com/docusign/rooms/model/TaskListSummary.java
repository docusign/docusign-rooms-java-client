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
 * TaskListSummary
 */

public class TaskListSummary {
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

   /**
   * Get taskListId
   * @return taskListId
  **/
  @ApiModelProperty(value = "")
  public Integer getTaskListId() {
    return taskListId;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

   /**
   * Get taskListTemplateId
   * @return taskListTemplateId
  **/
  @ApiModelProperty(value = "")
  public Integer getTaskListTemplateId() {
    return taskListTemplateId;
  }

   /**
   * Get submittedForReviewDate
   * @return submittedForReviewDate
  **/
  @ApiModelProperty(value = "")
  public DateTime getSubmittedForReviewDate() {
    return submittedForReviewDate;
  }

   /**
   * Get approvalDate
   * @return approvalDate
  **/
  @ApiModelProperty(value = "")
  public DateTime getApprovalDate() {
    return approvalDate;
  }

   /**
   * Get rejectedDate
   * @return rejectedDate
  **/
  @ApiModelProperty(value = "")
  public DateTime getRejectedDate() {
    return rejectedDate;
  }

   /**
   * Get createdDate
   * @return createdDate
  **/
  @ApiModelProperty(value = "")
  public DateTime getCreatedDate() {
    return createdDate;
  }

   /**
   * Get approvedByUserId
   * @return approvedByUserId
  **/
  @ApiModelProperty(value = "")
  public Integer getApprovedByUserId() {
    return approvedByUserId;
  }

   /**
   * Get rejectedByUserId
   * @return rejectedByUserId
  **/
  @ApiModelProperty(value = "")
  public Integer getRejectedByUserId() {
    return rejectedByUserId;
  }

   /**
   * Get comment
   * @return comment
  **/
  @ApiModelProperty(value = "")
  public String getComment() {
    return comment;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskListSummary taskListSummary = (TaskListSummary) o;
    return Objects.equals(this.taskListId, taskListSummary.taskListId) &&
        Objects.equals(this.name, taskListSummary.name) &&
        Objects.equals(this.taskListTemplateId, taskListSummary.taskListTemplateId) &&
        Objects.equals(this.submittedForReviewDate, taskListSummary.submittedForReviewDate) &&
        Objects.equals(this.approvalDate, taskListSummary.approvalDate) &&
        Objects.equals(this.rejectedDate, taskListSummary.rejectedDate) &&
        Objects.equals(this.createdDate, taskListSummary.createdDate) &&
        Objects.equals(this.approvedByUserId, taskListSummary.approvedByUserId) &&
        Objects.equals(this.rejectedByUserId, taskListSummary.rejectedByUserId) &&
        Objects.equals(this.comment, taskListSummary.comment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(taskListId, name, taskListTemplateId, submittedForReviewDate, approvalDate, rejectedDate, createdDate, approvedByUserId, rejectedByUserId, comment);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskListSummary {\n");
    
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

