
package com.docusign.rooms.api;

import javax.ws.rs.core.GenericType;

import com.docusign.rooms.client.ApiException;
import com.docusign.rooms.client.ApiClient;
import com.docusign.rooms.client.Configuration;
import com.docusign.rooms.model.*;
import com.docusign.rooms.client.Pair;
import com.docusign.rooms.client.ApiResponse;




/**
 * FieldsApi class.
 *
 **/
public class FieldsApi {
  private ApiClient apiClient;

 /**
  * FieldsApi.
  *
  **/
  public FieldsApi() {
    this(Configuration.getDefaultApiClient());
  }

 /**
  * FieldsApi.
  *
  **/
  public FieldsApi(ApiClient apiClient) {
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
  /// Get details of a specific field set. Get details of a specific field set.
  /// </summary>

 /**
  * GetFieldSetOptions Class.
  *
  **/
  public class GetFieldSetOptions
  {
  private java.util.List<String> fieldsCustomDataFilters = null;
  
 /**
  * setFieldsCustomDataFilters method.
  */
  public void setFieldsCustomDataFilters(java.util.List<String> fieldsCustomDataFilters) {
    this.fieldsCustomDataFilters = fieldsCustomDataFilters;
  }

 /**
  * getFieldsCustomDataFilters method.
  *
  * @return java.util.List<String>
  */
  public java.util.List<String> getFieldsCustomDataFilters() {
    return this.fieldsCustomDataFilters;
  }
  }

   /**
   * Get details of a specific field set..
   * Get details of a specific field set.
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param fieldSetId The id of the field set. (required)
   * @return FieldSet
   */ 
  public FieldSet getFieldSet(String accountId, java.util.UUID fieldSetId) throws ApiException {
    return getFieldSet(accountId, fieldSetId, null);
  }

  /**
   * Get details of a specific field set..
   * Get details of a specific field set.
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param fieldSetId The id of the field set. (required)
   * @param options for modifying the method behavior.
   * @return FieldSet
   * @throws ApiException if fails to make API call
   */
  public FieldSet getFieldSet(String accountId, java.util.UUID fieldSetId, FieldsApi.GetFieldSetOptions options) throws ApiException {
    ApiResponse<FieldSet> localVarResponse = getFieldSetWithHttpInfo(accountId, fieldSetId, options);
    return localVarResponse.getData();
  }

  /**
   * Get details of a specific field set.
   * Get details of a specific field set.
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param fieldSetId The id of the field set. (required)
   * @param options for modifying the method behavior.
   * @return FieldSet
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<FieldSet > getFieldSetWithHttpInfo(String accountId, java.util.UUID fieldSetId, FieldsApi.GetFieldSetOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getFieldSet");
    }
    
    // verify the required parameter 'fieldSetId' is set
    if (fieldSetId == null) {
      throw new ApiException(400, "Missing the required parameter 'fieldSetId' when calling getFieldSet");
    }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/field_sets/{fieldSetId}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "fieldSetId" + "\\}", apiClient.escapeString(fieldSetId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("csv", "fieldsCustomDataFilters", options.fieldsCustomDataFilters));
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
    
    GenericType<FieldSet> localVarReturnType = new GenericType<FieldSet>() {};
    FieldSet localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<FieldSet>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }
}
