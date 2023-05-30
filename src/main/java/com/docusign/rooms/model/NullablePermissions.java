package com.docusign.rooms.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * NullablePermissions
 */

public class NullablePermissions {
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

  @JsonProperty("canManageAnyUserRoomAccess")
  private Boolean canManageAnyUserRoomAccess = null;

  @JsonProperty("canManageInvitedUserRoomAccess")
  private Boolean canManageInvitedUserRoomAccess = null;

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

  @JsonProperty("canCreateAndManagePackages")
  private Boolean canCreateAndManagePackages = null;

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

  @JsonProperty("canManageRoomDetails")
  private Boolean canManageRoomDetails = null;

  @JsonProperty("canManageRoomTemplates")
  private Boolean canManageRoomTemplates = null;

  @JsonProperty("canManageIntegrationSettings")
  private Boolean canManageIntegrationSettings = null;

  public NullablePermissions canAddUsersToRooms(Boolean canAddUsersToRooms) {
    this.canAddUsersToRooms = canAddUsersToRooms;
    return this;
  }

   /**
   * Get canAddUsersToRooms
   * @return canAddUsersToRooms
  **/
  @Schema(description = "")
  public Boolean isCanAddUsersToRooms() {
    return canAddUsersToRooms;
  }

  public void setCanAddUsersToRooms(Boolean canAddUsersToRooms) {
    this.canAddUsersToRooms = canAddUsersToRooms;
  }

  public NullablePermissions canCreateRooms(Boolean canCreateRooms) {
    this.canCreateRooms = canCreateRooms;
    return this;
  }

   /**
   * Get canCreateRooms
   * @return canCreateRooms
  **/
  @Schema(description = "")
  public Boolean isCanCreateRooms() {
    return canCreateRooms;
  }

  public void setCanCreateRooms(Boolean canCreateRooms) {
    this.canCreateRooms = canCreateRooms;
  }

  public NullablePermissions canSubmitRoomsForReview(Boolean canSubmitRoomsForReview) {
    this.canSubmitRoomsForReview = canSubmitRoomsForReview;
    return this;
  }

   /**
   * Get canSubmitRoomsForReview
   * @return canSubmitRoomsForReview
  **/
  @Schema(description = "")
  public Boolean isCanSubmitRoomsForReview() {
    return canSubmitRoomsForReview;
  }

  public void setCanSubmitRoomsForReview(Boolean canSubmitRoomsForReview) {
    this.canSubmitRoomsForReview = canSubmitRoomsForReview;
  }

  public NullablePermissions canCloseRooms(Boolean canCloseRooms) {
    this.canCloseRooms = canCloseRooms;
    return this;
  }

   /**
   * Get canCloseRooms
   * @return canCloseRooms
  **/
  @Schema(description = "")
  public Boolean isCanCloseRooms() {
    return canCloseRooms;
  }

  public void setCanCloseRooms(Boolean canCloseRooms) {
    this.canCloseRooms = canCloseRooms;
  }

  public NullablePermissions canReopenRooms(Boolean canReopenRooms) {
    this.canReopenRooms = canReopenRooms;
    return this;
  }

   /**
   * Get canReopenRooms
   * @return canReopenRooms
  **/
  @Schema(description = "")
  public Boolean isCanReopenRooms() {
    return canReopenRooms;
  }

  public void setCanReopenRooms(Boolean canReopenRooms) {
    this.canReopenRooms = canReopenRooms;
  }

  public NullablePermissions canDeleteOwnedRooms(Boolean canDeleteOwnedRooms) {
    this.canDeleteOwnedRooms = canDeleteOwnedRooms;
    return this;
  }

   /**
   * Get canDeleteOwnedRooms
   * @return canDeleteOwnedRooms
  **/
  @Schema(description = "")
  public Boolean isCanDeleteOwnedRooms() {
    return canDeleteOwnedRooms;
  }

  public void setCanDeleteOwnedRooms(Boolean canDeleteOwnedRooms) {
    this.canDeleteOwnedRooms = canDeleteOwnedRooms;
  }

  public NullablePermissions autoAccessToRooms(Boolean autoAccessToRooms) {
    this.autoAccessToRooms = autoAccessToRooms;
    return this;
  }

   /**
   * Get autoAccessToRooms
   * @return autoAccessToRooms
  **/
  @Schema(description = "")
  public Boolean isAutoAccessToRooms() {
    return autoAccessToRooms;
  }

  public void setAutoAccessToRooms(Boolean autoAccessToRooms) {
    this.autoAccessToRooms = autoAccessToRooms;
  }

  public NullablePermissions canExportRoomActivityDetailsPeople(Boolean canExportRoomActivityDetailsPeople) {
    this.canExportRoomActivityDetailsPeople = canExportRoomActivityDetailsPeople;
    return this;
  }

   /**
   * Get canExportRoomActivityDetailsPeople
   * @return canExportRoomActivityDetailsPeople
  **/
  @Schema(description = "")
  public Boolean isCanExportRoomActivityDetailsPeople() {
    return canExportRoomActivityDetailsPeople;
  }

  public void setCanExportRoomActivityDetailsPeople(Boolean canExportRoomActivityDetailsPeople) {
    this.canExportRoomActivityDetailsPeople = canExportRoomActivityDetailsPeople;
  }

  public NullablePermissions isVisibleInRooms(Boolean isVisibleInRooms) {
    this.isVisibleInRooms = isVisibleInRooms;
    return this;
  }

