package com.docusign.rooms.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Permissions
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

  @JsonProperty("isVisibleInRooms")
  private Boolean isVisibleInRooms = null;

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

  public Permissions canAddUsersToRooms(Boolean canAddUsersToRooms) {
    this.canAddUsersToRooms = canAddUsersToRooms;
    return this;
  }

   /**
   * Get canAddUsersToRooms
   * @return canAddUsersToRooms
  **/
  @ApiModelProperty(value = "")
  public Boolean isCanAddUsersToRooms() {
    return canAddUsersToRooms;
  }

  public void setCanAddUsersToRooms(Boolean canAddUsersToRooms) {
    this.canAddUsersToRooms = canAddUsersToRooms;
  }

  public Permissions canCreateRooms(Boolean canCreateRooms) {
    this.canCreateRooms = canCreateRooms;
    return this;
  }

   /**
   * Get canCreateRooms
   * @return canCreateRooms
  **/
  @ApiModelProperty(value = "")
  public Boolean isCanCreateRooms() {
    return canCreateRooms;
  }

  public void setCanCreateRooms(Boolean canCreateRooms) {
    this.canCreateRooms = canCreateRooms;
  }

  public Permissions canSubmitRoomsForReview(Boolean canSubmitRoomsForReview) {
    this.canSubmitRoomsForReview = canSubmitRoomsForReview;
    return this;
  }

   /**
   * Get canSubmitRoomsForReview
   * @return canSubmitRoomsForReview
  **/
  @ApiModelProperty(value = "")
  public Boolean isCanSubmitRoomsForReview() {
    return canSubmitRoomsForReview;
  }

  public void setCanSubmitRoomsForReview(Boolean canSubmitRoomsForReview) {
    this.canSubmitRoomsForReview = canSubmitRoomsForReview;
  }

  public Permissions canCloseRooms(Boolean canCloseRooms) {
    this.canCloseRooms = canCloseRooms;
    return this;
  }

   /**
   * Get canCloseRooms
   * @return canCloseRooms
  **/
  @ApiModelProperty(value = "")
  public Boolean isCanCloseRooms() {
    return canCloseRooms;
  }

  public void setCanCloseRooms(Boolean canCloseRooms) {
    this.canCloseRooms = canCloseRooms;
  }

  public Permissions canReopenRooms(Boolean canReopenRooms) {
    this.canReopenRooms = canReopenRooms;
    return this;
  }

   /**
   * Get canReopenRooms
   * @return canReopenRooms
  **/
  @ApiModelProperty(value = "")
  public Boolean isCanReopenRooms() {
    return canReopenRooms;
  }

  public void setCanReopenRooms(Boolean canReopenRooms) {
    this.canReopenRooms = canReopenRooms;
  }

  public Permissions canDeleteOwnedRooms(Boolean canDeleteOwnedRooms) {
    this.canDeleteOwnedRooms = canDeleteOwnedRooms;
    return this;
  }

   /**
   * Get canDeleteOwnedRooms
   * @return canDeleteOwnedRooms
  **/
  @ApiModelProperty(value = "")
  public Boolean isCanDeleteOwnedRooms() {
    return canDeleteOwnedRooms;
  }

  public void setCanDeleteOwnedRooms(Boolean canDeleteOwnedRooms) {
    this.canDeleteOwnedRooms = canDeleteOwnedRooms;
  }

  public Permissions autoAccessToRooms(Boolean autoAccessToRooms) {
    this.autoAccessToRooms = autoAccessToRooms;
    return this;
  }

   /**
   * Get autoAccessToRooms
   * @return autoAccessToRooms
  **/
  @ApiModelProperty(value = "")
  public Boolean isAutoAccessToRooms() {
    return autoAccessToRooms;
  }

  public void setAutoAccessToRooms(Boolean autoAccessToRooms) {
    this.autoAccessToRooms = autoAccessToRooms;
  }

  public Permissions canExportRoomActivityDetailsPeople(Boolean canExportRoomActivityDetailsPeople) {
    this.canExportRoomActivityDetailsPeople = canExportRoomActivityDetailsPeople;
    return this;
  }

   /**
   * Get canExportRoomActivityDetailsPeople
   * @return canExportRoomActivityDetailsPeople
  **/
  @ApiModelProperty(value = "")
  public Boolean isCanExportRoomActivityDetailsPeople() {
    return canExportRoomActivityDetailsPeople;
  }

  public void setCanExportRoomActivityDetailsPeople(Boolean canExportRoomActivityDetailsPeople) {
    this.canExportRoomActivityDetailsPeople = canExportRoomActivityDetailsPeople;
  }

  public Permissions isVisibleInRooms(Boolean isVisibleInRooms) {
    this.isVisibleInRooms = isVisibleInRooms;
    return this;
  }

   /**
   * Get isVisibleInRooms
   * @return isVisibleInRooms
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsVisibleInRooms() {
    return isVisibleInRooms;
  }

  public void setIsVisibleInRooms(Boolean isVisibleInRooms) {
    this.isVisibleInRooms = isVisibleInRooms;
  }

  public Permissions canCopyRoomDetails(Boolean canCopyRoomDetails) {
    this.canCopyRoomDetails = canCopyRoomDetails;
    return this;
  }

   /**
   * Get canCopyRoomDetails
   * @return canCopyRoomDetails
  **/
  @ApiModelProperty(value = "")
  public Boolean isCanCopyRoomDetails() {
    return canCopyRoomDetails;
  }

  public void setCanCopyRoomDetails(Boolean canCopyRoomDetails) {
    this.canCopyRoomDetails = canCopyRoomDetails;
  }

  public Permissions canEditAnyRoomRole(Boolean canEditAnyRoomRole) {
    this.canEditAnyRoomRole = canEditAnyRoomRole;
    return this;
  }

   /**
   * Get canEditAnyRoomRole
   * @return canEditAnyRoomRole
  **/
  @ApiModelProperty(value = "")
  public Boolean isCanEditAnyRoomRole() {
    return canEditAnyRoomRole;
  }

  public void setCanEditAnyRoomRole(Boolean canEditAnyRoomRole) {
    this.canEditAnyRoomRole = canEditAnyRoomRole;
  }

  public Permissions canEditInvitedRoomRole(Boolean canEditInvitedRoomRole) {
    this.canEditInvitedRoomRole = canEditInvitedRoomRole;
    return this;
  }

   /**
   * Get canEditInvitedRoomRole
   * @return canEditInvitedRoomRole
  **/
  @ApiModelProperty(value = "")
  public Boolean isCanEditInvitedRoomRole() {
    return canEditInvitedRoomRole;
  }

  public void setCanEditInvitedRoomRole(Boolean canEditInvitedRoomRole) {
    this.canEditInvitedRoomRole = canEditInvitedRoomRole;
  }

  public Permissions canEditRoomSide(Boolean canEditRoomSide) {
    this.canEditRoomSide = canEditRoomSide;
    return this;
  }

   /**
   * Get canEditRoomSide
   * @return canEditRoomSide
  **/
  @ApiModelProperty(value = "")
  public Boolean isCanEditRoomSide() {
    return canEditRoomSide;
  }

  public void setCanEditRoomSide(Boolean canEditRoomSide) {
    this.canEditRoomSide = canEditRoomSide;
  }

  public Permissions canManageAnyUserRoomAccess(Boolean canManageAnyUserRoomAccess) {
    this.canManageAnyUserRoomAccess = canManageAnyUserRoomAccess;
    return this;
  }

   /**
   * Get canManageAnyUserRoomAccess
   * @return canManageAnyUserRoomAccess
  **/
  @ApiModelProperty(value = "")
  public Boolean isCanManageAnyUserRoomAccess() {
    return canManageAnyUserRoomAccess;
  }

  public void setCanManageAnyUserRoomAccess(Boolean canManageAnyUserRoomAccess) {
    this.canManageAnyUserRoomAccess = canManageAnyUserRoomAccess;
  }

  public Permissions canManageInvitedUserRoomAccess(Boolean canManageInvitedUserRoomAccess) {
    this.canManageInvitedUserRoomAccess = canManageInvitedUserRoomAccess;
    return this;
  }

   /**
   * Get canManageInvitedUserRoomAccess
   * @return canManageInvitedUserRoomAccess
  **/
  @ApiModelProperty(value = "")
  public Boolean isCanManageInvitedUserRoomAccess() {
    return canManageInvitedUserRoomAccess;
  }

  public void setCanManageInvitedUserRoomAccess(Boolean canManageInvitedUserRoomAccess) {
    this.canManageInvitedUserRoomAccess = canManageInvitedUserRoomAccess;
  }

  public Permissions isHiddenInRoom(Boolean isHiddenInRoom) {
    this.isHiddenInRoom = isHiddenInRoom;
    return this;
  }

   /**
   * Get isHiddenInRoom
   * @return isHiddenInRoom
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsHiddenInRoom() {
    return isHiddenInRoom;
  }

  public void setIsHiddenInRoom(Boolean isHiddenInRoom) {
    this.isHiddenInRoom = isHiddenInRoom;
  }

  public Permissions canManageRoomOwners(Boolean canManageRoomOwners) {
    this.canManageRoomOwners = canManageRoomOwners;
    return this;
  }

   /**
   * Get canManageRoomOwners
   * @return canManageRoomOwners
  **/
  @ApiModelProperty(value = "")
  public Boolean isCanManageRoomOwners() {
    return canManageRoomOwners;
  }

  public void setCanManageRoomOwners(Boolean canManageRoomOwners) {
    this.canManageRoomOwners = canManageRoomOwners;
  }

  public Permissions canDeleteRooms(Boolean canDeleteRooms) {
    this.canDeleteRooms = canDeleteRooms;
    return this;
  }

   /**
   * Get canDeleteRooms
   * @return canDeleteRooms
  **/
  @ApiModelProperty(value = "")
  public Boolean isCanDeleteRooms() {
    return canDeleteRooms;
  }

  public void setCanDeleteRooms(Boolean canDeleteRooms) {
    this.canDeleteRooms = canDeleteRooms;
  }

  public Permissions canConnectToMortgageCadence(Boolean canConnectToMortgageCadence) {
    this.canConnectToMortgageCadence = canConnectToMortgageCadence;
    return this;
  }

   /**
   * Get canConnectToMortgageCadence
   * @return canConnectToMortgageCadence
  **/
  @ApiModelProperty(value = "")
  public Boolean isCanConnectToMortgageCadence() {
    return canConnectToMortgageCadence;
  }

  public void setCanConnectToMortgageCadence(Boolean canConnectToMortgageCadence) {
    this.canConnectToMortgageCadence = canConnectToMortgageCadence;
  }

  public Permissions canViewRoomDetails(Boolean canViewRoomDetails) {
    this.canViewRoomDetails = canViewRoomDetails;
    return this;
  }

   /**
   * Get canViewRoomDetails
   * @return canViewRoomDetails
  **/
  @ApiModelProperty(value = "")
  public Boolean isCanViewRoomDetails() {
    return canViewRoomDetails;
  }

  public void setCanViewRoomDetails(Boolean canViewRoomDetails) {
    this.canViewRoomDetails = canViewRoomDetails;
  }

  public Permissions canViewAndEditRoomDetails(Boolean canViewAndEditRoomDetails) {
    this.canViewAndEditRoomDetails = canViewAndEditRoomDetails;
    return this;
  }

   /**
   * Get canViewAndEditRoomDetails
   * @return canViewAndEditRoomDetails
  **/
  @ApiModelProperty(value = "")
  public Boolean isCanViewAndEditRoomDetails() {
    return canViewAndEditRoomDetails;
  }

  public void setCanViewAndEditRoomDetails(Boolean canViewAndEditRoomDetails) {
    this.canViewAndEditRoomDetails = canViewAndEditRoomDetails;
  }

  public Permissions canSendRoomDetailsToLoneWolf(Boolean canSendRoomDetailsToLoneWolf) {
    this.canSendRoomDetailsToLoneWolf = canSendRoomDetailsToLoneWolf;
    return this;
  }

   /**
   * Get canSendRoomDetailsToLoneWolf
   * @return canSendRoomDetailsToLoneWolf
  **/
  @ApiModelProperty(value = "")
  public Boolean isCanSendRoomDetailsToLoneWolf() {
    return canSendRoomDetailsToLoneWolf;
  }

  public void setCanSendRoomDetailsToLoneWolf(Boolean canSendRoomDetailsToLoneWolf) {
    this.canSendRoomDetailsToLoneWolf = canSendRoomDetailsToLoneWolf;
  }

  public Permissions canAddDocuments(Boolean canAddDocuments) {
    this.canAddDocuments = canAddDocuments;
    return this;
  }

   /**
   * Get canAddDocuments
   * @return canAddDocuments
  **/
  @ApiModelProperty(value = "")
  public Boolean isCanAddDocuments() {
    return canAddDocuments;
  }

  public void setCanAddDocuments(Boolean canAddDocuments) {
    this.canAddDocuments = canAddDocuments;
  }

  public Permissions canAddDocumentsFromFormGroups(Boolean canAddDocumentsFromFormGroups) {
    this.canAddDocumentsFromFormGroups = canAddDocumentsFromFormGroups;
    return this;
  }

   /**
   * Get canAddDocumentsFromFormGroups
   * @return canAddDocumentsFromFormGroups
  **/
  @ApiModelProperty(value = "")
  public Boolean isCanAddDocumentsFromFormGroups() {
    return canAddDocumentsFromFormGroups;
  }

  public void setCanAddDocumentsFromFormGroups(Boolean canAddDocumentsFromFormGroups) {
    this.canAddDocumentsFromFormGroups = canAddDocumentsFromFormGroups;
  }

  public Permissions canAddDocumentsFromFormLibraries(Boolean canAddDocumentsFromFormLibraries) {
    this.canAddDocumentsFromFormLibraries = canAddDocumentsFromFormLibraries;
    return this;
  }

   /**
   * Get canAddDocumentsFromFormLibraries
   * @return canAddDocumentsFromFormLibraries
  **/
  @ApiModelProperty(value = "")
  public Boolean isCanAddDocumentsFromFormLibraries() {
    return canAddDocumentsFromFormLibraries;
  }

  public void setCanAddDocumentsFromFormLibraries(Boolean canAddDocumentsFromFormLibraries) {
    this.canAddDocumentsFromFormLibraries = canAddDocumentsFromFormLibraries;
  }

  public Permissions documentsViewableByOthersInRoomFromOffice(Boolean documentsViewableByOthersInRoomFromOffice) {
    this.documentsViewableByOthersInRoomFromOffice = documentsViewableByOthersInRoomFromOffice;
    return this;
  }

   /**
   * Get documentsViewableByOthersInRoomFromOffice
   * @return documentsViewableByOthersInRoomFromOffice
  **/
  @ApiModelProperty(value = "")
  public Boolean isDocumentsViewableByOthersInRoomFromOffice() {
    return documentsViewableByOthersInRoomFromOffice;
  }

  public void setDocumentsViewableByOthersInRoomFromOffice(Boolean documentsViewableByOthersInRoomFromOffice) {
    this.documentsViewableByOthersInRoomFromOffice = documentsViewableByOthersInRoomFromOffice;
  }

  public Permissions documentsAutoOwnedByPeers(Boolean documentsAutoOwnedByPeers) {
    this.documentsAutoOwnedByPeers = documentsAutoOwnedByPeers;
    return this;
  }

   /**
   * Get documentsAutoOwnedByPeers
   * @return documentsAutoOwnedByPeers
  **/
  @ApiModelProperty(value = "")
  public Boolean isDocumentsAutoOwnedByPeers() {
    return documentsAutoOwnedByPeers;
  }

  public void setDocumentsAutoOwnedByPeers(Boolean documentsAutoOwnedByPeers) {
    this.documentsAutoOwnedByPeers = documentsAutoOwnedByPeers;
  }

  public Permissions canDeleteOwnedDocuments(Boolean canDeleteOwnedDocuments) {
    this.canDeleteOwnedDocuments = canDeleteOwnedDocuments;
    return this;
  }

   /**
   * Get canDeleteOwnedDocuments
   * @return canDeleteOwnedDocuments
  **/
  @ApiModelProperty(value = "")
  public Boolean isCanDeleteOwnedDocuments() {
    return canDeleteOwnedDocuments;
  }

  public void setCanDeleteOwnedDocuments(Boolean canDeleteOwnedDocuments) {
    this.canDeleteOwnedDocuments = canDeleteOwnedDocuments;
  }

  public Permissions canManageSharedDocs(Boolean canManageSharedDocs) {
    this.canManageSharedDocs = canManageSharedDocs;
    return this;
  }

   /**
   * Get canManageSharedDocs
   * @return canManageSharedDocs
  **/
  @ApiModelProperty(value = "")
  public Boolean isCanManageSharedDocs() {
    return canManageSharedDocs;
  }

  public void setCanManageSharedDocs(Boolean canManageSharedDocs) {
    this.canManageSharedDocs = canManageSharedDocs;
  }

  public Permissions canManageFormGroups(Boolean canManageFormGroups) {
    this.canManageFormGroups = canManageFormGroups;
    return this;
  }

   /**
   * Get canManageFormGroups
   * @return canManageFormGroups
  **/
  @ApiModelProperty(value = "")
  public Boolean isCanManageFormGroups() {
    return canManageFormGroups;
  }

  public void setCanManageFormGroups(Boolean canManageFormGroups) {
    this.canManageFormGroups = canManageFormGroups;
  }

  public Permissions canShareDocsNotOwned(Boolean canShareDocsNotOwned) {
    this.canShareDocsNotOwned = canShareDocsNotOwned;
    return this;
  }

   /**
   * Get canShareDocsNotOwned
   * @return canShareDocsNotOwned
  **/
  @ApiModelProperty(value = "")
  public Boolean isCanShareDocsNotOwned() {
    return canShareDocsNotOwned;
  }

  public void setCanShareDocsNotOwned(Boolean canShareDocsNotOwned) {
    this.canShareDocsNotOwned = canShareDocsNotOwned;
  }

  public Permissions canAddTasksToAnyTaskLists(Boolean canAddTasksToAnyTaskLists) {
    this.canAddTasksToAnyTaskLists = canAddTasksToAnyTaskLists;
    return this;
  }

   /**
   * Get canAddTasksToAnyTaskLists
   * @return canAddTasksToAnyTaskLists
  **/
  @ApiModelProperty(value = "")
  public Boolean isCanAddTasksToAnyTaskLists() {
    return canAddTasksToAnyTaskLists;
  }

  public void setCanAddTasksToAnyTaskLists(Boolean canAddTasksToAnyTaskLists) {
    this.canAddTasksToAnyTaskLists = canAddTasksToAnyTaskLists;
  }

  public Permissions canEditEditableTasks(Boolean canEditEditableTasks) {
    this.canEditEditableTasks = canEditEditableTasks;
    return this;
  }

   /**
   * Get canEditEditableTasks
   * @return canEditEditableTasks
  **/
  @ApiModelProperty(value = "")
  public Boolean isCanEditEditableTasks() {
    return canEditEditableTasks;
  }

  public void setCanEditEditableTasks(Boolean canEditEditableTasks) {
    this.canEditEditableTasks = canEditEditableTasks;
  }

  public Permissions canEditAnyTasks(Boolean canEditAnyTasks) {
    this.canEditAnyTasks = canEditAnyTasks;
    return this;
  }

   /**
   * Get canEditAnyTasks
   * @return canEditAnyTasks
  **/
  @ApiModelProperty(value = "")
  public Boolean isCanEditAnyTasks() {
    return canEditAnyTasks;
  }

  public void setCanEditAnyTasks(Boolean canEditAnyTasks) {
    this.canEditAnyTasks = canEditAnyTasks;
  }

  public Permissions canDeleteDeletableTasks(Boolean canDeleteDeletableTasks) {
    this.canDeleteDeletableTasks = canDeleteDeletableTasks;
    return this;
  }

   /**
   * Get canDeleteDeletableTasks
   * @return canDeleteDeletableTasks
  **/
  @ApiModelProperty(value = "")
  public Boolean isCanDeleteDeletableTasks() {
    return canDeleteDeletableTasks;
  }

  public void setCanDeleteDeletableTasks(Boolean canDeleteDeletableTasks) {
    this.canDeleteDeletableTasks = canDeleteDeletableTasks;
  }

  public Permissions canDeleteAnyTasks(Boolean canDeleteAnyTasks) {
    this.canDeleteAnyTasks = canDeleteAnyTasks;
    return this;
  }

   /**
   * Get canDeleteAnyTasks
   * @return canDeleteAnyTasks
  **/
  @ApiModelProperty(value = "")
  public Boolean isCanDeleteAnyTasks() {
    return canDeleteAnyTasks;
  }

  public void setCanDeleteAnyTasks(Boolean canDeleteAnyTasks) {
    this.canDeleteAnyTasks = canDeleteAnyTasks;
  }

  public Permissions canApplyTaskList(Boolean canApplyTaskList) {
    this.canApplyTaskList = canApplyTaskList;
    return this;
  }

   /**
   * Get canApplyTaskList
   * @return canApplyTaskList
  **/
  @ApiModelProperty(value = "")
  public Boolean isCanApplyTaskList() {
    return canApplyTaskList;
  }

  public void setCanApplyTaskList(Boolean canApplyTaskList) {
    this.canApplyTaskList = canApplyTaskList;
  }

  public Permissions canRemoveAnyTaskList(Boolean canRemoveAnyTaskList) {
    this.canRemoveAnyTaskList = canRemoveAnyTaskList;
    return this;
  }

   /**
   * Get canRemoveAnyTaskList
   * @return canRemoveAnyTaskList
  **/
  @ApiModelProperty(value = "")
  public Boolean isCanRemoveAnyTaskList() {
    return canRemoveAnyTaskList;
  }

  public void setCanRemoveAnyTaskList(Boolean canRemoveAnyTaskList) {
    this.canRemoveAnyTaskList = canRemoveAnyTaskList;
  }

  public Permissions canSubmitTaskList(Boolean canSubmitTaskList) {
    this.canSubmitTaskList = canSubmitTaskList;
    return this;
  }

   /**
   * Get canSubmitTaskList
   * @return canSubmitTaskList
  **/
  @ApiModelProperty(value = "")
  public Boolean isCanSubmitTaskList() {
    return canSubmitTaskList;
  }

  public void setCanSubmitTaskList(Boolean canSubmitTaskList) {
    this.canSubmitTaskList = canSubmitTaskList;
  }

  public Permissions canAutoSubmitTaskList(Boolean canAutoSubmitTaskList) {
    this.canAutoSubmitTaskList = canAutoSubmitTaskList;
    return this;
  }

   /**
   * Get canAutoSubmitTaskList
   * @return canAutoSubmitTaskList
  **/
  @ApiModelProperty(value = "")
  public Boolean isCanAutoSubmitTaskList() {
    return canAutoSubmitTaskList;
  }

  public void setCanAutoSubmitTaskList(Boolean canAutoSubmitTaskList) {
    this.canAutoSubmitTaskList = canAutoSubmitTaskList;
  }

  public Permissions canReviewTaskList(Boolean canReviewTaskList) {
    this.canReviewTaskList = canReviewTaskList;
    return this;
  }

   /**
   * Get canReviewTaskList
   * @return canReviewTaskList
  **/
  @ApiModelProperty(value = "")
  public Boolean isCanReviewTaskList() {
    return canReviewTaskList;
  }

  public void setCanReviewTaskList(Boolean canReviewTaskList) {
    this.canReviewTaskList = canReviewTaskList;
  }

  public Permissions canAutoApproveTaskList(Boolean canAutoApproveTaskList) {
    this.canAutoApproveTaskList = canAutoApproveTaskList;
    return this;
  }

   /**
   * Get canAutoApproveTaskList
   * @return canAutoApproveTaskList
  **/
  @ApiModelProperty(value = "")
  public Boolean isCanAutoApproveTaskList() {
    return canAutoApproveTaskList;
  }

  public void setCanAutoApproveTaskList(Boolean canAutoApproveTaskList) {
    this.canAutoApproveTaskList = canAutoApproveTaskList;
  }

  public Permissions canManageTaskTemplatesForAllRegionsAllOffices(Boolean canManageTaskTemplatesForAllRegionsAllOffices) {
    this.canManageTaskTemplatesForAllRegionsAllOffices = canManageTaskTemplatesForAllRegionsAllOffices;
    return this;
  }

   /**
   * Get canManageTaskTemplatesForAllRegionsAllOffices
   * @return canManageTaskTemplatesForAllRegionsAllOffices
  **/
  @ApiModelProperty(value = "")
  public Boolean isCanManageTaskTemplatesForAllRegionsAllOffices() {
    return canManageTaskTemplatesForAllRegionsAllOffices;
  }

  public void setCanManageTaskTemplatesForAllRegionsAllOffices(Boolean canManageTaskTemplatesForAllRegionsAllOffices) {
    this.canManageTaskTemplatesForAllRegionsAllOffices = canManageTaskTemplatesForAllRegionsAllOffices;
  }

  public Permissions canApplyRoomTemplates(Boolean canApplyRoomTemplates) {
    this.canApplyRoomTemplates = canApplyRoomTemplates;
    return this;
  }

   /**
   * Get canApplyRoomTemplates
   * @return canApplyRoomTemplates
  **/
  @ApiModelProperty(value = "")
  public Boolean isCanApplyRoomTemplates() {
    return canApplyRoomTemplates;
  }

  public void setCanApplyRoomTemplates(Boolean canApplyRoomTemplates) {
    this.canApplyRoomTemplates = canApplyRoomTemplates;
  }

  public Permissions canAddTasksToRooms(Boolean canAddTasksToRooms) {
    this.canAddTasksToRooms = canAddTasksToRooms;
    return this;
  }

   /**
   * Get canAddTasksToRooms
   * @return canAddTasksToRooms
  **/
  @ApiModelProperty(value = "")
  public Boolean isCanAddTasksToRooms() {
    return canAddTasksToRooms;
  }

  public void setCanAddTasksToRooms(Boolean canAddTasksToRooms) {
    this.canAddTasksToRooms = canAddTasksToRooms;
  }

  public Permissions canReviewAnyTask(Boolean canReviewAnyTask) {
    this.canReviewAnyTask = canReviewAnyTask;
    return this;
  }

   /**
   * Get canReviewAnyTask
   * @return canReviewAnyTask
  **/
  @ApiModelProperty(value = "")
  public Boolean isCanReviewAnyTask() {
    return canReviewAnyTask;
  }

  public void setCanReviewAnyTask(Boolean canReviewAnyTask) {
    this.canReviewAnyTask = canReviewAnyTask;
  }

  public Permissions canManageDocsOnAnyTask(Boolean canManageDocsOnAnyTask) {
    this.canManageDocsOnAnyTask = canManageDocsOnAnyTask;
    return this;
  }

   /**
   * Get canManageDocsOnAnyTask
   * @return canManageDocsOnAnyTask
  **/
  @ApiModelProperty(value = "")
  public Boolean isCanManageDocsOnAnyTask() {
    return canManageDocsOnAnyTask;
  }

  public void setCanManageDocsOnAnyTask(Boolean canManageDocsOnAnyTask) {
    this.canManageDocsOnAnyTask = canManageDocsOnAnyTask;
  }

  public Permissions canAddMemberAndSetRoleLowerAccessLevel(Boolean canAddMemberAndSetRoleLowerAccessLevel) {
    this.canAddMemberAndSetRoleLowerAccessLevel = canAddMemberAndSetRoleLowerAccessLevel;
    return this;
  }

   /**
   * Get canAddMemberAndSetRoleLowerAccessLevel
   * @return canAddMemberAndSetRoleLowerAccessLevel
  **/
  @ApiModelProperty(value = "")
  public Boolean isCanAddMemberAndSetRoleLowerAccessLevel() {
    return canAddMemberAndSetRoleLowerAccessLevel;
  }

  public void setCanAddMemberAndSetRoleLowerAccessLevel(Boolean canAddMemberAndSetRoleLowerAccessLevel) {
    this.canAddMemberAndSetRoleLowerAccessLevel = canAddMemberAndSetRoleLowerAccessLevel;
  }

  public Permissions canAddMemberAndSetRoleSameAccessLevel(Boolean canAddMemberAndSetRoleSameAccessLevel) {
    this.canAddMemberAndSetRoleSameAccessLevel = canAddMemberAndSetRoleSameAccessLevel;
    return this;
  }

   /**
   * Get canAddMemberAndSetRoleSameAccessLevel
   * @return canAddMemberAndSetRoleSameAccessLevel
  **/
  @ApiModelProperty(value = "")
  public Boolean isCanAddMemberAndSetRoleSameAccessLevel() {
    return canAddMemberAndSetRoleSameAccessLevel;
  }

  public void setCanAddMemberAndSetRoleSameAccessLevel(Boolean canAddMemberAndSetRoleSameAccessLevel) {
    this.canAddMemberAndSetRoleSameAccessLevel = canAddMemberAndSetRoleSameAccessLevel;
  }

  public Permissions canChangeMemberRoleLowerAccessLevel(Boolean canChangeMemberRoleLowerAccessLevel) {
    this.canChangeMemberRoleLowerAccessLevel = canChangeMemberRoleLowerAccessLevel;
    return this;
  }

   /**
   * Get canChangeMemberRoleLowerAccessLevel
   * @return canChangeMemberRoleLowerAccessLevel
  **/
  @ApiModelProperty(value = "")
  public Boolean isCanChangeMemberRoleLowerAccessLevel() {
    return canChangeMemberRoleLowerAccessLevel;
  }

  public void setCanChangeMemberRoleLowerAccessLevel(Boolean canChangeMemberRoleLowerAccessLevel) {
    this.canChangeMemberRoleLowerAccessLevel = canChangeMemberRoleLowerAccessLevel;
  }

  public Permissions canChangeMemberRoleSameAccessLevel(Boolean canChangeMemberRoleSameAccessLevel) {
    this.canChangeMemberRoleSameAccessLevel = canChangeMemberRoleSameAccessLevel;
    return this;
  }

   /**
   * Get canChangeMemberRoleSameAccessLevel
   * @return canChangeMemberRoleSameAccessLevel
  **/
  @ApiModelProperty(value = "")
  public Boolean isCanChangeMemberRoleSameAccessLevel() {
    return canChangeMemberRoleSameAccessLevel;
  }

  public void setCanChangeMemberRoleSameAccessLevel(Boolean canChangeMemberRoleSameAccessLevel) {
    this.canChangeMemberRoleSameAccessLevel = canChangeMemberRoleSameAccessLevel;
  }

  public Permissions canManageMemberLowerAccessLevel(Boolean canManageMemberLowerAccessLevel) {
    this.canManageMemberLowerAccessLevel = canManageMemberLowerAccessLevel;
    return this;
  }

   /**
   * Get canManageMemberLowerAccessLevel
   * @return canManageMemberLowerAccessLevel
  **/
  @ApiModelProperty(value = "")
  public Boolean isCanManageMemberLowerAccessLevel() {
    return canManageMemberLowerAccessLevel;
  }

  public void setCanManageMemberLowerAccessLevel(Boolean canManageMemberLowerAccessLevel) {
    this.canManageMemberLowerAccessLevel = canManageMemberLowerAccessLevel;
  }

  public Permissions canManageMemberSameAccessLevel(Boolean canManageMemberSameAccessLevel) {
    this.canManageMemberSameAccessLevel = canManageMemberSameAccessLevel;
    return this;
  }

   /**
   * Get canManageMemberSameAccessLevel
   * @return canManageMemberSameAccessLevel
  **/
  @ApiModelProperty(value = "")
  public Boolean isCanManageMemberSameAccessLevel() {
    return canManageMemberSameAccessLevel;
  }

  public void setCanManageMemberSameAccessLevel(Boolean canManageMemberSameAccessLevel) {
    this.canManageMemberSameAccessLevel = canManageMemberSameAccessLevel;
  }

  public Permissions canRemoveCompanyMemberLowerAccessLevel(Boolean canRemoveCompanyMemberLowerAccessLevel) {
    this.canRemoveCompanyMemberLowerAccessLevel = canRemoveCompanyMemberLowerAccessLevel;
    return this;
  }

   /**
   * Get canRemoveCompanyMemberLowerAccessLevel
   * @return canRemoveCompanyMemberLowerAccessLevel
  **/
  @ApiModelProperty(value = "")
  public Boolean isCanRemoveCompanyMemberLowerAccessLevel() {
    return canRemoveCompanyMemberLowerAccessLevel;
  }

  public void setCanRemoveCompanyMemberLowerAccessLevel(Boolean canRemoveCompanyMemberLowerAccessLevel) {
    this.canRemoveCompanyMemberLowerAccessLevel = canRemoveCompanyMemberLowerAccessLevel;
  }

  public Permissions canRemoveCompanyMemberSameAccessLevel(Boolean canRemoveCompanyMemberSameAccessLevel) {
    this.canRemoveCompanyMemberSameAccessLevel = canRemoveCompanyMemberSameAccessLevel;
    return this;
  }

   /**
   * Get canRemoveCompanyMemberSameAccessLevel
   * @return canRemoveCompanyMemberSameAccessLevel
  **/
  @ApiModelProperty(value = "")
  public Boolean isCanRemoveCompanyMemberSameAccessLevel() {
    return canRemoveCompanyMemberSameAccessLevel;
  }

  public void setCanRemoveCompanyMemberSameAccessLevel(Boolean canRemoveCompanyMemberSameAccessLevel) {
    this.canRemoveCompanyMemberSameAccessLevel = canRemoveCompanyMemberSameAccessLevel;
  }

  public Permissions canManageAccount(Boolean canManageAccount) {
    this.canManageAccount = canManageAccount;
    return this;
  }

   /**
   * Get canManageAccount
   * @return canManageAccount
  **/
  @ApiModelProperty(value = "")
  public Boolean isCanManageAccount() {
    return canManageAccount;
  }

  public void setCanManageAccount(Boolean canManageAccount) {
    this.canManageAccount = canManageAccount;
  }

  public Permissions canManageLogo(Boolean canManageLogo) {
    this.canManageLogo = canManageLogo;
    return this;
  }

   /**
   * Get canManageLogo
   * @return canManageLogo
  **/
  @ApiModelProperty(value = "")
  public Boolean isCanManageLogo() {
    return canManageLogo;
  }

  public void setCanManageLogo(Boolean canManageLogo) {
    this.canManageLogo = canManageLogo;
  }

  public Permissions canManageRolesAndPermissions(Boolean canManageRolesAndPermissions) {
    this.canManageRolesAndPermissions = canManageRolesAndPermissions;
    return this;
  }

   /**
   * Get canManageRolesAndPermissions
   * @return canManageRolesAndPermissions
  **/
  @ApiModelProperty(value = "")
  public Boolean isCanManageRolesAndPermissions() {
    return canManageRolesAndPermissions;
  }

  public void setCanManageRolesAndPermissions(Boolean canManageRolesAndPermissions) {
    this.canManageRolesAndPermissions = canManageRolesAndPermissions;
  }

  public Permissions canManageRoomDetails(Boolean canManageRoomDetails) {
    this.canManageRoomDetails = canManageRoomDetails;
    return this;
  }

   /**
   * Get canManageRoomDetails
   * @return canManageRoomDetails
  **/
  @ApiModelProperty(value = "")
  public Boolean isCanManageRoomDetails() {
    return canManageRoomDetails;
  }

  public void setCanManageRoomDetails(Boolean canManageRoomDetails) {
    this.canManageRoomDetails = canManageRoomDetails;
  }

  public Permissions canManageRoomTemplates(Boolean canManageRoomTemplates) {
    this.canManageRoomTemplates = canManageRoomTemplates;
    return this;
  }

   /**
   * Get canManageRoomTemplates
   * @return canManageRoomTemplates
  **/
  @ApiModelProperty(value = "")
  public Boolean isCanManageRoomTemplates() {
    return canManageRoomTemplates;
  }

  public void setCanManageRoomTemplates(Boolean canManageRoomTemplates) {
    this.canManageRoomTemplates = canManageRoomTemplates;
  }

  public Permissions canManageIntegrationSettings(Boolean canManageIntegrationSettings) {
    this.canManageIntegrationSettings = canManageIntegrationSettings;
    return this;
  }

   /**
   * Get canManageIntegrationSettings
   * @return canManageIntegrationSettings
  **/
  @ApiModelProperty(value = "")
  public Boolean isCanManageIntegrationSettings() {
    return canManageIntegrationSettings;
  }

  public void setCanManageIntegrationSettings(Boolean canManageIntegrationSettings) {
    this.canManageIntegrationSettings = canManageIntegrationSettings;
  }


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
        Objects.equals(this.isVisibleInRooms, permissions.isVisibleInRooms) &&
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

  @Override
  public int hashCode() {
    return Objects.hash(canAddUsersToRooms, canCreateRooms, canSubmitRoomsForReview, canCloseRooms, canReopenRooms, canDeleteOwnedRooms, autoAccessToRooms, canExportRoomActivityDetailsPeople, isVisibleInRooms, canCopyRoomDetails, canEditAnyRoomRole, canEditInvitedRoomRole, canEditRoomSide, canManageAnyUserRoomAccess, canManageInvitedUserRoomAccess, isHiddenInRoom, canManageRoomOwners, canDeleteRooms, canConnectToMortgageCadence, canViewRoomDetails, canViewAndEditRoomDetails, canSendRoomDetailsToLoneWolf, canAddDocuments, canAddDocumentsFromFormGroups, canAddDocumentsFromFormLibraries, documentsViewableByOthersInRoomFromOffice, documentsAutoOwnedByPeers, canDeleteOwnedDocuments, canManageSharedDocs, canManageFormGroups, canShareDocsNotOwned, canAddTasksToAnyTaskLists, canEditEditableTasks, canEditAnyTasks, canDeleteDeletableTasks, canDeleteAnyTasks, canApplyTaskList, canRemoveAnyTaskList, canSubmitTaskList, canAutoSubmitTaskList, canReviewTaskList, canAutoApproveTaskList, canManageTaskTemplatesForAllRegionsAllOffices, canApplyRoomTemplates, canAddTasksToRooms, canReviewAnyTask, canManageDocsOnAnyTask, canAddMemberAndSetRoleLowerAccessLevel, canAddMemberAndSetRoleSameAccessLevel, canChangeMemberRoleLowerAccessLevel, canChangeMemberRoleSameAccessLevel, canManageMemberLowerAccessLevel, canManageMemberSameAccessLevel, canRemoveCompanyMemberLowerAccessLevel, canRemoveCompanyMemberSameAccessLevel, canManageAccount, canManageLogo, canManageRolesAndPermissions, canManageRoomDetails, canManageRoomTemplates, canManageIntegrationSettings);
  }


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
    sb.append("    isVisibleInRooms: ").append(toIndentedString(isVisibleInRooms)).append("\n");
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

