
# Product

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Product name. | 
**handle** | **String** | Product handle. **Note:** Variants share the same handle. | 
**sku** | **String** | Product sku. **Note:** Should be unique, but it&#39;s not verified while posting. | 
**id** | **String** | Auto-generated object ID. |  [optional]
**sourceId** | **String** | External reference ID. |  [optional]
**sourceVariantId** | **String** | Secondary external reference ID. |  [optional]
**variantParentId** | **String** | This value is set if a Product is a variant of another Product. |  [optional]
**source** | **String** | Indicates the origin of the product. Can be USER, SYSTEM, SHOPIFY. |  [optional]
**active** | **Boolean** | Indicated whether the Product is active. |  [optional]
**hasInventory** | **Boolean** | Indicates whether inventory is being tracked for the Product. |  [optional]
**isComposite** | **Boolean** | Indicates whether the Product is a composite one. |  [optional]
**hasVariants** | **Boolean** | Indicated whether product has variants. |  [optional]
**description** | **String** | A detailed description of the Product. **Note** Can contain HTML. |  [optional]
**supplierCode** | **String** | Supplier code. |  [optional]
**supplyPrice** | **Double** | Default supply price, |  [optional]
**type** | [**ProductTypeSample**](ProductTypeSample.md) |  |  [optional]
**supplier** | [**SupplierSample**](SupplierSample.md) |  |  [optional]
**brand** | [**BrandSample**](BrandSample.md) |  |  [optional]
**variantOptions** | [**List&lt;VariantOption&gt;**](VariantOption.md) | A list of variant option objects. |  [optional]
**categories** | [**List&lt;Tag&gt;**](Tag.md) | A list of tag objects. |  [optional]
**imageUrl** | **String** |  |  [optional]
**imageThumbnailUrl** | **String** |  |  [optional]
**images** | [**List&lt;ImageSample&gt;**](ImageSample.md) | A list of image objects. |  [optional]
**createdAt** | **String** | Creation timestamp in UTC. |  [optional]
**updatedAt** | **String** | Last update timestamp in UTC. |  [optional]
**deletedAt** | **String** | Deletion timestamp in UTC. |  [optional]
**version** | **Double** | Auto-incrementing object version number. |  [optional]