   /**
   * Get isVisibleInRooms
   * @return isVisibleInRooms
  **/
  @Schema(description = "")
  public Boolean isIsVisibleInRooms() {
    return isVisibleInRooms;
  }

  public void setIsVisibleInRooms(Boolean isVisibleInRooms) {
    this.isVisibleInRooms = isVisibleInRooms;
  }

  public NullablePermissions canCopyRoomDetails(Boolean canCopyRoomDetails) {
    this.canCopyRoomDetails = canCopyRoomDetails;
    return this;
  }

   /**
   * Get canCopyRoomDetails
   * @return canCopyRoomDetails
  **/
  @Schema(description = "")
  public Boolean isCanCopyRoomDetails() {
    return canCopyRoomDetails;
  }

  public void setCanCopyRoomDetails(Boolean canCopyRoomDetails) {
    this.canCopyRoomDetails = canCopyRoomDetails;
  }

  public NullablePermissions canEditAnyRoomRole(Boolean canEditAnyRoomRole) {
    this.canEditAnyRoomRole = canEditAnyRoomRole;
    return this;
  }

   /**
   * Get canEditAnyRoomRole
   * @return canEditAnyRoomRole
  **/
  @Schema(description = "")
  public Boolean isCanEditAnyRoomRole() {
    return canEditAnyRoomRole;
  }

  public void setCanEditAnyRoomRole(Boolean canEditAnyRoomRole) {
    this.canEditAnyRoomRole = canEditAnyRoomRole;
  }

  public NullablePermissions canEditInvitedRoomRole(Boolean canEditInvitedRoomRole) {
    this.canEditInvitedRoomRole = canEditInvitedRoomRole;
    return this;
  }

   /**
   * Get canEditInvitedRoomRole
   * @return canEditInvitedRoomRole
  **/
  @Schema(description = "")
  public Boolean isCanEditInvitedRoomRole() {
    return canEditInvitedRoomRole;
  }

  public void setCanEditInvitedRoomRole(Boolean canEditInvitedRoomRole) {
    this.canEditInvitedRoomRole = canEditInvitedRoomRole;
  }

  public NullablePermissions canManageAnyUserRoomAccess(Boolean canManageAnyUserRoomAccess) {
    this.canManageAnyUserRoomAccess = canManageAnyUserRoomAccess;
    return this;
  }

   /**
   * Get canManageAnyUserRoomAccess
   * @return canManageAnyUserRoomAccess
  **/
  @Schema(description = "")
  public Boolean isCanManageAnyUserRoomAccess() {
    return canManageAnyUserRoomAccess;
  }

  public void setCanManageAnyUserRoomAccess(Boolean canManageAnyUserRoomAccess) {
    this.canManageAnyUserRoomAccess = canManageAnyUserRoomAccess;
  }

  public NullablePermissions canManageInvitedUserRoomAccess(Boolean canManageInvitedUserRoomAccess) {
    this.canManageInvitedUserRoomAccess = canManageInvitedUserRoomAccess;
    return this;
  }

   /**
   * Get canManageInvitedUserRoomAccess
   * @return canManageInvitedUserRoomAccess
  **/
  @Schema(description = "")
  public Boolean isCanManageInvitedUserRoomAccess() {
    return canManageInvitedUserRoomAccess;
  }

  public void setCanManageInvitedUserRoomAccess(Boolean canManageInvitedUserRoomAccess) {
    this.canManageInvitedUserRoomAccess = canManageInvitedUserRoomAccess;
  }

  public NullablePermissions canViewRoomDetails(Boolean canViewRoomDetails) {
    this.canViewRoomDetails = canViewRoomDetails;
    return this;
  }

   /**
   * Get canViewRoomDetails
   * @return canViewRoomDetails
  **/
  @Schema(description = "")
  public Boolean isCanViewRoomDetails() {
    return canViewRoomDetails;
  }

  public void setCanViewRoomDetails(Boolean canViewRoomDetails) {
    this.canViewRoomDetails = canViewRoomDetails;
  }

  public NullablePermissions canViewAndEditRoomDetails(Boolean canViewAndEditRoomDetails) {
    this.canViewAndEditRoomDetails = canViewAndEditRoomDetails;
    return this;
  }

   /**
   * Get canViewAndEditRoomDetails
   * @return canViewAndEditRoomDetails
  **/
  @Schema(description = "")
  public Boolean isCanViewAndEditRoomDetails() {
    return canViewAndEditRoomDetails;
  }

  public void setCanViewAndEditRoomDetails(Boolean canViewAndEditRoomDetails) {
    this.canViewAndEditRoomDetails = canViewAndEditRoomDetails;
  }

  public NullablePermissions canSendRoomDetailsToLoneWolf(Boolean canSendRoomDetailsToLoneWolf) {
    this.canSendRoomDetailsToLoneWolf = canSendRoomDetailsToLoneWolf;
    return this;
  }

   /**
   * Get canSendRoomDetailsToLoneWolf
   * @return canSendRoomDetailsToLoneWolf
  **/
  @Schema(description = "")
  public Boolean isCanSendRoomDetailsToLoneWolf() {
    return canSendRoomDetailsToLoneWolf;
  }

