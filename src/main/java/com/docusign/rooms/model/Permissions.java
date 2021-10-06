package com.docusign.rooms.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Permissions.
 *
 */

public class Permissions {
  @JsonProperty("canAddUsersToRooms")
  private Boolean canAddUsersToRooms = null;

  @JsonProperty("canCreateRooms")
  private Boolean canCreateRooms = null;

  @JsonProperty("canSubmitRoomsForReview")
  private Boolean canSubmitRoomsForReview = null;

  @JsonProperty("canCloseRooms")
  private Boolean canCloseRooms = null;

  @JsonProperty("canReopenRooms")
  private Boolean canReopenRooms = null;

  @JsonProperty("canDeleteOwnedRooms")
  private Boolean canDeleteOwnedRooms = null;

  @JsonProperty("autoAccessToRooms")
  private Boolean autoAccessToRooms = null;

  @JsonProperty("canExportRoomActivityDetailsPeople")
  private Boolean canExportRoomActivityDetailsPeople = null;

  @JsonProperty("canCopyRoomDetails")
  private Boolean canCopyRoomDetails = null;

  @JsonProperty("canEditAnyRoomRole")
  private Boolean canEditAnyRoomRole = null;

  @JsonProperty("canEditInvitedRoomRole")
  private Boolean canEditInvitedRoomRole = null;

  @JsonProperty("canEditRoomSide")
  private Boolean canEditRoomSide = null;

  @JsonProperty("canManageAnyUserRoomAccess")
  private Boolean canManageAnyUserRoomAccess = null;

  @JsonProperty("canManageInvitedUserRoomAccess")
  private Boolean canManageInvitedUserRoomAccess = null;

  @JsonProperty("isHiddenInRoom")
  private Boolean isHiddenInRoom = null;

  @JsonProperty("canManageRoomOwners")
  private Boolean canManageRoomOwners = null;

  @JsonProperty("canDeleteRooms")
  private Boolean canDeleteRooms = null;

  @JsonProperty("canConnectToMortgageCadence")
  private Boolean canConnectToMortgageCadence = null;

  @JsonProperty("canViewRoomDetails")
  private Boolean canViewRoomDetails = null;

  @JsonProperty("canViewAndEditRoomDetails")
  private Boolean canViewAndEditRoomDetails = null;

  @JsonProperty("canSendRoomDetailsToLoneWolf")
  private Boolean canSendRoomDetailsToLoneWolf = null;

  @JsonProperty("canAddDocuments")
  private Boolean canAddDocuments = null;

  @JsonProperty("canAddDocumentsFromFormGroups")
  private Boolean canAddDocumentsFromFormGroups = null;

  @JsonProperty("canAddDocumentsFromFormLibraries")
  private Boolean canAddDocumentsFromFormLibraries = null;

  @JsonProperty("documentsViewableByOthersInRoomFromOffice")
  private Boolean documentsViewableByOthersInRoomFromOffice = null;

  @JsonProperty("documentsAutoOwnedByPeers")
  private Boolean documentsAutoOwnedByPeers = null;

  @JsonProperty("canDeleteOwnedDocuments")
  private Boolean canDeleteOwnedDocuments = null;

  @JsonProperty("canManageSharedDocs")
  private Boolean canManageSharedDocs = null;

  @JsonProperty("canManageFormGroups")
  private Boolean canManageFormGroups = null;

  @JsonProperty("canShareDocsNotOwned")
  private Boolean canShareDocsNotOwned = null;

  @JsonProperty("canCreateFormTemplates")
  private Boolean canCreateFormTemplates = null;

  @JsonProperty("canAddTasksToAnyTaskLists")
  private Boolean canAddTasksToAnyTaskLists = null;

  @JsonProperty("canEditEditableTasks")
  private Boolean canEditEditableTasks = null;

  @JsonProperty("canEditAnyTasks")
  private Boolean canEditAnyTasks = null;

  @JsonProperty("canDeleteDeletableTasks")
  private Boolean canDeleteDeletableTasks = null;

  @JsonProperty("canDeleteAnyTasks")
  private Boolean canDeleteAnyTasks = null;

  @JsonProperty("canApplyTaskList")
  private Boolean canApplyTaskList = null;

  @JsonProperty("canRemoveAnyTaskList")
  private Boolean canRemoveAnyTaskList = null;

  @JsonProperty("canSubmitTaskList")
  private Boolean canSubmitTaskList = null;

  @JsonProperty("canAutoSubmitTaskList")
  private Boolean canAutoSubmitTaskList = null;

  @JsonProperty("canReviewTaskList")
  private Boolean canReviewTaskList = null;

  @JsonProperty("canAutoApproveTaskList")
  private Boolean canAutoApproveTaskList = null;

  @JsonProperty("canManageTaskTemplatesForAllRegionsAllOffices")
  private Boolean canManageTaskTemplatesForAllRegionsAllOffices = null;

  @JsonProperty("canApplyRoomTemplates")
  private Boolean canApplyRoomTemplates = null;

  @JsonProperty("canAddTasksToRooms")
  private Boolean canAddTasksToRooms = null;

  @JsonProperty("canReviewAnyTask")
  private Boolean canReviewAnyTask = null;

  @JsonProperty("canManageDocsOnAnyTask")
  private Boolean canManageDocsOnAnyTask = null;

  @JsonProperty("canAddMemberAndSetRoleLowerAccessLevel")
  private Boolean canAddMemberAndSetRoleLowerAccessLevel = null;

  @JsonProperty("canAddMemberAndSetRoleSameAccessLevel")
  private Boolean canAddMemberAndSetRoleSameAccessLevel = null;

  @JsonProperty("canChangeMemberRoleLowerAccessLevel")
  private Boolean canChangeMemberRoleLowerAccessLevel = null;

  @JsonProperty("canChangeMemberRoleSameAccessLevel")
  private Boolean canChangeMemberRoleSameAccessLevel = null;

  @JsonProperty("canManageMemberLowerAccessLevel")
  private Boolean canManageMemberLowerAccessLevel = null;

  @JsonProperty("canManageMemberSameAccessLevel")
  private Boolean canManageMemberSameAccessLevel = null;

  @JsonProperty("canRemoveCompanyMemberLowerAccessLevel")
  private Boolean canRemoveCompanyMemberLowerAccessLevel = null;

  @JsonProperty("canRemoveCompanyMemberSameAccessLevel")
  private Boolean canRemoveCompanyMemberSameAccessLevel = null;

  @JsonProperty("canManageAccount")
  private Boolean canManageAccount = null;

  @JsonProperty("canManageLogo")
  private Boolean canManageLogo = null;

  @JsonProperty("canManageRolesAndPermissions")
  private Boolean canManageRolesAndPermissions = null;

  @JsonProperty("canManageRoomDetails")
  private Boolean canManageRoomDetails = null;

  @JsonProperty("canManageRoomTemplates")
  private Boolean canManageRoomTemplates = null;

  @JsonProperty("canManageIntegrationSettings")
  private Boolean canManageIntegrationSettings = null;


  /**
   * canAddUsersToRooms.
   *
   * @return Permissions
   **/
  public Permissions canAddUsersToRooms(Boolean canAddUsersToRooms) {
    this.canAddUsersToRooms = canAddUsersToRooms;
    return this;
  }

  /**
   * Get canAddUsersToRooms.
   * @return canAddUsersToRooms
   **/
  @ApiModelProperty(value = "")
  public Boolean isCanAddUsersToRooms() {
    return canAddUsersToRooms;
  }

  /**
   * setCanAddUsersToRooms.
   **/
  public void setCanAddUsersToRooms(Boolean canAddUsersToRooms) {
    this.canAddUsersToRooms = canAddUsersToRooms;
  }


  /**
   * canCreateRooms.
   *
   * @return Permissions
   **/
  public Permissions canCreateRooms(Boolean canCreateRooms) {
    this.canCreateRooms = canCreateRooms;
    return this;
  }

  /**
   * Get canCreateRooms.
   * @return canCreateRooms
   **/
  @ApiModelProperty(value = "")
  public Boolean isCanCreateRooms() {
    return canCreateRooms;
  }

  /**
   * setCanCreateRooms.
   **/
  public void setCanCreateRooms(Boolean canCreateRooms) {
    this.canCreateRooms = canCreateRooms;
  }


  /**
   * canSubmitRoomsForReview.
   *
   * @return Permissions
   **/
  public Permissions canSubmitRoomsForReview(Boolean canSubmitRoomsForReview) {
    this.canSubmitRoomsForReview = canSubmitRoomsForReview;
    return this;
  }

  /**
   * Get canSubmitRoomsForReview.
   * @return canSubmitRoomsForReview
   **/
  @ApiModelProperty(value = "")
  public Boolean isCanSubmitRoomsForReview() {
    return canSubmitRoomsForReview;
  }

