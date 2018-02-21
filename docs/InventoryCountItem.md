
# InventoryCountItem

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**productId** | [**UUID**](UUID.md) | The ID of the product associated with this count item. | 
**productSku** | **String** |  |  [optional]
**count** | **String** | Expected item count. | 
**received** | **String** | Observed item count. | 
**cost** | **String** | The cost of the item. | 
**isIncluded** | **Boolean** | Indicated whether the item was included via a filter. Can be &#x60;null&#x60;. For full count (no filters) always &#x60;true&#x60;. |  [optional]
**status** | **String** | The status of the item. One of: &#x60;PENDING&#x60;, &#x60;SUCCESS&#x60;. | 
**createdAt** | **String** | The creation timestamp in UTC. | 
**updatedAt** | **String** | Last update timestamp in UTC. | 
**deletedAt** | **String** | The deletion timestamp in UTC. | 
**version** | **Long** | Auto-incrementing object version number. | 



