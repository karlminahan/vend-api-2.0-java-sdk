package com.vendhq.api;

import com.vendhq.api.ApiException;
import com.vendhq.api.ApiClient;
import com.vendhq.api.Configuration;
import com.vendhq.api.Pair;

import javax.ws.rs.core.GenericType;

import com.vendhq.models.SearchResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class SearchApi {
  private ApiClient apiClient;

  public SearchApi(Configuration config) {
    this(config.getDefaultApiClient());
  }

  public SearchApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Search for resources
   * This endpoint allows integrators to search all of the most commonly used resources, **sales**, **products** and **customers**. Each type allowing search by a number of different parameters.  ### Supported resource types and attributes  - **Sales**   - date_from   - date_to   - status   - invoice_number   - customer_id   - user_id   - outlet_id - **Products**   - sku   - supplier_id   - brand_id   - tag_id   - product_type_id   - variant_parent_id - **Customers**   - customer_code   - first_name   - last_name   - company_name   ### Sorting and pagination  Unlike other endpoints in the API 2.0, search results from this endpoint can be sorted by any of the attributes above. Because of that, the default [pagination](https://docs.vendhq.com/v0.9/reference#section-api-2-0) mechanism is not appropriate for this endpoint. Instead, this endpoint uses &#x60;offset&#x60; and &#x60;page_size&#x60; attributes to handle search results spanning multiple pages.
   * @param type The enity type to search for. One of: &#x60;sales&#x60;, &#x60;products&#x60;, &#x60;customers&#x60;. (required)
   * @param orderBy The attribute used to sort items returned in the response. (optional)
   * @param orderDirection Sorting direction. One of: &#x60;asc&#x60;, &#x60;desc&#x60;. (optional)
   * @param pageSize The maximum number of objects to be included in the response, currently limited to 10000. (optional)
   * @param offset The number of objects to be \&quot;skipped\&quot; for the response. Used for pagination. (optional)
   * @param id The &#x60;id&#x60; of the object to be included in the response. (optional)
   * @param id2 The &#x60;id&#x60; of the object to be excluded from the response. (optional)
   * @param deleted Indicated whether deleted objects should be included in the response. (optional)
   * @param status **SALES** Status of the sale to find. Can be used multiple times to search for objects with different values of this parameter. (optional)
   * @param invoiceNumber **SALES** Invoice number of the sale. (optional)
   * @param customerId **SALES** The &#x60;ID&#x60; of the customer associated with the sales. (optional)
   * @param userId **SALES** The &#x60;ID&#x60; of the user associated with the sales. (optional)
   * @param outletId **SALES** The &#x60;ID&#x60; of the outlet associated with the sales. (optional)
   * @param dateFrom **SALES** Lower limit for the sale date as UTC timestamp. Format: &#x60;2016-08-08T12:00:00Z&#x60;. (optional)
   * @param dateTo **SALES** Upper limit for the sale date as UTC timestamp. Format: &#x60;2016-08-08T12:00:00Z&#x60;. (optional)
   * @param sku **PRODUCTS** The SKU of products to include in the search. Can be used multiple times to search for objects with different values of this parameter. (optional)
   * @param sku2 **PRODUCTS** The SKU of products to exclude from the search. Can be used multiple times to search for objects with different values of this parameter. (optional)
   * @param supplierId **PRODUCTS** The ID of the supplier associated with the product to include in the search. Can be used multiple times to search for objects with different values of this parameter. (optional)
   * @param supplierId2 **PRODUCTS** The ID of the supplier associated with the product to exclude from the search. Can be used multiple times to search for objects with different values of this parameter. (optional)
   * @param brandId **PRODUCTS** The ID of the brand associated with the product to include in the search. Can be used multiple times to search for objects with different values of this parameter. (optional)
   * @param brandId2 **PRODUCTS** The ID of the brand associated with the product to exclude from the search. Can be used multiple times to search for objects with different values of this parameter. (optional)
   * @param tagId **PRODUCTS** The ID of the tag associated with the product to include in the search. Can be used multiple times to search for objects with different values of this parameter. (optional)
   * @param tagId2 **PRODUCTS** The ID of the brand associated with the product to exclude from the search. Can be used multiple times to search for objects with different values of this parameter. (optional)
   * @param productTypeId **PRODUCTS** The ID of the product type associated with the product to include in the search. Can be used multiple times to search for objects with different values of this parameter. (optional)
   * @param productTypeId2 **PRODUCTS** The ID of the product type associated with the product to exclude from the search. Can be used multiple times to search for objects with different values of this parameter. (optional)
   * @param variantParentId **PRODUCTS** The ID of the variant parent product associated with the product to include in the search. Can be used multiple times to search for objects with different values of this parameter. (optional)
   * @param variantParentId2 **PRODUCTS** The ID of the variant parent product associated with the product to exclude from the search. Can be used multiple times to search for objects with different values of this parameter. (optional)
   * @param customerCode **CUSTOMERS** The &#x60;customer_code&#x60; associated with the customer to find. (optional)
   * @param firstName **CUSTOMERS** The &#x60;first_name&#x60; for the customers to find. (optional)
   * @param lastName **CUSTOMERS** The &#x60;last_name&#x60; for the customers to find. (optional)
   * @param companyName **CUSTOMERS** The &#x60;company_name&#x60; for the customers to find. (optional)
   * @return SearchResponse
   * @throws ApiException if fails to make API call
   */
  public SearchResponse search(String type, String orderBy, String orderDirection, Integer pageSize, Integer offset, String id, String id2, Boolean deleted, String status, String invoiceNumber, String customerId, String userId, String outletId, String dateFrom, String dateTo, String sku, String sku2, String supplierId, String supplierId2, String brandId, String brandId2, String tagId, String tagId2, String productTypeId, String productTypeId2, String variantParentId, String variantParentId2, String customerCode, String firstName, String lastName, String companyName) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'type' is set
    if (type == null) {
      throw new ApiException(400, "Missing the required parameter 'type' when calling search");
    }
    
    // create path and map variables
    String localVarPath = "/search";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "type", type));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "order_by", orderBy));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "order_direction", orderDirection));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page_size", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_id", id));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "-_id", id2));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "deleted", deleted));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "status", status));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "invoice_number", invoiceNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "customer_id", customerId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "user_id", userId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "outlet_id", outletId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "date_from", dateFrom));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "date_to", dateTo));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sku", sku));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "-sku", sku2));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "supplier_id", supplierId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "-supplier_id", supplierId2));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "brand_id", brandId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "-brand_id", brandId2));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "tag_id", tagId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "-tag_id", tagId2));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "product_type_id", productTypeId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "-product_type_id", productTypeId2));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "variant_parent_id", variantParentId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "-variant_parent_id", variantParentId2));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "customer_code", customerCode));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "first_name", firstName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "last_name", lastName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "company_name", companyName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth", "personal_token" };

    GenericType<SearchResponse> localVarReturnType = new GenericType<SearchResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
