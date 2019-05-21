# SalesApi

All URIs are relative to *https://{domain_prefix}.vendhq.com/api/2.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getSaleByID**](SalesApi.md#getSaleByID) | **GET** /sales/{sale_id} | Get a single sale
[**listSales**](SalesApi.md#listSales) | **GET** /sales | List Sales


<a name="getSaleByID"></a>
# **getSaleByID**
> SaleResponse getSaleByID(saleId)

Get a single sale

Returns a single sale with a given ID.

### Example
```java
// Import classes:
//import com.vendhq.api.ApiClient;
//import com.vendhq.api.ApiException;
//import com.vendhq.api.Configuration;
//import com.vendhq.api.auth.*;
//import com.vendhq.api.SalesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: personal_token
ApiKeyAuth personal_token = (ApiKeyAuth) defaultClient.getAuthentication("personal_token");
personal_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Bearer" (defaults to null)
//personal_token.setApiKeyPrefix("Bearer");

SalesApi apiInstance = new SalesApi();
UUID saleId = new UUID(); // UUID | Valid sale ID.
try {
    SaleResponse result = apiInstance.getSaleByID(saleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SalesApi#getSaleByID");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **saleId** | [**UUID**](.md)| Valid sale ID. |

### Return type

[**SaleResponse**](SaleResponse.md)

### Authorization

[personal_token](../README.md#personal_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listSales"></a>
# **listSales**
> SaleCollection listSales(after, before, pageSize)

List Sales

Returns a paginated list of sales.

### Example
```java
// Import classes:
//import com.vendhq.api.ApiClient;
//import com.vendhq.api.ApiException;
//import com.vendhq.api.Configuration;
//import com.vendhq.api.auth.*;
//import com.vendhq.api.SalesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: personal_token
ApiKeyAuth personal_token = (ApiKeyAuth) defaultClient.getAuthentication("personal_token");
personal_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Bearer" (defaults to null)
//personal_token.setApiKeyPrefix("Bearer");

SalesApi apiInstance = new SalesApi();
Long after = 789L; // Long | The lower limit for the version numbers to be included in the response.
Long before = 789L; // Long | The upper limit for the version numbers to be included in the response.
Integer pageSize = 56; // Integer | The maximum number of items to be returned in the response.
try {
    SaleCollection result = apiInstance.listSales(after, before, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SalesApi#listSales");
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

[**SaleCollection**](SaleCollection.md)

### Authorization

[personal_token](../README.md#personal_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

