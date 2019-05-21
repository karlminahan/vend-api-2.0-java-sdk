
# Channel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Auto-generated object ID. | 
**storeUrl** | **String** | The store identifier. | 
**channelType** | [**ChannelTypeEnum**](#ChannelTypeEnum) | The type of channel this is. | 
**registerId** | **String** | The Vend register id that sales will be associated to. | 
**paymentTypeId** | **String** | The Vend payment type id that sale payments will be associated to. | 
**inventoryOutletIds** | **List&lt;String&gt;** | The Vend outlet ids that count towards inventory. | 
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) | An RFC3339 representation of the time at which the channel was created. |  [optional]
**salesLastImportedAt** | [**OffsetDateTime**](OffsetDateTime.md) | An RFC3339 representation of the time at which sales were last imported. | 
**productsLastImportedAt** | [**OffsetDateTime**](OffsetDateTime.md) | An RFC3339 representation of the time at which products were last imported. | 


<a name="ChannelTypeEnum"></a>
## Enum: ChannelTypeEnum
Name | Value
---- | -----
WOOCOMMERCE | &quot;woocommerce&quot;



