# ResultsApi

All URIs are relative to *https://scrapebadger.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**resultsReReadAResult**](ResultsApi.md#resultsReReadAResult) | **GET** /v1/results/{result_id} | Re-read a result |


<a id="resultsReReadAResult"></a>
# **resultsReReadAResult**
> kotlin.Any resultsReReadAResult(resultId)

Re-read a result

Replay a billed result (X-Result-ID) for free for ~15 minutes, optionally trimmed with jq / fields / max_items / summary. Never re-run a paid call just to reshape it.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = ResultsApi()
val resultId : kotlin.String = resultId_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.resultsReReadAResult(resultId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ResultsApi#resultsReReadAResult")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ResultsApi#resultsReReadAResult")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **resultId** | **kotlin.String**|  | |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

