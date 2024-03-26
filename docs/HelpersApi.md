# HelpersApi

All URIs are relative to *https://testapi-v2.peachpayments.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getPaymentMethods**](HelpersApi.md#getPaymentMethods) | **POST** /merchant_specs | Retrieve a list of payment methods for a currency |


<a name="getPaymentMethods"></a>
# **getPaymentMethods**
> getPaymentMethods(helpersGetPaymentMethodsRequest).execute();

Retrieve a list of payment methods for a currency

Retrieve a list of enabled payment methods for a channel given a particular currency.  For more information, see the [documentation](https://developer.peachpayments.com/docs/checkout-merchant-specs).  

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PeachPayments;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.HelpersApi;
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
    String authenticationEntityId = "authenticationEntityId_example";
    String signature = "signature_example"; // Token to verify the integrity of the request, ensuring that only the merchant sending the request is accepted.
    String currency = "currency_example"; // Three-letter ISO 4217 currency code.
    try {
      client
              .helpers
              .getPaymentMethods(authenticationEntityId, signature, currency)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling HelpersApi#getPaymentMethods");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .helpers
              .getPaymentMethods(authenticationEntityId, signature, currency)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling HelpersApi#getPaymentMethods");
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
| **helpersGetPaymentMethodsRequest** | [**HelpersGetPaymentMethodsRequest**](HelpersGetPaymentMethodsRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Request processed successfully. |  -  |
| **400** | Invalid authentication information. |  -  |
| **500** | Internal server error. |  -  |

