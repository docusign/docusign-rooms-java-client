package com.docusign.rooms.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.rooms.model.TimeZone;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * GlobalTimeZones.
 *
 */

public class GlobalTimeZones {
  @JsonProperty("timeZones")
  private java.util.List<TimeZone> timeZones = null;


  /**
   * timeZones.
   *
   * @return GlobalTimeZones
   **/
  public GlobalTimeZones timeZones(java.util.List<TimeZone> timeZones) {
    this.timeZones = timeZones;
    return this;
  }
  
  /**
   * addTimeZonesItem.
   *
   * @return GlobalTimeZones
   **/
  public GlobalTimeZones addTimeZonesItem(TimeZone timeZonesItem) {
    if (this.timeZones == null) {
      this.timeZones = new java.util.ArrayList<>();
    }
    this.timeZones.add(timeZonesItem);
    return this;
  }

  /**
   * Get timeZones.
   * @return timeZones
   **/
  @ApiModelProperty(value = "")
  public java.util.List<TimeZone> getTimeZones() {
    return timeZones;
  }

  /**
   * setTimeZones.
   **/
  public void setTimeZones(java.util.List<TimeZone> timeZones) {
    this.timeZones = timeZones;
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
    GlobalTimeZones globalTimeZones = (GlobalTimeZones) o;
    return Objects.equals(this.timeZones, globalTimeZones.timeZones);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(timeZones);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GlobalTimeZones {\n");
    
    sb.append("    timeZones: ").append(toIndentedString(timeZones)).append("\n");
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

