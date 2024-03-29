/*
 * API 2.0
 * Early release of version 2.0 of the Vend API.
 *
 * OpenAPI spec version: 2.0
 * Contact: api@vendhq.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.vendhq.models;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * InventoryCountItemRequest
 */

public class InventoryCountItemRequest {
  @JsonProperty("product_id")
  private String productId = null;

  @JsonProperty("received")
  private String received = null;

  public InventoryCountItemRequest productId(String productId) {
    this.productId = productId;
    return this;
  }

   /**
   * The ID of the product for which the count should be adjusted.
   * @return productId
  **/
  @ApiModelProperty(required = true, value = "The ID of the product for which the count should be adjusted.")
  public String getProductId() {
    return productId;
  }

  public void setProductId(String productId) {
    this.productId = productId;
  }

  public InventoryCountItemRequest received(String received) {
    this.received = received;
    return this;
  }

   /**
   * The adjustment value
   * @return received
  **/
  @ApiModelProperty(required = true, value = "The adjustment value")
  public String getReceived() {
    return received;
  }

  public void setReceived(String received) {
    this.received = received;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InventoryCountItemRequest inventoryCountItemRequest = (InventoryCountItemRequest) o;
    return Objects.equals(this.productId, inventoryCountItemRequest.productId) &&
        Objects.equals(this.received, inventoryCountItemRequest.received);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productId, received);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InventoryCountItemRequest {\n");
    
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    received: ").append(toIndentedString(received)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

