
package com.docusign.rooms.api;

import javax.ws.rs.core.GenericType;

import com.docusign.rooms.client.ApiException;
import com.docusign.rooms.client.ApiClient;
import com.docusign.rooms.client.Configuration;
import com.docusign.rooms.model.*;
import com.docusign.rooms.client.Pair;
import com.docusign.rooms.client.ApiResponse;




/**
 * FormGroupFormsApi class.
 *
 **/
public class FormGroupFormsApi {
  private ApiClient apiClient;

 /**
  * FormGroupFormsApi.
  *
  **/
  public FormGroupFormsApi() {
    this(Configuration.getDefaultApiClient());
  }

 /**
  * FormGroupFormsApi.
  *
  **/
  public FormGroupFormsApi(ApiClient apiClient) {
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
  /// Gets the user&#39;s form group&#39;s forms. Get forms of the specified form group.
  /// </summary>

 /**
  * GetFormGroupFormsOptions Class.
  *
  **/
  public class GetFormGroupFormsOptions
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
   * Gets the user&#39;s form group&#39;s forms..
   * Get forms of the specified form group.
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param formGroupId The ID of the form group. (required)
   * @return FormGroupFormList
   */ 
  public FormGroupFormList getFormGroupForms(String accountId, java.util.UUID formGroupId) throws ApiException {
    return getFormGroupForms(accountId, formGroupId, null);
  }

  /**
   * Gets the user&#39;s form group&#39;s forms..
   * Get forms of the specified form group.
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param formGroupId The ID of the form group. (required)
   * @param options for modifying the method behavior.
   * @return FormGroupFormList
   * @throws ApiException if fails to make API call
   */
  public FormGroupFormList getFormGroupForms(String accountId, java.util.UUID formGroupId, FormGroupFormsApi.GetFormGroupFormsOptions options) throws ApiException {
    ApiResponse<FormGroupFormList> localVarResponse = getFormGroupFormsWithHttpInfo(accountId, formGroupId, options);
    return localVarResponse.getData();
  }

  /**
   * Gets the user&#39;s form group&#39;s forms.
   * Get forms of the specified form group.
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param formGroupId The ID of the form group. (required)
   * @param options for modifying the method behavior.
   * @return FormGroupFormList
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<FormGroupFormList > getFormGroupFormsWithHttpInfo(String accountId, java.util.UUID formGroupId, FormGroupFormsApi.GetFormGroupFormsOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getFormGroupForms");
    }
    
    // verify the required parameter 'formGroupId' is set
    if (formGroupId == null) {
      throw new ApiException(400, "Missing the required parameter 'formGroupId' when calling getFormGroupForms");
    }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/form_groups/{formGroupId}/forms"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "formGroupId" + "\\}", apiClient.escapeString(formGroupId.toString()));

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
    
    GenericType<FormGroupFormList> localVarReturnType = new GenericType<FormGroupFormList>() {};
    FormGroupFormList localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<FormGroupFormList>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }
}
