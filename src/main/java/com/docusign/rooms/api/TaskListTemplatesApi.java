
package com.docusign.rooms.api;

import jakarta.ws.rs.core.GenericType;

import com.docusign.rooms.client.ApiException;
import com.docusign.rooms.client.ApiClient;
import com.docusign.rooms.client.Configuration;
import com.docusign.rooms.model.*;
import com.docusign.rooms.client.Pair;
import com.docusign.rooms.client.ApiResponse;




/**
 * TaskListTemplatesApi class.
 *
 **/
public class TaskListTemplatesApi {
  private ApiClient apiClient;

 /**
  * TaskListTemplatesApi.
  *
  **/
  public TaskListTemplatesApi() {
    this(Configuration.getDefaultApiClient());
  }

 /**
  * TaskListTemplatesApi.
  *
  **/
  public TaskListTemplatesApi(ApiClient apiClient) {
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
  /// Returns all task list templates for the company of the active user. Returns all task list templates for the company of the active user.
  /// </summary>

 /**
  * GetTaskListTemplatesOptions Class.
  *
  **/
  public class GetTaskListTemplatesOptions
  {
  private Integer startPosition = null;
  private Integer count = null;
  
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
  }

   /**
   * Returns all task list templates for the company of the active user..
   * Returns all task list templates for the company of the active user.
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @return TaskListTemplateList
   */ 
  public TaskListTemplateList getTaskListTemplates(String accountId) throws ApiException {
    return getTaskListTemplates(accountId, null);
  }

  /**
   * Returns all task list templates for the company of the active user..
   * Returns all task list templates for the company of the active user.
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param options for modifying the method behavior.
   * @return TaskListTemplateList
   * @throws ApiException if fails to make API call
   */
  public TaskListTemplateList getTaskListTemplates(String accountId, TaskListTemplatesApi.GetTaskListTemplatesOptions options) throws ApiException {
    ApiResponse<TaskListTemplateList> localVarResponse = getTaskListTemplatesWithHttpInfo(accountId, options);
    return localVarResponse.getData();
  }

  /**
   * Returns all task list templates for the company of the active user.
   * Returns all task list templates for the company of the active user.
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param options for modifying the method behavior.
   * @return TaskListTemplateList
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<TaskListTemplateList > getTaskListTemplatesWithHttpInfo(String accountId, TaskListTemplatesApi.GetTaskListTemplatesOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getTaskListTemplates");
    }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/task_list_templates"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("startPosition", options.startPosition));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("count", options.count));
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
    
    GenericType<TaskListTemplateList> localVarReturnType = new GenericType<TaskListTemplateList>() {};
    TaskListTemplateList localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<TaskListTemplateList>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }
}
