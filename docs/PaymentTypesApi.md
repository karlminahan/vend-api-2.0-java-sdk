# PaymentTypesApi

All URIs are relative to *https://domain_prefix.vendhq.com/api/2.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listPaymentTypes**](PaymentTypesApi.md#listPaymentTypes) | **GET** /payment_types | List payment types


<a name="listPaymentTypes"></a>
# **listPaymentTypes**
> PaymentTypeCollection listPaymentTypes(after, before, pageSize)

List payment types

Returns a paginated collection of payment types.

### Example
```java
// Import classes:
//import com.vendhq.api_2.ApiException;
//import com.vendhq.api.PaymentTypesApi;


PaymentTypesApi apiInstance = new PaymentTypesApi();
BigDecimal after = new BigDecimal(); // BigDecimal | The lower limit for the version numbers to be included in the response.
BigDecimal before = new BigDecimal(); // BigDecimal | The upper limit for the version numbers to be included in the response.
BigDecimal pageSize = new BigDecimal(); // BigDecimal | The maximum number of items to be returned in the response.
try {
    PaymentTypeCollection result = apiInstance.listPaymentTypes(after, before, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentTypesApi#listPaymentTypes");
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

[**PaymentTypeCollection**](PaymentTypeCollection.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

