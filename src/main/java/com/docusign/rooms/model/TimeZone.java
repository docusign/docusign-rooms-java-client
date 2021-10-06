package com.docusign.rooms.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * TimeZone.
 *
 */

public class TimeZone {
  @JsonProperty("timeZoneId")
  private String timeZoneId = null;

  @JsonProperty("name")
  private String name = null;


  /**
   * timeZoneId.
   *
   * @return TimeZone
   **/
  public TimeZone timeZoneId(String timeZoneId) {
    this.timeZoneId = timeZoneId;
    return this;
  }

  /**
   * Get timeZoneId.
   * @return timeZoneId
   **/
  @ApiModelProperty(value = "")
  public String getTimeZoneId() {
    return timeZoneId;
  }

  /**
   * setTimeZoneId.
   **/
  public void setTimeZoneId(String timeZoneId) {
    this.timeZoneId = timeZoneId;
  }


  /**
   * name.
   *
   * @return TimeZone
   **/
  public TimeZone name(String name) {
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
    TimeZone timeZone = (TimeZone) o;
    return Objects.equals(this.timeZoneId, timeZone.timeZoneId) &&
        Objects.equals(this.name, timeZone.name);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(timeZoneId, name);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeZone {\n");
    
    sb.append("    timeZoneId: ").append(toIndentedString(timeZoneId)).append("\n");
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

