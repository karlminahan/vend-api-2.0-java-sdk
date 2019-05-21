package com.vendhq.api;

import com.vendhq.api.ApiException;
import com.vendhq.api.ApiClient;
import com.vendhq.api.Configuration;
import com.vendhq.api.Pair;

import javax.ws.rs.core.GenericType;

import com.vendhq.models.ProductTypeCollection;
import com.vendhq.models.ProductTypeResponse;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ProductTypesApi {
  private ApiClient apiClient;

  public ProductTypesApi(Configuration config) {
    this(config.getDefaultApiClient());
  }

  public ProductTypesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get a single product type
   * Returns a single product type with a given ID.
   * @param productTypeId Valid product type ID. (required)
   * @return ProductTypeResponse
   * @throws ApiException if fails to make API call
   */
  public ProductTypeResponse getProductTypeByID(UUID productTypeId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'productTypeId' is set
    if (productTypeId == null) {
      throw new ApiException(400, "Missing the required parameter 'productTypeId' when calling getProductTypeByID");
    }
    
    // create path and map variables
    String localVarPath = "/product_types/{product_type_id}"
      .replaceAll("\\{" + "product_type_id" + "\\}", apiClient.escapeString(productTypeId.toString()));

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

    String[] localVarAuthNames = new String[] { "personal_token" };

    GenericType<ProductTypeResponse> localVarReturnType = new GenericType<ProductTypeResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * ListProductTypes
   * Returns a paginated list of product types.
   * @param after The lower limit for the version numbers to be included in the response. (optional)
   * @param before The upper limit for the version numbers to be included in the response. (optional)
   * @param pageSize The maximum number of items to be returned in the response. (optional)
   * @return ProductTypeCollection
   * @throws ApiException if fails to make API call
   */
  public ProductTypeCollection listProductTypes(Long after, Long before, Integer pageSize) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/product_types";

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

    String[] localVarAuthNames = new String[] { "personal_token" };

    GenericType<ProductTypeCollection> localVarReturnType = new GenericType<ProductTypeCollection>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
