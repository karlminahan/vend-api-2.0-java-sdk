package com.vendhq.api;

import com.vendhq.api.ApiException;
import com.vendhq.api.ApiClient;
import com.vendhq.api.Configuration;
import com.vendhq.api.Pair;

import javax.ws.rs.core.GenericType;

import com.vendhq.models.RegisterCollection;
import com.vendhq.models.RegisterResponse;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class RegistersApi {
  private ApiClient apiClient;

  public RegistersApi(Configuration config) {
    this(config.getDefaultApiClient());
  }

  public RegistersApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get a single register
   * Returns a single register with the requested ID.
   * @param registerId Valid register ID. (required)
   * @return RegisterResponse
   * @throws ApiException if fails to make API call
   */
  public RegisterResponse getRegisterByID(UUID registerId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'registerId' is set
    if (registerId == null) {
      throw new ApiException(400, "Missing the required parameter 'registerId' when calling getRegisterByID");
    }
    
    // create path and map variables
    String localVarPath = "/registers/{register_id}"
      .replaceAll("\\{" + "register_id" + "\\}", apiClient.escapeString(registerId.toString()));

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

    GenericType<RegisterResponse> localVarReturnType = new GenericType<RegisterResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * List registers
   * Returns a paginated list of registers.
   * @param after The lower limit for the version numbers to be included in the response. (optional)
   * @param before The upper limit for the version numbers to be included in the response. (optional)
   * @param deleted Indicates whether deleted items should be included in the response. (optional)
   * @param pageSize The maximum number of items to be returned in the response. (optional)
   * @return RegisterCollection
   * @throws ApiException if fails to make API call
   */
  public RegisterCollection listRegisters(Long after, Long before, Boolean deleted, Integer pageSize) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/registers";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "after", after));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "before", before));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "deleted", deleted));
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

    GenericType<RegisterCollection> localVarReturnType = new GenericType<RegisterCollection>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