  public void setCanSendRoomDetailsToLoneWolf(Boolean canSendRoomDetailsToLoneWolf) {
    this.canSendRoomDetailsToLoneWolf = canSendRoomDetailsToLoneWolf;
  }

  public NullablePermissions canAddDocuments(Boolean canAddDocuments) {
    this.canAddDocuments = canAddDocuments;
    return this;
  }

   /**
   * Get canAddDocuments
   * @return canAddDocuments
  **/
  @Schema(description = "")
  public Boolean isCanAddDocuments() {
    return canAddDocuments;
  }

  public void setCanAddDocuments(Boolean canAddDocuments) {
    this.canAddDocuments = canAddDocuments;
  }

  public NullablePermissions canAddDocumentsFromFormGroups(Boolean canAddDocumentsFromFormGroups) {
    this.canAddDocumentsFromFormGroups = canAddDocumentsFromFormGroups;
    return this;
  }

   /**
   * Get canAddDocumentsFromFormGroups
   * @return canAddDocumentsFromFormGroups
  **/
  @Schema(description = "")
  public Boolean isCanAddDocumentsFromFormGroups() {
    return canAddDocumentsFromFormGroups;
  }

  public void setCanAddDocumentsFromFormGroups(Boolean canAddDocumentsFromFormGroups) {
    this.canAddDocumentsFromFormGroups = canAddDocumentsFromFormGroups;
  }

  public NullablePermissions canAddDocumentsFromFormLibraries(Boolean canAddDocumentsFromFormLibraries) {
    this.canAddDocumentsFromFormLibraries = canAddDocumentsFromFormLibraries;
    return this;
  }

   /**
   * Get canAddDocumentsFromFormLibraries
   * @return canAddDocumentsFromFormLibraries
  **/
  @Schema(description = "")
  public Boolean isCanAddDocumentsFromFormLibraries() {
    return canAddDocumentsFromFormLibraries;
  }

  public void setCanAddDocumentsFromFormLibraries(Boolean canAddDocumentsFromFormLibraries) {
    this.canAddDocumentsFromFormLibraries = canAddDocumentsFromFormLibraries;
  }

  public NullablePermissions documentsViewableByOthersInRoomFromOffice(Boolean documentsViewableByOthersInRoomFromOffice) {
    this.documentsViewableByOthersInRoomFromOffice = documentsViewableByOthersInRoomFromOffice;
    return this;
  }

   /**
   * Get documentsViewableByOthersInRoomFromOffice
   * @return documentsViewableByOthersInRoomFromOffice
  **/
  @Schema(description = "")
  public Boolean isDocumentsViewableByOthersInRoomFromOffice() {
    return documentsViewableByOthersInRoomFromOffice;
  }

  public void setDocumentsViewableByOthersInRoomFromOffice(Boolean documentsViewableByOthersInRoomFromOffice) {
    this.documentsViewableByOthersInRoomFromOffice = documentsViewableByOthersInRoomFromOffice;
  }

  public NullablePermissions documentsAutoOwnedByPeers(Boolean documentsAutoOwnedByPeers) {
    this.documentsAutoOwnedByPeers = documentsAutoOwnedByPeers;
    return this;
  }

   /**
   * Get documentsAutoOwnedByPeers
   * @return documentsAutoOwnedByPeers
  **/
  @Schema(description = "")
  public Boolean isDocumentsAutoOwnedByPeers() {
    return documentsAutoOwnedByPeers;
  }

  public void setDocumentsAutoOwnedByPeers(Boolean documentsAutoOwnedByPeers) {
    this.documentsAutoOwnedByPeers = documentsAutoOwnedByPeers;
  }

  public NullablePermissions canDeleteOwnedDocuments(Boolean canDeleteOwnedDocuments) {
    this.canDeleteOwnedDocuments = canDeleteOwnedDocuments;
    return this;
  }

   /**
   * Get canDeleteOwnedDocuments
   * @return canDeleteOwnedDocuments
  **/
  @Schema(description = "")
  public Boolean isCanDeleteOwnedDocuments() {
    return canDeleteOwnedDocuments;
  }

  public void setCanDeleteOwnedDocuments(Boolean canDeleteOwnedDocuments) {
    this.canDeleteOwnedDocuments = canDeleteOwnedDocuments;
  }

  public NullablePermissions canManageSharedDocs(Boolean canManageSharedDocs) {
    this.canManageSharedDocs = canManageSharedDocs;
    return this;
  }

   /**
   * Get canManageSharedDocs
   * @return canManageSharedDocs
  **/
  @Schema(description = "")
  public Boolean isCanManageSharedDocs() {
    return canManageSharedDocs;
  }

  public void setCanManageSharedDocs(Boolean canManageSharedDocs) {
    this.canManageSharedDocs = canManageSharedDocs;
  }

  public NullablePermissions canManageFormGroups(Boolean canManageFormGroups) {
    this.canManageFormGroups = canManageFormGroups;
    return this;
  }

   /**
   * Get canManageFormGroups
   * @return canManageFormGroups
  **/
  @Schema(description = "")
  public Boolean isCanManageFormGroups() {
    return canManageFormGroups;
  }

  public void setCanManageFormGroups(Boolean canManageFormGroups) {
    this.canManageFormGroups = canManageFormGroups;
  }

  public NullablePermissions canShareDocsNotOwned(Boolean canShareDocsNotOwned) {
    this.canShareDocsNotOwned = canShareDocsNotOwned;
    return this;
  }

