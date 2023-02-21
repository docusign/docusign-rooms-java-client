
package com.docusign.rooms.api;

import javax.ws.rs.core.GenericType;

import com.docusign.rooms.client.ApiException;
import com.docusign.rooms.client.ApiClient;
import com.docusign.rooms.client.Configuration;
import com.docusign.rooms.model.*;
import com.docusign.rooms.client.Pair;
import com.docusign.rooms.client.ApiResponse;




/**
 * RoomTemplatesApi class.
 *
 **/
public class RoomTemplatesApi {
  private ApiClient apiClient;

 /**
  * RoomTemplatesApi.
  *
  **/
  public RoomTemplatesApi() {
    this(Configuration.getDefaultApiClient());
  }

 /**
  * RoomTemplatesApi.
  *
  **/
  public RoomTemplatesApi(ApiClient apiClient) {
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

  /// <summary>
  /// Returns all room templates that the active user has access to This method returns a list of room templates that the user can use to create a new room. The response includes company and region-level templates
  /// </summary>

 /**
  * GetRoomTemplatesOptions Class.
  *
  **/
  public class GetRoomTemplatesOptions
  {
  private Integer officeId = null;
  private Boolean onlyAssignable = null;
  private Boolean onlyEnabled = null;
  private Integer count = null;
  private Integer startPosition = null;
  
 /**
  * setOfficeId method.
  */
  public void setOfficeId(Integer officeId) {
    this.officeId = officeId;
  }

 /**
  * getOfficeId method.
  *
  * @return Integer
  */
  public Integer getOfficeId() {
    return this.officeId;
  }
  
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
  * setOnlyEnabled method.
  */
  public void setOnlyEnabled(Boolean onlyEnabled) {
    this.onlyEnabled = onlyEnabled;
  }

 /**
  * getOnlyEnabled method.
  *
  * @return Boolean
  */
  public Boolean getOnlyEnabled() {
    return this.onlyEnabled;
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
  }

   /**
   * Returns all room templates that the active user has access to.
   * This method returns a list of room templates that the user can use to create a new room. The response includes company and region-level templates
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @return RoomTemplatesSummaryList
   */ 
  public RoomTemplatesSummaryList getRoomTemplates(String accountId) throws ApiException {
    return getRoomTemplates(accountId, null);
  }

  /**
   * Returns all room templates that the active user has access to.
   * This method returns a list of room templates that the user can use to create a new room. The response includes company and region-level templates
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param options for modifying the method behavior.
   * @return RoomTemplatesSummaryList
   * @throws ApiException if fails to make API call
   */
  public RoomTemplatesSummaryList getRoomTemplates(String accountId, RoomTemplatesApi.GetRoomTemplatesOptions options) throws ApiException {
    ApiResponse<RoomTemplatesSummaryList> localVarResponse = getRoomTemplatesWithHttpInfo(accountId, options);
    return localVarResponse.getData();
  }

  /**
   * Returns all room templates that the active user has access to
   * This method returns a list of room templates that the user can use to create a new room. The response includes company and region-level templates
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param options for modifying the method behavior.
   * @return RoomTemplatesSummaryList
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<RoomTemplatesSummaryList > getRoomTemplatesWithHttpInfo(String accountId, RoomTemplatesApi.GetRoomTemplatesOptions options) throws ApiException {
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
      "text/plain", "application/json", "text/json", "application/xml", "text/xml"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json-patch+json", "application/json", "text/json", "application/_*+json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };
    
    GenericType<RoomTemplatesSummaryList> localVarReturnType = new GenericType<RoomTemplatesSummaryList>() {};
    RoomTemplatesSummaryList localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<RoomTemplatesSummaryList>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }
}
