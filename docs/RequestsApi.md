# RequestsApi

All URIs are relative to *https://scrapebadger.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**requestsPollAnAsyncRequest**](RequestsApi.md#requestsPollAnAsyncRequest) | **GET** /v1/requests/{request_id} | Poll an async request |


<a id="requestsPollAnAsyncRequest"></a>
# **requestsPollAnAsyncRequest**
> kotlin.Any requestsPollAnAsyncRequest(requestId)

Poll an async request

Status or final response of a call made with &#x60;&#x60;Prefer: respond-async&#x60;&#x60;. While it runs: 202. When done: the original status, headers and body.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = RequestsApi()
val requestId : kotlin.String = requestId_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.requestsPollAnAsyncRequest(requestId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RequestsApi#requestsPollAnAsyncRequest")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RequestsApi#requestsPollAnAsyncRequest")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **requestId** | **kotlin.String**|  | |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

