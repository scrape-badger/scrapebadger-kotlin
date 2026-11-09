# ResultsApi

All URIs are relative to *https://scrapebadger.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**resultsReReadAResultRemoved**](ResultsApi.md#resultsReReadAResultRemoved) | **GET** /v1/results/{result_id} | Re-read a result (removed) |


<a id="resultsReReadAResultRemoved"></a>
# **resultsReReadAResultRemoved**
> kotlin.Any resultsReReadAResultRemoved(resultId)

Re-read a result (removed)

Removed (SCR-396): ScrapeBadger no longer stores results, so there is nothing to re-read. Always 410. Narrow a call with _jq / _fields / _max_items instead.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = ResultsApi()
val resultId : kotlin.String = resultId_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.resultsReReadAResultRemoved(resultId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ResultsApi#resultsReReadAResultRemoved")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ResultsApi#resultsReReadAResultRemoved")
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

