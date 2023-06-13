package com.docusign.rooms.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;


/**
 * TaskListSummary.
 *
 */

public class TaskListSummary {
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

  /**
   * Get taskListId.
   * @return taskListId
   **/
  @Schema(description = "")
  public Integer getTaskListId() {
    return taskListId;
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
   * Get taskListTemplateId.
   * @return taskListTemplateId
   **/
  @Schema(description = "")
  public Integer getTaskListTemplateId() {
    return taskListTemplateId;
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
   * Get approvalDate.
   * @return approvalDate
   **/
  @Schema(description = "")
  public String getApprovalDate() {
    return approvalDate;
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
   * Get createdDate.
   * @return createdDate
   **/
  @Schema(description = "")
  public String getCreatedDate() {
    return createdDate;
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
   * Get rejectedByUserId.
   * @return rejectedByUserId
   **/
  @Schema(description = "")
  public Integer getRejectedByUserId() {
    return rejectedByUserId;
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

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(taskListId, name, taskListTemplateId, submittedForReviewDate, approvalDate, rejectedDate, createdDate, approvedByUserId, rejectedByUserId, comment);
  }


  /**
   * Converts the given object to string.
   */
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

