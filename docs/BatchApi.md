# BatchApi

All URIs are relative to *https://testapi-v2.peachpayments.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**generateLink**](BatchApi.md#generateLink) | **POST** /api/channels/{entityId}/payments/batches | Generate batch link |
| [**getBatchStatuses**](BatchApi.md#getBatchStatuses) | **GET** /api/channels/{entityId}/payments/batches | Get all batch statuses |
| [**getErrorFiles**](BatchApi.md#getErrorFiles) | **GET** /api/batches/{batchId}/files | Get batch error files |
| [**linkStatusGet**](BatchApi.md#linkStatusGet) | **GET** /api/batches/{batchId} | Batch link status |


<a name="generateLink"></a>
# **generateLink**
> BatchGenerateLinkResponse generateLink(entityId, batchGenerateLinkRequest).execute();

Generate batch link

Returns a URL to which the batch file must be uploaded.  For more information, see the [documentation](https://developer.peachpayments.com/docs/generate-bulk-payment-links). 

### Example
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

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityId** | **String**| The entity for the request. | |
| **batchGenerateLinkRequest** | [**BatchGenerateLinkRequest**](BatchGenerateLinkRequest.md)|  | |

### Return type

[**BatchGenerateLinkResponse**](BatchGenerateLinkResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Batch ID and URL. |  -  |

<a name="getBatchStatuses"></a>
# **getBatchStatuses**
> BatchGetBatchStatusesResponse getBatchStatuses(entityId).offset(offset).perPage(perPage).filtersStartDate(filtersStartDate).filtersEndDate(filtersEndDate).filtersStatus(filtersStatus).execute();

Get all batch statuses

Query all batch statuses of a batch for a channel.

### Example
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
    String entityId = "8ac7a4ca694cec2601694cf5f9360026"; // The entity for the request.
    Double offset = 0D; // The offset from which to read data.
    Double perPage = 50D; // The amount of items to retrieve.
    OffsetDateTime filtersStartDate = OffsetDateTime.parse("2018-03-20T09:12:28Z"); // Retrieve all batches from the start date onwards.
    OffsetDateTime filtersEndDate = OffsetDateTime.parse("2018-03-20T09:12:28Z"); // Retrieve all batches until the end date.
    String filtersStatus = "initiated"; // The payment link status to filter on.
    try {
      BatchGetBatchStatusesResponse result = client
              .batch
              .getBatchStatuses(entityId)
              .offset(offset)
              .perPage(perPage)
              .filtersStartDate(filtersStartDate)
              .filtersEndDate(filtersEndDate)
              .filtersStatus(filtersStatus)
              .execute();
      System.out.println(result);
      System.out.println(result.getBatches());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling BatchApi#getBatchStatuses");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<BatchGetBatchStatusesResponse> response = client
              .batch
              .getBatchStatuses(entityId)
              .offset(offset)
              .perPage(perPage)
              .filtersStartDate(filtersStartDate)
              .filtersEndDate(filtersEndDate)
              .filtersStatus(filtersStatus)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BatchApi#getBatchStatuses");
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
| **offset** | **Double**| The offset from which to read data. | [optional] [default to 0] |
| **perPage** | **Double**| The amount of items to retrieve. | [optional] [default to 50] |
| **filtersStartDate** | **OffsetDateTime**| Retrieve all batches from the start date onwards. | [optional] |
| **filtersEndDate** | **OffsetDateTime**| Retrieve all batches until the end date. | [optional] |
| **filtersStatus** | **String**| The payment link status to filter on. | [optional] [enum: initiated, processing, expired, error, completed] |

### Return type

[**BatchGetBatchStatusesResponse**](BatchGetBatchStatusesResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | URL. |  -  |

<a name="getErrorFiles"></a>
# **getErrorFiles**
> BatchGetErrorFilesResponse getErrorFiles(batchId).execute();

Get batch error files

Returns a set of URLs that can be accessed to retrieve the batch error files.

### Example
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
    String batchId = "421e1e63-ddd5-46ec-8812-74eda861259b"; // The batch for the request.
    try {
      BatchGetErrorFilesResponse result = client
              .batch
              .getErrorFiles(batchId)
              .execute();
      System.out.println(result);
      System.out.println(result.getErrorFileUrl());
      System.out.println(result.getErrorDetailsFileUrl());
    } catch (ApiException e) {
      System.err.println("Exception when calling BatchApi#getErrorFiles");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<BatchGetErrorFilesResponse> response = client
              .batch
              .getErrorFiles(batchId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BatchApi#getErrorFiles");
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
| **batchId** | **String**| The batch for the request. | |

### Return type

[**BatchGetErrorFilesResponse**](BatchGetErrorFilesResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Error files. |  -  |

<a name="linkStatusGet"></a>
# **linkStatusGet**
> BatchResponse linkStatusGet(batchId).execute();

Batch link status

Returns the status of the batch.

### Example
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
    String batchId = "421e1e63-ddd5-46ec-8812-74eda861259b"; // The batch ID for the request.
    try {
      BatchResponse result = client
              .batch
              .linkStatusGet(batchId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getUpdatedAt());
      System.out.println(result.getEntityId());
      System.out.println(result.getFilename());
      System.out.println(result.getStatus());
      System.out.println(result.getSuccessfulRows());
      System.out.println(result.getTotalRows());
      System.out.println(result.getErrorCode());
    } catch (ApiException e) {
      System.err.println("Exception when calling BatchApi#linkStatusGet");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<BatchResponse> response = client
              .batch
              .linkStatusGet(batchId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BatchApi#linkStatusGet");
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
| **batchId** | **String**| The batch ID for the request. | |

### Return type

[**BatchResponse**](BatchResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Status received. |  -  |

