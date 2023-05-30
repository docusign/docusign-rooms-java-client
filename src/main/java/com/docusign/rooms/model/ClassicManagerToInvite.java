package com.docusign.rooms.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.rooms.model.AccessLevel;
import com.docusign.rooms.model.ClassicManagerPermissions;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * ClassicManagerToInvite.
 *
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


  /**
   * firstName.
   *
   * @return ClassicManagerToInvite
   **/
  public ClassicManagerToInvite firstName(String firstName) {
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
   * @return ClassicManagerToInvite
   **/
  public ClassicManagerToInvite lastName(String lastName) {
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
   * email.
   *
   * @return ClassicManagerToInvite
   **/
  public ClassicManagerToInvite email(String email) {
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
   * defaultOfficeId.
   *
   * @return ClassicManagerToInvite
   **/
  public ClassicManagerToInvite defaultOfficeId(Integer defaultOfficeId) {
    this.defaultOfficeId = defaultOfficeId;
    return this;
  }

  /**
   * Get defaultOfficeId.
   * @return defaultOfficeId
   **/
  @Schema(required = true, description = "")
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
   * @return ClassicManagerToInvite
   **/
  public ClassicManagerToInvite titleId(Integer titleId) {
    this.titleId = titleId;
    return this;
  }

  /**
   * Get titleId.
   * @return titleId
   **/
  @Schema(required = true, description = "")
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
   * accessLevel.
   *
   * @return ClassicManagerToInvite
   **/
  public ClassicManagerToInvite accessLevel(AccessLevel accessLevel) {
    this.accessLevel = accessLevel;
    return this;
  }

  /**
   * Get accessLevel.
   * @return accessLevel
   **/
  @Schema(required = true, description = "")
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
   * permissions.
   *
   * @return ClassicManagerToInvite
   **/
  public ClassicManagerToInvite permissions(ClassicManagerPermissions permissions) {
    this.permissions = permissions;
    return this;
  }

  /**
   * Get permissions.
   * @return permissions
   **/
  @Schema(required = true, description = "")
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
   * offices.
   *
   * @return ClassicManagerToInvite
   **/
  public ClassicManagerToInvite offices(java.util.List<Integer> offices) {
    this.offices = offices;
    return this;
  }
  
  /**
   * addOfficesItem.
   *
   * @return ClassicManagerToInvite
   **/
  public ClassicManagerToInvite addOfficesItem(Integer officesItem) {
    if (this.offices == null) {
      this.offices = new java.util.ArrayList<Integer>();
    }
    this.offices.add(officesItem);
    return this;
  }

  /**
   * Get offices.
   * @return offices
   **/
  @Schema(description = "")
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
   * @return ClassicManagerToInvite
   **/
  public ClassicManagerToInvite regions(java.util.List<Integer> regions) {
    this.regions = regions;
    return this;
  }
  
  /**
   * addRegionsItem.
   *
   * @return ClassicManagerToInvite
   **/
  public ClassicManagerToInvite addRegionsItem(Integer regionsItem) {
    if (this.regions == null) {
      this.regions = new java.util.ArrayList<Integer>();
    }
    this.regions.add(regionsItem);
    return this;
  }

  /**
   * Get regions.
   * @return regions
   **/
  @Schema(description = "")
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
   * eSignPermissionProfileId.
   *
   * @return ClassicManagerToInvite
   **/
  public ClassicManagerToInvite eSignPermissionProfileId(String eSignPermissionProfileId) {
    this.eSignPermissionProfileId = eSignPermissionProfileId;
    return this;
  }

  /**
   * Required when the company is tightly bound to an eSign account; otherwise ignored..
   * @return eSignPermissionProfileId
   **/
  @Schema(description = "Required when the company is tightly bound to an eSign account; otherwise ignored.")
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

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, email, defaultOfficeId, titleId, accessLevel, permissions, offices, regions, eSignPermissionProfileId);
  }


  /**
   * Converts the given object to string.
   */
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

