

# CheckoutCancelledWebhook

Webhook sent when a checkout instance is cancelled.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**amount** | **String** | The amount of the payment request. The period is used as the decimal separator. M-PESA does not support decimal amounts, so Checkout automatically rounds them up. |  [optional] |
|**checkoutId** | **String** | Checkout ID. |  [optional] |
|**currency** | [**CurrencyEnum**](#CurrencyEnum) | The currency code of the payment request amount. |  [optional] |
|**merchantTransactionId** | **String** | Merchant-provided reference number unique for your transactions. |  [optional] |
|**paymentType** | [**PaymentTypeEnum**](#PaymentTypeEnum) | The payment type for the request. |  [optional] |
|**resultCode** | **String** |  |  [optional] |
|**resultDescription** | **String** |  |  [optional] |
|**signature** | **String** | Token to verify the integrity of the webhook, ensuring the request is coming from Checkout. |  [optional] |
|**timestamp** | **String** | Date and time when the webhook was sent. |  [optional] |



## Enum: CurrencyEnum

| Name | Value |
|---- | -----|
| ZAR | &quot;ZAR&quot; |
| USD | &quot;USD&quot; |
| KES | &quot;KES&quot; |
| MUR | &quot;MUR&quot; |
| GBP | &quot;GBP&quot; |
| EUR | &quot;EUR&quot; |



## Enum: PaymentTypeEnum

| Name | Value |
|---- | -----|
| DB | &quot;DB&quot; |



