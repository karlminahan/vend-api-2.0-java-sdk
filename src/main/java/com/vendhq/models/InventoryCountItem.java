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
import java.util.UUID;

/**
 * InventoryCountItem
 */

public class InventoryCountItem {
  @JsonProperty("product_id")
  private UUID productId = null;

  @JsonProperty("product_sku")
  private String productSku = null;

  @JsonProperty("count")
  private String count = null;

  @JsonProperty("received")
  private String received = null;

  @JsonProperty("cost")
  private String cost = null;

  @JsonProperty("is_included")
  private Boolean isIncluded = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("created_at")
  private String createdAt = null;

  @JsonProperty("updated_at")
  private String updatedAt = null;

  @JsonProperty("deleted_at")
  private String deletedAt = null;

  @JsonProperty("version")
  private Long version = null;

  public InventoryCountItem productId(UUID productId) {
    this.productId = productId;
    return this;
  }

   /**
   * The ID of the product associated with this count item.
   * @return productId
  **/
  @ApiModelProperty(required = true, value = "The ID of the product associated with this count item.")
  public UUID getProductId() {
    return productId;
  }

  public void setProductId(UUID productId) {
    this.productId = productId;
  }

  public InventoryCountItem productSku(String productSku) {
    this.productSku = productSku;
    return this;
  }

   /**
   * Get productSku
   * @return productSku
  **/
  @ApiModelProperty(value = "")
  public String getProductSku() {
    return productSku;
  }

  public void setProductSku(String productSku) {
    this.productSku = productSku;
  }

  public InventoryCountItem count(String count) {
    this.count = count;
    return this;
  }

   /**
   * Expected item count.
   * @return count
  **/
  @ApiModelProperty(required = true, value = "Expected item count.")
  public String getCount() {
    return count;
  }

  public void setCount(String count) {
    this.count = count;
  }

  public InventoryCountItem received(String received) {
    this.received = received;
    return this;
  }

   /**
   * Observed item count.
   * @return received
  **/
  @ApiModelProperty(required = true, value = "Observed item count.")
  public String getReceived() {
    return received;
  }

  public void setReceived(String received) {
    this.received = received;
  }

  public InventoryCountItem cost(String cost) {
    this.cost = cost;
    return this;
  }

   /**
   * The cost of the item.
   * @return cost
  **/
  @ApiModelProperty(required = true, value = "The cost of the item.")
  public String getCost() {
    return cost;
  }

  public void setCost(String cost) {
    this.cost = cost;
  }

  public InventoryCountItem isIncluded(Boolean isIncluded) {
    this.isIncluded = isIncluded;
    return this;
  }

   /**
   * Indicated whether the item was included via a filter. Can be &#x60;null&#x60;. For full count (no filters) always &#x60;true&#x60;.
   * @return isIncluded
  **/
  @ApiModelProperty(value = "Indicated whether the item was included via a filter. Can be `null`. For full count (no filters) always `true`.")
  public Boolean isIsIncluded() {
    return isIncluded;
  }

  public void setIsIncluded(Boolean isIncluded) {
    this.isIncluded = isIncluded;
  }

  public InventoryCountItem status(String status) {
    this.status = status;
    return this;
  }

   /**
   * The status of the item. One of: &#x60;PENDING&#x60;, &#x60;SUCCESS&#x60;.
   * @return status
  **/
  @ApiModelProperty(required = true, value = "The status of the item. One of: `PENDING`, `SUCCESS`.")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public InventoryCountItem createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The creation timestamp in UTC.
   * @return createdAt
  **/
  @ApiModelProperty(required = true, value = "The creation timestamp in UTC.")
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public InventoryCountItem updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Last update timestamp in UTC.
   * @return updatedAt
  **/
  @ApiModelProperty(required = true, value = "Last update timestamp in UTC.")
  public String getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }

  public InventoryCountItem deletedAt(String deletedAt) {
    this.deletedAt = deletedAt;
    return this;
  }

   /**
   * The deletion timestamp in UTC.
   * @return deletedAt
  **/
  @ApiModelProperty(required = true, value = "The deletion timestamp in UTC.")
  public String getDeletedAt() {
    return deletedAt;
  }

  public void setDeletedAt(String deletedAt) {
    this.deletedAt = deletedAt;
  }

  public InventoryCountItem version(Long version) {
    this.version = version;
    return this;
  }

   /**
   * Auto-incrementing object version number.
   * @return version
  **/
  @ApiModelProperty(required = true, value = "Auto-incrementing object version number.")
  public Long getVersion() {
    return version;
  }

  public void setVersion(Long version) {
    this.version = version;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InventoryCountItem inventoryCountItem = (InventoryCountItem) o;
    return Objects.equals(this.productId, inventoryCountItem.productId) &&
        Objects.equals(this.productSku, inventoryCountItem.productSku) &&
        Objects.equals(this.count, inventoryCountItem.count) &&
        Objects.equals(this.received, inventoryCountItem.received) &&
        Objects.equals(this.cost, inventoryCountItem.cost) &&
        Objects.equals(this.isIncluded, inventoryCountItem.isIncluded) &&
        Objects.equals(this.status, inventoryCountItem.status) &&
        Objects.equals(this.createdAt, inventoryCountItem.createdAt) &&
        Objects.equals(this.updatedAt, inventoryCountItem.updatedAt) &&
        Objects.equals(this.deletedAt, inventoryCountItem.deletedAt) &&
        Objects.equals(this.version, inventoryCountItem.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productId, productSku, count, received, cost, isIncluded, status, createdAt, updatedAt, deletedAt, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InventoryCountItem {\n");
    
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    productSku: ").append(toIndentedString(productSku)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    received: ").append(toIndentedString(received)).append("\n");
    sb.append("    cost: ").append(toIndentedString(cost)).append("\n");
    sb.append("    isIncluded: ").append(toIndentedString(isIncluded)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    deletedAt: ").append(toIndentedString(deletedAt)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
