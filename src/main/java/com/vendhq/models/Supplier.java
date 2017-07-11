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
 * Supplier
 */

public class Supplier {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("deleted_at")
  private String deletedAt = null;

  @JsonProperty("version")
  private Double version = null;

  public Supplier name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The Supplier name.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The Supplier name.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Supplier id(String id) {
    this.id = id;
    return this;
  }

   /**
   * 
   * @return id
  **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Supplier deletedAt(String deletedAt) {
    this.deletedAt = deletedAt;
    return this;
  }

   /**
   * 
   * @return deletedAt
  **/
  @ApiModelProperty(value = "")
  public String getDeletedAt() {
    return deletedAt;
  }

  public void setDeletedAt(String deletedAt) {
    this.deletedAt = deletedAt;
  }

  public Supplier version(Double version) {
    this.version = version;
    return this;
  }

   /**
   * Auto-incrementing object version number.
   * @return version
  **/
  @ApiModelProperty(value = "Auto-incrementing object version number.")
  public Double getVersion() {
    return version;
  }

  public void setVersion(Double version) {
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
    Supplier supplier = (Supplier) o;
    return Objects.equals(this.name, supplier.name) &&
        Objects.equals(this.id, supplier.id) &&
        Objects.equals(this.deletedAt, supplier.deletedAt) &&
        Objects.equals(this.version, supplier.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, id, deletedAt, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Supplier {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

