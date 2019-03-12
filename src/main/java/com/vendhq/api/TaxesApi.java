package com.vendhq.api;

import com.vendhq.api.ApiException;
import com.vendhq.api.ApiClient;
import com.vendhq.api.Configuration;
import com.vendhq.api.Pair;

import javax.ws.rs.core.GenericType;

import com.vendhq.models.TaxCollection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class TaxesApi {
  private ApiClient apiClient;

  public TaxesApi(Configuration config) {
    this(config.getDefaultApiClient());
  }

  public TaxesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * List taxes
   * Returns a paginated list of taxes.
   * @param after The lower limit for the version numbers to be included in the response. (optional)
   * @param before The upper limit for the version numbers to be included in the response. (optional)
   * @param pageSize The maximum number of items to be returned in the response. (optional)
   * @return TaxCollection
   * @throws ApiException if fails to make API call
   */
  public TaxCollection listTaxes(Long after, Long before, Integer pageSize) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/taxes";

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

    GenericType<TaxCollection> localVarReturnType = new GenericType<TaxCollection>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
