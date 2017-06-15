
# User

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**UUID**](UUID.md) | Auto-generated object ID. | 
**username** | **String** | User&#39;s username used for login. | 
**displayName** | **String** | Full user&#39;s name to be used for display in the UI. |  [optional]
**email** | **String** | User&#39;s email address. |  [optional]
**emailVerifiedAt** | **String** | The timestamp of users email verification. |  [optional]
**restrictedOutletId** | **String** | **deprecated** Use the &#x60;restricted_outlet_ids&#x60; instead. |  [optional]
**restrictedOutletIds** | [**List&lt;UUID&gt;**](UUID.md) | A list of outlet IDs the user is associated with |  [optional]
**accountType** | [**AccountTypeEnum**](#AccountTypeEnum) | User&#39;s account type. | 
**createdAt** | **String** | Creation timestamp in UTC. | 
**updatedAt** | **String** | Last update timestamp in UTC. | 
**deletedAt** | **String** | Deletion timestamp in UTC. |  [optional]
**seenAt** | **String** | The timestamp of the user&#39;s last activity in the system. |  [optional]
**targetDaily** | [**BigDecimal**](BigDecimal.md) | Daily sales target for the user. |  [optional]
**targetWeekly** | [**BigDecimal**](BigDecimal.md) | Weekly sales target for the user. |  [optional]
**targetMonthly** | [**BigDecimal**](BigDecimal.md) | Monthly sales target for the user. |  [optional]
**version** | **Integer** | Auto-incrementing version number | 
**isPrimaryUser** | **Boolean** | Indicated whether this user is the primary user for the account. | 
**imageSource** | **String** | URL of the default-sized user&#39;s avatar. |  [optional]
**images** | [**UserImages**](UserImages.md) |  |  [optional]


<a name="AccountTypeEnum"></a>
## Enum: AccountTypeEnum
Name | Value
---- | -----
CASHIER | &quot;cashier&quot;
MANAGER | &quot;manager&quot;
ADMIN | &quot;admin&quot;



