

# Customer

Optional object sent if customer data is required.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**givenName** | **String** | The customer&#39;s first name or given name. Peach Payments recommends including the name so that it displays in the Peach Dashboard and is available for subsequent queries. |  |
|**surname** | **String** | The customer&#39;s last name or surname. Peach Payments recommends including the surname so that it displays in the Peach Dashboard and is available for subsequent queries. |  [optional] |
|**email** | **String** | The customer&#39;s email  address. |  [optional] |
|**mobile** | **String** | The customer&#39;s mobile phone number. |  [optional] |
|**whatsapp** | **String** | The customer&#39;s WhatsApp number. Required for communicating with customers regarding payment. Format should be +27123456789. Required if sendWhatsapp is true. |  [optional] |
|**billing** | [**Address**](Address.md) |  |  [optional] |
|**fax** | **String** | The customer&#39;s fax number, if provided. |  [optional] |
|**phone** | **String** | The customer&#39;s phone number. |  [optional] |
|**ip** | **String** | The customer&#39;s IP address. |  [optional] |
|**merchantCustomerLanguage** | **String** | The language used for the customer on the merchant&#39;s site. |  [optional] |
|**status** | **String** | Used to determine if this is a new or returning customer. |  [optional] |
|**merchantCustomerId** | **String** | The customer&#39;s ID on the merchant&#39;s site. |  [optional] |
|**taxId** | **String** | The customer&#39;s tax ID, if required. |  [optional] |
|**taxType** | **String** | The customer&#39;s tax type, if required. |  [optional] |
|**birthDate** | **String** | The customer&#39;s birth date. |  [optional] |
|**browser** | [**CustomerBrowser**](CustomerBrowser.md) |  |  [optional] |



