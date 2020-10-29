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
 * GlobalTaskResponsibilityTypes
 */

public class GlobalTaskResponsibilityTypes {
  @JsonProperty("taskResponsibilityTypes")
  private java.util.List<TaskResponsibilityType> taskResponsibilityTypes = null;

  public GlobalTaskResponsibilityTypes taskResponsibilityTypes(java.util.List<TaskResponsibilityType> taskResponsibilityTypes) {
    this.taskResponsibilityTypes = taskResponsibilityTypes;
    return this;
  }

  public GlobalTaskResponsibilityTypes addTaskResponsibilityTypesItem(TaskResponsibilityType taskResponsibilityTypesItem) {
    if (this.taskResponsibilityTypes == null) {
      this.taskResponsibilityTypes = new java.util.ArrayList<TaskResponsibilityType>();
    }
    this.taskResponsibilityTypes.add(taskResponsibilityTypesItem);
    return this;
  }

   /**
   * Get taskResponsibilityTypes
   * @return taskResponsibilityTypes
  **/
  @ApiModelProperty(value = "")
  public java.util.List<TaskResponsibilityType> getTaskResponsibilityTypes() {
    return taskResponsibilityTypes;
  }

  public void setTaskResponsibilityTypes(java.util.List<TaskResponsibilityType> taskResponsibilityTypes) {
    this.taskResponsibilityTypes = taskResponsibilityTypes;
  }


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

  @Override
  public int hashCode() {
    return Objects.hash(taskResponsibilityTypes);
  }


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

