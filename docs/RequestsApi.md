# RequestsApi

All URIs are relative to *https://scrapebadger.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**requestsCallbackStatus**](RequestsApi.md#requestsCallbackStatus) | **GET** /v1/requests/{request_id}/callback | Callback status |
| [**requestsPollAnAsyncRequest**](RequestsApi.md#requestsPollAnAsyncRequest) | **GET** /v1/requests/{request_id} | Poll an async request |


<a id="requestsCallbackStatus"></a>
# **requestsCallbackStatus**
> AsyncCallbackStatus requestsCallbackStatus(requestId)

Callback status

Webhook delivery state of a call submitted with &#x60;X-Callback-URL&#x60; / &#x60;callback_url&#x60;: kept for 24 h. Free. &#x60;404 callback_not_found&#x60; for a request without a callback, of another account, or older than 24 h.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = RequestsApi()
val requestId : kotlin.String = requestId_example // kotlin.String | 
try {
    val result : AsyncCallbackStatus = apiInstance.requestsCallbackStatus(requestId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RequestsApi#requestsCallbackStatus")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RequestsApi#requestsCallbackStatus")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **requestId** | **kotlin.String**|  | |

### Return type

[**AsyncCallbackStatus**](AsyncCallbackStatus.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="requestsPollAnAsyncRequest"></a>
# **requestsPollAnAsyncRequest**
> kotlin.Any requestsPollAnAsyncRequest(requestId)

Poll an async request

Status or final response of a call made with &#x60;&#x60;Prefer: respond-async&#x60;&#x60;. While it runs: 202. When done: the original status, headers and body.  The final response carries &#x60;X-Callback-Status&#x60;, &#x60;X-Callback-Attempts&#x60; and &#x60;X-Callback-Error&#x60; for a call submitted with a callback; while it runs, the &#x60;202&#x60; body has a &#x60;callback&#x60; object. Full delivery state: &#x60;GET /v1/requests/{request_id}/callback&#x60;.

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

