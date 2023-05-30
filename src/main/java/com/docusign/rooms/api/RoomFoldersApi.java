
package com.docusign.rooms.api;

import jakarta.ws.rs.core.GenericType;

import com.docusign.rooms.client.ApiException;
import com.docusign.rooms.client.ApiClient;
import com.docusign.rooms.client.Configuration;
import com.docusign.rooms.model.*;
import com.docusign.rooms.client.Pair;
import com.docusign.rooms.client.ApiResponse;




/**
 * RoomFoldersApi class.
 *
 **/
public class RoomFoldersApi {
  private ApiClient apiClient;

 /**
  * RoomFoldersApi.
  *
  **/
  public RoomFoldersApi() {
    this(Configuration.getDefaultApiClient());
  }

 /**
  * RoomFoldersApi.
  *
  **/
  public RoomFoldersApi(ApiClient apiClient) {
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

  /// <summary>
  /// Gets room folders accessible to the calling user. Gets a list of room folders in the specified room that are accessible to the current user.
  /// </summary>

 /**
  * GetRoomFoldersOptions Class.
  *
  **/
  public class GetRoomFoldersOptions
  {
  private Integer startPosition = null;
  private Integer count = null;
  
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
   * Gets room folders accessible to the calling user..
   * Gets a list of room folders in the specified room that are accessible to the current user.
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param roomId The room id from which to retrieve folders. (required)
   * @return RoomFolderList
   */ 
  public RoomFolderList getRoomFolders(String accountId, Integer roomId) throws ApiException {
    return getRoomFolders(accountId, roomId, null);
  }

  /**
   * Gets room folders accessible to the calling user..
   * Gets a list of room folders in the specified room that are accessible to the current user.
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param roomId The room id from which to retrieve folders. (required)
   * @param options for modifying the method behavior.
   * @return RoomFolderList
   * @throws ApiException if fails to make API call
   */
  public RoomFolderList getRoomFolders(String accountId, Integer roomId, RoomFoldersApi.GetRoomFoldersOptions options) throws ApiException {
    ApiResponse<RoomFolderList> localVarResponse = getRoomFoldersWithHttpInfo(accountId, roomId, options);
    return localVarResponse.getData();
  }

  /**
   * Gets room folders accessible to the calling user.
   * Gets a list of room folders in the specified room that are accessible to the current user.
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param roomId The room id from which to retrieve folders. (required)
   * @param options for modifying the method behavior.
   * @return RoomFolderList
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<RoomFolderList > getRoomFoldersWithHttpInfo(String accountId, Integer roomId, RoomFoldersApi.GetRoomFoldersOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getRoomFolders");
    }
    
    // verify the required parameter 'roomId' is set
    if (roomId == null) {
      throw new ApiException(400, "Missing the required parameter 'roomId' when calling getRoomFolders");
    }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/rooms/{roomId}/room_folders"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "roomId" + "\\}", apiClient.escapeString(roomId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
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
    
    GenericType<RoomFolderList> localVarReturnType = new GenericType<RoomFolderList>() {};
    RoomFolderList localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<RoomFolderList>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }
}
