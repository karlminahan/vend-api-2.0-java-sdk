# PaymentTypesApi

All URIs are relative to *https://{domain_prefix}.vendhq.com/api/2.0*

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
//import com.vendhq.api.ApiClient;
//import com.vendhq.api.ApiException;
//import com.vendhq.api.Configuration;
//import com.vendhq.api.auth.*;
//import com.vendhq.api.PaymentTypesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: personal_token
ApiKeyAuth personal_token = (ApiKeyAuth) defaultClient.getAuthentication("personal_token");
personal_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Bearer" (defaults to null)
//personal_token.setApiKeyPrefix("Bearer");

PaymentTypesApi apiInstance = new PaymentTypesApi();
Long after = 789L; // Long | The lower limit for the version numbers to be included in the response.
Long before = 789L; // Long | The upper limit for the version numbers to be included in the response.
Integer pageSize = 56; // Integer | The maximum number of items to be returned in the response.
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
 **after** | **Long**| The lower limit for the version numbers to be included in the response. | [optional]
 **before** | **Long**| The upper limit for the version numbers to be included in the response. | [optional]
 **pageSize** | **Integer**| The maximum number of items to be returned in the response. | [optional]

### Return type

[**PaymentTypeCollection**](PaymentTypeCollection.md)

### Authorization

[personal_token](../README.md#personal_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

