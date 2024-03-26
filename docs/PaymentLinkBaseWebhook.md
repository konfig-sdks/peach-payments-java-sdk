

# PaymentLinkBaseWebhook

Base webhook format for Payment Links.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**paymentId** | **String** | Payment ID. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Type of webhook, reflecting the status of the payment link. |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| INITIATED | &quot;initiated&quot; |
| PROCESSING | &quot;processing&quot; |
| EXPIRED | &quot;expired&quot; |
| CANCELLED | &quot;cancelled&quot; |
| COMPLETED | &quot;completed&quot; |
| OPENED | &quot;opened&quot; |



