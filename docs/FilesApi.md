# FilesApi

All URIs are relative to *https://testapi-v2.peachpayments.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**downloadFile**](FilesApi.md#downloadFile) | **GET** /api/payments/{paymentId}/files/{fileId} | Download a file |
| [**uploadFile**](FilesApi.md#uploadFile) | **POST** /api/attachments | Upload a file |


<a name="downloadFile"></a>
# **downloadFile**
> downloadFile(paymentId, fileId).execute();

Download a file

Downloads a file that was attached to a payment link.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PeachPayments;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FilesApi;
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
    String paymentId = "b95d6888-591b-4538-b508-6102cf1259c9"; // Payment ID.
    String fileId = "ca6cd55b-4be6-451d-bd72-fe5b7ec1f75z"; // File ID.
    try {
      client
              .files
              .downloadFile(paymentId, fileId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#downloadFile");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .files
              .downloadFile(paymentId, fileId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#downloadFile");
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
| **paymentId** | **String**| Payment ID. | |
| **fileId** | **String**| File ID. | |

### Return type

null (empty response body)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK. |  -  |

<a name="uploadFile"></a>
# **uploadFile**
> FilesUploadFileResponse uploadFile()._file(_file).filesUploadFileRequest(filesUploadFileRequest).execute();

Upload a file

Upload a file so that it can be attached to a payment link. Only PDFs smaller than 5 MB are supported.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PeachPayments;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FilesApi;
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
    File _file = new File("/path/to/file"); // File content to be uploaded.
    try {
      FilesUploadFileResponse result = client
              .files
              .uploadFile()
              ._file(_file)
              .execute();
      System.out.println(result);
      System.out.println(result.getFileId());
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#uploadFile");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<FilesUploadFileResponse> response = client
              .files
              .uploadFile()
              ._file(_file)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#uploadFile");
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
| **_file** | **File**| File content to be uploaded. | [optional] |
| **filesUploadFileRequest** | [**FilesUploadFileRequest**](FilesUploadFileRequest.md)| File content. | [optional] |

### Return type

[**FilesUploadFileResponse**](FilesUploadFileResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK. |  -  |

