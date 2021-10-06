package com.docusign.rooms.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.rooms.model.TaskListTemplate;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * TaskListTemplateList.
 *
 */

public class TaskListTemplateList {
  @JsonProperty("taskListTemplates")
  private java.util.List<TaskListTemplate> taskListTemplates = null;

  @JsonProperty("resultSetSize")
  private Integer resultSetSize = null;

  @JsonProperty("startPosition")
  private Integer startPosition = null;

  @JsonProperty("endPosition")
  private Integer endPosition = null;

  @JsonProperty("nextUri")
  private String nextUri = null;

  @JsonProperty("priorUri")
  private String priorUri = null;

  @JsonProperty("totalRowCount")
  private Integer totalRowCount = null;


  /**
   * taskListTemplates.
   *
   * @return TaskListTemplateList
   **/
  public TaskListTemplateList taskListTemplates(java.util.List<TaskListTemplate> taskListTemplates) {
    this.taskListTemplates = taskListTemplates;
    return this;
  }
  
  /**
   * addTaskListTemplatesItem.
   *
   * @return TaskListTemplateList
   **/
  public TaskListTemplateList addTaskListTemplatesItem(TaskListTemplate taskListTemplatesItem) {
    if (this.taskListTemplates == null) {
      this.taskListTemplates = new java.util.ArrayList<TaskListTemplate>();
    }
    this.taskListTemplates.add(taskListTemplatesItem);
    return this;
  }

  /**
   * Get taskListTemplates.
   * @return taskListTemplates
   **/
  @ApiModelProperty(value = "")
  public java.util.List<TaskListTemplate> getTaskListTemplates() {
    return taskListTemplates;
  }

  /**
   * setTaskListTemplates.
   **/
  public void setTaskListTemplates(java.util.List<TaskListTemplate> taskListTemplates) {
    this.taskListTemplates = taskListTemplates;
  }


  /**
   * resultSetSize.
   *
   * @return TaskListTemplateList
   **/
  public TaskListTemplateList resultSetSize(Integer resultSetSize) {
    this.resultSetSize = resultSetSize;
    return this;
  }

  /**
   * Get resultSetSize.
   * @return resultSetSize
   **/
  @ApiModelProperty(value = "")
  public Integer getResultSetSize() {
    return resultSetSize;
  }

  /**
   * setResultSetSize.
   **/
  public void setResultSetSize(Integer resultSetSize) {
    this.resultSetSize = resultSetSize;
  }


  /**
   * startPosition.
   *
   * @return TaskListTemplateList
   **/
  public TaskListTemplateList startPosition(Integer startPosition) {
    this.startPosition = startPosition;
    return this;
  }

  /**
   * Get startPosition.
   * @return startPosition
   **/
  @ApiModelProperty(value = "")
  public Integer getStartPosition() {
    return startPosition;
  }

  /**
   * setStartPosition.
   **/
  public void setStartPosition(Integer startPosition) {
    this.startPosition = startPosition;
  }

  /**
   * Get endPosition.
   * @return endPosition
   **/
  @ApiModelProperty(value = "")
  public Integer getEndPosition() {
    return endPosition;
  }


  /**
   * nextUri.
   *
   * @return TaskListTemplateList
   **/
  public TaskListTemplateList nextUri(String nextUri) {
    this.nextUri = nextUri;
    return this;
  }

  /**
   * Get nextUri.
   * @return nextUri
   **/
  @ApiModelProperty(value = "")
  public String getNextUri() {
    return nextUri;
  }

  /**
   * setNextUri.
   **/
  public void setNextUri(String nextUri) {
    this.nextUri = nextUri;
  }


  /**
   * priorUri.
   *
   * @return TaskListTemplateList
   **/
  public TaskListTemplateList priorUri(String priorUri) {
    this.priorUri = priorUri;
    return this;
  }

  /**
   * Get priorUri.
   * @return priorUri
   **/
  @ApiModelProperty(value = "")
  public String getPriorUri() {
    return priorUri;
  }

  /**
   * setPriorUri.
   **/
  public void setPriorUri(String priorUri) {
    this.priorUri = priorUri;
  }


  /**
   * totalRowCount.
   *
   * @return TaskListTemplateList
   **/
  public TaskListTemplateList totalRowCount(Integer totalRowCount) {
    this.totalRowCount = totalRowCount;
    return this;
  }

  /**
   * Get totalRowCount.
   * @return totalRowCount
   **/
  @ApiModelProperty(value = "")
  public Integer getTotalRowCount() {
    return totalRowCount;
  }

  /**
   * setTotalRowCount.
   **/
  public void setTotalRowCount(Integer totalRowCount) {
    this.totalRowCount = totalRowCount;
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
    TaskListTemplateList taskListTemplateList = (TaskListTemplateList) o;
    return Objects.equals(this.taskListTemplates, taskListTemplateList.taskListTemplates) &&
        Objects.equals(this.resultSetSize, taskListTemplateList.resultSetSize) &&
        Objects.equals(this.startPosition, taskListTemplateList.startPosition) &&
        Objects.equals(this.endPosition, taskListTemplateList.endPosition) &&
        Objects.equals(this.nextUri, taskListTemplateList.nextUri) &&
        Objects.equals(this.priorUri, taskListTemplateList.priorUri) &&
        Objects.equals(this.totalRowCount, taskListTemplateList.totalRowCount);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(taskListTemplates, resultSetSize, startPosition, endPosition, nextUri, priorUri, totalRowCount);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskListTemplateList {\n");
    
    sb.append("    taskListTemplates: ").append(toIndentedString(taskListTemplates)).append("\n");
    sb.append("    resultSetSize: ").append(toIndentedString(resultSetSize)).append("\n");
    sb.append("    startPosition: ").append(toIndentedString(startPosition)).append("\n");
    sb.append("    endPosition: ").append(toIndentedString(endPosition)).append("\n");
    sb.append("    nextUri: ").append(toIndentedString(nextUri)).append("\n");
    sb.append("    priorUri: ").append(toIndentedString(priorUri)).append("\n");
    sb.append("    totalRowCount: ").append(toIndentedString(totalRowCount)).append("\n");
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

