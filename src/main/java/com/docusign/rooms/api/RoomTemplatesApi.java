
package com.docusign.rooms.api;

import javax.ws.rs.core.GenericType;

import com.docusign.rooms.client.ApiException;
import com.docusign.rooms.client.ApiClient;
import com.docusign.rooms.client.Configuration;
import com.docusign.rooms.model.*;
import com.docusign.rooms.client.Pair;



public class RoomTemplatesApi {
  private ApiClient apiClient;

  public RoomTemplatesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public RoomTemplatesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /// <summary>
  /// Returns all room templates that the active user has access to 
  /// </summary>
  public class GetRoomTemplatesOptions
  {
  private Integer officeId = null;
  private Boolean onlyAssignable = null;
  private Boolean onlyEnabled = null;
  private Integer count = null;
  private Integer startPosition = null;
  /*
   * Get all room templates you have access to for this office. Response includes Company and Region level  If onlyAssignable is true, and no officeId is provided, user&#39;s default office is assumed. 
   */
  public void setOfficeId(Integer officeId) {
    this.officeId = officeId;
  }

  public Integer getOfficeId() {
    return this.officeId;
  }
  /*
   * Get list of templates you have access to. Default value false. 
   */
  public void setOnlyAssignable(Boolean onlyAssignable) {
    this.onlyAssignable = onlyAssignable;
  }

  public Boolean getOnlyAssignable() {
    return this.onlyAssignable;
  }
  /*
   * When set to true, only returns room templates that are not disabled. 
   */
  public void setOnlyEnabled(Boolean onlyEnabled) {
    this.onlyEnabled = onlyEnabled;
  }

  public Boolean getOnlyEnabled() {
    return this.onlyEnabled;
  }
  /*
   * Number of room templates to return. Defaults to the maximum which is 100. 
   */
  public void setCount(Integer count) {
    this.count = count;
  }

  public Integer getCount() {
    return this.count;
  }
  /*
   * Position of the first item in the total results. Defaults to 0. 
   */
  public void setStartPosition(Integer startPosition) {
    this.startPosition = startPosition;
  }

  public Integer getStartPosition() {
    return this.startPosition;
  }
  }

   /**
   * Returns all room templates that the active user has access to
   * 
   * @param accountId  (required)
   * @return RoomTemplatesSummaryList
   */ 
  public RoomTemplatesSummaryList getRoomTemplates(String accountId) throws ApiException {
    return getRoomTemplates(accountId, null);
  }

  /**
   * Returns all room templates that the active user has access to
   * 
   * @param accountId  (required)
   * @param options for modifying the method behavior.
   * @return RoomTemplatesSummaryList
   * @throws ApiException if fails to make API call
   */
  public RoomTemplatesSummaryList getRoomTemplates(String accountId, RoomTemplatesApi.GetRoomTemplatesOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getRoomTemplates");
    }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/room_templates"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("officeId", options.officeId));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("onlyAssignable", options.onlyAssignable));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("onlyEnabled", options.onlyEnabled));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("count", options.count));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("startPosition", options.startPosition));
    }

    

    

    final String[] localVarAccepts = {
      "text/plain", "application/json", "text/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };

    GenericType<RoomTemplatesSummaryList> localVarReturnType = new GenericType<RoomTemplatesSummaryList>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
