package com.docusign.rooms.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * RoomInviteResponse
 */

public class RoomInviteResponse {
  @JsonProperty("userId")
  private Integer userId = null;

  @JsonProperty("roomId")
  private Integer roomId = null;

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

   /**
   * Get userId
   * @return userId
  **/
  @ApiModelProperty(value = "")
  public Integer getUserId() {
    return userId;
  }

   /**
   * Get roomId
   * @return roomId
  **/
  @ApiModelProperty(value = "")
  public Integer getRoomId() {
    return roomId;
  }

   /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(value = "")
  public String getEmail() {
    return email;
  }

   /**
   * Get firstName
   * @return firstName
  **/
  @ApiModelProperty(value = "")
  public String getFirstName() {
    return firstName;
  }

   /**
   * Get lastName
   * @return lastName
  **/
  @ApiModelProperty(value = "")
  public String getLastName() {
    return lastName;
  }

   /**
   * Get transactionSideId
   * @return transactionSideId
  **/
  @ApiModelProperty(value = "")
  public String getTransactionSideId() {
    return transactionSideId;
  }

   /**
   * Get roleId
   * @return roleId
  **/
  @ApiModelProperty(value = "")
  public Integer getRoleId() {
    return roleId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoomInviteResponse roomInviteResponse = (RoomInviteResponse) o;
    return Objects.equals(this.userId, roomInviteResponse.userId) &&
        Objects.equals(this.roomId, roomInviteResponse.roomId) &&
        Objects.equals(this.email, roomInviteResponse.email) &&
        Objects.equals(this.firstName, roomInviteResponse.firstName) &&
        Objects.equals(this.lastName, roomInviteResponse.lastName) &&
        Objects.equals(this.transactionSideId, roomInviteResponse.transactionSideId) &&
        Objects.equals(this.roleId, roomInviteResponse.roleId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, roomId, email, firstName, lastName, transactionSideId, roleId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoomInviteResponse {\n");
    
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    roomId: ").append(toIndentedString(roomId)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    transactionSideId: ").append(toIndentedString(transactionSideId)).append("\n");
    sb.append("    roleId: ").append(toIndentedString(roleId)).append("\n");
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

