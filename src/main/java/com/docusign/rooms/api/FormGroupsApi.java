
package com.docusign.rooms.api;

import jakarta.ws.rs.core.GenericType;

import com.docusign.rooms.client.ApiException;
import com.docusign.rooms.client.ApiClient;
import com.docusign.rooms.client.Configuration;
import com.docusign.rooms.model.*;
import com.docusign.rooms.client.Pair;
import com.docusign.rooms.client.ApiResponse;




/**
 * FormGroupsApi class.
 *
 **/
public class FormGroupsApi {
  private ApiClient apiClient;

 /**
  * FormGroupsApi.
  *
  **/
  public FormGroupsApi() {
    this(Configuration.getDefaultApiClient());
  }

 /**
  * FormGroupsApi.
  *
  **/
  public FormGroupsApi(ApiClient apiClient) {
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
   * Assigns a form to a form group..
   * Assigns the form specified in the &#x60;formId&#x60; property of the request to the form group &#x60;formGroupId&#x60;.
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param formGroupId The ID of the form group. (required)
   * @param body Assigns the form specified in the &#x60;formId&#x60; property of the request to the form group &#x60;formGroupId&#x60;. (optional)
   * @return FormGroupFormToAssign
   * @throws ApiException if fails to make API call
   */
  public FormGroupFormToAssign assignFormGroupForm(String accountId, java.util.UUID formGroupId, FormGroupFormToAssign body) throws ApiException {
    ApiResponse<FormGroupFormToAssign> localVarResponse = assignFormGroupFormWithHttpInfo(accountId, formGroupId, body);
    return localVarResponse.getData();
  }

  /**
   * Assigns a form to a form group.
   * Assigns the form specified in the &#x60;formId&#x60; property of the request to the form group &#x60;formGroupId&#x60;.
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param formGroupId The ID of the form group. (required)
   * @param body Assigns the form specified in the &#x60;formId&#x60; property of the request to the form group &#x60;formGroupId&#x60;. (optional)
   * @return FormGroupFormToAssign
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<FormGroupFormToAssign > assignFormGroupFormWithHttpInfo(String accountId, java.util.UUID formGroupId, FormGroupFormToAssign body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling assignFormGroupForm");
    }
    
    // verify the required parameter 'formGroupId' is set
    if (formGroupId == null) {
      throw new ApiException(400, "Missing the required parameter 'formGroupId' when calling assignFormGroupForm");
    }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/form_groups/{formGroupId}/assign_form"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "formGroupId" + "\\}", apiClient.escapeString(formGroupId.toString()));

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
    
    GenericType<FormGroupFormToAssign> localVarReturnType = new GenericType<FormGroupFormToAssign>() {};
    FormGroupFormToAssign localVarResponse = apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<FormGroupFormToAssign>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Creates a form group..
   * Creates a new form group with the name given in the &#x60;name&#x60; property of the request body.
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param body Required input of name for the form group (optional)
   * @return FormGroup
   * @throws ApiException if fails to make API call
   */
  public FormGroup createFormGroup(String accountId, FormGroupForCreate body) throws ApiException {
    ApiResponse<FormGroup> localVarResponse = createFormGroupWithHttpInfo(accountId, body);
    return localVarResponse.getData();
  }

  /**
   * Creates a form group.
   * Creates a new form group with the name given in the &#x60;name&#x60; property of the request body.
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param body Required input of name for the form group (optional)
   * @return FormGroup
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<FormGroup > createFormGroupWithHttpInfo(String accountId, FormGroupForCreate body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling createFormGroup");
    }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/form_groups"
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
    
    GenericType<FormGroup> localVarReturnType = new GenericType<FormGroup>() {};
    FormGroup localVarResponse = apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<FormGroup>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Deletes a form group..
   * Deletes the specified form group.
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param formGroupId The ID of the form group. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteFormGroup(String accountId, java.util.UUID formGroupId) throws ApiException {
    deleteFormGroupWithHttpInfo(accountId, formGroupId);
  }

  /**
   * Deletes a form group.
   * Deletes the specified form group.
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param formGroupId The ID of the form group. (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Object> deleteFormGroupWithHttpInfo(String accountId, java.util.UUID formGroupId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteFormGroup");
    }
    
    // verify the required parameter 'formGroupId' is set
    if (formGroupId == null) {
      throw new ApiException(400, "Missing the required parameter 'formGroupId' when calling deleteFormGroup");
    }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/form_groups/{formGroupId}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "formGroupId" + "\\}", apiClient.escapeString(formGroupId.toString()));

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
    
    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
    return new ApiResponse<Object>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), null);
  }

  /**
   * Gets a form group..
   * Get the specified form group.
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param formGroupId The ID of the form group. (required)
   * @return FormGroup
   * @throws ApiException if fails to make API call
   */
  public FormGroup getFormGroup(String accountId, java.util.UUID formGroupId) throws ApiException {
    ApiResponse<FormGroup> localVarResponse = getFormGroupWithHttpInfo(accountId, formGroupId);
    return localVarResponse.getData();
  }

  /**
   * Gets a form group.
   * Get the specified form group.
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param formGroupId The ID of the form group. (required)
   * @return FormGroup
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<FormGroup > getFormGroupWithHttpInfo(String accountId, java.util.UUID formGroupId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getFormGroup");
    }
    
    // verify the required parameter 'formGroupId' is set
    if (formGroupId == null) {
      throw new ApiException(400, "Missing the required parameter 'formGroupId' when calling getFormGroup");
    }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/form_groups/{formGroupId}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "formGroupId" + "\\}", apiClient.escapeString(formGroupId.toString()));

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
    
    GenericType<FormGroup> localVarReturnType = new GenericType<FormGroup>() {};
    FormGroup localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<FormGroup>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }
  /// <summary>
  /// Get account Form Groups. Returns the company form groups to which the current user has access.
  /// </summary>

 /**
  * GetFormGroupsOptions Class.
  *
  **/
  public class GetFormGroupsOptions
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
   * Get account Form Groups..
   * Returns the company form groups to which the current user has access.
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @return FormGroupSummaryList
   */ 
  public FormGroupSummaryList getFormGroups(String accountId) throws ApiException {
    return getFormGroups(accountId, null);
  }

  /**
   * Get account Form Groups..
   * Returns the company form groups to which the current user has access.
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param options for modifying the method behavior.
   * @return FormGroupSummaryList
   * @throws ApiException if fails to make API call
   */
  public FormGroupSummaryList getFormGroups(String accountId, FormGroupsApi.GetFormGroupsOptions options) throws ApiException {
    ApiResponse<FormGroupSummaryList> localVarResponse = getFormGroupsWithHttpInfo(accountId, options);
    return localVarResponse.getData();
  }

  /**
   * Get account Form Groups.
   * Returns the company form groups to which the current user has access.
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param options for modifying the method behavior.
   * @return FormGroupSummaryList
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<FormGroupSummaryList > getFormGroupsWithHttpInfo(String accountId, FormGroupsApi.GetFormGroupsOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getFormGroups");
    }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/form_groups"
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
    
    GenericType<FormGroupSummaryList> localVarReturnType = new GenericType<FormGroupSummaryList>() {};
    FormGroupSummaryList localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<FormGroupSummaryList>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Assign office to a form group so the specified office has access to the form group..
   * \&quot;Grants the office &#x60;officeId&#x60; access to the form group &#x60;formGroupId&#x60;.
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param formGroupId The ID of the form group. (required)
   * @param officeId The id of the office. This is the id that the system generated when you created the office. (required)
   * @throws ApiException if fails to make API call
   */
  public void grantOfficeAccessToFormGroup(String accountId, java.util.UUID formGroupId, Integer officeId) throws ApiException {
    grantOfficeAccessToFormGroupWithHttpInfo(accountId, formGroupId, officeId);
  }

  /**
   * Assign office to a form group so the specified office has access to the form group.
   * \&quot;Grants the office &#x60;officeId&#x60; access to the form group &#x60;formGroupId&#x60;.
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param formGroupId The ID of the form group. (required)
   * @param officeId The id of the office. This is the id that the system generated when you created the office. (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Object> grantOfficeAccessToFormGroupWithHttpInfo(String accountId, java.util.UUID formGroupId, Integer officeId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling grantOfficeAccessToFormGroup");
    }
    
    // verify the required parameter 'formGroupId' is set
    if (formGroupId == null) {
      throw new ApiException(400, "Missing the required parameter 'formGroupId' when calling grantOfficeAccessToFormGroup");
    }
    
    // verify the required parameter 'officeId' is set
    if (officeId == null) {
      throw new ApiException(400, "Missing the required parameter 'officeId' when calling grantOfficeAccessToFormGroup");
    }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/form_groups/{formGroupId}/grant_office_access/{officeId}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "formGroupId" + "\\}", apiClient.escapeString(formGroupId.toString()))
      .replaceAll("\\{" + "officeId" + "\\}", apiClient.escapeString(officeId.toString()));

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
    
    apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
    return new ApiResponse<Object>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), null);
  }

  /**
   * Removes a form from a form group..
   * Removes the form &#x60;formId&#x60; from the form group &#x60;formGroupId&#x60;.
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param formGroupId The ID of the form group. (required)
   * @param formId The id of the form. (required)
   * @throws ApiException if fails to make API call
   */
  public void removeFormGroupForm(String accountId, java.util.UUID formGroupId, java.util.UUID formId) throws ApiException {
    removeFormGroupFormWithHttpInfo(accountId, formGroupId, formId);
  }

  /**
   * Removes a form from a form group.
   * Removes the form &#x60;formId&#x60; from the form group &#x60;formGroupId&#x60;.
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param formGroupId The ID of the form group. (required)
   * @param formId The id of the form. (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Object> removeFormGroupFormWithHttpInfo(String accountId, java.util.UUID formGroupId, java.util.UUID formId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling removeFormGroupForm");
    }
    
    // verify the required parameter 'formGroupId' is set
    if (formGroupId == null) {
      throw new ApiException(400, "Missing the required parameter 'formGroupId' when calling removeFormGroupForm");
    }
    
    // verify the required parameter 'formId' is set
    if (formId == null) {
      throw new ApiException(400, "Missing the required parameter 'formId' when calling removeFormGroupForm");
    }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/form_groups/{formGroupId}/unassign_form/{formId}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "formGroupId" + "\\}", apiClient.escapeString(formGroupId.toString()))
      .replaceAll("\\{" + "formId" + "\\}", apiClient.escapeString(formId.toString()));

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
    
    apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
    return new ApiResponse<Object>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), null);
  }

  /**
   * Renames a form group..
   * Renames the specified form group with the name given in the &#x60;name&#x60; property of the request.
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param formGroupId The ID of the form group. (required)
   * @param body Required input of name for the form group (optional)
   * @return FormGroup
   * @throws ApiException if fails to make API call
   */
  public FormGroup renameFormGroup(String accountId, java.util.UUID formGroupId, FormGroupForUpdate body) throws ApiException {
    ApiResponse<FormGroup> localVarResponse = renameFormGroupWithHttpInfo(accountId, formGroupId, body);
    return localVarResponse.getData();
  }

  /**
   * Renames a form group.
   * Renames the specified form group with the name given in the &#x60;name&#x60; property of the request.
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param formGroupId The ID of the form group. (required)
   * @param body Required input of name for the form group (optional)
   * @return FormGroup
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<FormGroup > renameFormGroupWithHttpInfo(String accountId, java.util.UUID formGroupId, FormGroupForUpdate body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling renameFormGroup");
    }
    
    // verify the required parameter 'formGroupId' is set
    if (formGroupId == null) {
      throw new ApiException(400, "Missing the required parameter 'formGroupId' when calling renameFormGroup");
    }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/form_groups/{formGroupId}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "formGroupId" + "\\}", apiClient.escapeString(formGroupId.toString()));

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
    
    GenericType<FormGroup> localVarReturnType = new GenericType<FormGroup>() {};
    FormGroup localVarResponse = apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<FormGroup>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Remove office to a form group so the specified office doesn&#39;t have access to the form group..
   * Revoke access to the form group &#x60;formGroupId&#x60; from the office &#x60;officeId&#x60;.
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param formGroupId The ID of the form group. (required)
   * @param officeId The id of the office. This is the id that the system generated when you created the office. (required)
   * @throws ApiException if fails to make API call
   */
  public void revokeOfficeAccessFromFormGroup(String accountId, java.util.UUID formGroupId, Integer officeId) throws ApiException {
    revokeOfficeAccessFromFormGroupWithHttpInfo(accountId, formGroupId, officeId);
  }

  /**
   * Remove office to a form group so the specified office doesn&#39;t have access to the form group.
   * Revoke access to the form group &#x60;formGroupId&#x60; from the office &#x60;officeId&#x60;.
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param formGroupId The ID of the form group. (required)
   * @param officeId The id of the office. This is the id that the system generated when you created the office. (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Object> revokeOfficeAccessFromFormGroupWithHttpInfo(String accountId, java.util.UUID formGroupId, Integer officeId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling revokeOfficeAccessFromFormGroup");
    }
    
    // verify the required parameter 'formGroupId' is set
    if (formGroupId == null) {
      throw new ApiException(400, "Missing the required parameter 'formGroupId' when calling revokeOfficeAccessFromFormGroup");
    }
    
    // verify the required parameter 'officeId' is set
    if (officeId == null) {
      throw new ApiException(400, "Missing the required parameter 'officeId' when calling revokeOfficeAccessFromFormGroup");
    }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/form_groups/{formGroupId}/revoke_office_access/{officeId}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "formGroupId" + "\\}", apiClient.escapeString(formGroupId.toString()))
      .replaceAll("\\{" + "officeId" + "\\}", apiClient.escapeString(officeId.toString()));

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
    
    apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
    return new ApiResponse<Object>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), null);
  }
}
