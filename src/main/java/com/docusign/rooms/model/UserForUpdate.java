package com.docusign.rooms.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * UserForUpdate
 */

public class UserForUpdate {
  @JsonProperty("defaultOfficeId")
  private Integer defaultOfficeId = null;

  public UserForUpdate defaultOfficeId(Integer defaultOfficeId) {
    this.defaultOfficeId = defaultOfficeId;
    return this;
  }

   /**
   * Get defaultOfficeId
   * @return defaultOfficeId
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getDefaultOfficeId() {
    return defaultOfficeId;
  }

  public void setDefaultOfficeId(Integer defaultOfficeId) {
    this.defaultOfficeId = defaultOfficeId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserForUpdate userForUpdate = (UserForUpdate) o;
    return Objects.equals(this.defaultOfficeId, userForUpdate.defaultOfficeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultOfficeId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserForUpdate {\n");
    
    sb.append("    defaultOfficeId: ").append(toIndentedString(defaultOfficeId)).append("\n");
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

