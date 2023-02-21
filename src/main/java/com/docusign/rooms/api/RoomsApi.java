
package com.docusign.rooms.api;

import javax.ws.rs.core.GenericType;

import com.docusign.rooms.client.ApiException;
import com.docusign.rooms.client.ApiClient;
import com.docusign.rooms.client.Configuration;
import com.docusign.rooms.model.*;
import com.docusign.rooms.client.Pair;
import com.docusign.rooms.client.ApiResponse;




/**
 * RoomsApi class.
 *
 **/
public class RoomsApi {
  private ApiClient apiClient;

 /**
  * RoomsApi.
  *
  **/
  public RoomsApi() {
    this(Configuration.getDefaultApiClient());
  }

 /**
  * RoomsApi.
  *
  **/
  public RoomsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

 /**
  * getApiClient Method.
  *
  * @return ApiClient
  **/
  public ApiClient getApiClient() {
    return apiClient;
  }

 /**
  * setApiClient Method.
  *
  **/
  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }


  /**
   * Add a document to a room..
   * Add a document to a room
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param roomId The id of the room. (required)
   * @param body Document details to be added (optional)
   * @return RoomDocument
   * @throws ApiException if fails to make API call
   */
  public RoomDocument addDocumentToRoom(String accountId, Integer roomId, Document body) throws ApiException {
    ApiResponse<RoomDocument> localVarResponse = addDocumentToRoomWithHttpInfo(accountId, roomId, body);
    return localVarResponse.getData();
  }

  /**
   * Add a document to a room.
   * Add a document to a room
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param roomId The id of the room. (required)
   * @param body Document details to be added (optional)
   * @return RoomDocument
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<RoomDocument > addDocumentToRoomWithHttpInfo(String accountId, Integer roomId, Document body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling addDocumentToRoom");
    }
    
    // verify the required parameter 'roomId' is set
    if (roomId == null) {
      throw new ApiException(400, "Missing the required parameter 'roomId' when calling addDocumentToRoom");
    }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/rooms/{roomId}/documents"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "roomId" + "\\}", apiClient.escapeString(roomId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "text/plain", "application/json", "text/json", "application/xml", "text/xml"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json-patch+json", "application/json", "text/json", "application/_*+json", "application/xml", "text/xml", "application/_*+xml"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };
    
    GenericType<RoomDocument> localVarReturnType = new GenericType<RoomDocument>() {};
    RoomDocument localVarResponse = apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<RoomDocument>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Add a document to a room via file contents upload..
   * This method uploads the contents of file as a room document for the room that you specify.
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param roomId The id of the room. (required)
   * @param file File to be uploaded (optional)
   * @return RoomDocument
   * @throws ApiException if fails to make API call
   */
  public RoomDocument addDocumentToRoomViaFileUpload(String accountId, Integer roomId, byte[] file) throws ApiException {
    ApiResponse<RoomDocument> localVarResponse = addDocumentToRoomViaFileUploadWithHttpInfo(accountId, roomId,  file);
    return localVarResponse.getData();
  }

  /**
   * Add a document to a room via file contents upload.
   * This method uploads the contents of file as a room document for the room that you specify.
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param roomId The id of the room. (required)
   * @param file File to be uploaded (optional)
   * @return RoomDocument
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<RoomDocument > addDocumentToRoomViaFileUploadWithHttpInfo(String accountId, Integer roomId, byte[] file) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling addDocumentToRoomViaFileUpload");
    }
    
    // verify the required parameter 'roomId' is set
    if (roomId == null) {
      throw new ApiException(400, "Missing the required parameter 'roomId' when calling addDocumentToRoomViaFileUpload");
    }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/rooms/{roomId}/documents/contents"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "roomId" + "\\}", apiClient.escapeString(roomId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    

    

    if (file != null) {
      localVarFormParams.put("file", file);
    }

    final String[] localVarAccepts = {
      "text/plain", "application/json", "text/json", "application/xml", "text/xml"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "multipart/form-data"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };
    
    GenericType<RoomDocument> localVarReturnType = new GenericType<RoomDocument>() {};
    RoomDocument localVarResponse = apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<RoomDocument>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Adds a DocuSign Form to a room.
   * Adds a form to a room.
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param roomId Id of the room to which the DocuSign Form is being added (required)
   * @param body Contains information about the form being added (optional)
   * @return RoomDocument
   * @throws ApiException if fails to make API call
   */
  public RoomDocument addFormToRoom(String accountId, Integer roomId, FormForAdd body) throws ApiException {
    ApiResponse<RoomDocument> localVarResponse = addFormToRoomWithHttpInfo(accountId, roomId, body);
    return localVarResponse.getData();
  }

  /**
   * Adds a DocuSign Form to a room
   * Adds a form to a room.
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param roomId Id of the room to which the DocuSign Form is being added (required)
   * @param body Contains information about the form being added (optional)
   * @return RoomDocument
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<RoomDocument > addFormToRoomWithHttpInfo(String accountId, Integer roomId, FormForAdd body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling addFormToRoom");
    }
    
    // verify the required parameter 'roomId' is set
    if (roomId == null) {
      throw new ApiException(400, "Missing the required parameter 'roomId' when calling addFormToRoom");
    }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/rooms/{roomId}/forms"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "roomId" + "\\}", apiClient.escapeString(roomId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "text/plain", "application/json", "text/json", "application/xml", "text/xml"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json-patch+json", "application/json", "text/json", "application/_*+json", "application/xml", "text/xml", "application/_*+xml"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };
    
    GenericType<RoomDocument> localVarReturnType = new GenericType<RoomDocument>() {};
    RoomDocument localVarResponse = apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<RoomDocument>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Creates a new Room.
   * Creates a new Room
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param body The properties of the new room (optional)
   * @return Room
   * @throws ApiException if fails to make API call
   */
  public Room createRoom(String accountId, RoomForCreate body) throws ApiException {
    ApiResponse<Room> localVarResponse = createRoomWithHttpInfo(accountId, body);
    return localVarResponse.getData();
  }

  /**
   * Creates a new Room
   * Creates a new Room
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param body The properties of the new room (optional)
   * @return Room
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Room > createRoomWithHttpInfo(String accountId, RoomForCreate body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling createRoom");
    }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/rooms"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "text/plain", "application/json", "text/json", "application/xml", "text/xml"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json-patch+json", "application/json", "text/json", "application/_*+json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };
    
    GenericType<Room> localVarReturnType = new GenericType<Room>() {};
    Room localVarResponse = apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<Room>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Deletes the room having the given room ID..
   * Deletes the room having the given room ID.
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param roomId ID of the room to be deleted. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteRoom(String accountId, Integer roomId) throws ApiException {
    deleteRoomWithHttpInfo(accountId, roomId);
  }

  /**
   * Deletes the room having the given room ID.
   * Deletes the room having the given room ID.
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param roomId ID of the room to be deleted. (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Object> deleteRoomWithHttpInfo(String accountId, Integer roomId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteRoom");
    }
    
    // verify the required parameter 'roomId' is set
    if (roomId == null) {
      throw new ApiException(400, "Missing the required parameter 'roomId' when calling deleteRoom");
    }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/rooms/{roomId}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "roomId" + "\\}", apiClient.escapeString(roomId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "text/plain", "application/json", "text/json", "application/xml", "text/xml"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json-patch+json", "application/json", "text/json", "application/_*+json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };
    
    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
    return new ApiResponse<Object>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), null);
  }
  /// <summary>
  /// Returns the roles for which the calling user, based on their role within the room, can assign to invitees. This method returns the room-level roles that the current user can assign to the members that they invite to a room.
  /// </summary>

 /**
  * GetAssignableRolesOptions Class.
  *
  **/
  public class GetAssignableRolesOptions
  {
  private String assigneeEmail = null;
  private String filter = null;
  private Integer startPosition = null;
  private Integer count = null;
  
 /**
  * setAssigneeEmail method.
  */
  public void setAssigneeEmail(String assigneeEmail) {
    this.assigneeEmail = assigneeEmail;
  }

 /**
  * getAssigneeEmail method.
  *
  * @return String
  */
  public String getAssigneeEmail() {
    return this.assigneeEmail;
  }
  
 /**
  * setFilter method.
  */
  public void setFilter(String filter) {
    this.filter = filter;
  }

 /**
  * getFilter method.
  *
  * @return String
  */
  public String getFilter() {
    return this.filter;
  }
  
 /**
  * setStartPosition method.
  */
  public void setStartPosition(Integer startPosition) {
    this.startPosition = startPosition;
  }

 /**
  * getStartPosition method.
  *
  * @return Integer
  */
  public Integer getStartPosition() {
    return this.startPosition;
  }
  
 /**
  * setCount method.
  */
  public void setCount(Integer count) {
    this.count = count;
  }

 /**
  * getCount method.
  *
  * @return Integer
  */
  public Integer getCount() {
    return this.count;
  }
  }

   /**
   * Returns the roles for which the calling user, based on their role within the room, can assign to invitees..
   * This method returns the room-level roles that the current user can assign to the members that they invite to a room.
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param roomId The id of the room. (required)
   * @return AssignableRoles
   */ 
  public AssignableRoles getAssignableRoles(String accountId, Integer roomId) throws ApiException {
    return getAssignableRoles(accountId, roomId, null);
  }

  /**
   * Returns the roles for which the calling user, based on their role within the room, can assign to invitees..
   * This method returns the room-level roles that the current user can assign to the members that they invite to a room.
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param roomId The id of the room. (required)
   * @param options for modifying the method behavior.
   * @return AssignableRoles
   * @throws ApiException if fails to make API call
   */
  public AssignableRoles getAssignableRoles(String accountId, Integer roomId, RoomsApi.GetAssignableRolesOptions options) throws ApiException {
    ApiResponse<AssignableRoles> localVarResponse = getAssignableRolesWithHttpInfo(accountId, roomId, options);
    return localVarResponse.getData();
  }

  /**
   * Returns the roles for which the calling user, based on their role within the room, can assign to invitees.
   * This method returns the room-level roles that the current user can assign to the members that they invite to a room.
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param roomId The id of the room. (required)
   * @param options for modifying the method behavior.
   * @return AssignableRoles
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<AssignableRoles > getAssignableRolesWithHttpInfo(String accountId, Integer roomId, RoomsApi.GetAssignableRolesOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getAssignableRoles");
    }
    
    // verify the required parameter 'roomId' is set
    if (roomId == null) {
      throw new ApiException(400, "Missing the required parameter 'roomId' when calling getAssignableRoles");
    }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/rooms/{roomId}/assignable_roles"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "roomId" + "\\}", apiClient.escapeString(roomId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("assigneeEmail", options.assigneeEmail));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("filter", options.filter));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("startPosition", options.startPosition));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("count", options.count));
    }

    

    

    final String[] localVarAccepts = {
      "text/plain", "application/json", "text/json", "application/xml", "text/xml"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json-patch+json", "application/json", "text/json", "application/_*+json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };
    
    GenericType<AssignableRoles> localVarReturnType = new GenericType<AssignableRoles>() {};
    AssignableRoles localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<AssignableRoles>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }
  /// <summary>
  /// Get documents in the room accessible to the calling user. This method returns a list of documents that the current user can access for a specific room.
  /// </summary>

 /**
  * GetDocumentsOptions Class.
  *
  **/
  public class GetDocumentsOptions
  {
  private Integer count = null;
  private Integer startPosition = null;
  private Boolean requireContentForDynamicDocuments = null;
  private Integer roomFolderId = null;
  private String nameFilter = null;
  private Boolean includeArchived = null;
  
 /**
  * setCount method.
  */
  public void setCount(Integer count) {
    this.count = count;
  }

 /**
  * getCount method.
  *
  * @return Integer
  */
  public Integer getCount() {
    return this.count;
  }
  
 /**
  * setStartPosition method.
  */
  public void setStartPosition(Integer startPosition) {
    this.startPosition = startPosition;
  }

 /**
  * getStartPosition method.
  *
  * @return Integer
  */
  public Integer getStartPosition() {
    return this.startPosition;
  }
  
 /**
  * setRequireContentForDynamicDocuments method.
  */
  public void setRequireContentForDynamicDocuments(Boolean requireContentForDynamicDocuments) {
    this.requireContentForDynamicDocuments = requireContentForDynamicDocuments;
  }

 /**
  * getRequireContentForDynamicDocuments method.
  *
  * @return Boolean
  */
  public Boolean getRequireContentForDynamicDocuments() {
    return this.requireContentForDynamicDocuments;
  }
  
 /**
  * setRoomFolderId method.
  */
  public void setRoomFolderId(Integer roomFolderId) {
    this.roomFolderId = roomFolderId;
  }

 /**
  * getRoomFolderId method.
  *
  * @return Integer
  */
  public Integer getRoomFolderId() {
    return this.roomFolderId;
  }
  
 /**
  * setNameFilter method.
  */
  public void setNameFilter(String nameFilter) {
    this.nameFilter = nameFilter;
  }

 /**
  * getNameFilter method.
  *
  * @return String
  */
  public String getNameFilter() {
    return this.nameFilter;
  }
  
 /**
  * setIncludeArchived method.
  */
  public void setIncludeArchived(Boolean includeArchived) {
    this.includeArchived = includeArchived;
  }

 /**
  * getIncludeArchived method.
  *
  * @return Boolean
  */
  public Boolean getIncludeArchived() {
    return this.includeArchived;
  }
  }

   /**
   * Get documents in the room accessible to the calling user..
   * This method returns a list of documents that the current user can access for a specific room.
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param roomId The id of the room. (required)
   * @return RoomDocumentList
   */ 
  public RoomDocumentList getDocuments(String accountId, Integer roomId) throws ApiException {
    return getDocuments(accountId, roomId, null);
  }

  /**
   * Get documents in the room accessible to the calling user..
   * This method returns a list of documents that the current user can access for a specific room.
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param roomId The id of the room. (required)
   * @param options for modifying the method behavior.
   * @return RoomDocumentList
   * @throws ApiException if fails to make API call
   */
  public RoomDocumentList getDocuments(String accountId, Integer roomId, RoomsApi.GetDocumentsOptions options) throws ApiException {
    ApiResponse<RoomDocumentList> localVarResponse = getDocumentsWithHttpInfo(accountId, roomId, options);
    return localVarResponse.getData();
  }

  /**
   * Get documents in the room accessible to the calling user.
   * This method returns a list of documents that the current user can access for a specific room.
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param roomId The id of the room. (required)
   * @param options for modifying the method behavior.
   * @return RoomDocumentList
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<RoomDocumentList > getDocumentsWithHttpInfo(String accountId, Integer roomId, RoomsApi.GetDocumentsOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getDocuments");
    }
    
    // verify the required parameter 'roomId' is set
    if (roomId == null) {
      throw new ApiException(400, "Missing the required parameter 'roomId' when calling getDocuments");
    }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/rooms/{roomId}/documents"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "roomId" + "\\}", apiClient.escapeString(roomId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("count", options.count));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("startPosition", options.startPosition));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("requireContentForDynamicDocuments", options.requireContentForDynamicDocuments));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("roomFolderId", options.roomFolderId));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("nameFilter", options.nameFilter));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("includeArchived", options.includeArchived));
    }

    

    

    final String[] localVarAccepts = {
      "text/plain", "application/json", "text/json", "application/xml", "text/xml"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json-patch+json", "application/json", "text/json", "application/_*+json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };
    
    GenericType<RoomDocumentList> localVarReturnType = new GenericType<RoomDocumentList>() {};
    RoomDocumentList localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<RoomDocumentList>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }
  /// <summary>
  /// Gets information about the given room. Returns details about the given room
  /// </summary>

 /**
  * GetRoomOptions Class.
  *
  **/
  public class GetRoomOptions
  {
  private Boolean includeFieldData = null;
  
 /**
  * setIncludeFieldData method.
  */
  public void setIncludeFieldData(Boolean includeFieldData) {
    this.includeFieldData = includeFieldData;
  }

 /**
  * getIncludeFieldData method.
  *
  * @return Boolean
  */
  public Boolean getIncludeFieldData() {
    return this.includeFieldData;
  }
  }

   /**
   * Gets information about the given room..
   * Returns details about the given room
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param roomId The id of the room. (required)
   * @return Room
   */ 
  public Room getRoom(String accountId, Integer roomId) throws ApiException {
    return getRoom(accountId, roomId, null);
  }

  /**
   * Gets information about the given room..
   * Returns details about the given room
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param roomId The id of the room. (required)
   * @param options for modifying the method behavior.
   * @return Room
   * @throws ApiException if fails to make API call
   */
  public Room getRoom(String accountId, Integer roomId, RoomsApi.GetRoomOptions options) throws ApiException {
    ApiResponse<Room> localVarResponse = getRoomWithHttpInfo(accountId, roomId, options);
    return localVarResponse.getData();
  }

  /**
   * Gets information about the given room.
   * Returns details about the given room
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param roomId The id of the room. (required)
   * @param options for modifying the method behavior.
   * @return Room
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Room > getRoomWithHttpInfo(String accountId, Integer roomId, RoomsApi.GetRoomOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getRoom");
    }
    
    // verify the required parameter 'roomId' is set
    if (roomId == null) {
      throw new ApiException(400, "Missing the required parameter 'roomId' when calling getRoom");
    }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/rooms/{roomId}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "roomId" + "\\}", apiClient.escapeString(roomId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("includeFieldData", options.includeFieldData));
    }

    

    

    final String[] localVarAccepts = {
      "text/plain", "application/json", "text/json", "application/xml", "text/xml"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json-patch+json", "application/json", "text/json", "application/_*+json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };
    
    GenericType<Room> localVarReturnType = new GenericType<Room>() {};
    Room localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<Room>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Returns the FieldData associated with the provided roomId..
   * Returns the field data associated with a room. This is the information that appears on the room&#39;s **Details** tab.
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param roomId The id of the room. (required)
   * @return FieldData
   * @throws ApiException if fails to make API call
   */
  public FieldData getRoomFieldData(String accountId, Integer roomId) throws ApiException {
    ApiResponse<FieldData> localVarResponse = getRoomFieldDataWithHttpInfo(accountId, roomId);
    return localVarResponse.getData();
  }

  /**
   * Returns the FieldData associated with the provided roomId.
   * Returns the field data associated with a room. This is the information that appears on the room&#39;s **Details** tab.
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param roomId The id of the room. (required)
   * @return FieldData
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<FieldData > getRoomFieldDataWithHttpInfo(String accountId, Integer roomId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getRoomFieldData");
    }
    
    // verify the required parameter 'roomId' is set
    if (roomId == null) {
      throw new ApiException(400, "Missing the required parameter 'roomId' when calling getRoomFieldData");
    }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/rooms/{roomId}/field_data"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "roomId" + "\\}", apiClient.escapeString(roomId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "text/plain", "application/json", "text/json", "application/xml", "text/xml"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json-patch+json", "application/json", "text/json", "application/_*+json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };
    
    GenericType<FieldData> localVarReturnType = new GenericType<FieldData>() {};
    FieldData localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<FieldData>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Gets the field set associated with the room..
   * Returns the field set that a room uses.
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param roomId The id of the room. (required)
   * @return FieldSet
   * @throws ApiException if fails to make API call
   */
  public FieldSet getRoomFieldSet(String accountId, Integer roomId) throws ApiException {
    ApiResponse<FieldSet> localVarResponse = getRoomFieldSetWithHttpInfo(accountId, roomId);
    return localVarResponse.getData();
  }

  /**
   * Gets the field set associated with the room.
   * Returns the field set that a room uses.
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param roomId The id of the room. (required)
   * @return FieldSet
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<FieldSet > getRoomFieldSetWithHttpInfo(String accountId, Integer roomId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getRoomFieldSet");
    }
    
    // verify the required parameter 'roomId' is set
    if (roomId == null) {
      throw new ApiException(400, "Missing the required parameter 'roomId' when calling getRoomFieldSet");
    }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/rooms/{roomId}/field_set"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "roomId" + "\\}", apiClient.escapeString(roomId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "text/plain", "application/json", "text/json", "application/xml", "text/xml"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json-patch+json", "application/json", "text/json", "application/_*+json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };
    
    GenericType<FieldSet> localVarReturnType = new GenericType<FieldSet>() {};
    FieldSet localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<FieldSet>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }
  /// <summary>
  /// Retrieves the list of users in the given room. This method returns a list of users associated with a room.
  /// </summary>

 /**
  * GetRoomUsersOptions Class.
  *
  **/
  public class GetRoomUsersOptions
  {
  private Integer count = null;
  private Integer startPosition = null;
  private String filter = null;
  private Object sort = null;
  
 /**
  * setCount method.
  */
  public void setCount(Integer count) {
    this.count = count;
  }

 /**
  * getCount method.
  *
  * @return Integer
  */
  public Integer getCount() {
    return this.count;
  }
  
 /**
  * setStartPosition method.
  */
  public void setStartPosition(Integer startPosition) {
    this.startPosition = startPosition;
  }

 /**
  * getStartPosition method.
  *
  * @return Integer
  */
  public Integer getStartPosition() {
    return this.startPosition;
  }
  
 /**
  * setFilter method.
  */
  public void setFilter(String filter) {
    this.filter = filter;
  }

 /**
  * getFilter method.
  *
  * @return String
  */
  public String getFilter() {
    return this.filter;
  }
  
 /**
  * setSort method.
  */
  public void setSort(Object sort) {
    this.sort = sort;
  }

 /**
  * getSort method.
  *
  * @return Object
  */
  public Object getSort() {
    return this.sort;
  }
  }

   /**
   * Retrieves the list of users in the given room..
   * This method returns a list of users associated with a room.
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param roomId The id of the room. (required)
   * @return RoomUsersResult
   */ 
  public RoomUsersResult getRoomUsers(String accountId, Integer roomId) throws ApiException {
    return getRoomUsers(accountId, roomId, null);
  }

  /**
   * Retrieves the list of users in the given room..
   * This method returns a list of users associated with a room.
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param roomId The id of the room. (required)
   * @param options for modifying the method behavior.
   * @return RoomUsersResult
   * @throws ApiException if fails to make API call
   */
  public RoomUsersResult getRoomUsers(String accountId, Integer roomId, RoomsApi.GetRoomUsersOptions options) throws ApiException {
    ApiResponse<RoomUsersResult> localVarResponse = getRoomUsersWithHttpInfo(accountId, roomId, options);
    return localVarResponse.getData();
  }

  /**
   * Retrieves the list of users in the given room.
   * This method returns a list of users associated with a room.
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param roomId The id of the room. (required)
   * @param options for modifying the method behavior.
   * @return RoomUsersResult
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<RoomUsersResult > getRoomUsersWithHttpInfo(String accountId, Integer roomId, RoomsApi.GetRoomUsersOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getRoomUsers");
    }
    
    // verify the required parameter 'roomId' is set
    if (roomId == null) {
      throw new ApiException(400, "Missing the required parameter 'roomId' when calling getRoomUsers");
    }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/rooms/{roomId}/users"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "roomId" + "\\}", apiClient.escapeString(roomId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("count", options.count));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("startPosition", options.startPosition));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("filter", options.filter));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("sort", options.sort));
    }

    

    

    final String[] localVarAccepts = {
      "text/plain", "application/json", "text/json", "application/xml", "text/xml"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json-patch+json", "application/json", "text/json", "application/_*+json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };
    
    GenericType<RoomUsersResult> localVarReturnType = new GenericType<RoomUsersResult>() {};
    RoomUsersResult localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<RoomUsersResult>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }
  /// <summary>
  /// Gets rooms available to the calling user. Gets rooms available to the calling user
  /// </summary>

 /**
  * GetRoomsOptions Class.
  *
  **/
  public class GetRoomsOptions
  {
  private Integer count = null;
  private Integer startPosition = null;
  private Object roomStatus = null;
  private Integer officeId = null;
  private String fieldDataChangedStartDate = null;
  private String fieldDataChangedEndDate = null;
  private String roomClosedStartDate = null;
  private String roomClosedEndDate = null;
  
 /**
  * setCount method.
  */
  public void setCount(Integer count) {
    this.count = count;
  }

 /**
  * getCount method.
  *
  * @return Integer
  */
  public Integer getCount() {
    return this.count;
  }
  
 /**
  * setStartPosition method.
  */
  public void setStartPosition(Integer startPosition) {
    this.startPosition = startPosition;
  }

 /**
  * getStartPosition method.
  *
  * @return Integer
  */
  public Integer getStartPosition() {
    return this.startPosition;
  }
  
 /**
  * setRoomStatus method.
  */
  public void setRoomStatus(Object roomStatus) {
    this.roomStatus = roomStatus;
  }

 /**
  * getRoomStatus method.
  *
  * @return Object
  */
  public Object getRoomStatus() {
    return this.roomStatus;
  }
  
 /**
  * setOfficeId method.
  */
  public void setOfficeId(Integer officeId) {
    this.officeId = officeId;
  }

 /**
  * getOfficeId method.
  *
  * @return Integer
  */
  public Integer getOfficeId() {
    return this.officeId;
  }
  
 /**
  * setFieldDataChangedStartDate method.
  */
  public void setFieldDataChangedStartDate(String fieldDataChangedStartDate) {
    this.fieldDataChangedStartDate = fieldDataChangedStartDate;
  }

 /**
  * getFieldDataChangedStartDate method.
  *
  * @return String
  */
  public String getFieldDataChangedStartDate() {
    return this.fieldDataChangedStartDate;
  }
  
 /**
  * setFieldDataChangedEndDate method.
  */
  public void setFieldDataChangedEndDate(String fieldDataChangedEndDate) {
    this.fieldDataChangedEndDate = fieldDataChangedEndDate;
  }

 /**
  * getFieldDataChangedEndDate method.
  *
  * @return String
  */
  public String getFieldDataChangedEndDate() {
    return this.fieldDataChangedEndDate;
  }
  
 /**
  * setRoomClosedStartDate method.
  */
  public void setRoomClosedStartDate(String roomClosedStartDate) {
    this.roomClosedStartDate = roomClosedStartDate;
  }

 /**
  * getRoomClosedStartDate method.
  *
  * @return String
  */
  public String getRoomClosedStartDate() {
    return this.roomClosedStartDate;
  }
  
 /**
  * setRoomClosedEndDate method.
  */
  public void setRoomClosedEndDate(String roomClosedEndDate) {
    this.roomClosedEndDate = roomClosedEndDate;
  }

 /**
  * getRoomClosedEndDate method.
  *
  * @return String
  */
  public String getRoomClosedEndDate() {
    return this.roomClosedEndDate;
  }
  }

   /**
   * Gets rooms available to the calling user..
   * Gets rooms available to the calling user
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @return RoomSummaryList
   */ 
  public RoomSummaryList getRooms(String accountId) throws ApiException {
    return getRooms(accountId, null);
  }

  /**
   * Gets rooms available to the calling user..
   * Gets rooms available to the calling user
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param options for modifying the method behavior.
   * @return RoomSummaryList
   * @throws ApiException if fails to make API call
   */
  public RoomSummaryList getRooms(String accountId, RoomsApi.GetRoomsOptions options) throws ApiException {
    ApiResponse<RoomSummaryList> localVarResponse = getRoomsWithHttpInfo(accountId, options);
    return localVarResponse.getData();
  }

  /**
   * Gets rooms available to the calling user.
   * Gets rooms available to the calling user
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param options for modifying the method behavior.
   * @return RoomSummaryList
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<RoomSummaryList > getRoomsWithHttpInfo(String accountId, RoomsApi.GetRoomsOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getRooms");
    }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/rooms"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("count", options.count));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("startPosition", options.startPosition));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("roomStatus", options.roomStatus));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("officeId", options.officeId));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("fieldDataChangedStartDate", options.fieldDataChangedStartDate));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("fieldDataChangedEndDate", options.fieldDataChangedEndDate));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("roomClosedStartDate", options.roomClosedStartDate));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("roomClosedEndDate", options.roomClosedEndDate));
    }

    

    

    final String[] localVarAccepts = {
      "text/plain", "application/json", "text/json", "application/xml", "text/xml"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json-patch+json", "application/json", "text/json", "application/_*+json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };
    
    GenericType<RoomSummaryList> localVarReturnType = new GenericType<RoomSummaryList>() {};
    RoomSummaryList localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<RoomSummaryList>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Invites a user to the room by email address..
   * This method invites an existing or new member to a specific room.
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param roomId The id of the room. (required)
   * @param body Name, Email, Side, Role of the user being invited (optional)
   * @return RoomInviteResponse
   * @throws ApiException if fails to make API call
   */
  public RoomInviteResponse inviteUser(String accountId, Integer roomId, RoomInvite body) throws ApiException {
    ApiResponse<RoomInviteResponse> localVarResponse = inviteUserWithHttpInfo(accountId, roomId, body);
    return localVarResponse.getData();
  }

  /**
   * Invites a user to the room by email address.
   * This method invites an existing or new member to a specific room.
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param roomId The id of the room. (required)
   * @param body Name, Email, Side, Role of the user being invited (optional)
   * @return RoomInviteResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<RoomInviteResponse > inviteUserWithHttpInfo(String accountId, Integer roomId, RoomInvite body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling inviteUser");
    }
    
    // verify the required parameter 'roomId' is set
    if (roomId == null) {
      throw new ApiException(400, "Missing the required parameter 'roomId' when calling inviteUser");
    }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/rooms/{roomId}/users"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "roomId" + "\\}", apiClient.escapeString(roomId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "text/plain", "application/json", "text/json", "application/xml", "text/xml"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json-patch+json", "application/json", "text/json", "application/_*+json", "application/xml", "text/xml", "application/_*+xml"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };
    
    GenericType<RoomInviteResponse> localVarReturnType = new GenericType<RoomInviteResponse>() {};
    RoomInviteResponse localVarResponse = apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<RoomInviteResponse>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Updates the specified user&#39;s role and transaction side..
   * Updates the specified user&#39;s role and transaction side.
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param roomId The id of the room. (required)
   * @param userId The id of the user to update. (required)
   * @param body Updated Role and Side of the given user (optional)
   * @return RoomUser
   * @throws ApiException if fails to make API call
   */
  public RoomUser putRoomUser(String accountId, Integer roomId, Integer userId, RoomUserForUpdate body) throws ApiException {
    ApiResponse<RoomUser> localVarResponse = putRoomUserWithHttpInfo(accountId, roomId, userId, body);
    return localVarResponse.getData();
  }

  /**
   * Updates the specified user&#39;s role and transaction side.
   * Updates the specified user&#39;s role and transaction side.
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param roomId The id of the room. (required)
   * @param userId The id of the user to update. (required)
   * @param body Updated Role and Side of the given user (optional)
   * @return RoomUser
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<RoomUser > putRoomUserWithHttpInfo(String accountId, Integer roomId, Integer userId, RoomUserForUpdate body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling putRoomUser");
    }
    
    // verify the required parameter 'roomId' is set
    if (roomId == null) {
      throw new ApiException(400, "Missing the required parameter 'roomId' when calling putRoomUser");
    }
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling putRoomUser");
    }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/rooms/{roomId}/users/{userId}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "roomId" + "\\}", apiClient.escapeString(roomId.toString()))
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "text/plain", "application/json", "text/json", "application/xml", "text/xml"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json-patch+json", "application/json", "text/json", "application/_*+json", "application/xml", "text/xml", "application/_*+xml"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };
    
    GenericType<RoomUser> localVarReturnType = new GenericType<RoomUser>() {};
    RoomUser localVarResponse = apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<RoomUser>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Restores the specified user&#39;s access to the room..
   * Restores the specified user&#39;s access to the room.
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param roomId The room Id to restore access (required)
   * @param userId The user Id getting restored to the room (required)
   * @throws ApiException if fails to make API call
   */
  public void restoreRoomUserAccess(String accountId, Integer roomId, Integer userId) throws ApiException {
    restoreRoomUserAccessWithHttpInfo(accountId, roomId, userId);
  }

  /**
   * Restores the specified user&#39;s access to the room.
   * Restores the specified user&#39;s access to the room.
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param roomId The room Id to restore access (required)
   * @param userId The user Id getting restored to the room (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Object> restoreRoomUserAccessWithHttpInfo(String accountId, Integer roomId, Integer userId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling restoreRoomUserAccess");
    }
    
    // verify the required parameter 'roomId' is set
    if (roomId == null) {
      throw new ApiException(400, "Missing the required parameter 'roomId' when calling restoreRoomUserAccess");
    }
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling restoreRoomUserAccess");
    }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/rooms/{roomId}/users/{userId}/restore_access"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "roomId" + "\\}", apiClient.escapeString(roomId.toString()))
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "text/plain", "application/json", "text/json", "application/xml", "text/xml"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json-patch+json", "application/json", "text/json", "application/_*+json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };
    
    apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
    return new ApiResponse<Object>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), null);
  }

  /**
   * Revokes the specified user&#39;s access to the room..
   * Revokes the specified user&#39;s access to the room.
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param roomId The room Id to revoke access from (required)
   * @param userId The user Id getting revoked from the room (required)
   * @param body Contains the date on which the users room access should be revoked (optional)
   * @throws ApiException if fails to make API call
   */
  public void revokeRoomUserAccess(String accountId, Integer roomId, Integer userId, RoomUserRemovalDetail body) throws ApiException {
    revokeRoomUserAccessWithHttpInfo(accountId, roomId, userId, body);
  }

  /**
   * Revokes the specified user&#39;s access to the room.
   * Revokes the specified user&#39;s access to the room.
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param roomId The room Id to revoke access from (required)
   * @param userId The user Id getting revoked from the room (required)
   * @param body Contains the date on which the users room access should be revoked (optional)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Object> revokeRoomUserAccessWithHttpInfo(String accountId, Integer roomId, Integer userId, RoomUserRemovalDetail body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling revokeRoomUserAccess");
    }
    
    // verify the required parameter 'roomId' is set
    if (roomId == null) {
      throw new ApiException(400, "Missing the required parameter 'roomId' when calling revokeRoomUserAccess");
    }
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling revokeRoomUserAccess");
    }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/rooms/{roomId}/users/{userId}/revoke_access"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "roomId" + "\\}", apiClient.escapeString(roomId.toString()))
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "text/plain", "application/json", "text/json", "application/xml", "text/xml"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json-patch+json", "application/json", "text/json", "application/_*+json", "application/xml", "text/xml", "application/_*+xml"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };
    
    apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
    return new ApiResponse<Object>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), null);
  }

  /**
   * Update the picture for a room..
   * This endpoint supports the following content types, application/json as JSON PictureForUpdate{\&quot;fileName\&quot;:\&quot;string\&quot;, \&quot;Base64Contents\&quot;:\&quot;string\&quot;}, multipart/formdata and any other streamed binary content type (as long as either query parameter fileName or request header ContentDisposition filename is included).
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param roomId ID of the room the picture is for. (required)
   * @param file File to be uploaded (optional)
   * @return RoomPicture
   * @throws ApiException if fails to make API call
   */
  public RoomPicture updatePicture(String accountId, Integer roomId, byte[] file) throws ApiException {
    ApiResponse<RoomPicture> localVarResponse = updatePictureWithHttpInfo(accountId, roomId,  file);
    return localVarResponse.getData();
  }

  /**
   * Update the picture for a room.
   * This endpoint supports the following content types, application/json as JSON PictureForUpdate{\&quot;fileName\&quot;:\&quot;string\&quot;, \&quot;Base64Contents\&quot;:\&quot;string\&quot;}, multipart/formdata and any other streamed binary content type (as long as either query parameter fileName or request header ContentDisposition filename is included).
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param roomId ID of the room the picture is for. (required)
   * @param file File to be uploaded (optional)
   * @return RoomPicture
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<RoomPicture > updatePictureWithHttpInfo(String accountId, Integer roomId, byte[] file) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updatePicture");
    }
    
    // verify the required parameter 'roomId' is set
    if (roomId == null) {
      throw new ApiException(400, "Missing the required parameter 'roomId' when calling updatePicture");
    }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/rooms/{roomId}/picture"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "roomId" + "\\}", apiClient.escapeString(roomId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    

    

    if (file != null) {
      localVarFormParams.put("file", file);
    }

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "multipart/form-data"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };
    
    GenericType<RoomPicture> localVarReturnType = new GenericType<RoomPicture>() {};
    RoomPicture localVarResponse = apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<RoomPicture>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Updates room field data..
   * Updates room field data.
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param roomId The id of the room. (required)
   * @param body Dictionary of data to be updated (optional)
   * @return FieldData
   * @throws ApiException if fails to make API call
   */
  public FieldData updateRoomFieldData(String accountId, Integer roomId, FieldDataForUpdate body) throws ApiException {
    ApiResponse<FieldData> localVarResponse = updateRoomFieldDataWithHttpInfo(accountId, roomId, body);
    return localVarResponse.getData();
  }

  /**
   * Updates room field data.
   * Updates room field data.
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param roomId The id of the room. (required)
   * @param body Dictionary of data to be updated (optional)
   * @return FieldData
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<FieldData > updateRoomFieldDataWithHttpInfo(String accountId, Integer roomId, FieldDataForUpdate body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateRoomFieldData");
    }
    
    // verify the required parameter 'roomId' is set
    if (roomId == null) {
      throw new ApiException(400, "Missing the required parameter 'roomId' when calling updateRoomFieldData");
    }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/rooms/{roomId}/field_data"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "roomId" + "\\}", apiClient.escapeString(roomId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "text/plain", "application/json", "text/json", "application/xml", "text/xml"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json-patch+json", "application/json", "text/json", "application/_*+json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };
    
    GenericType<FieldData> localVarReturnType = new GenericType<FieldData>() {};
    FieldData localVarResponse = apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<FieldData>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }
}
