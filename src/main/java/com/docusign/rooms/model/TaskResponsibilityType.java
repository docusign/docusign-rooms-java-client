package com.docusign.rooms.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * TaskResponsibilityType.
 *
 */

public class TaskResponsibilityType {
  @JsonProperty("taskResponsibilityTypeId")
  private String taskResponsibilityTypeId = null;

  @JsonProperty("name")
  private String name = null;


  /**
   * taskResponsibilityTypeId.
   *
   * @return TaskResponsibilityType
   **/
  public TaskResponsibilityType taskResponsibilityTypeId(String taskResponsibilityTypeId) {
    this.taskResponsibilityTypeId = taskResponsibilityTypeId;
    return this;
  }

  /**
   * Get taskResponsibilityTypeId.
   * @return taskResponsibilityTypeId
   **/
  @Schema(description = "")
  public String getTaskResponsibilityTypeId() {
    return taskResponsibilityTypeId;
  }

  /**
   * setTaskResponsibilityTypeId.
   **/
  public void setTaskResponsibilityTypeId(String taskResponsibilityTypeId) {
    this.taskResponsibilityTypeId = taskResponsibilityTypeId;
  }


  /**
   * name.
   *
   * @return TaskResponsibilityType
   **/
  public TaskResponsibilityType name(String name) {
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
    TaskResponsibilityType taskResponsibilityType = (TaskResponsibilityType) o;
    return Objects.equals(this.taskResponsibilityTypeId, taskResponsibilityType.taskResponsibilityTypeId) &&
        Objects.equals(this.name, taskResponsibilityType.name);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(taskResponsibilityTypeId, name);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskResponsibilityType {\n");
    
    sb.append("    taskResponsibilityTypeId: ").append(toIndentedString(taskResponsibilityTypeId)).append("\n");
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

