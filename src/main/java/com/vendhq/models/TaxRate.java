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
 * TaxRate
 */

public class TaxRate {
  @JsonProperty("id")
  private UUID id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("rate")
  private Double rate = null;

  @JsonProperty("display_name")
  private String displayName = null;

  public TaxRate id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * Auto-generated object ID.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Auto-generated object ID.")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public TaxRate name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the tax rate.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of the tax rate.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TaxRate rate(Double rate) {
    this.rate = rate;
    return this;
  }

   /**
   * Tax rate value. &#x60;0.1 &#x3D; 10%&#x60;.
   * @return rate
  **/
  @ApiModelProperty(required = true, value = "Tax rate value. `0.1 = 10%`.")
  public Double getRate() {
    return rate;
  }

  public void setRate(Double rate) {
    this.rate = rate;
  }

  public TaxRate displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * The name of the tax rate used for display.
   * @return displayName
  **/
  @ApiModelProperty(required = true, value = "The name of the tax rate used for display.")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaxRate taxRate = (TaxRate) o;
    return Objects.equals(this.id, taxRate.id) &&
        Objects.equals(this.name, taxRate.name) &&
        Objects.equals(this.rate, taxRate.rate) &&
        Objects.equals(this.displayName, taxRate.displayName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, rate, displayName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaxRate {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
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

