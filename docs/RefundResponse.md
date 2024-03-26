

# RefundResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The unique transaction ID provided by Peach Payments. |  |
|**amount** | **String** | The payment request amount. |  |
|**currency** | **String** | The currency code of the payment request amount as defined by ISO-4217. |  |
|**paymentBrand** | **PaymentBrand** |  |  [optional] |
|**paymentType** | [**PaymentTypeEnum**](#PaymentTypeEnum) | Refund type of the transaction. |  |
|**result** | [**RefundResponseResult**](RefundResponseResult.md) |  |  |
|**resultDetails** | [**ResultDetails**](ResultDetails.md) |  |  [optional] |
|**connectorTxID1** | **String** | The unique transaction identifier provided by the payment service provider. |  [optional] |
|**timestamp** | **OffsetDateTime** | The timestamp of the transaction. |  |
|**customParameters** | **Object** | A JSON object depicting custom information sent by the merchant. Echoed back in the response. |  [optional] |



## Enum: PaymentTypeEnum

| Name | Value |
|---- | -----|
| RF | &quot;RF&quot; |



