package com.docusign.rooms.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.rooms.model.ClassicManagerPermissions;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * User.
 *
 */

public class User {
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

  /**
   * Gets or Sets accessLevel
   */
  public enum AccessLevelEnum {
    CONTRIBUTOR("Contributor"),
    
    OFFICE("Office"),
    
    REGION("Region"),
    
    COMPANY("Company"),
    
    ADMIN("Admin");

    private String value;

    AccessLevelEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static AccessLevelEnum fromValue(String value) {
      for (AccessLevelEnum b : AccessLevelEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("accessLevel")
  private AccessLevelEnum accessLevel = null;

  @JsonProperty("defaultOfficeId")
  private Integer defaultOfficeId = null;

  @JsonProperty("titleId")
  private Integer titleId = null;

  @JsonProperty("roleId")
  private Integer roleId = null;

  @JsonProperty("profileImageUrl")
  private String profileImageUrl = null;

  @JsonProperty("offices")
  private java.util.List<Integer> offices = null;

  @JsonProperty("regions")
  private java.util.List<Integer> regions = null;

  @JsonProperty("permissions")
  private ClassicManagerPermissions permissions = null;


  /**
   * userId.
   *
   * @return User
   **/
  public User userId(Integer userId) {
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
   * @return User
   **/
  public User email(String email) {
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
   * @return User
   **/
  public User firstName(String firstName) {
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
   * @return User
   **/
  public User lastName(String lastName) {
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
   * isLockedOut.
   *
   * @return User
   **/
  public User isLockedOut(Boolean isLockedOut) {
    this.isLockedOut = isLockedOut;
    return this;
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
   * setIsLockedOut.
   **/
  public void setIsLockedOut(Boolean isLockedOut) {
    this.isLockedOut = isLockedOut;
  }


  /**
   * status.
   *
   * @return User
   **/
  public User status(String status) {
    this.status = status;
    return this;
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
   * setStatus.
   **/
  public void setStatus(String status) {
    this.status = status;
  }


  /**
   * accessLevel.
   *
   * @return User
   **/
  public User accessLevel(AccessLevelEnum accessLevel) {
    this.accessLevel = accessLevel;
    return this;
  }

  /**
   * Get accessLevel.
   * @return accessLevel
   **/
  @ApiModelProperty(value = "")
  public AccessLevelEnum getAccessLevel() {
    return accessLevel;
  }

  /**
   * setAccessLevel.
   **/
  public void setAccessLevel(AccessLevelEnum accessLevel) {
    this.accessLevel = accessLevel;
  }


  /**
   * defaultOfficeId.
   *
   * @return User
   **/
  public User defaultOfficeId(Integer defaultOfficeId) {
    this.defaultOfficeId = defaultOfficeId;
    return this;
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
   * setDefaultOfficeId.
   **/
  public void setDefaultOfficeId(Integer defaultOfficeId) {
    this.defaultOfficeId = defaultOfficeId;
  }


  /**
   * titleId.
   *
   * @return User
   **/
  public User titleId(Integer titleId) {
    this.titleId = titleId;
    return this;
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
   * setTitleId.
   **/
  public void setTitleId(Integer titleId) {
    this.titleId = titleId;
  }


  /**
   * roleId.
   *
   * @return User
   **/
  public User roleId(Integer roleId) {
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
   * profileImageUrl.
   *
   * @return User
   **/
  public User profileImageUrl(String profileImageUrl) {
    this.profileImageUrl = profileImageUrl;
    return this;
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
   * setProfileImageUrl.
   **/
  public void setProfileImageUrl(String profileImageUrl) {
    this.profileImageUrl = profileImageUrl;
  }


  /**
   * offices.
   *
   * @return User
   **/
  public User offices(java.util.List<Integer> offices) {
    this.offices = offices;
    return this;
  }
  
  /**
   * addOfficesItem.
   *
   * @return User
   **/
  public User addOfficesItem(Integer officesItem) {
    if (this.offices == null) {
      this.offices = new java.util.ArrayList<>();
    }
    this.offices.add(officesItem);
    return this;
  }

  /**
   * Get offices.
   * @return offices
   **/
  @ApiModelProperty(value = "")
  public java.util.List<Integer> getOffices() {
    return offices;
  }

  /**
   * setOffices.
   **/
  public void setOffices(java.util.List<Integer> offices) {
    this.offices = offices;
  }


  /**
   * regions.
   *
   * @return User
   **/
  public User regions(java.util.List<Integer> regions) {
    this.regions = regions;
    return this;
  }
  
  /**
   * addRegionsItem.
   *
   * @return User
   **/
  public User addRegionsItem(Integer regionsItem) {
    if (this.regions == null) {
      this.regions = new java.util.ArrayList<>();
    }
    this.regions.add(regionsItem);
    return this;
  }

  /**
   * Get regions.
   * @return regions
   **/
  @ApiModelProperty(value = "")
  public java.util.List<Integer> getRegions() {
    return regions;
  }

  /**
   * setRegions.
   **/
  public void setRegions(java.util.List<Integer> regions) {
    this.regions = regions;
  }


  /**
   * permissions.
   *
   * @return User
   **/
  public User permissions(ClassicManagerPermissions permissions) {
    this.permissions = permissions;
    return this;
  }

  /**
   * Get permissions.
   * @return permissions
   **/
  @ApiModelProperty(value = "")
  public ClassicManagerPermissions getPermissions() {
    return permissions;
  }

  /**
   * setPermissions.
   **/
  public void setPermissions(ClassicManagerPermissions permissions) {
    this.permissions = permissions;
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
    User user = (User) o;
    return Objects.equals(this.userId, user.userId) &&
        Objects.equals(this.email, user.email) &&
        Objects.equals(this.firstName, user.firstName) &&
        Objects.equals(this.lastName, user.lastName) &&
        Objects.equals(this.isLockedOut, user.isLockedOut) &&
        Objects.equals(this.status, user.status) &&
        Objects.equals(this.accessLevel, user.accessLevel) &&
        Objects.equals(this.defaultOfficeId, user.defaultOfficeId) &&
        Objects.equals(this.titleId, user.titleId) &&
        Objects.equals(this.roleId, user.roleId) &&
        Objects.equals(this.profileImageUrl, user.profileImageUrl) &&
        Objects.equals(this.offices, user.offices) &&
        Objects.equals(this.regions, user.regions) &&
        Objects.equals(this.permissions, user.permissions);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(userId, email, firstName, lastName, isLockedOut, status, accessLevel, defaultOfficeId, titleId, roleId, profileImageUrl, offices, regions, permissions);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    
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
    sb.append("    offices: ").append(toIndentedString(offices)).append("\n");
    sb.append("    regions: ").append(toIndentedString(regions)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
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