  /**
   * setCanSubmitRoomsForReview.
   **/
  public void setCanSubmitRoomsForReview(Boolean canSubmitRoomsForReview) {
    this.canSubmitRoomsForReview = canSubmitRoomsForReview;
  }


  /**
   * canCloseRooms.
   *
   * @return Permissions
   **/
  public Permissions canCloseRooms(Boolean canCloseRooms) {
    this.canCloseRooms = canCloseRooms;
    return this;
  }

  /**
   * Get canCloseRooms.
   * @return canCloseRooms
   **/
  @ApiModelProperty(value = "")
  public Boolean isCanCloseRooms() {
    return canCloseRooms;
  }

  /**
   * setCanCloseRooms.
   **/
  public void setCanCloseRooms(Boolean canCloseRooms) {
    this.canCloseRooms = canCloseRooms;
  }


  /**
   * canReopenRooms.
   *
   * @return Permissions
   **/
  public Permissions canReopenRooms(Boolean canReopenRooms) {
    this.canReopenRooms = canReopenRooms;
    return this;
  }

  /**
   * Get canReopenRooms.
   * @return canReopenRooms
   **/
  @ApiModelProperty(value = "")
  public Boolean isCanReopenRooms() {
    return canReopenRooms;
  }

  /**
   * setCanReopenRooms.
   **/
  public void setCanReopenRooms(Boolean canReopenRooms) {
    this.canReopenRooms = canReopenRooms;
  }


  /**
   * canDeleteOwnedRooms.
   *
   * @return Permissions
   **/
  public Permissions canDeleteOwnedRooms(Boolean canDeleteOwnedRooms) {
    this.canDeleteOwnedRooms = canDeleteOwnedRooms;
    return this;
  }

  /**
   * Get canDeleteOwnedRooms.
   * @return canDeleteOwnedRooms
   **/
  @ApiModelProperty(value = "")
  public Boolean isCanDeleteOwnedRooms() {
    return canDeleteOwnedRooms;
  }

  /**
   * setCanDeleteOwnedRooms.
   **/
  public void setCanDeleteOwnedRooms(Boolean canDeleteOwnedRooms) {
    this.canDeleteOwnedRooms = canDeleteOwnedRooms;
  }


  /**
   * autoAccessToRooms.
   *
   * @return Permissions
   **/
  public Permissions autoAccessToRooms(Boolean autoAccessToRooms) {
    this.autoAccessToRooms = autoAccessToRooms;
    return this;
  }

  /**
   * Get autoAccessToRooms.
   * @return autoAccessToRooms
   **/
  @ApiModelProperty(value = "")
  public Boolean isAutoAccessToRooms() {
    return autoAccessToRooms;
  }

  /**
   * setAutoAccessToRooms.
   **/
  public void setAutoAccessToRooms(Boolean autoAccessToRooms) {
    this.autoAccessToRooms = autoAccessToRooms;
  }


  /**
   * canExportRoomActivityDetailsPeople.
   *
   * @return Permissions
   **/
  public Permissions canExportRoomActivityDetailsPeople(Boolean canExportRoomActivityDetailsPeople) {
    this.canExportRoomActivityDetailsPeople = canExportRoomActivityDetailsPeople;
    return this;
  }

  /**
   * Get canExportRoomActivityDetailsPeople.
   * @return canExportRoomActivityDetailsPeople
   **/
  @ApiModelProperty(value = "")
  public Boolean isCanExportRoomActivityDetailsPeople() {
    return canExportRoomActivityDetailsPeople;
  }

  /**
   * setCanExportRoomActivityDetailsPeople.
   **/
  public void setCanExportRoomActivityDetailsPeople(Boolean canExportRoomActivityDetailsPeople) {
    this.canExportRoomActivityDetailsPeople = canExportRoomActivityDetailsPeople;
  }


  /**
   * canCopyRoomDetails.
   *
   * @return Permissions
   **/
  public Permissions canCopyRoomDetails(Boolean canCopyRoomDetails) {
    this.canCopyRoomDetails = canCopyRoomDetails;
    return this;
  }

  /**
   * Get canCopyRoomDetails.
   * @return canCopyRoomDetails
   **/
  @ApiModelProperty(value = "")
  public Boolean isCanCopyRoomDetails() {
    return canCopyRoomDetails;
  }

  /**
   * setCanCopyRoomDetails.
   **/
  public void setCanCopyRoomDetails(Boolean canCopyRoomDetails) {
    this.canCopyRoomDetails = canCopyRoomDetails;
  }


  /**
   * canEditAnyRoomRole.
   *
   * @return Permissions
   **/
  public Permissions canEditAnyRoomRole(Boolean canEditAnyRoomRole) {
    this.canEditAnyRoomRole = canEditAnyRoomRole;
    return this;
  }

  /**
   * Get canEditAnyRoomRole.
   * @return canEditAnyRoomRole
   **/
  @ApiModelProperty(value = "")
  public Boolean isCanEditAnyRoomRole() {
    return canEditAnyRoomRole;
  }

  /**
   * setCanEditAnyRoomRole.
   **/
  public void setCanEditAnyRoomRole(Boolean canEditAnyRoomRole) {
    this.canEditAnyRoomRole = canEditAnyRoomRole;
  }


  /**
   * canEditInvitedRoomRole.
   *
   * @return Permissions
   **/
  public Permissions canEditInvitedRoomRole(Boolean canEditInvitedRoomRole) {
    this.canEditInvitedRoomRole = canEditInvitedRoomRole;
    return this;
  }

  /**
   * Get canEditInvitedRoomRole.
   * @return canEditInvitedRoomRole
   **/
  @ApiModelProperty(value = "")
  public Boolean isCanEditInvitedRoomRole() {
    return canEditInvitedRoomRole;
  }

  /**
   * setCanEditInvitedRoomRole.
   **/
  public void setCanEditInvitedRoomRole(Boolean canEditInvitedRoomRole) {
    this.canEditInvitedRoomRole = canEditInvitedRoomRole;
  }


  /**
   * canEditRoomSide.
   *
   * @return Permissions
   **/
  public Permissions canEditRoomSide(Boolean canEditRoomSide) {
    this.canEditRoomSide = canEditRoomSide;
    return this;
  }

  /**
   * Get canEditRoomSide.
   * @return canEditRoomSide
   **/
  @ApiModelProperty(value = "")
  public Boolean isCanEditRoomSide() {
    return canEditRoomSide;
  }

  /**
   * setCanEditRoomSide.
   **/
  public void setCanEditRoomSide(Boolean canEditRoomSide) {
    this.canEditRoomSide = canEditRoomSide;
  }


  /**
   * canManageAnyUserRoomAccess.
   *
   * @return Permissions
   **/
  public Permissions canManageAnyUserRoomAccess(Boolean canManageAnyUserRoomAccess) {
    this.canManageAnyUserRoomAccess = canManageAnyUserRoomAccess;
    return this;
  }

  /**
   * Get canManageAnyUserRoomAccess.
   * @return canManageAnyUserRoomAccess
   **/
  @ApiModelProperty(value = "")
  public Boolean isCanManageAnyUserRoomAccess() {
    return canManageAnyUserRoomAccess;
  }

  /**
   * setCanManageAnyUserRoomAccess.
   **/
  public void setCanManageAnyUserRoomAccess(Boolean canManageAnyUserRoomAccess) {
    this.canManageAnyUserRoomAccess = canManageAnyUserRoomAccess;
  }


  /**
   * canManageInvitedUserRoomAccess.
   *
   * @return Permissions
   **/
  public Permissions canManageInvitedUserRoomAccess(Boolean canManageInvitedUserRoomAccess) {
    this.canManageInvitedUserRoomAccess = canManageInvitedUserRoomAccess;
    return this;
  }

  /**
   * Get canManageInvitedUserRoomAccess.
   * @return canManageInvitedUserRoomAccess
   **/
  @ApiModelProperty(value = "")
  public Boolean isCanManageInvitedUserRoomAccess() {
    return canManageInvitedUserRoomAccess;
  }

  /**
   * setCanManageInvitedUserRoomAccess.
   **/
  public void setCanManageInvitedUserRoomAccess(Boolean canManageInvitedUserRoomAccess) {
    this.canManageInvitedUserRoomAccess = canManageInvitedUserRoomAccess;
  }


  /**
   * isHiddenInRoom.
   *
   * @return Permissions
   **/
  public Permissions isHiddenInRoom(Boolean isHiddenInRoom) {
    this.isHiddenInRoom = isHiddenInRoom;
    return this;
  }

  /**
   * Get isHiddenInRoom.
   * @return isHiddenInRoom
   **/
  @ApiModelProperty(value = "")
  public Boolean isIsHiddenInRoom() {
    return isHiddenInRoom;
  }

