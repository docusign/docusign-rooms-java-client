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
 * UserToInvite
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

  @JsonProperty("accessLevel")
  private AccessLevel accessLevel = null;

  @JsonProperty("defaultOfficeId")
  private Integer defaultOfficeId = null;

  @JsonProperty("regions")
  private java.util.List<Integer> regions = null;

  @JsonProperty("offices")
  private java.util.List<Integer> offices = null;

  @JsonProperty("eSignPermissionProfileId")
  private String eSignPermissionProfileId = null;

  @JsonProperty("redirectUrl")
  private String redirectUrl = null;

  public UserToInvite firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * Get firstName
   * @return firstName
  **/
  @ApiModelProperty(required = true, value = "")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public UserToInvite lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * Get lastName
   * @return lastName
  **/
  @ApiModelProperty(required = true, value = "")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public UserToInvite email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(required = true, value = "")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public UserToInvite roleId(Integer roleId) {
    this.roleId = roleId;
    return this;
  }

   /**
   * Get roleId
   * @return roleId
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getRoleId() {
    return roleId;
  }

  public void setRoleId(Integer roleId) {
    this.roleId = roleId;
  }

  public UserToInvite accessLevel(AccessLevel accessLevel) {
    this.accessLevel = accessLevel;
    return this;
  }

   /**
   * Get accessLevel
   * @return accessLevel
  **/
  @ApiModelProperty(required = true, value = "")
  public AccessLevel getAccessLevel() {
    return accessLevel;
  }

  public void setAccessLevel(AccessLevel accessLevel) {
    this.accessLevel = accessLevel;
  }

  public UserToInvite defaultOfficeId(Integer defaultOfficeId) {
    this.defaultOfficeId = defaultOfficeId;
    return this;
  }

   /**
   * Get defaultOfficeId
   * @return defaultOfficeId
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getDefaultOfficeId() {
    return defaultOfficeId;
  }

  public void setDefaultOfficeId(Integer defaultOfficeId) {
    this.defaultOfficeId = defaultOfficeId;
  }

  public UserToInvite regions(java.util.List<Integer> regions) {
    this.regions = regions;
    return this;
  }

  public UserToInvite addRegionsItem(Integer regionsItem) {
    if (this.regions == null) {
      this.regions = new java.util.ArrayList<Integer>();
    }
    this.regions.add(regionsItem);
    return this;
  }

   /**
   * Get regions
   * @return regions
  **/
  @ApiModelProperty(value = "")
  public java.util.List<Integer> getRegions() {
    return regions;
  }

  public void setRegions(java.util.List<Integer> regions) {
    this.regions = regions;
  }

  public UserToInvite offices(java.util.List<Integer> offices) {
    this.offices = offices;
    return this;
  }

  public UserToInvite addOfficesItem(Integer officesItem) {
    if (this.offices == null) {
      this.offices = new java.util.ArrayList<Integer>();
    }
    this.offices.add(officesItem);
    return this;
  }

   /**
   * Get offices
   * @return offices
  **/
  @ApiModelProperty(value = "")
  public java.util.List<Integer> getOffices() {
    return offices;
  }

  public void setOffices(java.util.List<Integer> offices) {
    this.offices = offices;
  }

  public UserToInvite eSignPermissionProfileId(String eSignPermissionProfileId) {
    this.eSignPermissionProfileId = eSignPermissionProfileId;
    return this;
  }

   /**
   * Get eSignPermissionProfileId
   * @return eSignPermissionProfileId
  **/
  @ApiModelProperty(required = true, value = "")
  public String getESignPermissionProfileId() {
    return eSignPermissionProfileId;
  }

  public void setESignPermissionProfileId(String eSignPermissionProfileId) {
    this.eSignPermissionProfileId = eSignPermissionProfileId;
  }

  public UserToInvite redirectUrl(String redirectUrl) {
    this.redirectUrl = redirectUrl;
    return this;
  }

   /**
   * Get redirectUrl
   * @return redirectUrl
  **/
  @ApiModelProperty(value = "")
  public String getRedirectUrl() {
    return redirectUrl;
  }

  public void setRedirectUrl(String redirectUrl) {
    this.redirectUrl = redirectUrl;
  }


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
        Objects.equals(this.eSignPermissionProfileId, userToInvite.eSignPermissionProfileId) &&
        Objects.equals(this.redirectUrl, userToInvite.redirectUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, email, roleId, accessLevel, defaultOfficeId, regions, offices, eSignPermissionProfileId, redirectUrl);
  }


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

