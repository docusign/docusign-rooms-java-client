
package com.docusign.rooms.api;

import javax.ws.rs.core.GenericType;

import com.docusign.rooms.client.ApiException;
import com.docusign.rooms.client.ApiClient;
import com.docusign.rooms.client.Configuration;
import com.docusign.rooms.model.*;
import com.docusign.rooms.client.Pair;



public class ExternalFormFillSessionsApi {
  private ApiClient apiClient;

  public ExternalFormFillSessionsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ExternalFormFillSessionsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }


  /**
   * Creates an external form fill session.
   * 
   * @param accountId  (required)
   * @param formFillSessionForCreate  (required)
   * @return ExternalFormFillSession
   * @throws ApiException if fails to make API call
   */
  public ExternalFormFillSession createExternalFormFillSession(String accountId, ExternalFormFillSessionForCreate formFillSessionForCreate) throws ApiException {
    Object localVarPostBody = formFillSessionForCreate;
    
    // verify the required parameter 'formFillSessionForCreate' is set
    if (formFillSessionForCreate == null) {
      throw new ApiException(400, "Missing the required parameter 'formFillSessionForCreate' when calling createExternalFormFillSession");
    }
    
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
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };

    GenericType<ExternalFormFillSession> localVarReturnType = new GenericType<ExternalFormFillSession>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
