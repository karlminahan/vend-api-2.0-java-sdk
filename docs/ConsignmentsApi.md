# ConsignmentsApi

All URIs are relative to *https://domain_prefix.vendhq.com/api/2.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adjustInventoryItemCount**](ConsignmentsApi.md#adjustInventoryItemCount) | **POST** /consignments/{consignment_id}/products | Adjust the inventory item count
[**createInventoryCount**](ConsignmentsApi.md#createInventoryCount) | **POST** /consignments | Create an inventory count
[**deleteConsignmentByID**](ConsignmentsApi.md#deleteConsignmentByID) | **DELETE** /consignments/{consignment_id} | Delete a consignment
[**deleteItemFromInventoryCount**](ConsignmentsApi.md#deleteItemFromInventoryCount) | **DELETE** /consignments/{consignment_id}/products/{product_id} | Delete an item from an inventory count
[**getConsignmentByID**](ConsignmentsApi.md#getConsignmentByID) | **GET** /consignments/{consignment_id} | Get a single consignment
[**listConsignments**](ConsignmentsApi.md#listConsignments) | **GET** /consignments | List consignments
[**listProductsByConsignmentID**](ConsignmentsApi.md#listProductsByConsignmentID) | **GET** /consignments/{consignment_id}/products | List all products for a specific consignment
[**updateInventoryCountByID**](ConsignmentsApi.md#updateInventoryCountByID) | **PUT** /consignments/{consignment_id} | Update an inventory count


<a name="adjustInventoryItemCount"></a>
# **adjustInventoryItemCount**
> InventoryCountItemResponse adjustInventoryItemCount(consignmentId, body)

Adjust the inventory item count

Increases or decreases the count for a specific product within the inventory count.

### Example
```java
// Import classes:
//import com.vendhq.api.ApiClient;
//import com.vendhq.api.ApiException;
//import com.vendhq.api.Configuration;
//import com.vendhq.api.auth.*;
//import com.vendhq.api.ConsignmentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
oauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: personal_token
ApiKeyAuth personal_token = (ApiKeyAuth) defaultClient.getAuthentication("personal_token");
personal_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Bearer" (defaults to null)
//personal_token.setApiKeyPrefix("Bearer");

ConsignmentsApi apiInstance = new ConsignmentsApi();
UUID consignmentId = new UUID(); // UUID | Valid consignment ID.
InventoryCountItemRequest body = new InventoryCountItemRequest(); // InventoryCountItemRequest | 
try {
    InventoryCountItemResponse result = apiInstance.adjustInventoryItemCount(consignmentId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConsignmentsApi#adjustInventoryItemCount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **consignmentId** | **UUID**| Valid consignment ID. |
 **body** | [**InventoryCountItemRequest**](InventoryCountItemRequest.md)|  |

### Return type

[**InventoryCountItemResponse**](InventoryCountItemResponse.md)

### Authorization

[oauth](../README.md#oauth), [personal_token](../README.md#personal_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createInventoryCount"></a>
# **createInventoryCount**
> ConsignmentResponse createInventoryCount(body)

Create an inventory count

Creates a new consignment of type &#x60;STOCKTAKE&#x60;. Currently, this endpoint only supports creation of inventory counts (stock takes).

### Example
```java
// Import classes:
//import com.vendhq.api.ApiClient;
//import com.vendhq.api.ApiException;
//import com.vendhq.api.Configuration;
//import com.vendhq.api.auth.*;
//import com.vendhq.api.ConsignmentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
oauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: personal_token
ApiKeyAuth personal_token = (ApiKeyAuth) defaultClient.getAuthentication("personal_token");
personal_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Bearer" (defaults to null)
//personal_token.setApiKeyPrefix("Bearer");

ConsignmentsApi apiInstance = new ConsignmentsApi();
InventoryCount body = new InventoryCount(); // InventoryCount | 
try {
    ConsignmentResponse result = apiInstance.createInventoryCount(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConsignmentsApi#createInventoryCount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**InventoryCount**](InventoryCount.md)|  |

### Return type

[**ConsignmentResponse**](ConsignmentResponse.md)

### Authorization

[oauth](../README.md#oauth), [personal_token](../README.md#personal_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteConsignmentByID"></a>
# **deleteConsignmentByID**
> deleteConsignmentByID(consignmentId)

Delete a consignment

Deletes the consignment with the given ID.

### Example
```java
// Import classes:
//import com.vendhq.api.ApiClient;
//import com.vendhq.api.ApiException;
//import com.vendhq.api.Configuration;
//import com.vendhq.api.auth.*;
//import com.vendhq.api.ConsignmentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
oauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: personal_token
ApiKeyAuth personal_token = (ApiKeyAuth) defaultClient.getAuthentication("personal_token");
personal_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Bearer" (defaults to null)
//personal_token.setApiKeyPrefix("Bearer");

ConsignmentsApi apiInstance = new ConsignmentsApi();
UUID consignmentId = new UUID(); // UUID | 
try {
    apiInstance.deleteConsignmentByID(consignmentId);
} catch (ApiException e) {
    System.err.println("Exception when calling ConsignmentsApi#deleteConsignmentByID");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **consignmentId** | **UUID**|  |

### Return type

null (empty response body)

### Authorization

[oauth](../README.md#oauth), [personal_token](../README.md#personal_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteItemFromInventoryCount"></a>
# **deleteItemFromInventoryCount**
> deleteItemFromInventoryCount(consignmentId, productId)

Delete an item from an inventory count

Removes the count for a specific product from the inventory count.

### Example
```java
// Import classes:
//import com.vendhq.api.ApiClient;
//import com.vendhq.api.ApiException;
//import com.vendhq.api.Configuration;
//import com.vendhq.api.auth.*;
//import com.vendhq.api.ConsignmentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
oauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: personal_token
ApiKeyAuth personal_token = (ApiKeyAuth) defaultClient.getAuthentication("personal_token");
personal_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Bearer" (defaults to null)
//personal_token.setApiKeyPrefix("Bearer");

ConsignmentsApi apiInstance = new ConsignmentsApi();
String consignmentId = "consignmentId_example"; // String | Valid consignment (inventory count) ID.
String productId = "productId_example"; // String | The ID of a product included in the inventory count
try {
    apiInstance.deleteItemFromInventoryCount(consignmentId, productId);
} catch (ApiException e) {
    System.err.println("Exception when calling ConsignmentsApi#deleteItemFromInventoryCount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **consignmentId** | **String**| Valid consignment (inventory count) ID. |
 **productId** | **String**| The ID of a product included in the inventory count |

### Return type

null (empty response body)

### Authorization

[oauth](../README.md#oauth), [personal_token](../README.md#personal_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getConsignmentByID"></a>
# **getConsignmentByID**
> ConsignmentResponse getConsignmentByID(consignmentId)

Get a single consignment

Returns a single consignment with the requested ID.

### Example
```java
// Import classes:
//import com.vendhq.api.ApiClient;
//import com.vendhq.api.ApiException;
//import com.vendhq.api.Configuration;
//import com.vendhq.api.auth.*;
//import com.vendhq.api.ConsignmentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
oauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: personal_token
ApiKeyAuth personal_token = (ApiKeyAuth) defaultClient.getAuthentication("personal_token");
personal_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Bearer" (defaults to null)
//personal_token.setApiKeyPrefix("Bearer");

ConsignmentsApi apiInstance = new ConsignmentsApi();
UUID consignmentId = new UUID(); // UUID | Valid consignment ID.
try {
    ConsignmentResponse result = apiInstance.getConsignmentByID(consignmentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConsignmentsApi#getConsignmentByID");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **consignmentId** | **UUID**| Valid consignment ID. |

### Return type

[**ConsignmentResponse**](ConsignmentResponse.md)

### Authorization

[oauth](../README.md#oauth), [personal_token](../README.md#personal_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listConsignments"></a>
# **listConsignments**
> ConsignmentCollection listConsignments(after, before, pageSize, outletId, type, status)

List consignments

Returns a paginated list of consignments.

### Example
```java
// Import classes:
//import com.vendhq.api.ApiClient;
//import com.vendhq.api.ApiException;
//import com.vendhq.api.Configuration;
//import com.vendhq.api.auth.*;
//import com.vendhq.api.ConsignmentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
oauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: personal_token
ApiKeyAuth personal_token = (ApiKeyAuth) defaultClient.getAuthentication("personal_token");
personal_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Bearer" (defaults to null)
//personal_token.setApiKeyPrefix("Bearer");

ConsignmentsApi apiInstance = new ConsignmentsApi();
Long after = 789L; // Long | The lower limit for the version numbers to be included in the response.
Long before = 789L; // Long | The upper limit for the version numbers to be included in the response.
Integer pageSize = 56; // Integer | The maximum number of items to be returned in the response.
String outletId = "outletId_example"; // String | The ID of the outlet which the consignment is targeted at.
String type = "type_example"; // String | The type of consignments to be returned.
String status = "status_example"; // String | The status of consignments to be returned.
try {
    ConsignmentCollection result = apiInstance.listConsignments(after, before, pageSize, outletId, type, status);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConsignmentsApi#listConsignments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **after** | **Long**| The lower limit for the version numbers to be included in the response. | [optional]
 **before** | **Long**| The upper limit for the version numbers to be included in the response. | [optional]
 **pageSize** | **Integer**| The maximum number of items to be returned in the response. | [optional]
 **outletId** | **String**| The ID of the outlet which the consignment is targeted at. | [optional]
 **type** | **String**| The type of consignments to be returned. | [optional] [enum: SUPPLIER, OUTLET, STOCKTAKE]
 **status** | **String**| The status of consignments to be returned. | [optional] [enum: RECEIVED, CANCELLED, OPEN, STOCKTAKE, SENT, STOCKTAKE_COMPLETE, STOCKTAKE_IN_PROGRESS, STOCKTAKE_SCHEDULED, STOCKTAKE_IN_PROGRESS_PROCESSED]

### Return type

[**ConsignmentCollection**](ConsignmentCollection.md)

### Authorization

[oauth](../README.md#oauth), [personal_token](../README.md#personal_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listProductsByConsignmentID"></a>
# **listProductsByConsignmentID**
> ConsignmentProductCollection listProductsByConsignmentID(consignmentId, after, before, pageSize)

List all products for a specific consignment

Returns a collection of consignment products associated with the specified consignment.

### Example
```java
// Import classes:
//import com.vendhq.api.ApiClient;
//import com.vendhq.api.ApiException;
//import com.vendhq.api.Configuration;
//import com.vendhq.api.auth.*;
//import com.vendhq.api.ConsignmentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
oauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: personal_token
ApiKeyAuth personal_token = (ApiKeyAuth) defaultClient.getAuthentication("personal_token");
personal_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Bearer" (defaults to null)
//personal_token.setApiKeyPrefix("Bearer");

ConsignmentsApi apiInstance = new ConsignmentsApi();
UUID consignmentId = new UUID(); // UUID | The ID of the consignment for which products should be listed.
Long after = 789L; // Long | The lower limit for the version numbers to be included in the response.
Long before = 789L; // Long | The upper limit for the version numbers to be included in the response.
Integer pageSize = 56; // Integer | The maximum number of items to be returned in the response.
try {
    ConsignmentProductCollection result = apiInstance.listProductsByConsignmentID(consignmentId, after, before, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConsignmentsApi#listProductsByConsignmentID");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **consignmentId** | **UUID**| The ID of the consignment for which products should be listed. |
 **after** | **Long**| The lower limit for the version numbers to be included in the response. | [optional]
 **before** | **Long**| The upper limit for the version numbers to be included in the response. | [optional]
 **pageSize** | **Integer**| The maximum number of items to be returned in the response. | [optional]

### Return type

[**ConsignmentProductCollection**](ConsignmentProductCollection.md)

### Authorization

[oauth](../README.md#oauth), [personal_token](../README.md#personal_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateInventoryCountByID"></a>
# **updateInventoryCountByID**
> ConsignmentResponse updateInventoryCountByID(consignmentId, body)

Update an inventory count

Updates the inventory count with requested ID.

### Example
```java
// Import classes:
//import com.vendhq.api.ApiClient;
//import com.vendhq.api.ApiException;
//import com.vendhq.api.Configuration;
//import com.vendhq.api.auth.*;
//import com.vendhq.api.ConsignmentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
oauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: personal_token
ApiKeyAuth personal_token = (ApiKeyAuth) defaultClient.getAuthentication("personal_token");
personal_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Bearer" (defaults to null)
//personal_token.setApiKeyPrefix("Bearer");

ConsignmentsApi apiInstance = new ConsignmentsApi();
UUID consignmentId = new UUID(); // UUID | Valid consignment ID.
InventoryCount body = new InventoryCount(); // InventoryCount | 
try {
    ConsignmentResponse result = apiInstance.updateInventoryCountByID(consignmentId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConsignmentsApi#updateInventoryCountByID");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **consignmentId** | **UUID**| Valid consignment ID. |
 **body** | [**InventoryCount**](InventoryCount.md)|  |

### Return type

[**ConsignmentResponse**](ConsignmentResponse.md)

### Authorization

[oauth](../README.md#oauth), [personal_token](../README.md#personal_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

