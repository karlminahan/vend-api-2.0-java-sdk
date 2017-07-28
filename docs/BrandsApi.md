# BrandsApi

All URIs are relative to *https://domain_prefix.vendhq.com/api/2.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getBrandByID**](BrandsApi.md#getBrandByID) | **GET** /brands/{brand_id} | Get a single brand
[**listBrands**](BrandsApi.md#listBrands) | **GET** /brands | List brands


<a name="getBrandByID"></a>
# **getBrandByID**
> BrandResponse getBrandByID(brandId)

Get a single brand

Returns a single brand with a requested ID

### Example
```java
// Import classes:
//import com.vendhq.api_2.ApiClient;
//import com.vendhq.api_2.ApiException;
//import com.vendhq.api_2.Configuration;
//import com.vendhq.api_2.auth.*;
//import com.vendhq.api_2.BrandsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
oauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: personal_token
ApiKeyAuth personal_token = (ApiKeyAuth) defaultClient.getAuthentication("personal_token");
personal_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//personal_token.setApiKeyPrefix("Token");

BrandsApi apiInstance = new BrandsApi();
String brandId = "brandId_example"; // String | Valid brand ID.
try {
    BrandResponse result = apiInstance.getBrandByID(brandId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BrandsApi#getBrandByID");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **brandId** | **String**| Valid brand ID. |

### Return type

[**BrandResponse**](BrandResponse.md)

### Authorization

[oauth](../README.md#oauth), [personal_token](../README.md#personal_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listBrands"></a>
# **listBrands**
> BrandCollection listBrands(after, before, pageSize)

List brands

Returns a paginated list of brands.

### Example
```java
// Import classes:
//import com.vendhq.api_2.ApiClient;
//import com.vendhq.api_2.ApiException;
//import com.vendhq.api_2.Configuration;
//import com.vendhq.api_2.auth.*;
//import com.vendhq.api_2.BrandsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
oauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: personal_token
ApiKeyAuth personal_token = (ApiKeyAuth) defaultClient.getAuthentication("personal_token");
personal_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//personal_token.setApiKeyPrefix("Token");

BrandsApi apiInstance = new BrandsApi();
BigDecimal after = new BigDecimal(); // BigDecimal | The lower limit for the version numbers to be included in the response.
BigDecimal before = new BigDecimal(); // BigDecimal | The upper limit for the version numbers to be included in the response.
BigDecimal pageSize = new BigDecimal(); // BigDecimal | The maximum number of items to be returned in the response.
try {
    BrandCollection result = apiInstance.listBrands(after, before, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BrandsApi#listBrands");
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

[**BrandCollection**](BrandCollection.md)

### Authorization

[oauth](../README.md#oauth), [personal_token](../README.md#personal_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

