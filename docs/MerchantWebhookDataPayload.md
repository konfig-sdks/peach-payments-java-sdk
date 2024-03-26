

# MerchantWebhookDataPayload

The webhook data schema after decryption.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The unique transaction ID provided by Peach Payments. |  |
|**paymentType** | **PaymentType** |  |  |
|**amount** | **String** | The payment request amount. |  |
|**merchantInvoiceId** | **String** | The merchant&#39;s invoice ID. |  |
|**merchantAccountId** | **String** | Merchant account ID. |  |
|**descriptor** | **String** |  |  [optional] |
|**currency** | **String** | The currency code of the payment request amount as defined by ISO-4217. |  |
|**presentationAmount** | **String** | The payment request amount. |  |
|**result** | [**Result**](Result.md) |  |  |
|**resultDetails** | [**ResultDetails**](ResultDetails.md) |  |  |
|**connectorTxID1** | **String** | The unique transaction identifier provided by the payment service provider. |  |
|**authentication** | [**MerchantWebhookDataPayloadAuthentication**](MerchantWebhookDataPayloadAuthentication.md) |  |  |
|**card** | [**Card**](Card.md) |  |  |
|**timestamp** | **OffsetDateTime** | The timestamp of the transaction. |  |
|**customer** | [**Customer**](Customer.md) |  |  [optional] |
|**shipping** | [**Address**](Address.md) |  |  |
|**billing** | [**Address**](Address.md) |  |  |
|**recon** | [**Recon**](Recon.md) |  |  [optional] |
|**bankAccount** | [**MerchantWebhookDataPayloadBankAccount**](MerchantWebhookDataPayloadBankAccount.md) |  |  |
|**customParameters** | **Object** | A JSON object depicting custom information sent by the merchant. Echoed back in the response. |  [optional] |
|**referenceId** | **String** | The unique transaction ID provided by Peach Payments. |  |
|**shopify** | [**Shopify**](Shopify.md) |  |  |
|**merchant** | [**MerchantWebhookDataPayloadMerchant**](MerchantWebhookDataPayloadMerchant.md) |  |  [optional] |



