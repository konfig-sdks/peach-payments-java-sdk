# PaymentApi

All URIs are relative to *https://testapi-v2.peachpayments.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cancelLink**](PaymentApi.md#cancelLink) | **DELETE** /api/payments/{paymentId} | Cancel link |
| [**generateLink**](PaymentApi.md#generateLink) | **POST** /api/channels/{entityId}/payments | Generate link |
| [**getAllPaymentLinks**](PaymentApi.md#getAllPaymentLinks) | **GET** /api/payments | Retrieve or export all payment links |


<a name="cancelLink"></a>
# **cancelLink**
> MessageResponse cancelLink(paymentId).execute();

Cancel link

Cancel a previously-generated link by supplying the unique paymentId which is returned to you in the payment response.  For more information, see the [documentation](https://developer.peachpayments.com/docs/cancel-link). 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PeachPayments;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PaymentApi;
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
    String paymentId = "b95d6888-591b-4538-b508-6102cf1259c9"; // The ID of the payment. Returned when creating a new payment.
    try {
      MessageResponse result = client
              .payment
              .cancelLink(paymentId)
              .execute();
      System.out.println(result);
      System.out.println(result.getMessage());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#cancelLink");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MessageResponse> response = client
              .payment
              .cancelLink(paymentId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#cancelLink");
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
| **paymentId** | **String**| The ID of the payment. Returned when creating a new payment. | |

### Return type

[**MessageResponse**](MessageResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK. |  -  |

<a name="generateLink"></a>
# **generateLink**
> GenerateLinkResponse generateLink(entityId, generateLinkPayment).execute();

Generate link

Generate a unique payment link for a transaction and optionally send this link to the recipient via email, SMS, WhatsApp, or a combination of the three.  For more information, see the [documentation](https://developer.peachpayments.com/docs/generate-link-1). 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PeachPayments;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PaymentApi;
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
    GenerateLinkPaymentPayment payment = new GenerateLinkPaymentPayment();
    Customer customer = new Customer();
    PaymentOptions options = new PaymentOptions();
    CheckoutOptions checkout = new CheckoutOptions();
    String entityId = "8ac7a4ca694cec2601694cf5f9360026"; // The entity for the request.
    try {
      GenerateLinkResponse result = client
              .payment
              .generateLink(payment, customer, options, checkout, entityId)
              .execute();
      System.out.println(result);
      System.out.println(result.getUrl());
      System.out.println(result.getId());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#generateLink");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GenerateLinkResponse> response = client
              .payment
              .generateLink(payment, customer, options, checkout, entityId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#generateLink");
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
| **entityId** | **String**| The entity for the request. | |
| **generateLinkPayment** | [**GenerateLinkPayment**](GenerateLinkPayment.md)|  | |

### Return type

[**GenerateLinkResponse**](GenerateLinkResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK. |  -  |

<a name="getAllPaymentLinks"></a>
# **getAllPaymentLinks**
> PaymentGetAllPaymentLinksResponse getAllPaymentLinks().merchant(merchant).offset(offset).perPage(perPage).filtersStartDate(filtersStartDate).filtersEndDate(filtersEndDate).filtersStatus(filtersStatus).filtersAmountValue(filtersAmountValue).filtersAmountOperator(filtersAmountOperator).filtersSendingOptions(filtersSendingOptions).execute();

Retrieve or export all payment links

Retrieve a paginated list or export a CSV of all payment links. To export to CSV, change the request header&#39;s &#x60;Accept&#x60; value to &#x60;text/csv&#x60;. For more information, see the [documentation](https://developer.peachpayments.com/docs/retrieve-all-payment-links), or to try it out, see our [Postman collection](https://www.postman.com/peachpayments/workspace/peach-payments-public-workspace/request/13324425-265d80b0-5baa-478b-be10-debc942ca8f3).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PeachPayments;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PaymentApi;
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
    String merchant = "9f6ea39b121d11e89d9774d4352a31dz"; // The unique merchant ID to scope the list to. Required if you're exporting payment links to CSV.
    Integer offset = 0; // The offset from which to read data.
    Integer perPage = 50; // The amount of items to retrieve.
    OffsetDateTime filtersStartDate = OffsetDateTime.parse("2018-03-20T09:12:28Z"); // Retrieve all payment links from the start date onwards.
    OffsetDateTime filtersEndDate = OffsetDateTime.parse("2018-03-20T09:12:28Z"); // Retrieve all payment links until the end date.
    String filtersStatus = "initiated"; // The payment link status to filter on.
    Double filtersAmountValue = 100D; // The amount to filter by.
    String filtersAmountOperator = "lt"; // How to use the amountValue for filtering.
    String filtersSendingOptions = "sendEmail"; // The sending option to filter on.
    try {
      PaymentGetAllPaymentLinksResponse result = client
              .payment
              .getAllPaymentLinks()
              .merchant(merchant)
              .offset(offset)
              .perPage(perPage)
              .filtersStartDate(filtersStartDate)
              .filtersEndDate(filtersEndDate)
              .filtersStatus(filtersStatus)
              .filtersAmountValue(filtersAmountValue)
              .filtersAmountOperator(filtersAmountOperator)
              .filtersSendingOptions(filtersSendingOptions)
              .execute();
      System.out.println(result);
      System.out.println(result.getPayments());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#getAllPaymentLinks");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PaymentGetAllPaymentLinksResponse> response = client
              .payment
              .getAllPaymentLinks()
              .merchant(merchant)
              .offset(offset)
              .perPage(perPage)
              .filtersStartDate(filtersStartDate)
              .filtersEndDate(filtersEndDate)
              .filtersStatus(filtersStatus)
              .filtersAmountValue(filtersAmountValue)
              .filtersAmountOperator(filtersAmountOperator)
              .filtersSendingOptions(filtersSendingOptions)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#getAllPaymentLinks");
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
| **merchant** | **String**| The unique merchant ID to scope the list to. Required if you&#39;re exporting payment links to CSV. | [optional] |
| **offset** | **Integer**| The offset from which to read data. | [optional] [default to 0] |
| **perPage** | **Integer**| The amount of items to retrieve. | [optional] [default to 50] |
| **filtersStartDate** | **OffsetDateTime**| Retrieve all payment links from the start date onwards. | [optional] |
| **filtersEndDate** | **OffsetDateTime**| Retrieve all payment links until the end date. | [optional] |
| **filtersStatus** | **String**| The payment link status to filter on. | [optional] [enum: initiated, processing, expired, cancelled, completed] |
| **filtersAmountValue** | **Double**| The amount to filter by. | [optional] |
| **filtersAmountOperator** | **String**| How to use the amountValue for filtering. | [optional] [enum: lt, lte, gt, gte, eq] |
| **filtersSendingOptions** | **String**| The sending option to filter on. | [optional] [enum: sendEmail, sendSms, sendWhatsapp, emailCc, emailBcc] |

### Return type

[**PaymentGetAllPaymentLinksResponse**](PaymentGetAllPaymentLinksResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/csv

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK. |  -  |

