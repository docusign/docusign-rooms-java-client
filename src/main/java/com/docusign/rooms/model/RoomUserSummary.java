package com.docusign.rooms.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * RoomUserSummary
 */

public class RoomUserSummary {
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

  @JsonProperty("titleId")
  private Integer titleId = null;

   /**
   * Get userId
   * @return userId
  **/
  @ApiModelProperty(value = "")
  public Integer getUserId() {
    return userId;
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

   /**
   * Get titleId
   * @return titleId
  **/
  @ApiModelProperty(value = "")
  public Integer getTitleId() {
    return titleId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoomUserSummary roomUserSummary = (RoomUserSummary) o;
    return Objects.equals(this.userId, roomUserSummary.userId) &&
        Objects.equals(this.email, roomUserSummary.email) &&
        Objects.equals(this.firstName, roomUserSummary.firstName) &&
        Objects.equals(this.lastName, roomUserSummary.lastName) &&
        Objects.equals(this.transactionSideId, roomUserSummary.transactionSideId) &&
        Objects.equals(this.roleId, roomUserSummary.roleId) &&
        Objects.equals(this.titleId, roomUserSummary.titleId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, email, firstName, lastName, transactionSideId, roleId, titleId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoomUserSummary {\n");
    
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    transactionSideId: ").append(toIndentedString(transactionSideId)).append("\n");
    sb.append("    roleId: ").append(toIndentedString(roleId)).append("\n");
    sb.append("    titleId: ").append(toIndentedString(titleId)).append("\n");
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

