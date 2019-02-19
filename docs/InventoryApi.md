# InventoryApi

All URIs are relative to *https://{domain_prefix}.vendhq.com/api/2.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listInventoryRecords**](InventoryApi.md#listInventoryRecords) | **GET** /inventory | List inventory records


<a name="listInventoryRecords"></a>
# **listInventoryRecords**
> InventoryCollection listInventoryRecords(after, before, pageSize)

List inventory records

Returns a paginated list of inventory records.

### Example
```java
// Import classes:
//import com.vendhq.api.ApiClient;
//import com.vendhq.api.ApiException;
//import com.vendhq.api.Configuration;
//import com.vendhq.api.auth.*;
//import com.vendhq.api.InventoryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
oauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: personal_token
ApiKeyAuth personal_token = (ApiKeyAuth) defaultClient.getAuthentication("personal_token");
personal_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Bearer" (defaults to null)
//personal_token.setApiKeyPrefix("Bearer");

InventoryApi apiInstance = new InventoryApi();
Long after = 789L; // Long | The lower limit for the version numbers to be included in the response.
Long before = 789L; // Long | The upper limit for the version numbers to be included in the response.
Integer pageSize = 56; // Integer | The maximum number of items to be returned in the response.
try {
    InventoryCollection result = apiInstance.listInventoryRecords(after, before, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InventoryApi#listInventoryRecords");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **after** | **Long**| The lower limit for the version numbers to be included in the response. | [optional]
 **before** | **Long**| The upper limit for the version numbers to be included in the response. | [optional]
 **pageSize** | **Integer**| The maximum number of items to be returned in the response. | [optional]

### Return type

[**InventoryCollection**](InventoryCollection.md)

### Authorization

[oauth](../README.md#oauth), [personal_token](../README.md#personal_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

