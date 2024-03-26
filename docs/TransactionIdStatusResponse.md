

# TransactionIdStatusResponse

The response for the status request using transactionId as the query field.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The unique transaction ID provided by Peach Payments. |  |
|**merchantTransactionId** | **String** | Merchant-provided reference number, often used for reconciliation. |  |
|**amount** | **String** | The payment request amount. |  |
|**currency** | **String** | The currency code of the payment request amount as defined by ISO-4217. |  |
|**paymentBrand** | **PaymentBrand** |  |  |
|**paymentType** | **PaymentType** |  |  |
|**result** | [**Result**](Result.md) |  |  |
|**resultDetails** | [**ResultDetails**](ResultDetails.md) |  |  [optional] |
|**connectorTxID1** | **String** | The unique transaction identifier provided by the payment service provider. |  |
|**timestamp** | **OffsetDateTime** | The timestamp of the transaction. |  |
|**customParameters** | **Object** | A JSON object depicting custom information sent by the merchant. Echoed back in the response. |  |
|**merchantInvoiceId** | **String** | The merchant&#39;s invoice ID. |  [optional] |
|**bank** | [**Bank**](Bank.md) |  |  [optional] |
|**card** | [**ResponseCard**](ResponseCard.md) |  |  [optional] |
|**recon** | [**Recon**](Recon.md) |  |  [optional] |