   /**
   * Get canShareDocsNotOwned
   * @return canShareDocsNotOwned
  **/
  @Schema(description = "")
  public Boolean isCanShareDocsNotOwned() {
    return canShareDocsNotOwned;
  }

  public void setCanShareDocsNotOwned(Boolean canShareDocsNotOwned) {
    this.canShareDocsNotOwned = canShareDocsNotOwned;
  }

  public NullablePermissions canAddTasksToAnyTaskLists(Boolean canAddTasksToAnyTaskLists) {
    this.canAddTasksToAnyTaskLists = canAddTasksToAnyTaskLists;
    return this;
  }

   /**
   * Get canAddTasksToAnyTaskLists
   * @return canAddTasksToAnyTaskLists
  **/
  @Schema(description = "")
  public Boolean isCanAddTasksToAnyTaskLists() {
    return canAddTasksToAnyTaskLists;
  }

  public void setCanAddTasksToAnyTaskLists(Boolean canAddTasksToAnyTaskLists) {
    this.canAddTasksToAnyTaskLists = canAddTasksToAnyTaskLists;
  }

  public NullablePermissions canEditEditableTasks(Boolean canEditEditableTasks) {
    this.canEditEditableTasks = canEditEditableTasks;
    return this;
  }

   /**
   * Get canEditEditableTasks
   * @return canEditEditableTasks
  **/
  @Schema(description = "")
  public Boolean isCanEditEditableTasks() {
    return canEditEditableTasks;
  }

  public void setCanEditEditableTasks(Boolean canEditEditableTasks) {
    this.canEditEditableTasks = canEditEditableTasks;
  }

  public NullablePermissions canEditAnyTasks(Boolean canEditAnyTasks) {
    this.canEditAnyTasks = canEditAnyTasks;
    return this;
  }

   /**
   * Get canEditAnyTasks
   * @return canEditAnyTasks
  **/
  @Schema(description = "")
  public Boolean isCanEditAnyTasks() {
    return canEditAnyTasks;
  }

  public void setCanEditAnyTasks(Boolean canEditAnyTasks) {
    this.canEditAnyTasks = canEditAnyTasks;
  }

  public NullablePermissions canDeleteDeletableTasks(Boolean canDeleteDeletableTasks) {
    this.canDeleteDeletableTasks = canDeleteDeletableTasks;
    return this;
  }

   /**
   * Get canDeleteDeletableTasks
   * @return canDeleteDeletableTasks
  **/
  @Schema(description = "")
  public Boolean isCanDeleteDeletableTasks() {
    return canDeleteDeletableTasks;
  }

  public void setCanDeleteDeletableTasks(Boolean canDeleteDeletableTasks) {
    this.canDeleteDeletableTasks = canDeleteDeletableTasks;
  }

  public NullablePermissions canDeleteAnyTasks(Boolean canDeleteAnyTasks) {
    this.canDeleteAnyTasks = canDeleteAnyTasks;
    return this;
  }

   /**
   * Get canDeleteAnyTasks
   * @return canDeleteAnyTasks
  **/
  @Schema(description = "")
  public Boolean isCanDeleteAnyTasks() {
    return canDeleteAnyTasks;
  }

  public void setCanDeleteAnyTasks(Boolean canDeleteAnyTasks) {
    this.canDeleteAnyTasks = canDeleteAnyTasks;
  }

  public NullablePermissions canApplyTaskList(Boolean canApplyTaskList) {
    this.canApplyTaskList = canApplyTaskList;
    return this;
  }

   /**
   * Get canApplyTaskList
   * @return canApplyTaskList
  **/
  @Schema(description = "")
  public Boolean isCanApplyTaskList() {
    return canApplyTaskList;
  }

  public void setCanApplyTaskList(Boolean canApplyTaskList) {
    this.canApplyTaskList = canApplyTaskList;
  }

  public NullablePermissions canRemoveAnyTaskList(Boolean canRemoveAnyTaskList) {
    this.canRemoveAnyTaskList = canRemoveAnyTaskList;
    return this;
  }

   /**
   * Get canRemoveAnyTaskList
   * @return canRemoveAnyTaskList
  **/
  @Schema(description = "")
  public Boolean isCanRemoveAnyTaskList() {
    return canRemoveAnyTaskList;
  }

  public void setCanRemoveAnyTaskList(Boolean canRemoveAnyTaskList) {
    this.canRemoveAnyTaskList = canRemoveAnyTaskList;
  }

  public NullablePermissions canSubmitTaskList(Boolean canSubmitTaskList) {
    this.canSubmitTaskList = canSubmitTaskList;
    return this;
  }

   /**
   * Get canSubmitTaskList
   * @return canSubmitTaskList
  **/
  @Schema(description = "")
  public Boolean isCanSubmitTaskList() {
    return canSubmitTaskList;
  }

  public void setCanSubmitTaskList(Boolean canSubmitTaskList) {
    this.canSubmitTaskList = canSubmitTaskList;
  }

  public NullablePermissions canAutoSubmitTaskList(Boolean canAutoSubmitTaskList) {
    this.canAutoSubmitTaskList = canAutoSubmitTaskList;
    return this;
  }

   /**
   * Get canAutoSubmitTaskList
   * @return canAutoSubmitTaskList
  **/
  @Schema(description = "")
  public Boolean isCanAutoSubmitTaskList() {
    return canAutoSubmitTaskList;
  }

