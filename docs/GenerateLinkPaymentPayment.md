

# GenerateLinkPaymentPayment

The payment object contains the payment details, files, and notes for the payment link.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**merchantInvoiceId** | **String** | Invoice ID that can be used to link the payment to an invoice on the merchant&#39;s system. Must be less than 17 characters. |  |
|**amount** | **Double** | Payment amount. Must be positive and less than 1000000.00. |  |
|**currency** | [**CurrencyEnum**](#CurrencyEnum) | The currency code of the payment request amount (ISO 4217). |  |
|**files** | **List&lt;UUID&gt;** | Files to attach to the payment link. |  [optional] |
|**notes** | **String** | A note to include with the payment link. |  [optional] |



## Enum: CurrencyEnum

| Name | Value |
|---- | -----|
| ZAR | &quot;ZAR&quot; |
| KES | &quot;KES&quot; |
| USD | &quot;USD&quot; |



