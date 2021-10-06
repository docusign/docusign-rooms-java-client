package com.docusign.rooms.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * OriginOfLead.
 *
 */

public class OriginOfLead {
  @JsonProperty("originOfLeadId")
  private String originOfLeadId = null;

  @JsonProperty("name")
  private String name = null;


  /**
   * originOfLeadId.
   *
   * @return OriginOfLead
   **/
  public OriginOfLead originOfLeadId(String originOfLeadId) {
    this.originOfLeadId = originOfLeadId;
    return this;
  }

  /**
   * Get originOfLeadId.
   * @return originOfLeadId
   **/
  @ApiModelProperty(value = "")
  public String getOriginOfLeadId() {
    return originOfLeadId;
  }

  /**
   * setOriginOfLeadId.
   **/
  public void setOriginOfLeadId(String originOfLeadId) {
    this.originOfLeadId = originOfLeadId;
  }


  /**
   * name.
   *
   * @return OriginOfLead
   **/
  public OriginOfLead name(String name) {
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
    OriginOfLead originOfLead = (OriginOfLead) o;
    return Objects.equals(this.originOfLeadId, originOfLead.originOfLeadId) &&
        Objects.equals(this.name, originOfLead.name);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(originOfLeadId, name);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OriginOfLead {\n");
    
    sb.append("    originOfLeadId: ").append(toIndentedString(originOfLeadId)).append("\n");
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

