package com.docusign.rooms.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.rooms.model.TaskDateType;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * GlobalTaskDateTypes.
 *
 */

public class GlobalTaskDateTypes {
  @JsonProperty("taskDateTypes")
  private java.util.List<TaskDateType> taskDateTypes = null;


  /**
   * taskDateTypes.
   *
   * @return GlobalTaskDateTypes
   **/
  public GlobalTaskDateTypes taskDateTypes(java.util.List<TaskDateType> taskDateTypes) {
    this.taskDateTypes = taskDateTypes;
    return this;
  }
  
  /**
   * addTaskDateTypesItem.
   *
   * @return GlobalTaskDateTypes
   **/
  public GlobalTaskDateTypes addTaskDateTypesItem(TaskDateType taskDateTypesItem) {
    if (this.taskDateTypes == null) {
      this.taskDateTypes = new java.util.ArrayList<>();
    }
    this.taskDateTypes.add(taskDateTypesItem);
    return this;
  }

  /**
   * Get taskDateTypes.
   * @return taskDateTypes
   **/
  @ApiModelProperty(value = "")
  public java.util.List<TaskDateType> getTaskDateTypes() {
    return taskDateTypes;
  }

  /**
   * setTaskDateTypes.
   **/
  public void setTaskDateTypes(java.util.List<TaskDateType> taskDateTypes) {
    this.taskDateTypes = taskDateTypes;
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
    GlobalTaskDateTypes globalTaskDateTypes = (GlobalTaskDateTypes) o;
    return Objects.equals(this.taskDateTypes, globalTaskDateTypes.taskDateTypes);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(taskDateTypes);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GlobalTaskDateTypes {\n");
    
    sb.append("    taskDateTypes: ").append(toIndentedString(taskDateTypes)).append("\n");
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

