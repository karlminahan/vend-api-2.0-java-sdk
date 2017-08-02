
# Consignment

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Auto-generated object ID. |  [optional]
**outletId** | **String** | A valid ID of an outlet where stock will be received. |  [optional]
**name** | **String** | Tue 29 Nov 2016 (string) - Consignment name. |  [optional]
**consignmentDate** | **String** | 11-28T19:02:15+00:00 (timestamp) - Consignment creation date. |  [optional]
**dueAt** | **String** | 11-30T19:08:541+00:00 (timestamp) - Due date. |  [optional]
**receivedAt** | **String** | 11-30T19:08:541+00:00 (timestamp) - The date when consignment was received. |  [optional]
**type** | **String** | One of &#x60;SUPPLIER&#x60;, &#x60;OUTLET&#x60;, &#x60;STOCKTAKE&#x60;, &#x60;RETURN&#x60;. |  [optional]
**status** | **String** | One of &#x60;OPEN&#x60;, &#x60;RECEIVED&#x60;, &#x60;SENT&#x60;, &#x60;STOCKTAKE&#x60;, &#x60;STOCKTAKE_SCHEDULED&#x60;, &#x60;STOCKTAKE_IN_PROGRESS&#x60;, &#x60;STOCKTAKE_IN_PROGRESS_PROCESSED&#x60;, &#x60;STOCKTAKE_COMPLETE&#x60;, &#x60;CLOSED&#x60;, &#x60;CANCELLED&#x60; |  [optional]
**supplierId** | **String** | a valid supplier ID. |  [optional]
**sourceOutletId** | **String** | A valid ID of an outlet where stock will come from. **Stock transfers only**. |  [optional]
**supplierInvoice** | **String** | Supplier invoice number. |  [optional]
**reference** | **String** | Order number.+ &#x60;total_count_gain&#x60; (number) |  [optional]
**totalCostGain** | **Double** | The cost of items over the expected level. |  [optional]
**totalCountLoss** | **Double** | The number of items below the expected level. |  [optional]
**totalCostLoss** | **Double** | The cost of items below the expected level. |  [optional]
**createdAt** | **String** | Creation timestamp in UTC. |  [optional]
**updatedAt** | **String** | Last update timestamp in UTC. |  [optional]
**deletedAt** | **String** | Deletion timestamp in UTC. |  [optional]
**version** | **Long** | Auto-incrementing object version number. |  [optional]
**totalCountGain** | **Double** | The number of items over the expected level. |  [optional]



