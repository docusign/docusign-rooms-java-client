package com.docusign.rooms.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.rooms.model.ClosingStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * GlobalClosingStatuses.
 *
 */

public class GlobalClosingStatuses {
  @JsonProperty("closingStatuses")
  private java.util.List<ClosingStatus> closingStatuses = null;


  /**
   * closingStatuses.
   *
   * @return GlobalClosingStatuses
   **/
  public GlobalClosingStatuses closingStatuses(java.util.List<ClosingStatus> closingStatuses) {
    this.closingStatuses = closingStatuses;
    return this;
  }
  
  /**
   * addClosingStatusesItem.
   *
   * @return GlobalClosingStatuses
   **/
  public GlobalClosingStatuses addClosingStatusesItem(ClosingStatus closingStatusesItem) {
    if (this.closingStatuses == null) {
      this.closingStatuses = new java.util.ArrayList<>();
    }
    this.closingStatuses.add(closingStatusesItem);
    return this;
  }

  /**
   * Get closingStatuses.
   * @return closingStatuses
   **/
  @Schema(description = "")
  public java.util.List<ClosingStatus> getClosingStatuses() {
    return closingStatuses;
  }

  /**
   * setClosingStatuses.
   **/
  public void setClosingStatuses(java.util.List<ClosingStatus> closingStatuses) {
    this.closingStatuses = closingStatuses;
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
    GlobalClosingStatuses globalClosingStatuses = (GlobalClosingStatuses) o;
    return Objects.equals(this.closingStatuses, globalClosingStatuses.closingStatuses);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(closingStatuses);
  }


  /**
   * Converts the given object to string.
   */
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

