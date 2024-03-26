

# CheckoutPendingWebhook

Webhook sent when a transaction is created on a checkout instance.

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
|**id** | **String** | The transaction ID. |  [optional] |
|**paymentBrand** | [**PaymentBrandEnum**](#PaymentBrandEnum) | The payment method which the customer is paying with. |  [optional] |



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



## Enum: PaymentBrandEnum

| Name | Value |
|---- | -----|
| VISA | &quot;VISA&quot; |
| MASTERCARD | &quot;MASTERCARD&quot; |
| DINERS_CLUB | &quot;DINERS CLUB&quot; |
| AMERICAN_EXPRESS | &quot;AMERICAN EXPRESS&quot; |
| MASTERPASS | &quot;MASTERPASS&quot; |
| MOBICRED | &quot;MOBICRED&quot; |
| EFTSECURE | &quot;EFTSECURE&quot; |
| MPESA | &quot;MPESA&quot; |
| _1FORYOU | &quot;1FORYOU&quot; |
| APLUS | &quot;APLUS&quot; |
| PAYPAL | &quot;PAYPAL&quot; |
| ZEROPAY | &quot;ZEROPAY&quot; |
| PAYFLEX | &quot;PAYFLEX&quot; |
| FINCHOICEPAY | &quot;FINCHOICEPAY&quot; |
| BLINKBYEMTEL | &quot;BLINKBYEMTEL&quot; |
| CAPITECPAY | &quot;CAPITECPAY&quot; |
| NEDBANKDIRECTEFT | &quot;NEDBANKDIRECTEFT&quot; |
| PAYBYBANK | &quot;PAYBYBANK&quot; |
| MCBJUICE | &quot;MCBJUICE&quot; |



