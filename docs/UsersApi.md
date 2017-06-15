# UsersApi

All URIs are relative to *https://domain_prefix.vendhq.com/api/2.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getUserByID**](UsersApi.md#getUserByID) | **GET** /users/{user_id} | Get a single user
[**listUsers**](UsersApi.md#listUsers) | **GET** /users | List users


<a name="getUserByID"></a>
# **getUserByID**
> UserResponse getUserByID(userId)

Get a single user

Returns a single user with the requested ID.

### Example
```java
// Import classes:
//import com.vendhq.api_2.ApiException;
//import com.vendhq.api.UsersApi;


UsersApi apiInstance = new UsersApi();
UUID userId = new UUID(); // UUID | Valid user ID.
try {
    UserResponse result = apiInstance.getUserByID(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getUserByID");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **UUID**| Valid user ID. |

### Return type

[**UserResponse**](UserResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listUsers"></a>
# **listUsers**
> UserCollection listUsers(after, before, pageSize)

List users

Returns a paginated list of users.

### Example
```java
// Import classes:
//import com.vendhq.api_2.ApiException;
//import com.vendhq.api.UsersApi;


UsersApi apiInstance = new UsersApi();
BigDecimal after = new BigDecimal(); // BigDecimal | The lower limit for the version numbers to be included in the response.
BigDecimal before = new BigDecimal(); // BigDecimal | The upper limit for the version numbers to be included in the response.
BigDecimal pageSize = new BigDecimal(); // BigDecimal | The maximum number of items to be returned in the response.
try {
    UserCollection result = apiInstance.listUsers(after, before, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#listUsers");
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

[**UserCollection**](UserCollection.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

