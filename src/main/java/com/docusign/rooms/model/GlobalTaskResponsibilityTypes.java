package com.docusign.rooms.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.rooms.model.TaskResponsibilityType;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * GlobalTaskResponsibilityTypes.
 *
 */

public class GlobalTaskResponsibilityTypes {
  @JsonProperty("taskResponsibilityTypes")
  private java.util.List<TaskResponsibilityType> taskResponsibilityTypes = null;


  /**
   * taskResponsibilityTypes.
   *
   * @return GlobalTaskResponsibilityTypes
   **/
  public GlobalTaskResponsibilityTypes taskResponsibilityTypes(java.util.List<TaskResponsibilityType> taskResponsibilityTypes) {
    this.taskResponsibilityTypes = taskResponsibilityTypes;
    return this;
  }
  
  /**
   * addTaskResponsibilityTypesItem.
   *
   * @return GlobalTaskResponsibilityTypes
   **/
  public GlobalTaskResponsibilityTypes addTaskResponsibilityTypesItem(TaskResponsibilityType taskResponsibilityTypesItem) {
    if (this.taskResponsibilityTypes == null) {
      this.taskResponsibilityTypes = new java.util.ArrayList<>();
    }
    this.taskResponsibilityTypes.add(taskResponsibilityTypesItem);
    return this;
  }

  /**
   * Get taskResponsibilityTypes.
   * @return taskResponsibilityTypes
   **/
  @ApiModelProperty(value = "")
  public java.util.List<TaskResponsibilityType> getTaskResponsibilityTypes() {
    return taskResponsibilityTypes;
  }

  /**
   * setTaskResponsibilityTypes.
   **/
  public void setTaskResponsibilityTypes(java.util.List<TaskResponsibilityType> taskResponsibilityTypes) {
    this.taskResponsibilityTypes = taskResponsibilityTypes;
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
    GlobalTaskResponsibilityTypes globalTaskResponsibilityTypes = (GlobalTaskResponsibilityTypes) o;
    return Objects.equals(this.taskResponsibilityTypes, globalTaskResponsibilityTypes.taskResponsibilityTypes);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(taskResponsibilityTypes);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GlobalTaskResponsibilityTypes {\n");
    
    sb.append("    taskResponsibilityTypes: ").append(toIndentedString(taskResponsibilityTypes)).append("\n");
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

