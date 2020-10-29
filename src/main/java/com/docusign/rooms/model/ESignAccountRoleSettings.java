package com.docusign.rooms.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ESignAccountRoleSettings
 */

public class ESignAccountRoleSettings {
  @JsonProperty("allowAccountManagement")
  private Boolean allowAccountManagement = null;

  public ESignAccountRoleSettings allowAccountManagement(Boolean allowAccountManagement) {
    this.allowAccountManagement = allowAccountManagement;
    return this;
  }

   /**
   * Get allowAccountManagement
   * @return allowAccountManagement
  **/
  @ApiModelProperty(value = "")
  public Boolean isAllowAccountManagement() {
    return allowAccountManagement;
  }

  public void setAllowAccountManagement(Boolean allowAccountManagement) {
    this.allowAccountManagement = allowAccountManagement;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ESignAccountRoleSettings esignAccountRoleSettings = (ESignAccountRoleSettings) o;
    return Objects.equals(this.allowAccountManagement, esignAccountRoleSettings.allowAccountManagement);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowAccountManagement);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ESignAccountRoleSettings {\n");
    
    sb.append("    allowAccountManagement: ").append(toIndentedString(allowAccountManagement)).append("\n");
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

