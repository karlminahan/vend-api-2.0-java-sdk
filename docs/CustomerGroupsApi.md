# CustomerGroupsApi

All URIs are relative to *https://domain_prefix.vendhq.com/api/2.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listCustomerGroups**](CustomerGroupsApi.md#listCustomerGroups) | **GET** /customer_groups | List customer groups


<a name="listCustomerGroups"></a>
# **listCustomerGroups**
> CustomerGroupCollection listCustomerGroups(after, before, pageSize)

List customer groups

Returns a paginated list of customer groups.

### Example
```java
// Import classes:
//import com.vendhq.api_2.ApiException;
//import com.vendhq.api.CustomerGroupsApi;


CustomerGroupsApi apiInstance = new CustomerGroupsApi();
BigDecimal after = new BigDecimal(); // BigDecimal | The lower limit for the version numbers to be included in the response.
BigDecimal before = new BigDecimal(); // BigDecimal | The upper limit for the version numbers to be included in the response.
BigDecimal pageSize = new BigDecimal(); // BigDecimal | The maximum number of items to be returned in the response.
try {
    CustomerGroupCollection result = apiInstance.listCustomerGroups(after, before, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerGroupsApi#listCustomerGroups");
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

[**CustomerGroupCollection**](CustomerGroupCollection.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

