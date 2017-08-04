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
import com.vendhq.models.Tag;
import com.vendhq.models.Version;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * TagCollection
 */

public class TagCollection {
  @JsonProperty("data")
  private List<Tag> data = null;

  @JsonProperty("version")
  private Version version = null;

  public TagCollection data(List<Tag> data) {
    this.data = data;
    return this;
  }

  public TagCollection addDataItem(Tag dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<Tag>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * An array of Tag objects.
   * @return data
  **/
  @ApiModelProperty(value = "An array of Tag objects.")
  public List<Tag> getData() {
    return data;
  }

  public void setData(List<Tag> data) {
    this.data = data;
  }

  public TagCollection version(Version version) {
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
    TagCollection tagCollection = (TagCollection) o;
    return Objects.equals(this.data, tagCollection.data) &&
        Objects.equals(this.version, tagCollection.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TagCollection {\n");
    
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

