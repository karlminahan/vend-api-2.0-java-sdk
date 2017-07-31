# CustomersApi

All URIs are relative to *https://domain_prefix.vendhq.com/api/2.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCustomer**](CustomersApi.md#createCustomer) | **POST** /customers | Create a new customer
[**deleteCustomerByID**](CustomersApi.md#deleteCustomerByID) | **DELETE** /customers/{customer_id} | Delete a customer
[**getCustomerByID**](CustomersApi.md#getCustomerByID) | **GET** /customers/{customer_id} | Get a single customer
[**listCustomers**](CustomersApi.md#listCustomers) | **GET** /customers | List customers
[**updateCustomerByID**](CustomersApi.md#updateCustomerByID) | **PUT** /customers/{customer_id} | Update a customer


<a name="createCustomer"></a>
# **createCustomer**
> CustomerResponse createCustomer(body)

Create a new customer

Creates a new customer.

### Example
```java
// Import classes:
//import com.vendhq.api2.ApiClient;
//import com.vendhq.api2.ApiException;
//import com.vendhq.api2.Configuration;
//import com.vendhq.api2.auth.*;
//import com.vendhq.api2.CustomersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
oauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: personal_token
ApiKeyAuth personal_token = (ApiKeyAuth) defaultClient.getAuthentication("personal_token");
personal_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Bearer" (defaults to null)
//personal_token.setApiKeyPrefix("Bearer");

CustomersApi apiInstance = new CustomersApi();
CustomerBase body = new CustomerBase(); // CustomerBase | 
try {
    CustomerResponse result = apiInstance.createCustomer(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomersApi#createCustomer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CustomerBase**](CustomerBase.md)|  |

### Return type

[**CustomerResponse**](CustomerResponse.md)

### Authorization

[oauth](../README.md#oauth), [personal_token](../README.md#personal_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteCustomerByID"></a>
# **deleteCustomerByID**
> deleteCustomerByID(customerId)

Delete a customer

Deletes the customer with the requested ID.

### Example
```java
// Import classes:
//import com.vendhq.api2.ApiClient;
//import com.vendhq.api2.ApiException;
//import com.vendhq.api2.Configuration;
//import com.vendhq.api2.auth.*;
//import com.vendhq.api2.CustomersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
oauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: personal_token
ApiKeyAuth personal_token = (ApiKeyAuth) defaultClient.getAuthentication("personal_token");
personal_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Bearer" (defaults to null)
//personal_token.setApiKeyPrefix("Bearer");

CustomersApi apiInstance = new CustomersApi();
UUID customerId = new UUID(); // UUID | Valid customer ID.
try {
    apiInstance.deleteCustomerByID(customerId);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomersApi#deleteCustomerByID");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **UUID**| Valid customer ID. |

### Return type

null (empty response body)

### Authorization

[oauth](../README.md#oauth), [personal_token](../README.md#personal_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCustomerByID"></a>
# **getCustomerByID**
> CustomerResponse getCustomerByID(customerId)

Get a single customer

Returns a single customer with a requested ID.

### Example
```java
// Import classes:
//import com.vendhq.api2.ApiClient;
//import com.vendhq.api2.ApiException;
//import com.vendhq.api2.Configuration;
//import com.vendhq.api2.auth.*;
//import com.vendhq.api2.CustomersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
oauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: personal_token
ApiKeyAuth personal_token = (ApiKeyAuth) defaultClient.getAuthentication("personal_token");
personal_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Bearer" (defaults to null)
//personal_token.setApiKeyPrefix("Bearer");

CustomersApi apiInstance = new CustomersApi();
UUID customerId = new UUID(); // UUID | Valid customer ID.
try {
    CustomerResponse result = apiInstance.getCustomerByID(customerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomersApi#getCustomerByID");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **UUID**| Valid customer ID. |

### Return type

[**CustomerResponse**](CustomerResponse.md)

### Authorization

[oauth](../README.md#oauth), [personal_token](../README.md#personal_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listCustomers"></a>
# **listCustomers**
> CustomerCollection listCustomers(after, before, pageSize)

List customers

Returns a paginated list of customers.

### Example
```java
// Import classes:
//import com.vendhq.api2.ApiClient;
//import com.vendhq.api2.ApiException;
//import com.vendhq.api2.Configuration;
//import com.vendhq.api2.auth.*;
//import com.vendhq.api2.CustomersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
oauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: personal_token
ApiKeyAuth personal_token = (ApiKeyAuth) defaultClient.getAuthentication("personal_token");
personal_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Bearer" (defaults to null)
//personal_token.setApiKeyPrefix("Bearer");

CustomersApi apiInstance = new CustomersApi();
BigDecimal after = new BigDecimal(); // BigDecimal | The lower limit for the version numbers to be included in the response.
BigDecimal before = new BigDecimal(); // BigDecimal | The upper limit for the version numbers to be included in the response.
BigDecimal pageSize = new BigDecimal(); // BigDecimal | The maximum number of items to be returned in the response.
try {
    CustomerCollection result = apiInstance.listCustomers(after, before, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomersApi#listCustomers");
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

[**CustomerCollection**](CustomerCollection.md)

### Authorization

[oauth](../README.md#oauth), [personal_token](../README.md#personal_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateCustomerByID"></a>
# **updateCustomerByID**
> CustomerResponse updateCustomerByID(customerId, body)

Update a customer

Updates the customer with the requested ID.

### Example
```java
// Import classes:
//import com.vendhq.api2.ApiClient;
//import com.vendhq.api2.ApiException;
//import com.vendhq.api2.Configuration;
//import com.vendhq.api2.auth.*;
//import com.vendhq.api2.CustomersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
oauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: personal_token
ApiKeyAuth personal_token = (ApiKeyAuth) defaultClient.getAuthentication("personal_token");
personal_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Bearer" (defaults to null)
//personal_token.setApiKeyPrefix("Bearer");

CustomersApi apiInstance = new CustomersApi();
UUID customerId = new UUID(); // UUID | Valid customer ID.
CustomerBase body = new CustomerBase(); // CustomerBase | 
try {
    CustomerResponse result = apiInstance.updateCustomerByID(customerId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomersApi#updateCustomerByID");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **UUID**| Valid customer ID. |
 **body** | [**CustomerBase**](CustomerBase.md)|  |

### Return type

[**CustomerResponse**](CustomerResponse.md)

### Authorization

[oauth](../README.md#oauth), [personal_token](../README.md#personal_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

