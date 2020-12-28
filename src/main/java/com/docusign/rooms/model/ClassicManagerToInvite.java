package com.docusign.rooms.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.rooms.model.AccessLevel;
import com.docusign.rooms.model.ClassicManagerPermissions;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ClassicManagerToInvite
 */

public class ClassicManagerToInvite {
  @JsonProperty("firstName")
  private String firstName = null;

  @JsonProperty("lastName")
  private String lastName = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("defaultOfficeId")
  private Integer defaultOfficeId = null;

  @JsonProperty("titleId")
  private Integer titleId = null;

  @JsonProperty("accessLevel")
  private AccessLevel accessLevel = null;

  @JsonProperty("permissions")
  private ClassicManagerPermissions permissions = null;

  @JsonProperty("offices")
  private java.util.List<Integer> offices = null;

  @JsonProperty("regions")
  private java.util.List<Integer> regions = null;

  @JsonProperty("eSignPermissionProfileId")
  private String eSignPermissionProfileId = null;

  public ClassicManagerToInvite firstName(String firstName) {
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

  public ClassicManagerToInvite lastName(String lastName) {
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

  public ClassicManagerToInvite email(String email) {
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

  public ClassicManagerToInvite defaultOfficeId(Integer defaultOfficeId) {
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

  public ClassicManagerToInvite titleId(Integer titleId) {
    this.titleId = titleId;
    return this;
  }

   /**
   * Get titleId
   * @return titleId
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getTitleId() {
    return titleId;
  }

  public void setTitleId(Integer titleId) {
    this.titleId = titleId;
  }

  public ClassicManagerToInvite accessLevel(AccessLevel accessLevel) {
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

  public ClassicManagerToInvite permissions(ClassicManagerPermissions permissions) {
    this.permissions = permissions;
    return this;
  }

   /**
   * Get permissions
   * @return permissions
  **/
  @ApiModelProperty(required = true, value = "")
  public ClassicManagerPermissions getPermissions() {
    return permissions;
  }

  public void setPermissions(ClassicManagerPermissions permissions) {
    this.permissions = permissions;
  }

  public ClassicManagerToInvite offices(java.util.List<Integer> offices) {
    this.offices = offices;
    return this;
  }

  public ClassicManagerToInvite addOfficesItem(Integer officesItem) {
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

  public ClassicManagerToInvite regions(java.util.List<Integer> regions) {
    this.regions = regions;
    return this;
  }

  public ClassicManagerToInvite addRegionsItem(Integer regionsItem) {
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

  public ClassicManagerToInvite eSignPermissionProfileId(String eSignPermissionProfileId) {
    this.eSignPermissionProfileId = eSignPermissionProfileId;
    return this;
  }

   /**
   * Required when the company is tightly bound to an eSign account; otherwise ignored.
   * @return eSignPermissionProfileId
  **/
  @ApiModelProperty(value = "Required when the company is tightly bound to an eSign account; otherwise ignored.")
  public String getESignPermissionProfileId() {
    return eSignPermissionProfileId;
  }

  public void setESignPermissionProfileId(String eSignPermissionProfileId) {
    this.eSignPermissionProfileId = eSignPermissionProfileId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClassicManagerToInvite classicManagerToInvite = (ClassicManagerToInvite) o;
    return Objects.equals(this.firstName, classicManagerToInvite.firstName) &&
        Objects.equals(this.lastName, classicManagerToInvite.lastName) &&
        Objects.equals(this.email, classicManagerToInvite.email) &&
        Objects.equals(this.defaultOfficeId, classicManagerToInvite.defaultOfficeId) &&
        Objects.equals(this.titleId, classicManagerToInvite.titleId) &&
        Objects.equals(this.accessLevel, classicManagerToInvite.accessLevel) &&
        Objects.equals(this.permissions, classicManagerToInvite.permissions) &&
        Objects.equals(this.offices, classicManagerToInvite.offices) &&
        Objects.equals(this.regions, classicManagerToInvite.regions) &&
        Objects.equals(this.eSignPermissionProfileId, classicManagerToInvite.eSignPermissionProfileId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, email, defaultOfficeId, titleId, accessLevel, permissions, offices, regions, eSignPermissionProfileId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClassicManagerToInvite {\n");
    
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    defaultOfficeId: ").append(toIndentedString(defaultOfficeId)).append("\n");
    sb.append("    titleId: ").append(toIndentedString(titleId)).append("\n");
    sb.append("    accessLevel: ").append(toIndentedString(accessLevel)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    offices: ").append(toIndentedString(offices)).append("\n");
    sb.append("    regions: ").append(toIndentedString(regions)).append("\n");
    sb.append("    eSignPermissionProfileId: ").append(toIndentedString(eSignPermissionProfileId)).append("\n");
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

