
# Sale

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Auto-generated object ID. |  [optional]
**outletId** | **String** | Valid outlet ID for the retailer. |  [optional]
**registerId** | **String** | Valid register ID for the retailer. |  [optional]
**userId** | **String** | Valid user ID for the retailer. |  [optional]
**customerId** | **String** | Valid customer ID for the retailer. |  [optional]
**invoiceNumber** | **String** | Invoice number which if provided, should use the prefix and suffix defined for the register. |  [optional]
**invoiceSequence** | **Double** | Optionally provided value. |  [optional]
**source** | **String** | Origin of the sale. USER for sales created in Vend client apps, SHOPIFY for sale synced from Shopify by the integration, ECOMMERCE for sales coming from Vend Ecommerce. |  [optional]
**sourceId** | **String** | External ID for sales coming from other systems |  [optional]
**status** | **String** | Sale status. One of: CLOSED, SAVED, ONACCOUNT, ONACCOUNT_CLOSED, LAYBY, LAYBY_CLOSED. VOIDED ??? |  [optional]
**note** | **String** | Sale Note. |  [optional]
**shortCode** | **String** | 6 character code used in the loyalty system. ??? |  [optional]
**returnFor** | **String** | Reference ID to a different sale if this sale was created as a return. |  [optional]
**totalPrice** | **Double** | Total (tax exclusive) price of the sale |  [optional]
**totalTax** | **Double** | Total tax. |  [optional]
**totalLoyalty** | **Double** | Total incurred loyalty. |  [optional]
**saleDate** | **String** | Sale timestamp in UTC. |  [optional]
**createdAt** | **String** | Creation timestamp in UTC. |  [optional]
**updatedAt** | **String** | Last update timestamp in UTC. |  [optional]
**deletedAt** | **String** | Deletion timestamp in UTC. |  [optional]
**version** | **Long** | Auto-incrementing object version number. |  [optional]
**taxes** | [**List&lt;SaleTax&gt;**](SaleTax.md) | Collection of taxes. |  [optional]
**lineItems** | [**List&lt;LineItem&gt;**](LineItem.md) | Collection of line items. |  [optional]
**payments** | [**List&lt;Payment&gt;**](Payment.md) | Collection of payments. |  [optional]
**adjustments** | [**List&lt;Adjustment&gt;**](Adjustment.md) | Collection of adjustments. |  [optional]



