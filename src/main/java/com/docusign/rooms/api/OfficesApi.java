
package com.docusign.rooms.api;

import javax.ws.rs.core.GenericType;

import com.docusign.rooms.client.ApiException;
import com.docusign.rooms.client.ApiClient;
import com.docusign.rooms.client.Configuration;
import com.docusign.rooms.model.*;
import com.docusign.rooms.client.Pair;
import com.docusign.rooms.client.ApiResponse;




/**
 * OfficesApi class.
 *
 **/
public class OfficesApi {
  private ApiClient apiClient;

 /**
  * OfficesApi.
  *
  **/
  public OfficesApi() {
    this(Configuration.getDefaultApiClient());
  }

 /**
  * OfficesApi.
  *
  **/
  public OfficesApi(ApiClient apiClient) {
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
   * Create an office..
   * Create an office.
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param body Creates an office with given name and other details like Region,Address (optional)
   * @return Office
   * @throws ApiException if fails to make API call
   */
  public Office createOffice(String accountId, OfficeForCreate body) throws ApiException {
    ApiResponse<Office> localVarResponse = createOfficeWithHttpInfo(accountId, body);
    return localVarResponse.getData();
  }

  /**
   * Create an office.
   * Create an office.
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param body Creates an office with given name and other details like Region,Address (optional)
   * @return Office
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Office > createOfficeWithHttpInfo(String accountId, OfficeForCreate body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling createOffice");
    }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/offices"
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
    
    GenericType<Office> localVarReturnType = new GenericType<Office>() {};
    Office localVarResponse = apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<Office>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Delete an office..
   * This method deletes an office from a Rooms account.
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param officeId Office ID to be deleted (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteOffice(String accountId, Integer officeId) throws ApiException {
    deleteOfficeWithHttpInfo(accountId, officeId);
  }

  /**
   * Delete an office.
   * This method deletes an office from a Rooms account.
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param officeId Office ID to be deleted (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Object> deleteOfficeWithHttpInfo(String accountId, Integer officeId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteOffice");
    }
    
    // verify the required parameter 'officeId' is set
    if (officeId == null) {
      throw new ApiException(400, "Missing the required parameter 'officeId' when calling deleteOffice");
    }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/offices/{officeId}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
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
    
    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
    return new ApiResponse<Object>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), null);
  }

  /**
   * Get information about the office with the given officeId..
   * Get information about the office with the given officeId.
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param officeId The id of the office. (required)
   * @return Office
   * @throws ApiException if fails to make API call
   */
  public Office getOffice(String accountId, Integer officeId) throws ApiException {
    ApiResponse<Office> localVarResponse = getOfficeWithHttpInfo(accountId, officeId);
    return localVarResponse.getData();
  }

  /**
   * Get information about the office with the given officeId.
   * Get information about the office with the given officeId.
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param officeId The id of the office. (required)
   * @return Office
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Office > getOfficeWithHttpInfo(String accountId, Integer officeId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getOffice");
    }
    
    // verify the required parameter 'officeId' is set
    if (officeId == null) {
      throw new ApiException(400, "Missing the required parameter 'officeId' when calling getOffice");
    }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/offices/{officeId}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
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
    
    GenericType<Office> localVarReturnType = new GenericType<Office>() {};
    Office localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<Office>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }
  /// <summary>
  /// Get all offices. This method returns a list of offices associated with an account.
  /// </summary>

 /**
  * GetOfficesOptions Class.
  *
  **/
  public class GetOfficesOptions
  {
  private Integer count = null;
  private Integer startPosition = null;
  private Boolean onlyAccessible = null;
  private String search = null;
  
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
  
 /**
  * setOnlyAccessible method.
  */
  public void setOnlyAccessible(Boolean onlyAccessible) {
    this.onlyAccessible = onlyAccessible;
  }

 /**
  * getOnlyAccessible method.
  *
  * @return Boolean
  */
  public Boolean getOnlyAccessible() {
    return this.onlyAccessible;
  }
  
 /**
  * setSearch method.
  */
  public void setSearch(String search) {
    this.search = search;
  }

 /**
  * getSearch method.
  *
  * @return String
  */
  public String getSearch() {
    return this.search;
  }
  }

   /**
   * Get all offices..
   * This method returns a list of offices associated with an account.
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @return OfficeSummaryList
   */ 
  public OfficeSummaryList getOffices(String accountId) throws ApiException {
    return getOffices(accountId, null);
  }

  /**
   * Get all offices..
   * This method returns a list of offices associated with an account.
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param options for modifying the method behavior.
   * @return OfficeSummaryList
   * @throws ApiException if fails to make API call
   */
  public OfficeSummaryList getOffices(String accountId, OfficesApi.GetOfficesOptions options) throws ApiException {
    ApiResponse<OfficeSummaryList> localVarResponse = getOfficesWithHttpInfo(accountId, options);
    return localVarResponse.getData();
  }

  /**
   * Get all offices.
   * This method returns a list of offices associated with an account.
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param options for modifying the method behavior.
   * @return OfficeSummaryList
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<OfficeSummaryList > getOfficesWithHttpInfo(String accountId, OfficesApi.GetOfficesOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getOffices");
    }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/offices"
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
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("onlyAccessible", options.onlyAccessible));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("search", options.search));
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
    
    GenericType<OfficeSummaryList> localVarReturnType = new GenericType<OfficeSummaryList>() {};
    OfficeSummaryList localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<OfficeSummaryList>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Lists the number of objects of each type that reference the office..
   * This method returns a list of each type of object and the number of objects of that type referencing the specified office. Note that an office cannot be deleted while existing objects reference it.
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param officeId ID of the office (required)
   * @return OfficeReferenceCountList
   * @throws ApiException if fails to make API call
   */
  public OfficeReferenceCountList getReferenceCounts(String accountId, Integer officeId) throws ApiException {
    ApiResponse<OfficeReferenceCountList> localVarResponse = getReferenceCountsWithHttpInfo(accountId, officeId);
    return localVarResponse.getData();
  }

  /**
   * Lists the number of objects of each type that reference the office.
   * This method returns a list of each type of object and the number of objects of that type referencing the specified office. Note that an office cannot be deleted while existing objects reference it.
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param officeId ID of the office (required)
   * @return OfficeReferenceCountList
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<OfficeReferenceCountList > getReferenceCountsWithHttpInfo(String accountId, Integer officeId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getReferenceCounts");
    }
    
    // verify the required parameter 'officeId' is set
    if (officeId == null) {
      throw new ApiException(400, "Missing the required parameter 'officeId' when calling getReferenceCounts");
    }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/offices/{officeId}/reference_counts"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
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
    
    GenericType<OfficeReferenceCountList> localVarReturnType = new GenericType<OfficeReferenceCountList>() {};
    OfficeReferenceCountList localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<OfficeReferenceCountList>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }
}
