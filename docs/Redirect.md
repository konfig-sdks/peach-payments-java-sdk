

# Redirect

The URL that the merchant must redirect the user to after the transaction has been created and is in a pending state. When the user is redirected, they can complete any actions required for that specific payment method.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**parameters** | [**List&lt;RedirectParametersInner&gt;**](RedirectParametersInner.md) | Array of parameter names and values for the redirect URL. |  |
|**url** | **URI** | The URL that the shopper must be redirected to in order to proceed. |  |
|**method** | [**MethodEnum**](#MethodEnum) | REST method used for redirection. |  |



## Enum: MethodEnum

| Name | Value |
|---- | -----|
| GET | &quot;GET&quot; |
| POST | &quot;POST&quot; |



