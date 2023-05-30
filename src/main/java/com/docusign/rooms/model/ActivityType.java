package com.docusign.rooms.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * ActivityType.
 *
 */

public class ActivityType {
  @JsonProperty("activityTypeId")
  private String activityTypeId = null;

  @JsonProperty("name")
  private String name = null;


  /**
   * activityTypeId.
   *
   * @return ActivityType
   **/
  public ActivityType activityTypeId(String activityTypeId) {
    this.activityTypeId = activityTypeId;
    return this;
  }

  /**
   * Get activityTypeId.
   * @return activityTypeId
   **/
  @Schema(description = "")
  public String getActivityTypeId() {
    return activityTypeId;
  }

  /**
   * setActivityTypeId.
   **/
  public void setActivityTypeId(String activityTypeId) {
    this.activityTypeId = activityTypeId;
  }


  /**
   * name.
   *
   * @return ActivityType
   **/
  public ActivityType name(String name) {
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
    ActivityType activityType = (ActivityType) o;
    return Objects.equals(this.activityTypeId, activityType.activityTypeId) &&
        Objects.equals(this.name, activityType.name);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(activityTypeId, name);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActivityType {\n");
    
    sb.append("    activityTypeId: ").append(toIndentedString(activityTypeId)).append("\n");
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

