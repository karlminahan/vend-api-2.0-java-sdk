package com.vendhq.api;

import com.vendhq.api.ApiException;
import com.vendhq.api.ApiClient;
import com.vendhq.api.Configuration;
import com.vendhq.api.Pair;

import javax.ws.rs.core.GenericType;

import com.vendhq.models.ChannelCollectionResponse;
import java.time.OffsetDateTime;
import com.vendhq.models.RequestCollectionResponse;
import com.vendhq.models.RequestSingleResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ChannelRequestLogApi {
  private ApiClient apiClient;

  public ChannelRequestLogApi(Configuration config) {
    this(config.getDefaultApiClient());
  }

  public ChannelRequestLogApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get a single request log
   * Returns a single request log entry with a specific ID.
   * @param requestLogId  (required)
   * @return RequestSingleResponse
   * @throws ApiException if fails to make API call
   */
  public RequestSingleResponse getSingleRequest(String requestLogId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'requestLogId' is set
    if (requestLogId == null) {
      throw new ApiException(400, "Missing the required parameter 'requestLogId' when calling getSingleRequest");
    }
    
    // create path and map variables
    String localVarPath = "/channel_requests/{request_log_id}"
      .replaceAll("\\{" + "request_log_id" + "\\}", apiClient.escapeString(requestLogId.toString()));

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

    GenericType<RequestSingleResponse> localVarReturnType = new GenericType<RequestSingleResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get a single request log as text
   * Returns a text representation of a single request log entry with a specific ID.
   * @param requestLogId  (required)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String getSingleRequestText(String requestLogId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'requestLogId' is set
    if (requestLogId == null) {
      throw new ApiException(400, "Missing the required parameter 'requestLogId' when calling getSingleRequestText");
    }
    
    // create path and map variables
    String localVarPath = "/channel_requests/{request_log_id}.txt"
      .replaceAll("\\{" + "request_log_id" + "\\}", apiClient.escapeString(requestLogId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "text/plain"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth", "personal_token" };

    GenericType<String> localVarReturnType = new GenericType<String>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * List channel records
   * Returns a list of configured channels.
   * @return ChannelCollectionResponse
   * @throws ApiException if fails to make API call
   */
  public ChannelCollectionResponse listChannels() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/channels";

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

    GenericType<ChannelCollectionResponse> localVarReturnType = new GenericType<ChannelCollectionResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * List request records
   * Returns a list of request log records.
   * @param statusCode Limit the requests to 1 or more status codes. (optional)
   * @param requestMethod Limit the requests to 1 or more request methods. (optional)
   * @param occurredBefore Limit requests to before this RFC3339 date. (optional)
   * @param occurredAfter Limit requests to after this RFC3339 date. (optional)
   * @param statusCodeBefore Limit requests to those with status codes less than this value. (optional)
   * @param statusCodeAfter Limit requests to those with status codes greater than this value. (optional)
   * @param channelId If provided, request logs will be limited to the supplied channel id. If no id is provided, only requests logged with no channel id will be returned. Requests with no channel id indicate requests made during the setup process. (optional)
   * @return RequestCollectionResponse
   * @throws ApiException if fails to make API call
   */
  public RequestCollectionResponse listRequests(String statusCode, String requestMethod, OffsetDateTime occurredBefore, OffsetDateTime occurredAfter, String statusCodeBefore, String statusCodeAfter, String channelId) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/channel_requests";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "status_code", statusCode));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "request_method", requestMethod));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "occurred_before", occurredBefore));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "occurred_after", occurredAfter));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "status_code_before", statusCodeBefore));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "status_code_after", statusCodeAfter));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "channel_id", channelId));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth", "personal_token" };

    GenericType<RequestCollectionResponse> localVarReturnType = new GenericType<RequestCollectionResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
