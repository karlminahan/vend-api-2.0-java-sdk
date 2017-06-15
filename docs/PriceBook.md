
# PriceBook

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Price book name. | 
**customerGroupId** | **String** | The ID of the customer group | 
**id** | **String** | Auto-generated object ID. |  [optional]
**validFrom** | **String** | The date when the price book becomes valid (active). |  [optional]
**validTo** | **String** | The date when the price book becomes invalid (inactive). |  [optional]
**restrictToPlatformKey** | **String** | &#x60;\&quot;0\&quot;&#x60; - all platforms, &#x60;\&quot;1\&quot;&#x60; - in store, &#x60;\&quot;2\&quot;&#x60; - ecommerce. |  [optional]
**outletId** | **String** | The ID of an outlet for which the price book should be used.+ type: GENERAL (string) - Internal value. Safe to ignore. |  [optional]
**restrictToPlatformLabel** | **String** | One of &#x60;In Store&#x60;, &#x60;Ecommerce&#x60;, &#x60;All Platforms&#x60;. |  [optional]
**customerGroup** | [**CustomerGroup**](CustomerGroup.md) |  |  [optional]
**version** | **Double** | Auto-incrementing object version number. |  [optional]
**deletedAt** | **String** | Deletion timestamp in UTC. |  [optional]



