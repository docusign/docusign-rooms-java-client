
package com.docusign.rooms.api;

import javax.ws.rs.core.GenericType;

import com.docusign.rooms.client.ApiException;
import com.docusign.rooms.client.ApiClient;
import com.docusign.rooms.client.Configuration;
import com.docusign.rooms.model.*;
import com.docusign.rooms.client.Pair;



public class RoomsApi {
  private ApiClient apiClient;

  public RoomsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public RoomsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }


  /**
   * Add a document to a 
   * 
   * @param accountId  (required)
   * @param roomId  (required)
   * @param body  (optional)
   * @return RoomDocument
   * @throws ApiException if fails to make API call
   */
  public RoomDocument addDocumentToRoom(String accountId, Integer roomId, Document body) throws ApiException {
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
      "text/plain", "application/json", "text/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json-patch+json", "application/json", "text/json", "application/_*+json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };

    GenericType<RoomDocument> localVarReturnType = new GenericType<RoomDocument>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Add a document to a room via file contents upload.
   * 
   * @param accountId  (required)
   * @param roomId  (required)
   * @param file  (optional)
   * @return RoomDocument
   * @throws ApiException if fails to make API call
   */
  public RoomDocument addDocumentToRoomViaFileUpload(String accountId, Integer roomId, byte[] file) throws ApiException {
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
      "text/plain", "application/json", "text/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "multipart/form-data"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };

    GenericType<RoomDocument> localVarReturnType = new GenericType<RoomDocument>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Adds a DocuSign Form to a room
   * 
   * @param accountId  (required)
   * @param roomId Id of the room to which the DocuSign Form is being added (required)
   * @param body  (optional)
   * @return RoomDocument
   * @throws ApiException if fails to make API call
   */
  public RoomDocument addFormToRoom(String accountId, Integer roomId, FormForAdd body) throws ApiException {
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
      "text/plain", "application/json", "text/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json-patch+json", "application/json", "text/json", "application/_*+json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };

    GenericType<RoomDocument> localVarReturnType = new GenericType<RoomDocument>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Creates a new Room
   * 
   * @param accountId  (required)
   * @param body  (optional)
   * @return Room
   * @throws ApiException if fails to make API call
   */
  public Room createRoom(String accountId, RoomForCreate body) throws ApiException {
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
      "text/plain", "application/json", "text/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json-patch+json", "application/json", "text/json", "application/_*+json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };

    GenericType<Room> localVarReturnType = new GenericType<Room>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Deletes the room having the given room ID.
   * 
   * @param accountId  (required)
   * @param roomId ID of the room to be deleted. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteRoom(String accountId, Integer roomId) throws ApiException {
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
      "text/plain", "application/json", "text/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };


    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /// <summary>
  /// Returns the roles for which the calling user, based on their role within the room, can assign to invitees. 
  /// </summary>
  public class GetAssignableRolesOptions
  {
  private String assigneeEmail = null;
  private String filter = null;
  private Integer startPosition = null;
  private Integer count = null;
  /*
   * Optional parameter indicating to only return roles (internal/external) assignable to this user. 
   */
  public void setAssigneeEmail(String assigneeEmail) {
    this.assigneeEmail = assigneeEmail;
  }

  public String getAssigneeEmail() {
    return this.assigneeEmail;
  }
  /*
   *  
   */
  public void setFilter(String filter) {
    this.filter = filter;
  }

  public String getFilter() {
    return this.filter;
  }
  /*
   *  
   */
  public void setStartPosition(Integer startPosition) {
    this.startPosition = startPosition;
  }

  public Integer getStartPosition() {
    return this.startPosition;
  }
  /*
   *  
   */
  public void setCount(Integer count) {
    this.count = count;
  }

  public Integer getCount() {
    return this.count;
  }
  }

   /**
   * Returns the roles for which the calling user, based on their role within the room, can assign to invitees.
   * 
   * @param accountId  (required)
   * @param roomId  (required)
   * @return AssignableRoles
   */ 
  public AssignableRoles getAssignableRoles(String accountId, Integer roomId) throws ApiException {
    return getAssignableRoles(accountId, roomId, null);
  }

  /**
   * Returns the roles for which the calling user, based on their role within the room, can assign to invitees.
   * 
   * @param accountId  (required)
   * @param roomId  (required)
   * @param options for modifying the method behavior.
   * @return AssignableRoles
   * @throws ApiException if fails to make API call
   */
  public AssignableRoles getAssignableRoles(String accountId, Integer roomId, RoomsApi.GetAssignableRolesOptions options) throws ApiException {
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
      "text/plain", "application/json", "text/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };

    GenericType<AssignableRoles> localVarReturnType = new GenericType<AssignableRoles>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /// <summary>
  /// Get documents in the room accessible to the calling user. 
  /// </summary>
  public class GetDocumentsOptions
  {
  private Integer count = null;
  private Integer startPosition = null;
  /*
   * Number of documents to return. Defaults to the maximum which is 100. 
   */
  public void setCount(Integer count) {
    this.count = count;
  }

  public Integer getCount() {
    return this.count;
  }
  /*
   * Position of the first item in the total results. Defaults to 0. 
   */
  public void setStartPosition(Integer startPosition) {
    this.startPosition = startPosition;
  }

  public Integer getStartPosition() {
    return this.startPosition;
  }
  }

   /**
   * Get documents in the room accessible to the calling user.
   * 
   * @param accountId  (required)
   * @param roomId  (required)
   * @return RoomDocumentList
   */ 
  public RoomDocumentList getDocuments(String accountId, Integer roomId) throws ApiException {
    return getDocuments(accountId, roomId, null);
  }

  /**
   * Get documents in the room accessible to the calling user.
   * 
   * @param accountId  (required)
   * @param roomId  (required)
   * @param options for modifying the method behavior.
   * @return RoomDocumentList
   * @throws ApiException if fails to make API call
   */
  public RoomDocumentList getDocuments(String accountId, Integer roomId, RoomsApi.GetDocumentsOptions options) throws ApiException {
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
    }

    

    

    final String[] localVarAccepts = {
      "text/plain", "application/json", "text/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };

    GenericType<RoomDocumentList> localVarReturnType = new GenericType<RoomDocumentList>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /// <summary>
  /// Gets information about the given  
  /// </summary>
  public class GetRoomOptions
  {
  private Boolean includeFieldData = null;
  /*
   * Indicates if field data (a.k.a., room details) should be included in the response. Defaults to false. 
   */
  public void setIncludeFieldData(Boolean includeFieldData) {
    this.includeFieldData = includeFieldData;
  }

  public Boolean getIncludeFieldData() {
    return this.includeFieldData;
  }
  }

   /**
   * Gets information about the given 
   * 
   * @param accountId  (required)
   * @param roomId  (required)
   * @return Room
   */ 
  public Room getRoom(String accountId, Integer roomId) throws ApiException {
    return getRoom(accountId, roomId, null);
  }

  /**
   * Gets information about the given 
   * 
   * @param accountId  (required)
   * @param roomId  (required)
   * @param options for modifying the method behavior.
   * @return Room
   * @throws ApiException if fails to make API call
   */
  public Room getRoom(String accountId, Integer roomId, RoomsApi.GetRoomOptions options) throws ApiException {
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
      "text/plain", "application/json", "text/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };

    GenericType<Room> localVarReturnType = new GenericType<Room>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Returns the FieldData associated with the provided roomId.
   * 
   * @param accountId  (required)
   * @param roomId  (required)
   * @return FieldData
   * @throws ApiException if fails to make API call
   */
  public FieldData getRoomFieldData(String accountId, Integer roomId) throws ApiException {
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
      "text/plain", "application/json", "text/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };

    GenericType<FieldData> localVarReturnType = new GenericType<FieldData>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Gets the field set associated with the 
   * 
   * @param accountId  (required)
   * @param roomId  (required)
   * @return FieldSet
   * @throws ApiException if fails to make API call
   */
  public FieldSet getRoomFieldSet(String accountId, Integer roomId) throws ApiException {
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
      "text/plain", "application/json", "text/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };

    GenericType<FieldSet> localVarReturnType = new GenericType<FieldSet>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /// <summary>
  /// Retrieves the list of users in the given  
  /// </summary>
  public class GetRoomUsersOptions
  {
  private Integer count = null;
  private Integer startPosition = null;
  private String filter = null;
  private String sort = null;
  /*
   * Number of room users to return. Defaults to the maximum which is 100. 
   */
  public void setCount(Integer count) {
    this.count = count;
  }

  public Integer getCount() {
    return this.count;
  }
  /*
   * Position of the first item in the total results. Defaults to 0. 
   */
  public void setStartPosition(Integer startPosition) {
    this.startPosition = startPosition;
  }

  public Integer getStartPosition() {
    return this.startPosition;
  }
  /*
   * Returns room users filtered by Name and Email. 
   */
  public void setFilter(String filter) {
    this.filter = filter;
  }

  public String getFilter() {
    return this.filter;
  }
  /*
   * Sorts results. Options are FirstNameAsc, FirstNameDesc, LastNameAsc, LastNameDesc, EmailAsc, EmailDesc. Defaults to LastNameDesc 
   */
  public void setSort(String sort) {
    this.sort = sort;
  }

  public String getSort() {
    return this.sort;
  }
  }

   /**
   * Retrieves the list of users in the given 
   * 
   * @param accountId  (required)
   * @param roomId  (required)
   * @return RoomUsersResult
   */ 
  public RoomUsersResult getRoomUsers(String accountId, Integer roomId) throws ApiException {
    return getRoomUsers(accountId, roomId, null);
  }

  /**
   * Retrieves the list of users in the given 
   * 
   * @param accountId  (required)
   * @param roomId  (required)
   * @param options for modifying the method behavior.
   * @return RoomUsersResult
   * @throws ApiException if fails to make API call
   */
  public RoomUsersResult getRoomUsers(String accountId, Integer roomId, RoomsApi.GetRoomUsersOptions options) throws ApiException {
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
      "text/plain", "application/json", "text/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };

    GenericType<RoomUsersResult> localVarReturnType = new GenericType<RoomUsersResult>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /// <summary>
  /// Gets rooms available to the calling user. 
  /// </summary>
  public class GetRoomsOptions
  {
  private Integer count = null;
  private Integer startPosition = null;
  private String roomStatus = null;
  private Integer officeId = null;
  private String fieldDataChangedStartDate = null;
  private String fieldDataChangedEndDate = null;
  private String roomClosedStartDate = null;
  private String roomClosedEndDate = null;
  /*
   * Number of rooms to return. Defaults to the maximum which is 100. 
   */
  public void setCount(Integer count) {
    this.count = count;
  }

  public Integer getCount() {
    return this.count;
  }
  /*
   * Position of the first item in the total results. Defaults to 0. 
   */
  public void setStartPosition(Integer startPosition) {
    this.startPosition = startPosition;
  }

  public Integer getStartPosition() {
    return this.startPosition;
  }
  /*
   * Status of the rooms to return. Defaults to \&quot;Active\&quot;. 
   */
  public void setRoomStatus(String roomStatus) {
    this.roomStatus = roomStatus;
  }

  public String getRoomStatus() {
    return this.roomStatus;
  }
  /*
   * Only return rooms in this office. 
   */
  public void setOfficeId(Integer officeId) {
    this.officeId = officeId;
  }

  public Integer getOfficeId() {
    return this.officeId;
  }
  /*
   * Fields data changed start datetime in UTC. Valid formats: yyyy-mm-dd hh:mm:ss or yyyy/mm/dd hh:mm:ss -Time is optional and will default to 00:00:00. 
   */
  public void setFieldDataChangedStartDate(String fieldDataChangedStartDate) {
    this.fieldDataChangedStartDate = fieldDataChangedStartDate;
  }

  public String getFieldDataChangedStartDate() {
    return this.fieldDataChangedStartDate;
  }
  /*
   * Fields-data changed end DateTime in UTC. Valid formats: yyyy-mm-dd hh:mm:ss or yyyy/mm/dd hh:mm:ss -Time is optional and will default to 00:00:00. 
   */
  public void setFieldDataChangedEndDate(String fieldDataChangedEndDate) {
    this.fieldDataChangedEndDate = fieldDataChangedEndDate;
  }

  public String getFieldDataChangedEndDate() {
    return this.fieldDataChangedEndDate;
  }
  /*
   * Room closed start datetime in UTC. Valid formats: yyyy-mm-dd hh:mm:ss or yyyy/mm/dd hh:mm:ss -Time is optional and will default to 00:00:00. 
   */
  public void setRoomClosedStartDate(String roomClosedStartDate) {
    this.roomClosedStartDate = roomClosedStartDate;
  }

  public String getRoomClosedStartDate() {
    return this.roomClosedStartDate;
  }
  /*
   * Room closed end datetime in UTC. Valid formats: yyyy-mm-dd hh:mm:ss or yyyy/mm/dd hh:mm:ss -Time is optional and will default to 00:00:00. 
   */
  public void setRoomClosedEndDate(String roomClosedEndDate) {
    this.roomClosedEndDate = roomClosedEndDate;
  }

  public String getRoomClosedEndDate() {
    return this.roomClosedEndDate;
  }
  }

   /**
   * Gets rooms available to the calling user.
   * 
   * @param accountId  (required)
   * @return RoomSummaryList
   */ 
  public RoomSummaryList getRooms(String accountId) throws ApiException {
    return getRooms(accountId, null);
  }

  /**
   * Gets rooms available to the calling user.
   * 
   * @param accountId  (required)
   * @param options for modifying the method behavior.
   * @return RoomSummaryList
   * @throws ApiException if fails to make API call
   */
  public RoomSummaryList getRooms(String accountId, RoomsApi.GetRoomsOptions options) throws ApiException {
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
      "text/plain", "application/json", "text/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };

    GenericType<RoomSummaryList> localVarReturnType = new GenericType<RoomSummaryList>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Invites a user to the room by email address.
   * 
   * @param accountId  (required)
   * @param roomId  (required)
   * @param body  (optional)
   * @return RoomInviteResponse
   * @throws ApiException if fails to make API call
   */
  public RoomInviteResponse inviteUser(String accountId, Integer roomId, RoomInvite body) throws ApiException {
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
      "text/plain", "application/json", "text/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json-patch+json", "application/json", "text/json", "application/_*+json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };

    GenericType<RoomInviteResponse> localVarReturnType = new GenericType<RoomInviteResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Updates the specified user&#39;s role and transaction side.
   * 
   * @param accountId  (required)
   * @param roomId  (required)
   * @param userId  (required)
   * @param body  (optional)
   * @return RoomUser
   * @throws ApiException if fails to make API call
   */
  public RoomUser putRoomUser(String accountId, Integer roomId, Integer userId, RoomUserForUpdate body) throws ApiException {
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
      "text/plain", "application/json", "text/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json-patch+json", "application/json", "text/json", "application/_*+json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };

    GenericType<RoomUser> localVarReturnType = new GenericType<RoomUser>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Restores the specified user&#39;s access to the 
   * 
   * @param accountId  (required)
   * @param roomId The room Id to restore access (required)
   * @param userId The user Id getting restored to the room (required)
   * @throws ApiException if fails to make API call
   */
  public void restoreRoomUserAccess(String accountId, Integer roomId, Integer userId) throws ApiException {
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
      "text/plain", "application/json", "text/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };


    apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }

  /**
   * Revokes the specified user&#39;s access to the 
   * 
   * @param accountId  (required)
   * @param roomId The room Id to revoke access from (required)
   * @param userId The user Id getting revoked from the room (required)
   * @param body  (optional)
   * @throws ApiException if fails to make API call
   */
  public void revokeRoomUserAccess(String accountId, Integer roomId, Integer userId, RoomUserRemovalDetail body) throws ApiException {
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
      "text/plain", "application/json", "text/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json-patch+json", "application/json", "text/json", "application/_*+json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };


    apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }

  /**
   * Update the picture for a 
   * This endpoint supports the following content types, application/json as JSON PictureForUpdate{\&quot;fileName\&quot;:\&quot;string\&quot;, \&quot;Base64Contents\&quot;:\&quot;string\&quot;}, multipart/formdata and any other streamed binary content type (as long as either query parameter fileName or request header ContentDisposition filename is included).
   * @param accountId  (required)
   * @param roomId ID of the room the picture is for. (required)
   * @param file  (optional)
   * @return RoomPicture
   * @throws ApiException if fails to make API call
   */
  public RoomPicture updatePicture(String accountId, Integer roomId, byte[] file) throws ApiException {
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
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Updates room field data.
   * 
   * @param accountId  (required)
   * @param roomId  (required)
   * @param body  (optional)
   * @return FieldData
   * @throws ApiException if fails to make API call
   */
  public FieldData updateRoomFieldData(String accountId, Integer roomId, FieldDataForUpdate body) throws ApiException {
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
      "text/plain", "application/json", "text/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json-patch+json", "application/json", "text/json", "application/_*+json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };

    GenericType<FieldData> localVarReturnType = new GenericType<FieldData>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
