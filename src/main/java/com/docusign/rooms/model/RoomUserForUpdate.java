package com.docusign.rooms.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * RoomUserForUpdate.
 *
 */

public class RoomUserForUpdate {
  @JsonProperty("roleId")
  private Integer roleId = null;

  @JsonProperty("transactionSideId")
  private String transactionSideId = null;


  /**
   * roleId.
   *
   * @return RoomUserForUpdate
   **/
  public RoomUserForUpdate roleId(Integer roleId) {
    this.roleId = roleId;
    return this;
  }

  /**
   * Get roleId.
   * @return roleId
   **/
  @Schema(description = "")
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
   * @return RoomUserForUpdate
   **/
  public RoomUserForUpdate transactionSideId(String transactionSideId) {
    this.transactionSideId = transactionSideId;
    return this;
  }

  /**
   * Get transactionSideId.
   * @return transactionSideId
   **/
  @Schema(description = "")
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
    RoomUserForUpdate roomUserForUpdate = (RoomUserForUpdate) o;
    return Objects.equals(this.roleId, roomUserForUpdate.roleId) &&
        Objects.equals(this.transactionSideId, roomUserForUpdate.transactionSideId);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(roleId, transactionSideId);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoomUserForUpdate {\n");
    
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

