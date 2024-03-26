# StatusApi

All URIs are relative to *https://testapi-v2.peachpayments.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**checkoutStatusGet**](StatusApi.md#checkoutStatusGet) | **GET** /status | Query Checkout status |
| [**queryPaymentStatus**](StatusApi.md#queryPaymentStatus) | **GET** /api/payments/{paymentId} | Query payment status |


<a name="checkoutStatusGet"></a>
# **checkoutStatusGet**
> CheckoutStatus checkoutStatusGet(authenticationEntityId, signature).checkoutId(checkoutId).merchantTransactionId(merchantTransactionId).execute();

Query Checkout status

Get the status of a checkout instance.  For more information, see the [documentation](https://developer.peachpayments.com/docs/checkout-payment-status). 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PeachPayments;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.StatusApi;
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
    String authenticationEntityId = "8ac7a4ca68c22c4d0168c2caab2e0025"; // Merchant's entity ID.
    String signature = "a668342244a9c77b08a2f9090d033d6e2610b431a5c0ca975f32035ed06164f4"; // Signature of data signed with secret key of merchant.
    String checkoutId = "948cc8dec52a11eb85290242ac130003"; // Checkout ID.
    String merchantTransactionId = "OrderNo453432"; // Merchant transaction ID.
    try {
      CheckoutStatus result = client
              .status
              .checkoutStatusGet(authenticationEntityId, signature)
              .checkoutId(checkoutId)
              .merchantTransactionId(merchantTransactionId)
              .execute();
      System.out.println(result);
      System.out.println(result.getStatus());
      System.out.println(result.getTimestamp());
      System.out.println(result.getRedirectUrl());
      System.out.println(result.getRedirectPostData());
    } catch (ApiException e) {
      System.err.println("Exception when calling StatusApi#checkoutStatusGet");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CheckoutStatus> response = client
              .status
              .checkoutStatusGet(authenticationEntityId, signature)
              .checkoutId(checkoutId)
              .merchantTransactionId(merchantTransactionId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling StatusApi#checkoutStatusGet");
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
| **authenticationEntityId** | **String**| Merchant&#39;s entity ID. | |
| **signature** | **String**| Signature of data signed with secret key of merchant. | |
| **checkoutId** | **String**| Checkout ID. | [optional] |
| **merchantTransactionId** | **String**| Merchant transaction ID. | [optional] |

### Return type

[**CheckoutStatus**](CheckoutStatus.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK. |  -  |
| **500** | Internal server error. |  -  |

<a name="queryPaymentStatus"></a>
# **queryPaymentStatus**
> StatusQueryPaymentStatusResponse queryPaymentStatus(paymentId).execute();

Query payment status

Query the status of a payment.  For more information, see the [documentation](https://developer.peachpayments.com/docs/query-payment). 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PeachPayments;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.StatusApi;
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
    String paymentId = "b95d6888-591b-4538-b508-6102cf1259c9"; // Payment ID. Returned when creating a new payment.
    try {
      StatusQueryPaymentStatusResponse result = client
              .status
              .queryPaymentStatus(paymentId)
              .execute();
      System.out.println(result);
      System.out.println(result.getPayment());
      System.out.println(result.getAudit());
    } catch (ApiException e) {
      System.err.println("Exception when calling StatusApi#queryPaymentStatus");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<StatusQueryPaymentStatusResponse> response = client
              .status
              .queryPaymentStatus(paymentId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling StatusApi#queryPaymentStatus");
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
| **paymentId** | **String**| Payment ID. Returned when creating a new payment. | |

### Return type

[**StatusQueryPaymentStatusResponse**](StatusQueryPaymentStatusResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK. |  -  |

