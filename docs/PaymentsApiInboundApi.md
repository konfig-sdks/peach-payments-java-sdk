# PaymentsApiInboundApi

All URIs are relative to *https://testapi-v2.peachpayments.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**initiateDebitTransaction**](PaymentsApiInboundApi.md#initiateDebitTransaction) | **POST** /payments | Payment |
| [**queryTransactionById**](PaymentsApiInboundApi.md#queryTransactionById) | **GET** /payments/{uniqueId} | Query a transaction by transaction ID |
| [**refundTransaction**](PaymentsApiInboundApi.md#refundTransaction) | **POST** /payments/{uniqueId} | Refund |
| [**status**](PaymentsApiInboundApi.md#status) | **GET** /payments | Query a transaction by merchantTransactionId |


<a name="initiateDebitTransaction"></a>
# **initiateDebitTransaction**
> EPResponse initiateDebitTransaction().paymentRequest(paymentRequest).execute();

Payment

Initiate a debit transaction.  Certain parameters are mandatory for specific payment methods and certain parameters act differently depending on the payment method.   - For 1Voucher, &#x60;customer.mobile&#x60; (the customer&#39;s phone number for receiving change vouchers and refunds) and &#x60;virtualAccount.password&#x60; (the voucher PIN) are mandatory. - For M-PESA, &#x60;virtualAccount.accountId&#x60; (the customer&#39;s 12-digit phone number) is mandatory. M-PESA only accepts integer amounts, not decimals, so round up your amount. - For blink by Emtel and MCB Juice, &#x60;virtualAccount.accountId&#x60; (the customer&#39;s 8-digit phone number) is mandatory. - For Mobicred, &#x60;virtualAccount.accountId&#x60; (the customer&#39;s Mobicred email address) and &#x60;virtualAccount.password&#x60; (the customer&#39;s Mobicred password) are mandatory. - For Capitec Pay, &#x60;virtualAccount.type&#x60; (the customer&#39;s identifier type; &#x60;IDNUMBER&#x60;, &#x60;CELLPHONE&#x60;, or &#x60;ACCOUNTNUMBER&#x60;) and &#x60;virtualAccount.accountId&#x60; (the customer&#39;s 13-digit ID number, 10-digit phone number starting with &#x60;0&#x60;, or up-to 64-digit, alphanumeric bank account number) are mandatory. High-risk merchants must provide the verified &#x60;IDNUMBER&#x60; and cannot use the &#x60;CELLPHONE&#x60; or &#x60;ACCOUNTNUMBER&#x60; account types. - For EFTsecure, Payflex, ZeroPay, FinChoicePay, Scan to Pay, M-PESA, blink by Emtel, Mobicred, Capitec Pay, Nebank Direct EFT, and MCB Juice, the &#x60;shopperResultUrl&#x60; is mandatory.  For more information, see the [documentation](https://developer.peachpayments.com/docs/payments-api-flows#payment-flow) and for sample calls, see our [public Postman collection](https://www.postman.com/peachpayments/workspace/peach-payments-public-workspace/request/13324425-693c4b18-dad5-4b6f-aeb0-99bc28b94812). 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PeachPayments;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PaymentsApiInboundApi;
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
    Authentication authentication = new Authentication();
    String merchantTransactionId = "merchantTransactionId_example"; // Merchant-provided reference number, often used for reconciliation.
    String amount = "amount_example"; // The payment request amount.
    String currency = "currency_example"; // The currency code of the payment request amount as defined by ISO-4217.
    PaymentBrand paymentBrand = PaymentBrand.fromValue("EFTSECURE");
    PaymentType paymentType = PaymentType.fromValue("DB");
    VirtualAccount virtualAccount = new VirtualAccount();
    Address shipping = new Address();
    Address billing = new Address();
    Shopify shopify = new Shopify();
    Customer customer = new Customer();
    Cart cart = new Cart();
    String merchantInvoiceId = "merchantInvoiceId_example"; // The merchant's invoice ID.
    URI shopperResultUrl = new URI(); // The Payments API redirects the user to this URL after processing the payment request.
    try {
      EPResponse result = client
              .paymentsApiInbound
              .initiateDebitTransaction(authentication, merchantTransactionId, amount, currency, paymentBrand, paymentType)
              .virtualAccount(virtualAccount)
              .shipping(shipping)
              .billing(billing)
              .shopify(shopify)
              .customer(customer)
              .cart(cart)
              .merchantInvoiceId(merchantInvoiceId)
              .shopperResultUrl(shopperResultUrl)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentsApiInboundApi#initiateDebitTransaction");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EPResponse> response = client
              .paymentsApiInbound
              .initiateDebitTransaction(authentication, merchantTransactionId, amount, currency, paymentBrand, paymentType)
              .virtualAccount(virtualAccount)
              .shipping(shipping)
              .billing(billing)
              .shopify(shopify)
              .customer(customer)
              .cart(cart)
              .merchantInvoiceId(merchantInvoiceId)
              .shopperResultUrl(shopperResultUrl)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentsApiInboundApi#initiateDebitTransaction");
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
| **paymentRequest** | [**PaymentRequest**](PaymentRequest.md)|  | [optional] |

### Return type

[**EPResponse**](EPResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK. |  -  |

<a name="queryTransactionById"></a>
# **queryTransactionById**
> TransactionIdStatusResponse queryTransactionById(uniqueId, authenticationEntityId, authenticationUserId, authenticationPassword).execute();

Query a transaction by transaction ID

Query the status of a transaction using the Peach Payments unique ID.  For more information, see the [documentation](https://developer.peachpayments.com/docs/payments-api-flows#transaction-status-flow). 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PeachPayments;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PaymentsApiInboundApi;
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
    String uniqueId = "uniqueId_example"; // The Peach Payments unique ID for the transaction.
    String authenticationEntityId = "authenticationEntityId_example"; // Authentication entityId.
    String authenticationUserId = "authenticationUserId_example"; // Authentication userId.
    String authenticationPassword = "authenticationPassword_example"; // Authentication password.
    try {
      TransactionIdStatusResponse result = client
              .paymentsApiInbound
              .queryTransactionById(uniqueId, authenticationEntityId, authenticationUserId, authenticationPassword)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getMerchantTransactionId());
      System.out.println(result.getAmount());
      System.out.println(result.getCurrency());
      System.out.println(result.getPaymentBrand());
      System.out.println(result.getPaymentType());
      System.out.println(result.getResult());
      System.out.println(result.getResultDetails());
      System.out.println(result.getConnectorTxID1());
      System.out.println(result.getTimestamp());
      System.out.println(result.getCustomParameters());
      System.out.println(result.getMerchantInvoiceId());
      System.out.println(result.getBank());
      System.out.println(result.getCard());
      System.out.println(result.getRecon());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentsApiInboundApi#queryTransactionById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TransactionIdStatusResponse> response = client
              .paymentsApiInbound
              .queryTransactionById(uniqueId, authenticationEntityId, authenticationUserId, authenticationPassword)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentsApiInboundApi#queryTransactionById");
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
| **uniqueId** | **String**| The Peach Payments unique ID for the transaction. | |
| **authenticationEntityId** | **String**| Authentication entityId. | |
| **authenticationUserId** | **String**| Authentication userId. | |
| **authenticationPassword** | **String**| Authentication password. | |

### Return type

[**TransactionIdStatusResponse**](TransactionIdStatusResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK. |  -  |

<a name="refundTransaction"></a>
# **refundTransaction**
> REResponse refundTransaction(uniqueId).refundRequest(refundRequest).execute();

Refund

Refund a successful debit transaction. You can only refund [certain payment methods](https://developer.peachpayments.com/docs/pp-payment-methods).  For more information, see the [documentation](https://developer.peachpayments.com/docs/payments-api-flows#refund-flow). 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PeachPayments;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PaymentsApiInboundApi;
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
    Authentication authentication = new Authentication();
    String amount = "amount_example"; // The payment request amount.
    String currency = "currency_example"; // The currency code of the payment request amount as defined by ISO-4217.
    RefundPaymentType paymentType = RefundPaymentType.fromValue("RF");
    String uniqueId = "uniqueId_example"; // The Peach Payments unique ID of the original debit transaction.
    try {
      REResponse result = client
              .paymentsApiInbound
              .refundTransaction(authentication, amount, currency, paymentType, uniqueId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getAmount());
      System.out.println(result.getCurrency());
      System.out.println(result.getPaymentBrand());
      System.out.println(result.getPaymentType());
      System.out.println(result.getResult());
      System.out.println(result.getResultDetails());
      System.out.println(result.getConnectorTxID1());
      System.out.println(result.getTimestamp());
      System.out.println(result.getCustomParameters());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentsApiInboundApi#refundTransaction");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<REResponse> response = client
              .paymentsApiInbound
              .refundTransaction(authentication, amount, currency, paymentType, uniqueId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentsApiInboundApi#refundTransaction");
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
| **uniqueId** | **String**| The Peach Payments unique ID of the original debit transaction. | |
| **refundRequest** | [**RefundRequest**](RefundRequest.md)|  | [optional] |

### Return type

[**REResponse**](REResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK. |  -  |

<a name="status"></a>
# **status**
> MerchantTransactionIdStatusResponse status(authenticationUserId, authenticationPassword, authenticationEntityId, merchantTransactionId).execute();

Query a transaction by merchantTransactionId

Query the status of a transaction using the merchantTransactionId. Could return multiple results.  For more information, see the [documentation](https://developer.peachpayments.com/docs/payments-api-flows#transaction-status-flow). 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PeachPayments;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PaymentsApiInboundApi;
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
    String authenticationUserId = "authenticationUserId_example";
    String authenticationPassword = "authenticationPassword_example";
    String authenticationEntityId = "authenticationEntityId_example";
    String merchantTransactionId = "merchantTransactionId_example";
    try {
      MerchantTransactionIdStatusResponse result = client
              .paymentsApiInbound
              .status(authenticationUserId, authenticationPassword, authenticationEntityId, merchantTransactionId)
              .execute();
      System.out.println(result);
      System.out.println(result.getResult());
      System.out.println(result.getTimestamp());
      System.out.println(result.getPayments());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentsApiInboundApi#status");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MerchantTransactionIdStatusResponse> response = client
              .paymentsApiInbound
              .status(authenticationUserId, authenticationPassword, authenticationEntityId, merchantTransactionId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentsApiInboundApi#status");
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
| **authenticationUserId** | **String**|  | |
| **authenticationPassword** | **String**|  | |
| **authenticationEntityId** | **String**|  | |
| **merchantTransactionId** | **String**|  | |

### Return type

[**MerchantTransactionIdStatusResponse**](MerchantTransactionIdStatusResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK. |  -  |

