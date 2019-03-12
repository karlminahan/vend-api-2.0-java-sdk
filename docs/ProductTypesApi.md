# ProductTypesApi

All URIs are relative to *https://{domain_prefix}.vendhq.com/api/2.0*

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
//import com.vendhq.api.ApiClient;
//import com.vendhq.api.ApiException;
//import com.vendhq.api.Configuration;
//import com.vendhq.api.auth.*;
//import com.vendhq.api.ProductTypesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: personal_token
ApiKeyAuth personal_token = (ApiKeyAuth) defaultClient.getAuthentication("personal_token");
personal_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Bearer" (defaults to null)
//personal_token.setApiKeyPrefix("Bearer");

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
 **productTypeId** | [**UUID**](.md)| Valid product type ID. |

### Return type

[**ProductTypeResponse**](ProductTypeResponse.md)

### Authorization

[personal_token](../README.md#personal_token)

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
//import com.vendhq.api.ApiClient;
//import com.vendhq.api.ApiException;
//import com.vendhq.api.Configuration;
//import com.vendhq.api.auth.*;
//import com.vendhq.api.ProductTypesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: personal_token
ApiKeyAuth personal_token = (ApiKeyAuth) defaultClient.getAuthentication("personal_token");
personal_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Bearer" (defaults to null)
//personal_token.setApiKeyPrefix("Bearer");

ProductTypesApi apiInstance = new ProductTypesApi();
Long after = 789L; // Long | The lower limit for the version numbers to be included in the response.
Long before = 789L; // Long | The upper limit for the version numbers to be included in the response.
Integer pageSize = 56; // Integer | The maximum number of items to be returned in the response.
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
 **after** | **Long**| The lower limit for the version numbers to be included in the response. | [optional]
 **before** | **Long**| The upper limit for the version numbers to be included in the response. | [optional]
 **pageSize** | **Integer**| The maximum number of items to be returned in the response. | [optional]

### Return type

[**ProductTypeCollection**](ProductTypeCollection.md)

### Authorization

[personal_token](../README.md#personal_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

