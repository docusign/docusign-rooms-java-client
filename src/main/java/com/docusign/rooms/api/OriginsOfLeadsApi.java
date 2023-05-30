
package com.docusign.rooms.api;

import jakarta.ws.rs.core.GenericType;

import com.docusign.rooms.client.ApiException;
import com.docusign.rooms.client.ApiClient;
import com.docusign.rooms.client.Configuration;
import com.docusign.rooms.model.*;
import com.docusign.rooms.client.Pair;
import com.docusign.rooms.client.ApiResponse;




/**
 * OriginsOfLeadsApi class.
 *
 **/
public class OriginsOfLeadsApi {
  private ApiClient apiClient;

 /**
  * OriginsOfLeadsApi.
  *
  **/
  public OriginsOfLeadsApi() {
    this(Configuration.getDefaultApiClient());
  }

 /**
  * OriginsOfLeadsApi.
  *
  **/
  public OriginsOfLeadsApi(ApiClient apiClient) {
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
   * Retrieves the list of valid origins of leads..
   * Returns a list of origins of leads (such as Trulia or Zillow) that you can specify for rooms.
   * @return GlobalOriginsOfLeads
   * @throws ApiException if fails to make API call
   */
  public GlobalOriginsOfLeads getOriginsOfLeads() throws ApiException {
    ApiResponse<GlobalOriginsOfLeads> localVarResponse = getOriginsOfLeadsWithHttpInfo();
    return localVarResponse.getData();
  }

  /**
   * Retrieves the list of valid origins of leads.
   * Returns a list of origins of leads (such as Trulia or Zillow) that you can specify for rooms.
   * @return GlobalOriginsOfLeads
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GlobalOriginsOfLeads > getOriginsOfLeadsWithHttpInfo() throws ApiException {
    Object localVarPostBody = "{}";
    
    // create path and map variables
    String localVarPath = "/v2/origins_of_leads";

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
    
    GenericType<GlobalOriginsOfLeads> localVarReturnType = new GenericType<GlobalOriginsOfLeads>() {};
    GlobalOriginsOfLeads localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<GlobalOriginsOfLeads>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }
}
