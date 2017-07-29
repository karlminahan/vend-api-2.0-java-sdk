# PriceBooksApi

All URIs are relative to *https://domain_prefix.vendhq.com/api/2.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createPriceBook**](PriceBooksApi.md#createPriceBook) | **POST** /price_books | Create a price book
[**getPriceBookbyID**](PriceBooksApi.md#getPriceBookbyID) | **GET** /price_books/{price_book_id} | Get a single price book
[**listPriceBooks**](PriceBooksApi.md#listPriceBooks) | **GET** /price_books | List price books


<a name="createPriceBook"></a>
# **createPriceBook**
> PriceBookResponse createPriceBook(body)

Create a price book

Creates a new price book.

### Example
```java
// Import classes:
//import com.vendhq.api_2.ApiClient;
//import com.vendhq.api_2.ApiException;
//import com.vendhq.api_2.Configuration;
//import com.vendhq.api_2.auth.*;
//import com.vendhq.api_2.PriceBooksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
oauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: personal_token
ApiKeyAuth personal_token = (ApiKeyAuth) defaultClient.getAuthentication("personal_token");
personal_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Bearer" (defaults to null)
//personal_token.setApiKeyPrefix("Bearer");

PriceBooksApi apiInstance = new PriceBooksApi();
PriceBookBase body = new PriceBookBase(); // PriceBookBase | 
try {
    PriceBookResponse result = apiInstance.createPriceBook(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PriceBooksApi#createPriceBook");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PriceBookBase**](PriceBookBase.md)|  |

### Return type

[**PriceBookResponse**](PriceBookResponse.md)

### Authorization

[oauth](../README.md#oauth), [personal_token](../README.md#personal_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPriceBookbyID"></a>
# **getPriceBookbyID**
> PriceBookResponse getPriceBookbyID(priceBookId)

Get a single price book

Returns a single price book with a requested ID

### Example
```java
// Import classes:
//import com.vendhq.api_2.ApiClient;
//import com.vendhq.api_2.ApiException;
//import com.vendhq.api_2.Configuration;
//import com.vendhq.api_2.auth.*;
//import com.vendhq.api_2.PriceBooksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
oauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: personal_token
ApiKeyAuth personal_token = (ApiKeyAuth) defaultClient.getAuthentication("personal_token");
personal_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Bearer" (defaults to null)
//personal_token.setApiKeyPrefix("Bearer");

PriceBooksApi apiInstance = new PriceBooksApi();
UUID priceBookId = new UUID(); // UUID | Valid price book ID.
try {
    PriceBookResponse result = apiInstance.getPriceBookbyID(priceBookId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PriceBooksApi#getPriceBookbyID");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **priceBookId** | **UUID**| Valid price book ID. |

### Return type

[**PriceBookResponse**](PriceBookResponse.md)

### Authorization

[oauth](../README.md#oauth), [personal_token](../README.md#personal_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listPriceBooks"></a>
# **listPriceBooks**
> PriceBookCollection listPriceBooks(after, before, pageSize)

List price books

Returns a paginated list of price books

### Example
```java
// Import classes:
//import com.vendhq.api_2.ApiClient;
//import com.vendhq.api_2.ApiException;
//import com.vendhq.api_2.Configuration;
//import com.vendhq.api_2.auth.*;
//import com.vendhq.api_2.PriceBooksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
oauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: personal_token
ApiKeyAuth personal_token = (ApiKeyAuth) defaultClient.getAuthentication("personal_token");
personal_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Bearer" (defaults to null)
//personal_token.setApiKeyPrefix("Bearer");

PriceBooksApi apiInstance = new PriceBooksApi();
BigDecimal after = new BigDecimal(); // BigDecimal | The lower limit for the version numbers to be included in the response.
BigDecimal before = new BigDecimal(); // BigDecimal | The upper limit for the version numbers to be included in the response.
BigDecimal pageSize = new BigDecimal(); // BigDecimal | The maximum number of items to be returned in the response.
try {
    PriceBookCollection result = apiInstance.listPriceBooks(after, before, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PriceBooksApi#listPriceBooks");
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

[**PriceBookCollection**](PriceBookCollection.md)

### Authorization

[oauth](../README.md#oauth), [personal_token](../README.md#personal_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

