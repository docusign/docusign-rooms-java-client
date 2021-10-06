package com.docusign.rooms.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.rooms.model.ActivityType;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * GlobalActivityTypes.
 *
 */

public class GlobalActivityTypes {
  @JsonProperty("activityTypes")
  private java.util.List<ActivityType> activityTypes = null;


  /**
   * activityTypes.
   *
   * @return GlobalActivityTypes
   **/
  public GlobalActivityTypes activityTypes(java.util.List<ActivityType> activityTypes) {
    this.activityTypes = activityTypes;
    return this;
  }
  
  /**
   * addActivityTypesItem.
   *
   * @return GlobalActivityTypes
   **/
  public GlobalActivityTypes addActivityTypesItem(ActivityType activityTypesItem) {
    if (this.activityTypes == null) {
      this.activityTypes = new java.util.ArrayList<ActivityType>();
    }
    this.activityTypes.add(activityTypesItem);
    return this;
  }

  /**
   * Get activityTypes.
   * @return activityTypes
   **/
  @ApiModelProperty(value = "")
  public java.util.List<ActivityType> getActivityTypes() {
    return activityTypes;
  }

  /**
   * setActivityTypes.
   **/
  public void setActivityTypes(java.util.List<ActivityType> activityTypes) {
    this.activityTypes = activityTypes;
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
    GlobalActivityTypes globalActivityTypes = (GlobalActivityTypes) o;
    return Objects.equals(this.activityTypes, globalActivityTypes.activityTypes);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(activityTypes);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GlobalActivityTypes {\n");
    
    sb.append("    activityTypes: ").append(toIndentedString(activityTypes)).append("\n");
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

