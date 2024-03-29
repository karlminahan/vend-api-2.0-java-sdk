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
import com.vendhq.models.BrandSample;
import com.vendhq.models.ImageSample;
import com.vendhq.models.ProductTypeSample;
import com.vendhq.models.SupplierSample;
import com.vendhq.models.Tag;
import com.vendhq.models.VariantOption;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * Product
 */

public class Product {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("handle")
  private String handle = null;

  @JsonProperty("sku")
  private String sku = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("source_id")
  private String sourceId = null;

  @JsonProperty("source_variant_id")
  private String sourceVariantId = null;

  @JsonProperty("variant_parent_id")
  private String variantParentId = null;

  @JsonProperty("source")
  private String source = null;

  @JsonProperty("active")
  private Boolean active = null;

  @JsonProperty("has_inventory")
  private Boolean hasInventory = null;

  @JsonProperty("is_composite")
  private Boolean isComposite = null;

  @JsonProperty("has_variants")
  private Boolean hasVariants = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("supplier_code")
  private String supplierCode = null;

  @JsonProperty("supply_price")
  private Double supplyPrice = null;

  @JsonProperty("type")
  private ProductTypeSample type = null;

  @JsonProperty("supplier")
  private SupplierSample supplier = null;

  @JsonProperty("brand")
  private BrandSample brand = null;

  @JsonProperty("variant_options")
  private List<VariantOption> variantOptions = null;

  @JsonProperty("categories")
  private List<Tag> categories = null;

  @JsonProperty("image_url")
  private String imageUrl = null;

  @JsonProperty("image_thumbnail_url")
  private String imageThumbnailUrl = null;

  @JsonProperty("images")
  private List<ImageSample> images = null;

  @JsonProperty("created_at")
  private String createdAt = null;

  @JsonProperty("updated_at")
  private String updatedAt = null;

  @JsonProperty("deleted_at")
  private String deletedAt = null;

  @JsonProperty("version")
  private Long version = null;

  public Product name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Product name.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Product name.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Product handle(String handle) {
    this.handle = handle;
    return this;
  }

   /**
   * Product handle. **Note:** Variants share the same handle.
   * @return handle
  **/
  @ApiModelProperty(required = true, value = "Product handle. **Note:** Variants share the same handle.")
  public String getHandle() {
    return handle;
  }

  public void setHandle(String handle) {
    this.handle = handle;
  }

  public Product sku(String sku) {
    this.sku = sku;
    return this;
  }

   /**
   * Product sku. **Note:** Should be unique, but it&#39;s not verified while posting.
   * @return sku
  **/
  @ApiModelProperty(required = true, value = "Product sku. **Note:** Should be unique, but it's not verified while posting.")
  public String getSku() {
    return sku;
  }

  public void setSku(String sku) {
    this.sku = sku;
  }

