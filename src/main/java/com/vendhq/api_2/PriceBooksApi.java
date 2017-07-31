package com.vendhq.api_2;

import com.vendhq.api_2.ApiException;
import com.vendhq.api_2.ApiClient;
import com.vendhq.api_2.Configuration;
import com.vendhq.api_2.Pair;

import javax.ws.rs.core.GenericType;

import java.math.BigDecimal;
import com.vendhq.models_2.PriceBookBase;
import com.vendhq.models_2.PriceBookCollection;
import com.vendhq.models_2.PriceBookResponse;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class PriceBooksApi {
  private ApiClient apiClient;

  public PriceBooksApi() {
    this(Configuration.getDefaultApiClient());
  }

  public PriceBooksApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create a price book
   * Creates a new price book.
   * @param body  (required)
   * @return PriceBookResponse
   * @throws ApiException if fails to make API call
   */
  public PriceBookResponse createPriceBook(PriceBookBase body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createPriceBook");
    }
    
    // create path and map variables
    String localVarPath = "/price_books";

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

    GenericType<PriceBookResponse> localVarReturnType = new GenericType<PriceBookResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get a single price book
   * Returns a single price book with a requested ID
   * @param priceBookId Valid price book ID. (required)
   * @return PriceBookResponse
   * @throws ApiException if fails to make API call
   */
  public PriceBookResponse getPriceBookbyID(UUID priceBookId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'priceBookId' is set
    if (priceBookId == null) {
      throw new ApiException(400, "Missing the required parameter 'priceBookId' when calling getPriceBookbyID");
    }
    
    // create path and map variables
    String localVarPath = "/price_books/{price_book_id}"
      .replaceAll("\\{" + "price_book_id" + "\\}", apiClient.escapeString(priceBookId.toString()));

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

    GenericType<PriceBookResponse> localVarReturnType = new GenericType<PriceBookResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * List price books
   * Returns a paginated list of price books
   * @param after The lower limit for the version numbers to be included in the response. (optional)
   * @param before The upper limit for the version numbers to be included in the response. (optional)
   * @param pageSize The maximum number of items to be returned in the response. (optional)
   * @return PriceBookCollection
   * @throws ApiException if fails to make API call
   */
  public PriceBookCollection listPriceBooks(BigDecimal after, BigDecimal before, BigDecimal pageSize) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/price_books";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "after", after));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "before", before));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page_size", pageSize));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth", "personal_token" };

    GenericType<PriceBookCollection> localVarReturnType = new GenericType<PriceBookCollection>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