  /**
   * setIsHiddenInRoom.
   **/
  public void setIsHiddenInRoom(Boolean isHiddenInRoom) {
    this.isHiddenInRoom = isHiddenInRoom;
  }


  /**
   * canManageRoomOwners.
   *
   * @return Permissions
   **/
  public Permissions canManageRoomOwners(Boolean canManageRoomOwners) {
    this.canManageRoomOwners = canManageRoomOwners;
    return this;
  }

  /**
   * Get canManageRoomOwners.
   * @return canManageRoomOwners
   **/
  @ApiModelProperty(value = "")
  public Boolean isCanManageRoomOwners() {
    return canManageRoomOwners;
  }

  /**
   * setCanManageRoomOwners.
   **/
  public void setCanManageRoomOwners(Boolean canManageRoomOwners) {
    this.canManageRoomOwners = canManageRoomOwners;
  }


  /**
   * canDeleteRooms.
   *
   * @return Permissions
   **/
  public Permissions canDeleteRooms(Boolean canDeleteRooms) {
    this.canDeleteRooms = canDeleteRooms;
    return this;
  }

  /**
   * Get canDeleteRooms.
   * @return canDeleteRooms
   **/
  @ApiModelProperty(value = "")
  public Boolean isCanDeleteRooms() {
    return canDeleteRooms;
  }

  /**
   * setCanDeleteRooms.
   **/
  public void setCanDeleteRooms(Boolean canDeleteRooms) {
    this.canDeleteRooms = canDeleteRooms;
  }


  /**
   * canConnectToMortgageCadence.
   *
   * @return Permissions
   **/
  public Permissions canConnectToMortgageCadence(Boolean canConnectToMortgageCadence) {
    this.canConnectToMortgageCadence = canConnectToMortgageCadence;
    return this;
  }

  /**
   * Get canConnectToMortgageCadence.
   * @return canConnectToMortgageCadence
   **/
  @ApiModelProperty(value = "")
  public Boolean isCanConnectToMortgageCadence() {
    return canConnectToMortgageCadence;
  }

  /**
   * setCanConnectToMortgageCadence.
   **/
  public void setCanConnectToMortgageCadence(Boolean canConnectToMortgageCadence) {
    this.canConnectToMortgageCadence = canConnectToMortgageCadence;
  }


  /**
   * canViewRoomDetails.
   *
   * @return Permissions
   **/
  public Permissions canViewRoomDetails(Boolean canViewRoomDetails) {
    this.canViewRoomDetails = canViewRoomDetails;
    return this;
  }

  /**
   * Get canViewRoomDetails.
   * @return canViewRoomDetails
   **/
  @ApiModelProperty(value = "")
  public Boolean isCanViewRoomDetails() {
    return canViewRoomDetails;
  }

  /**
   * setCanViewRoomDetails.
   **/
  public void setCanViewRoomDetails(Boolean canViewRoomDetails) {
    this.canViewRoomDetails = canViewRoomDetails;
  }


  /**
   * canViewAndEditRoomDetails.
   *
   * @return Permissions
   **/
  public Permissions canViewAndEditRoomDetails(Boolean canViewAndEditRoomDetails) {
    this.canViewAndEditRoomDetails = canViewAndEditRoomDetails;
    return this;
  }

  /**
   * Get canViewAndEditRoomDetails.
   * @return canViewAndEditRoomDetails
   **/
  @ApiModelProperty(value = "")
  public Boolean isCanViewAndEditRoomDetails() {
    return canViewAndEditRoomDetails;
  }

  /**
   * setCanViewAndEditRoomDetails.
   **/
  public void setCanViewAndEditRoomDetails(Boolean canViewAndEditRoomDetails) {
    this.canViewAndEditRoomDetails = canViewAndEditRoomDetails;
  }


  /**
   * canSendRoomDetailsToLoneWolf.
   *
   * @return Permissions
   **/
  public Permissions canSendRoomDetailsToLoneWolf(Boolean canSendRoomDetailsToLoneWolf) {
    this.canSendRoomDetailsToLoneWolf = canSendRoomDetailsToLoneWolf;
    return this;
  }

  /**
   * Get canSendRoomDetailsToLoneWolf.
   * @return canSendRoomDetailsToLoneWolf
   **/
  @ApiModelProperty(value = "")
  public Boolean isCanSendRoomDetailsToLoneWolf() {
    return canSendRoomDetailsToLoneWolf;
  }

  /**
   * setCanSendRoomDetailsToLoneWolf.
   **/
  public void setCanSendRoomDetailsToLoneWolf(Boolean canSendRoomDetailsToLoneWolf) {
    this.canSendRoomDetailsToLoneWolf = canSendRoomDetailsToLoneWolf;
  }


  /**
   * canAddDocuments.
   *
   * @return Permissions
   **/
  public Permissions canAddDocuments(Boolean canAddDocuments) {
    this.canAddDocuments = canAddDocuments;
    return this;
  }

  /**
   * Get canAddDocuments.
   * @return canAddDocuments
   **/
  @ApiModelProperty(value = "")
  public Boolean isCanAddDocuments() {
    return canAddDocuments;
  }

  /**
   * setCanAddDocuments.
   **/
  public void setCanAddDocuments(Boolean canAddDocuments) {
    this.canAddDocuments = canAddDocuments;
  }


  /**
   * canAddDocumentsFromFormGroups.
   *
   * @return Permissions
   **/
  public Permissions canAddDocumentsFromFormGroups(Boolean canAddDocumentsFromFormGroups) {
    this.canAddDocumentsFromFormGroups = canAddDocumentsFromFormGroups;
    return this;
  }

  /**
   * Get canAddDocumentsFromFormGroups.
   * @return canAddDocumentsFromFormGroups
   **/
  @ApiModelProperty(value = "")
  public Boolean isCanAddDocumentsFromFormGroups() {
    return canAddDocumentsFromFormGroups;
  }

  /**
   * setCanAddDocumentsFromFormGroups.
   **/
  public void setCanAddDocumentsFromFormGroups(Boolean canAddDocumentsFromFormGroups) {
    this.canAddDocumentsFromFormGroups = canAddDocumentsFromFormGroups;
  }


  /**
   * canAddDocumentsFromFormLibraries.
   *
   * @return Permissions
   **/
  public Permissions canAddDocumentsFromFormLibraries(Boolean canAddDocumentsFromFormLibraries) {
    this.canAddDocumentsFromFormLibraries = canAddDocumentsFromFormLibraries;
    return this;
  }

  /**
   * Get canAddDocumentsFromFormLibraries.
   * @return canAddDocumentsFromFormLibraries
   **/
  @ApiModelProperty(value = "")
  public Boolean isCanAddDocumentsFromFormLibraries() {
    return canAddDocumentsFromFormLibraries;
  }

  /**
   * setCanAddDocumentsFromFormLibraries.
   **/
  public void setCanAddDocumentsFromFormLibraries(Boolean canAddDocumentsFromFormLibraries) {
    this.canAddDocumentsFromFormLibraries = canAddDocumentsFromFormLibraries;
  }


  /**
   * documentsViewableByOthersInRoomFromOffice.
   *
   * @return Permissions
   **/
  public Permissions documentsViewableByOthersInRoomFromOffice(Boolean documentsViewableByOthersInRoomFromOffice) {
    this.documentsViewableByOthersInRoomFromOffice = documentsViewableByOthersInRoomFromOffice;
    return this;
  }

  /**
   * Get documentsViewableByOthersInRoomFromOffice.
   * @return documentsViewableByOthersInRoomFromOffice
   **/
  @ApiModelProperty(value = "")
  public Boolean isDocumentsViewableByOthersInRoomFromOffice() {
    return documentsViewableByOthersInRoomFromOffice;
  }

  /**
   * setDocumentsViewableByOthersInRoomFromOffice.
   **/
  public void setDocumentsViewableByOthersInRoomFromOffice(Boolean documentsViewableByOthersInRoomFromOffice) {
    this.documentsViewableByOthersInRoomFromOffice = documentsViewableByOthersInRoomFromOffice;
  }


  /**
   * documentsAutoOwnedByPeers.
   *
   * @return Permissions
   **/
  public Permissions documentsAutoOwnedByPeers(Boolean documentsAutoOwnedByPeers) {
    this.documentsAutoOwnedByPeers = documentsAutoOwnedByPeers;
    return this;
  }

  /**
   * Get documentsAutoOwnedByPeers.
   * @return documentsAutoOwnedByPeers
   **/
  @ApiModelProperty(value = "")
  public Boolean isDocumentsAutoOwnedByPeers() {
    return documentsAutoOwnedByPeers;
  }

