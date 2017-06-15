package com.vendhq.api;

import com.vendhq.api_2.ApiException;
import com.vendhq.api_2.ApiClient;
import com.vendhq.api_2.Configuration;
import com.vendhq.api_2.Pair;

import javax.ws.rs.core.GenericType;

import java.math.BigDecimal;
import com.vendhq.models.InventoryCollection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class InventoryApi {
  private ApiClient apiClient;

  public InventoryApi() {
    this(Configuration.getDefaultApiClient());
  }

  public InventoryApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * List inventory records
   * Returns a paginated list of inventory records.
   * @param after The lower limit for the version numbers to be included in the response. (optional)
   * @param before The upper limit for the version numbers to be included in the response. (optional)
   * @param pageSize The maximum number of items to be returned in the response. (optional)
   * @return InventoryCollection
   * @throws ApiException if fails to make API call
   */
  public InventoryCollection listInventoryRecords(BigDecimal after, BigDecimal before, BigDecimal pageSize) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/inventory";

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

    String[] localVarAuthNames = new String[] {  };

    GenericType<InventoryCollection> localVarReturnType = new GenericType<InventoryCollection>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
