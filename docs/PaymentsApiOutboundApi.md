# PaymentsApiOutboundApi

All URIs are relative to *https://testapi-v2.peachpayments.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**webhook**](PaymentsApiOutboundApi.md#webhook) | **POST** / | Merchant webhook |


<a name="webhook"></a>
# **webhook**
> webhook().xInitializationVector(xInitializationVector).xAuthenticationTag(xAuthenticationTag).jsONMerchantWebhook(jsONMerchantWebhook).execute();

Merchant webhook

Encrypted and decrypted webhook sent to merchant - retries if response HTTP status code is not 200.  For more information, see the [documentation](https://developer.peachpayments.com/docs/payments-api-flows#webhook-flow). 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PeachPayments;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PaymentsApiOutboundApi;
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
    String encryptedData = "encryptedData_example"; // Encrypted webhook data ciphertext.
    String xInitializationVector = "34ba8cf802216b4fab4c3f1z";
    String xAuthenticationTag = "50d697553c37c1f9865acc3dc0f8b5az";
    try {
      client
              .paymentsApiOutbound
              .webhook()
              .encryptedData(encryptedData)
              .xInitializationVector(xInitializationVector)
              .xAuthenticationTag(xAuthenticationTag)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentsApiOutboundApi#webhook");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .paymentsApiOutbound
              .webhook()
              .encryptedData(encryptedData)
              .xInitializationVector(xInitializationVector)
              .xAuthenticationTag(xAuthenticationTag)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentsApiOutboundApi#webhook");
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
| **xInitializationVector** | **String**|  | [optional] |
| **xAuthenticationTag** | **String**|  | [optional] |
| **jsONMerchantWebhook** | [**JSONMerchantWebhook**](JSONMerchantWebhook.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json, text/plain
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK. |  -  |