  /**
   * setDocumentsAutoOwnedByPeers.
   **/
  public void setDocumentsAutoOwnedByPeers(Boolean documentsAutoOwnedByPeers) {
    this.documentsAutoOwnedByPeers = documentsAutoOwnedByPeers;
  }


  /**
   * canDeleteOwnedDocuments.
   *
   * @return Permissions
   **/
  public Permissions canDeleteOwnedDocuments(Boolean canDeleteOwnedDocuments) {
    this.canDeleteOwnedDocuments = canDeleteOwnedDocuments;
    return this;
  }

  /**
   * Get canDeleteOwnedDocuments.
   * @return canDeleteOwnedDocuments
   **/
  @ApiModelProperty(value = "")
  public Boolean isCanDeleteOwnedDocuments() {
    return canDeleteOwnedDocuments;
  }

  /**
   * setCanDeleteOwnedDocuments.
   **/
  public void setCanDeleteOwnedDocuments(Boolean canDeleteOwnedDocuments) {
    this.canDeleteOwnedDocuments = canDeleteOwnedDocuments;
  }


  /**
   * canManageSharedDocs.
   *
   * @return Permissions
   **/
  public Permissions canManageSharedDocs(Boolean canManageSharedDocs) {
    this.canManageSharedDocs = canManageSharedDocs;
    return this;
  }

  /**
   * Get canManageSharedDocs.
   * @return canManageSharedDocs
   **/
  @ApiModelProperty(value = "")
  public Boolean isCanManageSharedDocs() {
    return canManageSharedDocs;
  }

  /**
   * setCanManageSharedDocs.
   **/
  public void setCanManageSharedDocs(Boolean canManageSharedDocs) {
    this.canManageSharedDocs = canManageSharedDocs;
  }


  /**
   * canManageFormGroups.
   *
   * @return Permissions
   **/
  public Permissions canManageFormGroups(Boolean canManageFormGroups) {
    this.canManageFormGroups = canManageFormGroups;
    return this;
  }

  /**
   * Get canManageFormGroups.
   * @return canManageFormGroups
   **/
  @ApiModelProperty(value = "")
  public Boolean isCanManageFormGroups() {
    return canManageFormGroups;
  }

  /**
   * setCanManageFormGroups.
   **/
  public void setCanManageFormGroups(Boolean canManageFormGroups) {
    this.canManageFormGroups = canManageFormGroups;
  }


  /**
   * canShareDocsNotOwned.
   *
   * @return Permissions
   **/
  public Permissions canShareDocsNotOwned(Boolean canShareDocsNotOwned) {
    this.canShareDocsNotOwned = canShareDocsNotOwned;
    return this;
  }

  /**
   * Get canShareDocsNotOwned.
   * @return canShareDocsNotOwned
   **/
  @ApiModelProperty(value = "")
  public Boolean isCanShareDocsNotOwned() {
    return canShareDocsNotOwned;
  }

  /**
   * setCanShareDocsNotOwned.
   **/
  public void setCanShareDocsNotOwned(Boolean canShareDocsNotOwned) {
    this.canShareDocsNotOwned = canShareDocsNotOwned;
  }


  /**
   * canCreateFormTemplates.
   *
   * @return Permissions
   **/
  public Permissions canCreateFormTemplates(Boolean canCreateFormTemplates) {
    this.canCreateFormTemplates = canCreateFormTemplates;
    return this;
  }

  /**
   * Get canCreateFormTemplates.
   * @return canCreateFormTemplates
   **/
  @ApiModelProperty(value = "")
  public Boolean isCanCreateFormTemplates() {
    return canCreateFormTemplates;
  }

  /**
   * setCanCreateFormTemplates.
   **/
  public void setCanCreateFormTemplates(Boolean canCreateFormTemplates) {
    this.canCreateFormTemplates = canCreateFormTemplates;
  }


  /**
   * canAddTasksToAnyTaskLists.
   *
   * @return Permissions
   **/
  public Permissions canAddTasksToAnyTaskLists(Boolean canAddTasksToAnyTaskLists) {
    this.canAddTasksToAnyTaskLists = canAddTasksToAnyTaskLists;
    return this;
  }

  /**
   * Get canAddTasksToAnyTaskLists.
   * @return canAddTasksToAnyTaskLists
   **/
  @ApiModelProperty(value = "")
  public Boolean isCanAddTasksToAnyTaskLists() {
    return canAddTasksToAnyTaskLists;
  }

  /**
   * setCanAddTasksToAnyTaskLists.
   **/
  public void setCanAddTasksToAnyTaskLists(Boolean canAddTasksToAnyTaskLists) {
    this.canAddTasksToAnyTaskLists = canAddTasksToAnyTaskLists;
  }


  /**
   * canEditEditableTasks.
   *
   * @return Permissions
   **/
  public Permissions canEditEditableTasks(Boolean canEditEditableTasks) {
    this.canEditEditableTasks = canEditEditableTasks;
    return this;
  }

  /**
   * Get canEditEditableTasks.
   * @return canEditEditableTasks
   **/
  @ApiModelProperty(value = "")
  public Boolean isCanEditEditableTasks() {
    return canEditEditableTasks;
  }

  /**
   * setCanEditEditableTasks.
   **/
  public void setCanEditEditableTasks(Boolean canEditEditableTasks) {
    this.canEditEditableTasks = canEditEditableTasks;
  }


  /**
   * canEditAnyTasks.
   *
   * @return Permissions
   **/
  public Permissions canEditAnyTasks(Boolean canEditAnyTasks) {
    this.canEditAnyTasks = canEditAnyTasks;
    return this;
  }

  /**
   * Get canEditAnyTasks.
   * @return canEditAnyTasks
   **/
  @ApiModelProperty(value = "")
  public Boolean isCanEditAnyTasks() {
    return canEditAnyTasks;
  }

  /**
   * setCanEditAnyTasks.
   **/
  public void setCanEditAnyTasks(Boolean canEditAnyTasks) {
    this.canEditAnyTasks = canEditAnyTasks;
  }


  /**
   * canDeleteDeletableTasks.
   *
   * @return Permissions
   **/
  public Permissions canDeleteDeletableTasks(Boolean canDeleteDeletableTasks) {
    this.canDeleteDeletableTasks = canDeleteDeletableTasks;
    return this;
  }

  /**
   * Get canDeleteDeletableTasks.
   * @return canDeleteDeletableTasks
   **/
  @ApiModelProperty(value = "")
  public Boolean isCanDeleteDeletableTasks() {
    return canDeleteDeletableTasks;
  }

  /**
   * setCanDeleteDeletableTasks.
   **/
  public void setCanDeleteDeletableTasks(Boolean canDeleteDeletableTasks) {
    this.canDeleteDeletableTasks = canDeleteDeletableTasks;
  }


  /**
   * canDeleteAnyTasks.
   *
   * @return Permissions
   **/
  public Permissions canDeleteAnyTasks(Boolean canDeleteAnyTasks) {
    this.canDeleteAnyTasks = canDeleteAnyTasks;
    return this;
  }

  /**
   * Get canDeleteAnyTasks.
   * @return canDeleteAnyTasks
   **/
  @ApiModelProperty(value = "")
  public Boolean isCanDeleteAnyTasks() {
    return canDeleteAnyTasks;
  }

  /**
   * setCanDeleteAnyTasks.
   **/
  public void setCanDeleteAnyTasks(Boolean canDeleteAnyTasks) {
    this.canDeleteAnyTasks = canDeleteAnyTasks;
  }


  /**
   * canApplyTaskList.
   *
   * @return Permissions
   **/
  public Permissions canApplyTaskList(Boolean canApplyTaskList) {
    this.canApplyTaskList = canApplyTaskList;
    return this;
  }

  /**
   * Get canApplyTaskList.
   * @return canApplyTaskList
   **/
  @ApiModelProperty(value = "")
  public Boolean isCanApplyTaskList() {
    return canApplyTaskList;
  }

  /**
   * setCanApplyTaskList.
   **/
  public void setCanApplyTaskList(Boolean canApplyTaskList) {
    this.canApplyTaskList = canApplyTaskList;
  }


  /**
   * canRemoveAnyTaskList.
   *
   * @return Permissions
   **/
  public Permissions canRemoveAnyTaskList(Boolean canRemoveAnyTaskList) {
    this.canRemoveAnyTaskList = canRemoveAnyTaskList;
    return this;
  }

  /**
   * Get canRemoveAnyTaskList.
   * @return canRemoveAnyTaskList
   **/
  @ApiModelProperty(value = "")
  public Boolean isCanRemoveAnyTaskList() {
    return canRemoveAnyTaskList;
  }

  /**
   * setCanRemoveAnyTaskList.
   **/
  public void setCanRemoveAnyTaskList(Boolean canRemoveAnyTaskList) {
    this.canRemoveAnyTaskList = canRemoveAnyTaskList;
  }