  public void setCanAutoSubmitTaskList(Boolean canAutoSubmitTaskList) {
    this.canAutoSubmitTaskList = canAutoSubmitTaskList;
  }

  public NullablePermissions canReviewTaskList(Boolean canReviewTaskList) {
    this.canReviewTaskList = canReviewTaskList;
    return this;
  }

   /**
   * Get canReviewTaskList
   * @return canReviewTaskList
  **/
  @Schema(description = "")
  public Boolean isCanReviewTaskList() {
    return canReviewTaskList;
  }

  public void setCanReviewTaskList(Boolean canReviewTaskList) {
    this.canReviewTaskList = canReviewTaskList;
  }

  public NullablePermissions canAutoApproveTaskList(Boolean canAutoApproveTaskList) {
    this.canAutoApproveTaskList = canAutoApproveTaskList;
    return this;
  }

   /**
   * Get canAutoApproveTaskList
   * @return canAutoApproveTaskList
  **/
  @Schema(description = "")
  public Boolean isCanAutoApproveTaskList() {
    return canAutoApproveTaskList;
  }

  public void setCanAutoApproveTaskList(Boolean canAutoApproveTaskList) {
    this.canAutoApproveTaskList = canAutoApproveTaskList;
  }

  public NullablePermissions canManageTaskTemplatesForAllRegionsAllOffices(Boolean canManageTaskTemplatesForAllRegionsAllOffices) {
    this.canManageTaskTemplatesForAllRegionsAllOffices = canManageTaskTemplatesForAllRegionsAllOffices;
    return this;
  }

   /**
   * Get canManageTaskTemplatesForAllRegionsAllOffices
   * @return canManageTaskTemplatesForAllRegionsAllOffices
  **/
  @Schema(description = "")
  public Boolean isCanManageTaskTemplatesForAllRegionsAllOffices() {
    return canManageTaskTemplatesForAllRegionsAllOffices;
  }

  public void setCanManageTaskTemplatesForAllRegionsAllOffices(Boolean canManageTaskTemplatesForAllRegionsAllOffices) {
    this.canManageTaskTemplatesForAllRegionsAllOffices = canManageTaskTemplatesForAllRegionsAllOffices;
  }

  public NullablePermissions canApplyRoomTemplates(Boolean canApplyRoomTemplates) {
    this.canApplyRoomTemplates = canApplyRoomTemplates;
    return this;
  }

   /**
   * Get canApplyRoomTemplates
   * @return canApplyRoomTemplates
  **/
  @Schema(description = "")
  public Boolean isCanApplyRoomTemplates() {
    return canApplyRoomTemplates;
  }

  public void setCanApplyRoomTemplates(Boolean canApplyRoomTemplates) {
    this.canApplyRoomTemplates = canApplyRoomTemplates;
  }

  public NullablePermissions canAddTasksToRooms(Boolean canAddTasksToRooms) {
    this.canAddTasksToRooms = canAddTasksToRooms;
    return this;
  }

   /**
   * Get canAddTasksToRooms
   * @return canAddTasksToRooms
  **/
  @Schema(description = "")
  public Boolean isCanAddTasksToRooms() {
    return canAddTasksToRooms;
  }

  public void setCanAddTasksToRooms(Boolean canAddTasksToRooms) {
    this.canAddTasksToRooms = canAddTasksToRooms;
  }

  public NullablePermissions canCreateAndManagePackages(Boolean canCreateAndManagePackages) {
    this.canCreateAndManagePackages = canCreateAndManagePackages;
    return this;
  }

   /**
   * Get canCreateAndManagePackages
   * @return canCreateAndManagePackages
  **/
  @Schema(description = "")
  public Boolean isCanCreateAndManagePackages() {
    return canCreateAndManagePackages;
  }

  public void setCanCreateAndManagePackages(Boolean canCreateAndManagePackages) {
    this.canCreateAndManagePackages = canCreateAndManagePackages;
  }

  public NullablePermissions canAddMemberAndSetRoleLowerAccessLevel(Boolean canAddMemberAndSetRoleLowerAccessLevel) {
    this.canAddMemberAndSetRoleLowerAccessLevel = canAddMemberAndSetRoleLowerAccessLevel;
    return this;
  }

   /**
   * Get canAddMemberAndSetRoleLowerAccessLevel
   * @return canAddMemberAndSetRoleLowerAccessLevel
  **/
  @Schema(description = "")
  public Boolean isCanAddMemberAndSetRoleLowerAccessLevel() {
    return canAddMemberAndSetRoleLowerAccessLevel;
  }

  public void setCanAddMemberAndSetRoleLowerAccessLevel(Boolean canAddMemberAndSetRoleLowerAccessLevel) {
    this.canAddMemberAndSetRoleLowerAccessLevel = canAddMemberAndSetRoleLowerAccessLevel;
  }

  public NullablePermissions canAddMemberAndSetRoleSameAccessLevel(Boolean canAddMemberAndSetRoleSameAccessLevel) {
    this.canAddMemberAndSetRoleSameAccessLevel = canAddMemberAndSetRoleSameAccessLevel;
    return this;
  }

   /**
   * Get canAddMemberAndSetRoleSameAccessLevel
   * @return canAddMemberAndSetRoleSameAccessLevel
  **/
  @Schema(description = "")
  public Boolean isCanAddMemberAndSetRoleSameAccessLevel() {
    return canAddMemberAndSetRoleSameAccessLevel;
  }

