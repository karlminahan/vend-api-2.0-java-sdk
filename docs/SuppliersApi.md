# SuppliersApi

All URIs are relative to *https://domain_prefix.vendhq.com/api/2.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getSupplierByID**](SuppliersApi.md#getSupplierByID) | **GET** /suppliers/{supplier_id} | Get a single supplier
[**listSuppliers**](SuppliersApi.md#listSuppliers) | **GET** /suppliers | List suppliers


<a name="getSupplierByID"></a>
# **getSupplierByID**
> SupplierResponse getSupplierByID(supplierId)

Get a single supplier

Returns a single supplier with a given ID.

### Example
```java
// Import classes:
//import com.vendhq.api2.ApiClient;
//import com.vendhq.api2.ApiException;
//import com.vendhq.api2.Configuration;
//import com.vendhq.api2.auth.*;
//import com.vendhq.api2.SuppliersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
oauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: personal_token
ApiKeyAuth personal_token = (ApiKeyAuth) defaultClient.getAuthentication("personal_token");
personal_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Bearer" (defaults to null)
//personal_token.setApiKeyPrefix("Bearer");

SuppliersApi apiInstance = new SuppliersApi();
String supplierId = "supplierId_example"; // String | 
try {
    SupplierResponse result = apiInstance.getSupplierByID(supplierId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SuppliersApi#getSupplierByID");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **supplierId** | **String**|  |

### Return type

[**SupplierResponse**](SupplierResponse.md)

### Authorization

[oauth](../README.md#oauth), [personal_token](../README.md#personal_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listSuppliers"></a>
# **listSuppliers**
> SupplierCollection listSuppliers(after, before, pageSize)

List suppliers

Returns a paginated list of suppliers.

### Example
```java
// Import classes:
//import com.vendhq.api2.ApiClient;
//import com.vendhq.api2.ApiException;
//import com.vendhq.api2.Configuration;
//import com.vendhq.api2.auth.*;
//import com.vendhq.api2.SuppliersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
oauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: personal_token
ApiKeyAuth personal_token = (ApiKeyAuth) defaultClient.getAuthentication("personal_token");
personal_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Bearer" (defaults to null)
//personal_token.setApiKeyPrefix("Bearer");

SuppliersApi apiInstance = new SuppliersApi();
BigDecimal after = new BigDecimal(); // BigDecimal | The lower limit for the version numbers to be included in the response.
BigDecimal before = new BigDecimal(); // BigDecimal | The upper limit for the version numbers to be included in the response.
BigDecimal pageSize = new BigDecimal(); // BigDecimal | The maximum number of items to be returned in the response.
try {
    SupplierCollection result = apiInstance.listSuppliers(after, before, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SuppliersApi#listSuppliers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **after** | **BigDecimal**| The lower limit for the version numbers to be included in the response. | [optional]
 **before** | **BigDecimal**| The upper limit for the version numbers to be included in the response. | [optional]
 **pageSize** | **BigDecimal**| The maximum number of items to be returned in the response. | [optional]

### Return type

[**SupplierCollection**](SupplierCollection.md)

### Authorization

[oauth](../README.md#oauth), [personal_token](../README.md#personal_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