  /**
   * canSubmitTaskList.
   *
   * @return Permissions
   **/
  public Permissions canSubmitTaskList(Boolean canSubmitTaskList) {
    this.canSubmitTaskList = canSubmitTaskList;
    return this;
  }

  /**
   * Get canSubmitTaskList.
   * @return canSubmitTaskList
   **/
  @ApiModelProperty(value = "")
  public Boolean isCanSubmitTaskList() {
    return canSubmitTaskList;
  }

  /**
   * setCanSubmitTaskList.
   **/
  public void setCanSubmitTaskList(Boolean canSubmitTaskList) {
    this.canSubmitTaskList = canSubmitTaskList;
  }


  /**
   * canAutoSubmitTaskList.
   *
   * @return Permissions
   **/
  public Permissions canAutoSubmitTaskList(Boolean canAutoSubmitTaskList) {
    this.canAutoSubmitTaskList = canAutoSubmitTaskList;
    return this;
  }

  /**
   * Get canAutoSubmitTaskList.
   * @return canAutoSubmitTaskList
   **/
  @ApiModelProperty(value = "")
  public Boolean isCanAutoSubmitTaskList() {
    return canAutoSubmitTaskList;
  }

  /**
   * setCanAutoSubmitTaskList.
   **/
  public void setCanAutoSubmitTaskList(Boolean canAutoSubmitTaskList) {
    this.canAutoSubmitTaskList = canAutoSubmitTaskList;
  }


  /**
   * canReviewTaskList.
   *
   * @return Permissions
   **/
  public Permissions canReviewTaskList(Boolean canReviewTaskList) {
    this.canReviewTaskList = canReviewTaskList;
    return this;
  }

  /**
   * Get canReviewTaskList.
   * @return canReviewTaskList
   **/
  @ApiModelProperty(value = "")
  public Boolean isCanReviewTaskList() {
    return canReviewTaskList;
  }

  /**
   * setCanReviewTaskList.
   **/
  public void setCanReviewTaskList(Boolean canReviewTaskList) {
    this.canReviewTaskList = canReviewTaskList;
  }


  /**
   * canAutoApproveTaskList.
   *
   * @return Permissions
   **/
  public Permissions canAutoApproveTaskList(Boolean canAutoApproveTaskList) {
    this.canAutoApproveTaskList = canAutoApproveTaskList;
    return this;
  }

  /**
   * Get canAutoApproveTaskList.
   * @return canAutoApproveTaskList
   **/
  @ApiModelProperty(value = "")
  public Boolean isCanAutoApproveTaskList() {
    return canAutoApproveTaskList;
  }

  /**
   * setCanAutoApproveTaskList.
   **/
  public void setCanAutoApproveTaskList(Boolean canAutoApproveTaskList) {
    this.canAutoApproveTaskList = canAutoApproveTaskList;
  }


  /**
   * canManageTaskTemplatesForAllRegionsAllOffices.
   *
   * @return Permissions
   **/
  public Permissions canManageTaskTemplatesForAllRegionsAllOffices(Boolean canManageTaskTemplatesForAllRegionsAllOffices) {
    this.canManageTaskTemplatesForAllRegionsAllOffices = canManageTaskTemplatesForAllRegionsAllOffices;
    return this;
  }

  /**
   * Get canManageTaskTemplatesForAllRegionsAllOffices.
   * @return canManageTaskTemplatesForAllRegionsAllOffices
   **/
  @ApiModelProperty(value = "")
  public Boolean isCanManageTaskTemplatesForAllRegionsAllOffices() {
    return canManageTaskTemplatesForAllRegionsAllOffices;
  }

  /**
   * setCanManageTaskTemplatesForAllRegionsAllOffices.
   **/
  public void setCanManageTaskTemplatesForAllRegionsAllOffices(Boolean canManageTaskTemplatesForAllRegionsAllOffices) {
    this.canManageTaskTemplatesForAllRegionsAllOffices = canManageTaskTemplatesForAllRegionsAllOffices;
  }


  /**
   * canApplyRoomTemplates.
   *
   * @return Permissions
   **/
  public Permissions canApplyRoomTemplates(Boolean canApplyRoomTemplates) {
    this.canApplyRoomTemplates = canApplyRoomTemplates;
    return this;
  }

  /**
   * Get canApplyRoomTemplates.
   * @return canApplyRoomTemplates
   **/
  @ApiModelProperty(value = "")
  public Boolean isCanApplyRoomTemplates() {
    return canApplyRoomTemplates;
  }

  /**
   * setCanApplyRoomTemplates.
   **/
  public void setCanApplyRoomTemplates(Boolean canApplyRoomTemplates) {
    this.canApplyRoomTemplates = canApplyRoomTemplates;
  }


  /**
   * canAddTasksToRooms.
   *
   * @return Permissions
   **/
  public Permissions canAddTasksToRooms(Boolean canAddTasksToRooms) {
    this.canAddTasksToRooms = canAddTasksToRooms;
    return this;
  }

  /**
   * Get canAddTasksToRooms.
   * @return canAddTasksToRooms
   **/
  @ApiModelProperty(value = "")
  public Boolean isCanAddTasksToRooms() {
    return canAddTasksToRooms;
  }

  /**
   * setCanAddTasksToRooms.
   **/
  public void setCanAddTasksToRooms(Boolean canAddTasksToRooms) {
    this.canAddTasksToRooms = canAddTasksToRooms;
  }


  /**
   * canReviewAnyTask.
   *
   * @return Permissions
   **/
  public Permissions canReviewAnyTask(Boolean canReviewAnyTask) {
    this.canReviewAnyTask = canReviewAnyTask;
    return this;
  }

  /**
   * Get canReviewAnyTask.
   * @return canReviewAnyTask
   **/
  @ApiModelProperty(value = "")
  public Boolean isCanReviewAnyTask() {
    return canReviewAnyTask;
  }

  /**
   * setCanReviewAnyTask.
   **/
  public void setCanReviewAnyTask(Boolean canReviewAnyTask) {
    this.canReviewAnyTask = canReviewAnyTask;
  }


  /**
   * canManageDocsOnAnyTask.
   *
   * @return Permissions
   **/
  public Permissions canManageDocsOnAnyTask(Boolean canManageDocsOnAnyTask) {
    this.canManageDocsOnAnyTask = canManageDocsOnAnyTask;
    return this;
  }

  /**
   * Get canManageDocsOnAnyTask.
   * @return canManageDocsOnAnyTask
   **/
  @ApiModelProperty(value = "")
  public Boolean isCanManageDocsOnAnyTask() {
    return canManageDocsOnAnyTask;
  }

  /**
   * setCanManageDocsOnAnyTask.
   **/
  public void setCanManageDocsOnAnyTask(Boolean canManageDocsOnAnyTask) {
    this.canManageDocsOnAnyTask = canManageDocsOnAnyTask;
  }


  /**
   * canAddMemberAndSetRoleLowerAccessLevel.
   *
   * @return Permissions
   **/
  public Permissions canAddMemberAndSetRoleLowerAccessLevel(Boolean canAddMemberAndSetRoleLowerAccessLevel) {
    this.canAddMemberAndSetRoleLowerAccessLevel = canAddMemberAndSetRoleLowerAccessLevel;
    return this;
  }

  /**
   * Get canAddMemberAndSetRoleLowerAccessLevel.
   * @return canAddMemberAndSetRoleLowerAccessLevel
   **/
  @ApiModelProperty(value = "")
  public Boolean isCanAddMemberAndSetRoleLowerAccessLevel() {
    return canAddMemberAndSetRoleLowerAccessLevel;
  }

  /**
   * setCanAddMemberAndSetRoleLowerAccessLevel.
   **/
  public void setCanAddMemberAndSetRoleLowerAccessLevel(Boolean canAddMemberAndSetRoleLowerAccessLevel) {
    this.canAddMemberAndSetRoleLowerAccessLevel = canAddMemberAndSetRoleLowerAccessLevel;
  }


  /**
   * canAddMemberAndSetRoleSameAccessLevel.
   *
   * @return Permissions
   **/
  public Permissions canAddMemberAndSetRoleSameAccessLevel(Boolean canAddMemberAndSetRoleSameAccessLevel) {
    this.canAddMemberAndSetRoleSameAccessLevel = canAddMemberAndSetRoleSameAccessLevel;
    return this;
  }

  /**
   * Get canAddMemberAndSetRoleSameAccessLevel.
   * @return canAddMemberAndSetRoleSameAccessLevel
   **/
  @ApiModelProperty(value = "")
  public Boolean isCanAddMemberAndSetRoleSameAccessLevel() {
    return canAddMemberAndSetRoleSameAccessLevel;
  }

