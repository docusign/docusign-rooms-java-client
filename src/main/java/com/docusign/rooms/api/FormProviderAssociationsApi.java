
package com.docusign.rooms.api;

import jakarta.ws.rs.core.GenericType;

import com.docusign.rooms.client.ApiException;
import com.docusign.rooms.client.ApiClient;
import com.docusign.rooms.client.Configuration;
import com.docusign.rooms.model.*;
import com.docusign.rooms.client.Pair;
import com.docusign.rooms.client.ApiResponse;




/**
 * FormProviderAssociationsApi class.
 *
 **/
public class FormProviderAssociationsApi {
  private ApiClient apiClient;

 /**
  * FormProviderAssociationsApi.
  *
  **/
  public FormProviderAssociationsApi() {
    this(Configuration.getDefaultApiClient());
  }

 /**
  * FormProviderAssociationsApi.
  *
  **/
  public FormProviderAssociationsApi(ApiClient apiClient) {
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
  /// Retrieves all Associations by provider Retrieves all Associations for given provider
  /// </summary>

 /**
  * GetFormProviderAssociationsOptions Class.
  *
  **/
  public class GetFormProviderAssociationsOptions
  {
  private Integer count = null;
  private Integer startPosition = null;
  
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
  }

   /**
   * Retrieves all Associations by provider.
   * Retrieves all Associations for given provider
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param providerId provider id like nar, nwmls etc.. (required)
   * @return FormProviderAssociationsSummaryList
   */ 
  public FormProviderAssociationsSummaryList getFormProviderAssociations(String accountId, String providerId) throws ApiException {
    return getFormProviderAssociations(accountId, providerId, null);
  }

  /**
   * Retrieves all Associations by provider.
   * Retrieves all Associations for given provider
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param providerId provider id like nar, nwmls etc.. (required)
   * @param options for modifying the method behavior.
   * @return FormProviderAssociationsSummaryList
   * @throws ApiException if fails to make API call
   */
  public FormProviderAssociationsSummaryList getFormProviderAssociations(String accountId, String providerId, FormProviderAssociationsApi.GetFormProviderAssociationsOptions options) throws ApiException {
    ApiResponse<FormProviderAssociationsSummaryList> localVarResponse = getFormProviderAssociationsWithHttpInfo(accountId, providerId, options);
    return localVarResponse.getData();
  }

  /**
   * Retrieves all Associations by provider
   * Retrieves all Associations for given provider
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param providerId provider id like nar, nwmls etc.. (required)
   * @param options for modifying the method behavior.
   * @return FormProviderAssociationsSummaryList
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<FormProviderAssociationsSummaryList > getFormProviderAssociationsWithHttpInfo(String accountId, String providerId, FormProviderAssociationsApi.GetFormProviderAssociationsOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getFormProviderAssociations");
    }
    
    // verify the required parameter 'providerId' is set
    if (providerId == null) {
      throw new ApiException(400, "Missing the required parameter 'providerId' when calling getFormProviderAssociations");
    }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/form_providers/{providerId}/associations"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "providerId" + "\\}", apiClient.escapeString(providerId.toString()));

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
      "text/plain", "application/json", "text/json", "application/xml", "text/xml"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json-patch+json", "application/json", "text/json", "application/_*+json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };
    
    GenericType<FormProviderAssociationsSummaryList> localVarReturnType = new GenericType<FormProviderAssociationsSummaryList>() {};
    FormProviderAssociationsSummaryList localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<FormProviderAssociationsSummaryList>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }
}
