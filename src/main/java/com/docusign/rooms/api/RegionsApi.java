
package com.docusign.rooms.api;

import javax.ws.rs.core.GenericType;

import com.docusign.rooms.client.ApiException;
import com.docusign.rooms.client.ApiClient;
import com.docusign.rooms.client.Configuration;
import com.docusign.rooms.model.*;
import com.docusign.rooms.client.Pair;




/**
 * RegionsApi class.
 *
 **/
public class RegionsApi {
  private ApiClient apiClient;

 /**
  * RegionsApi.
  *
  **/
  public RegionsApi() {
    this(Configuration.getDefaultApiClient());
  }

 /**
  * RegionsApi.
  *
  **/
  public RegionsApi(ApiClient apiClient) {
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
   * Creates a new region for a company.
   * Creates a new region for a company
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param body  (optional)
   * @return Region
   * @throws ApiException if fails to make API call
   */
  public Region createRegion(String accountId, Region body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling createRegion");
    }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/regions"
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

    GenericType<Region> localVarReturnType = new GenericType<Region>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Delete a region..
   * Delete a region.
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param regionId Id of the desired region (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteRegion(String accountId, Integer regionId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteRegion");
    }
    
    // verify the required parameter 'regionId' is set
    if (regionId == null) {
      throw new ApiException(400, "Missing the required parameter 'regionId' when calling deleteRegion");
    }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/regions/{regionId}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "regionId" + "\\}", apiClient.escapeString(regionId.toString()));

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


    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }

  /**
   * Get information about the region with the given regionId.
   * Get information about the region with the given regionId
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param regionId Id of the desired region (required)
   * @return Region
   * @throws ApiException if fails to make API call
   */
  public Region getRegion(String accountId, Integer regionId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getRegion");
    }
    
    // verify the required parameter 'regionId' is set
    if (regionId == null) {
      throw new ApiException(400, "Missing the required parameter 'regionId' when calling getRegion");
    }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/regions/{regionId}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "regionId" + "\\}", apiClient.escapeString(regionId.toString()));

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

    GenericType<Region> localVarReturnType = new GenericType<Region>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Get region reference counts..
   * This method returns a list of each type of object and the number of objects of that type referencing the specified region.
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param regionId Id of the desired region (required)
   * @return RegionReferenceCountList
   * @throws ApiException if fails to make API call
   */
  public RegionReferenceCountList getRegionReferenceCounts(String accountId, Integer regionId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getRegionReferenceCounts");
    }
    
    // verify the required parameter 'regionId' is set
    if (regionId == null) {
      throw new ApiException(400, "Missing the required parameter 'regionId' when calling getRegionReferenceCounts");
    }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/regions/{regionId}/reference_counts"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "regionId" + "\\}", apiClient.escapeString(regionId.toString()));

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

    GenericType<RegionReferenceCountList> localVarReturnType = new GenericType<RegionReferenceCountList>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /// <summary>
  /// Get account regions. Returns a list of regions that are associated with a Rooms account.
  /// </summary>

 /**
  * GetRegionsOptions Class.
  *
  **/
  public class GetRegionsOptions
  {
  private Integer count = null;
  private Integer startPosition = null;
  private Boolean managedOnly = null;
  
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
  * setManagedOnly method.
  */
  public void setManagedOnly(Boolean managedOnly) {
    this.managedOnly = managedOnly;
  }

 /**
  * getManagedOnly method.
  *
  * @return Boolean
  */
  public Boolean getManagedOnly() {
    return this.managedOnly;
  }
  }

   /**
   * Get account regions..
   * Returns a list of regions that are associated with a Rooms account.
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @return RegionSummaryList
   */ 
  public RegionSummaryList getRegions(String accountId) throws ApiException {
    return getRegions(accountId, null);
  }

  /**
   * Get account regions..
   * Returns a list of regions that are associated with a Rooms account.
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param options for modifying the method behavior.
   * @return RegionSummaryList
   * @throws ApiException if fails to make API call
   */
  public RegionSummaryList getRegions(String accountId, RegionsApi.GetRegionsOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getRegions");
    }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/regions"
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
      localVarQueryParams.addAll(apiClient.parameterToPair("managedOnly", options.managedOnly));
    }

    

    

    final String[] localVarAccepts = {
      "text/plain", "application/json", "text/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json-patch+json", "application/json", "text/json", "application/_*+json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };

    GenericType<RegionSummaryList> localVarReturnType = new GenericType<RegionSummaryList>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
