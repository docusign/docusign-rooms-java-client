
package com.docusign.rooms.api;

import jakarta.ws.rs.core.GenericType;

import com.docusign.rooms.client.ApiException;
import com.docusign.rooms.client.ApiClient;
import com.docusign.rooms.client.Configuration;
import com.docusign.rooms.model.*;
import com.docusign.rooms.client.Pair;
import com.docusign.rooms.client.ApiResponse;




/**
 * TaskStatusesApi class.
 *
 **/
public class TaskStatusesApi {
  private ApiClient apiClient;

 /**
  * TaskStatusesApi.
  *
  **/
  public TaskStatusesApi() {
    this(Configuration.getDefaultApiClient());
  }

 /**
  * TaskStatusesApi.
  *
  **/
  public TaskStatusesApi(ApiClient apiClient) {
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
   * Retrieves the list of valid task statuses..
   * Returns a list of valid task statuses.
   * @return GlobalTaskStatuses
   * @throws ApiException if fails to make API call
   */
  public GlobalTaskStatuses getTaskStatuses() throws ApiException {
    ApiResponse<GlobalTaskStatuses> localVarResponse = getTaskStatusesWithHttpInfo();
    return localVarResponse.getData();
  }

  /**
   * Retrieves the list of valid task statuses.
   * Returns a list of valid task statuses.
   * @return GlobalTaskStatuses
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GlobalTaskStatuses > getTaskStatusesWithHttpInfo() throws ApiException {
    Object localVarPostBody = "{}";
    
    // create path and map variables
    String localVarPath = "/v2/task_statuses";

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
    
    GenericType<GlobalTaskStatuses> localVarReturnType = new GenericType<GlobalTaskStatuses>() {};
    GlobalTaskStatuses localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<GlobalTaskStatuses>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }
}
