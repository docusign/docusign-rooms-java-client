package com.docusign.rooms.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * ContactSide.
 *
 */

public class ContactSide {
  @JsonProperty("contactSideId")
  private String contactSideId = null;

  @JsonProperty("name")
  private String name = null;


  /**
   * contactSideId.
   *
   * @return ContactSide
   **/
  public ContactSide contactSideId(String contactSideId) {
    this.contactSideId = contactSideId;
    return this;
  }

  /**
   * Get contactSideId.
   * @return contactSideId
   **/
  @Schema(description = "")
  public String getContactSideId() {
    return contactSideId;
  }

  /**
   * setContactSideId.
   **/
  public void setContactSideId(String contactSideId) {
    this.contactSideId = contactSideId;
  }


  /**
   * name.
   *
   * @return ContactSide
   **/
  public ContactSide name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name.
   * @return name
   **/
  @Schema(description = "")
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
    ContactSide contactSide = (ContactSide) o;
    return Objects.equals(this.contactSideId, contactSide.contactSideId) &&
        Objects.equals(this.name, contactSide.name);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(contactSideId, name);
  }


  /**
   * Converts the given object to string.
   */
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

