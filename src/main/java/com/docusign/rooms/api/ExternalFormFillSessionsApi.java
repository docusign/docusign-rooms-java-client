
package com.docusign.rooms.api;

import javax.ws.rs.core.GenericType;

import com.docusign.rooms.client.ApiException;
import com.docusign.rooms.client.ApiClient;
import com.docusign.rooms.client.Configuration;
import com.docusign.rooms.model.*;
import com.docusign.rooms.client.Pair;
import com.docusign.rooms.client.ApiResponse;




/**
 * ExternalFormFillSessionsApi class.
 *
 **/
public class ExternalFormFillSessionsApi {
  private ApiClient apiClient;

 /**
  * ExternalFormFillSessionsApi.
  *
  **/
  public ExternalFormFillSessionsApi() {
    this(Configuration.getDefaultApiClient());
  }

 /**
  * ExternalFormFillSessionsApi.
  *
  **/
  public ExternalFormFillSessionsApi(ApiClient apiClient) {
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
   * Creates an external form fill session..
   * Returns a URL for a new external form fill session, based on the &#x60;roomId&#x60; and &#x60;formId&#x60; or &#x60;formIds&#x60; that you specify in the &#x60;formFillSessionForCreate&#x60; request body.  User may supply up to 10 &#x60;formIds&#x60;. Eventually, &#x60;formId&#x60; will be deprecated.
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param body Request body that accepts the &#x60;roomId&#x60; and &#x60;formId&#x60; or &#x60;formIds&#x60; that you specify in the &#x60;formFillSessionForCreate&#x60; request body. User may supply up to 10 &#x60;formIds&#x60;. Eventually, &#x60;formId&#x60; will be deprecated (optional)
   * @return ExternalFormFillSession
   * @throws ApiException if fails to make API call
   */
  public ExternalFormFillSession createExternalFormFillSession(String accountId, ExternalFormFillSessionForCreate body) throws ApiException {
    ApiResponse<ExternalFormFillSession> localVarResponse = createExternalFormFillSessionWithHttpInfo(accountId, body);
    return localVarResponse.getData();
  }

  /**
   * Creates an external form fill session.
   * Returns a URL for a new external form fill session, based on the &#x60;roomId&#x60; and &#x60;formId&#x60; or &#x60;formIds&#x60; that you specify in the &#x60;formFillSessionForCreate&#x60; request body.  User may supply up to 10 &#x60;formIds&#x60;. Eventually, &#x60;formId&#x60; will be deprecated.
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param body Request body that accepts the &#x60;roomId&#x60; and &#x60;formId&#x60; or &#x60;formIds&#x60; that you specify in the &#x60;formFillSessionForCreate&#x60; request body. User may supply up to 10 &#x60;formIds&#x60;. Eventually, &#x60;formId&#x60; will be deprecated (optional)
   * @return ExternalFormFillSession
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ExternalFormFillSession > createExternalFormFillSessionWithHttpInfo(String accountId, ExternalFormFillSessionForCreate body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling createExternalFormFillSession");
    }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/external_form_fill_sessions"
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
      "application/json-patch+json", "application/json", "text/json", "application/_*+json", "application/xml", "text/xml", "application/_*+xml"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };
    
    GenericType<ExternalFormFillSession> localVarReturnType = new GenericType<ExternalFormFillSession>() {};
    ExternalFormFillSession localVarResponse = apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<ExternalFormFillSession>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }
}
