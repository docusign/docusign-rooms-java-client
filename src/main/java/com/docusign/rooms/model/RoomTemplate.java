package com.docusign.rooms.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * RoomTemplate
 */

public class RoomTemplate {
  @JsonProperty("roomTemplateId")
  private Integer roomTemplateId = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("taskTemplateCount")
  private Integer taskTemplateCount = null;

   /**
   * Get roomTemplateId
   * @return roomTemplateId
  **/
  @ApiModelProperty(value = "")
  public Integer getRoomTemplateId() {
    return roomTemplateId;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

   /**
   * Get taskTemplateCount
   * @return taskTemplateCount
  **/
  @ApiModelProperty(value = "")
  public Integer getTaskTemplateCount() {
    return taskTemplateCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoomTemplate roomTemplate = (RoomTemplate) o;
    return Objects.equals(this.roomTemplateId, roomTemplate.roomTemplateId) &&
        Objects.equals(this.name, roomTemplate.name) &&
        Objects.equals(this.taskTemplateCount, roomTemplate.taskTemplateCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(roomTemplateId, name, taskTemplateCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoomTemplate {\n");
    
    sb.append("    roomTemplateId: ").append(toIndentedString(roomTemplateId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    taskTemplateCount: ").append(toIndentedString(taskTemplateCount)).append("\n");
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

