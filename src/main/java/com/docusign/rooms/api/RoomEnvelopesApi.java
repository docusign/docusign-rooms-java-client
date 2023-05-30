
package com.docusign.rooms.api;

import jakarta.ws.rs.core.GenericType;

import com.docusign.rooms.client.ApiException;
import com.docusign.rooms.client.ApiClient;
import com.docusign.rooms.client.Configuration;
import com.docusign.rooms.model.*;
import com.docusign.rooms.client.Pair;
import com.docusign.rooms.client.ApiResponse;




/**
 * RoomEnvelopesApi class.
 *
 **/
public class RoomEnvelopesApi {
  private ApiClient apiClient;

 /**
  * RoomEnvelopesApi.
  *
  **/
  public RoomEnvelopesApi() {
    this(Configuration.getDefaultApiClient());
  }

 /**
  * RoomEnvelopesApi.
  *
  **/
  public RoomEnvelopesApi(ApiClient apiClient) {
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
   * Creates an envelope with given documents. Returns the eSign envelope ID created.
   * Creates an envelope with given documents. Returns the eSign envelope ID created
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param roomId Room ID (required)
   * @param body Envelope Name and list of document IDs (optional)
   * @return Envelope
   * @throws ApiException if fails to make API call
   */
  public Envelope createRoomEnvelope(String accountId, Integer roomId, EnvelopeForCreate body) throws ApiException {
    ApiResponse<Envelope> localVarResponse = createRoomEnvelopeWithHttpInfo(accountId, roomId, body);
    return localVarResponse.getData();
  }

  /**
   * Creates an envelope with given documents. Returns the eSign envelope ID created
   * Creates an envelope with given documents. Returns the eSign envelope ID created
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param roomId Room ID (required)
   * @param body Envelope Name and list of document IDs (optional)
   * @return Envelope
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Envelope > createRoomEnvelopeWithHttpInfo(String accountId, Integer roomId, EnvelopeForCreate body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling createRoomEnvelope");
    }
    
    // verify the required parameter 'roomId' is set
    if (roomId == null) {
      throw new ApiException(400, "Missing the required parameter 'roomId' when calling createRoomEnvelope");
    }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/rooms/{roomId}/envelopes"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "roomId" + "\\}", apiClient.escapeString(roomId.toString()));

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
    
    GenericType<Envelope> localVarReturnType = new GenericType<Envelope>() {};
    Envelope localVarResponse = apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<Envelope>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }
}
