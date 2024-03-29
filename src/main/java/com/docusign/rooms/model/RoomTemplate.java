package com.docusign.rooms.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * RoomTemplate.
 *
 */

public class RoomTemplate {
  @JsonProperty("roomTemplateId")
  private Integer roomTemplateId = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("taskTemplateCount")
  private Integer taskTemplateCount = null;

  /**
   * Get roomTemplateId.
   * @return roomTemplateId
   **/
  @Schema(description = "")
  public Integer getRoomTemplateId() {
    return roomTemplateId;
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
   * Get taskTemplateCount.
   * @return taskTemplateCount
   **/
  @Schema(description = "")
  public Integer getTaskTemplateCount() {
    return taskTemplateCount;
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
    RoomTemplate roomTemplate = (RoomTemplate) o;
    return Objects.equals(this.roomTemplateId, roomTemplate.roomTemplateId) &&
        Objects.equals(this.name, roomTemplate.name) &&
        Objects.equals(this.taskTemplateCount, roomTemplate.taskTemplateCount);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(roomTemplateId, name, taskTemplateCount);
  }


  /**
   * Converts the given object to string.
   */
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

