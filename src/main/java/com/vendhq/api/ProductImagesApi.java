package com.vendhq.api;

import com.vendhq.api.ApiException;
import com.vendhq.api.ApiClient;
import com.vendhq.api.Configuration;
import com.vendhq.api.Pair;

import javax.ws.rs.core.GenericType;

import com.vendhq.models.ImagePosition;
import com.vendhq.models.ImageResponse;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ProductImagesApi {
  private ApiClient apiClient;

  public ProductImagesApi(Configuration config) {
    this(config.getDefaultApiClient());
  }

  public ProductImagesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Delete a product_image
   * Deletes the product_image with the requested ID.
   * @param productImageId  (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteProductImageByID(String productImageId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'productImageId' is set
    if (productImageId == null) {
      throw new ApiException(400, "Missing the required parameter 'productImageId' when calling deleteProductImageByID");
    }
    
    // create path and map variables
    String localVarPath = "/product_images/{product_image_id}"
      .replaceAll("\\{" + "product_image_id" + "\\}", apiClient.escapeString(productImageId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth", "personal_token" };


    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Get a single product_image data
   * Returns the metadata for a single product image with a given ID. This method is useful for checking the status of an image after it was uploaded.
   * @param productImageId Valid product ID. (required)
   * @return ImageResponse
   * @throws ApiException if fails to make API call
   */
  public ImageResponse getProductImageDataByID(UUID productImageId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'productImageId' is set
    if (productImageId == null) {
      throw new ApiException(400, "Missing the required parameter 'productImageId' when calling getProductImageDataByID");
    }
    
    // create path and map variables
    String localVarPath = "/product_images/{product_image_id}"
      .replaceAll("\\{" + "product_image_id" + "\\}", apiClient.escapeString(productImageId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth", "personal_token" };

    GenericType<ImageResponse> localVarReturnType = new GenericType<ImageResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Set image position
   * Allows for changing the image position in the list
   * @param body  (required)
   * @param productImageId  (required)
   * @return ImageResponse
   * @throws ApiException if fails to make API call
   */
  public ImageResponse setImagePosition(ImagePosition body, String productImageId) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling setImagePosition");
    }
    
    // verify the required parameter 'productImageId' is set
    if (productImageId == null) {
      throw new ApiException(400, "Missing the required parameter 'productImageId' when calling setImagePosition");
    }
    
    // create path and map variables
    String localVarPath = "/product_images/{product_image_id}"
      .replaceAll("\\{" + "product_image_id" + "\\}", apiClient.escapeString(productImageId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth", "personal_token" };

    GenericType<ImageResponse> localVarReturnType = new GenericType<ImageResponse>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
