
package com.docusign.rooms.api;

import jakarta.ws.rs.core.GenericType;

import com.docusign.rooms.client.ApiException;
import com.docusign.rooms.client.ApiClient;
import com.docusign.rooms.client.Configuration;
import com.docusign.rooms.model.*;
import com.docusign.rooms.client.Pair;
import com.docusign.rooms.client.ApiResponse;




/**
 * FormLibrariesApi class.
 *
 **/
public class FormLibrariesApi {
  private ApiClient apiClient;

 /**
  * FormLibrariesApi.
  *
  **/
  public FormLibrariesApi() {
    this(Configuration.getDefaultApiClient());
  }

 /**
  * FormLibrariesApi.
  *
  **/
  public FormLibrariesApi(ApiClient apiClient) {
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
  /// Gets a paged list of forms libraries. Returns a list of form libraries to which the current user has access.
  /// </summary>

 /**
  * GetFormLibrariesOptions Class.
  *
  **/
  public class GetFormLibrariesOptions
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
   * Gets a paged list of forms libraries..
   * Returns a list of form libraries to which the current user has access.
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @return FormLibrarySummaryList
   */ 
  public FormLibrarySummaryList getFormLibraries(String accountId) throws ApiException {
    return getFormLibraries(accountId, null);
  }

  /**
   * Gets a paged list of forms libraries..
   * Returns a list of form libraries to which the current user has access.
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param options for modifying the method behavior.
   * @return FormLibrarySummaryList
   * @throws ApiException if fails to make API call
   */
  public FormLibrarySummaryList getFormLibraries(String accountId, FormLibrariesApi.GetFormLibrariesOptions options) throws ApiException {
    ApiResponse<FormLibrarySummaryList> localVarResponse = getFormLibrariesWithHttpInfo(accountId, options);
    return localVarResponse.getData();
  }

  /**
   * Gets a paged list of forms libraries.
   * Returns a list of form libraries to which the current user has access.
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param options for modifying the method behavior.
   * @return FormLibrarySummaryList
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<FormLibrarySummaryList > getFormLibrariesWithHttpInfo(String accountId, FormLibrariesApi.GetFormLibrariesOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getFormLibraries");
    }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/form_libraries"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

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
    
    GenericType<FormLibrarySummaryList> localVarReturnType = new GenericType<FormLibrarySummaryList>() {};
    FormLibrarySummaryList localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<FormLibrarySummaryList>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }
  /// <summary>
  /// Gets a paged list of forms in a forms library. Returns a list of forms  to which the current user has access in the specified form library.
  /// </summary>

 /**
  * GetFormLibraryFormsOptions Class.
  *
  **/
  public class GetFormLibraryFormsOptions
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
   * Gets a paged list of forms in a forms library..
   * Returns a list of forms  to which the current user has access in the specified form library.
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param formLibraryId Library Id (required)
   * @return FormSummaryList
   */ 
  public FormSummaryList getFormLibraryForms(String accountId, java.util.UUID formLibraryId) throws ApiException {
    return getFormLibraryForms(accountId, formLibraryId, null);
  }

  /**
   * Gets a paged list of forms in a forms library..
   * Returns a list of forms  to which the current user has access in the specified form library.
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param formLibraryId Library Id (required)
   * @param options for modifying the method behavior.
   * @return FormSummaryList
   * @throws ApiException if fails to make API call
   */
  public FormSummaryList getFormLibraryForms(String accountId, java.util.UUID formLibraryId, FormLibrariesApi.GetFormLibraryFormsOptions options) throws ApiException {
    ApiResponse<FormSummaryList> localVarResponse = getFormLibraryFormsWithHttpInfo(accountId, formLibraryId, options);
    return localVarResponse.getData();
  }

  /**
   * Gets a paged list of forms in a forms library.
   * Returns a list of forms  to which the current user has access in the specified form library.
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param formLibraryId Library Id (required)
   * @param options for modifying the method behavior.
   * @return FormSummaryList
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<FormSummaryList > getFormLibraryFormsWithHttpInfo(String accountId, java.util.UUID formLibraryId, FormLibrariesApi.GetFormLibraryFormsOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getFormLibraryForms");
    }
    
    // verify the required parameter 'formLibraryId' is set
    if (formLibraryId == null) {
      throw new ApiException(400, "Missing the required parameter 'formLibraryId' when calling getFormLibraryForms");
    }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/form_libraries/{formLibraryId}/forms"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "formLibraryId" + "\\}", apiClient.escapeString(formLibraryId.toString()));

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
    
    GenericType<FormSummaryList> localVarReturnType = new GenericType<FormSummaryList>() {};
    FormSummaryList localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<FormSummaryList>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }
}
