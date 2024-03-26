

# Checkout


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**authenticationEntityId** | **String** | The entity for the request. By default, this is the channel ID. |  |
|**signature** | **String** | Token to verify the integrity of the payment, ensuring that only the merchant sending the request is accepted. |  |
|**merchantTransactionId** | **String** | Merchant-provided reference number unique for your transactions. |  |
|**amount** | **String** | The amount of the payment request. The period is used as the decimal separator. M-PESA does not support decimal amounts, so Checkout automatically rounds them up. |  |
|**paymentType** | [**PaymentTypeEnum**](#PaymentTypeEnum) | The payment type for the request. Accepts &#x60;DB&#x60;.  Does not accept &#x60;RG&#x60;, but you can tokenise a card by performing a DB with &#x60;createRegistration&#x60;.  Refund transactions through the Dashboard or as described in the &lt;a href&#x3D;\&quot;https://developer.peachpayments.com/docs/checkout-refund\&quot; target&#x3D;\&quot;_blank\&quot;&gt;documentation&lt;/a&gt;.  |  |
|**currency** | [**CurrencyEnum**](#CurrencyEnum) | The currency code of the payment request amount. |  |
|**nonce** | **String** | Unique value to represent each request. |  |
|**shopperResultUrl** | **String** | Checkout uses a POST request to redirect the customer to this URL after the customer completes checkout. Must be a valid URL that can be accessed through a browser. |  |
|**defaultPaymentMethod** | [**DefaultPaymentMethodEnum**](#DefaultPaymentMethodEnum) | The preferred payment method which is active in the checkout page at the point of redirecting. |  [optional] |
|**forceDefaultMethod** | [**ForceDefaultMethodEnum**](#ForceDefaultMethodEnum) | Force the default payment method to be the only payment method. |  [optional] |
|**merchantInvoiceId** | **String** | Merchant-provided invoice number unique for your transactions. This identifier is not sent onwards. |  [optional] |
|**cancelUrl** | **String** | The customer is redirected to this URL if they cancel checkout. It must be a valid URL that can be reached through a browser. |  [optional] |
|**notificationUrl** | **String** | Override the preconfigured webhook URL for this checkout instance, any changes to checkout will send a webhook to this url. |  [optional] |
|**customParametersName** | **String** | A name value pair used for sending custom information. |  [optional] |
|**customerMerchantCustomerId** | **String** | An identifier for this customer. Typically this is the ID that identifies the shopper in the shop&#39;s system. |  [optional] |
|**customerGivenName** | **String** | The customer&#39;s first name or given name.  Required if you send in any other customer parameters, and for some risk checks and payment providers.  Peach Payments recommends including the name so that it displays in the Peach Dashboard and is available for subsequent queries.  Truncated after 48 characters.  |  [optional] |
|**customerSurname** | **String** | The customer&#39;s last name or surname.  Required if you send in any other customer parameters, and for some risk checks and payment providers.  Peach Payments recommends including the surname so that it displays in the Peach Dashboard and is available for subsequent queries.  Truncated after 48 characters.  |  [optional] |
|**customerMobile** | **String** | The customer&#39;s mobile number. |  [optional] |
|**customerEmail** | **String** | The customer&#39;s email address. |  [optional] |
|**customerStatus** | [**CustomerStatusEnum**](#CustomerStatusEnum) | The customer&#39;s status. Accepts &#x60;NEW&#x60; or &#x60;EXISTING&#x60;. |  [optional] |
|**customerBirthDate** | **String** | The customer&#39;s birth date in the yyyy-MM-dd format. |  [optional] |
|**customerIp** | **String** | The customer&#39;s IP address. |  [optional] |
|**customerPhone** | **String** | The customer&#39;s phone number. |  [optional] |
|**customerIdNumber** | **String** | The customer&#39;s ID number, required for high-risk merchants supporting Capitec Pay. |  [optional] |
|**billingStreet1** | **String** | The door number, floor, building number, building name, and/or street name of the billing address. |  [optional] |
|**billingStreet2** | **String** | The adjoining road or locality, if required, of the billing address. |  [optional] |
|**billingCity** | **String** | The town, district, or city of the billing address. |  [optional] |
|**billingCompany** | **String** | The company of the billing address. |  [optional] |
|**billingCountry** | **String** | The country of the billing address (ISO 3166-1). |  [optional] |
|**billingState** | **String** | The county, state, or region of the billing address. |  [optional] |
|**billingPostcode** | **String** | The postal code or ZIP code of the billing address. |  [optional] |
|**shippingStreet1** | **String** | The door number, floor, building number, building name, and/or street name of the shipping address. |  [optional] |
|**shippingStreet2** | **String** | The adjoining road or locality, if required, of the shipping address. |  [optional] |
|**shippingCity** | **String** | The town, district, or city of the shipping address. |  [optional] |
|**shippingCompany** | **String** | The company of the shipping address. |  [optional] |
|**shippingPostcode** | **String** | The postal code or ZIP code of the shipping address. |  [optional] |
|**shippingCountry** | **String** | The country of the shipping address (ISO 3166-1). |  [optional] |
|**shippingState** | **String** | The county, state, or region of the shipping address. |  [optional] |
|**cartTax** | **String** | The tax percentage applied to the price of the item in the shopping cart. |  [optional] |
|**cartShippingAmount** | **String** | The total amount of the cart item including quantity. |  [optional] |
|**cartDiscount** | **String** | Discount amount applied on order amount. |  [optional] |
|**createRegistration** | [**CreateRegistrationEnum**](#CreateRegistrationEnum) | Used to enable card tokenisation with COPYandPAY. |  [optional] |
|**originator** | **String** | Used to provide a name for the application that is creating the checkout instance. |  [optional] |
|**returnTo** | [**ReturnToEnum**](#ReturnToEnum) | Text to display on \&quot;Return to Store\&quot; button on completing checkout. |  [optional] |



## Enum: PaymentTypeEnum

| Name | Value |
|---- | -----|
| DB | &quot;DB&quot; |



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
| APPLE_PAY | &quot;APPLE PAY&quot; |
| MCBJUICE | &quot;MCBJUICE&quot; |



## Enum: ForceDefaultMethodEnum

| Name | Value |
|---- | -----|
| TRUE | &quot;true&quot; |
| FALSE | &quot;false&quot; |



## Enum: CustomerStatusEnum

| Name | Value |
|---- | -----|
| NEW | &quot;NEW&quot; |
| EXISTING | &quot;EXISTING&quot; |



## Enum: CreateRegistrationEnum

| Name | Value |
|---- | -----|
| TRUE | &quot;true&quot; |
| FALSE | &quot;false&quot; |



## Enum: ReturnToEnum

| Name | Value |
|---- | -----|
| STORE | &quot;STORE&quot; |
| INVOICE | &quot;INVOICE&quot; |