  public Product id(String id) {
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

  public Product sourceId(String sourceId) {
    this.sourceId = sourceId;
    return this;
  }

   /**
   * External reference ID.
   * @return sourceId
  **/
  @ApiModelProperty(value = "External reference ID.")
  public String getSourceId() {
    return sourceId;
  }

  public void setSourceId(String sourceId) {
    this.sourceId = sourceId;
  }

  public Product sourceVariantId(String sourceVariantId) {
    this.sourceVariantId = sourceVariantId;
    return this;
  }

   /**
   * Secondary external reference ID.
   * @return sourceVariantId
  **/
  @ApiModelProperty(value = "Secondary external reference ID.")
  public String getSourceVariantId() {
    return sourceVariantId;
  }

  public void setSourceVariantId(String sourceVariantId) {
    this.sourceVariantId = sourceVariantId;
  }

  public Product variantParentId(String variantParentId) {
    this.variantParentId = variantParentId;
    return this;
  }

   /**
   * This value is set if a Product is a variant of another Product.
   * @return variantParentId
  **/
  @ApiModelProperty(value = "This value is set if a Product is a variant of another Product.")
  public String getVariantParentId() {
    return variantParentId;
  }

  public void setVariantParentId(String variantParentId) {
    this.variantParentId = variantParentId;
  }

  public Product source(String source) {
    this.source = source;
    return this;
  }

   /**
   * Indicates the origin of the product. Can be USER, SYSTEM, SHOPIFY.
   * @return source
  **/
  @ApiModelProperty(value = "Indicates the origin of the product. Can be USER, SYSTEM, SHOPIFY.")
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public Product active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Indicated whether the Product is active.
   * @return active
  **/
  @ApiModelProperty(value = "Indicated whether the Product is active.")
  public Boolean isActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public Product hasInventory(Boolean hasInventory) {
    this.hasInventory = hasInventory;
    return this;
  }

   /**
   * Indicates whether inventory is being tracked for the Product.
   * @return hasInventory
  **/
  @ApiModelProperty(value = "Indicates whether inventory is being tracked for the Product.")
  public Boolean isHasInventory() {
    return hasInventory;
  }

  public void setHasInventory(Boolean hasInventory) {
    this.hasInventory = hasInventory;
  }

  public Product isComposite(Boolean isComposite) {
    this.isComposite = isComposite;
    return this;
  }

   /**
   * Indicates whether the Product is a composite one.
   * @return isComposite
  **/
  @ApiModelProperty(value = "Indicates whether the Product is a composite one.")
  public Boolean isIsComposite() {
    return isComposite;
  }

  public void setIsComposite(Boolean isComposite) {
    this.isComposite = isComposite;
  }

  public Product hasVariants(Boolean hasVariants) {
    this.hasVariants = hasVariants;
    return this;
  }

   /**
   * Indicated whether product has variants.
   * @return hasVariants
  **/
  @ApiModelProperty(value = "Indicated whether product has variants.")
  public Boolean isHasVariants() {
    return hasVariants;
  }

  public void setHasVariants(Boolean hasVariants) {
    this.hasVariants = hasVariants;
  }

  public Product description(String description) {
    this.description = description;
    return this;
  }

   /**
   * A detailed description of the Product. **Note** Can contain HTML.
   * @return description
  **/
  @ApiModelProperty(value = "A detailed description of the Product. **Note** Can contain HTML.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Product supplierCode(String supplierCode) {
    this.supplierCode = supplierCode;
    return this;
  }

   /**
   * Supplier code.
   * @return supplierCode
  **/
  @ApiModelProperty(value = "Supplier code.")
  public String getSupplierCode() {
    return supplierCode;
  }

  public void setSupplierCode(String supplierCode) {
    this.supplierCode = supplierCode;
  }

  public Product supplyPrice(Double supplyPrice) {
    this.supplyPrice = supplyPrice;
    return this;
  }

   /**
   * Default supply price,
   * @return supplyPrice
  **/
  @ApiModelProperty(value = "Default supply price,")
  public Double getSupplyPrice() {
    return supplyPrice;
  }

  public void setSupplyPrice(Double supplyPrice) {
    this.supplyPrice = supplyPrice;
  }

  public Product type(ProductTypeSample type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public ProductTypeSample getType() {
    return type;
  }

  public void setType(ProductTypeSample type) {
    this.type = type;
  }

  public Product supplier(SupplierSample supplier) {
    this.supplier = supplier;
    return this;
  }

   /**
   * Get supplier
   * @return supplier
  **/
  @ApiModelProperty(value = "")
  public SupplierSample getSupplier() {
    return supplier;
  }

  public void setSupplier(SupplierSample supplier) {
    this.supplier = supplier;
  }

  public Product brand(BrandSample brand) {
    this.brand = brand;
    return this;
  }

   /**
   * Get brand
   * @return brand
  **/
  @ApiModelProperty(value = "")
  public BrandSample getBrand() {
    return brand;
  }

  public void setBrand(BrandSample brand) {
    this.brand = brand;
  }

  public Product variantOptions(List<VariantOption> variantOptions) {
    this.variantOptions = variantOptions;
    return this;
  }

  public Product addVariantOptionsItem(VariantOption variantOptionsItem) {
    if (this.variantOptions == null) {
      this.variantOptions = new ArrayList<>();
    }
    this.variantOptions.add(variantOptionsItem);
    return this;
  }

   /**
   * A list of variant option objects.
   * @return variantOptions
  **/
  @ApiModelProperty(value = "A list of variant option objects.")
  public List<VariantOption> getVariantOptions() {
    return variantOptions;
  }

  public void setVariantOptions(List<VariantOption> variantOptions) {
    this.variantOptions = variantOptions;
  }

  public Product categories(List<Tag> categories) {
    this.categories = categories;
    return this;
  }

  public Product addCategoriesItem(Tag categoriesItem) {
    if (this.categories == null) {
      this.categories = new ArrayList<>();
    }
    this.categories.add(categoriesItem);
    return this;
  }

   /**
   * A list of tag objects.
   * @return categories
  **/
  @ApiModelProperty(value = "A list of tag objects.")
  public List<Tag> getCategories() {
    return categories;
  }

  public void setCategories(List<Tag> categories) {
    this.categories = categories;
  }

  public Product imageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

   /**
   * 
   * @return imageUrl
  **/
  @ApiModelProperty(value = "")
  public String getImageUrl() {
    return imageUrl;
  }

  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }

  public Product imageThumbnailUrl(String imageThumbnailUrl) {
    this.imageThumbnailUrl = imageThumbnailUrl;
    return this;
  }

   /**
   * 
   * @return imageThumbnailUrl
  **/
  @ApiModelProperty(value = "")
  public String getImageThumbnailUrl() {
    return imageThumbnailUrl;
  }

  public void setImageThumbnailUrl(String imageThumbnailUrl) {
    this.imageThumbnailUrl = imageThumbnailUrl;
  }

  public Product images(List<ImageSample> images) {
    this.images = images;
    return this;
  }

  public Product addImagesItem(ImageSample imagesItem) {
    if (this.images == null) {
      this.images = new ArrayList<>();
    }
    this.images.add(imagesItem);
    return this;
  }

   /**
   * A list of image objects.
   * @return images
  **/
  @ApiModelProperty(value = "A list of image objects.")
  public List<ImageSample> getImages() {
    return images;
  }

  public void setImages(List<ImageSample> images) {
    this.images = images;
  }

  public Product createdAt(String createdAt) {
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

  public Product updatedAt(String updatedAt) {
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

  public Product deletedAt(String deletedAt) {
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

  public Product version(Long version) {
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
    Product product = (Product) o;
    return Objects.equals(this.name, product.name) &&
        Objects.equals(this.handle, product.handle) &&
        Objects.equals(this.sku, product.sku) &&
        Objects.equals(this.id, product.id) &&
        Objects.equals(this.sourceId, product.sourceId) &&
        Objects.equals(this.sourceVariantId, product.sourceVariantId) &&
        Objects.equals(this.variantParentId, product.variantParentId) &&
        Objects.equals(this.source, product.source) &&
        Objects.equals(this.active, product.active) &&
        Objects.equals(this.hasInventory, product.hasInventory) &&
        Objects.equals(this.isComposite, product.isComposite) &&
        Objects.equals(this.hasVariants, product.hasVariants) &&
        Objects.equals(this.description, product.description) &&
        Objects.equals(this.supplierCode, product.supplierCode) &&
        Objects.equals(this.supplyPrice, product.supplyPrice) &&
        Objects.equals(this.type, product.type) &&
        Objects.equals(this.supplier, product.supplier) &&
        Objects.equals(this.brand, product.brand) &&
        Objects.equals(this.variantOptions, product.variantOptions) &&
        Objects.equals(this.categories, product.categories) &&
        Objects.equals(this.imageUrl, product.imageUrl) &&
        Objects.equals(this.imageThumbnailUrl, product.imageThumbnailUrl) &&
        Objects.equals(this.images, product.images) &&
        Objects.equals(this.createdAt, product.createdAt) &&
        Objects.equals(this.updatedAt, product.updatedAt) &&
        Objects.equals(this.deletedAt, product.deletedAt) &&
        Objects.equals(this.version, product.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, handle, sku, id, sourceId, sourceVariantId, variantParentId, source, active, hasInventory, isComposite, hasVariants, description, supplierCode, supplyPrice, type, supplier, brand, variantOptions, categories, imageUrl, imageThumbnailUrl, images, createdAt, updatedAt, deletedAt, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Product {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    handle: ").append(toIndentedString(handle)).append("\n");
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
    sb.append("    sourceVariantId: ").append(toIndentedString(sourceVariantId)).append("\n");
    sb.append("    variantParentId: ").append(toIndentedString(variantParentId)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    hasInventory: ").append(toIndentedString(hasInventory)).append("\n");
    sb.append("    isComposite: ").append(toIndentedString(isComposite)).append("\n");
    sb.append("    hasVariants: ").append(toIndentedString(hasVariants)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    supplierCode: ").append(toIndentedString(supplierCode)).append("\n");
    sb.append("    supplyPrice: ").append(toIndentedString(supplyPrice)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    supplier: ").append(toIndentedString(supplier)).append("\n");
    sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
    sb.append("    variantOptions: ").append(toIndentedString(variantOptions)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    imageThumbnailUrl: ").append(toIndentedString(imageThumbnailUrl)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
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

