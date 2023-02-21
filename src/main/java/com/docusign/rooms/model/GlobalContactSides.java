package com.docusign.rooms.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.rooms.model.ContactSide;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * GlobalContactSides.
 *
 */

public class GlobalContactSides {
  @JsonProperty("contactSides")
  private java.util.List<ContactSide> contactSides = null;


  /**
   * contactSides.
   *
   * @return GlobalContactSides
   **/
  public GlobalContactSides contactSides(java.util.List<ContactSide> contactSides) {
    this.contactSides = contactSides;
    return this;
  }
  
  /**
   * addContactSidesItem.
   *
   * @return GlobalContactSides
   **/
  public GlobalContactSides addContactSidesItem(ContactSide contactSidesItem) {
    if (this.contactSides == null) {
      this.contactSides = new java.util.ArrayList<>();
    }
    this.contactSides.add(contactSidesItem);
    return this;
  }

  /**
   * Get contactSides.
   * @return contactSides
   **/
  @ApiModelProperty(value = "")
  public java.util.List<ContactSide> getContactSides() {
    return contactSides;
  }

  /**
   * setContactSides.
   **/
  public void setContactSides(java.util.List<ContactSide> contactSides) {
    this.contactSides = contactSides;
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
    GlobalContactSides globalContactSides = (GlobalContactSides) o;
    return Objects.equals(this.contactSides, globalContactSides.contactSides);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(contactSides);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GlobalContactSides {\n");
    
    sb.append("    contactSides: ").append(toIndentedString(contactSides)).append("\n");
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

