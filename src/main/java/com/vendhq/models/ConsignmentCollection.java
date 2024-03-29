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
import com.vendhq.models.Consignment;
import com.vendhq.models.Version;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * ConsignmentCollection
 */

public class ConsignmentCollection {
  @JsonProperty("data")
  private List<Consignment> data = null;

  @JsonProperty("version")
  private Version version = null;

  public ConsignmentCollection data(List<Consignment> data) {
    this.data = data;
    return this;
  }

  public ConsignmentCollection addDataItem(Consignment dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * An array of consignment objects wrapped in a top level &#x60;data&#x60; object.
   * @return data
  **/
  @ApiModelProperty(value = "An array of consignment objects wrapped in a top level `data` object.")
  public List<Consignment> getData() {
    return data;
  }

  public void setData(List<Consignment> data) {
    this.data = data;
  }

  public ConsignmentCollection version(Version version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @ApiModelProperty(value = "")
  public Version getVersion() {
    return version;
  }

  public void setVersion(Version version) {
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
    ConsignmentCollection consignmentCollection = (ConsignmentCollection) o;
    return Objects.equals(this.data, consignmentCollection.data) &&
        Objects.equals(this.version, consignmentCollection.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsignmentCollection {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

