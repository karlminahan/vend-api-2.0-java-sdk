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
 * On object containing URLs for different sizes of the user’s avatar.
 */
@ApiModel(description = "On object containing URLs for different sizes of the user’s avatar.")

public class UserImages {
  @JsonProperty("ss")
  private String ss = null;

  @JsonProperty("standard")
  private String standard = null;

  @JsonProperty("st")
  private String st = null;

  @JsonProperty("original")
  private String original = null;

  @JsonProperty("thumb")
  private String thumb = null;

  @JsonProperty("sl")
  private String sl = null;

  @JsonProperty("sm")
  private String sm = null;

  public UserImages ss(String ss) {
    this.ss = ss;
    return this;
  }

   /**
   * Get ss
   * @return ss
  **/
  @ApiModelProperty(value = "")
  public String getSs() {
    return ss;
  }

  public void setSs(String ss) {
    this.ss = ss;
  }

  public UserImages standard(String standard) {
    this.standard = standard;
    return this;
  }

   /**
   * Get standard
   * @return standard
  **/
  @ApiModelProperty(value = "")
  public String getStandard() {
    return standard;
  }

  public void setStandard(String standard) {
    this.standard = standard;
  }

  public UserImages st(String st) {
    this.st = st;
    return this;
  }

   /**
   * Get st
   * @return st
  **/
  @ApiModelProperty(value = "")
  public String getSt() {
    return st;
  }

  public void setSt(String st) {
    this.st = st;
  }

  public UserImages original(String original) {
    this.original = original;
    return this;
  }

   /**
   * Get original
   * @return original
  **/
  @ApiModelProperty(value = "")
  public String getOriginal() {
    return original;
  }

  public void setOriginal(String original) {
    this.original = original;
  }

  public UserImages thumb(String thumb) {
    this.thumb = thumb;
    return this;
  }

   /**
   * Get thumb
   * @return thumb
  **/
  @ApiModelProperty(value = "")
  public String getThumb() {
    return thumb;
  }

  public void setThumb(String thumb) {
    this.thumb = thumb;
  }

  public UserImages sl(String sl) {
    this.sl = sl;
    return this;
  }

   /**
   * Get sl
   * @return sl
  **/
  @ApiModelProperty(value = "")
  public String getSl() {
    return sl;
  }

  public void setSl(String sl) {
    this.sl = sl;
  }

  public UserImages sm(String sm) {
    this.sm = sm;
    return this;
  }

   /**
   * Get sm
   * @return sm
  **/
  @ApiModelProperty(value = "")
  public String getSm() {
    return sm;
  }

  public void setSm(String sm) {
    this.sm = sm;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserImages userImages = (UserImages) o;
    return Objects.equals(this.ss, userImages.ss) &&
        Objects.equals(this.standard, userImages.standard) &&
        Objects.equals(this.st, userImages.st) &&
        Objects.equals(this.original, userImages.original) &&
        Objects.equals(this.thumb, userImages.thumb) &&
        Objects.equals(this.sl, userImages.sl) &&
        Objects.equals(this.sm, userImages.sm);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ss, standard, st, original, thumb, sl, sm);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserImages {\n");
    
    sb.append("    ss: ").append(toIndentedString(ss)).append("\n");
    sb.append("    standard: ").append(toIndentedString(standard)).append("\n");
    sb.append("    st: ").append(toIndentedString(st)).append("\n");
    sb.append("    original: ").append(toIndentedString(original)).append("\n");
    sb.append("    thumb: ").append(toIndentedString(thumb)).append("\n");
    sb.append("    sl: ").append(toIndentedString(sl)).append("\n");
    sb.append("    sm: ").append(toIndentedString(sm)).append("\n");
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

