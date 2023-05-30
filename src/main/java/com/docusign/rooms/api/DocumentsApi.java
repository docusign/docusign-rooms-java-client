
package com.docusign.rooms.api;

import jakarta.ws.rs.core.GenericType;

import com.docusign.rooms.client.ApiException;
import com.docusign.rooms.client.ApiClient;
import com.docusign.rooms.client.Configuration;
import com.docusign.rooms.model.*;
import com.docusign.rooms.client.Pair;
import com.docusign.rooms.client.ApiResponse;




/**
 * DocumentsApi class.
 *
 **/
public class DocumentsApi {
  private ApiClient apiClient;

 /**
  * DocumentsApi.
  *
  **/
  public DocumentsApi() {
    this(Configuration.getDefaultApiClient());
  }

 /**
  * DocumentsApi.
  *
  **/
  public DocumentsApi(ApiClient apiClient) {
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
   * Grants access to a document for a user..
   * Grants a user access to a document. You specify the user&#39;s &#x60;userId&#x60; in the request body. The response is an object that specifies the access the user has.
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param documentId The id of the document. (required)
   * @param body Request body with user id that the document has to be granted to (optional)
   * @return DocumentUser
   * @throws ApiException if fails to make API call
   */
  public DocumentUser createDocumentUser(String accountId, Integer documentId, DocumentUserForCreate body) throws ApiException {
    ApiResponse<DocumentUser> localVarResponse = createDocumentUserWithHttpInfo(accountId, documentId, body);
    return localVarResponse.getData();
  }

  /**
   * Grants access to a document for a user.
   * Grants a user access to a document. You specify the user&#39;s &#x60;userId&#x60; in the request body. The response is an object that specifies the access the user has.
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param documentId The id of the document. (required)
   * @param body Request body with user id that the document has to be granted to (optional)
   * @return DocumentUser
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DocumentUser > createDocumentUserWithHttpInfo(String accountId, Integer documentId, DocumentUserForCreate body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling createDocumentUser");
    }
    
    // verify the required parameter 'documentId' is set
    if (documentId == null) {
      throw new ApiException(400, "Missing the required parameter 'documentId' when calling createDocumentUser");
    }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/documents/{documentId}/users"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "documentId" + "\\}", apiClient.escapeString(documentId.toString()));

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
    
    GenericType<DocumentUser> localVarReturnType = new GenericType<DocumentUser>() {};
    DocumentUser localVarResponse = apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<DocumentUser>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Deletes a document..
   * Permanently deletes a document. To find the &#x60;documentId&#x60; of a document that you want to delete, use the Rooms::GetDocuments method.\\n\\nIf the document is deleted successfully, the HTTP response code is 204 (No Content), so the response body is empty.
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param documentId The ID of the document. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteDocument(String accountId, Integer documentId) throws ApiException {
    deleteDocumentWithHttpInfo(accountId, documentId);
  }

  /**
   * Deletes a document.
   * Permanently deletes a document. To find the &#x60;documentId&#x60; of a document that you want to delete, use the Rooms::GetDocuments method.\\n\\nIf the document is deleted successfully, the HTTP response code is 204 (No Content), so the response body is empty.
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param documentId The ID of the document. (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Object> deleteDocumentWithHttpInfo(String accountId, Integer documentId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteDocument");
    }
    
    // verify the required parameter 'documentId' is set
    if (documentId == null) {
      throw new ApiException(400, "Missing the required parameter 'documentId' when calling deleteDocument");
    }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/documents/{documentId}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "documentId" + "\\}", apiClient.escapeString(documentId.toString()));

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
  /// <summary>
  /// Get information about the Document with the given DocumentId. Returns information about a document in a room. You can optionally request the contents of the document, which is returned in base64-encoded format.\\n\\nTo find the &#x60;documentId&#x60; of the document that you want to retrieve, use the Rooms::GetDocuments method.
  /// </summary>

 /**
  * GetDocumentOptions Class.
  *
  **/
  public class GetDocumentOptions
  {
  private Boolean includeContents = null;
  
 /**
  * setIncludeContents method.
  */
  public void setIncludeContents(Boolean includeContents) {
    this.includeContents = includeContents;
  }

 /**
  * getIncludeContents method.
  *
  * @return Boolean
  */
  public Boolean getIncludeContents() {
    return this.includeContents;
  }
  }

   /**
   * Get information about the Document with the given DocumentId..
   * Returns information about a document in a room. You can optionally request the contents of the document, which is returned in base64-encoded format.\\n\\nTo find the &#x60;documentId&#x60; of the document that you want to retrieve, use the Rooms::GetDocuments method.
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param documentId The id of the document. (required)
   * @return Document
   */ 
  public Document getDocument(String accountId, Integer documentId) throws ApiException {
    return getDocument(accountId, documentId, null);
  }

  /**
   * Get information about the Document with the given DocumentId..
   * Returns information about a document in a room. You can optionally request the contents of the document, which is returned in base64-encoded format.\\n\\nTo find the &#x60;documentId&#x60; of the document that you want to retrieve, use the Rooms::GetDocuments method.
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param documentId The id of the document. (required)
   * @param options for modifying the method behavior.
   * @return Document
   * @throws ApiException if fails to make API call
   */
  public Document getDocument(String accountId, Integer documentId, DocumentsApi.GetDocumentOptions options) throws ApiException {
    ApiResponse<Document> localVarResponse = getDocumentWithHttpInfo(accountId, documentId, options);
    return localVarResponse.getData();
  }

  /**
   * Get information about the Document with the given DocumentId.
   * Returns information about a document in a room. You can optionally request the contents of the document, which is returned in base64-encoded format.\\n\\nTo find the &#x60;documentId&#x60; of the document that you want to retrieve, use the Rooms::GetDocuments method.
   * @param accountId (Required) The globally unique identifier (GUID) for the account. (required)
   * @param documentId The id of the document. (required)
   * @param options for modifying the method behavior.
   * @return Document
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Document > getDocumentWithHttpInfo(String accountId, Integer documentId, DocumentsApi.GetDocumentOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getDocument");
    }
    
    // verify the required parameter 'documentId' is set
    if (documentId == null) {
      throw new ApiException(400, "Missing the required parameter 'documentId' when calling getDocument");
    }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/documents/{documentId}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "documentId" + "\\}", apiClient.escapeString(documentId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("includeContents", options.includeContents));
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
    
    GenericType<Document> localVarReturnType = new GenericType<Document>() {};
    Document localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<Document>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }
}
