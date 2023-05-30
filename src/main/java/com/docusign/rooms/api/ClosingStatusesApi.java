
package com.docusign.rooms.api;

import jakarta.ws.rs.core.GenericType;

import com.docusign.rooms.client.ApiException;
import com.docusign.rooms.client.ApiClient;
import com.docusign.rooms.client.Configuration;
import com.docusign.rooms.model.*;
import com.docusign.rooms.client.Pair;
import com.docusign.rooms.client.ApiResponse;




/**
 * ClosingStatusesApi class.
 *
 **/
public class ClosingStatusesApi {
  private ApiClient apiClient;

 /**
  * ClosingStatusesApi.
  *
  **/
  public ClosingStatusesApi() {
    this(Configuration.getDefaultApiClient());
  }

 /**
  * ClosingStatusesApi.
  *
  **/
  public ClosingStatusesApi(ApiClient apiClient) {
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
   * Retrieves the list of valid closing statuses..
   * Returns a list of closing statuses, or valid reasons for closing a room.
   * @return GlobalClosingStatuses
   * @throws ApiException if fails to make API call
   */
  public GlobalClosingStatuses getClosingStatuses() throws ApiException {
    ApiResponse<GlobalClosingStatuses> localVarResponse = getClosingStatusesWithHttpInfo();
    return localVarResponse.getData();
  }

  /**
   * Retrieves the list of valid closing statuses.
   * Returns a list of closing statuses, or valid reasons for closing a room.
   * @return GlobalClosingStatuses
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GlobalClosingStatuses > getClosingStatusesWithHttpInfo() throws ApiException {
    Object localVarPostBody = "{}";
    
    // create path and map variables
    String localVarPath = "/v2/closing_statuses";

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
    
    GenericType<GlobalClosingStatuses> localVarReturnType = new GenericType<GlobalClosingStatuses>() {};
    GlobalClosingStatuses localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<GlobalClosingStatuses>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }
}
