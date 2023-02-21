
package com.docusign.rooms.api;

import javax.ws.rs.core.GenericType;

import com.docusign.rooms.client.ApiException;
import com.docusign.rooms.client.ApiClient;
import com.docusign.rooms.client.Configuration;
import com.docusign.rooms.model.*;
import com.docusign.rooms.client.Pair;
import com.docusign.rooms.client.ApiResponse;




/**
 * TransactionSidesApi class.
 *
 **/
public class TransactionSidesApi {
  private ApiClient apiClient;

 /**
  * TransactionSidesApi.
  *
  **/
  public TransactionSidesApi() {
    this(Configuration.getDefaultApiClient());
  }

 /**
  * TransactionSidesApi.
  *
  **/
  public TransactionSidesApi(ApiClient apiClient) {
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
   * Retrieves the list of valid transaction sides..
   * Returns a list of valid transaction sides.
   * @return GlobalTransactionSides
   * @throws ApiException if fails to make API call
   */
  public GlobalTransactionSides getTransactionSides() throws ApiException {
    ApiResponse<GlobalTransactionSides> localVarResponse = getTransactionSidesWithHttpInfo();
    return localVarResponse.getData();
  }

  /**
   * Retrieves the list of valid transaction sides.
   * Returns a list of valid transaction sides.
   * @return GlobalTransactionSides
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GlobalTransactionSides > getTransactionSidesWithHttpInfo() throws ApiException {
    Object localVarPostBody = "{}";
    
    // create path and map variables
    String localVarPath = "/v2/transaction_sides";

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
    
    GenericType<GlobalTransactionSides> localVarReturnType = new GenericType<GlobalTransactionSides>() {};
    GlobalTransactionSides localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<GlobalTransactionSides>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }
}
