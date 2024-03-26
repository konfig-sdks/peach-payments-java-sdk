

# StatusQueryPaymentStatusResponseAuditInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**oldStatus** | [**OldStatusEnum**](#OldStatusEnum) | The previous status of the payment link. |  [optional] |
|**newStatus** | [**NewStatusEnum**](#NewStatusEnum) | The new status of the payment link. |  [optional] |
|**timestamp** | **String** | The UTC time that the status changed. |  [optional] |



## Enum: OldStatusEnum

| Name | Value |
|---- | -----|
| NONE | &quot;none&quot; |
| INITIATED | &quot;initiated&quot; |
| PROCESSING | &quot;processing&quot; |
| EXPIRED | &quot;expired&quot; |
| CANCELLED | &quot;cancelled&quot; |
| COMPLETED | &quot;completed&quot; |



## Enum: NewStatusEnum

| Name | Value |
|---- | -----|
| INITIATED | &quot;initiated&quot; |
| PROCESSING | &quot;processing&quot; |
| EXPIRED | &quot;expired&quot; |
| CANCELLED | &quot;cancelled&quot; |
| COMPLETED | &quot;completed&quot; |



