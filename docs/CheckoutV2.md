

# CheckoutV2


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**authenticationEntityId** | **String** | The entity for the request. By default, this is the channel ID. |  |
|**merchantTransactionId** | **String** | Merchant-provided reference number unique for your transactions. |  |
|**amount** | **Double** | The amount of the payment request. The period is used as the decimal separator.  M-PESA does not support decimal amounts, so Checkout automatically rounds them up.  |  |
|**currency** | [**CurrencyEnum**](#CurrencyEnum) | The currency code of the payment request amount. |  |
|**nonce** | **String** | Unique value to represent each request. |  |
|**shopperResultUrl** | **String** | Checkout uses a POST request to redirect the customer to this URL after the customer completes checkout. Must be a valid URL that can be accessed through a browser. |  |
|**defaultPaymentMethod** | [**DefaultPaymentMethodEnum**](#DefaultPaymentMethodEnum) | The preferred payment method which is active in the checkout page at the point of redirecting. |  [optional] |
|**forceDefaultMethod** | **Boolean** | Force the default payment method to be the only payment method. |  [optional] |
|**merchantInvoiceId** | **String** | Merchant-provided invoice number unique for your transactions. This identifier is not sent onwards. |  [optional] |
|**cancelUrl** | **String** | The customer is redirected to this URL if they cancel checkout. It must be a valid URL that can be reached through a browser. |  [optional] |
|**notificationUrl** | **String** | Override the preconfigured webhook URL for this checkout instance, any changes to checkout send a webhook to this URL. |  [optional] |
|**customParameters** | **Map&lt;String, String&gt;** | A name value pair used for sending custom information. |  [optional] |
|**customer** | [**CheckoutV2Customer**](CheckoutV2Customer.md) |  |  [optional] |
|**billing** | [**CheckoutV2Billing**](CheckoutV2Billing.md) |  |  [optional] |
|**shipping** | [**CheckoutV2Shipping**](CheckoutV2Shipping.md) |  |  [optional] |
|**createRegistration** | **Boolean** | Used to enable card tokenisation with COPYandPAY. |  [optional] |
|**originator** | **String** | Used to provide a name for the application that is creating the checkout instance. |  [optional] |
|**returnTo** | [**ReturnToEnum**](#ReturnToEnum) | Text to display on \&quot;Return to Store\&quot; button on completing checkout. |  [optional] |



## Enum: CurrencyEnum

| Name | Value |
|---- | -----|
| ZAR | &quot;ZAR&quot; |
| USD | &quot;USD&quot; |
| KES | &quot;KES&quot; |
| MUR | &quot;MUR&quot; |
| GBP | &quot;GBP&quot; |
| EUR | &quot;EUR&quot; |



## Enum: DefaultPaymentMethodEnum

| Name | Value |
|---- | -----|
| CARD | &quot;CARD&quot; |
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



## Enum: ReturnToEnum

| Name | Value |
|---- | -----|
| STORE | &quot;STORE&quot; |
| INVOICE | &quot;INVOICE&quot; |



