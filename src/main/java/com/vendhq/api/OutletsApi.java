package com.vendhq.api;

import com.vendhq.api.ApiException;
import com.vendhq.api.ApiClient;
import com.vendhq.api.Configuration;
import com.vendhq.api.Pair;

import javax.ws.rs.core.GenericType;

import com.vendhq.models.OutletCollection;
import com.vendhq.models.OutletResponse;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class OutletsApi {
  private ApiClient apiClient;

  public OutletsApi(Configuration config) {
    this(config.getDefaultApiClient());
  }

  public OutletsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get a single outlet
   * Returns a single outlet with the requested ID.
   * @param outletId Valid Outlet ID. (required)
   * @return OutletResponse
   * @throws ApiException if fails to make API call
   */
  public OutletResponse getOutletByID(UUID outletId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'outletId' is set
    if (outletId == null) {
      throw new ApiException(400, "Missing the required parameter 'outletId' when calling getOutletByID");
    }
    
    // create path and map variables
    String localVarPath = "/outlets/{outlet_id}"
      .replaceAll("\\{" + "outlet_id" + "\\}", apiClient.escapeString(outletId.toString()));

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

    GenericType<OutletResponse> localVarReturnType = new GenericType<OutletResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * List outlets
   * Returns a collection of outlets.
   * @param after The lower limit for the version numbers to be included in the response. (optional)
   * @param before The upper limit for the version numbers to be included in the response. (optional)
   * @param pageSize The maximum number of items to be returned in the response. (optional)
   * @param deleted Indicates whether deleted items should be included in the response. (optional)
   * @return OutletCollection
   * @throws ApiException if fails to make API call
   */
  public OutletCollection listOutlets(Long after, Long before, Integer pageSize, Boolean deleted) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/outlets";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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

    String[] localVarAuthNames = new String[] { "personal_token" };

    GenericType<OutletCollection> localVarReturnType = new GenericType<OutletCollection>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
