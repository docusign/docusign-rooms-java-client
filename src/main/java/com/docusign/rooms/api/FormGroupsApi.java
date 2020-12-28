
package com.docusign.rooms.api;

import javax.ws.rs.core.GenericType;

import com.docusign.rooms.client.ApiException;
import com.docusign.rooms.client.ApiClient;
import com.docusign.rooms.client.Configuration;
import com.docusign.rooms.model.*;
import com.docusign.rooms.client.Pair;



public class FormGroupsApi {
  private ApiClient apiClient;

  public FormGroupsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public FormGroupsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }


  /**
   * Assigns a form to a form group.
   * 
   * @param accountId  (required)
   * @param formGroupId  (required)
   * @param body  (optional)
   * @return FormGroupFormToAssign
   * @throws ApiException if fails to make API call
   */
  public FormGroupFormToAssign assignFormGroupForm(String accountId, java.util.UUID formGroupId, FormGroupFormToAssign body) throws ApiException {
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
      "text/plain", "application/json", "text/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json-patch+json", "application/json", "text/json", "application/_*+json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };

    GenericType<FormGroupFormToAssign> localVarReturnType = new GenericType<FormGroupFormToAssign>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Creates a form group.
   * 
   * @param accountId  (required)
   * @param body  (optional)
   * @return FormGroup
   * @throws ApiException if fails to make API call
   */
  public FormGroup createFormGroup(String accountId, FormGroupForCreate body) throws ApiException {
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
      "text/plain", "application/json", "text/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json-patch+json", "application/json", "text/json", "application/_*+json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };

    GenericType<FormGroup> localVarReturnType = new GenericType<FormGroup>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Deletes a form group.
   * 
   * @param accountId  (required)
   * @param formGroupId  (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteFormGroup(String accountId, java.util.UUID formGroupId) throws ApiException {
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
      "text/plain", "application/json", "text/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };


    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }

  /**
   * Gets a form group.
   * 
   * @param accountId  (required)
   * @param formGroupId  (required)
   * @return FormGroup
   * @throws ApiException if fails to make API call
   */
  public FormGroup getFormGroup(String accountId, java.util.UUID formGroupId) throws ApiException {
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
      "text/plain", "application/json", "text/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };

    GenericType<FormGroup> localVarReturnType = new GenericType<FormGroup>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /// <summary>
  /// Get account Form Groups. 
  /// </summary>
  public class GetFormGroupsOptions
  {
  private Integer count = null;
  private Integer startPosition = null;
  /*
   * Number of Form Groups to include in the response, (Default 100). 
   */
  public void setCount(Integer count) {
    this.count = count;
  }

  public Integer getCount() {
    return this.count;
  }
  /*
   * Position in the overall list of Form Groups to begin results. 
   */
  public void setStartPosition(Integer startPosition) {
    this.startPosition = startPosition;
  }

  public Integer getStartPosition() {
    return this.startPosition;
  }
  }

   /**
   * Get account Form Groups.
   * 
   * @param accountId  (required)
   * @return FormGroupSummaryList
   */ 
  public FormGroupSummaryList getFormGroups(String accountId) throws ApiException {
    return getFormGroups(accountId, null);
  }

  /**
   * Get account Form Groups.
   * 
   * @param accountId  (required)
   * @param options for modifying the method behavior.
   * @return FormGroupSummaryList
   * @throws ApiException if fails to make API call
   */
  public FormGroupSummaryList getFormGroups(String accountId, FormGroupsApi.GetFormGroupsOptions options) throws ApiException {
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
      "text/plain", "application/json", "text/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };

    GenericType<FormGroupSummaryList> localVarReturnType = new GenericType<FormGroupSummaryList>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Assign office to a form group so the specified office has access to the form group.
   * 
   * @param accountId  (required)
   * @param formGroupId  (required)
   * @param officeId  (required)
   * @throws ApiException if fails to make API call
   */
  public void grantOfficeAccessToFormGroup(String accountId, java.util.UUID formGroupId, Integer officeId) throws ApiException {
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
      "text/plain", "application/json", "text/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };


    apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }

  /**
   * Removes a form from a form group.
   * 
   * @param accountId  (required)
   * @param formGroupId  (required)
   * @param formId  (required)
   * @throws ApiException if fails to make API call
   */
  public void removeFormGroupForm(String accountId, java.util.UUID formGroupId, java.util.UUID formId) throws ApiException {
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
      "text/plain", "application/json", "text/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };


    apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }

  /**
   * Renames a form group.
   * 
   * @param accountId  (required)
   * @param formGroupId  (required)
   * @param body  (optional)
   * @return FormGroup
   * @throws ApiException if fails to make API call
   */
  public FormGroup renameFormGroup(String accountId, java.util.UUID formGroupId, FormGroupForUpdate body) throws ApiException {
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
      "text/plain", "application/json", "text/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json-patch+json", "application/json", "text/json", "application/_*+json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };

    GenericType<FormGroup> localVarReturnType = new GenericType<FormGroup>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Remove office to a form group so the specified office doesn&#39;t have access to the form group.
   * 
   * @param accountId  (required)
   * @param formGroupId  (required)
   * @param officeId  (required)
   * @throws ApiException if fails to make API call
   */
  public void revokeOfficeAccessFromFormGroup(String accountId, java.util.UUID formGroupId, Integer officeId) throws ApiException {
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
      "text/plain", "application/json", "text/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };


    apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
}
