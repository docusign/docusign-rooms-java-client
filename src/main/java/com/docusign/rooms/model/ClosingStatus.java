package com.docusign.rooms.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ClosingStatus
 */

public class ClosingStatus {
  @JsonProperty("closingStatusId")
  private String closingStatusId = null;

  @JsonProperty("name")
  private String name = null;

  public ClosingStatus closingStatusId(String closingStatusId) {
    this.closingStatusId = closingStatusId;
    return this;
  }

   /**
   * Get closingStatusId
   * @return closingStatusId
  **/
  @ApiModelProperty(value = "")
  public String getClosingStatusId() {
    return closingStatusId;
  }

  public void setClosingStatusId(String closingStatusId) {
    this.closingStatusId = closingStatusId;
  }

  public ClosingStatus name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClosingStatus closingStatus = (ClosingStatus) o;
    return Objects.equals(this.closingStatusId, closingStatus.closingStatusId) &&
        Objects.equals(this.name, closingStatus.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(closingStatusId, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClosingStatus {\n");
    
    sb.append("    closingStatusId: ").append(toIndentedString(closingStatusId)).append("\n");
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

