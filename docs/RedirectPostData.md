

# RedirectPostData


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**amount** | **String** | The checkout amount. |  [optional] |
|**checkoutId** | **String** |  |  [optional] |
|**currency** | [**CurrencyEnum**](#CurrencyEnum) | The currency code of the payment request amount. |  [optional] |
|**merchantTransactionId** | **String** | The merchant transaction ID set when creating the checkout. |  [optional] |
|**paymentType** | [**PaymentTypeEnum**](#PaymentTypeEnum) |  |  [optional] |
|**resultCode** | **String** | A code representing the transaction state. |  [optional] |
|**resultDescription** | **String** | A friendly message. |  [optional] |
|**timestamp** | **String** | Date and time when the checkout was created. |  [optional] |



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



