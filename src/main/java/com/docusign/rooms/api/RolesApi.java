
package com.docusign.rooms.api;

import javax.ws.rs.core.GenericType;

import com.docusign.rooms.client.ApiException;
import com.docusign.rooms.client.ApiClient;
import com.docusign.rooms.client.Configuration;
import com.docusign.rooms.model.*;
import com.docusign.rooms.client.Pair;



public class RolesApi {
  private ApiClient apiClient;

  public RolesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public RolesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }


  /**
   * Creates a role.
   * 
   * @param accountId  (required)
   * @param role  (required)
   * @return Role
   * @throws ApiException if fails to make API call
   */
  public Role createRole(String accountId, RoleForCreate role) throws ApiException {
    Object localVarPostBody = role;
    
    // verify the required parameter 'role' is set
    if (role == null) {
      throw new ApiException(400, "Missing the required parameter 'role' when calling createRole");
    }
    
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
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };

    GenericType<Role> localVarReturnType = new GenericType<Role>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Deletes the role with the given roleId.
   * 
   * @param accountId  (required)
   * @param roleId  (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteRole(String accountId, Integer roleId) throws ApiException {
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
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };


    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /// <summary>
  /// Get information about the role with the given roleId. 
  /// </summary>
  public class GetRoleOptions
  {
  private Boolean includeIsAssigned = null;
  /*
   *  
   */
  public void setIncludeIsAssigned(Boolean includeIsAssigned) {
    this.includeIsAssigned = includeIsAssigned;
  }

  public Boolean getIncludeIsAssigned() {
    return this.includeIsAssigned;
  }
  }

   /**
   * Get information about the role with the given roleId.
   * 
   * @param accountId  (required)
   * @param roleId  (required)
   * @return Role
   */ 
  public Role getRole(String accountId, Integer roleId) throws ApiException {
    return getRole(accountId, roleId, null);
  }

  /**
   * Get information about the role with the given roleId.
   * 
   * @param accountId  (required)
   * @param roleId  (required)
   * @param options for modifying the method behavior.
   * @return Role
   * @throws ApiException if fails to make API call
   */
  public Role getRole(String accountId, Integer roleId, RolesApi.GetRoleOptions options) throws ApiException {
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
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };

    GenericType<Role> localVarReturnType = new GenericType<Role>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /// <summary>
  /// Gets a paged-list of roles in your company 
  /// </summary>
  public class GetRolesOptions
  {
  private Boolean onlyAssignable = null;
  private String filter = null;
  private Integer startPosition = null;
  private Integer count = null;
  /*
   *  
   */
  public void setOnlyAssignable(Boolean onlyAssignable) {
    this.onlyAssignable = onlyAssignable;
  }

  public Boolean getOnlyAssignable() {
    return this.onlyAssignable;
  }
  /*
   *  
   */
  public void setFilter(String filter) {
    this.filter = filter;
  }

  public String getFilter() {
    return this.filter;
  }
  /*
   *  
   */
  public void setStartPosition(Integer startPosition) {
    this.startPosition = startPosition;
  }

  public Integer getStartPosition() {
    return this.startPosition;
  }
  /*
   *  
   */
  public void setCount(Integer count) {
    this.count = count;
  }

  public Integer getCount() {
    return this.count;
  }
  }

   /**
   * Gets a paged-list of roles in your company
   * 
   * @param accountId  (required)
   * @return RoleSummaryList
   */ 
  public RoleSummaryList getRoles(String accountId) throws ApiException {
    return getRoles(accountId, null);
  }

  /**
   * Gets a paged-list of roles in your company
   * 
   * @param accountId  (required)
   * @param options for modifying the method behavior.
   * @return RoleSummaryList
   * @throws ApiException if fails to make API call
   */
  public RoleSummaryList getRoles(String accountId, RolesApi.GetRolesOptions options) throws ApiException {
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
      localVarQueryParams.addAll(apiClient.parameterToPair("filter", options.filter));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("startPosition", options.startPosition));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("count", options.count));
    }

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };

    GenericType<RoleSummaryList> localVarReturnType = new GenericType<RoleSummaryList>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Updates the role with the given roleId.
   * 
   * @param accountId  (required)
   * @param roleId  (required)
   * @param role  (required)
   * @return Role
   * @throws ApiException if fails to make API call
   */
  public Role updateRole(String accountId, Integer roleId, RoleForUpdate role) throws ApiException {
    Object localVarPostBody = role;
    
    // verify the required parameter 'roleId' is set
    if (roleId == null) {
      throw new ApiException(400, "Missing the required parameter 'roleId' when calling updateRole");
    }
    
    // verify the required parameter 'role' is set
    if (role == null) {
      throw new ApiException(400, "Missing the required parameter 'role' when calling updateRole");
    }
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateRole");
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
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };

    GenericType<Role> localVarReturnType = new GenericType<Role>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
