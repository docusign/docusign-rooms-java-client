package com.docusign.rooms.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * TaskListTemplate.
 *
 */

public class TaskListTemplate {
  @JsonProperty("taskListTemplateId")
  private Integer taskListTemplateId = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("taskCount")
  private Integer taskCount = null;

  @JsonProperty("tasksWithDocumentsCount")
  private Integer tasksWithDocumentsCount = null;


  /**
   * taskListTemplateId.
   *
   * @return TaskListTemplate
   **/
  public TaskListTemplate taskListTemplateId(Integer taskListTemplateId) {
    this.taskListTemplateId = taskListTemplateId;
    return this;
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
   * setTaskListTemplateId.
   **/
  public void setTaskListTemplateId(Integer taskListTemplateId) {
    this.taskListTemplateId = taskListTemplateId;
  }


  /**
   * name.
   *
   * @return TaskListTemplate
   **/
  public TaskListTemplate name(String name) {
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
   * taskCount.
   *
   * @return TaskListTemplate
   **/
  public TaskListTemplate taskCount(Integer taskCount) {
    this.taskCount = taskCount;
    return this;
  }

  /**
   * Get taskCount.
   * @return taskCount
   **/
  @Schema(description = "")
  public Integer getTaskCount() {
    return taskCount;
  }

  /**
   * setTaskCount.
   **/
  public void setTaskCount(Integer taskCount) {
    this.taskCount = taskCount;
  }


  /**
   * tasksWithDocumentsCount.
   *
   * @return TaskListTemplate
   **/
  public TaskListTemplate tasksWithDocumentsCount(Integer tasksWithDocumentsCount) {
    this.tasksWithDocumentsCount = tasksWithDocumentsCount;
    return this;
  }

  /**
   * Get tasksWithDocumentsCount.
   * @return tasksWithDocumentsCount
   **/
  @Schema(description = "")
  public Integer getTasksWithDocumentsCount() {
    return tasksWithDocumentsCount;
  }

  /**
   * setTasksWithDocumentsCount.
   **/
  public void setTasksWithDocumentsCount(Integer tasksWithDocumentsCount) {
    this.tasksWithDocumentsCount = tasksWithDocumentsCount;
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
    TaskListTemplate taskListTemplate = (TaskListTemplate) o;
    return Objects.equals(this.taskListTemplateId, taskListTemplate.taskListTemplateId) &&
        Objects.equals(this.name, taskListTemplate.name) &&
        Objects.equals(this.taskCount, taskListTemplate.taskCount) &&
        Objects.equals(this.tasksWithDocumentsCount, taskListTemplate.tasksWithDocumentsCount);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(taskListTemplateId, name, taskCount, tasksWithDocumentsCount);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskListTemplate {\n");
    
    sb.append("    taskListTemplateId: ").append(toIndentedString(taskListTemplateId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    taskCount: ").append(toIndentedString(taskCount)).append("\n");
    sb.append("    tasksWithDocumentsCount: ").append(toIndentedString(tasksWithDocumentsCount)).append("\n");
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

