# SearchApi

All URIs are relative to *https://domain_prefix.vendhq.com/api/2.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**search**](SearchApi.md#search) | **GET** /search | Search for resources


<a name="search"></a>
# **search**
> SearchResponse search(type, orderBy, orderDirection, pageSize, offset, id, id2, deleted, status, invoiceNumber, customerId, userId, outletId, dateFrom, dateTo, sku, sku2, supplierId, supplierId2, brandId, brandId2, tagId, tagId2, productTypeId, productTypeId2, variantParentId, variantParentId2, customerCode, firstName, lastName, companyName, phone, mobile, email)

Search for resources

This endpoint enables seaching for a few types of entities (currently sales, products and customers) by a number of different attributes associated with them. The description for every query parameter indicates which type of object the parameter can be used to search for.

### Example
```java
// Import classes:
//import com.vendhq.api2.ApiClient;
//import com.vendhq.api2.ApiException;
//import com.vendhq.api2.Configuration;
//import com.vendhq.api2.auth.*;
//import com.vendhq.api2.SearchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
oauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: personal_token
ApiKeyAuth personal_token = (ApiKeyAuth) defaultClient.getAuthentication("personal_token");
personal_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Bearer" (defaults to null)
//personal_token.setApiKeyPrefix("Bearer");

SearchApi apiInstance = new SearchApi();
String type = "type_example"; // String | The enity type to search for. One of: `sales`, `products`, `customers`.
String orderBy = "orderBy_example"; // String | The attribute used to sort items returned in the response.
String orderDirection = "orderDirection_example"; // String | Sorting direction. One of: `asc`, `desc`.
Integer pageSize = 56; // Integer | The maximum number of objects to be included in the response, currently limited to 10000.
Integer offset = 56; // Integer | The number of objects to be \"skipped\" for the response. Used for pagination.
String id = "id_example"; // String | The `id` of the object to be included in the response.
String id2 = "id_example"; // String | The `id` of the object to be excluded from the response.
Boolean deleted = true; // Boolean | Indicated whether deleted objects should be included in the response.
String status = "status_example"; // String | **SALES** Status of the sale to find. Can be used multiple times to search for objects with different values of this parameter.
String invoiceNumber = "invoiceNumber_example"; // String | **SALES** Invoice number of the sale.
String customerId = "customerId_example"; // String | **SALES** The `ID` of the customer associated with the sales.
String userId = "userId_example"; // String | **SALES** The `ID` of the user associated with the sales.
String outletId = "outletId_example"; // String | **SALES** The `ID` of the outlet associated with the sales.
String dateFrom = "dateFrom_example"; // String | **SALES** Lower limit for the sale date.
String dateTo = "dateTo_example"; // String | **SALES** The `ID` Upper limit for the sale date.
String sku = "sku_example"; // String | __PRODUCTS__ The SKU of products to include in the search. Can be used multiple times to search for objects with different values of this parameter.
String sku2 = "sku_example"; // String | __PRODUCTS__ The SKU of products to exclude from the search. Can be used multiple times to search for objects with different values of this parameter.
String supplierId = "supplierId_example"; // String | __PRODUCTS__ The ID of the supplier associated with the product to include in the search. Can be used multiple times to search for objects with different values of this parameter.
String supplierId2 = "supplierId_example"; // String | __PRODUCTS__ The ID of the supplier associated with the product to exclude from the search. Can be used multiple times to search for objects with different values of this parameter.
String brandId = "brandId_example"; // String | __PRODUCTS__ The ID of the brand associated with the product to include in the search. Can be used multiple times to search for objects with different values of this parameter.
String brandId2 = "brandId_example"; // String | __PRODUCTS__ The ID of the brand associated with the product to exclude from the search. Can be used multiple times to search for objects with different values of this parameter.
String tagId = "tagId_example"; // String | __PRODUCTS__ The ID of the tag associated with the product to include in the search. Can be used multiple times to search for objects with different values of this parameter.
String tagId2 = "tagId_example"; // String | __PRODUCTS__ The ID of the brand associated with the product to exclude from the search. Can be used multiple times to search for objects with different values of this parameter.
String productTypeId = "productTypeId_example"; // String | __PRODUCTS__ The ID of the product type associated with the product to include in the search. Can be used multiple times to search for objects with different values of this parameter.
String productTypeId2 = "productTypeId_example"; // String | __PRODUCTS__ The ID of the product type associated with the product to exclude from the search. Can be used multiple times to search for objects with different values of this parameter.
String variantParentId = "variantParentId_example"; // String | __PRODUCTS__ The ID of the variant parent product associated with the product to include in the search. Can be used multiple times to search for objects with different values of this parameter.
String variantParentId2 = "variantParentId_example"; // String | __PRODUCTS__ The ID of the variant parent product associated with the product to exclude from the search. Can be used multiple times to search for objects with different values of this parameter.
String customerCode = "customerCode_example"; // String | **CUSTOMERS** The `customer_code` associated with the customer to find.
String firstName = "firstName_example"; // String | **CUSTOMERS** The `first_name` for the customers to find.
String lastName = "lastName_example"; // String | **CUSTOMERS** The `last_name` for the customers to find.
String companyName = "companyName_example"; // String | **CUSTOMERS** The `company_name` for the customers to find.
String phone = "phone_example"; // String | **CUSTOMERS** The `phone_number` for the customer(s) to find.
String mobile = "mobile_example"; // String | **CUSTOMERS** The `mobile` phone number for the customer(s) to find.
String email = "email_example"; // String | **CUSTOMERS** The `email` for the customer(s) to find.
try {
    SearchResponse result = apiInstance.search(type, orderBy, orderDirection, pageSize, offset, id, id2, deleted, status, invoiceNumber, customerId, userId, outletId, dateFrom, dateTo, sku, sku2, supplierId, supplierId2, brandId, brandId2, tagId, tagId2, productTypeId, productTypeId2, variantParentId, variantParentId2, customerCode, firstName, lastName, companyName, phone, mobile, email);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SearchApi#search");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **String**| The enity type to search for. One of: &#x60;sales&#x60;, &#x60;products&#x60;, &#x60;customers&#x60;. | [enum: sales, products, customers]
 **orderBy** | **String**| The attribute used to sort items returned in the response. | [optional]
 **orderDirection** | **String**| Sorting direction. One of: &#x60;asc&#x60;, &#x60;desc&#x60;. | [optional] [enum: asc, desc]
 **pageSize** | **Integer**| The maximum number of objects to be included in the response, currently limited to 10000. | [optional]
 **offset** | **Integer**| The number of objects to be \&quot;skipped\&quot; for the response. Used for pagination. | [optional]
 **id** | **String**| The &#x60;id&#x60; of the object to be included in the response. | [optional]
 **id2** | **String**| The &#x60;id&#x60; of the object to be excluded from the response. | [optional]
 **deleted** | **Boolean**| Indicated whether deleted objects should be included in the response. | [optional]
 **status** | **String**| **SALES** Status of the sale to find. Can be used multiple times to search for objects with different values of this parameter. | [optional]
 **invoiceNumber** | **String**| **SALES** Invoice number of the sale. | [optional]
 **customerId** | **String**| **SALES** The &#x60;ID&#x60; of the customer associated with the sales. | [optional]
 **userId** | **String**| **SALES** The &#x60;ID&#x60; of the user associated with the sales. | [optional]
 **outletId** | **String**| **SALES** The &#x60;ID&#x60; of the outlet associated with the sales. | [optional]
 **dateFrom** | **String**| **SALES** Lower limit for the sale date. | [optional]
 **dateTo** | **String**| **SALES** The &#x60;ID&#x60; Upper limit for the sale date. | [optional]
 **sku** | **String**| __PRODUCTS__ The SKU of products to include in the search. Can be used multiple times to search for objects with different values of this parameter. | [optional]
 **sku2** | **String**| __PRODUCTS__ The SKU of products to exclude from the search. Can be used multiple times to search for objects with different values of this parameter. | [optional]
 **supplierId** | **String**| __PRODUCTS__ The ID of the supplier associated with the product to include in the search. Can be used multiple times to search for objects with different values of this parameter. | [optional]
 **supplierId2** | **String**| __PRODUCTS__ The ID of the supplier associated with the product to exclude from the search. Can be used multiple times to search for objects with different values of this parameter. | [optional]
 **brandId** | **String**| __PRODUCTS__ The ID of the brand associated with the product to include in the search. Can be used multiple times to search for objects with different values of this parameter. | [optional]
 **brandId2** | **String**| __PRODUCTS__ The ID of the brand associated with the product to exclude from the search. Can be used multiple times to search for objects with different values of this parameter. | [optional]
 **tagId** | **String**| __PRODUCTS__ The ID of the tag associated with the product to include in the search. Can be used multiple times to search for objects with different values of this parameter. | [optional]
 **tagId2** | **String**| __PRODUCTS__ The ID of the brand associated with the product to exclude from the search. Can be used multiple times to search for objects with different values of this parameter. | [optional]
 **productTypeId** | **String**| __PRODUCTS__ The ID of the product type associated with the product to include in the search. Can be used multiple times to search for objects with different values of this parameter. | [optional]
 **productTypeId2** | **String**| __PRODUCTS__ The ID of the product type associated with the product to exclude from the search. Can be used multiple times to search for objects with different values of this parameter. | [optional]
 **variantParentId** | **String**| __PRODUCTS__ The ID of the variant parent product associated with the product to include in the search. Can be used multiple times to search for objects with different values of this parameter. | [optional]
 **variantParentId2** | **String**| __PRODUCTS__ The ID of the variant parent product associated with the product to exclude from the search. Can be used multiple times to search for objects with different values of this parameter. | [optional]
 **customerCode** | **String**| **CUSTOMERS** The &#x60;customer_code&#x60; associated with the customer to find. | [optional]
 **firstName** | **String**| **CUSTOMERS** The &#x60;first_name&#x60; for the customers to find. | [optional]
 **lastName** | **String**| **CUSTOMERS** The &#x60;last_name&#x60; for the customers to find. | [optional]
 **companyName** | **String**| **CUSTOMERS** The &#x60;company_name&#x60; for the customers to find. | [optional]
 **phone** | **String**| **CUSTOMERS** The &#x60;phone_number&#x60; for the customer(s) to find. | [optional]
 **mobile** | **String**| **CUSTOMERS** The &#x60;mobile&#x60; phone number for the customer(s) to find. | [optional]
 **email** | **String**| **CUSTOMERS** The &#x60;email&#x60; for the customer(s) to find. | [optional]

### Return type

[**SearchResponse**](SearchResponse.md)

### Authorization

[oauth](../README.md#oauth), [personal_token](../README.md#personal_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

