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
 * SupplierSample
 */

public class SupplierSample {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("deleted_at")
  private String deletedAt = null;

  @JsonProperty("version")
  private Long version = null;

  public SupplierSample id(String id) {
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

  public SupplierSample name(String name) {
    this.name = name;
    return this;
  }

   /**
   * 
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SupplierSample deletedAt(String deletedAt) {
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

  public SupplierSample version(Long version) {
    this.version = version;
    return this;
  }

   /**
   * Auto-incrementing object version number.
   * @return version
  **/
  @ApiModelProperty(value = "Auto-incrementing object version number.")
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
    SupplierSample supplierSample = (SupplierSample) o;
    return Objects.equals(this.id, supplierSample.id) &&
        Objects.equals(this.name, supplierSample.name) &&
        Objects.equals(this.deletedAt, supplierSample.deletedAt) &&
        Objects.equals(this.version, supplierSample.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, deletedAt, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SupplierSample {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
