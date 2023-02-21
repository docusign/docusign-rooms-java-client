
package com.docusign.rooms.api;

import javax.ws.rs.core.GenericType;

import com.docusign.rooms.client.ApiException;
import com.docusign.rooms.client.ApiClient;
import com.docusign.rooms.client.Configuration;
import com.docusign.rooms.model.*;
import com.docusign.rooms.client.Pair;
import com.docusign.rooms.client.ApiResponse;




/**
 * RolesApi class.
 *
 **/
public class RolesApi {
  private ApiClient apiClient;

 /**
  * RolesApi.
  *
  **/
  public RolesApi() {
    this(Configuration.getDefaultApiClient());
  }

 /**
  * RolesApi.
  *
  **/
  public RolesApi(ApiClient apiClient) {
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
   * Creates a role..
   * Creates a new company role in Rooms
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param body Name and permission details of the role to be created (optional)
   * @return Role
   * @throws ApiException if fails to make API call
   */
  public Role createRole(String accountId, RoleForCreate body) throws ApiException {
    ApiResponse<Role> localVarResponse = createRoleWithHttpInfo(accountId, body);
    return localVarResponse.getData();
  }

  /**
   * Creates a role.
   * Creates a new company role in Rooms
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param body Name and permission details of the role to be created (optional)
   * @return Role
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Role > createRoleWithHttpInfo(String accountId, RoleForCreate body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling createRole");
    }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/roles"
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
    
    GenericType<Role> localVarReturnType = new GenericType<Role>() {};
    Role localVarResponse = apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<Role>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Deletes the role with the given roleId..
   * Deletes a role from a company account in Rooms
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param roleId The id of the role. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteRole(String accountId, Integer roleId) throws ApiException {
    deleteRoleWithHttpInfo(accountId, roleId);
  }

  /**
   * Deletes the role with the given roleId.
   * Deletes a role from a company account in Rooms
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param roleId The id of the role. (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Object> deleteRoleWithHttpInfo(String accountId, Integer roleId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteRole");
    }
    
    // verify the required parameter 'roleId' is set
    if (roleId == null) {
      throw new ApiException(400, "Missing the required parameter 'roleId' when calling deleteRole");
    }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/roles/{roleId}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "roleId" + "\\}", apiClient.escapeString(roleId.toString()));

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
  /// <summary>
  /// Get information about the role with the given roleId. Get information about the role with the given roleId.
  /// </summary>

 /**
  * GetRoleOptions Class.
  *
  **/
  public class GetRoleOptions
  {
  private Boolean includeIsAssigned = null;
  
 /**
  * setIncludeIsAssigned method.
  */
  public void setIncludeIsAssigned(Boolean includeIsAssigned) {
    this.includeIsAssigned = includeIsAssigned;
  }

 /**
  * getIncludeIsAssigned method.
  *
  * @return Boolean
  */
  public Boolean getIncludeIsAssigned() {
    return this.includeIsAssigned;
  }
  }

   /**
   * Get information about the role with the given roleId..
   * Get information about the role with the given roleId.
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param roleId The id of the role. (required)
   * @return Role
   */ 
  public Role getRole(String accountId, Integer roleId) throws ApiException {
    return getRole(accountId, roleId, null);
  }

  /**
   * Get information about the role with the given roleId..
   * Get information about the role with the given roleId.
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param roleId The id of the role. (required)
   * @param options for modifying the method behavior.
   * @return Role
   * @throws ApiException if fails to make API call
   */
  public Role getRole(String accountId, Integer roleId, RolesApi.GetRoleOptions options) throws ApiException {
    ApiResponse<Role> localVarResponse = getRoleWithHttpInfo(accountId, roleId, options);
    return localVarResponse.getData();
  }

  /**
   * Get information about the role with the given roleId.
   * Get information about the role with the given roleId.
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param roleId The id of the role. (required)
   * @param options for modifying the method behavior.
   * @return Role
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Role > getRoleWithHttpInfo(String accountId, Integer roleId, RolesApi.GetRoleOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getRole");
    }
    
    // verify the required parameter 'roleId' is set
    if (roleId == null) {
      throw new ApiException(400, "Missing the required parameter 'roleId' when calling getRole");
    }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/roles/{roleId}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "roleId" + "\\}", apiClient.escapeString(roleId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("includeIsAssigned", options.includeIsAssigned));
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
    
    GenericType<Role> localVarReturnType = new GenericType<Role>() {};
    Role localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<Role>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }
  /// <summary>
  /// Gets a paged-list of roles in your company Returns a list of roles associated with a company account
  /// </summary>

 /**
  * GetRolesOptions Class.
  *
  **/
  public class GetRolesOptions
  {
  private Boolean onlyAssignable = null;
  private Object filterContext = null;
  private String filter = null;
  private Integer startPosition = null;
  private Integer count = null;
  
 /**
  * setOnlyAssignable method.
  */
  public void setOnlyAssignable(Boolean onlyAssignable) {
    this.onlyAssignable = onlyAssignable;
  }

 /**
  * getOnlyAssignable method.
  *
  * @return Boolean
  */
  public Boolean getOnlyAssignable() {
    return this.onlyAssignable;
  }
  
 /**
  * setFilterContext method.
  */
  public void setFilterContext(Object filterContext) {
    this.filterContext = filterContext;
  }

 /**
  * getFilterContext method.
  *
  * @return Object
  */
  public Object getFilterContext() {
    return this.filterContext;
  }
  
 /**
  * setFilter method.
  */
  public void setFilter(String filter) {
    this.filter = filter;
  }

 /**
  * getFilter method.
  *
  * @return String
  */
  public String getFilter() {
    return this.filter;
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
   * Gets a paged-list of roles in your company.
   * Returns a list of roles associated with a company account
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @return RoleSummaryList
   */ 
  public RoleSummaryList getRoles(String accountId) throws ApiException {
    return getRoles(accountId, null);
  }

  /**
   * Gets a paged-list of roles in your company.
   * Returns a list of roles associated with a company account
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param options for modifying the method behavior.
   * @return RoleSummaryList
   * @throws ApiException if fails to make API call
   */
  public RoleSummaryList getRoles(String accountId, RolesApi.GetRolesOptions options) throws ApiException {
    ApiResponse<RoleSummaryList> localVarResponse = getRolesWithHttpInfo(accountId, options);
    return localVarResponse.getData();
  }

  /**
   * Gets a paged-list of roles in your company
   * Returns a list of roles associated with a company account
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param options for modifying the method behavior.
   * @return RoleSummaryList
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<RoleSummaryList > getRolesWithHttpInfo(String accountId, RolesApi.GetRolesOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getRoles");
    }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/roles"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("onlyAssignable", options.onlyAssignable));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("filterContext", options.filterContext));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("filter", options.filter));
    }if (options != null) {
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
    
    GenericType<RoleSummaryList> localVarReturnType = new GenericType<RoleSummaryList>() {};
    RoleSummaryList localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<RoleSummaryList>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Updates the role with the given roleId..
   * Updates the role with the given roleId.
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param roleId The id of the role. (required)
   * @param body Name and permission details of the role to be updated (optional)
   * @return Role
   * @throws ApiException if fails to make API call
   */
  public Role updateRole(String accountId, Integer roleId, RoleForUpdate body) throws ApiException {
    ApiResponse<Role> localVarResponse = updateRoleWithHttpInfo(accountId, roleId, body);
    return localVarResponse.getData();
  }

  /**
   * Updates the role with the given roleId.
   * Updates the role with the given roleId.
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param roleId The id of the role. (required)
   * @param body Name and permission details of the role to be updated (optional)
   * @return Role
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Role > updateRoleWithHttpInfo(String accountId, Integer roleId, RoleForUpdate body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateRole");
    }
    
    // verify the required parameter 'roleId' is set
    if (roleId == null) {
      throw new ApiException(400, "Missing the required parameter 'roleId' when calling updateRole");
    }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/roles/{roleId}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "roleId" + "\\}", apiClient.escapeString(roleId.toString()));

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
    
    GenericType<Role> localVarReturnType = new GenericType<Role>() {};
    Role localVarResponse = apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<Role>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }
}
