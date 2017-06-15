
# Sale

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**outletId** | **String** | Valid outlet ID for the retailer. |  [optional]
**returnFor** | **String** | Reference ID to a different sale if this sale was created as a return. |  [optional]
**totalPrice** | **Double** | Sale total. |  [optional]
**totalTax** | **Double** | Tax total. |  [optional]
**deletedAt** | **String** | Deletion timestamp in UTC. |  [optional]
**version** | **Double** | Auto-incrementing object version number. |  [optional]
**taxes** | [**List&lt;SaleTax&gt;**](SaleTax.md) | Collection of taxes. |  [optional]
**registerId** | **String** | Valid register ID for the retailer. |  [optional]
**userId** | **String** | Valid user ID for the retailer. |  [optional]
**status** | **String** | Sale status. One of: CLOSED, SAVED, ONACCOUNT, ONACCOUNT_CLOSED, LAYBY, LAYBY_CLOSED. VOIDED ??? |  [optional]
**lineItems** | [**List&lt;LineItem&gt;**](LineItem.md) | A collection of line items. |  [optional]
**payments** | [**List&lt;Payment&gt;**](Payment.md) | Collection of payments. |  [optional]
**customerId** | **String** | Valid customer ID for the retailer. |  [optional]
**invoiceNumber** | **String** | Invoice number which if provided, should use the prefix and suffix defined for the register. |  [optional]
**invoiceSequence** | **Double** | Optionally provided value. |  [optional]
**note** | **String** | Sale Note. |  [optional]
**shortCode** | **String** | 6 character code used in the loyalty system. ??? |  [optional]
**saleDate** | **String** | Sale timestamp in UTC. |  [optional]