  public void setCanAddMemberAndSetRoleSameAccessLevel(Boolean canAddMemberAndSetRoleSameAccessLevel) {
    this.canAddMemberAndSetRoleSameAccessLevel = canAddMemberAndSetRoleSameAccessLevel;
  }

  public NullablePermissions canChangeMemberRoleLowerAccessLevel(Boolean canChangeMemberRoleLowerAccessLevel) {
    this.canChangeMemberRoleLowerAccessLevel = canChangeMemberRoleLowerAccessLevel;
    return this;
  }

   /**
   * Get canChangeMemberRoleLowerAccessLevel
   * @return canChangeMemberRoleLowerAccessLevel
  **/
  @Schema(description = "")
  public Boolean isCanChangeMemberRoleLowerAccessLevel() {
    return canChangeMemberRoleLowerAccessLevel;
  }

  public void setCanChangeMemberRoleLowerAccessLevel(Boolean canChangeMemberRoleLowerAccessLevel) {
    this.canChangeMemberRoleLowerAccessLevel = canChangeMemberRoleLowerAccessLevel;
  }

  public NullablePermissions canChangeMemberRoleSameAccessLevel(Boolean canChangeMemberRoleSameAccessLevel) {
    this.canChangeMemberRoleSameAccessLevel = canChangeMemberRoleSameAccessLevel;
    return this;
  }

   /**
   * Get canChangeMemberRoleSameAccessLevel
   * @return canChangeMemberRoleSameAccessLevel
  **/
  @Schema(description = "")
  public Boolean isCanChangeMemberRoleSameAccessLevel() {
    return canChangeMemberRoleSameAccessLevel;
  }

  public void setCanChangeMemberRoleSameAccessLevel(Boolean canChangeMemberRoleSameAccessLevel) {
    this.canChangeMemberRoleSameAccessLevel = canChangeMemberRoleSameAccessLevel;
  }

  public NullablePermissions canManageMemberLowerAccessLevel(Boolean canManageMemberLowerAccessLevel) {
    this.canManageMemberLowerAccessLevel = canManageMemberLowerAccessLevel;
    return this;
  }

   /**
   * Get canManageMemberLowerAccessLevel
   * @return canManageMemberLowerAccessLevel
  **/
  @Schema(description = "")
  public Boolean isCanManageMemberLowerAccessLevel() {
    return canManageMemberLowerAccessLevel;
  }

  public void setCanManageMemberLowerAccessLevel(Boolean canManageMemberLowerAccessLevel) {
    this.canManageMemberLowerAccessLevel = canManageMemberLowerAccessLevel;
  }

  public NullablePermissions canManageMemberSameAccessLevel(Boolean canManageMemberSameAccessLevel) {
    this.canManageMemberSameAccessLevel = canManageMemberSameAccessLevel;
    return this;
  }

   /**
   * Get canManageMemberSameAccessLevel
   * @return canManageMemberSameAccessLevel
  **/
  @Schema(description = "")
  public Boolean isCanManageMemberSameAccessLevel() {
    return canManageMemberSameAccessLevel;
  }

  public void setCanManageMemberSameAccessLevel(Boolean canManageMemberSameAccessLevel) {
    this.canManageMemberSameAccessLevel = canManageMemberSameAccessLevel;
  }

  public NullablePermissions canRemoveCompanyMemberLowerAccessLevel(Boolean canRemoveCompanyMemberLowerAccessLevel) {
    this.canRemoveCompanyMemberLowerAccessLevel = canRemoveCompanyMemberLowerAccessLevel;
    return this;
  }

   /**
   * Get canRemoveCompanyMemberLowerAccessLevel
   * @return canRemoveCompanyMemberLowerAccessLevel
  **/
  @Schema(description = "")
  public Boolean isCanRemoveCompanyMemberLowerAccessLevel() {
    return canRemoveCompanyMemberLowerAccessLevel;
  }

  public void setCanRemoveCompanyMemberLowerAccessLevel(Boolean canRemoveCompanyMemberLowerAccessLevel) {
    this.canRemoveCompanyMemberLowerAccessLevel = canRemoveCompanyMemberLowerAccessLevel;
  }

  public NullablePermissions canRemoveCompanyMemberSameAccessLevel(Boolean canRemoveCompanyMemberSameAccessLevel) {
    this.canRemoveCompanyMemberSameAccessLevel = canRemoveCompanyMemberSameAccessLevel;
    return this;
  }

   /**
   * Get canRemoveCompanyMemberSameAccessLevel
   * @return canRemoveCompanyMemberSameAccessLevel
  **/
  @Schema(description = "")
  public Boolean isCanRemoveCompanyMemberSameAccessLevel() {
    return canRemoveCompanyMemberSameAccessLevel;
  }

  public void setCanRemoveCompanyMemberSameAccessLevel(Boolean canRemoveCompanyMemberSameAccessLevel) {
    this.canRemoveCompanyMemberSameAccessLevel = canRemoveCompanyMemberSameAccessLevel;
  }

  public NullablePermissions canManageAccount(Boolean canManageAccount) {
    this.canManageAccount = canManageAccount;
    return this;
  }

   /**
   * Get canManageAccount
   * @return canManageAccount
  **/
  @Schema(description = "")
  public Boolean isCanManageAccount() {
    return canManageAccount;
  }

