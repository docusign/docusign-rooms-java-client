
package com.docusign.rooms.api;

import javax.ws.rs.core.GenericType;

import com.docusign.rooms.client.ApiException;
import com.docusign.rooms.client.ApiClient;
import com.docusign.rooms.client.Configuration;
import com.docusign.rooms.model.*;
import com.docusign.rooms.client.Pair;
import com.docusign.rooms.client.ApiResponse;




/**
 * TaskListsApi class.
 *
 **/
public class TaskListsApi {
  private ApiClient apiClient;

 /**
  * TaskListsApi.
  *
  **/
  public TaskListsApi() {
    this(Configuration.getDefaultApiClient());
  }

 /**
  * TaskListsApi.
  *
  **/
  public TaskListsApi(ApiClient apiClient) {
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
   * Add a task list to a room based on a task list template..
   * Applies a task list to a room, based on the &#x60;taskTemplateId&#x60; that you specify in the &#x60;taskList&#x60; request body.
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param roomId Room ID. (required)
   * @param body Details for task list creation (optional)
   * @return TaskList
   * @throws ApiException if fails to make API call
   */
  public TaskList createTaskList(String accountId, Integer roomId, TaskListForCreate body) throws ApiException {
    ApiResponse<TaskList> localVarResponse = createTaskListWithHttpInfo(accountId, roomId, body);
    return localVarResponse.getData();
  }

  /**
   * Add a task list to a room based on a task list template.
   * Applies a task list to a room, based on the &#x60;taskTemplateId&#x60; that you specify in the &#x60;taskList&#x60; request body.
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param roomId Room ID. (required)
   * @param body Details for task list creation (optional)
   * @return TaskList
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<TaskList > createTaskListWithHttpInfo(String accountId, Integer roomId, TaskListForCreate body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling createTaskList");
    }
    
    // verify the required parameter 'roomId' is set
    if (roomId == null) {
      throw new ApiException(400, "Missing the required parameter 'roomId' when calling createTaskList");
    }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/rooms/{roomId}/task_lists"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "roomId" + "\\}", apiClient.escapeString(roomId.toString()));

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
    
    GenericType<TaskList> localVarReturnType = new GenericType<TaskList>() {};
    TaskList localVarResponse = apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<TaskList>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Deletes a task list. If there are attached documents they will remain in the associated room..
   * Deletes the specified task list from a room. If there are attached documents, they will remain in the associated room.
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param taskListId Task List ID (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteTaskList(String accountId, Integer taskListId) throws ApiException {
    deleteTaskListWithHttpInfo(accountId, taskListId);
  }

  /**
   * Deletes a task list. If there are attached documents they will remain in the associated room.
   * Deletes the specified task list from a room. If there are attached documents, they will remain in the associated room.
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param taskListId Task List ID (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Object> deleteTaskListWithHttpInfo(String accountId, Integer taskListId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteTaskList");
    }
    
    // verify the required parameter 'taskListId' is set
    if (taskListId == null) {
      throw new ApiException(400, "Missing the required parameter 'taskListId' when calling deleteTaskList");
    }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/task_lists/{taskListId}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "taskListId" + "\\}", apiClient.escapeString(taskListId.toString()));

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
   * Returns the summary for all viewable task lists in a room..
   * Returns the task lists associated with a room.
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param roomId Room ID (required)
   * @return TaskListSummaryList
   * @throws ApiException if fails to make API call
   */
  public TaskListSummaryList getTaskLists(String accountId, Integer roomId) throws ApiException {
    ApiResponse<TaskListSummaryList> localVarResponse = getTaskListsWithHttpInfo(accountId, roomId);
    return localVarResponse.getData();
  }

  /**
   * Returns the summary for all viewable task lists in a room.
   * Returns the task lists associated with a room.
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param roomId Room ID (required)
   * @return TaskListSummaryList
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<TaskListSummaryList > getTaskListsWithHttpInfo(String accountId, Integer roomId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getTaskLists");
    }
    
    // verify the required parameter 'roomId' is set
    if (roomId == null) {
      throw new ApiException(400, "Missing the required parameter 'roomId' when calling getTaskLists");
    }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/rooms/{roomId}/task_lists"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "roomId" + "\\}", apiClient.escapeString(roomId.toString()));

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
    
    GenericType<TaskListSummaryList> localVarReturnType = new GenericType<TaskListSummaryList>() {};
    TaskListSummaryList localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<TaskListSummaryList>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }
}
