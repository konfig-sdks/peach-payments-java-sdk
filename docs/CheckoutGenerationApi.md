# CheckoutGenerationApi

All URIs are relative to *https://testapi-v2.peachpayments.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**initiatePayment**](CheckoutGenerationApi.md#initiatePayment) | **POST** /checkout | Initiate Checkout |
| [**initiateRedirectCheckout**](CheckoutGenerationApi.md#initiateRedirectCheckout) | **POST** /checkout/initiate | Initiate redirect-based Checkout |
| [**validateRequest**](CheckoutGenerationApi.md#validateRequest) | **POST** /checkout/validate | Validate Checkout request |


<a name="initiatePayment"></a>
# **initiatePayment**
> String initiatePayment(referer, authenticationEntityId, signature, merchantTransactionId, amount, paymentType, currency, nonce, shopperResultUrl, checkout).defaultPaymentMethod(defaultPaymentMethod).forceDefaultMethod(forceDefaultMethod).merchantInvoiceId(merchantInvoiceId).cancelUrl(cancelUrl).notificationUrl(notificationUrl).customParametersName(customParametersName).customerMerchantCustomerId(customerMerchantCustomerId).customerGivenName(customerGivenName).customerSurname(customerSurname).customerMobile(customerMobile).customerEmail(customerEmail).customerStatus(customerStatus).customerBirthDate(customerBirthDate).customerIp(customerIp).customerPhone(customerPhone).customerIdNumber(customerIdNumber).billingStreet1(billingStreet1).billingStreet2(billingStreet2).billingCity(billingCity).billingCompany(billingCompany).billingCountry(billingCountry).billingState(billingState).billingPostcode(billingPostcode).shippingStreet1(shippingStreet1).shippingStreet2(shippingStreet2).shippingCity(shippingCity).shippingCompany(shippingCompany).shippingPostcode(shippingPostcode).shippingCountry(shippingCountry).shippingState(shippingState).cartTax(cartTax).cartShippingAmount(cartShippingAmount).cartDiscount(cartDiscount).createRegistration(createRegistration).originator(originator).returnTo(returnTo).execute();

Initiate Checkout

Load the Checkout frontend to complete a payment. The POST request contains the entityId, signature, purchase parameters, and any custom parameters that a merchant optionally sends.  Sign the data on the backend and execute the POST from the browser.  For more information, see the [documentation](https://developer.peachpayments.com/docs/checkout-payment#form-post-checkout). 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PeachPayments;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CheckoutGenerationApi;
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
    String referer = "https://mydemostore.com"; // An allowlisted domain for the merchant.
    String authenticationEntityId = "authenticationEntityId_example"; // The entity for the request. By default, this is the channel ID.
    String signature = "signature_example"; // Token to verify the integrity of the payment, ensuring that only the merchant sending the request is accepted.
    String merchantTransactionId = "merchantTransactionId_example"; // Merchant-provided reference number unique for your transactions.
    String amount = "amount_example"; // The amount of the payment request. The period is used as the decimal separator. M-PESA does not support decimal amounts, so Checkout automatically rounds them up.
    String paymentType = "DB"; // The payment type for the request. Accepts `DB`.  Does not accept `RG`, but you can tokenise a card by performing a DB with `createRegistration`.  Refund transactions through the Dashboard or as described in the <a href=\\\"https://developer.peachpayments.com/docs/checkout-refund\\\" target=\\\"_blank\\\">documentation</a>. 
    String currency = "ZAR"; // The currency code of the payment request amount.
    String nonce = "nonce_example"; // Unique value to represent each request.
    String shopperResultUrl = "shopperResultUrl_example"; // Checkout uses a POST request to redirect the customer to this URL after the customer completes checkout. Must be a valid URL that can be accessed through a browser.
    String defaultPaymentMethod = "CARD"; // The preferred payment method which is active in the checkout page at the point of redirecting.
    String forceDefaultMethod = "true"; // Force the default payment method to be the only payment method.
    String merchantInvoiceId = "merchantInvoiceId_example"; // Merchant-provided invoice number unique for your transactions. This identifier is not sent onwards.
    String cancelUrl = "cancelUrl_example"; // The customer is redirected to this URL if they cancel checkout. It must be a valid URL that can be reached through a browser.
    String notificationUrl = "notificationUrl_example"; // Override the preconfigured webhook URL for this checkout instance, any changes to checkout will send a webhook to this url.
    String customParametersName = "customParametersName_example"; // A name value pair used for sending custom information.
    String customerMerchantCustomerId = "customerMerchantCustomerId_example"; // An identifier for this customer. Typically this is the ID that identifies the shopper in the shop's system.
    String customerGivenName = "customerGivenName_example"; // The customer's first name or given name.  Required if you send in any other customer parameters, and for some risk checks and payment providers.  Peach Payments recommends including the name so that it displays in the Peach Dashboard and is available for subsequent queries.  Truncated after 48 characters. 
    String customerSurname = "customerSurname_example"; // The customer's last name or surname.  Required if you send in any other customer parameters, and for some risk checks and payment providers.  Peach Payments recommends including the surname so that it displays in the Peach Dashboard and is available for subsequent queries.  Truncated after 48 characters. 
    String customerMobile = "customerMobile_example"; // The customer's mobile number.
    String customerEmail = "customerEmail_example"; // The customer's email address.
    String customerStatus = "NEW"; // The customer's status. Accepts `NEW` or `EXISTING`.
    String customerBirthDate = "customerBirthDate_example"; // The customer's birth date in the yyyy-MM-dd format.
    String customerIp = "customerIp_example"; // The customer's IP address.
    String customerPhone = "customerPhone_example"; // The customer's phone number.
    String customerIdNumber = "customerIdNumber_example"; // The customer's ID number, required for high-risk merchants supporting Capitec Pay.
    String billingStreet1 = "billingStreet1_example"; // The door number, floor, building number, building name, and/or street name of the billing address.
    String billingStreet2 = "billingStreet2_example"; // The adjoining road or locality, if required, of the billing address.
    String billingCity = "billingCity_example"; // The town, district, or city of the billing address.
    String billingCompany = "billingCompany_example"; // The company of the billing address.
    String billingCountry = "billingCountry_example"; // The country of the billing address (ISO 3166-1).
    String billingState = "billingState_example"; // The county, state, or region of the billing address.
    String billingPostcode = "billingPostcode_example"; // The postal code or ZIP code of the billing address.
    String shippingStreet1 = "shippingStreet1_example"; // The door number, floor, building number, building name, and/or street name of the shipping address.
    String shippingStreet2 = "shippingStreet2_example"; // The adjoining road or locality, if required, of the shipping address.
    String shippingCity = "shippingCity_example"; // The town, district, or city of the shipping address.
    String shippingCompany = "shippingCompany_example"; // The company of the shipping address.
    String shippingPostcode = "shippingPostcode_example"; // The postal code or ZIP code of the shipping address.
    String shippingCountry = "shippingCountry_example"; // The country of the shipping address (ISO 3166-1).
    String shippingState = "shippingState_example"; // The county, state, or region of the shipping address.
    String cartTax = "cartTax_example"; // The tax percentage applied to the price of the item in the shopping cart.
    String cartShippingAmount = "cartShippingAmount_example"; // The total amount of the cart item including quantity.
    String cartDiscount = "cartDiscount_example"; // Discount amount applied on order amount.
    String createRegistration = "true"; // Used to enable card tokenisation with COPYandPAY.
    String originator = "originator_example"; // Used to provide a name for the application that is creating the checkout instance.
    String returnTo = "STORE"; // Text to display on \\\"Return to Store\\\" button on completing checkout.
    try {
      String result = client
              .checkoutGeneration
              .initiatePayment(referer, authenticationEntityId, signature, merchantTransactionId, amount, paymentType, currency, nonce, shopperResultUrl)
              .defaultPaymentMethod(defaultPaymentMethod)
              .forceDefaultMethod(forceDefaultMethod)
              .merchantInvoiceId(merchantInvoiceId)
              .cancelUrl(cancelUrl)
              .notificationUrl(notificationUrl)
              .customParametersName(customParametersName)
              .customerMerchantCustomerId(customerMerchantCustomerId)
              .customerGivenName(customerGivenName)
              .customerSurname(customerSurname)
              .customerMobile(customerMobile)
              .customerEmail(customerEmail)
              .customerStatus(customerStatus)
              .customerBirthDate(customerBirthDate)
              .customerIp(customerIp)
              .customerPhone(customerPhone)
              .customerIdNumber(customerIdNumber)
              .billingStreet1(billingStreet1)
              .billingStreet2(billingStreet2)
              .billingCity(billingCity)
              .billingCompany(billingCompany)
              .billingCountry(billingCountry)
              .billingState(billingState)
              .billingPostcode(billingPostcode)
              .shippingStreet1(shippingStreet1)
              .shippingStreet2(shippingStreet2)
              .shippingCity(shippingCity)
              .shippingCompany(shippingCompany)
              .shippingPostcode(shippingPostcode)
              .shippingCountry(shippingCountry)
              .shippingState(shippingState)
              .cartTax(cartTax)
              .cartShippingAmount(cartShippingAmount)
              .cartDiscount(cartDiscount)
              .createRegistration(createRegistration)
              .originator(originator)
              .returnTo(returnTo)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CheckoutGenerationApi#initiatePayment");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .checkoutGeneration
              .initiatePayment(referer, authenticationEntityId, signature, merchantTransactionId, amount, paymentType, currency, nonce, shopperResultUrl)
              .defaultPaymentMethod(defaultPaymentMethod)
              .forceDefaultMethod(forceDefaultMethod)
              .merchantInvoiceId(merchantInvoiceId)
              .cancelUrl(cancelUrl)
              .notificationUrl(notificationUrl)
              .customParametersName(customParametersName)
              .customerMerchantCustomerId(customerMerchantCustomerId)
              .customerGivenName(customerGivenName)
              .customerSurname(customerSurname)
              .customerMobile(customerMobile)
              .customerEmail(customerEmail)
              .customerStatus(customerStatus)
              .customerBirthDate(customerBirthDate)
              .customerIp(customerIp)
              .customerPhone(customerPhone)
              .customerIdNumber(customerIdNumber)
              .billingStreet1(billingStreet1)
              .billingStreet2(billingStreet2)
              .billingCity(billingCity)
              .billingCompany(billingCompany)
              .billingCountry(billingCountry)
              .billingState(billingState)
              .billingPostcode(billingPostcode)
              .shippingStreet1(shippingStreet1)
              .shippingStreet2(shippingStreet2)
              .shippingCity(shippingCity)
              .shippingCompany(shippingCompany)
              .shippingPostcode(shippingPostcode)
              .shippingCountry(shippingCountry)
              .shippingState(shippingState)
              .cartTax(cartTax)
              .cartShippingAmount(cartShippingAmount)
              .cartDiscount(cartDiscount)
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
      System.err.println("Exception when calling CheckoutGenerationApi#initiatePayment");
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
| **authenticationEntityId** | **String**| The entity for the request. By default, this is the channel ID. | |
| **signature** | **String**| Token to verify the integrity of the payment, ensuring that only the merchant sending the request is accepted. | |
| **merchantTransactionId** | **String**| Merchant-provided reference number unique for your transactions. | |
| **amount** | **String**| The amount of the payment request. The period is used as the decimal separator. M-PESA does not support decimal amounts, so Checkout automatically rounds them up. | |
| **paymentType** | **String**| The payment type for the request. Accepts &#x60;DB&#x60;.  Does not accept &#x60;RG&#x60;, but you can tokenise a card by performing a DB with &#x60;createRegistration&#x60;.  Refund transactions through the Dashboard or as described in the &lt;a href&#x3D;\\\&quot;https://developer.peachpayments.com/docs/checkout-refund\\\&quot; target&#x3D;\\\&quot;_blank\\\&quot;&gt;documentation&lt;/a&gt;.  | [enum: DB] |
| **currency** | **String**| The currency code of the payment request amount. | [enum: ZAR, USD, KES, MUR, GBP, EUR] |
| **nonce** | **String**| Unique value to represent each request. | |
| **shopperResultUrl** | **String**| Checkout uses a POST request to redirect the customer to this URL after the customer completes checkout. Must be a valid URL that can be accessed through a browser. | |
| **checkout** | [**Checkout**](Checkout.md)|  | |
| **defaultPaymentMethod** | **String**| The preferred payment method which is active in the checkout page at the point of redirecting. | [optional] [enum: CARD, MASTERPASS, MOBICRED, EFTSECURE, MPESA, 1FORYOU, APLUS, PAYPAL, ZEROPAY, PAYFLEX, FINCHOICEPAY, BLINKBYEMTEL, CAPITECPAY, NEDBANKDIRECTEFT, PAYBYBANK, APPLE PAY, MCBJUICE] |
| **forceDefaultMethod** | **String**| Force the default payment method to be the only payment method. | [optional] [default to false] [enum: true, false] |
| **merchantInvoiceId** | **String**| Merchant-provided invoice number unique for your transactions. This identifier is not sent onwards. | [optional] |
| **cancelUrl** | **String**| The customer is redirected to this URL if they cancel checkout. It must be a valid URL that can be reached through a browser. | [optional] |
| **notificationUrl** | **String**| Override the preconfigured webhook URL for this checkout instance, any changes to checkout will send a webhook to this url. | [optional] |
| **customParametersName** | **String**| A name value pair used for sending custom information. | [optional] |
| **customerMerchantCustomerId** | **String**| An identifier for this customer. Typically this is the ID that identifies the shopper in the shop&#39;s system. | [optional] |
| **customerGivenName** | **String**| The customer&#39;s first name or given name.  Required if you send in any other customer parameters, and for some risk checks and payment providers.  Peach Payments recommends including the name so that it displays in the Peach Dashboard and is available for subsequent queries.  Truncated after 48 characters.  | [optional] |
| **customerSurname** | **String**| The customer&#39;s last name or surname.  Required if you send in any other customer parameters, and for some risk checks and payment providers.  Peach Payments recommends including the surname so that it displays in the Peach Dashboard and is available for subsequent queries.  Truncated after 48 characters.  | [optional] |
| **customerMobile** | **String**| The customer&#39;s mobile number. | [optional] |
| **customerEmail** | **String**| The customer&#39;s email address. | [optional] |
| **customerStatus** | **String**| The customer&#39;s status. Accepts &#x60;NEW&#x60; or &#x60;EXISTING&#x60;. | [optional] [enum: NEW, EXISTING] |
| **customerBirthDate** | **String**| The customer&#39;s birth date in the yyyy-MM-dd format. | [optional] |
| **customerIp** | **String**| The customer&#39;s IP address. | [optional] |
| **customerPhone** | **String**| The customer&#39;s phone number. | [optional] |
| **customerIdNumber** | **String**| The customer&#39;s ID number, required for high-risk merchants supporting Capitec Pay. | [optional] |
| **billingStreet1** | **String**| The door number, floor, building number, building name, and/or street name of the billing address. | [optional] |
| **billingStreet2** | **String**| The adjoining road or locality, if required, of the billing address. | [optional] |
| **billingCity** | **String**| The town, district, or city of the billing address. | [optional] |
| **billingCompany** | **String**| The company of the billing address. | [optional] |
| **billingCountry** | **String**| The country of the billing address (ISO 3166-1). | [optional] |
| **billingState** | **String**| The county, state, or region of the billing address. | [optional] |
| **billingPostcode** | **String**| The postal code or ZIP code of the billing address. | [optional] |
| **shippingStreet1** | **String**| The door number, floor, building number, building name, and/or street name of the shipping address. | [optional] |
| **shippingStreet2** | **String**| The adjoining road or locality, if required, of the shipping address. | [optional] |
| **shippingCity** | **String**| The town, district, or city of the shipping address. | [optional] |
| **shippingCompany** | **String**| The company of the shipping address. | [optional] |
| **shippingPostcode** | **String**| The postal code or ZIP code of the shipping address. | [optional] |
| **shippingCountry** | **String**| The country of the shipping address (ISO 3166-1). | [optional] |
| **shippingState** | **String**| The county, state, or region of the shipping address. | [optional] |
| **cartTax** | **String**| The tax percentage applied to the price of the item in the shopping cart. | [optional] |
| **cartShippingAmount** | **String**| The total amount of the cart item including quantity. | [optional] |
| **cartDiscount** | **String**| Discount amount applied on order amount. | [optional] |
| **createRegistration** | **String**| Used to enable card tokenisation with COPYandPAY. | [optional] [enum: true, false] |
| **originator** | **String**| Used to provide a name for the application that is creating the checkout instance. | [optional] |
| **returnTo** | **String**| Text to display on \\\&quot;Return to Store\\\&quot; button on completing checkout. | [optional] [enum: STORE, INVOICE] |

### Return type

**String**

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: text/html

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Checkout successfully created. |  -  |
| **500** | Internal server error. |  -  |

<a name="initiateRedirectCheckout"></a>
# **initiateRedirectCheckout**
> CheckoutGenerationInitiateRedirectCheckoutResponse initiateRedirectCheckout(referer, checkout).execute();

Initiate redirect-based Checkout

Provide a redirect URL to the caller to redirect the user into the Checkout experience. The POST request contains the entityId, signature, purchase parameters, and any custom parameters that a merchant optionally sends. This allows the checkout instance to be created from a backend without requiring a \&quot;form post\&quot;, or other similar method, from the frontend.  For more information, see the [documentation](https://developer.peachpayments.com/docs/checkout-payment#redirect-based-checkout). 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PeachPayments;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CheckoutGenerationApi;
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
    String signature = "signature_example"; // Token to verify the integrity of the payment, ensuring that only the merchant sending the request is accepted.
    String merchantTransactionId = "merchantTransactionId_example"; // Merchant-provided reference number unique for your transactions.
    String amount = "amount_example"; // The amount of the payment request. The period is used as the decimal separator. M-PESA does not support decimal amounts, so Checkout automatically rounds them up.
    String paymentType = "DB"; // The payment type for the request. Accepts `DB`.  Does not accept `RG`, but you can tokenise a card by performing a DB with `createRegistration`.  Refund transactions through the Dashboard or as described in the <a href=\\\"https://developer.peachpayments.com/docs/checkout-refund\\\" target=\\\"_blank\\\">documentation</a>. 
    String currency = "ZAR"; // The currency code of the payment request amount.
    String nonce = "nonce_example"; // Unique value to represent each request.
    String shopperResultUrl = "shopperResultUrl_example"; // Checkout uses a POST request to redirect the customer to this URL after the customer completes checkout. Must be a valid URL that can be accessed through a browser.
    String referer = "https://mydemostore.com"; // An allowlisted domain for the merchant.
    String defaultPaymentMethod = "CARD"; // The preferred payment method which is active in the checkout page at the point of redirecting.
    String forceDefaultMethod = "true"; // Force the default payment method to be the only payment method.
    String merchantInvoiceId = "merchantInvoiceId_example"; // Merchant-provided invoice number unique for your transactions. This identifier is not sent onwards.
    String cancelUrl = "cancelUrl_example"; // The customer is redirected to this URL if they cancel checkout. It must be a valid URL that can be reached through a browser.
    String notificationUrl = "notificationUrl_example"; // Override the preconfigured webhook URL for this checkout instance, any changes to checkout will send a webhook to this url.
    String customParametersName = "customParametersName_example"; // A name value pair used for sending custom information.
    String customerMerchantCustomerId = "customerMerchantCustomerId_example"; // An identifier for this customer. Typically this is the ID that identifies the shopper in the shop's system.
    String customerGivenName = "customerGivenName_example"; // The customer's first name or given name.  Required if you send in any other customer parameters, and for some risk checks and payment providers.  Peach Payments recommends including the name so that it displays in the Peach Dashboard and is available for subsequent queries.  Truncated after 48 characters. 
    String customerSurname = "customerSurname_example"; // The customer's last name or surname.  Required if you send in any other customer parameters, and for some risk checks and payment providers.  Peach Payments recommends including the surname so that it displays in the Peach Dashboard and is available for subsequent queries.  Truncated after 48 characters. 
    String customerMobile = "customerMobile_example"; // The customer's mobile number.
    String customerEmail = "customerEmail_example"; // The customer's email address.
    String customerStatus = "NEW"; // The customer's status. Accepts `NEW` or `EXISTING`.
    String customerBirthDate = "customerBirthDate_example"; // The customer's birth date in the yyyy-MM-dd format.
    String customerIp = "customerIp_example"; // The customer's IP address.
    String customerPhone = "customerPhone_example"; // The customer's phone number.
    String customerIdNumber = "customerIdNumber_example"; // The customer's ID number, required for high-risk merchants supporting Capitec Pay.
    String billingStreet1 = "billingStreet1_example"; // The door number, floor, building number, building name, and/or street name of the billing address.
    String billingStreet2 = "billingStreet2_example"; // The adjoining road or locality, if required, of the billing address.
    String billingCity = "billingCity_example"; // The town, district, or city of the billing address.
    String billingCompany = "billingCompany_example"; // The company of the billing address.
    String billingCountry = "billingCountry_example"; // The country of the billing address (ISO 3166-1).
    String billingState = "billingState_example"; // The county, state, or region of the billing address.
    String billingPostcode = "billingPostcode_example"; // The postal code or ZIP code of the billing address.
    String shippingStreet1 = "shippingStreet1_example"; // The door number, floor, building number, building name, and/or street name of the shipping address.
    String shippingStreet2 = "shippingStreet2_example"; // The adjoining road or locality, if required, of the shipping address.
    String shippingCity = "shippingCity_example"; // The town, district, or city of the shipping address.
    String shippingCompany = "shippingCompany_example"; // The company of the shipping address.
    String shippingPostcode = "shippingPostcode_example"; // The postal code or ZIP code of the shipping address.
    String shippingCountry = "shippingCountry_example"; // The country of the shipping address (ISO 3166-1).
    String shippingState = "shippingState_example"; // The county, state, or region of the shipping address.
    String cartTax = "cartTax_example"; // The tax percentage applied to the price of the item in the shopping cart.
    String cartShippingAmount = "cartShippingAmount_example"; // The total amount of the cart item including quantity.
    String cartDiscount = "cartDiscount_example"; // Discount amount applied on order amount.
    String createRegistration = "true"; // Used to enable card tokenisation with COPYandPAY.
    String originator = "originator_example"; // Used to provide a name for the application that is creating the checkout instance.
    String returnTo = "STORE"; // Text to display on \\\"Return to Store\\\" button on completing checkout.
    try {
      CheckoutGenerationInitiateRedirectCheckoutResponse result = client
              .checkoutGeneration
              .initiateRedirectCheckout(authenticationEntityId, signature, merchantTransactionId, amount, paymentType, currency, nonce, shopperResultUrl, referer)
              .defaultPaymentMethod(defaultPaymentMethod)
              .forceDefaultMethod(forceDefaultMethod)
              .merchantInvoiceId(merchantInvoiceId)
              .cancelUrl(cancelUrl)
              .notificationUrl(notificationUrl)
              .customParametersName(customParametersName)
              .customerMerchantCustomerId(customerMerchantCustomerId)
              .customerGivenName(customerGivenName)
              .customerSurname(customerSurname)
              .customerMobile(customerMobile)
              .customerEmail(customerEmail)
              .customerStatus(customerStatus)
              .customerBirthDate(customerBirthDate)
              .customerIp(customerIp)
              .customerPhone(customerPhone)
              .customerIdNumber(customerIdNumber)
              .billingStreet1(billingStreet1)
              .billingStreet2(billingStreet2)
              .billingCity(billingCity)
              .billingCompany(billingCompany)
              .billingCountry(billingCountry)
              .billingState(billingState)
              .billingPostcode(billingPostcode)
              .shippingStreet1(shippingStreet1)
              .shippingStreet2(shippingStreet2)
              .shippingCity(shippingCity)
              .shippingCompany(shippingCompany)
              .shippingPostcode(shippingPostcode)
              .shippingCountry(shippingCountry)
              .shippingState(shippingState)
              .cartTax(cartTax)
              .cartShippingAmount(cartShippingAmount)
              .cartDiscount(cartDiscount)
              .createRegistration(createRegistration)
              .originator(originator)
              .returnTo(returnTo)
              .execute();
      System.out.println(result);
      System.out.println(result.getRedirectUrl());
    } catch (ApiException e) {
      System.err.println("Exception when calling CheckoutGenerationApi#initiateRedirectCheckout");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CheckoutGenerationInitiateRedirectCheckoutResponse> response = client
              .checkoutGeneration
              .initiateRedirectCheckout(authenticationEntityId, signature, merchantTransactionId, amount, paymentType, currency, nonce, shopperResultUrl, referer)
              .defaultPaymentMethod(defaultPaymentMethod)
              .forceDefaultMethod(forceDefaultMethod)
              .merchantInvoiceId(merchantInvoiceId)
              .cancelUrl(cancelUrl)
              .notificationUrl(notificationUrl)
              .customParametersName(customParametersName)
              .customerMerchantCustomerId(customerMerchantCustomerId)
              .customerGivenName(customerGivenName)
              .customerSurname(customerSurname)
              .customerMobile(customerMobile)
              .customerEmail(customerEmail)
              .customerStatus(customerStatus)
              .customerBirthDate(customerBirthDate)
              .customerIp(customerIp)
              .customerPhone(customerPhone)
              .customerIdNumber(customerIdNumber)
              .billingStreet1(billingStreet1)
              .billingStreet2(billingStreet2)
              .billingCity(billingCity)
              .billingCompany(billingCompany)
              .billingCountry(billingCountry)
              .billingState(billingState)
              .billingPostcode(billingPostcode)
              .shippingStreet1(shippingStreet1)
              .shippingStreet2(shippingStreet2)
              .shippingCity(shippingCity)
              .shippingCompany(shippingCompany)
              .shippingPostcode(shippingPostcode)
              .shippingCountry(shippingCountry)
              .shippingState(shippingState)
              .cartTax(cartTax)
              .cartShippingAmount(cartShippingAmount)
              .cartDiscount(cartDiscount)
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
      System.err.println("Exception when calling CheckoutGenerationApi#initiateRedirectCheckout");
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
| **checkout** | [**Checkout**](Checkout.md)|  | |

### Return type

[**CheckoutGenerationInitiateRedirectCheckoutResponse**](CheckoutGenerationInitiateRedirectCheckoutResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Request processed successfully. |  -  |
| **400** | Invalid authentication information. |  -  |
| **500** | Internal server error. |  -  |

<a name="validateRequest"></a>
# **validateRequest**
> MessageResponse validateRequest(referer, checkout).execute();

Validate Checkout request

Validate a request before trying to initiate a checkout session.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PeachPayments;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CheckoutGenerationApi;
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
    String signature = "signature_example"; // Token to verify the integrity of the payment, ensuring that only the merchant sending the request is accepted.
    String merchantTransactionId = "merchantTransactionId_example"; // Merchant-provided reference number unique for your transactions.
    String amount = "amount_example"; // The amount of the payment request. The period is used as the decimal separator. M-PESA does not support decimal amounts, so Checkout automatically rounds them up.
    String paymentType = "DB"; // The payment type for the request. Accepts `DB`.  Does not accept `RG`, but you can tokenise a card by performing a DB with `createRegistration`.  Refund transactions through the Dashboard or as described in the <a href=\\\"https://developer.peachpayments.com/docs/checkout-refund\\\" target=\\\"_blank\\\">documentation</a>. 
    String currency = "ZAR"; // The currency code of the payment request amount.
    String nonce = "nonce_example"; // Unique value to represent each request.
    String shopperResultUrl = "shopperResultUrl_example"; // Checkout uses a POST request to redirect the customer to this URL after the customer completes checkout. Must be a valid URL that can be accessed through a browser.
    String referer = "https://mydemostore.com"; // An allowlisted domain for the merchant.
    String defaultPaymentMethod = "CARD"; // The preferred payment method which is active in the checkout page at the point of redirecting.
    String forceDefaultMethod = "true"; // Force the default payment method to be the only payment method.
    String merchantInvoiceId = "merchantInvoiceId_example"; // Merchant-provided invoice number unique for your transactions. This identifier is not sent onwards.
    String cancelUrl = "cancelUrl_example"; // The customer is redirected to this URL if they cancel checkout. It must be a valid URL that can be reached through a browser.
    String notificationUrl = "notificationUrl_example"; // Override the preconfigured webhook URL for this checkout instance, any changes to checkout will send a webhook to this url.
    String customParametersName = "customParametersName_example"; // A name value pair used for sending custom information.
    String customerMerchantCustomerId = "customerMerchantCustomerId_example"; // An identifier for this customer. Typically this is the ID that identifies the shopper in the shop's system.
    String customerGivenName = "customerGivenName_example"; // The customer's first name or given name.  Required if you send in any other customer parameters, and for some risk checks and payment providers.  Peach Payments recommends including the name so that it displays in the Peach Dashboard and is available for subsequent queries.  Truncated after 48 characters. 
    String customerSurname = "customerSurname_example"; // The customer's last name or surname.  Required if you send in any other customer parameters, and for some risk checks and payment providers.  Peach Payments recommends including the surname so that it displays in the Peach Dashboard and is available for subsequent queries.  Truncated after 48 characters. 
    String customerMobile = "customerMobile_example"; // The customer's mobile number.
    String customerEmail = "customerEmail_example"; // The customer's email address.
    String customerStatus = "NEW"; // The customer's status. Accepts `NEW` or `EXISTING`.
    String customerBirthDate = "customerBirthDate_example"; // The customer's birth date in the yyyy-MM-dd format.
    String customerIp = "customerIp_example"; // The customer's IP address.
    String customerPhone = "customerPhone_example"; // The customer's phone number.
    String customerIdNumber = "customerIdNumber_example"; // The customer's ID number, required for high-risk merchants supporting Capitec Pay.
    String billingStreet1 = "billingStreet1_example"; // The door number, floor, building number, building name, and/or street name of the billing address.
    String billingStreet2 = "billingStreet2_example"; // The adjoining road or locality, if required, of the billing address.
    String billingCity = "billingCity_example"; // The town, district, or city of the billing address.
    String billingCompany = "billingCompany_example"; // The company of the billing address.
    String billingCountry = "billingCountry_example"; // The country of the billing address (ISO 3166-1).
    String billingState = "billingState_example"; // The county, state, or region of the billing address.
    String billingPostcode = "billingPostcode_example"; // The postal code or ZIP code of the billing address.
    String shippingStreet1 = "shippingStreet1_example"; // The door number, floor, building number, building name, and/or street name of the shipping address.
    String shippingStreet2 = "shippingStreet2_example"; // The adjoining road or locality, if required, of the shipping address.
    String shippingCity = "shippingCity_example"; // The town, district, or city of the shipping address.
    String shippingCompany = "shippingCompany_example"; // The company of the shipping address.
    String shippingPostcode = "shippingPostcode_example"; // The postal code or ZIP code of the shipping address.
    String shippingCountry = "shippingCountry_example"; // The country of the shipping address (ISO 3166-1).
    String shippingState = "shippingState_example"; // The county, state, or region of the shipping address.
    String cartTax = "cartTax_example"; // The tax percentage applied to the price of the item in the shopping cart.
    String cartShippingAmount = "cartShippingAmount_example"; // The total amount of the cart item including quantity.
    String cartDiscount = "cartDiscount_example"; // Discount amount applied on order amount.
    String createRegistration = "true"; // Used to enable card tokenisation with COPYandPAY.
    String originator = "originator_example"; // Used to provide a name for the application that is creating the checkout instance.
    String returnTo = "STORE"; // Text to display on \\\"Return to Store\\\" button on completing checkout.
    try {
      MessageResponse result = client
              .checkoutGeneration
              .validateRequest(authenticationEntityId, signature, merchantTransactionId, amount, paymentType, currency, nonce, shopperResultUrl, referer)
              .defaultPaymentMethod(defaultPaymentMethod)
              .forceDefaultMethod(forceDefaultMethod)
              .merchantInvoiceId(merchantInvoiceId)
              .cancelUrl(cancelUrl)
              .notificationUrl(notificationUrl)
              .customParametersName(customParametersName)
              .customerMerchantCustomerId(customerMerchantCustomerId)
              .customerGivenName(customerGivenName)
              .customerSurname(customerSurname)
              .customerMobile(customerMobile)
              .customerEmail(customerEmail)
              .customerStatus(customerStatus)
              .customerBirthDate(customerBirthDate)
              .customerIp(customerIp)
              .customerPhone(customerPhone)
              .customerIdNumber(customerIdNumber)
              .billingStreet1(billingStreet1)
              .billingStreet2(billingStreet2)
              .billingCity(billingCity)
              .billingCompany(billingCompany)
              .billingCountry(billingCountry)
              .billingState(billingState)
              .billingPostcode(billingPostcode)
              .shippingStreet1(shippingStreet1)
              .shippingStreet2(shippingStreet2)
              .shippingCity(shippingCity)
              .shippingCompany(shippingCompany)
              .shippingPostcode(shippingPostcode)
              .shippingCountry(shippingCountry)
              .shippingState(shippingState)
              .cartTax(cartTax)
              .cartShippingAmount(cartShippingAmount)
              .cartDiscount(cartDiscount)
              .createRegistration(createRegistration)
              .originator(originator)
              .returnTo(returnTo)
              .execute();
      System.out.println(result);
      System.out.println(result.getMessage());
    } catch (ApiException e) {
      System.err.println("Exception when calling CheckoutGenerationApi#validateRequest");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MessageResponse> response = client
              .checkoutGeneration
              .validateRequest(authenticationEntityId, signature, merchantTransactionId, amount, paymentType, currency, nonce, shopperResultUrl, referer)
              .defaultPaymentMethod(defaultPaymentMethod)
              .forceDefaultMethod(forceDefaultMethod)
              .merchantInvoiceId(merchantInvoiceId)
              .cancelUrl(cancelUrl)
              .notificationUrl(notificationUrl)
              .customParametersName(customParametersName)
              .customerMerchantCustomerId(customerMerchantCustomerId)
              .customerGivenName(customerGivenName)
              .customerSurname(customerSurname)
              .customerMobile(customerMobile)
              .customerEmail(customerEmail)
              .customerStatus(customerStatus)
              .customerBirthDate(customerBirthDate)
              .customerIp(customerIp)
              .customerPhone(customerPhone)
              .customerIdNumber(customerIdNumber)
              .billingStreet1(billingStreet1)
              .billingStreet2(billingStreet2)
              .billingCity(billingCity)
              .billingCompany(billingCompany)
              .billingCountry(billingCountry)
              .billingState(billingState)
              .billingPostcode(billingPostcode)
              .shippingStreet1(shippingStreet1)
              .shippingStreet2(shippingStreet2)
              .shippingCity(shippingCity)
              .shippingCompany(shippingCompany)
              .shippingPostcode(shippingPostcode)
              .shippingCountry(shippingCountry)
              .shippingState(shippingState)
              .cartTax(cartTax)
              .cartShippingAmount(cartShippingAmount)
              .cartDiscount(cartDiscount)
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
      System.err.println("Exception when calling CheckoutGenerationApi#validateRequest");
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
| **checkout** | [**Checkout**](Checkout.md)|  | |

### Return type

[**MessageResponse**](MessageResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Valid request. |  -  |
| **500** | Internal server error. |  -  |

