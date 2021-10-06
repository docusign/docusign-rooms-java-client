package com.docusign.rooms.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * TaskListForCreate.
 *
 */

public class TaskListForCreate {
  @JsonProperty("taskListTemplateId")
  private Integer taskListTemplateId = null;


  /**
   * taskListTemplateId.
   *
   * @return TaskListForCreate
   **/
  public TaskListForCreate taskListTemplateId(Integer taskListTemplateId) {
    this.taskListTemplateId = taskListTemplateId;
    return this;
  }

  /**
   * Get taskListTemplateId.
   * @return taskListTemplateId
   **/
  @ApiModelProperty(value = "")
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
    TaskListForCreate taskListForCreate = (TaskListForCreate) o;
    return Objects.equals(this.taskListTemplateId, taskListForCreate.taskListTemplateId);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(taskListTemplateId);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskListForCreate {\n");
    
    sb.append("    taskListTemplateId: ").append(toIndentedString(taskListTemplateId)).append("\n");
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

