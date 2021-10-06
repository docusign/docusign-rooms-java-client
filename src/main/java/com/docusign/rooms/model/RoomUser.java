package com.docusign.rooms.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * RoomUser.
 *
 */

public class RoomUser {
  @JsonProperty("userId")
  private Integer userId = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("firstName")
  private String firstName = null;

  @JsonProperty("lastName")
  private String lastName = null;

  @JsonProperty("transactionSideId")
  private String transactionSideId = null;

  @JsonProperty("roleId")
  private Integer roleId = null;

  @JsonProperty("isRevoked")
  private Boolean isRevoked = null;

  @JsonProperty("invitedByUserId")
  private Integer invitedByUserId = null;


  /**
   * userId.
   *
   * @return RoomUser
   **/
  public RoomUser userId(Integer userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId.
   * @return userId
   **/
  @ApiModelProperty(value = "")
  public Integer getUserId() {
    return userId;
  }

  /**
   * setUserId.
   **/
  public void setUserId(Integer userId) {
    this.userId = userId;
  }


  /**
   * email.
   *
   * @return RoomUser
   **/
  public RoomUser email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email.
   * @return email
   **/
  @ApiModelProperty(value = "")
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
   * @return RoomUser
   **/
  public RoomUser firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Get firstName.
   * @return firstName
   **/
  @ApiModelProperty(value = "")
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
   * @return RoomUser
   **/
  public RoomUser lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Get lastName.
   * @return lastName
   **/
  @ApiModelProperty(value = "")
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
   * transactionSideId.
   *
   * @return RoomUser
   **/
  public RoomUser transactionSideId(String transactionSideId) {
    this.transactionSideId = transactionSideId;
    return this;
  }

  /**
   * Get transactionSideId.
   * @return transactionSideId
   **/
  @ApiModelProperty(value = "")
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
   * roleId.
   *
   * @return RoomUser
   **/
  public RoomUser roleId(Integer roleId) {
    this.roleId = roleId;
    return this;
  }

  /**
   * Get roleId.
   * @return roleId
   **/
  @ApiModelProperty(value = "")
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
   * isRevoked.
   *
   * @return RoomUser
   **/
  public RoomUser isRevoked(Boolean isRevoked) {
    this.isRevoked = isRevoked;
    return this;
  }

  /**
   * Get isRevoked.
   * @return isRevoked
   **/
  @ApiModelProperty(value = "")
  public Boolean isIsRevoked() {
    return isRevoked;
  }

  /**
   * setIsRevoked.
   **/
  public void setIsRevoked(Boolean isRevoked) {
    this.isRevoked = isRevoked;
  }


  /**
   * invitedByUserId.
   *
   * @return RoomUser
   **/
  public RoomUser invitedByUserId(Integer invitedByUserId) {
    this.invitedByUserId = invitedByUserId;
    return this;
  }

  /**
   * Get invitedByUserId.
   * @return invitedByUserId
   **/
  @ApiModelProperty(value = "")
  public Integer getInvitedByUserId() {
    return invitedByUserId;
  }

  /**
   * setInvitedByUserId.
   **/
  public void setInvitedByUserId(Integer invitedByUserId) {
    this.invitedByUserId = invitedByUserId;
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
    RoomUser roomUser = (RoomUser) o;
    return Objects.equals(this.userId, roomUser.userId) &&
        Objects.equals(this.email, roomUser.email) &&
        Objects.equals(this.firstName, roomUser.firstName) &&
        Objects.equals(this.lastName, roomUser.lastName) &&
        Objects.equals(this.transactionSideId, roomUser.transactionSideId) &&
        Objects.equals(this.roleId, roomUser.roleId) &&
        Objects.equals(this.isRevoked, roomUser.isRevoked) &&
        Objects.equals(this.invitedByUserId, roomUser.invitedByUserId);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(userId, email, firstName, lastName, transactionSideId, roleId, isRevoked, invitedByUserId);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoomUser {\n");
    
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    transactionSideId: ").append(toIndentedString(transactionSideId)).append("\n");
    sb.append("    roleId: ").append(toIndentedString(roleId)).append("\n");
    sb.append("    isRevoked: ").append(toIndentedString(isRevoked)).append("\n");
    sb.append("    invitedByUserId: ").append(toIndentedString(invitedByUserId)).append("\n");
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

