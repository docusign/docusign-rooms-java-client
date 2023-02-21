package com.docusign.rooms.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * UserToInvite.
 *
 */

public class UserToInvite {
  @JsonProperty("firstName")
  private String firstName = null;

  @JsonProperty("lastName")
  private String lastName = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("roleId")
  private Integer roleId = null;

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

  @JsonProperty("regions")
  private java.util.List<Integer> regions = null;

  @JsonProperty("offices")
  private java.util.List<Integer> offices = null;

  @JsonProperty("subscribeToRoomsActivityNotifications")
  private Boolean subscribeToRoomsActivityNotifications = true;

  @JsonProperty("eSignPermissionProfileId")
  private String eSignPermissionProfileId = null;

  @JsonProperty("redirectUrl")
  private String redirectUrl = null;


  /**
   * firstName.
   *
   * @return UserToInvite
   **/
  public UserToInvite firstName(String firstName) {
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
   * @return UserToInvite
   **/
  public UserToInvite lastName(String lastName) {
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
   * @return UserToInvite
   **/
  public UserToInvite email(String email) {
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
   * roleId.
   *
   * @return UserToInvite
   **/
  public UserToInvite roleId(Integer roleId) {
    this.roleId = roleId;
    return this;
  }

  /**
   * Get roleId.
   * @return roleId
   **/
  @ApiModelProperty(required = true, value = "")
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
   * accessLevel.
   *
   * @return UserToInvite
   **/
  public UserToInvite accessLevel(AccessLevelEnum accessLevel) {
    this.accessLevel = accessLevel;
    return this;
  }

  /**
   * Get accessLevel.
   * @return accessLevel
   **/
  @ApiModelProperty(required = true, value = "")
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
   * @return UserToInvite
   **/
  public UserToInvite defaultOfficeId(Integer defaultOfficeId) {
    this.defaultOfficeId = defaultOfficeId;
    return this;
  }

  /**
   * Get defaultOfficeId.
   * @return defaultOfficeId
   **/
  @ApiModelProperty(required = true, value = "")
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
   * regions.
   *
   * @return UserToInvite
   **/
  public UserToInvite regions(java.util.List<Integer> regions) {
    this.regions = regions;
    return this;
  }
  
  /**
   * addRegionsItem.
   *
   * @return UserToInvite
   **/
  public UserToInvite addRegionsItem(Integer regionsItem) {
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
   * offices.
   *
   * @return UserToInvite
   **/
  public UserToInvite offices(java.util.List<Integer> offices) {
    this.offices = offices;
    return this;
  }
  
  /**
   * addOfficesItem.
   *
   * @return UserToInvite
   **/
  public UserToInvite addOfficesItem(Integer officesItem) {
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
   * subscribeToRoomsActivityNotifications.
   *
   * @return UserToInvite
   **/
  public UserToInvite subscribeToRoomsActivityNotifications(Boolean subscribeToRoomsActivityNotifications) {
    this.subscribeToRoomsActivityNotifications = subscribeToRoomsActivityNotifications;
    return this;
  }

  /**
   * Get subscribeToRoomsActivityNotifications.
   * @return subscribeToRoomsActivityNotifications
   **/
  @ApiModelProperty(value = "")
  public Boolean isSubscribeToRoomsActivityNotifications() {
    return subscribeToRoomsActivityNotifications;
  }

  /**
   * setSubscribeToRoomsActivityNotifications.
   **/
  public void setSubscribeToRoomsActivityNotifications(Boolean subscribeToRoomsActivityNotifications) {
    this.subscribeToRoomsActivityNotifications = subscribeToRoomsActivityNotifications;
  }


  /**
   * eSignPermissionProfileId.
   *
   * @return UserToInvite
   **/
  public UserToInvite eSignPermissionProfileId(String eSignPermissionProfileId) {
    this.eSignPermissionProfileId = eSignPermissionProfileId;
    return this;
  }

  /**
   * Get eSignPermissionProfileId.
   * @return eSignPermissionProfileId
   **/
  @ApiModelProperty(required = true, value = "")
  public String getESignPermissionProfileId() {
    return eSignPermissionProfileId;
  }

  /**
   * setESignPermissionProfileId.
   **/
  public void setESignPermissionProfileId(String eSignPermissionProfileId) {
    this.eSignPermissionProfileId = eSignPermissionProfileId;
  }


  /**
   * redirectUrl.
   *
   * @return UserToInvite
   **/
  public UserToInvite redirectUrl(String redirectUrl) {
    this.redirectUrl = redirectUrl;
    return this;
  }

  /**
   * Get redirectUrl.
   * @return redirectUrl
   **/
  @ApiModelProperty(value = "")
  public String getRedirectUrl() {
    return redirectUrl;
  }

  /**
   * setRedirectUrl.
   **/
  public void setRedirectUrl(String redirectUrl) {
    this.redirectUrl = redirectUrl;
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
    UserToInvite userToInvite = (UserToInvite) o;
    return Objects.equals(this.firstName, userToInvite.firstName) &&
        Objects.equals(this.lastName, userToInvite.lastName) &&
        Objects.equals(this.email, userToInvite.email) &&
        Objects.equals(this.roleId, userToInvite.roleId) &&
        Objects.equals(this.accessLevel, userToInvite.accessLevel) &&
        Objects.equals(this.defaultOfficeId, userToInvite.defaultOfficeId) &&
        Objects.equals(this.regions, userToInvite.regions) &&
        Objects.equals(this.offices, userToInvite.offices) &&
        Objects.equals(this.subscribeToRoomsActivityNotifications, userToInvite.subscribeToRoomsActivityNotifications) &&
        Objects.equals(this.eSignPermissionProfileId, userToInvite.eSignPermissionProfileId) &&
        Objects.equals(this.redirectUrl, userToInvite.redirectUrl);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, email, roleId, accessLevel, defaultOfficeId, regions, offices, subscribeToRoomsActivityNotifications, eSignPermissionProfileId, redirectUrl);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserToInvite {\n");
    
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    roleId: ").append(toIndentedString(roleId)).append("\n");
    sb.append("    accessLevel: ").append(toIndentedString(accessLevel)).append("\n");
    sb.append("    defaultOfficeId: ").append(toIndentedString(defaultOfficeId)).append("\n");
    sb.append("    regions: ").append(toIndentedString(regions)).append("\n");
    sb.append("    offices: ").append(toIndentedString(offices)).append("\n");
    sb.append("    subscribeToRoomsActivityNotifications: ").append(toIndentedString(subscribeToRoomsActivityNotifications)).append("\n");
    sb.append("    eSignPermissionProfileId: ").append(toIndentedString(eSignPermissionProfileId)).append("\n");
    sb.append("    redirectUrl: ").append(toIndentedString(redirectUrl)).append("\n");
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

