# ChannelRequestLogApi

All URIs are relative to *https://domain_prefix.vendhq.com/api/2.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getSingleRequest**](ChannelRequestLogApi.md#getSingleRequest) | **GET** /channel_requests/{request_log_id} | Get a single request log
[**getSingleRequestText**](ChannelRequestLogApi.md#getSingleRequestText) | **GET** /channel_requests/{request_log_id}.txt | Get a single request log as text
[**listChannels**](ChannelRequestLogApi.md#listChannels) | **GET** /channels | List channel records
[**listRequests**](ChannelRequestLogApi.md#listRequests) | **GET** /channel_requests | List request records


<a name="getSingleRequest"></a>
# **getSingleRequest**
> RequestSingleResponse getSingleRequest(requestLogId)

Get a single request log

Returns a single request log entry with a specific ID.

### Example
```java
// Import classes:
//import com.vendhq.api.ApiClient;
//import com.vendhq.api.ApiException;
//import com.vendhq.api.Configuration;
//import com.vendhq.api.auth.*;
//import com.vendhq.api.ChannelRequestLogApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
oauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: personal_token
ApiKeyAuth personal_token = (ApiKeyAuth) defaultClient.getAuthentication("personal_token");
personal_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Bearer" (defaults to null)
//personal_token.setApiKeyPrefix("Bearer");

ChannelRequestLogApi apiInstance = new ChannelRequestLogApi();
String requestLogId = "requestLogId_example"; // String | 
try {
    RequestSingleResponse result = apiInstance.getSingleRequest(requestLogId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChannelRequestLogApi#getSingleRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **requestLogId** | **String**|  |

### Return type

[**RequestSingleResponse**](RequestSingleResponse.md)

### Authorization

[oauth](../README.md#oauth), [personal_token](../README.md#personal_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSingleRequestText"></a>
# **getSingleRequestText**
> String getSingleRequestText(requestLogId)

Get a single request log as text

Returns a text representation of a single request log entry with a specific ID.

### Example
```java
// Import classes:
//import com.vendhq.api.ApiClient;
//import com.vendhq.api.ApiException;
//import com.vendhq.api.Configuration;
//import com.vendhq.api.auth.*;
//import com.vendhq.api.ChannelRequestLogApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
oauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: personal_token
ApiKeyAuth personal_token = (ApiKeyAuth) defaultClient.getAuthentication("personal_token");
personal_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Bearer" (defaults to null)
//personal_token.setApiKeyPrefix("Bearer");

ChannelRequestLogApi apiInstance = new ChannelRequestLogApi();
String requestLogId = "requestLogId_example"; // String | 
try {
    String result = apiInstance.getSingleRequestText(requestLogId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChannelRequestLogApi#getSingleRequestText");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **requestLogId** | **String**|  |

### Return type

**String**

### Authorization

[oauth](../README.md#oauth), [personal_token](../README.md#personal_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: text/plain

<a name="listChannels"></a>
# **listChannels**
> ChannelCollectionResponse listChannels()

List channel records

Returns a list of configured channels.

### Example
```java
// Import classes:
//import com.vendhq.api.ApiClient;
//import com.vendhq.api.ApiException;
//import com.vendhq.api.Configuration;
//import com.vendhq.api.auth.*;
//import com.vendhq.api.ChannelRequestLogApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
oauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: personal_token
ApiKeyAuth personal_token = (ApiKeyAuth) defaultClient.getAuthentication("personal_token");
personal_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Bearer" (defaults to null)
//personal_token.setApiKeyPrefix("Bearer");

ChannelRequestLogApi apiInstance = new ChannelRequestLogApi();
try {
    ChannelCollectionResponse result = apiInstance.listChannels();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChannelRequestLogApi#listChannels");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ChannelCollectionResponse**](ChannelCollectionResponse.md)

### Authorization

[oauth](../README.md#oauth), [personal_token](../README.md#personal_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listRequests"></a>
# **listRequests**
> RequestCollectionResponse listRequests(statusCode, requestMethod, occurredBefore, occurredAfter, statusCodeBefore, statusCodeAfter, channelId)

List request records

Returns a list of request log records.

### Example
```java
// Import classes:
//import com.vendhq.api.ApiClient;
//import com.vendhq.api.ApiException;
//import com.vendhq.api.Configuration;
//import com.vendhq.api.auth.*;
//import com.vendhq.api.ChannelRequestLogApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
oauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: personal_token
ApiKeyAuth personal_token = (ApiKeyAuth) defaultClient.getAuthentication("personal_token");
personal_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Bearer" (defaults to null)
//personal_token.setApiKeyPrefix("Bearer");

ChannelRequestLogApi apiInstance = new ChannelRequestLogApi();
String statusCode = "statusCode_example"; // String | Limit the requests to 1 or more status codes.
String requestMethod = "requestMethod_example"; // String | Limit the requests to 1 or more request methods.
OffsetDateTime occurredBefore = OffsetDateTime.now(); // OffsetDateTime | Limit requests to before this RFC3339 date.
OffsetDateTime occurredAfter = OffsetDateTime.now(); // OffsetDateTime | Limit requests to after this RFC3339 date.
String statusCodeBefore = "statusCodeBefore_example"; // String | Limit requests to those with status codes less than this value.
String statusCodeAfter = "statusCodeAfter_example"; // String | Limit requests to those with status codes greater than this value.
String channelId = "channelId_example"; // String | If provided, request logs will be limited to the supplied channel id. If no id is provided, only requests logged with no channel id will be returned. Requests with no channel id indicate requests made during the setup process.
try {
    RequestCollectionResponse result = apiInstance.listRequests(statusCode, requestMethod, occurredBefore, occurredAfter, statusCodeBefore, statusCodeAfter, channelId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChannelRequestLogApi#listRequests");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **statusCode** | **String**| Limit the requests to 1 or more status codes. | [optional]
 **requestMethod** | **String**| Limit the requests to 1 or more request methods. | [optional]
 **occurredBefore** | **OffsetDateTime**| Limit requests to before this RFC3339 date. | [optional]
 **occurredAfter** | **OffsetDateTime**| Limit requests to after this RFC3339 date. | [optional]
 **statusCodeBefore** | **String**| Limit requests to those with status codes less than this value. | [optional]
 **statusCodeAfter** | **String**| Limit requests to those with status codes greater than this value. | [optional]
 **channelId** | **String**| If provided, request logs will be limited to the supplied channel id. If no id is provided, only requests logged with no channel id will be returned. Requests with no channel id indicate requests made during the setup process. | [optional]

### Return type

[**RequestCollectionResponse**](RequestCollectionResponse.md)

### Authorization

[oauth](../README.md#oauth), [personal_token](../README.md#personal_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

