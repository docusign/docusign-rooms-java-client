package com.docusign.rooms.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.rooms.model.TaskListSummary;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * TaskListSummaryList.
 *
 */

public class TaskListSummaryList {
  @JsonProperty("taskListSummaries")
  private java.util.List<TaskListSummary> taskListSummaries = null;


  /**
   * taskListSummaries.
   *
   * @return TaskListSummaryList
   **/
  public TaskListSummaryList taskListSummaries(java.util.List<TaskListSummary> taskListSummaries) {
    this.taskListSummaries = taskListSummaries;
    return this;
  }
  
  /**
   * addTaskListSummariesItem.
   *
   * @return TaskListSummaryList
   **/
  public TaskListSummaryList addTaskListSummariesItem(TaskListSummary taskListSummariesItem) {
    if (this.taskListSummaries == null) {
      this.taskListSummaries = new java.util.ArrayList<TaskListSummary>();
    }
    this.taskListSummaries.add(taskListSummariesItem);
    return this;
  }

  /**
   * Get taskListSummaries.
   * @return taskListSummaries
   **/
  @ApiModelProperty(value = "")
  public java.util.List<TaskListSummary> getTaskListSummaries() {
    return taskListSummaries;
  }

  /**
   * setTaskListSummaries.
   **/
  public void setTaskListSummaries(java.util.List<TaskListSummary> taskListSummaries) {
    this.taskListSummaries = taskListSummaries;
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
    TaskListSummaryList taskListSummaryList = (TaskListSummaryList) o;
    return Objects.equals(this.taskListSummaries, taskListSummaryList.taskListSummaries);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(taskListSummaries);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskListSummaryList {\n");
    
    sb.append("    taskListSummaries: ").append(toIndentedString(taskListSummaries)).append("\n");
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

