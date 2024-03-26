

# PaymentOptions

The options object contains all the communication preferences for the payment link.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**sendEmail** | **Boolean** | Indicates whether to send an email to the customer after creating the payment link. |  [optional] |
|**sendSms** | **Boolean** | Indicates whether to send an SMS to the customer after creating the payment link. |  [optional] |
|**sendWhatsapp** | **Boolean** | Indicates whether to send a WhatsApp message to the customer after creating the payment link. |  [optional] |
|**emailCc** | **String** | List of comma-separated email addresses to CC. |  [optional] |
|**emailBcc** | **String** | List of comma-separated email addresses to BCC. |  [optional] |
|**expiryTime** | **Integer** | Time in minutes until the link expires. By default, expiry time is set to 30 days, which is also the maximum expiry time. |  [optional] |
|**notificationUrl** | **String** | Webhook notification URL for this payment. Overrides the default set on the merchant. |  [optional] |



