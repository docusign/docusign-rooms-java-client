
package com.docusign.rooms.api;

import javax.ws.rs.core.GenericType;

import com.docusign.rooms.client.ApiException;
import com.docusign.rooms.client.ApiClient;
import com.docusign.rooms.client.Configuration;
import com.docusign.rooms.model.*;
import com.docusign.rooms.client.Pair;



public class FieldsApi {
  private ApiClient apiClient;

  public FieldsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public FieldsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /// <summary>
  /// Get details of a specific field set. 
  /// </summary>
  public class GetFieldSetOptions
  {
  private java.util.List<String> fieldsCustomDataFilters = null;
  /*
   *  
   */
  public void setFieldsCustomDataFilters(java.util.List<String> fieldsCustomDataFilters) {
    this.fieldsCustomDataFilters = fieldsCustomDataFilters;
  }

  public java.util.List<String> getFieldsCustomDataFilters() {
    return this.fieldsCustomDataFilters;
  }
  }

   /**
   * Get details of a specific field set.
   * 
   * @param accountId  (required)
   * @param fieldSetId  (required)
   * @return FieldSet
   */ 
  public FieldSet getFieldSet(String accountId, java.util.UUID fieldSetId) throws ApiException {
    return getFieldSet(accountId, fieldSetId, null);
  }

  /**
   * Get details of a specific field set.
   * 
   * @param accountId  (required)
   * @param fieldSetId  (required)
   * @param options for modifying the method behavior.
   * @return FieldSet
   * @throws ApiException if fails to make API call
   */
  public FieldSet getFieldSet(String accountId, java.util.UUID fieldSetId, FieldsApi.GetFieldSetOptions options) throws ApiException {
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
      "text/plain", "application/json", "text/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };

    GenericType<FieldSet> localVarReturnType = new GenericType<FieldSet>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
