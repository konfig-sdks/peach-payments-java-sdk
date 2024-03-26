

# QueryStatusResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Payment ID. |  [optional] |
|**payment** | [**QueryStatusResponsePayment**](QueryStatusResponsePayment.md) |  |  [optional] |
|**source** | [**SourceEnum**](#SourceEnum) | Source of the payment link. |  [optional] |
|**createdAt** | **String** | Timestamp when the payment link was created. |  [optional] |
|**updatedAt** | **String** | Timestamp when the payment link was last modified. |  [optional] |
|**customer** | [**Customer**](Customer.md) |  |  [optional] |
|**options** | [**PaymentResponseOptions**](PaymentResponseOptions.md) |  |  [optional] |
|**checkout** | [**CheckoutState**](CheckoutState.md) |  |  [optional] |
|**termsOfService** | [**QueryStatusResponseTermsOfService**](QueryStatusResponseTermsOfService.md) |  |  [optional] |



## Enum: SourceEnum

| Name | Value |
|---- | -----|
| API | &quot;API&quot; |
| XERO | &quot;Xero&quot; |
| UI | &quot;UI&quot; |



