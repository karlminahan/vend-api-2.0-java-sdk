# OutletProductTaxesApi

All URIs are relative to *https://domain_prefix.vendhq.com/api/2.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listOutletProductTaxes**](OutletProductTaxesApi.md#listOutletProductTaxes) | **GET** /outlet_taxes | List outlet product taxes


<a name="listOutletProductTaxes"></a>
# **listOutletProductTaxes**
> OutletTaxCollection listOutletProductTaxes(outletId, after, before, pageSize, deleted)

List outlet product taxes

Returns a paginated list of outlet-product-tax records.

### Example
```java
// Import classes:
//import com.vendhq.api_2.ApiClient;
//import com.vendhq.api_2.ApiException;
//import com.vendhq.api_2.Configuration;
//import com.vendhq.api_2.auth.*;
//import com.vendhq.api_2.OutletProductTaxesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
oauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: personal_token
ApiKeyAuth personal_token = (ApiKeyAuth) defaultClient.getAuthentication("personal_token");
personal_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//personal_token.setApiKeyPrefix("Token");

OutletProductTaxesApi apiInstance = new OutletProductTaxesApi();
String outletId = "outletId_example"; // String | The ID of the outlet for which the results should be returned.
BigDecimal after = new BigDecimal(); // BigDecimal | The lower limit for the version numbers to be included in the response.
BigDecimal before = new BigDecimal(); // BigDecimal | The upper limit for the version numbers to be included in the response.
BigDecimal pageSize = new BigDecimal(); // BigDecimal | The maximum number of items to be returned in the response.
Boolean deleted = true; // Boolean | Indicates whether deleted items should be included in the response.
try {
    OutletTaxCollection result = apiInstance.listOutletProductTaxes(outletId, after, before, pageSize, deleted);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OutletProductTaxesApi#listOutletProductTaxes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **outletId** | **String**| The ID of the outlet for which the results should be returned. | [optional]
 **after** | **BigDecimal**| The lower limit for the version numbers to be included in the response. | [optional]
 **before** | **BigDecimal**| The upper limit for the version numbers to be included in the response. | [optional]
 **pageSize** | **BigDecimal**| The maximum number of items to be returned in the response. | [optional]
 **deleted** | **Boolean**| Indicates whether deleted items should be included in the response. | [optional]

### Return type

[**OutletTaxCollection**](OutletTaxCollection.md)

### Authorization

[oauth](../README.md#oauth), [personal_token](../README.md#personal_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json
