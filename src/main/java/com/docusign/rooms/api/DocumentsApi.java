
package com.docusign.rooms.api;

import javax.ws.rs.core.GenericType;

import com.docusign.rooms.client.ApiException;
import com.docusign.rooms.client.ApiClient;
import com.docusign.rooms.client.Configuration;
import com.docusign.rooms.model.*;
import com.docusign.rooms.client.Pair;



public class DocumentsApi {
  private ApiClient apiClient;

  public DocumentsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public DocumentsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }


  /**
   * Grants access to a document for a user.
   * 
   * @param accountId  (required)
   * @param documentId  (required)
   * @param documentUserForCreate  (required)
   * @return DocumentUser
   * @throws ApiException if fails to make API call
   */
  public DocumentUser createDocumentUser(String accountId, Integer documentId, DocumentUserForCreate documentUserForCreate) throws ApiException {
    Object localVarPostBody = documentUserForCreate;
    
    // verify the required parameter 'documentId' is set
    if (documentId == null) {
      throw new ApiException(400, "Missing the required parameter 'documentId' when calling createDocumentUser");
    }
    
    // verify the required parameter 'documentUserForCreate' is set
    if (documentUserForCreate == null) {
      throw new ApiException(400, "Missing the required parameter 'documentUserForCreate' when calling createDocumentUser");
    }
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling createDocumentUser");
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
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };

    GenericType<DocumentUser> localVarReturnType = new GenericType<DocumentUser>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Deletes a document.
   * 
   * @param accountId  (required)
   * @param documentId  (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteDocument(String accountId, Integer documentId) throws ApiException {
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
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };


    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /// <summary>
  /// Get information about the Document with the given DocumentId. 
  /// </summary>
  public class GetDocumentOptions
  {
  private Boolean includeContents = null;
  /*
   *  
   */
  public void setIncludeContents(Boolean includeContents) {
    this.includeContents = includeContents;
  }

  public Boolean getIncludeContents() {
    return this.includeContents;
  }
  }

   /**
   * Get information about the Document with the given DocumentId.
   * 
   * @param accountId  (required)
   * @param documentId  (required)
   * @return Document
   */ 
  public Document getDocument(String accountId, Integer documentId) throws ApiException {
    return getDocument(accountId, documentId, null);
  }

  /**
   * Get information about the Document with the given DocumentId.
   * 
   * @param accountId  (required)
   * @param documentId  (required)
   * @param options for modifying the method behavior.
   * @return Document
   * @throws ApiException if fails to make API call
   */
  public Document getDocument(String accountId, Integer documentId, DocumentsApi.GetDocumentOptions options) throws ApiException {
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
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };

    GenericType<Document> localVarReturnType = new GenericType<Document>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
