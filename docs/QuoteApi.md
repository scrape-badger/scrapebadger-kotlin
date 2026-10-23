# QuoteApi

All URIs are relative to *https://scrapebadger.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**quoteQuoteACall**](QuoteApi.md#quoteQuoteACall) | **POST** /v1/quote | Quote a call |


<a id="quoteQuoteACall"></a>
# **quoteQuoteACall**
> kotlin.Any quoteQuoteACall(quoteRequest)

Quote a call

What a call would cost (credits and USD), whether its parameters are valid, and how long it usually takes. Free: nothing runs and nothing is charged.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = QuoteApi()
val quoteRequest : QuoteRequest =  // QuoteRequest | 
try {
    val result : kotlin.Any = apiInstance.quoteQuoteACall(quoteRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling QuoteApi#quoteQuoteACall")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling QuoteApi#quoteQuoteACall")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **quoteRequest** | [**QuoteRequest**](QuoteRequest.md)|  | |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

