
# LineItem

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**taxId** | **String** | ??? |  [optional]
**discountTotal** | **Double** | Total discount for the line item. |  [optional]
**isReturn** | **Boolean** | Indicates whether this line item is a return from another sale (referenced by &#x60;return_for&#x60; on the main sale object). |  [optional]
**cost** | **Double** | Unit cost for the line item. |  [optional]
**costTotal** | **Double** | Total cost for the line item. |  [optional]
**priceTotal** | **Double** | Total price for the line item. |  [optional]
**tax** | **Double** | Unit tax for the line item. **deprecated** ??? |  [optional]
**taxTotal** | **Double** | Total tax value. |  [optional]
**productId** | **String** | Valid product ID. |  [optional]
**quantity** | **Double** | Quantity of product units included in the sale. |  [optional]
**price** | **Double** | Unit price for the product. |  [optional]
**taxComponents** | [**List&lt;LineItemTaxComponent&gt;**](LineItemTaxComponent.md) | Collection of tax components associated with the line item. |  [optional]
**discount** | **Double** | Discount. ??? Unit? Should that be even posted? |  [optional]
**loyaltyValue** | **Double** | The value that should be added to associated customer&#39;s loyalty balance. |  [optional]
**priceSet** | **Boolean** | Indicates whether the price was set manually. Using &#x60;true&#x60; means that the value will never be refreshed from the price book when reloaded (sale retrieved from parked sales). |  [optional]
**sequence** | **Double** | Order of the line item in the sale. |  [optional]
**note** | **String** | Line item note. |  [optional]
**status** | **String** | Line item status. ??? |  [optional]



