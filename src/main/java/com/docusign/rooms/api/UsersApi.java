
package com.docusign.rooms.api;

import javax.ws.rs.core.GenericType;

import com.docusign.rooms.client.ApiException;
import com.docusign.rooms.client.ApiClient;
import com.docusign.rooms.client.Configuration;
import com.docusign.rooms.model.*;
import com.docusign.rooms.client.Pair;
import com.docusign.rooms.client.ApiResponse;




/**
 * UsersApi class.
 *
 **/
public class UsersApi {
  private ApiClient apiClient;

 /**
  * UsersApi.
  *
  **/
  public UsersApi() {
    this(Configuration.getDefaultApiClient());
  }

 /**
  * UsersApi.
  *
  **/
  public UsersApi(ApiClient apiClient) {
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
   * Adds the user to the designated office..
   * Adds the user to the designated office.
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param userId The id of the user. (required)
   * @param body Details of the office that the user will be added to (optional)
   * @throws ApiException if fails to make API call
   */
  public void addUserToOffice(String accountId, Integer userId, DesignatedOffice body) throws ApiException {
    addUserToOfficeWithHttpInfo(accountId, userId, body);
  }

  /**
   * Adds the user to the designated office.
   * Adds the user to the designated office.
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param userId The id of the user. (required)
   * @param body Details of the office that the user will be added to (optional)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Object> addUserToOfficeWithHttpInfo(String accountId, Integer userId, DesignatedOffice body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling addUserToOffice");
    }
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling addUserToOffice");
    }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/users/{userId}/add_to_office"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()));

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
    
    apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
    return new ApiResponse<Object>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), null);
  }

  /**
   * Adds the user to the designated region..
   * Adds the user to the designated region.
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param userId The id of the user. (required)
   * @param body Region that given user will be added to (optional)
   * @throws ApiException if fails to make API call
   */
  public void addUserToRegion(String accountId, Integer userId, DesignatedRegion body) throws ApiException {
    addUserToRegionWithHttpInfo(accountId, userId, body);
  }

  /**
   * Adds the user to the designated region.
   * Adds the user to the designated region.
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param userId The id of the user. (required)
   * @param body Region that given user will be added to (optional)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Object> addUserToRegionWithHttpInfo(String accountId, Integer userId, DesignatedRegion body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling addUserToRegion");
    }
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling addUserToRegion");
    }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/users/{userId}/add_to_region"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()));

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
    
    apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
    return new ApiResponse<Object>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), null);
  }

  /**
   * Retrieves user information for the user having the given UserId..
   * Retrieves user information for the user having the given UserId.
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param userId The id of the user. (required)
   * @return User
   * @throws ApiException if fails to make API call
   */
  public User getUser(String accountId, Integer userId) throws ApiException {
    ApiResponse<User> localVarResponse = getUserWithHttpInfo(accountId, userId);
    return localVarResponse.getData();
  }

  /**
   * Retrieves user information for the user having the given UserId.
   * Retrieves user information for the user having the given UserId.
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param userId The id of the user. (required)
   * @return User
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<User > getUserWithHttpInfo(String accountId, Integer userId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getUser");
    }
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling getUser");
    }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/users/{userId}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()));

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
    
    GenericType<User> localVarReturnType = new GenericType<User>() {};
    User localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<User>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }
  /// <summary>
  /// Gets a paged-list of users. Retrieves a paged-list of Company Users in the User&#39;s company using the given filter and sort parameters.
  /// </summary>

 /**
  * GetUsersOptions Class.
  *
  **/
  public class GetUsersOptions
  {
  private String filter = null;
  private Object sort = null;
  private Integer defaultOfficeId = null;
  private Object accessLevel = null;
  private Integer titleId = null;
  private Integer roleId = null;
  private Object status = null;
  private Boolean lockedOnly = null;
  private Integer startPosition = null;
  private Integer count = null;
  
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
  * setSort method.
  */
  public void setSort(Object sort) {
    this.sort = sort;
  }

 /**
  * getSort method.
  *
  * @return Object
  */
  public Object getSort() {
    return this.sort;
  }
  
 /**
  * setDefaultOfficeId method.
  */
  public void setDefaultOfficeId(Integer defaultOfficeId) {
    this.defaultOfficeId = defaultOfficeId;
  }

 /**
  * getDefaultOfficeId method.
  *
  * @return Integer
  */
  public Integer getDefaultOfficeId() {
    return this.defaultOfficeId;
  }
  
 /**
  * setAccessLevel method.
  */
  public void setAccessLevel(Object accessLevel) {
    this.accessLevel = accessLevel;
  }

 /**
  * getAccessLevel method.
  *
  * @return Object
  */
  public Object getAccessLevel() {
    return this.accessLevel;
  }
  
 /**
  * setTitleId method.
  */
  public void setTitleId(Integer titleId) {
    this.titleId = titleId;
  }

 /**
  * getTitleId method.
  *
  * @return Integer
  */
  public Integer getTitleId() {
    return this.titleId;
  }
  
 /**
  * setRoleId method.
  */
  public void setRoleId(Integer roleId) {
    this.roleId = roleId;
  }

 /**
  * getRoleId method.
  *
  * @return Integer
  */
  public Integer getRoleId() {
    return this.roleId;
  }
  
 /**
  * setStatus method.
  */
  public void setStatus(Object status) {
    this.status = status;
  }

 /**
  * getStatus method.
  *
  * @return Object
  */
  public Object getStatus() {
    return this.status;
  }
  
 /**
  * setLockedOnly method.
  */
  public void setLockedOnly(Boolean lockedOnly) {
    this.lockedOnly = lockedOnly;
  }

 /**
  * getLockedOnly method.
  *
  * @return Boolean
  */
  public Boolean getLockedOnly() {
    return this.lockedOnly;
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
   * Gets a paged-list of users..
   * Retrieves a paged-list of Company Users in the User&#39;s company using the given filter and sort parameters.
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @return UserSummaryList
   */ 
  public UserSummaryList getUsers(String accountId) throws ApiException {
    return getUsers(accountId, null);
  }

  /**
   * Gets a paged-list of users..
   * Retrieves a paged-list of Company Users in the User&#39;s company using the given filter and sort parameters.
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param options for modifying the method behavior.
   * @return UserSummaryList
   * @throws ApiException if fails to make API call
   */
  public UserSummaryList getUsers(String accountId, UsersApi.GetUsersOptions options) throws ApiException {
    ApiResponse<UserSummaryList> localVarResponse = getUsersWithHttpInfo(accountId, options);
    return localVarResponse.getData();
  }

  /**
   * Gets a paged-list of users.
   * Retrieves a paged-list of Company Users in the User&#39;s company using the given filter and sort parameters.
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param options for modifying the method behavior.
   * @return UserSummaryList
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<UserSummaryList > getUsersWithHttpInfo(String accountId, UsersApi.GetUsersOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getUsers");
    }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/users"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("filter", options.filter));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("sort", options.sort));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("defaultOfficeId", options.defaultOfficeId));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("accessLevel", options.accessLevel));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("titleId", options.titleId));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("roleId", options.roleId));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("status", options.status));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("lockedOnly", options.lockedOnly));
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
    
    GenericType<UserSummaryList> localVarReturnType = new GenericType<UserSummaryList>() {};
    UserSummaryList localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<UserSummaryList>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * NON-CLASSIC COMPANY ONLY. Send an invitation to the user or non-user having the given email..
   * Invites a new user to join a company account on Rooms Version 6.
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param body Invitee information (optional)
   * @return User
   * @throws ApiException if fails to make API call
   */
  public User inviteUser(String accountId, UserToInvite body) throws ApiException {
    ApiResponse<User> localVarResponse = inviteUserWithHttpInfo(accountId, body);
    return localVarResponse.getData();
  }

  /**
   * NON-CLASSIC COMPANY ONLY. Send an invitation to the user or non-user having the given email.
   * Invites a new user to join a company account on Rooms Version 6.
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param body Invitee information (optional)
   * @return User
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<User > inviteUserWithHttpInfo(String accountId, UserToInvite body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling inviteUser");
    }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/users/invite_user"
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
      "application/json-patch+json", "application/json", "text/json", "application/_*+json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };
    
    GenericType<User> localVarReturnType = new GenericType<User>() {};
    User localVarResponse = apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<User>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Locks the account of the user..
   * Locks the account of the user.
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param userId User Id of the user attempting to be locked. (required)
   * @param body Details containing the reason the user is being locked out (optional)
   * @throws ApiException if fails to make API call
   */
  public void lockUser(String accountId, Integer userId, LockedOutDetails body) throws ApiException {
    lockUserWithHttpInfo(accountId, userId, body);
  }

  /**
   * Locks the account of the user.
   * Locks the account of the user.
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param userId User Id of the user attempting to be locked. (required)
   * @param body Details containing the reason the user is being locked out (optional)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Object> lockUserWithHttpInfo(String accountId, Integer userId, LockedOutDetails body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling lockUser");
    }
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling lockUser");
    }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/users/{userId}/lock"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()));

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
   * Reinvites the pending user with the given userId..
   * Reinvites an unactivated user to join a company account. You can use this method with either Rooms Version 5 or Rooms Version 6.
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param userId ID of the user to be invited (required)
   * @throws ApiException if fails to make API call
   */
  public void reinviteUser(String accountId, Integer userId) throws ApiException {
    reinviteUserWithHttpInfo(accountId, userId);
  }

  /**
   * Reinvites the pending user with the given userId.
   * Reinvites an unactivated user to join a company account. You can use this method with either Rooms Version 5 or Rooms Version 6.
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param userId ID of the user to be invited (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Object> reinviteUserWithHttpInfo(String accountId, Integer userId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling reinviteUser");
    }
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling reinviteUser");
    }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/users/{userId}/reinvite"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()));

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
   * Removes a user from the company..
   * Removes the user. Will fail if the user owns any Rooms.   The rooms will need to be transferred to other agents before removing.
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param userId Id of the user you wish to remove. (required)
   * @throws ApiException if fails to make API call
   */
  public void removeUser(String accountId, Integer userId) throws ApiException {
    removeUserWithHttpInfo(accountId, userId);
  }

  /**
   * Removes a user from the company.
   * Removes the user. Will fail if the user owns any Rooms.   The rooms will need to be transferred to other agents before removing.
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param userId Id of the user you wish to remove. (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Object> removeUserWithHttpInfo(String accountId, Integer userId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling removeUser");
    }
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling removeUser");
    }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/users/{userId}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()));

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
   * Removes the user from the designated office..
   * Removes the user from the designated office.
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param userId The id of the user. (required)
   * @param body Details of the office that the user will be removed from (optional)
   * @throws ApiException if fails to make API call
   */
  public void removeUserFromOffice(String accountId, Integer userId, DesignatedOffice body) throws ApiException {
    removeUserFromOfficeWithHttpInfo(accountId, userId, body);
  }

  /**
   * Removes the user from the designated office.
   * Removes the user from the designated office.
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param userId The id of the user. (required)
   * @param body Details of the office that the user will be removed from (optional)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Object> removeUserFromOfficeWithHttpInfo(String accountId, Integer userId, DesignatedOffice body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling removeUserFromOffice");
    }
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling removeUserFromOffice");
    }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/users/{userId}/remove_from_office"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()));

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
    
    apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
    return new ApiResponse<Object>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), null);
  }

  /**
   * Removes the user from the designated region..
   * Removes the user from the designated region.
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param userId The id of the user. (required)
   * @param body Region that given user will be removed from (optional)
   * @throws ApiException if fails to make API call
   */
  public void removeUserFromRegion(String accountId, Integer userId, DesignatedRegion body) throws ApiException {
    removeUserFromRegionWithHttpInfo(accountId, userId, body);
  }

  /**
   * Removes the user from the designated region.
   * Removes the user from the designated region.
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param userId The id of the user. (required)
   * @param body Region that given user will be removed from (optional)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Object> removeUserFromRegionWithHttpInfo(String accountId, Integer userId, DesignatedRegion body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling removeUserFromRegion");
    }
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling removeUserFromRegion");
    }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/users/{userId}/remove_from_region"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()));

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
    
    apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
    return new ApiResponse<Object>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), null);
  }

  /**
   * Unlocks the account of the user..
   * Unlocks the account of the user.
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param userId User Id of the user attempting to be unlocked. (required)
   * @throws ApiException if fails to make API call
   */
  public void unlockUser(String accountId, Integer userId) throws ApiException {
    unlockUserWithHttpInfo(accountId, userId);
  }

  /**
   * Unlocks the account of the user.
   * Unlocks the account of the user.
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param userId User Id of the user attempting to be unlocked. (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Object> unlockUserWithHttpInfo(String accountId, Integer userId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling unlockUser");
    }
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling unlockUser");
    }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/users/{userId}/unlock"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()));

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
   * Updates user information.
   * Updates user information
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param userId The id of the user. (required)
   * @param body Request body to update the user (optional)
   * @return User
   * @throws ApiException if fails to make API call
   */
  public User updateUser(String accountId, Integer userId, UserForUpdate body) throws ApiException {
    ApiResponse<User> localVarResponse = updateUserWithHttpInfo(accountId, userId, body);
    return localVarResponse.getData();
  }

  /**
   * Updates user information
   * Updates user information
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param userId The id of the user. (required)
   * @param body Request body to update the user (optional)
   * @return User
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<User > updateUserWithHttpInfo(String accountId, Integer userId, UserForUpdate body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateUser");
    }
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling updateUser");
    }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/users/{userId}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()));

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
    
    GenericType<User> localVarReturnType = new GenericType<User>() {};
    User localVarResponse = apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<User>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }
}
