package com.docusign.rooms.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.rooms.model.TaskStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * GlobalTaskStatuses
 */

public class GlobalTaskStatuses {
  @JsonProperty("taskStatuses")
  private java.util.List<TaskStatus> taskStatuses = null;

  public GlobalTaskStatuses taskStatuses(java.util.List<TaskStatus> taskStatuses) {
    this.taskStatuses = taskStatuses;
    return this;
  }

  public GlobalTaskStatuses addTaskStatusesItem(TaskStatus taskStatusesItem) {
    if (this.taskStatuses == null) {
      this.taskStatuses = new java.util.ArrayList<TaskStatus>();
    }
    this.taskStatuses.add(taskStatusesItem);
    return this;
  }

   /**
   * Get taskStatuses
   * @return taskStatuses
  **/
  @ApiModelProperty(value = "")
  public java.util.List<TaskStatus> getTaskStatuses() {
    return taskStatuses;
  }

  public void setTaskStatuses(java.util.List<TaskStatus> taskStatuses) {
    this.taskStatuses = taskStatuses;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GlobalTaskStatuses globalTaskStatuses = (GlobalTaskStatuses) o;
    return Objects.equals(this.taskStatuses, globalTaskStatuses.taskStatuses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(taskStatuses);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GlobalTaskStatuses {\n");
    
    sb.append("    taskStatuses: ").append(toIndentedString(taskStatuses)).append("\n");
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

