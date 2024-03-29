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
 * PriceBookBase
 */

public class PriceBookBase {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("customer_group_id")
  private String customerGroupId = null;

  @JsonProperty("valid_from")
  private String validFrom = null;

  @JsonProperty("valid_to")
  private String validTo = null;

  @JsonProperty("restrict_to_platform_key")
  private String restrictToPlatformKey = null;

  @JsonProperty("outlet_id")
  private String outletId = null;

  public PriceBookBase name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Price book name.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Price book name.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PriceBookBase customerGroupId(String customerGroupId) {
    this.customerGroupId = customerGroupId;
    return this;
  }

   /**
   * The ID of the customer group
   * @return customerGroupId
  **/
  @ApiModelProperty(required = true, value = "The ID of the customer group")
  public String getCustomerGroupId() {
    return customerGroupId;
  }

  public void setCustomerGroupId(String customerGroupId) {
    this.customerGroupId = customerGroupId;
  }

  public PriceBookBase validFrom(String validFrom) {
    this.validFrom = validFrom;
    return this;
  }

   /**
   * The date when the price book becomes valid (active).
   * @return validFrom
  **/
  @ApiModelProperty(value = "The date when the price book becomes valid (active).")
  public String getValidFrom() {
    return validFrom;
  }

  public void setValidFrom(String validFrom) {
    this.validFrom = validFrom;
  }

  public PriceBookBase validTo(String validTo) {
    this.validTo = validTo;
    return this;
  }

   /**
   * The date when the price book becomes invalid (inactive).
   * @return validTo
  **/
  @ApiModelProperty(value = "The date when the price book becomes invalid (inactive).")
  public String getValidTo() {
    return validTo;
  }

  public void setValidTo(String validTo) {
    this.validTo = validTo;
  }

  public PriceBookBase restrictToPlatformKey(String restrictToPlatformKey) {
    this.restrictToPlatformKey = restrictToPlatformKey;
    return this;
  }

   /**
   * &#x60;\&quot;0\&quot;&#x60; - all platforms, &#x60;\&quot;1\&quot;&#x60; - in store, &#x60;\&quot;2\&quot;&#x60; - ecommerce.
   * @return restrictToPlatformKey
  **/
  @ApiModelProperty(value = "`\"0\"` - all platforms, `\"1\"` - in store, `\"2\"` - ecommerce.")
  public String getRestrictToPlatformKey() {
    return restrictToPlatformKey;
  }

  public void setRestrictToPlatformKey(String restrictToPlatformKey) {
    this.restrictToPlatformKey = restrictToPlatformKey;
  }

  public PriceBookBase outletId(String outletId) {
    this.outletId = outletId;
    return this;
  }

   /**
   * The ID of an outlet for which the price book should be used.
   * @return outletId
  **/
  @ApiModelProperty(value = "The ID of an outlet for which the price book should be used.")
  public String getOutletId() {
    return outletId;
  }

  public void setOutletId(String outletId) {
    this.outletId = outletId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PriceBookBase priceBookBase = (PriceBookBase) o;
    return Objects.equals(this.name, priceBookBase.name) &&
        Objects.equals(this.customerGroupId, priceBookBase.customerGroupId) &&
        Objects.equals(this.validFrom, priceBookBase.validFrom) &&
        Objects.equals(this.validTo, priceBookBase.validTo) &&
        Objects.equals(this.restrictToPlatformKey, priceBookBase.restrictToPlatformKey) &&
        Objects.equals(this.outletId, priceBookBase.outletId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, customerGroupId, validFrom, validTo, restrictToPlatformKey, outletId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PriceBookBase {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    customerGroupId: ").append(toIndentedString(customerGroupId)).append("\n");
    sb.append("    validFrom: ").append(toIndentedString(validFrom)).append("\n");
    sb.append("    validTo: ").append(toIndentedString(validTo)).append("\n");
    sb.append("    restrictToPlatformKey: ").append(toIndentedString(restrictToPlatformKey)).append("\n");
    sb.append("    outletId: ").append(toIndentedString(outletId)).append("\n");
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

