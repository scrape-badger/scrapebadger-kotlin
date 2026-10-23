# FeedbackApi

All URIs are relative to *https://scrapebadger.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**feedbackReportABugOrSendFeedback**](FeedbackApi.md#feedbackReportABugOrSendFeedback) | **POST** /v1/feedback | Report a bug or send feedback |


<a id="feedbackReportABugOrSendFeedback"></a>
# **feedbackReportABugOrSendFeedback**
> kotlin.Any feedbackReportABugOrSendFeedback(feedbackRequest)

Report a bug or send feedback

File a bug (wrong/empty result for valid input, misleading error, price mismatch) or feedback (an API or field you needed and couldn&#39;t find). Free, never billed. Pass the failing call&#39;s X-Request-ID so we can find it.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = FeedbackApi()
val feedbackRequest : FeedbackRequest =  // FeedbackRequest | 
try {
    val result : kotlin.Any = apiInstance.feedbackReportABugOrSendFeedback(feedbackRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FeedbackApi#feedbackReportABugOrSendFeedback")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FeedbackApi#feedbackReportABugOrSendFeedback")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **feedbackRequest** | [**FeedbackRequest**](FeedbackRequest.md)|  | |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

