package com.docusign.rooms.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ClassicManagerPermissions
 */

public class ClassicManagerPermissions {
  @JsonProperty("isVisibleInTransactionRooms")
  private Boolean isVisibleInTransactionRooms = null;

  @JsonProperty("canDeleteCompanyRooms")
  private Boolean canDeleteCompanyRooms = null;

  @JsonProperty("canDeleteCompanyDocuments")
  private Boolean canDeleteCompanyDocuments = null;

  @JsonProperty("canManageCompanyRooms")
  private Boolean canManageCompanyRooms = null;

  @JsonProperty("canManageCompanyAccount")
  private Boolean canManageCompanyAccount = null;

  @JsonProperty("canManageCompanySharedLibrary")
  private Boolean canManageCompanySharedLibrary = null;

  @JsonProperty("canManageCompanyMembers")
  private Boolean canManageCompanyMembers = null;

  @JsonProperty("canCloseCompanyRooms")
  private Boolean canCloseCompanyRooms = null;

  @JsonProperty("canApproveCompanyChecklists")
  private Boolean canApproveCompanyChecklists = null;

  @JsonProperty("isCompanySystemAdmin")
  private Boolean isCompanySystemAdmin = null;

  @JsonProperty("isRegionManager")
  private Boolean isRegionManager = null;

  @JsonProperty("isOfficeManager")
  private Boolean isOfficeManager = null;

  @JsonProperty("autoAccessToCompanyRooms")
  private Boolean autoAccessToCompanyRooms = null;

  public ClassicManagerPermissions isVisibleInTransactionRooms(Boolean isVisibleInTransactionRooms) {
    this.isVisibleInTransactionRooms = isVisibleInTransactionRooms;
    return this;
  }

   /**
   * Get isVisibleInTransactionRooms
   * @return isVisibleInTransactionRooms
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsVisibleInTransactionRooms() {
    return isVisibleInTransactionRooms;
  }

  public void setIsVisibleInTransactionRooms(Boolean isVisibleInTransactionRooms) {
    this.isVisibleInTransactionRooms = isVisibleInTransactionRooms;
  }

  public ClassicManagerPermissions canDeleteCompanyRooms(Boolean canDeleteCompanyRooms) {
    this.canDeleteCompanyRooms = canDeleteCompanyRooms;
    return this;
  }

   /**
   * Get canDeleteCompanyRooms
   * @return canDeleteCompanyRooms
  **/
  @ApiModelProperty(value = "")
  public Boolean isCanDeleteCompanyRooms() {
    return canDeleteCompanyRooms;
  }

  public void setCanDeleteCompanyRooms(Boolean canDeleteCompanyRooms) {
    this.canDeleteCompanyRooms = canDeleteCompanyRooms;
  }

  public ClassicManagerPermissions canDeleteCompanyDocuments(Boolean canDeleteCompanyDocuments) {
    this.canDeleteCompanyDocuments = canDeleteCompanyDocuments;
    return this;
  }

   /**
   * Get canDeleteCompanyDocuments
   * @return canDeleteCompanyDocuments
  **/
  @ApiModelProperty(value = "")
  public Boolean isCanDeleteCompanyDocuments() {
    return canDeleteCompanyDocuments;
  }

  public void setCanDeleteCompanyDocuments(Boolean canDeleteCompanyDocuments) {
    this.canDeleteCompanyDocuments = canDeleteCompanyDocuments;
  }

  public ClassicManagerPermissions canManageCompanyRooms(Boolean canManageCompanyRooms) {
    this.canManageCompanyRooms = canManageCompanyRooms;
    return this;
  }

   /**
   * Get canManageCompanyRooms
   * @return canManageCompanyRooms
  **/
  @ApiModelProperty(value = "")
  public Boolean isCanManageCompanyRooms() {
    return canManageCompanyRooms;
  }

  public void setCanManageCompanyRooms(Boolean canManageCompanyRooms) {
    this.canManageCompanyRooms = canManageCompanyRooms;
  }

  public ClassicManagerPermissions canManageCompanyAccount(Boolean canManageCompanyAccount) {
    this.canManageCompanyAccount = canManageCompanyAccount;
    return this;
  }