  /**
   * setCanAddMemberAndSetRoleSameAccessLevel.
   **/
  public void setCanAddMemberAndSetRoleSameAccessLevel(Boolean canAddMemberAndSetRoleSameAccessLevel) {
    this.canAddMemberAndSetRoleSameAccessLevel = canAddMemberAndSetRoleSameAccessLevel;
  }


  /**
   * canChangeMemberRoleLowerAccessLevel.
   *
   * @return Permissions
   **/
  public Permissions canChangeMemberRoleLowerAccessLevel(Boolean canChangeMemberRoleLowerAccessLevel) {
    this.canChangeMemberRoleLowerAccessLevel = canChangeMemberRoleLowerAccessLevel;
    return this;
  }

  /**
   * Get canChangeMemberRoleLowerAccessLevel.
   * @return canChangeMemberRoleLowerAccessLevel
   **/
  @ApiModelProperty(value = "")
  public Boolean isCanChangeMemberRoleLowerAccessLevel() {
    return canChangeMemberRoleLowerAccessLevel;
  }

  /**
   * setCanChangeMemberRoleLowerAccessLevel.
   **/
  public void setCanChangeMemberRoleLowerAccessLevel(Boolean canChangeMemberRoleLowerAccessLevel) {
    this.canChangeMemberRoleLowerAccessLevel = canChangeMemberRoleLowerAccessLevel;
  }


  /**
   * canChangeMemberRoleSameAccessLevel.
   *
   * @return Permissions
   **/
  public Permissions canChangeMemberRoleSameAccessLevel(Boolean canChangeMemberRoleSameAccessLevel) {
    this.canChangeMemberRoleSameAccessLevel = canChangeMemberRoleSameAccessLevel;
    return this;
  }

  /**
   * Get canChangeMemberRoleSameAccessLevel.
   * @return canChangeMemberRoleSameAccessLevel
   **/
  @ApiModelProperty(value = "")
  public Boolean isCanChangeMemberRoleSameAccessLevel() {
    return canChangeMemberRoleSameAccessLevel;
  }

  /**
   * setCanChangeMemberRoleSameAccessLevel.
   **/
  public void setCanChangeMemberRoleSameAccessLevel(Boolean canChangeMemberRoleSameAccessLevel) {
    this.canChangeMemberRoleSameAccessLevel = canChangeMemberRoleSameAccessLevel;
  }


  /**
   * canManageMemberLowerAccessLevel.
   *
   * @return Permissions
   **/
  public Permissions canManageMemberLowerAccessLevel(Boolean canManageMemberLowerAccessLevel) {
    this.canManageMemberLowerAccessLevel = canManageMemberLowerAccessLevel;
    return this;
  }

  /**
   * Get canManageMemberLowerAccessLevel.
   * @return canManageMemberLowerAccessLevel
   **/
  @ApiModelProperty(value = "")
  public Boolean isCanManageMemberLowerAccessLevel() {
    return canManageMemberLowerAccessLevel;
  }

  /**
   * setCanManageMemberLowerAccessLevel.
   **/
  public void setCanManageMemberLowerAccessLevel(Boolean canManageMemberLowerAccessLevel) {
    this.canManageMemberLowerAccessLevel = canManageMemberLowerAccessLevel;
  }


  /**
   * canManageMemberSameAccessLevel.
   *
   * @return Permissions
   **/
  public Permissions canManageMemberSameAccessLevel(Boolean canManageMemberSameAccessLevel) {
    this.canManageMemberSameAccessLevel = canManageMemberSameAccessLevel;
    return this;
  }

  /**
   * Get canManageMemberSameAccessLevel.
   * @return canManageMemberSameAccessLevel
   **/
  @ApiModelProperty(value = "")
  public Boolean isCanManageMemberSameAccessLevel() {
    return canManageMemberSameAccessLevel;
  }

  /**
   * setCanManageMemberSameAccessLevel.
   **/
  public void setCanManageMemberSameAccessLevel(Boolean canManageMemberSameAccessLevel) {
    this.canManageMemberSameAccessLevel = canManageMemberSameAccessLevel;
  }


  /**
   * canRemoveCompanyMemberLowerAccessLevel.
   *
   * @return Permissions
   **/
  public Permissions canRemoveCompanyMemberLowerAccessLevel(Boolean canRemoveCompanyMemberLowerAccessLevel) {
    this.canRemoveCompanyMemberLowerAccessLevel = canRemoveCompanyMemberLowerAccessLevel;
    return this;
  }

  /**
   * Get canRemoveCompanyMemberLowerAccessLevel.
   * @return canRemoveCompanyMemberLowerAccessLevel
   **/
  @ApiModelProperty(value = "")
  public Boolean isCanRemoveCompanyMemberLowerAccessLevel() {
    return canRemoveCompanyMemberLowerAccessLevel;
  }

  /**
   * setCanRemoveCompanyMemberLowerAccessLevel.
   **/
  public void setCanRemoveCompanyMemberLowerAccessLevel(Boolean canRemoveCompanyMemberLowerAccessLevel) {
    this.canRemoveCompanyMemberLowerAccessLevel = canRemoveCompanyMemberLowerAccessLevel;
  }


  /**
   * canRemoveCompanyMemberSameAccessLevel.
   *
   * @return Permissions
   **/
  public Permissions canRemoveCompanyMemberSameAccessLevel(Boolean canRemoveCompanyMemberSameAccessLevel) {
    this.canRemoveCompanyMemberSameAccessLevel = canRemoveCompanyMemberSameAccessLevel;
    return this;
  }

  /**
   * Get canRemoveCompanyMemberSameAccessLevel.
   * @return canRemoveCompanyMemberSameAccessLevel
   **/
  @ApiModelProperty(value = "")
  public Boolean isCanRemoveCompanyMemberSameAccessLevel() {
    return canRemoveCompanyMemberSameAccessLevel;
  }

  /**
   * setCanRemoveCompanyMemberSameAccessLevel.
   **/
  public void setCanRemoveCompanyMemberSameAccessLevel(Boolean canRemoveCompanyMemberSameAccessLevel) {
    this.canRemoveCompanyMemberSameAccessLevel = canRemoveCompanyMemberSameAccessLevel;
  }


  /**
   * canManageAccount.
   *
   * @return Permissions
   **/
  public Permissions canManageAccount(Boolean canManageAccount) {
    this.canManageAccount = canManageAccount;
    return this;
  }

  /**
   * Get canManageAccount.
   * @return canManageAccount
   **/
  @ApiModelProperty(value = "")
  public Boolean isCanManageAccount() {
    return canManageAccount;
  }

  /**
   * setCanManageAccount.
   **/
  public void setCanManageAccount(Boolean canManageAccount) {
    this.canManageAccount = canManageAccount;
  }


  /**
   * canManageLogo.
   *
   * @return Permissions
   **/
  public Permissions canManageLogo(Boolean canManageLogo) {
    this.canManageLogo = canManageLogo;
    return this;
  }

  /**
   * Get canManageLogo.
   * @return canManageLogo
   **/
  @ApiModelProperty(value = "")
  public Boolean isCanManageLogo() {
    return canManageLogo;
  }

  /**
   * setCanManageLogo.
   **/
  public void setCanManageLogo(Boolean canManageLogo) {
    this.canManageLogo = canManageLogo;
  }


  /**
   * canManageRolesAndPermissions.
   *
   * @return Permissions
   **/
  public Permissions canManageRolesAndPermissions(Boolean canManageRolesAndPermissions) {
    this.canManageRolesAndPermissions = canManageRolesAndPermissions;
    return this;
  }

  /**
   * Get canManageRolesAndPermissions.
   * @return canManageRolesAndPermissions
   **/
  @ApiModelProperty(value = "")
  public Boolean isCanManageRolesAndPermissions() {
    return canManageRolesAndPermissions;
  }

  /**
   * setCanManageRolesAndPermissions.
   **/
  public void setCanManageRolesAndPermissions(Boolean canManageRolesAndPermissions) {
    this.canManageRolesAndPermissions = canManageRolesAndPermissions;
  }


  /**
   * canManageRoomDetails.
   *
   * @return Permissions
   **/
  public Permissions canManageRoomDetails(Boolean canManageRoomDetails) {
    this.canManageRoomDetails = canManageRoomDetails;
    return this;
  }

  /**
   * Get canManageRoomDetails.
   * @return canManageRoomDetails
   **/
  @ApiModelProperty(value = "")
  public Boolean isCanManageRoomDetails() {
    return canManageRoomDetails;
  }

  /**
   * setCanManageRoomDetails.
   **/
  public void setCanManageRoomDetails(Boolean canManageRoomDetails) {
    this.canManageRoomDetails = canManageRoomDetails;
  }


  /**
   * canManageRoomTemplates.
   *
   * @return Permissions
   **/
  public Permissions canManageRoomTemplates(Boolean canManageRoomTemplates) {
    this.canManageRoomTemplates = canManageRoomTemplates;
    return this;
  }

