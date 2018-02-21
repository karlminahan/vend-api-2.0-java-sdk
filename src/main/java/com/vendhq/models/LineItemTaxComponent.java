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
 * LineItemTaxComponent
 */

public class LineItemTaxComponent {
  @JsonProperty("rate_id")
  private String rateId = null;

  @JsonProperty("total_tax")
  private Double totalTax = null;

  public LineItemTaxComponent rateId(String rateId) {
    this.rateId = rateId;
    return this;
  }

   /**
   * Tax rate ID.
   * @return rateId
  **/
  @ApiModelProperty(required = true, value = "Tax rate ID.")
  public String getRateId() {
    return rateId;
  }

  public void setRateId(String rateId) {
    this.rateId = rateId;
  }

  public LineItemTaxComponent totalTax(Double totalTax) {
    this.totalTax = totalTax;
    return this;
  }

   /**
   * Tax total.
   * @return totalTax
  **/
  @ApiModelProperty(required = true, value = "Tax total.")
  public Double getTotalTax() {
    return totalTax;
  }

  public void setTotalTax(Double totalTax) {
    this.totalTax = totalTax;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LineItemTaxComponent lineItemTaxComponent = (LineItemTaxComponent) o;
    return Objects.equals(this.rateId, lineItemTaxComponent.rateId) &&
        Objects.equals(this.totalTax, lineItemTaxComponent.totalTax);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rateId, totalTax);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LineItemTaxComponent {\n");
    
    sb.append("    rateId: ").append(toIndentedString(rateId)).append("\n");
    sb.append("    totalTax: ").append(toIndentedString(totalTax)).append("\n");
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

