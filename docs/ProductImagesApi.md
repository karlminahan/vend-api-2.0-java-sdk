# ProductImagesApi

All URIs are relative to *https://domain_prefix.vendhq.com/api/2.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteProductImageByID**](ProductImagesApi.md#deleteProductImageByID) | **DELETE** /product_images/{product_image_id} | Delete a product_image
[**getProductImageDataByID**](ProductImagesApi.md#getProductImageDataByID) | **GET** /product_images/{product_image_id} | Get a single product_image data
[**setImagePosition**](ProductImagesApi.md#setImagePosition) | **PUT** /product_images/{product_image_id} | Set image position


<a name="deleteProductImageByID"></a>
# **deleteProductImageByID**
> deleteProductImageByID(productImageId)

Delete a product_image

Deletes the product_image with the requested ID.

### Example
```java
// Import classes:
//import com.vendhq.api_2.ApiException;
//import com.vendhq.api.ProductImagesApi;


ProductImagesApi apiInstance = new ProductImagesApi();
String productImageId = "productImageId_example"; // String | 
try {
    apiInstance.deleteProductImageByID(productImageId);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductImagesApi#deleteProductImageByID");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productImageId** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getProductImageDataByID"></a>
# **getProductImageDataByID**
> ImageResponse getProductImageDataByID(productImageId)

Get a single product_image data

Returns the metadata for a single product image with a given ID. This method is useful for checking the status of an image after it was uploaded.

### Example
```java
// Import classes:
//import com.vendhq.api_2.ApiException;
//import com.vendhq.api.ProductImagesApi;


ProductImagesApi apiInstance = new ProductImagesApi();
UUID productImageId = new UUID(); // UUID | Valid product ID.
try {
    ImageResponse result = apiInstance.getProductImageDataByID(productImageId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductImagesApi#getProductImageDataByID");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productImageId** | **UUID**| Valid product ID. |

### Return type

[**ImageResponse**](ImageResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="setImagePosition"></a>
# **setImagePosition**
> ImageResponse setImagePosition(body, productImageId)

Set image position

Allows for changing the image position in the list

### Example
```java
// Import classes:
//import com.vendhq.api_2.ApiException;
//import com.vendhq.api.ProductImagesApi;


ProductImagesApi apiInstance = new ProductImagesApi();
ImagePosition body = new ImagePosition(); // ImagePosition | 
String productImageId = "productImageId_example"; // String | 
try {
    ImageResponse result = apiInstance.setImagePosition(body, productImageId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductImagesApi#setImagePosition");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ImagePosition**](ImagePosition.md)|  |
 **productImageId** | **String**|  |

### Return type

[**ImageResponse**](ImageResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json
