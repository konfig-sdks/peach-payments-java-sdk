<div align="left">

[![Visit Peach payments](./header.png)](https://www.peachpayments.com&#x2F;)

# [Peach payments](https://www.peachpayments.com&#x2F;)

The Payments API enables you to do a custom integration with Peach Payments and thereby support multiple payment methods.

</div>

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

If you are adding this library to an Android Application or Library:

3. Android 8.0+ (API Level 26+)

## Installation<a id="installation"></a>
<div align="center">
  <a href="https://konfigthis.com/sdk-sign-up?company=Peach%20Payments&language=Java">
    <img src="https://raw.githubusercontent.com/konfig-dev/brand-assets/HEAD/cta-images/java-cta.png" width="70%">
  </a>
</div>

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.konfigthis</groupId>
  <artifactId>peach-payments-java-sdk</artifactId>
  <version>2.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your `build.gradle`:

```groovy
// build.gradle
repositories {
  mavenCentral()
}

dependencies {
   implementation "com.konfigthis:peach-payments-java-sdk:2.0.0"
}
```

### Android users

Make sure your `build.gradle` file as a `minSdk` version of at least 26:
```groovy
// build.gradle
android {
    defaultConfig {
        minSdk 26
    }
}
```

Also make sure your library or application has internet permissions in your `AndroidManifest.xml`:

```xml
<!--AndroidManifest.xml-->
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">
    <uses-permission android:name="android.permission.INTERNET"/>
</manifest>
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/peach-payments-java-sdk-2.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PeachPayments;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BatchApi;
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
    String filename = "filename_example"; // The name of the CSV to be uploaded.
    String entityId = "8ac7a4ca694cec2601694cf5f9360026"; // The entity for the request.
    String notificationUrl = "notificationUrl_example"; // Webhooks are sent to this URL. It overrides the generic merchant webhook URL.
    try {
      BatchGenerateLinkResponse result = client
              .batch
              .generateLink(filename, entityId)
              .notificationUrl(notificationUrl)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getUrl());
    } catch (ApiException e) {
      System.err.println("Exception when calling BatchApi#generateLink");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<BatchGenerateLinkResponse> response = client
              .batch
              .generateLink(filename, entityId)
              .notificationUrl(notificationUrl)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BatchApi#generateLink");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://testapi-v2.peachpayments.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*BatchApi* | [**generateLink**](docs/BatchApi.md#generateLink) | **POST** /api/channels/{entityId}/payments/batches | Generate batch link
*BatchApi* | [**getBatchStatuses**](docs/BatchApi.md#getBatchStatuses) | **GET** /api/channels/{entityId}/payments/batches | Get all batch statuses
*BatchApi* | [**getErrorFiles**](docs/BatchApi.md#getErrorFiles) | **GET** /api/batches/{batchId}/files | Get batch error files
*BatchApi* | [**linkStatusGet**](docs/BatchApi.md#linkStatusGet) | **GET** /api/batches/{batchId} | Batch link status
*CheckoutV2GenerationApi* | [**initiateCheckoutInstance**](docs/CheckoutV2GenerationApi.md#initiateCheckoutInstance) | **POST** /v2/checkout | Initiate Checkout
*CheckoutGenerationApi* | [**initiatePayment**](docs/CheckoutGenerationApi.md#initiatePayment) | **POST** /checkout | Initiate Checkout
*CheckoutGenerationApi* | [**initiateRedirectCheckout**](docs/CheckoutGenerationApi.md#initiateRedirectCheckout) | **POST** /checkout/initiate | Initiate redirect-based Checkout
*CheckoutGenerationApi* | [**validateRequest**](docs/CheckoutGenerationApi.md#validateRequest) | **POST** /checkout/validate | Validate Checkout request
*FilesApi* | [**downloadFile**](docs/FilesApi.md#downloadFile) | **GET** /api/payments/{paymentId}/files/{fileId} | Download a file
*FilesApi* | [**uploadFile**](docs/FilesApi.md#uploadFile) | **POST** /api/attachments | Upload a file
*HelpersApi* | [**getPaymentMethods**](docs/HelpersApi.md#getPaymentMethods) | **POST** /merchant_specs | Retrieve a list of payment methods for a currency
*PaymentApi* | [**cancelLink**](docs/PaymentApi.md#cancelLink) | **DELETE** /api/payments/{paymentId} | Cancel link
*PaymentApi* | [**generateLink**](docs/PaymentApi.md#generateLink) | **POST** /api/channels/{entityId}/payments | Generate link
*PaymentApi* | [**getAllPaymentLinks**](docs/PaymentApi.md#getAllPaymentLinks) | **GET** /api/payments | Retrieve or export all payment links
*PaymentsApiInboundApi* | [**initiateDebitTransaction**](docs/PaymentsApiInboundApi.md#initiateDebitTransaction) | **POST** /payments | Payment
*PaymentsApiInboundApi* | [**queryTransactionById**](docs/PaymentsApiInboundApi.md#queryTransactionById) | **GET** /payments/{uniqueId} | Query a transaction by transaction ID
*PaymentsApiInboundApi* | [**refundTransaction**](docs/PaymentsApiInboundApi.md#refundTransaction) | **POST** /payments/{uniqueId} | Refund
*PaymentsApiInboundApi* | [**status**](docs/PaymentsApiInboundApi.md#status) | **GET** /payments | Query a transaction by merchantTransactionId
*PaymentsApiOutboundApi* | [**webhook**](docs/PaymentsApiOutboundApi.md#webhook) | **POST** / | Merchant webhook
*StatusApi* | [**checkoutStatusGet**](docs/StatusApi.md#checkoutStatusGet) | **GET** /status | Query Checkout status
*StatusApi* | [**queryPaymentStatus**](docs/StatusApi.md#queryPaymentStatus) | **GET** /api/payments/{paymentId} | Query payment status


## Documentation for Models

 - [Address](docs/Address.md)
 - [Authentication](docs/Authentication.md)
 - [Bank](docs/Bank.md)
 - [BatchGenerateLinkRequest](docs/BatchGenerateLinkRequest.md)
 - [BatchGenerateLinkResponse](docs/BatchGenerateLinkResponse.md)
 - [BatchGetBatchStatusesResponse](docs/BatchGetBatchStatusesResponse.md)
 - [BatchGetErrorFilesResponse](docs/BatchGetErrorFilesResponse.md)
 - [BatchResponse](docs/BatchResponse.md)
 - [Card](docs/Card.md)
 - [Cart](docs/Cart.md)
 - [CartCartItemsInner](docs/CartCartItemsInner.md)
 - [Checkout](docs/Checkout.md)
 - [CheckoutBaseWebhook](docs/CheckoutBaseWebhook.md)
 - [CheckoutCancelledWebhook](docs/CheckoutCancelledWebhook.md)
 - [CheckoutCancelledWebhookAllOf](docs/CheckoutCancelledWebhookAllOf.md)
 - [CheckoutCreatedWebhook](docs/CheckoutCreatedWebhook.md)
 - [CheckoutCreatedWebhookAllOf](docs/CheckoutCreatedWebhookAllOf.md)
 - [CheckoutGenerationInitiateRedirectCheckoutResponse](docs/CheckoutGenerationInitiateRedirectCheckoutResponse.md)
 - [CheckoutOptions](docs/CheckoutOptions.md)
 - [CheckoutPendingWebhook](docs/CheckoutPendingWebhook.md)
 - [CheckoutPendingWebhookAllOf](docs/CheckoutPendingWebhookAllOf.md)
 - [CheckoutState](docs/CheckoutState.md)
 - [CheckoutStateAllOf](docs/CheckoutStateAllOf.md)
 - [CheckoutStatus](docs/CheckoutStatus.md)
 - [CheckoutSuccessfulWebhook](docs/CheckoutSuccessfulWebhook.md)
 - [CheckoutSuccessfulWebhookAllOf](docs/CheckoutSuccessfulWebhookAllOf.md)
 - [CheckoutUncertainWebhook](docs/CheckoutUncertainWebhook.md)
 - [CheckoutUncertainWebhookAllOf](docs/CheckoutUncertainWebhookAllOf.md)
 - [CheckoutV2](docs/CheckoutV2.md)
 - [CheckoutV2Billing](docs/CheckoutV2Billing.md)
 - [CheckoutV2Customer](docs/CheckoutV2Customer.md)
 - [CheckoutV2GenerationInitiateCheckoutInstanceResponse](docs/CheckoutV2GenerationInitiateCheckoutInstanceResponse.md)
 - [CheckoutV2Shipping](docs/CheckoutV2Shipping.md)
 - [Customer](docs/Customer.md)
 - [CustomerBrowser](docs/CustomerBrowser.md)
 - [Error400Result](docs/Error400Result.md)
 - [FilesUploadFileRequest](docs/FilesUploadFileRequest.md)
 - [FilesUploadFileResponse](docs/FilesUploadFileResponse.md)
 - [GenerateLinkPayment](docs/GenerateLinkPayment.md)
 - [GenerateLinkPaymentPayment](docs/GenerateLinkPaymentPayment.md)
 - [GenerateLinkResponse](docs/GenerateLinkResponse.md)
 - [HelpersGetPaymentMethodsRequest](docs/HelpersGetPaymentMethodsRequest.md)
 - [JSONMerchantWebhook](docs/JSONMerchantWebhook.md)
 - [Mandate](docs/Mandate.md)
 - [MerchantTransactionIdStatusResponse](docs/MerchantTransactionIdStatusResponse.md)
 - [MerchantTransactionIdStatusResponsePaymentsInner](docs/MerchantTransactionIdStatusResponsePaymentsInner.md)
 - [MerchantWebhookData](docs/MerchantWebhookData.md)
 - [MerchantWebhookDataPayload](docs/MerchantWebhookDataPayload.md)
 - [MerchantWebhookDataPayloadAuthentication](docs/MerchantWebhookDataPayloadAuthentication.md)
 - [MerchantWebhookDataPayloadBankAccount](docs/MerchantWebhookDataPayloadBankAccount.md)
 - [MerchantWebhookDataPayloadMerchant](docs/MerchantWebhookDataPayloadMerchant.md)
 - [MessageResponse](docs/MessageResponse.md)
 - [ParameterErrorsInner](docs/ParameterErrorsInner.md)
 - [PaymentBrand](docs/PaymentBrand.md)
 - [PaymentGetAllPaymentLinks200Response](docs/PaymentGetAllPaymentLinks200Response.md)
 - [PaymentGetAllPaymentLinksResponse](docs/PaymentGetAllPaymentLinksResponse.md)
 - [PaymentGetAllPaymentLinksResponseMeta](docs/PaymentGetAllPaymentLinksResponseMeta.md)
 - [PaymentLinkBaseWebhook](docs/PaymentLinkBaseWebhook.md)
 - [PaymentLinkCompletedWebhook](docs/PaymentLinkCompletedWebhook.md)
 - [PaymentLinkCompletedWebhookAllOf](docs/PaymentLinkCompletedWebhookAllOf.md)
 - [PaymentLinkCreatedWebhook](docs/PaymentLinkCreatedWebhook.md)
 - [PaymentLinkCreatedWebhookAllOf](docs/PaymentLinkCreatedWebhookAllOf.md)
 - [PaymentLinkExpiredWebhook](docs/PaymentLinkExpiredWebhook.md)
 - [PaymentLinkExpiredWebhookAllOf](docs/PaymentLinkExpiredWebhookAllOf.md)
 - [PaymentLinkOpenedWebhook](docs/PaymentLinkOpenedWebhook.md)
 - [PaymentLinkOpenedWebhookAllOf](docs/PaymentLinkOpenedWebhookAllOf.md)
 - [PaymentLinkProcessingWebhook](docs/PaymentLinkProcessingWebhook.md)
 - [PaymentLinkProcessingWebhookAllOf](docs/PaymentLinkProcessingWebhookAllOf.md)
 - [PaymentOptions](docs/PaymentOptions.md)
 - [PaymentRequest](docs/PaymentRequest.md)
 - [PaymentResponse](docs/PaymentResponse.md)
 - [PaymentResponseOptions](docs/PaymentResponseOptions.md)
 - [PaymentType](docs/PaymentType.md)
 - [QueryStatusResponse](docs/QueryStatusResponse.md)
 - [QueryStatusResponsePayment](docs/QueryStatusResponsePayment.md)
 - [QueryStatusResponseTermsOfService](docs/QueryStatusResponseTermsOfService.md)
 - [REResponse](docs/REResponse.md)
 - [Recon](docs/Recon.md)
 - [Redirect](docs/Redirect.md)
 - [RedirectParametersInner](docs/RedirectParametersInner.md)
 - [RedirectPostData](docs/RedirectPostData.md)
 - [Refund200ErrorResponse](docs/Refund200ErrorResponse.md)
 - [RefundPaymentType](docs/RefundPaymentType.md)
 - [RefundRequest](docs/RefundRequest.md)
 - [RefundResponse](docs/RefundResponse.md)
 - [RefundResponseResult](docs/RefundResponseResult.md)
 - [ResponseCard](docs/ResponseCard.md)
 - [Result](docs/Result.md)
 - [ResultDetails](docs/ResultDetails.md)
 - [Shopify](docs/Shopify.md)
 - [StatusQueryPaymentStatusResponse](docs/StatusQueryPaymentStatusResponse.md)
 - [StatusQueryPaymentStatusResponseAuditInner](docs/StatusQueryPaymentStatusResponseAuditInner.md)
 - [TransactionIdStatusResponse](docs/TransactionIdStatusResponse.md)
 - [VirtualAccount](docs/VirtualAccount.md)


## Author
This Java package is automatically generated by [Konfig](https://konfigthis.com)
