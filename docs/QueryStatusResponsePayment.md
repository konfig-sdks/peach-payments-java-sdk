

# QueryStatusResponsePayment


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**linkId** | **String** | Payment link ID. |  [optional] |
|**linkUrl** | **String** | Payment link URL. |  [optional] |
|**amount** | **Double** | Payment amount. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Payment link status. |  [optional] |
|**currency** | [**CurrencyEnum**](#CurrencyEnum) | Currency code for the payment. |  [optional] |
|**merchantInvoiceId** | **String** | Payment order number provided by merchant. |  [optional] |
|**entityId** | **String** | Merchant channel ID that the payment link was created in. |  [optional] |
|**notes** | **String** | A note to include with the payment link. |  [optional] |
|**expiryTime** | **String** | Timestamp when the payment link expires. |  [optional] |
|**batchId** | **String** | Batch ID for the payment link. |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| INITIATED | &quot;initiated&quot; |
| PROCESSING | &quot;processing&quot; |
| EXPIRED | &quot;expired&quot; |
| CANCELLED | &quot;cancelled&quot; |
| COMPLETED | &quot;completed&quot; |



## Enum: CurrencyEnum

| Name | Value |
|---- | -----|
| ZAR | &quot;ZAR&quot; |
| KES | &quot;KES&quot; |
| USD | &quot;USD&quot; |



