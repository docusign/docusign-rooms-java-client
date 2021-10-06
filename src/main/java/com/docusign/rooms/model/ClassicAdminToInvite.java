package com.docusign.rooms.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ClassicAdminToInvite.
 *
 */

public class ClassicAdminToInvite {
  @JsonProperty("firstName")
  private String firstName = null;

  @JsonProperty("lastName")
  private String lastName = null;

  @JsonProperty("email")
  private String email = null;


  /**
   * firstName.
   *
   * @return ClassicAdminToInvite
   **/
  public ClassicAdminToInvite firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Get firstName.
   * @return firstName
   **/
  @ApiModelProperty(required = true, value = "")
  public String getFirstName() {
    return firstName;
  }

  /**
   * setFirstName.
   **/
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  /**
   * lastName.
   *
   * @return ClassicAdminToInvite
   **/
  public ClassicAdminToInvite lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Get lastName.
   * @return lastName
   **/
  @ApiModelProperty(required = true, value = "")
  public String getLastName() {
    return lastName;
  }

  /**
   * setLastName.
   **/
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  /**
   * email.
   *
   * @return ClassicAdminToInvite
   **/
  public ClassicAdminToInvite email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email.
   * @return email
   **/
  @ApiModelProperty(required = true, value = "")
  public String getEmail() {
    return email;
  }

  /**
   * setEmail.
   **/
  public void setEmail(String email) {
    this.email = email;
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
    ClassicAdminToInvite classicAdminToInvite = (ClassicAdminToInvite) o;
    return Objects.equals(this.firstName, classicAdminToInvite.firstName) &&
        Objects.equals(this.lastName, classicAdminToInvite.lastName) &&
        Objects.equals(this.email, classicAdminToInvite.email);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, email);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClassicAdminToInvite {\n");
    
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
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

