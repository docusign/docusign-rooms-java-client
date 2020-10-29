package com.docusign.rooms.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * DependsOn
 */

public class DependsOn {
  @JsonProperty("actionType")
  private String actionType = null;

  @JsonProperty("parentApiName")
  private String parentApiName = null;

   /**
   * Get actionType
   * @return actionType
  **/
  @ApiModelProperty(value = "")
  public String getActionType() {
    return actionType;
  }

   /**
   * Get parentApiName
   * @return parentApiName
  **/
  @ApiModelProperty(value = "")
  public String getParentApiName() {
    return parentApiName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DependsOn dependsOn = (DependsOn) o;
    return Objects.equals(this.actionType, dependsOn.actionType) &&
        Objects.equals(this.parentApiName, dependsOn.parentApiName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionType, parentApiName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DependsOn {\n");
    
    sb.append("    actionType: ").append(toIndentedString(actionType)).append("\n");
    sb.append("    parentApiName: ").append(toIndentedString(parentApiName)).append("\n");
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

