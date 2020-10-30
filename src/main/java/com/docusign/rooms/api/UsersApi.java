
package com.docusign.rooms.api;

import javax.ws.rs.core.GenericType;

import com.docusign.rooms.client.ApiException;
import com.docusign.rooms.client.ApiClient;
import com.docusign.rooms.client.Configuration;
import com.docusign.rooms.model.*;
import com.docusign.rooms.client.Pair;



public class UsersApi {
  private ApiClient apiClient;

  public UsersApi() {
    this(Configuration.getDefaultApiClient());
  }

  public UsersApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }


  /**
   * Adds the user to the designated office.
   * 
   * @param accountId  (required)
   * @param userId  (required)
   * @param designatedOffice  (required)
   * @throws ApiException if fails to make API call
   */
  public void addUserToOffice(String accountId, Integer userId, DesignatedOffice designatedOffice) throws ApiException {
    Object localVarPostBody = designatedOffice;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling addUserToOffice");
    }
    
    // verify the required parameter 'designatedOffice' is set
    if (designatedOffice == null) {
      throw new ApiException(400, "Missing the required parameter 'designatedOffice' when calling addUserToOffice");
    }
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling addUserToOffice");
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
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };


    apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }

  /**
   * Adds the user to the designated region.
   * 
   * @param accountId  (required)
   * @param userId  (required)
   * @param designatedRegion  (required)
   * @throws ApiException if fails to make API call
   */
  public void addUserToRegion(String accountId, Integer userId, DesignatedRegion designatedRegion) throws ApiException {
    Object localVarPostBody = designatedRegion;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling addUserToRegion");
    }
    
    // verify the required parameter 'designatedRegion' is set
    if (designatedRegion == null) {
      throw new ApiException(400, "Missing the required parameter 'designatedRegion' when calling addUserToRegion");
    }
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling addUserToRegion");
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
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };


    apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }

  /**
   * Retrieves user information for the user having the given UserId.
   * 
   * @param accountId  (required)
   * @param userId  (required)
   * @return User
   * @throws ApiException if fails to make API call
   */
  public User getUser(String accountId, Integer userId) throws ApiException {
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
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };

    GenericType<User> localVarReturnType = new GenericType<User>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /// <summary>
  /// Gets a paged-list of users. Retrieves a paged-list of Company Users in the User&#39;s company using the given filter and sort parameters.
  /// </summary>
  public class GetUsersOptions
  {
  private String filter = null;
  private String sort = null;
  private Integer defaultOfficeId = null;
  private String accessLevel = null;
  private Integer titleId = null;
  private Integer roleId = null;
  private String status = null;
  private Boolean lockedOnly = null;
  private Integer startPosition = null;
  private Integer count = null;
  /*
   * Filters by name and email 
   */
  public void setFilter(String filter) {
    this.filter = filter;
  }

  public String getFilter() {
    return this.filter;
  }
  /*
   * Valid values are &#39;FirstNameAsc&#39;, &#39;FirstNameDesc&#39;, &#39;LastNameAsc&#39;, &#39;LastNameDesc&#39;, &#39;EmailAsc&#39;, &#39;EmailDesc&#39; 
   */
  public void setSort(String sort) {
    this.sort = sort;
  }

  public String getSort() {
    return this.sort;
  }
  /*
   *  
   */
  public void setDefaultOfficeId(Integer defaultOfficeId) {
    this.defaultOfficeId = defaultOfficeId;
  }

  public Integer getDefaultOfficeId() {
    return this.defaultOfficeId;
  }
  /*
   * Valid values are &#39;Company&#39;, &#39;Region&#39;, &#39;Office&#39;, &#39;Contributor&#39; 
   */
  public void setAccessLevel(String accessLevel) {
    this.accessLevel = accessLevel;
  }

  public String getAccessLevel() {
    return this.accessLevel;
  }
  /*
   * Only valid for classic companies 
   */
  public void setTitleId(Integer titleId) {
    this.titleId = titleId;
  }

  public Integer getTitleId() {
    return this.titleId;
  }
  /*
   * Only valid for next gen companies 
   */
  public void setRoleId(Integer roleId) {
    this.roleId = roleId;
  }

  public Integer getRoleId() {
    return this.roleId;
  }
  /*
   * Valid values are &#39;Active&#39;, &#39;Pending&#39; 
   */
  public void setStatus(String status) {
    this.status = status;
  }

  public String getStatus() {
    return this.status;
  }
  /*
   *  
   */
  public void setLockedOnly(Boolean lockedOnly) {
    this.lockedOnly = lockedOnly;
  }

  public Boolean getLockedOnly() {
    return this.lockedOnly;
  }
  /*
   * Defaults to 0 
   */
  public void setStartPosition(Integer startPosition) {
    this.startPosition = startPosition;
  }

  public Integer getStartPosition() {
    return this.startPosition;
  }
  /*
   * Defaults to 100. Must be less than or equal to 100 
   */
  public void setCount(Integer count) {
    this.count = count;
  }

  public Integer getCount() {
    return this.count;
  }
  }

   /**
   * Gets a paged-list of users.
   * Retrieves a paged-list of Company Users in the User&#39;s company using the given filter and sort parameters.
   * @param accountId  (required)
   * @return UserSummaryList
   */ 
  public UserSummaryList getUsers(String accountId) throws ApiException {
    return getUsers(accountId, null);
  }

  /**
   * Gets a paged-list of users.
   * Retrieves a paged-list of Company Users in the User&#39;s company using the given filter and sort parameters.
   * @param accountId  (required)
   * @param options for modifying the method behavior.
   * @return UserSummaryList
   * @throws ApiException if fails to make API call
   */
  public UserSummaryList getUsers(String accountId, UsersApi.GetUsersOptions options) throws ApiException {
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
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };

    GenericType<UserSummaryList> localVarReturnType = new GenericType<UserSummaryList>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * CLASSIC COMPANY ONLY. Send an invitation to join the company as an admin.
   * 
   * @param accountId  (required)
   * @param invitee Invitee information. (required)
   * @return User
   * @throws ApiException if fails to make API call
   */
  public User inviteClassicAdmin(String accountId, ClassicAdminToInvite invitee) throws ApiException {
    Object localVarPostBody = invitee;
    
    // verify the required parameter 'invitee' is set
    if (invitee == null) {
      throw new ApiException(400, "Missing the required parameter 'invitee' when calling inviteClassicAdmin");
    }
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling inviteClassicAdmin");
    }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/users/invite_classic_admin"
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

    GenericType<User> localVarReturnType = new GenericType<User>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * CLASSIC COMPANY ONLY. Send an invitation to join the company as an agent.
   * 
   * @param accountId  (required)
   * @param invitee Invitee information. (required)
   * @return User
   * @throws ApiException if fails to make API call
   */
  public User inviteClassicAgent(String accountId, ClassicAgentToInvite invitee) throws ApiException {
    Object localVarPostBody = invitee;
    
    // verify the required parameter 'invitee' is set
    if (invitee == null) {
      throw new ApiException(400, "Missing the required parameter 'invitee' when calling inviteClassicAgent");
    }
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling inviteClassicAgent");
    }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/users/invite_classic_agent"
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

    GenericType<User> localVarReturnType = new GenericType<User>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * CLASSIC COMPANY ONLY. Send an invitation to join the company as a manager.
   * 
   * @param accountId  (required)
   * @param invitee Invitee information. (required)
   * @return User
   * @throws ApiException if fails to make API call
   */
  public User inviteClassicManager(String accountId, ClassicManagerToInvite invitee) throws ApiException {
    Object localVarPostBody = invitee;
    
    // verify the required parameter 'invitee' is set
    if (invitee == null) {
      throw new ApiException(400, "Missing the required parameter 'invitee' when calling inviteClassicManager");
    }
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling inviteClassicManager");
    }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/users/invite_classic_manager"
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

    GenericType<User> localVarReturnType = new GenericType<User>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * NON-CLASSIC COMPANY ONLY. Send an invitation to the user or non-user having the given email.
   * 
   * @param accountId  (required)
   * @param invitee Invitee information (required)
   * @return User
   * @throws ApiException if fails to make API call
   */
  public User inviteUser(String accountId, UserToInvite invitee) throws ApiException {
    Object localVarPostBody = invitee;
    
    // verify the required parameter 'invitee' is set
    if (invitee == null) {
      throw new ApiException(400, "Missing the required parameter 'invitee' when calling inviteUser");
    }
    
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
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };

    GenericType<User> localVarReturnType = new GenericType<User>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Locks the account of the user.
   * 
   * @param accountId  (required)
   * @param userId User Id of the user attempting to be locked. (required)
   * @param details Details containing the reason the user is being locked out (required)
   * @throws ApiException if fails to make API call
   */
  public void lockUser(String accountId, Integer userId, LockedOutDetails details) throws ApiException {
    Object localVarPostBody = details;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling lockUser");
    }
    
    // verify the required parameter 'details' is set
    if (details == null) {
      throw new ApiException(400, "Missing the required parameter 'details' when calling lockUser");
    }
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling lockUser");
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
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };


    apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }

  /**
   * Reinvites the pending user with the given userId.
   * 
   * @param accountId  (required)
   * @param userId  (required)
   * @throws ApiException if fails to make API call
   */
  public void reinviteUser(String accountId, Integer userId) throws ApiException {
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
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };


    apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }

  /**
   * Removes a user from the company.
   * Removes the user. Will fail if the user owns any Rooms.   The rooms will need to be transferred to other agents before removing.
   * @param accountId  (required)
   * @param userId Id of the user you wish to remove. (required)
   * @throws ApiException if fails to make API call
   */
  public void removeUser(String accountId, Integer userId) throws ApiException {
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
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };


    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }

  /**
   * Removes the user from the designated office.
   * 
   * @param accountId  (required)
   * @param userId  (required)
   * @param designatedOffice  (required)
   * @throws ApiException if fails to make API call
   */
  public void removeUserFromOffice(String accountId, Integer userId, DesignatedOffice designatedOffice) throws ApiException {
    Object localVarPostBody = designatedOffice;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling removeUserFromOffice");
    }
    
    // verify the required parameter 'designatedOffice' is set
    if (designatedOffice == null) {
      throw new ApiException(400, "Missing the required parameter 'designatedOffice' when calling removeUserFromOffice");
    }
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling removeUserFromOffice");
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
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };


    apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }

  /**
   * Removes the user from the designated region.
   * 
   * @param accountId  (required)
   * @param userId  (required)
   * @param designatedRegion  (required)
   * @throws ApiException if fails to make API call
   */
  public void removeUserFromRegion(String accountId, Integer userId, DesignatedRegion designatedRegion) throws ApiException {
    Object localVarPostBody = designatedRegion;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling removeUserFromRegion");
    }
    
    // verify the required parameter 'designatedRegion' is set
    if (designatedRegion == null) {
      throw new ApiException(400, "Missing the required parameter 'designatedRegion' when calling removeUserFromRegion");
    }
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling removeUserFromRegion");
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
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };


    apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }

  /**
   * Unlocks the account of the user.
   * 
   * @param accountId  (required)
   * @param userId User Id of the user attempting to be unlocked. (required)
   * @throws ApiException if fails to make API call
   */
  public void unlockUser(String accountId, Integer userId) throws ApiException {
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
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };


    apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }

  /**
   * Updates user information
   * 
   * @param accountId  (required)
   * @param userId  (required)
   * @param userForUpdate  (required)
   * @return User
   * @throws ApiException if fails to make API call
   */
  public User updateUser(String accountId, Integer userId, UserForUpdate userForUpdate) throws ApiException {
    Object localVarPostBody = userForUpdate;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling updateUser");
    }
    
    // verify the required parameter 'userForUpdate' is set
    if (userForUpdate == null) {
      throw new ApiException(400, "Missing the required parameter 'userForUpdate' when calling updateUser");
    }
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateUser");
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
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };

    GenericType<User> localVarReturnType = new GenericType<User>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
