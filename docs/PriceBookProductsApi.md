# PriceBookProductsApi

All URIs are relative to *https://{domain_prefix}.vendhq.com/api/2.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listPriceBookProducts**](PriceBookProductsApi.md#listPriceBookProducts) | **GET** /price_book_products | List price book products


<a name="listPriceBookProducts"></a>
# **listPriceBookProducts**
> PriceBookProductCollection listPriceBookProducts(after, before, pageSize)

List price book products

Returns a paginated list of price book products.

### Example
```java
// Import classes:
//import com.vendhq.api.ApiClient;
//import com.vendhq.api.ApiException;
//import com.vendhq.api.Configuration;
//import com.vendhq.api.auth.*;
//import com.vendhq.api.PriceBookProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
oauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: personal_token
ApiKeyAuth personal_token = (ApiKeyAuth) defaultClient.getAuthentication("personal_token");
personal_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Bearer" (defaults to null)
//personal_token.setApiKeyPrefix("Bearer");

PriceBookProductsApi apiInstance = new PriceBookProductsApi();
Long after = 789L; // Long | The lower limit for the version numbers to be included in the response.
Long before = 789L; // Long | The upper limit for the version numbers to be included in the response.
Integer pageSize = 56; // Integer | The maximum number of items to be returned in the response.
try {
    PriceBookProductCollection result = apiInstance.listPriceBookProducts(after, before, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PriceBookProductsApi#listPriceBookProducts");
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

[**PriceBookProductCollection**](PriceBookProductCollection.md)

### Authorization

[oauth](../README.md#oauth), [personal_token](../README.md#personal_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

