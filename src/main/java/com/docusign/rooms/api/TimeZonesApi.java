
package com.docusign.rooms.api;

import jakarta.ws.rs.core.GenericType;

import com.docusign.rooms.client.ApiException;
import com.docusign.rooms.client.ApiClient;
import com.docusign.rooms.client.Configuration;
import com.docusign.rooms.model.*;
import com.docusign.rooms.client.Pair;
import com.docusign.rooms.client.ApiResponse;




/**
 * TimeZonesApi class.
 *
 **/
public class TimeZonesApi {
  private ApiClient apiClient;

 /**
  * TimeZonesApi.
  *
  **/
  public TimeZonesApi() {
    this(Configuration.getDefaultApiClient());
  }

 /**
  * TimeZonesApi.
  *
  **/
  public TimeZonesApi(ApiClient apiClient) {
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
   * Retrieves the list of valid time zones..
   * Gets a list of time zones that you can assign to an office.
   * @return GlobalTimeZones
   * @throws ApiException if fails to make API call
   */
  public GlobalTimeZones getTimeZones() throws ApiException {
    ApiResponse<GlobalTimeZones> localVarResponse = getTimeZonesWithHttpInfo();
    return localVarResponse.getData();
  }

  /**
   * Retrieves the list of valid time zones.
   * Gets a list of time zones that you can assign to an office.
   * @return GlobalTimeZones
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GlobalTimeZones > getTimeZonesWithHttpInfo() throws ApiException {
    Object localVarPostBody = "{}";
    
    // create path and map variables
    String localVarPath = "/v2/time_zones";

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
    
    GenericType<GlobalTimeZones> localVarReturnType = new GenericType<GlobalTimeZones>() {};
    GlobalTimeZones localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<GlobalTimeZones>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }
}
