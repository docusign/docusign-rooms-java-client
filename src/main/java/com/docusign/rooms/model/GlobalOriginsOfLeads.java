package com.docusign.rooms.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.rooms.model.OriginOfLead;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * GlobalOriginsOfLeads.
 *
 */

public class GlobalOriginsOfLeads {
  @JsonProperty("originsOfLeads")
  private java.util.List<OriginOfLead> originsOfLeads = null;


  /**
   * originsOfLeads.
   *
   * @return GlobalOriginsOfLeads
   **/
  public GlobalOriginsOfLeads originsOfLeads(java.util.List<OriginOfLead> originsOfLeads) {
    this.originsOfLeads = originsOfLeads;
    return this;
  }
  
  /**
   * addOriginsOfLeadsItem.
   *
   * @return GlobalOriginsOfLeads
   **/
  public GlobalOriginsOfLeads addOriginsOfLeadsItem(OriginOfLead originsOfLeadsItem) {
    if (this.originsOfLeads == null) {
      this.originsOfLeads = new java.util.ArrayList<>();
    }
    this.originsOfLeads.add(originsOfLeadsItem);
    return this;
  }

  /**
   * Get originsOfLeads.
   * @return originsOfLeads
   **/
  @Schema(description = "")
  public java.util.List<OriginOfLead> getOriginsOfLeads() {
    return originsOfLeads;
  }

  /**
   * setOriginsOfLeads.
   **/
  public void setOriginsOfLeads(java.util.List<OriginOfLead> originsOfLeads) {
    this.originsOfLeads = originsOfLeads;
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
    GlobalOriginsOfLeads globalOriginsOfLeads = (GlobalOriginsOfLeads) o;
    return Objects.equals(this.originsOfLeads, globalOriginsOfLeads.originsOfLeads);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(originsOfLeads);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GlobalOriginsOfLeads {\n");
    
    sb.append("    originsOfLeads: ").append(toIndentedString(originsOfLeads)).append("\n");
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

