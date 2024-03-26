

# MerchantTransactionIdStatusResponsePaymentsInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The unique transaction ID provided by Peach Payments. |  |
|**paymentType** | **PaymentType** |  |  |
|**paymentBrand** | **PaymentBrand** |  |  |
|**amount** | **String** | The payment request amount. |  |
|**currency** | **String** | The currency code of the payment request amount as defined by ISO-4217. |  |
|**merchantTransactionId** | **String** | Merchant-provided reference number, often used for reconciliation. |  |
|**result** | [**Result**](Result.md) |  |  |
|**resultDetails** | [**ResultDetails**](ResultDetails.md) |  |  |
|**connectorTxID1** | **String** | The unique transaction identifier provided by the payment service provider. |  |
|**timestamp** | **OffsetDateTime** | The timestamp of the transaction. |  |
|**customParameters** | **Object** | A JSON object depicting custom information sent by the merchant. Echoed back in the response. |  |
|**card** | [**ResponseCard**](ResponseCard.md) |  |  [optional] |
|**merchantInvoiceId** | **String** | The merchant&#39;s invoice ID. |  [optional] |
|**recon** | [**Recon**](Recon.md) |  |  [optional] |



