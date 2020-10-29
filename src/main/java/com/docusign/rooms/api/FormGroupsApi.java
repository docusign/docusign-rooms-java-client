
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
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };

    GenericType<FormGroupSummaryList> localVarReturnType = new GenericType<FormGroupSummaryList>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
