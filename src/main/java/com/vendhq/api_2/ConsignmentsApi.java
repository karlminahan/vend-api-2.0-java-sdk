package com.vendhq.api_2;

import com.vendhq.api_2.ApiException;
import com.vendhq.api_2.ApiClient;
import com.vendhq.api_2.Configuration;
import com.vendhq.api_2.Pair;

import javax.ws.rs.core.GenericType;

import java.math.BigDecimal;
import com.vendhq.models_2.ConsignmentCollection;
import com.vendhq.models_2.ConsignmentProductCollection;
import com.vendhq.models_2.ConsignmentResponse;
import com.vendhq.models_2.InventoryCount;
import com.vendhq.models_2.InventoryCountItemRequest;
import com.vendhq.models_2.InventoryCountItemResponse;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ConsignmentsApi {
  private ApiClient apiClient;

  public ConsignmentsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ConsignmentsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Adjust the inventory item count
   * Increases or decreases the count for a specific product within the inventory count.
   * @param consignmentId Valid consignment ID. (required)
   * @param body  (required)
   * @return InventoryCountItemResponse
   * @throws ApiException if fails to make API call
   */
  public InventoryCountItemResponse adjustInventoryItemCount(UUID consignmentId, InventoryCountItemRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'consignmentId' is set
    if (consignmentId == null) {
      throw new ApiException(400, "Missing the required parameter 'consignmentId' when calling adjustInventoryItemCount");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling adjustInventoryItemCount");
    }
    
    // create path and map variables
    String localVarPath = "/consignments/{consignment_id}/products"
      .replaceAll("\\{" + "consignment_id" + "\\}", apiClient.escapeString(consignmentId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth", "personal_token" };

    GenericType<InventoryCountItemResponse> localVarReturnType = new GenericType<InventoryCountItemResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Create an inventory count
   * Creates a new consignment of type &#x60;STOCKTAKE&#x60;. Currently, this endpoint only supports creation of inventory counts (stock takes).
   * @param body  (required)
   * @return ConsignmentResponse
   * @throws ApiException if fails to make API call
   */
  public ConsignmentResponse createInventoryCount(InventoryCount body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createInventoryCount");
    }
    
    // create path and map variables
    String localVarPath = "/consignments";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth", "personal_token" };

    GenericType<ConsignmentResponse> localVarReturnType = new GenericType<ConsignmentResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Delete a consignment
   * Deletes the consignment with the given ID.
   * @param consignmentId  (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteConsignmentByID(UUID consignmentId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'consignmentId' is set
    if (consignmentId == null) {
      throw new ApiException(400, "Missing the required parameter 'consignmentId' when calling deleteConsignmentByID");
    }
    
    // create path and map variables
    String localVarPath = "/consignments/{consignment_id}"
      .replaceAll("\\{" + "consignment_id" + "\\}", apiClient.escapeString(consignmentId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth", "personal_token" };


    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Delete an item from an inventory count
   * Removes the count for a specific product from the inventory count.
   * @param consignmentId Valid consignment (inventory count) ID. (required)
   * @param productId The ID of a product included in the inventory count (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteItemFromInventoryCount(String consignmentId, String productId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'consignmentId' is set
    if (consignmentId == null) {
      throw new ApiException(400, "Missing the required parameter 'consignmentId' when calling deleteItemFromInventoryCount");
    }
    
    // verify the required parameter 'productId' is set
    if (productId == null) {
      throw new ApiException(400, "Missing the required parameter 'productId' when calling deleteItemFromInventoryCount");
    }
    
    // create path and map variables
    String localVarPath = "/consignments/{consignment_id}/products/{product_id}"
      .replaceAll("\\{" + "consignment_id" + "\\}", apiClient.escapeString(consignmentId.toString()))
      .replaceAll("\\{" + "product_id" + "\\}", apiClient.escapeString(productId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth", "personal_token" };


    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Get a single consignment
   * Returns a single consignment with the requested ID.
   * @param consignmentId Valid consignment ID. (required)
   * @return ConsignmentResponse
   * @throws ApiException if fails to make API call
   */
  public ConsignmentResponse getConsignmentByID(UUID consignmentId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'consignmentId' is set
    if (consignmentId == null) {
      throw new ApiException(400, "Missing the required parameter 'consignmentId' when calling getConsignmentByID");
    }
    
    // create path and map variables
    String localVarPath = "/consignments/{consignment_id}"
      .replaceAll("\\{" + "consignment_id" + "\\}", apiClient.escapeString(consignmentId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth", "personal_token" };

    GenericType<ConsignmentResponse> localVarReturnType = new GenericType<ConsignmentResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * List consignments
   * Returns a paginated list of consignments.
   * @param after The lower limit for the version numbers to be included in the response. (optional)
   * @param before The upper limit for the version numbers to be included in the response. (optional)
   * @param pageSize The maximum number of items to be returned in the response. (optional)
   * @return ConsignmentCollection
   * @throws ApiException if fails to make API call
   */
  public ConsignmentCollection listConsignments(BigDecimal after, BigDecimal before, BigDecimal pageSize) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/consignments";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "after", after));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "before", before));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page_size", pageSize));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth", "personal_token" };

    GenericType<ConsignmentCollection> localVarReturnType = new GenericType<ConsignmentCollection>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * List all products for a specific consignment
   * Returns a collection of consignment products associated with the specified consignment.
   * @param consignmentId The ID of the consignment for which products should be listed. (required)
   * @param after The lower limit for the version numbers to be included in the response. (optional)
   * @param before The upper limit for the version numbers to be included in the response. (optional)
   * @param pageSize The maximum number of items to be returned in the response. (optional)
   * @return ConsignmentProductCollection
   * @throws ApiException if fails to make API call
   */
  public ConsignmentProductCollection listProductsByConsignmentID(UUID consignmentId, BigDecimal after, BigDecimal before, BigDecimal pageSize) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'consignmentId' is set
    if (consignmentId == null) {
      throw new ApiException(400, "Missing the required parameter 'consignmentId' when calling listProductsByConsignmentID");
    }
    
    // create path and map variables
    String localVarPath = "/consignments/{consignment_id}/products"
      .replaceAll("\\{" + "consignment_id" + "\\}", apiClient.escapeString(consignmentId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "after", after));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "before", before));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page_size", pageSize));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth", "personal_token" };

    GenericType<ConsignmentProductCollection> localVarReturnType = new GenericType<ConsignmentProductCollection>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Update an inventory count
   * Updates the inventory count with requested ID.
   * @param consignmentId Valid consignment ID. (required)
   * @param body  (required)
   * @return ConsignmentResponse
   * @throws ApiException if fails to make API call
   */
  public ConsignmentResponse updateInventoryCountByID(UUID consignmentId, InventoryCount body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'consignmentId' is set
    if (consignmentId == null) {
      throw new ApiException(400, "Missing the required parameter 'consignmentId' when calling updateInventoryCountByID");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateInventoryCountByID");
    }
    
    // create path and map variables
    String localVarPath = "/consignments/{consignment_id}"
      .replaceAll("\\{" + "consignment_id" + "\\}", apiClient.escapeString(consignmentId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth", "personal_token" };

    GenericType<ConsignmentResponse> localVarReturnType = new GenericType<ConsignmentResponse>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
