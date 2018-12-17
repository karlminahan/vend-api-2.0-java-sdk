
# RequestLog

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Auto-generated object ID. | 
**groupingId** | **String** | An identifier used to group together requests that occurred together as part of the same job or Vend API request. | 
**requestMethod** | [**RequestMethodEnum**](#RequestMethodEnum) | The HTTP method used to make the request. | 
**statusCode** | [**BigDecimal**](BigDecimal.md) | The HTTP status code received in the response. |  [optional]
**request** | **String** | A dump of the full request information in HTTP format, including headers and any request body. | 
**response** | **String** | A dump of the full response information in HTTP format, including headers and any response body. | 
**error** | **String** | f an error occurred with the request, such as an inability to resolve a hostname, connect or TLS errors, this will be recorded here. Only errors with the ability to make the request are logged here, rather than errors when interpreting a response. |  [optional]
**occurredAt** | [**OffsetDateTime**](OffsetDateTime.md) | An RFC3339 representation of the time at which the request was logged. | 


<a name="RequestMethodEnum"></a>
## Enum: RequestMethodEnum
Name | Value
---- | -----
GET | &quot;GET&quot;
POST | &quot;POST&quot;
PUT | &quot;PUT&quot;
DELETE | &quot;DELETE&quot;



