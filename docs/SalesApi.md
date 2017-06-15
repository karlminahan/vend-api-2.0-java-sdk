# SalesApi

All URIs are relative to *https://domain_prefix.vendhq.com/api/2.0*

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
//import com.vendhq.api_2.ApiException;
//import com.vendhq.api.SalesApi;


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
 **saleId** | **UUID**| Valid sale ID. |

### Return type

[**SaleResponse**](SaleResponse.md)

### Authorization

No authorization required

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
//import com.vendhq.api_2.ApiException;
//import com.vendhq.api.SalesApi;


SalesApi apiInstance = new SalesApi();
BigDecimal after = new BigDecimal(); // BigDecimal | The lower limit for the version numbers to be included in the response.
BigDecimal before = new BigDecimal(); // BigDecimal | The upper limit for the version numbers to be included in the response.
BigDecimal pageSize = new BigDecimal(); // BigDecimal | The maximum number of items to be returned in the response.
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
 **after** | **BigDecimal**| The lower limit for the version numbers to be included in the response. | [optional]
 **before** | **BigDecimal**| The upper limit for the version numbers to be included in the response. | [optional]
 **pageSize** | **BigDecimal**| The maximum number of items to be returned in the response. | [optional]

### Return type

[**SaleCollection**](SaleCollection.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