  public void setCanManageAccount(Boolean canManageAccount) {
    this.canManageAccount = canManageAccount;
  }

  public NullablePermissions canManageLogo(Boolean canManageLogo) {
    this.canManageLogo = canManageLogo;
    return this;
  }

   /**
   * Get canManageLogo
   * @return canManageLogo
  **/
  @Schema(description = "")
  public Boolean isCanManageLogo() {
    return canManageLogo;
  }

  public void setCanManageLogo(Boolean canManageLogo) {
    this.canManageLogo = canManageLogo;
  }

  public NullablePermissions canManageRoomDetails(Boolean canManageRoomDetails) {
    this.canManageRoomDetails = canManageRoomDetails;
    return this;
  }

   /**
   * Get canManageRoomDetails
   * @return canManageRoomDetails
  **/
  @Schema(description = "")
  public Boolean isCanManageRoomDetails() {
    return canManageRoomDetails;
  }

  public void setCanManageRoomDetails(Boolean canManageRoomDetails) {
    this.canManageRoomDetails = canManageRoomDetails;
  }

  public NullablePermissions canManageRoomTemplates(Boolean canManageRoomTemplates) {
    this.canManageRoomTemplates = canManageRoomTemplates;
    return this;
  }

   /**
   * Get canManageRoomTemplates
   * @return canManageRoomTemplates
  **/
  @Schema(description = "")
  public Boolean isCanManageRoomTemplates() {
    return canManageRoomTemplates;
  }

  public void setCanManageRoomTemplates(Boolean canManageRoomTemplates) {
    this.canManageRoomTemplates = canManageRoomTemplates;
  }

  public NullablePermissions canManageIntegrationSettings(Boolean canManageIntegrationSettings) {
    this.canManageIntegrationSettings = canManageIntegrationSettings;
    return this;
  }

