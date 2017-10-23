
# Register

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Auto-generated object ID. |  [optional]
**name** | **String** | The Register name. |  [optional]
**outletId** | **String** | A valid ID of an Outlet that this register is associated with. |  [optional]
**askForNoteOnSave** | **Double** | &#x60;0&#x60; for **Never**, &#x60;1&#x60; for **On Save/Layby/Account/Return**, &#x60;2&#x60; for **Always**. |  [optional]
**printNoteOnReceipt** | **Boolean** |  |  [optional]
**askForUserOnSale** | **Boolean** |  |  [optional]
**showDiscountsOnReceipts** | **Boolean** |  |  [optional]
**printReceipt** | **Boolean** | Indicates whether a receipt should be printed after a sale. |  [optional]
**emailReceipt** | **Boolean** | Indicates whether a receipt should be emailed after a sale. |  [optional]
**invoicePrefix** | **String** | Invoice number prefix. |  [optional]
**invoiceSuffix** | **String** | Invoice number suffix. |  [optional]
**invoiceSequence** | **Double** | The numeric part of the last issued invoice. |  [optional]
**buttonLayoutId** | **String** | Register ID. |  [optional]
**isOpen** | **Boolean** | Indicates if the Register is currently open. |  [optional]
**registerOpenTime** | **String** | Date/time when the register was open. Always in UTC. |  [optional]
**registerCloseTime** | **String** | Date/time when the register was closed. Null if currently open. |  [optional]
**registerOpenSequenceId** | **String** | **internal** The ID of the current register closure object. |  [optional]
**cashManagedPaymentTypeId** | **String** | **internal** The ID of the payment type used for cash management transactions in this regsiter. |  [optional]
**deletedAt** | **String** | Deletion timestamp in UTC. |  [optional]
**version** | **Long** | Auto-incrementing object version number. |  [optional]



