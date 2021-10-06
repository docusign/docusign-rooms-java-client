package com.docusign.rooms.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * TaskDateType.
 *
 */

public class TaskDateType {
  @JsonProperty("taskDateTypeId")
  private String taskDateTypeId = null;

  @JsonProperty("name")
  private String name = null;


  /**
   * taskDateTypeId.
   *
   * @return TaskDateType
   **/
  public TaskDateType taskDateTypeId(String taskDateTypeId) {
    this.taskDateTypeId = taskDateTypeId;
    return this;
  }

  /**
   * Get taskDateTypeId.
   * @return taskDateTypeId
   **/
  @ApiModelProperty(value = "")
  public String getTaskDateTypeId() {
    return taskDateTypeId;
  }

  /**
   * setTaskDateTypeId.
   **/
  public void setTaskDateTypeId(String taskDateTypeId) {
    this.taskDateTypeId = taskDateTypeId;
  }


  /**
   * name.
   *
   * @return TaskDateType
   **/
  public TaskDateType name(String name) {
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
    TaskDateType taskDateType = (TaskDateType) o;
    return Objects.equals(this.taskDateTypeId, taskDateType.taskDateTypeId) &&
        Objects.equals(this.name, taskDateType.name);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(taskDateTypeId, name);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskDateType {\n");
    
    sb.append("    taskDateTypeId: ").append(toIndentedString(taskDateTypeId)).append("\n");
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

