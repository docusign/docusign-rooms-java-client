package com.docusign.rooms.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ContactSide
 */

public class ContactSide {
  @JsonProperty("contactSideId")
  private String contactSideId = null;

  @JsonProperty("name")
  private String name = null;

  public ContactSide contactSideId(String contactSideId) {
    this.contactSideId = contactSideId;
    return this;
  }

   /**
   * Get contactSideId
   * @return contactSideId
  **/
  @ApiModelProperty(value = "")
  public String getContactSideId() {
    return contactSideId;
  }

  public void setContactSideId(String contactSideId) {
    this.contactSideId = contactSideId;
  }

  public ContactSide name(String name) {
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
    ContactSide contactSide = (ContactSide) o;
    return Objects.equals(this.contactSideId, contactSide.contactSideId) &&
        Objects.equals(this.name, contactSide.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contactSideId, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactSide {\n");
    
    sb.append("    contactSideId: ").append(toIndentedString(contactSideId)).append("\n");
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

