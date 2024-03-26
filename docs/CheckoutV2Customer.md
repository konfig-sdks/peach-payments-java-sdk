

# CheckoutV2Customer


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**merchantCustomerId** | **String** | An identifier for this customer. Typically this is the ID that identifies the shopper in the shop&#39;s system. |  [optional] |
|**givenName** | **String** | The customer&#39;s first name or given name. Required if you send in any other customer parameters, also required for some risk checks and payment providers. Truncated after 48 characters.  Peach Payments recommends including the name so that it displays in the Peach Dashboard and is available for subsequent queries.  |  [optional] |
|**surname** | **String** | The customer&#39;s last name or surname. Required if you send in any other customer parameters, also required for some risk checks and payment providers. Truncated after 48 characters.  Peach Payments recommends including the surname so that it displays in the Peach Dashboard and is available for subsequent queries.  |  [optional] |
|**mobile** | **String** | The customer&#39;s mobile number. |  [optional] |
|**email** | **String** | The customer&#39;s email address. |  [optional] |
|**idNumber** | **String** | The customer&#39;s ID number, required for high-risk merchants supporting Capitec Pay. |  [optional] |



