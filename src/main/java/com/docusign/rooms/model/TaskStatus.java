package com.docusign.rooms.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * TaskStatus.
 *
 */

public class TaskStatus {
  @JsonProperty("taskStatusId")
  private String taskStatusId = null;

  @JsonProperty("name")
  private String name = null;


  /**
   * taskStatusId.
   *
   * @return TaskStatus
   **/
  public TaskStatus taskStatusId(String taskStatusId) {
    this.taskStatusId = taskStatusId;
    return this;
  }

  /**
   * Get taskStatusId.
   * @return taskStatusId
   **/
  @Schema(description = "")
  public String getTaskStatusId() {
    return taskStatusId;
  }

  /**
   * setTaskStatusId.
   **/
  public void setTaskStatusId(String taskStatusId) {
    this.taskStatusId = taskStatusId;
  }


  /**
   * name.
   *
   * @return TaskStatus
   **/
  public TaskStatus name(String name) {
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
    TaskStatus taskStatus = (TaskStatus) o;
    return Objects.equals(this.taskStatusId, taskStatus.taskStatusId) &&
        Objects.equals(this.name, taskStatus.name);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(taskStatusId, name);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskStatus {\n");
    
    sb.append("    taskStatusId: ").append(toIndentedString(taskStatusId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

