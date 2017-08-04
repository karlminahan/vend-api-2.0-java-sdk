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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * PriceBookProduct
 */

public class PriceBookProduct {
  @JsonProperty("product_id")
  private String productId = null;

  @JsonProperty("price_book_id")
  private String priceBookId = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("price")
  private Double price = null;

  @JsonProperty("loyalty_value")
  private Double loyaltyValue = null;

  @JsonProperty("min_units")
  private Double minUnits = null;

  @JsonProperty("max_units")
  private Double maxUnits = null;

  @JsonProperty("created_at")
  private String createdAt = null;

  @JsonProperty("updated_at")
  private String updatedAt = null;

  @JsonProperty("deleted_at")
  private String deletedAt = null;

  public PriceBookProduct productId(String productId) {
    this.productId = productId;
    return this;
  }

   /**
   * The ID of the associated product.
   * @return productId
  **/
  @ApiModelProperty(required = true, value = "The ID of the associated product.")
  public String getProductId() {
    return productId;
  }

  public void setProductId(String productId) {
    this.productId = productId;
  }

  public PriceBookProduct priceBookId(String priceBookId) {
    this.priceBookId = priceBookId;
    return this;
  }

   /**
   * The ID of the price book this product belongs to.
   * @return priceBookId
  **/
  @ApiModelProperty(required = true, value = "The ID of the price book this product belongs to.")
  public String getPriceBookId() {
    return priceBookId;
  }

  public void setPriceBookId(String priceBookId) {
    this.priceBookId = priceBookId;
  }

  public PriceBookProduct id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Auto-generated object ID.
   * @return id
  **/
  @ApiModelProperty(value = "Auto-generated object ID.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public PriceBookProduct price(Double price) {
    this.price = price;
    return this;
  }

   /**
   * Retail price.
   * @return price
  **/
  @ApiModelProperty(value = "Retail price.")
  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public PriceBookProduct loyaltyValue(Double loyaltyValue) {
    this.loyaltyValue = loyaltyValue;
    return this;
  }

   /**
   * Price book defined loyalty value.
   * @return loyaltyValue
  **/
  @ApiModelProperty(value = "Price book defined loyalty value.")
  public Double getLoyaltyValue() {
    return loyaltyValue;
  }

  public void setLoyaltyValue(Double loyaltyValue) {
    this.loyaltyValue = loyaltyValue;
  }

  public PriceBookProduct minUnits(Double minUnits) {
    this.minUnits = minUnits;
    return this;
  }

   /**
   * The minimum number of items for which this price will be used.
   * @return minUnits
  **/
  @ApiModelProperty(value = "The minimum number of items for which this price will be used.")
  public Double getMinUnits() {
    return minUnits;
  }

  public void setMinUnits(Double minUnits) {
    this.minUnits = minUnits;
  }

  public PriceBookProduct maxUnits(Double maxUnits) {
    this.maxUnits = maxUnits;
    return this;
  }

   /**
   * The maximum number of items for which this price will be used.
   * @return maxUnits
  **/
  @ApiModelProperty(value = "The maximum number of items for which this price will be used.")
  public Double getMaxUnits() {
    return maxUnits;
  }

  public void setMaxUnits(Double maxUnits) {
    this.maxUnits = maxUnits;
  }

  public PriceBookProduct createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Creation timestamp in UTC.
   * @return createdAt
  **/
  @ApiModelProperty(value = "Creation timestamp in UTC.")
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public PriceBookProduct updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Last update timestamp in UTC.
   * @return updatedAt
  **/
  @ApiModelProperty(value = "Last update timestamp in UTC.")
  public String getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }

  public PriceBookProduct deletedAt(String deletedAt) {
    this.deletedAt = deletedAt;
    return this;
  }

   /**
   * Deletion timestamp in UTC.
   * @return deletedAt
  **/
  @ApiModelProperty(value = "Deletion timestamp in UTC.")
  public String getDeletedAt() {
    return deletedAt;
  }

  public void setDeletedAt(String deletedAt) {
    this.deletedAt = deletedAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PriceBookProduct priceBookProduct = (PriceBookProduct) o;
    return Objects.equals(this.productId, priceBookProduct.productId) &&
        Objects.equals(this.priceBookId, priceBookProduct.priceBookId) &&
        Objects.equals(this.id, priceBookProduct.id) &&
        Objects.equals(this.price, priceBookProduct.price) &&
        Objects.equals(this.loyaltyValue, priceBookProduct.loyaltyValue) &&
        Objects.equals(this.minUnits, priceBookProduct.minUnits) &&
        Objects.equals(this.maxUnits, priceBookProduct.maxUnits) &&
        Objects.equals(this.createdAt, priceBookProduct.createdAt) &&
        Objects.equals(this.updatedAt, priceBookProduct.updatedAt) &&
        Objects.equals(this.deletedAt, priceBookProduct.deletedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productId, priceBookId, id, price, loyaltyValue, minUnits, maxUnits, createdAt, updatedAt, deletedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PriceBookProduct {\n");
    
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    priceBookId: ").append(toIndentedString(priceBookId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    loyaltyValue: ").append(toIndentedString(loyaltyValue)).append("\n");
    sb.append("    minUnits: ").append(toIndentedString(minUnits)).append("\n");
    sb.append("    maxUnits: ").append(toIndentedString(maxUnits)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    deletedAt: ").append(toIndentedString(deletedAt)).append("\n");
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

