# GrokApi

All URIs are relative to *https://scrapebadger.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**grokAskGrokAQuestion**](GrokApi.md#grokAskGrokAQuestion) | **GET** /v1/grok/ask | Ask Grok a question |
| [**grokAskGrokAQuestionPost**](GrokApi.md#grokAskGrokAQuestionPost) | **POST** /v1/grok/ask | Ask Grok a question (POST) |
| [**grokGetAGrokConversation**](GrokApi.md#grokGetAGrokConversation) | **GET** /v1/grok/conversations/{conversation_id} | Get a Grok conversation |
| [**grokGrokScraperHealthCheck**](GrokApi.md#grokGrokScraperHealthCheck) | **GET** /v1/grok/health | Grok scraper health check |
| [**grokGrokScraperHealthCheckHead**](GrokApi.md#grokGrokScraperHealthCheckHead) | **HEAD** /v1/grok/health | Grok scraper health check |
| [**grokListGrokAssistantModes**](GrokApi.md#grokListGrokAssistantModes) | **GET** /v1/grok/models | List Grok assistant modes |
| [**grokMeasureBrandVisibilityInGrok**](GrokApi.md#grokMeasureBrandVisibilityInGrok) | **GET** /v1/grok/brand-visibility | Measure brand visibility in Grok |
| [**grokMeasureBrandVisibilityInGrokPost**](GrokApi.md#grokMeasureBrandVisibilityInGrokPost) | **POST** /v1/grok/brand-visibility | Measure brand visibility in Grok (POST) |


<a id="grokAskGrokAQuestion"></a>
# **grokAskGrokAQuestion**
> kotlin.Any grokAskGrokAQuestion(prompt, conversationId, mode, webSearch)

Ask Grok a question

Ask the real Grok assistant and get its answer, web sources, and X post references.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = GrokApi()
val prompt : kotlin.String = prompt_example // kotlin.String | Prompt to send to Grok (max 4000 characters).
val conversationId : kotlin.String = conversationId_example // kotlin.String | Existing Grok conversation to continue.
val mode : kotlin.String = mode_example // kotlin.String | Assistant mode: auto, fast, or expert.
val webSearch : kotlin.String = webSearch_example // kotlin.String | Web and X search: auto, force, or off.
try {
    val result : kotlin.Any = apiInstance.grokAskGrokAQuestion(prompt, conversationId, mode, webSearch)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GrokApi#grokAskGrokAQuestion")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GrokApi#grokAskGrokAQuestion")
    e.printStackTrace()
}
```

### Parameters
| **prompt** | **kotlin.String**| Prompt to send to Grok (max 4000 characters). | |
| **conversationId** | **kotlin.String**| Existing Grok conversation to continue. | [optional] |
| **mode** | **kotlin.String**| Assistant mode: auto, fast, or expert. | [optional] [default to &quot;auto&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **webSearch** | **kotlin.String**| Web and X search: auto, force, or off. | [optional] [default to &quot;auto&quot;] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="grokAskGrokAQuestionPost"></a>
# **grokAskGrokAQuestionPost**
> kotlin.Any grokAskGrokAQuestionPost()

Ask Grok a question (POST)

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = GrokApi()
try {
    val result : kotlin.Any = apiInstance.grokAskGrokAQuestionPost()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GrokApi#grokAskGrokAQuestionPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GrokApi#grokAskGrokAQuestionPost")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="grokGetAGrokConversation"></a>
# **grokGetAGrokConversation**
> kotlin.Any grokGetAGrokConversation(conversationId)

Get a Grok conversation

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = GrokApi()
val conversationId : kotlin.String = conversationId_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.grokGetAGrokConversation(conversationId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GrokApi#grokGetAGrokConversation")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GrokApi#grokGetAGrokConversation")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **kotlin.String**|  | |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="grokGrokScraperHealthCheck"></a>
# **grokGrokScraperHealthCheck**
> kotlin.Any grokGrokScraperHealthCheck()

Grok scraper health check

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = GrokApi()
try {
    val result : kotlin.Any = apiInstance.grokGrokScraperHealthCheck()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GrokApi#grokGrokScraperHealthCheck")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GrokApi#grokGrokScraperHealthCheck")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="grokGrokScraperHealthCheckHead"></a>
# **grokGrokScraperHealthCheckHead**
> kotlin.Any grokGrokScraperHealthCheckHead()

Grok scraper health check

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = GrokApi()
try {
    val result : kotlin.Any = apiInstance.grokGrokScraperHealthCheckHead()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GrokApi#grokGrokScraperHealthCheckHead")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GrokApi#grokGrokScraperHealthCheckHead")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="grokListGrokAssistantModes"></a>
# **grokListGrokAssistantModes**
> kotlin.Any grokListGrokAssistantModes()

List Grok assistant modes

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = GrokApi()
try {
    val result : kotlin.Any = apiInstance.grokListGrokAssistantModes()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GrokApi#grokListGrokAssistantModes")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GrokApi#grokListGrokAssistantModes")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="grokMeasureBrandVisibilityInGrok"></a>
# **grokMeasureBrandVisibilityInGrok**
> kotlin.Any grokMeasureBrandVisibilityInGrok(prompt, brand, competitors, brandDomain, mode, webSearch)

Measure brand visibility in Grok

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = GrokApi()
val prompt : kotlin.String = prompt_example // kotlin.String | Buyer or category prompt to send to Grok.
val brand : kotlin.String = brand_example // kotlin.String | Brand name to measure.
val competitors : kotlin.collections.List<kotlin.String?> =  // kotlin.collections.List<kotlin.String?> | Competitor brand names.
val brandDomain : kotlin.String = brandDomain_example // kotlin.String | Brand domain for citation rank.
val mode : kotlin.String = mode_example // kotlin.String | Assistant mode: auto, fast, or expert.
val webSearch : kotlin.String = webSearch_example // kotlin.String | Web and X search mode.
try {
    val result : kotlin.Any = apiInstance.grokMeasureBrandVisibilityInGrok(prompt, brand, competitors, brandDomain, mode, webSearch)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GrokApi#grokMeasureBrandVisibilityInGrok")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GrokApi#grokMeasureBrandVisibilityInGrok")
    e.printStackTrace()
}
```

### Parameters
| **prompt** | **kotlin.String**| Buyer or category prompt to send to Grok. | |
| **brand** | **kotlin.String**| Brand name to measure. | |
| **competitors** | [**kotlin.collections.List&lt;kotlin.String?&gt;**](kotlin.String.md)| Competitor brand names. | [optional] [default to arrayListOf()] |
| **brandDomain** | **kotlin.String**| Brand domain for citation rank. | [optional] |
| **mode** | **kotlin.String**| Assistant mode: auto, fast, or expert. | [optional] [default to &quot;auto&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **webSearch** | **kotlin.String**| Web and X search mode. | [optional] [default to &quot;force&quot;] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="grokMeasureBrandVisibilityInGrokPost"></a>
# **grokMeasureBrandVisibilityInGrokPost**
> kotlin.Any grokMeasureBrandVisibilityInGrokPost()

Measure brand visibility in Grok (POST)

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = GrokApi()
try {
    val result : kotlin.Any = apiInstance.grokMeasureBrandVisibilityInGrokPost()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GrokApi#grokMeasureBrandVisibilityInGrokPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GrokApi#grokMeasureBrandVisibilityInGrokPost")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