  /**
   * Get canManageRoomTemplates.
   * @return canManageRoomTemplates
   **/
  @ApiModelProperty(value = "")
  public Boolean isCanManageRoomTemplates() {
    return canManageRoomTemplates;
  }

  /**
   * setCanManageRoomTemplates.
   **/
  public void setCanManageRoomTemplates(Boolean canManageRoomTemplates) {
    this.canManageRoomTemplates = canManageRoomTemplates;
  }


  /**
   * canManageIntegrationSettings.
   *
   * @return Permissions
   **/
  public Permissions canManageIntegrationSettings(Boolean canManageIntegrationSettings) {
    this.canManageIntegrationSettings = canManageIntegrationSettings;
    return this;
  }

  /**
   * Get canManageIntegrationSettings.
   * @return canManageIntegrationSettings
   **/
  @ApiModelProperty(value = "")
  public Boolean isCanManageIntegrationSettings() {
    return canManageIntegrationSettings;
  }

  /**
   * setCanManageIntegrationSettings.
   **/
  public void setCanManageIntegrationSettings(Boolean canManageIntegrationSettings) {
    this.canManageIntegrationSettings = canManageIntegrationSettings;
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
    Permissions permissions = (Permissions) o;
    return Objects.equals(this.canAddUsersToRooms, permissions.canAddUsersToRooms) &&
        Objects.equals(this.canCreateRooms, permissions.canCreateRooms) &&
        Objects.equals(this.canSubmitRoomsForReview, permissions.canSubmitRoomsForReview) &&
        Objects.equals(this.canCloseRooms, permissions.canCloseRooms) &&
        Objects.equals(this.canReopenRooms, permissions.canReopenRooms) &&
        Objects.equals(this.canDeleteOwnedRooms, permissions.canDeleteOwnedRooms) &&
        Objects.equals(this.autoAccessToRooms, permissions.autoAccessToRooms) &&
        Objects.equals(this.canExportRoomActivityDetailsPeople, permissions.canExportRoomActivityDetailsPeople) &&
        Objects.equals(this.canCopyRoomDetails, permissions.canCopyRoomDetails) &&
        Objects.equals(this.canEditAnyRoomRole, permissions.canEditAnyRoomRole) &&
        Objects.equals(this.canEditInvitedRoomRole, permissions.canEditInvitedRoomRole) &&
        Objects.equals(this.canEditRoomSide, permissions.canEditRoomSide) &&
        Objects.equals(this.canManageAnyUserRoomAccess, permissions.canManageAnyUserRoomAccess) &&
        Objects.equals(this.canManageInvitedUserRoomAccess, permissions.canManageInvitedUserRoomAccess) &&
        Objects.equals(this.isHiddenInRoom, permissions.isHiddenInRoom) &&
        Objects.equals(this.canManageRoomOwners, permissions.canManageRoomOwners) &&
        Objects.equals(this.canDeleteRooms, permissions.canDeleteRooms) &&
        Objects.equals(this.canConnectToMortgageCadence, permissions.canConnectToMortgageCadence) &&
        Objects.equals(this.canViewRoomDetails, permissions.canViewRoomDetails) &&
        Objects.equals(this.canViewAndEditRoomDetails, permissions.canViewAndEditRoomDetails) &&
        Objects.equals(this.canSendRoomDetailsToLoneWolf, permissions.canSendRoomDetailsToLoneWolf) &&
        Objects.equals(this.canAddDocuments, permissions.canAddDocuments) &&
        Objects.equals(this.canAddDocumentsFromFormGroups, permissions.canAddDocumentsFromFormGroups) &&
        Objects.equals(this.canAddDocumentsFromFormLibraries, permissions.canAddDocumentsFromFormLibraries) &&
        Objects.equals(this.documentsViewableByOthersInRoomFromOffice, permissions.documentsViewableByOthersInRoomFromOffice) &&
        Objects.equals(this.documentsAutoOwnedByPeers, permissions.documentsAutoOwnedByPeers) &&
        Objects.equals(this.canDeleteOwnedDocuments, permissions.canDeleteOwnedDocuments) &&
        Objects.equals(this.canManageSharedDocs, permissions.canManageSharedDocs) &&
        Objects.equals(this.canManageFormGroups, permissions.canManageFormGroups) &&
        Objects.equals(this.canShareDocsNotOwned, permissions.canShareDocsNotOwned) &&
        Objects.equals(this.canCreateFormTemplates, permissions.canCreateFormTemplates) &&
        Objects.equals(this.canAddTasksToAnyTaskLists, permissions.canAddTasksToAnyTaskLists) &&
        Objects.equals(this.canEditEditableTasks, permissions.canEditEditableTasks) &&
        Objects.equals(this.canEditAnyTasks, permissions.canEditAnyTasks) &&
        Objects.equals(this.canDeleteDeletableTasks, permissions.canDeleteDeletableTasks) &&
        Objects.equals(this.canDeleteAnyTasks, permissions.canDeleteAnyTasks) &&
        Objects.equals(this.canApplyTaskList, permissions.canApplyTaskList) &&
        Objects.equals(this.canRemoveAnyTaskList, permissions.canRemoveAnyTaskList) &&
        Objects.equals(this.canSubmitTaskList, permissions.canSubmitTaskList) &&
        Objects.equals(this.canAutoSubmitTaskList, permissions.canAutoSubmitTaskList) &&
        Objects.equals(this.canReviewTaskList, permissions.canReviewTaskList) &&
        Objects.equals(this.canAutoApproveTaskList, permissions.canAutoApproveTaskList) &&
        Objects.equals(this.canManageTaskTemplatesForAllRegionsAllOffices, permissions.canManageTaskTemplatesForAllRegionsAllOffices) &&
        Objects.equals(this.canApplyRoomTemplates, permissions.canApplyRoomTemplates) &&
        Objects.equals(this.canAddTasksToRooms, permissions.canAddTasksToRooms) &&
        Objects.equals(this.canReviewAnyTask, permissions.canReviewAnyTask) &&
        Objects.equals(this.canManageDocsOnAnyTask, permissions.canManageDocsOnAnyTask) &&
        Objects.equals(this.canAddMemberAndSetRoleLowerAccessLevel, permissions.canAddMemberAndSetRoleLowerAccessLevel) &&
        Objects.equals(this.canAddMemberAndSetRoleSameAccessLevel, permissions.canAddMemberAndSetRoleSameAccessLevel) &&
        Objects.equals(this.canChangeMemberRoleLowerAccessLevel, permissions.canChangeMemberRoleLowerAccessLevel) &&
        Objects.equals(this.canChangeMemberRoleSameAccessLevel, permissions.canChangeMemberRoleSameAccessLevel) &&
        Objects.equals(this.canManageMemberLowerAccessLevel, permissions.canManageMemberLowerAccessLevel) &&
        Objects.equals(this.canManageMemberSameAccessLevel, permissions.canManageMemberSameAccessLevel) &&
        Objects.equals(this.canRemoveCompanyMemberLowerAccessLevel, permissions.canRemoveCompanyMemberLowerAccessLevel) &&
        Objects.equals(this.canRemoveCompanyMemberSameAccessLevel, permissions.canRemoveCompanyMemberSameAccessLevel) &&
        Objects.equals(this.canManageAccount, permissions.canManageAccount) &&
        Objects.equals(this.canManageLogo, permissions.canManageLogo) &&
        Objects.equals(this.canManageRolesAndPermissions, permissions.canManageRolesAndPermissions) &&
        Objects.equals(this.canManageRoomDetails, permissions.canManageRoomDetails) &&
        Objects.equals(this.canManageRoomTemplates, permissions.canManageRoomTemplates) &&
        Objects.equals(this.canManageIntegrationSettings, permissions.canManageIntegrationSettings);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(canAddUsersToRooms, canCreateRooms, canSubmitRoomsForReview, canCloseRooms, canReopenRooms, canDeleteOwnedRooms, autoAccessToRooms, canExportRoomActivityDetailsPeople, canCopyRoomDetails, canEditAnyRoomRole, canEditInvitedRoomRole, canEditRoomSide, canManageAnyUserRoomAccess, canManageInvitedUserRoomAccess, isHiddenInRoom, canManageRoomOwners, canDeleteRooms, canConnectToMortgageCadence, canViewRoomDetails, canViewAndEditRoomDetails, canSendRoomDetailsToLoneWolf, canAddDocuments, canAddDocumentsFromFormGroups, canAddDocumentsFromFormLibraries, documentsViewableByOthersInRoomFromOffice, documentsAutoOwnedByPeers, canDeleteOwnedDocuments, canManageSharedDocs, canManageFormGroups, canShareDocsNotOwned, canCreateFormTemplates, canAddTasksToAnyTaskLists, canEditEditableTasks, canEditAnyTasks, canDeleteDeletableTasks, canDeleteAnyTasks, canApplyTaskList, canRemoveAnyTaskList, canSubmitTaskList, canAutoSubmitTaskList, canReviewTaskList, canAutoApproveTaskList, canManageTaskTemplatesForAllRegionsAllOffices, canApplyRoomTemplates, canAddTasksToRooms, canReviewAnyTask, canManageDocsOnAnyTask, canAddMemberAndSetRoleLowerAccessLevel, canAddMemberAndSetRoleSameAccessLevel, canChangeMemberRoleLowerAccessLevel, canChangeMemberRoleSameAccessLevel, canManageMemberLowerAccessLevel, canManageMemberSameAccessLevel, canRemoveCompanyMemberLowerAccessLevel, canRemoveCompanyMemberSameAccessLevel, canManageAccount, canManageLogo, canManageRolesAndPermissions, canManageRoomDetails, canManageRoomTemplates, canManageIntegrationSettings);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Permissions {\n");
    
    sb.append("    canAddUsersToRooms: ").append(toIndentedString(canAddUsersToRooms)).append("\n");
    sb.append("    canCreateRooms: ").append(toIndentedString(canCreateRooms)).append("\n");
    sb.append("    canSubmitRoomsForReview: ").append(toIndentedString(canSubmitRoomsForReview)).append("\n");
    sb.append("    canCloseRooms: ").append(toIndentedString(canCloseRooms)).append("\n");
    sb.append("    canReopenRooms: ").append(toIndentedString(canReopenRooms)).append("\n");
    sb.append("    canDeleteOwnedRooms: ").append(toIndentedString(canDeleteOwnedRooms)).append("\n");
    sb.append("    autoAccessToRooms: ").append(toIndentedString(autoAccessToRooms)).append("\n");
    sb.append("    canExportRoomActivityDetailsPeople: ").append(toIndentedString(canExportRoomActivityDetailsPeople)).append("\n");
    sb.append("    canCopyRoomDetails: ").append(toIndentedString(canCopyRoomDetails)).append("\n");
    sb.append("    canEditAnyRoomRole: ").append(toIndentedString(canEditAnyRoomRole)).append("\n");
    sb.append("    canEditInvitedRoomRole: ").append(toIndentedString(canEditInvitedRoomRole)).append("\n");
    sb.append("    canEditRoomSide: ").append(toIndentedString(canEditRoomSide)).append("\n");
    sb.append("    canManageAnyUserRoomAccess: ").append(toIndentedString(canManageAnyUserRoomAccess)).append("\n");
    sb.append("    canManageInvitedUserRoomAccess: ").append(toIndentedString(canManageInvitedUserRoomAccess)).append("\n");
    sb.append("    isHiddenInRoom: ").append(toIndentedString(isHiddenInRoom)).append("\n");
    sb.append("    canManageRoomOwners: ").append(toIndentedString(canManageRoomOwners)).append("\n");
    sb.append("    canDeleteRooms: ").append(toIndentedString(canDeleteRooms)).append("\n");
    sb.append("    canConnectToMortgageCadence: ").append(toIndentedString(canConnectToMortgageCadence)).append("\n");
    sb.append("    canViewRoomDetails: ").append(toIndentedString(canViewRoomDetails)).append("\n");
    sb.append("    canViewAndEditRoomDetails: ").append(toIndentedString(canViewAndEditRoomDetails)).append("\n");
    sb.append("    canSendRoomDetailsToLoneWolf: ").append(toIndentedString(canSendRoomDetailsToLoneWolf)).append("\n");
    sb.append("    canAddDocuments: ").append(toIndentedString(canAddDocuments)).append("\n");
    sb.append("    canAddDocumentsFromFormGroups: ").append(toIndentedString(canAddDocumentsFromFormGroups)).append("\n");
    sb.append("    canAddDocumentsFromFormLibraries: ").append(toIndentedString(canAddDocumentsFromFormLibraries)).append("\n");
    sb.append("    documentsViewableByOthersInRoomFromOffice: ").append(toIndentedString(documentsViewableByOthersInRoomFromOffice)).append("\n");
    sb.append("    documentsAutoOwnedByPeers: ").append(toIndentedString(documentsAutoOwnedByPeers)).append("\n");
    sb.append("    canDeleteOwnedDocuments: ").append(toIndentedString(canDeleteOwnedDocuments)).append("\n");
    sb.append("    canManageSharedDocs: ").append(toIndentedString(canManageSharedDocs)).append("\n");
    sb.append("    canManageFormGroups: ").append(toIndentedString(canManageFormGroups)).append("\n");
    sb.append("    canShareDocsNotOwned: ").append(toIndentedString(canShareDocsNotOwned)).append("\n");
    sb.append("    canCreateFormTemplates: ").append(toIndentedString(canCreateFormTemplates)).append("\n");
    sb.append("    canAddTasksToAnyTaskLists: ").append(toIndentedString(canAddTasksToAnyTaskLists)).append("\n");
    sb.append("    canEditEditableTasks: ").append(toIndentedString(canEditEditableTasks)).append("\n");
    sb.append("    canEditAnyTasks: ").append(toIndentedString(canEditAnyTasks)).append("\n");
    sb.append("    canDeleteDeletableTasks: ").append(toIndentedString(canDeleteDeletableTasks)).append("\n");
    sb.append("    canDeleteAnyTasks: ").append(toIndentedString(canDeleteAnyTasks)).append("\n");
    sb.append("    canApplyTaskList: ").append(toIndentedString(canApplyTaskList)).append("\n");
    sb.append("    canRemoveAnyTaskList: ").append(toIndentedString(canRemoveAnyTaskList)).append("\n");
    sb.append("    canSubmitTaskList: ").append(toIndentedString(canSubmitTaskList)).append("\n");
    sb.append("    canAutoSubmitTaskList: ").append(toIndentedString(canAutoSubmitTaskList)).append("\n");
    sb.append("    canReviewTaskList: ").append(toIndentedString(canReviewTaskList)).append("\n");
    sb.append("    canAutoApproveTaskList: ").append(toIndentedString(canAutoApproveTaskList)).append("\n");
    sb.append("    canManageTaskTemplatesForAllRegionsAllOffices: ").append(toIndentedString(canManageTaskTemplatesForAllRegionsAllOffices)).append("\n");
    sb.append("    canApplyRoomTemplates: ").append(toIndentedString(canApplyRoomTemplates)).append("\n");
    sb.append("    canAddTasksToRooms: ").append(toIndentedString(canAddTasksToRooms)).append("\n");
    sb.append("    canReviewAnyTask: ").append(toIndentedString(canReviewAnyTask)).append("\n");
    sb.append("    canManageDocsOnAnyTask: ").append(toIndentedString(canManageDocsOnAnyTask)).append("\n");
    sb.append("    canAddMemberAndSetRoleLowerAccessLevel: ").append(toIndentedString(canAddMemberAndSetRoleLowerAccessLevel)).append("\n");
    sb.append("    canAddMemberAndSetRoleSameAccessLevel: ").append(toIndentedString(canAddMemberAndSetRoleSameAccessLevel)).append("\n");
    sb.append("    canChangeMemberRoleLowerAccessLevel: ").append(toIndentedString(canChangeMemberRoleLowerAccessLevel)).append("\n");
    sb.append("    canChangeMemberRoleSameAccessLevel: ").append(toIndentedString(canChangeMemberRoleSameAccessLevel)).append("\n");
    sb.append("    canManageMemberLowerAccessLevel: ").append(toIndentedString(canManageMemberLowerAccessLevel)).append("\n");
    sb.append("    canManageMemberSameAccessLevel: ").append(toIndentedString(canManageMemberSameAccessLevel)).append("\n");
    sb.append("    canRemoveCompanyMemberLowerAccessLevel: ").append(toIndentedString(canRemoveCompanyMemberLowerAccessLevel)).append("\n");
    sb.append("    canRemoveCompanyMemberSameAccessLevel: ").append(toIndentedString(canRemoveCompanyMemberSameAccessLevel)).append("\n");
    sb.append("    canManageAccount: ").append(toIndentedString(canManageAccount)).append("\n");
    sb.append("    canManageLogo: ").append(toIndentedString(canManageLogo)).append("\n");
    sb.append("    canManageRolesAndPermissions: ").append(toIndentedString(canManageRolesAndPermissions)).append("\n");
    sb.append("    canManageRoomDetails: ").append(toIndentedString(canManageRoomDetails)).append("\n");
    sb.append("    canManageRoomTemplates: ").append(toIndentedString(canManageRoomTemplates)).append("\n");
    sb.append("    canManageIntegrationSettings: ").append(toIndentedString(canManageIntegrationSettings)).append("\n");
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

