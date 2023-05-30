
package com.docusign.rooms.api;

import jakarta.ws.rs.core.GenericType;

import com.docusign.rooms.client.ApiException;
import com.docusign.rooms.client.ApiClient;
import com.docusign.rooms.client.Configuration;
import com.docusign.rooms.model.*;
import com.docusign.rooms.client.Pair;
import com.docusign.rooms.client.ApiResponse;




/**
 * ESignPermissionProfilesApi class.
 *
 **/
public class ESignPermissionProfilesApi {
  private ApiClient apiClient;

 /**
  * ESignPermissionProfilesApi.
  *
  **/
  public ESignPermissionProfilesApi() {
    this(Configuration.getDefaultApiClient());
  }

 /**
  * ESignPermissionProfilesApi.
  *
  **/
  public ESignPermissionProfilesApi(ApiClient apiClient) {
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
   * Gets permission profiles from the associated eSign account..
   * When you create or invite a new member in Rooms, the system creates an eSignature account for the member at the same time. This method returns a list of the eSignature permission profiles that the current user may be able to assign to a new member. The current user may not assign a permission higher than their own permission.
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @return ESignPermissionProfileList
   * @throws ApiException if fails to make API call
   */
  public ESignPermissionProfileList getESignPermissionProfiles(String accountId) throws ApiException {
    ApiResponse<ESignPermissionProfileList> localVarResponse = getESignPermissionProfilesWithHttpInfo(accountId);
    return localVarResponse.getData();
  }

  /**
   * Gets permission profiles from the associated eSign account.
   * When you create or invite a new member in Rooms, the system creates an eSignature account for the member at the same time. This method returns a list of the eSignature permission profiles that the current user may be able to assign to a new member. The current user may not assign a permission higher than their own permission.
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @return ESignPermissionProfileList
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ESignPermissionProfileList > getESignPermissionProfilesWithHttpInfo(String accountId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getESignPermissionProfiles");
    }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/esign_permission_profiles"
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
    
    GenericType<ESignPermissionProfileList> localVarReturnType = new GenericType<ESignPermissionProfileList>() {};
    ESignPermissionProfileList localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<ESignPermissionProfileList>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }
}