   /**
   * Get canManageCompanyAccount
   * @return canManageCompanyAccount
  **/
  @ApiModelProperty(value = "")
  public Boolean isCanManageCompanyAccount() {
    return canManageCompanyAccount;
  }

  public void setCanManageCompanyAccount(Boolean canManageCompanyAccount) {
    this.canManageCompanyAccount = canManageCompanyAccount;
  }

  public ClassicManagerPermissions canManageCompanySharedLibrary(Boolean canManageCompanySharedLibrary) {
    this.canManageCompanySharedLibrary = canManageCompanySharedLibrary;
    return this;
  }

   /**
   * Get canManageCompanySharedLibrary
   * @return canManageCompanySharedLibrary
  **/
  @ApiModelProperty(value = "")
  public Boolean isCanManageCompanySharedLibrary() {
    return canManageCompanySharedLibrary;
  }

  public void setCanManageCompanySharedLibrary(Boolean canManageCompanySharedLibrary) {
    this.canManageCompanySharedLibrary = canManageCompanySharedLibrary;
  }

  public ClassicManagerPermissions canManageCompanyMembers(Boolean canManageCompanyMembers) {
    this.canManageCompanyMembers = canManageCompanyMembers;
    return this;
  }

   /**
   * Get canManageCompanyMembers
   * @return canManageCompanyMembers
  **/
  @ApiModelProperty(value = "")
  public Boolean isCanManageCompanyMembers() {
    return canManageCompanyMembers;
  }

  public void setCanManageCompanyMembers(Boolean canManageCompanyMembers) {
    this.canManageCompanyMembers = canManageCompanyMembers;
  }

  public ClassicManagerPermissions canCloseCompanyRooms(Boolean canCloseCompanyRooms) {
    this.canCloseCompanyRooms = canCloseCompanyRooms;
    return this;
  }

   /**
   * Get canCloseCompanyRooms
   * @return canCloseCompanyRooms
  **/
  @ApiModelProperty(value = "")
  public Boolean isCanCloseCompanyRooms() {
    return canCloseCompanyRooms;
  }

  public void setCanCloseCompanyRooms(Boolean canCloseCompanyRooms) {
    this.canCloseCompanyRooms = canCloseCompanyRooms;
  }

  public ClassicManagerPermissions canApproveCompanyChecklists(Boolean canApproveCompanyChecklists) {
    this.canApproveCompanyChecklists = canApproveCompanyChecklists;
    return this;
  }

   /**
   * Get canApproveCompanyChecklists
   * @return canApproveCompanyChecklists
  **/
  @ApiModelProperty(value = "")
  public Boolean isCanApproveCompanyChecklists() {
    return canApproveCompanyChecklists;
  }

  public void setCanApproveCompanyChecklists(Boolean canApproveCompanyChecklists) {
    this.canApproveCompanyChecklists = canApproveCompanyChecklists;
  }

  public ClassicManagerPermissions isCompanySystemAdmin(Boolean isCompanySystemAdmin) {
    this.isCompanySystemAdmin = isCompanySystemAdmin;
    return this;
  }

   /**
   * Get isCompanySystemAdmin
   * @return isCompanySystemAdmin
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsCompanySystemAdmin() {
    return isCompanySystemAdmin;
  }

  public void setIsCompanySystemAdmin(Boolean isCompanySystemAdmin) {
    this.isCompanySystemAdmin = isCompanySystemAdmin;
  }

  public ClassicManagerPermissions isRegionManager(Boolean isRegionManager) {
    this.isRegionManager = isRegionManager;
    return this;
  }

   /**
   * Get isRegionManager
   * @return isRegionManager
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsRegionManager() {
    return isRegionManager;
  }

  public void setIsRegionManager(Boolean isRegionManager) {
    this.isRegionManager = isRegionManager;
  }

  public ClassicManagerPermissions isOfficeManager(Boolean isOfficeManager) {
    this.isOfficeManager = isOfficeManager;
    return this;
  }

   /**
   * Get isOfficeManager
   * @return isOfficeManager
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsOfficeManager() {
    return isOfficeManager;
  }

  public void setIsOfficeManager(Boolean isOfficeManager) {
    this.isOfficeManager = isOfficeManager;
  }

  public ClassicManagerPermissions autoAccessToCompanyRooms(Boolean autoAccessToCompanyRooms) {
    this.autoAccessToCompanyRooms = autoAccessToCompanyRooms;
    return this;
  }

   /**
   * Get autoAccessToCompanyRooms
   * @return autoAccessToCompanyRooms
  **/
  @ApiModelProperty(value = "")
  public Boolean isAutoAccessToCompanyRooms() {
    return autoAccessToCompanyRooms;
  }