   /**
   * Get canManageIntegrationSettings
   * @return canManageIntegrationSettings
  **/
  @Schema(description = "")
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
    NullablePermissions nullablePermissions = (NullablePermissions) o;
    return Objects.equals(this.canAddUsersToRooms, nullablePermissions.canAddUsersToRooms) &&
        Objects.equals(this.canCreateRooms, nullablePermissions.canCreateRooms) &&
        Objects.equals(this.canSubmitRoomsForReview, nullablePermissions.canSubmitRoomsForReview) &&
        Objects.equals(this.canCloseRooms, nullablePermissions.canCloseRooms) &&
        Objects.equals(this.canReopenRooms, nullablePermissions.canReopenRooms) &&
        Objects.equals(this.canDeleteOwnedRooms, nullablePermissions.canDeleteOwnedRooms) &&
        Objects.equals(this.autoAccessToRooms, nullablePermissions.autoAccessToRooms) &&
        Objects.equals(this.canExportRoomActivityDetailsPeople, nullablePermissions.canExportRoomActivityDetailsPeople) &&
        Objects.equals(this.isVisibleInRooms, nullablePermissions.isVisibleInRooms) &&
        Objects.equals(this.canCopyRoomDetails, nullablePermissions.canCopyRoomDetails) &&
        Objects.equals(this.canEditAnyRoomRole, nullablePermissions.canEditAnyRoomRole) &&
        Objects.equals(this.canEditInvitedRoomRole, nullablePermissions.canEditInvitedRoomRole) &&
        Objects.equals(this.canManageAnyUserRoomAccess, nullablePermissions.canManageAnyUserRoomAccess) &&
        Objects.equals(this.canManageInvitedUserRoomAccess, nullablePermissions.canManageInvitedUserRoomAccess) &&
        Objects.equals(this.canViewRoomDetails, nullablePermissions.canViewRoomDetails) &&
        Objects.equals(this.canViewAndEditRoomDetails, nullablePermissions.canViewAndEditRoomDetails) &&
        Objects.equals(this.canSendRoomDetailsToLoneWolf, nullablePermissions.canSendRoomDetailsToLoneWolf) &&
        Objects.equals(this.canAddDocuments, nullablePermissions.canAddDocuments) &&
        Objects.equals(this.canAddDocumentsFromFormGroups, nullablePermissions.canAddDocumentsFromFormGroups) &&
        Objects.equals(this.canAddDocumentsFromFormLibraries, nullablePermissions.canAddDocumentsFromFormLibraries) &&
        Objects.equals(this.documentsViewableByOthersInRoomFromOffice, nullablePermissions.documentsViewableByOthersInRoomFromOffice) &&
        Objects.equals(this.documentsAutoOwnedByPeers, nullablePermissions.documentsAutoOwnedByPeers) &&
        Objects.equals(this.canDeleteOwnedDocuments, nullablePermissions.canDeleteOwnedDocuments) &&
        Objects.equals(this.canManageSharedDocs, nullablePermissions.canManageSharedDocs) &&
        Objects.equals(this.canManageFormGroups, nullablePermissions.canManageFormGroups) &&
        Objects.equals(this.canShareDocsNotOwned, nullablePermissions.canShareDocsNotOwned) &&
        Objects.equals(this.canAddTasksToAnyTaskLists, nullablePermissions.canAddTasksToAnyTaskLists) &&
        Objects.equals(this.canEditEditableTasks, nullablePermissions.canEditEditableTasks) &&
        Objects.equals(this.canEditAnyTasks, nullablePermissions.canEditAnyTasks) &&
        Objects.equals(this.canDeleteDeletableTasks, nullablePermissions.canDeleteDeletableTasks) &&
        Objects.equals(this.canDeleteAnyTasks, nullablePermissions.canDeleteAnyTasks) &&
        Objects.equals(this.canApplyTaskList, nullablePermissions.canApplyTaskList) &&
        Objects.equals(this.canRemoveAnyTaskList, nullablePermissions.canRemoveAnyTaskList) &&
        Objects.equals(this.canSubmitTaskList, nullablePermissions.canSubmitTaskList) &&
        Objects.equals(this.canAutoSubmitTaskList, nullablePermissions.canAutoSubmitTaskList) &&
        Objects.equals(this.canReviewTaskList, nullablePermissions.canReviewTaskList) &&
        Objects.equals(this.canAutoApproveTaskList, nullablePermissions.canAutoApproveTaskList) &&
        Objects.equals(this.canManageTaskTemplatesForAllRegionsAllOffices, nullablePermissions.canManageTaskTemplatesForAllRegionsAllOffices) &&
        Objects.equals(this.canApplyRoomTemplates, nullablePermissions.canApplyRoomTemplates) &&
        Objects.equals(this.canAddTasksToRooms, nullablePermissions.canAddTasksToRooms) &&
        Objects.equals(this.canCreateAndManagePackages, nullablePermissions.canCreateAndManagePackages) &&
        Objects.equals(this.canAddMemberAndSetRoleLowerAccessLevel, nullablePermissions.canAddMemberAndSetRoleLowerAccessLevel) &&
        Objects.equals(this.canAddMemberAndSetRoleSameAccessLevel, nullablePermissions.canAddMemberAndSetRoleSameAccessLevel) &&
        Objects.equals(this.canChangeMemberRoleLowerAccessLevel, nullablePermissions.canChangeMemberRoleLowerAccessLevel) &&
        Objects.equals(this.canChangeMemberRoleSameAccessLevel, nullablePermissions.canChangeMemberRoleSameAccessLevel) &&
        Objects.equals(this.canManageMemberLowerAccessLevel, nullablePermissions.canManageMemberLowerAccessLevel) &&
        Objects.equals(this.canManageMemberSameAccessLevel, nullablePermissions.canManageMemberSameAccessLevel) &&
        Objects.equals(this.canRemoveCompanyMemberLowerAccessLevel, nullablePermissions.canRemoveCompanyMemberLowerAccessLevel) &&
        Objects.equals(this.canRemoveCompanyMemberSameAccessLevel, nullablePermissions.canRemoveCompanyMemberSameAccessLevel) &&
        Objects.equals(this.canManageAccount, nullablePermissions.canManageAccount) &&
        Objects.equals(this.canManageLogo, nullablePermissions.canManageLogo) &&
        Objects.equals(this.canManageRoomDetails, nullablePermissions.canManageRoomDetails) &&
        Objects.equals(this.canManageRoomTemplates, nullablePermissions.canManageRoomTemplates) &&
        Objects.equals(this.canManageIntegrationSettings, nullablePermissions.canManageIntegrationSettings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(canAddUsersToRooms, canCreateRooms, canSubmitRoomsForReview, canCloseRooms, canReopenRooms, canDeleteOwnedRooms, autoAccessToRooms, canExportRoomActivityDetailsPeople, isVisibleInRooms, canCopyRoomDetails, canEditAnyRoomRole, canEditInvitedRoomRole, canManageAnyUserRoomAccess, canManageInvitedUserRoomAccess, canViewRoomDetails, canViewAndEditRoomDetails, canSendRoomDetailsToLoneWolf, canAddDocuments, canAddDocumentsFromFormGroups, canAddDocumentsFromFormLibraries, documentsViewableByOthersInRoomFromOffice, documentsAutoOwnedByPeers, canDeleteOwnedDocuments, canManageSharedDocs, canManageFormGroups, canShareDocsNotOwned, canAddTasksToAnyTaskLists, canEditEditableTasks, canEditAnyTasks, canDeleteDeletableTasks, canDeleteAnyTasks, canApplyTaskList, canRemoveAnyTaskList, canSubmitTaskList, canAutoSubmitTaskList, canReviewTaskList, canAutoApproveTaskList, canManageTaskTemplatesForAllRegionsAllOffices, canApplyRoomTemplates, canAddTasksToRooms, canCreateAndManagePackages, canAddMemberAndSetRoleLowerAccessLevel, canAddMemberAndSetRoleSameAccessLevel, canChangeMemberRoleLowerAccessLevel, canChangeMemberRoleSameAccessLevel, canManageMemberLowerAccessLevel, canManageMemberSameAccessLevel, canRemoveCompanyMemberLowerAccessLevel, canRemoveCompanyMemberSameAccessLevel, canManageAccount, canManageLogo, canManageRoomDetails, canManageRoomTemplates, canManageIntegrationSettings);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NullablePermissions {\n");
    
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
    sb.append("    canManageAnyUserRoomAccess: ").append(toIndentedString(canManageAnyUserRoomAccess)).append("\n");
    sb.append("    canManageInvitedUserRoomAccess: ").append(toIndentedString(canManageInvitedUserRoomAccess)).append("\n");
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
    sb.append("    canCreateAndManagePackages: ").append(toIndentedString(canCreateAndManagePackages)).append("\n");
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

