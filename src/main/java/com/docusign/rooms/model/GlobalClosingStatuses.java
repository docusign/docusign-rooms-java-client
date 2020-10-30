package com.docusign.rooms.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.rooms.model.ClosingStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * GlobalClosingStatuses
 */

public class GlobalClosingStatuses {
  @JsonProperty("closingStatuses")
  private java.util.List<ClosingStatus> closingStatuses = null;

  public GlobalClosingStatuses closingStatuses(java.util.List<ClosingStatus> closingStatuses) {
    this.closingStatuses = closingStatuses;
    return this;
  }

  public GlobalClosingStatuses addClosingStatusesItem(ClosingStatus closingStatusesItem) {
    if (this.closingStatuses == null) {
      this.closingStatuses = new java.util.ArrayList<ClosingStatus>();
    }
    this.closingStatuses.add(closingStatusesItem);
    return this;
  }

   /**
   * Get closingStatuses
   * @return closingStatuses
  **/
  @ApiModelProperty(value = "")
  public java.util.List<ClosingStatus> getClosingStatuses() {
    return closingStatuses;
  }

  public void setClosingStatuses(java.util.List<ClosingStatus> closingStatuses) {
    this.closingStatuses = closingStatuses;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GlobalClosingStatuses globalClosingStatuses = (GlobalClosingStatuses) o;
    return Objects.equals(this.closingStatuses, globalClosingStatuses.closingStatuses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(closingStatuses);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GlobalClosingStatuses {\n");
    
    sb.append("    closingStatuses: ").append(toIndentedString(closingStatuses)).append("\n");
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

