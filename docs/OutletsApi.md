# OutletsApi

All URIs are relative to *https://domain_prefix.vendhq.com/api/2.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getOutletByID**](OutletsApi.md#getOutletByID) | **GET** /outlets/{outlet_id} | Get a single outlet
[**listOutlets**](OutletsApi.md#listOutlets) | **GET** /outlets | List outlets


<a name="getOutletByID"></a>
# **getOutletByID**
> OutletResponse getOutletByID(outletId)

Get a single outlet

Returns a single outlet with the requested ID.

### Example
```java
// Import classes:
//import com.vendhq.api_2.ApiException;
//import com.vendhq.api.OutletsApi;


OutletsApi apiInstance = new OutletsApi();
UUID outletId = new UUID(); // UUID | Valid Outlet ID.
try {
    OutletResponse result = apiInstance.getOutletByID(outletId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OutletsApi#getOutletByID");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **outletId** | **UUID**| Valid Outlet ID. |

### Return type

[**OutletResponse**](OutletResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listOutlets"></a>
# **listOutlets**
> OutletCollection listOutlets(after, before, pageSize)

List outlets

Returns a collection of outlets.

### Example
```java
// Import classes:
//import com.vendhq.api_2.ApiException;
//import com.vendhq.api.OutletsApi;


OutletsApi apiInstance = new OutletsApi();
BigDecimal after = new BigDecimal(); // BigDecimal | The lower limit for the version numbers to be included in the response.
BigDecimal before = new BigDecimal(); // BigDecimal | The upper limit for the version numbers to be included in the response.
BigDecimal pageSize = new BigDecimal(); // BigDecimal | The maximum number of items to be returned in the response.
try {
    OutletCollection result = apiInstance.listOutlets(after, before, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OutletsApi#listOutlets");
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

[**OutletCollection**](OutletCollection.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json
