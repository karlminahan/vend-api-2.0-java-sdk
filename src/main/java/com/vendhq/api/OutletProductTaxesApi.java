package com.vendhq.api;

import com.vendhq.api.ApiException;
import com.vendhq.api.ApiClient;
import com.vendhq.api.Configuration;
import com.vendhq.api.Pair;

import javax.ws.rs.core.GenericType;

import java.math.BigDecimal;
import com.vendhq.models.OutletTaxCollection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class OutletProductTaxesApi {
  private ApiClient apiClient;

  public OutletProductTaxesApi(Configuration config) {
    this(config.getDefaultApiClient());
  }

  public OutletProductTaxesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * List outlet product taxes
   * Returns a paginated list of outlet-product-tax records.
   * @param outletId The ID of the outlet for which the results should be returned. (optional)
   * @param after The lower limit for the version numbers to be included in the response. (optional)
   * @param before The upper limit for the version numbers to be included in the response. (optional)
   * @param pageSize The maximum number of items to be returned in the response. (optional)
   * @param deleted Indicates whether deleted items should be included in the response. (optional)
   * @return OutletTaxCollection
   * @throws ApiException if fails to make API call
   */
  public OutletTaxCollection listOutletProductTaxes(String outletId, BigDecimal after, BigDecimal before, BigDecimal pageSize, Boolean deleted) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/outlet_taxes";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "outlet_id", outletId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "after", after));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "before", before));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page_size", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "deleted", deleted));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth", "personal_token" };

    GenericType<OutletTaxCollection> localVarReturnType = new GenericType<OutletTaxCollection>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
