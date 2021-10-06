package com.docusign.rooms.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.rooms.model.AccessLevel;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * UserSummary.
 *
 */

public class UserSummary {
  @JsonProperty("userId")
  private Integer userId = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("firstName")
  private String firstName = null;

  @JsonProperty("lastName")
  private String lastName = null;

  @JsonProperty("isLockedOut")
  private Boolean isLockedOut = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("accessLevel")
  private AccessLevel accessLevel = null;

  @JsonProperty("defaultOfficeId")
  private Integer defaultOfficeId = null;

  @JsonProperty("titleId")
  private Integer titleId = null;

  @JsonProperty("roleId")
  private Integer roleId = null;

  @JsonProperty("profileImageUrl")
  private String profileImageUrl = null;

  /**
   * Get userId.
   * @return userId
   **/
  @ApiModelProperty(value = "")
  public Integer getUserId() {
    return userId;
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
   * Get firstName.
   * @return firstName
   **/
  @ApiModelProperty(value = "")
  public String getFirstName() {
    return firstName;
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
   * Get isLockedOut.
   * @return isLockedOut
   **/
  @ApiModelProperty(value = "")
  public Boolean isIsLockedOut() {
    return isLockedOut;
  }

  /**
   * Get status.
   * @return status
   **/
  @ApiModelProperty(value = "")
  public String getStatus() {
    return status;
  }


  /**
   * accessLevel.
   *
   * @return UserSummary
   **/
  public UserSummary accessLevel(AccessLevel accessLevel) {
    this.accessLevel = accessLevel;
    return this;
  }

  /**
   * Get accessLevel.
   * @return accessLevel
   **/
  @ApiModelProperty(value = "")
  public AccessLevel getAccessLevel() {
    return accessLevel;
  }

  /**
   * setAccessLevel.
   **/
  public void setAccessLevel(AccessLevel accessLevel) {
    this.accessLevel = accessLevel;
  }

  /**
   * Get defaultOfficeId.
   * @return defaultOfficeId
   **/
  @ApiModelProperty(value = "")
  public Integer getDefaultOfficeId() {
    return defaultOfficeId;
  }

  /**
   * Get titleId.
   * @return titleId
   **/
  @ApiModelProperty(value = "")
  public Integer getTitleId() {
    return titleId;
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
   * Get profileImageUrl.
   * @return profileImageUrl
   **/
  @ApiModelProperty(value = "")
  public String getProfileImageUrl() {
    return profileImageUrl;
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
    UserSummary userSummary = (UserSummary) o;
    return Objects.equals(this.userId, userSummary.userId) &&
        Objects.equals(this.email, userSummary.email) &&
        Objects.equals(this.firstName, userSummary.firstName) &&
        Objects.equals(this.lastName, userSummary.lastName) &&
        Objects.equals(this.isLockedOut, userSummary.isLockedOut) &&
        Objects.equals(this.status, userSummary.status) &&
        Objects.equals(this.accessLevel, userSummary.accessLevel) &&
        Objects.equals(this.defaultOfficeId, userSummary.defaultOfficeId) &&
        Objects.equals(this.titleId, userSummary.titleId) &&
        Objects.equals(this.roleId, userSummary.roleId) &&
        Objects.equals(this.profileImageUrl, userSummary.profileImageUrl);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(userId, email, firstName, lastName, isLockedOut, status, accessLevel, defaultOfficeId, titleId, roleId, profileImageUrl);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserSummary {\n");
    
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    isLockedOut: ").append(toIndentedString(isLockedOut)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    accessLevel: ").append(toIndentedString(accessLevel)).append("\n");
    sb.append("    defaultOfficeId: ").append(toIndentedString(defaultOfficeId)).append("\n");
    sb.append("    titleId: ").append(toIndentedString(titleId)).append("\n");
    sb.append("    roleId: ").append(toIndentedString(roleId)).append("\n");
    sb.append("    profileImageUrl: ").append(toIndentedString(profileImageUrl)).append("\n");
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

