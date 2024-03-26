

# PaymentResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**amount** | **String** | The payment request amount. |  |
|**currency** | **String** | The currency code of the payment request amount as defined by ISO-4217. |  |
|**paymentBrand** | **PaymentBrand** |  |  |
|**paymentType** | **PaymentType** |  |  |
|**result** | [**Result**](Result.md) |  |  |
|**resultDetails** | [**ResultDetails**](ResultDetails.md) |  |  [optional] |
|**redirect** | [**Redirect**](Redirect.md) |  |  [optional] |
|**connectorTxID1** | **String** | The unique transaction identifier provided by the payment service provider. |  [optional] |
|**connectorTxID2** | **String** | Another unique transaction identifier provided by the payment service provider. |  [optional] |
|**customParameters** | **Object** | A JSON object depicting custom information sent by the merchant. Echoed back in the response. |  |
|**timestamp** | **OffsetDateTime** | The timestamp of the transaction. |  |
|**id** | **String** | The unique transaction ID provided by Peach Payments. |  |
|**merchantTransactionId** | **String** | Merchant-provided reference number, often used for reconciliation. |  [optional] |
|**merchantInvoiceId** | **String** | The merchant&#39;s invoice ID. |  [optional] |
|**shopperResultUrl** | **URI** | The Payments API redirects the user to this URL after processing the payment request. |  [optional] |
|**virtualAccount** | [**VirtualAccount**](VirtualAccount.md) |  |  [optional] |
|**transactionExpiryTimestamp** | **OffsetDateTime** | The expiry timestamp of the transaction. |  [optional] |



