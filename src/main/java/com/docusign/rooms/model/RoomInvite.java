package com.docusign.rooms.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * RoomInvite.
 *
 */

public class RoomInvite {
  @JsonProperty("email")
  private String email = null;

  @JsonProperty("firstName")
  private String firstName = null;

  @JsonProperty("lastName")
  private String lastName = null;

  @JsonProperty("roleId")
  private Integer roleId = null;

  @JsonProperty("transactionSideId")
  private String transactionSideId = null;


  /**
   * email.
   *
   * @return RoomInvite
   **/
  public RoomInvite email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email.
   * @return email
   **/
  @Schema(required = true, description = "")
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
   * firstName.
   *
   * @return RoomInvite
   **/
  public RoomInvite firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Get firstName.
   * @return firstName
   **/
  @Schema(required = true, description = "")
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
   * @return RoomInvite
   **/
  public RoomInvite lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Get lastName.
   * @return lastName
   **/
  @Schema(required = true, description = "")
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
   * roleId.
   *
   * @return RoomInvite
   **/
  public RoomInvite roleId(Integer roleId) {
    this.roleId = roleId;
    return this;
  }

  /**
   * Get roleId.
   * @return roleId
   **/
  @Schema(required = true, description = "")
  public Integer getRoleId() {
    return roleId;
  }

  /**
   * setRoleId.
   **/
  public void setRoleId(Integer roleId) {
    this.roleId = roleId;
  }


  /**
   * transactionSideId.
   *
   * @return RoomInvite
   **/
  public RoomInvite transactionSideId(String transactionSideId) {
    this.transactionSideId = transactionSideId;
    return this;
  }

  /**
   * Required for a real estate company; otherwise ignored..
   * @return transactionSideId
   **/
  @Schema(description = "Required for a real estate company; otherwise ignored.")
  public String getTransactionSideId() {
    return transactionSideId;
  }

  /**
   * setTransactionSideId.
   **/
  public void setTransactionSideId(String transactionSideId) {
    this.transactionSideId = transactionSideId;
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
    RoomInvite roomInvite = (RoomInvite) o;
    return Objects.equals(this.email, roomInvite.email) &&
        Objects.equals(this.firstName, roomInvite.firstName) &&
        Objects.equals(this.lastName, roomInvite.lastName) &&
        Objects.equals(this.roleId, roomInvite.roleId) &&
        Objects.equals(this.transactionSideId, roomInvite.transactionSideId);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(email, firstName, lastName, roleId, transactionSideId);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoomInvite {\n");
    
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    roleId: ").append(toIndentedString(roleId)).append("\n");
    sb.append("    transactionSideId: ").append(toIndentedString(transactionSideId)).append("\n");
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

