# CheckoutV2GenerationApi

All URIs are relative to *https://testapi-v2.peachpayments.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**initiateCheckoutInstance**](CheckoutV2GenerationApi.md#initiateCheckoutInstance) | **POST** /v2/checkout | Initiate Checkout |


<a name="initiateCheckoutInstance"></a>
# **initiateCheckoutInstance**
> CheckoutV2GenerationInitiateCheckoutInstanceResponse initiateCheckoutInstance(referer, checkoutV2).execute();

Initiate Checkout

Create a checkout instance for use from Embedded Checkout.  For more information, see the [documentation](https://developer.peachpayments.com/docs/checkout-embedded-tutorial#tutorial).  

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PeachPayments;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CheckoutV2GenerationApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://testapi-v2.peachpayments.com";
    
    // Configure HTTP bearer authorization: BearerAuth
    configuration.token = "BEARER TOKEN";
    PeachPayments client = new PeachPayments(configuration);
    String authenticationEntityId = "authenticationEntityId_example"; // The entity for the request. By default, this is the channel ID.
    String merchantTransactionId = "merchantTransactionId_example"; // Merchant-provided reference number unique for your transactions.
    Double amount = 3.4D; // The amount of the payment request. The period is used as the decimal separator.  M-PESA does not support decimal amounts, so Checkout automatically rounds them up. 
    String currency = "ZAR"; // The currency code of the payment request amount.
    String nonce = "nonce_example"; // Unique value to represent each request.
    String shopperResultUrl = "shopperResultUrl_example"; // Checkout uses a POST request to redirect the customer to this URL after the customer completes checkout. Must be a valid URL that can be accessed through a browser.
    String referer = "https://mydemostore.com"; // An allowlisted domain for the merchant.
    String defaultPaymentMethod = "CARD"; // The preferred payment method which is active in the checkout page at the point of redirecting.
    Boolean forceDefaultMethod = false; // Force the default payment method to be the only payment method.
    String merchantInvoiceId = "merchantInvoiceId_example"; // Merchant-provided invoice number unique for your transactions. This identifier is not sent onwards.
    String cancelUrl = "cancelUrl_example"; // The customer is redirected to this URL if they cancel checkout. It must be a valid URL that can be reached through a browser.
    String notificationUrl = "notificationUrl_example"; // Override the preconfigured webhook URL for this checkout instance, any changes to checkout send a webhook to this URL.
    Map<String, String> customParameters = new HashMap(); // A name value pair used for sending custom information.
    CheckoutV2Customer customer = new CheckoutV2Customer();
    CheckoutV2Billing billing = new CheckoutV2Billing();
    CheckoutV2Shipping shipping = new CheckoutV2Shipping();
    Boolean createRegistration = true; // Used to enable card tokenisation with COPYandPAY.
    String originator = "originator_example"; // Used to provide a name for the application that is creating the checkout instance.
    String returnTo = "STORE"; // Text to display on \\\"Return to Store\\\" button on completing checkout.
    try {
      CheckoutV2GenerationInitiateCheckoutInstanceResponse result = client
              .checkoutV2Generation
              .initiateCheckoutInstance(authenticationEntityId, merchantTransactionId, amount, currency, nonce, shopperResultUrl, referer)
              .defaultPaymentMethod(defaultPaymentMethod)
              .forceDefaultMethod(forceDefaultMethod)
              .merchantInvoiceId(merchantInvoiceId)
              .cancelUrl(cancelUrl)
              .notificationUrl(notificationUrl)
              .customParameters(customParameters)
              .customer(customer)
              .billing(billing)
              .shipping(shipping)
              .createRegistration(createRegistration)
              .originator(originator)
              .returnTo(returnTo)
              .execute();
      System.out.println(result);
      System.out.println(result.getCheckoutId());
    } catch (ApiException e) {
      System.err.println("Exception when calling CheckoutV2GenerationApi#initiateCheckoutInstance");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CheckoutV2GenerationInitiateCheckoutInstanceResponse> response = client
              .checkoutV2Generation
              .initiateCheckoutInstance(authenticationEntityId, merchantTransactionId, amount, currency, nonce, shopperResultUrl, referer)
              .defaultPaymentMethod(defaultPaymentMethod)
              .forceDefaultMethod(forceDefaultMethod)
              .merchantInvoiceId(merchantInvoiceId)
              .cancelUrl(cancelUrl)
              .notificationUrl(notificationUrl)
              .customParameters(customParameters)
              .customer(customer)
              .billing(billing)
              .shipping(shipping)
              .createRegistration(createRegistration)
              .originator(originator)
              .returnTo(returnTo)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CheckoutV2GenerationApi#initiateCheckoutInstance");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **referer** | **String**| An allowlisted domain for the merchant. | |
| **checkoutV2** | [**CheckoutV2**](CheckoutV2.md)|  | |

### Return type

[**CheckoutV2GenerationInitiateCheckoutInstanceResponse**](CheckoutV2GenerationInitiateCheckoutInstanceResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Checkout successfully created. |  -  |

