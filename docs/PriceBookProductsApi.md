# PriceBookProductsApi

All URIs are relative to *https://domain_prefix.vendhq.com/api/2.0*

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
//import com.vendhq.api_2.ApiException;
//import com.vendhq.api.PriceBookProductsApi;


PriceBookProductsApi apiInstance = new PriceBookProductsApi();
BigDecimal after = new BigDecimal(); // BigDecimal | The lower limit for the version numbers to be included in the response.
BigDecimal before = new BigDecimal(); // BigDecimal | The upper limit for the version numbers to be included in the response.
BigDecimal pageSize = new BigDecimal(); // BigDecimal | The maximum number of items to be returned in the response.
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
 **after** | **BigDecimal**| The lower limit for the version numbers to be included in the response. | [optional]
 **before** | **BigDecimal**| The upper limit for the version numbers to be included in the response. | [optional]
 **pageSize** | **BigDecimal**| The maximum number of items to be returned in the response. | [optional]

### Return type

[**PriceBookProductCollection**](PriceBookProductCollection.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json