  public void setAutoAccessToCompanyRooms(Boolean autoAccessToCompanyRooms) {
    this.autoAccessToCompanyRooms = autoAccessToCompanyRooms;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClassicManagerPermissions classicManagerPermissions = (ClassicManagerPermissions) o;
    return Objects.equals(this.isVisibleInTransactionRooms, classicManagerPermissions.isVisibleInTransactionRooms) &&
        Objects.equals(this.canDeleteCompanyRooms, classicManagerPermissions.canDeleteCompanyRooms) &&
        Objects.equals(this.canDeleteCompanyDocuments, classicManagerPermissions.canDeleteCompanyDocuments) &&
        Objects.equals(this.canManageCompanyRooms, classicManagerPermissions.canManageCompanyRooms) &&
        Objects.equals(this.canManageCompanyAccount, classicManagerPermissions.canManageCompanyAccount) &&
        Objects.equals(this.canManageCompanySharedLibrary, classicManagerPermissions.canManageCompanySharedLibrary) &&
        Objects.equals(this.canManageCompanyMembers, classicManagerPermissions.canManageCompanyMembers) &&
        Objects.equals(this.canCloseCompanyRooms, classicManagerPermissions.canCloseCompanyRooms) &&
        Objects.equals(this.canApproveCompanyChecklists, classicManagerPermissions.canApproveCompanyChecklists) &&
        Objects.equals(this.isCompanySystemAdmin, classicManagerPermissions.isCompanySystemAdmin) &&
        Objects.equals(this.isRegionManager, classicManagerPermissions.isRegionManager) &&
        Objects.equals(this.isOfficeManager, classicManagerPermissions.isOfficeManager) &&
        Objects.equals(this.autoAccessToCompanyRooms, classicManagerPermissions.autoAccessToCompanyRooms);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isVisibleInTransactionRooms, canDeleteCompanyRooms, canDeleteCompanyDocuments, canManageCompanyRooms, canManageCompanyAccount, canManageCompanySharedLibrary, canManageCompanyMembers, canCloseCompanyRooms, canApproveCompanyChecklists, isCompanySystemAdmin, isRegionManager, isOfficeManager, autoAccessToCompanyRooms);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClassicManagerPermissions {\n");
    
    sb.append("    isVisibleInTransactionRooms: ").append(toIndentedString(isVisibleInTransactionRooms)).append("\n");
    sb.append("    canDeleteCompanyRooms: ").append(toIndentedString(canDeleteCompanyRooms)).append("\n");
    sb.append("    canDeleteCompanyDocuments: ").append(toIndentedString(canDeleteCompanyDocuments)).append("\n");
    sb.append("    canManageCompanyRooms: ").append(toIndentedString(canManageCompanyRooms)).append("\n");
    sb.append("    canManageCompanyAccount: ").append(toIndentedString(canManageCompanyAccount)).append("\n");
    sb.append("    canManageCompanySharedLibrary: ").append(toIndentedString(canManageCompanySharedLibrary)).append("\n");
    sb.append("    canManageCompanyMembers: ").append(toIndentedString(canManageCompanyMembers)).append("\n");
    sb.append("    canCloseCompanyRooms: ").append(toIndentedString(canCloseCompanyRooms)).append("\n");
    sb.append("    canApproveCompanyChecklists: ").append(toIndentedString(canApproveCompanyChecklists)).append("\n");
    sb.append("    isCompanySystemAdmin: ").append(toIndentedString(isCompanySystemAdmin)).append("\n");
    sb.append("    isRegionManager: ").append(toIndentedString(isRegionManager)).append("\n");
    sb.append("    isOfficeManager: ").append(toIndentedString(isOfficeManager)).append("\n");
    sb.append("    autoAccessToCompanyRooms: ").append(toIndentedString(autoAccessToCompanyRooms)).append("\n");
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

