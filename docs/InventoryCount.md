
# InventoryCount

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**outletId** | [**UUID**](UUID.md) | The ID of the outlet in which the count is taking place. | 
**dueAt** | **String** | The date for which the count is scheduled. |  [optional]
**showInactive** | **Boolean** | Indicates whether inactive products should be included in the count. |  [optional]
**name** | **String** | The name of the inventory count | 
**status** | **String** | The status of the inventory count. One of: &#x60;STOCKTAKE_SCHEDULED&#x60;, &#x60;STOCKTAKE_IN_PROGRESS&#x60;, &#x60;STOCKTAKE_IN_PROGRESS_PROCESSED&#x60;, &#x60;STOCKTAKE_COMPLETE&#x60;. | 
**filters** | [**List&lt;InventoryCountFilter&gt;**](InventoryCountFilter.md) | An array of filter objects. Max 25. |  [optional]
**type** | **String** | Consignment type, for inventory counts always &#x60;STOCKTAKE&#x60; | 



