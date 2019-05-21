# RegistersApi

All URIs are relative to *https://{domain_prefix}.vendhq.com/api/2.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getRegisterByID**](RegistersApi.md#getRegisterByID) | **GET** /registers/{register_id} | Get a single register
[**listRegisters**](RegistersApi.md#listRegisters) | **GET** /registers | List registers


<a name="getRegisterByID"></a>
# **getRegisterByID**
> RegisterResponse getRegisterByID(registerId)

Get a single register

Returns a single register with the requested ID.

### Example
```java
// Import classes:
//import com.vendhq.api.ApiClient;
//import com.vendhq.api.ApiException;
//import com.vendhq.api.Configuration;
//import com.vendhq.api.auth.*;
//import com.vendhq.api.RegistersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: personal_token
ApiKeyAuth personal_token = (ApiKeyAuth) defaultClient.getAuthentication("personal_token");
personal_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Bearer" (defaults to null)
//personal_token.setApiKeyPrefix("Bearer");

RegistersApi apiInstance = new RegistersApi();
UUID registerId = new UUID(); // UUID | Valid register ID.
try {
    RegisterResponse result = apiInstance.getRegisterByID(registerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RegistersApi#getRegisterByID");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **registerId** | [**UUID**](.md)| Valid register ID. |

### Return type

[**RegisterResponse**](RegisterResponse.md)

### Authorization

[personal_token](../README.md#personal_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listRegisters"></a>
# **listRegisters**
> RegisterCollection listRegisters(after, before, deleted, pageSize)

List registers

Returns a paginated list of registers.

### Example
```java
// Import classes:
//import com.vendhq.api.ApiClient;
//import com.vendhq.api.ApiException;
//import com.vendhq.api.Configuration;
//import com.vendhq.api.auth.*;
//import com.vendhq.api.RegistersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: personal_token
ApiKeyAuth personal_token = (ApiKeyAuth) defaultClient.getAuthentication("personal_token");
personal_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Bearer" (defaults to null)
//personal_token.setApiKeyPrefix("Bearer");

RegistersApi apiInstance = new RegistersApi();
Long after = 789L; // Long | The lower limit for the version numbers to be included in the response.
Long before = 789L; // Long | The upper limit for the version numbers to be included in the response.
Boolean deleted = true; // Boolean | Indicates whether deleted items should be included in the response.
Integer pageSize = 56; // Integer | The maximum number of items to be returned in the response.
try {
    RegisterCollection result = apiInstance.listRegisters(after, before, deleted, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RegistersApi#listRegisters");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **after** | **Long**| The lower limit for the version numbers to be included in the response. | [optional]
 **before** | **Long**| The upper limit for the version numbers to be included in the response. | [optional]
 **deleted** | **Boolean**| Indicates whether deleted items should be included in the response. | [optional]
 **pageSize** | **Integer**| The maximum number of items to be returned in the response. | [optional]

### Return type

[**RegisterCollection**](RegisterCollection.md)

### Authorization

[personal_token](../README.md#personal_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

