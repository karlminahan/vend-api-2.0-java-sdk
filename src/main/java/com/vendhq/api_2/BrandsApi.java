package com.vendhq.api_2;

import com.vendhq.api_2.ApiException;
import com.vendhq.api_2.ApiClient;
import com.vendhq.api_2.Configuration;
import com.vendhq.api_2.Pair;

import javax.ws.rs.core.GenericType;

import java.math.BigDecimal;
import com.vendhq.models_2.BrandCollection;
import com.vendhq.models_2.BrandResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class BrandsApi {
  private ApiClient apiClient;

  public BrandsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public BrandsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get a single brand
   * Returns a single brand with a requested ID
   * @param brandId Valid brand ID. (required)
   * @return BrandResponse
   * @throws ApiException if fails to make API call
   */
  public BrandResponse getBrandByID(String brandId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'brandId' is set
    if (brandId == null) {
      throw new ApiException(400, "Missing the required parameter 'brandId' when calling getBrandByID");
    }
    
    // create path and map variables
    String localVarPath = "/brands/{brand_id}"
      .replaceAll("\\{" + "brand_id" + "\\}", apiClient.escapeString(brandId.toString()));

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

    GenericType<BrandResponse> localVarReturnType = new GenericType<BrandResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * List brands
   * Returns a paginated list of brands.
   * @param after The lower limit for the version numbers to be included in the response. (optional)
   * @param before The upper limit for the version numbers to be included in the response. (optional)
   * @param pageSize The maximum number of items to be returned in the response. (optional)
   * @return BrandCollection
   * @throws ApiException if fails to make API call
   */
  public BrandCollection listBrands(BigDecimal after, BigDecimal before, BigDecimal pageSize) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/brands";

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

    GenericType<BrandCollection> localVarReturnType = new GenericType<BrandCollection>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
