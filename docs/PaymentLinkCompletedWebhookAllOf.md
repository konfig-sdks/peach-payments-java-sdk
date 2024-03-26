

# PaymentLinkCompletedWebhookAllOf


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**status** | **String** |  |  [optional] |
|**paymentBrand** | [**PaymentBrandEnum**](#PaymentBrandEnum) | Payment brand used to complete the payment. |  [optional] |
|**registrationId** | **String** | Card registration token, if tokeniseCard was set to true on initial request and paymentBrand is a card type. |  [optional] |



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
| STITCHEFT | &quot;STITCHEFT&quot; |
| FINCHOICEPAY | &quot;FINCHOICEPAY&quot; |
| BLINKBYEMTEL | &quot;BLINKBYEMTEL&quot; |
| CAPITECPAY | &quot;CAPITECPAY&quot; |



