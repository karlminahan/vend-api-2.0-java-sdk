# ProductTypesApi

All URIs are relative to *https://domain_prefix.vendhq.com/api/2.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getProductTypeByID**](ProductTypesApi.md#getProductTypeByID) | **GET** /product_types/{product_type_id} | Get a single product type
[**listProductTypes**](ProductTypesApi.md#listProductTypes) | **GET** /product_types | ListProductTypes


<a name="getProductTypeByID"></a>
# **getProductTypeByID**
> ProductTypeResponse getProductTypeByID(productTypeId)

Get a single product type

Returns a single product type with a given ID.

### Example
```java
// Import classes:
//import com.vendhq.api_2.ApiClient;
//import com.vendhq.api_2.ApiException;
//import com.vendhq.api_2.Configuration;
//import com.vendhq.api_2.auth.*;
//import com.vendhq.api_2.ProductTypesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
oauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: personal_token
ApiKeyAuth personal_token = (ApiKeyAuth) defaultClient.getAuthentication("personal_token");
personal_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//personal_token.setApiKeyPrefix("Token");

ProductTypesApi apiInstance = new ProductTypesApi();
UUID productTypeId = new UUID(); // UUID | Valid product type ID.
try {
    ProductTypeResponse result = apiInstance.getProductTypeByID(productTypeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductTypesApi#getProductTypeByID");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productTypeId** | **UUID**| Valid product type ID. |

### Return type

[**ProductTypeResponse**](ProductTypeResponse.md)

### Authorization

[oauth](../README.md#oauth), [personal_token](../README.md#personal_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listProductTypes"></a>
# **listProductTypes**
> ProductTypeCollection listProductTypes(after, before, pageSize)

ListProductTypes

Returns a paginated list of product types.

### Example
```java
// Import classes:
//import com.vendhq.api_2.ApiClient;
//import com.vendhq.api_2.ApiException;
//import com.vendhq.api_2.Configuration;
//import com.vendhq.api_2.auth.*;
//import com.vendhq.api_2.ProductTypesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
oauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: personal_token
ApiKeyAuth personal_token = (ApiKeyAuth) defaultClient.getAuthentication("personal_token");
personal_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//personal_token.setApiKeyPrefix("Token");

ProductTypesApi apiInstance = new ProductTypesApi();
BigDecimal after = new BigDecimal(); // BigDecimal | The lower limit for the version numbers to be included in the response.
BigDecimal before = new BigDecimal(); // BigDecimal | The upper limit for the version numbers to be included in the response.
BigDecimal pageSize = new BigDecimal(); // BigDecimal | The maximum number of items to be returned in the response.
try {
    ProductTypeCollection result = apiInstance.listProductTypes(after, before, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductTypesApi#listProductTypes");
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

[**ProductTypeCollection**](ProductTypeCollection.md)

### Authorization

[oauth](../README.md#oauth), [personal_token](../README.md#personal_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

