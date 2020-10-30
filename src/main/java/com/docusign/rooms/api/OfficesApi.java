
package com.docusign.rooms.api;

import javax.ws.rs.core.GenericType;

import com.docusign.rooms.client.ApiException;
import com.docusign.rooms.client.ApiClient;
import com.docusign.rooms.client.Configuration;
import com.docusign.rooms.model.*;
import com.docusign.rooms.client.Pair;



public class OfficesApi {
  private ApiClient apiClient;

  public OfficesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public OfficesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }


  /**
   * Create an office.
   * 
   * @param accountId  (required)
   * @param office  (required)
   * @return Office
   * @throws ApiException if fails to make API call
   */
  public Office createOffice(String accountId, OfficeForCreate office) throws ApiException {
    Object localVarPostBody = office;
    
    // verify the required parameter 'office' is set
    if (office == null) {
      throw new ApiException(400, "Missing the required parameter 'office' when calling createOffice");
    }
    
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
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };

    GenericType<Office> localVarReturnType = new GenericType<Office>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Delete an office.
   * 
   * @param accountId  (required)
   * @param officeId  (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteOffice(String accountId, Integer officeId) throws ApiException {
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
   * Get information about the office with the given officeId.
   * 
   * @param accountId  (required)
   * @param officeId  (required)
   * @return Office
   * @throws ApiException if fails to make API call
   */
  public Office getOffice(String accountId, Integer officeId) throws ApiException {
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
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };

    GenericType<Office> localVarReturnType = new GenericType<Office>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /// <summary>
  /// Get all offices. 
  /// </summary>
  public class GetOfficesOptions
  {
  private Integer count = null;
  private Integer startPosition = null;
  private Boolean onlyAccessible = null;
  private String search = null;
  /*
   * Number of offices to include in the response, (Default 100) 
   */
  public void setCount(Integer count) {
    this.count = count;
  }

  public Integer getCount() {
    return this.count;
  }
  /*
   * Position in the overall list of offices to begin results. 
   */
  public void setStartPosition(Integer startPosition) {
    this.startPosition = startPosition;
  }

  public Integer getStartPosition() {
    return this.startPosition;
  }
  /*
   * When true, the response only includes offices accessible to the calling user. 
   */
  public void setOnlyAccessible(Boolean onlyAccessible) {
    this.onlyAccessible = onlyAccessible;
  }

  public Boolean getOnlyAccessible() {
    return this.onlyAccessible;
  }
  /*
   * When specified, the response only includes offices whose names includes the specified search string. 
   */
  public void setSearch(String search) {
    this.search = search;
  }

  public String getSearch() {
    return this.search;
  }
  }

   /**
   * Get all offices.
   * 
   * @param accountId  (required)
   * @return OfficeSummaryList
   */ 
  public OfficeSummaryList getOffices(String accountId) throws ApiException {
    return getOffices(accountId, null);
  }

  /**
   * Get all offices.
   * 
   * @param accountId  (required)
   * @param options for modifying the method behavior.
   * @return OfficeSummaryList
   * @throws ApiException if fails to make API call
   */
  public OfficeSummaryList getOffices(String accountId, OfficesApi.GetOfficesOptions options) throws ApiException {
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
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };

    GenericType<OfficeSummaryList> localVarReturnType = new GenericType<OfficeSummaryList>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Lists the number of objects of each type that reference the office.
   * 
   * @param accountId  (required)
   * @param officeId  (required)
   * @return OfficeReferenceCountList
   * @throws ApiException if fails to make API call
   */
  public OfficeReferenceCountList getReferenceCounts(String accountId, Integer officeId) throws ApiException {
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
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };

    GenericType<OfficeReferenceCountList> localVarReturnType = new GenericType<OfficeReferenceCountList>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
