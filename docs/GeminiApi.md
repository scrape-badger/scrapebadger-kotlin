# GeminiApi

All URIs are relative to *https://scrapebadger.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**geminiAskGeminiAQuestion**](GeminiApi.md#geminiAskGeminiAQuestion) | **GET** /v1/gemini/ask | Ask Gemini a question |
| [**geminiAskGeminiAQuestionPost**](GeminiApi.md#geminiAskGeminiAQuestionPost) | **POST** /v1/gemini/ask | Ask Gemini a question (POST) |
| [**geminiGeminiScraperHealthCheck**](GeminiApi.md#geminiGeminiScraperHealthCheck) | **GET** /v1/gemini/health | Gemini scraper health check |
| [**geminiGeminiScraperHealthCheckHead**](GeminiApi.md#geminiGeminiScraperHealthCheckHead) | **HEAD** /v1/gemini/health | Gemini scraper health check |
| [**geminiMeasureABrandSVisibilityInAGeminiAnswer**](GeminiApi.md#geminiMeasureABrandSVisibilityInAGeminiAnswer) | **GET** /v1/gemini/brand-visibility | Measure a brand&#39;s visibility in a Gemini answer |
| [**geminiMeasureABrandSVisibilityInAGeminiAnswerPost**](GeminiApi.md#geminiMeasureABrandSVisibilityInAGeminiAnswerPost) | **POST** /v1/gemini/brand-visibility | Measure a brand&#39;s visibility in a Gemini answer (POST) |


<a id="geminiAskGeminiAQuestion"></a>
# **geminiAskGeminiAQuestion**
> kotlin.Any geminiAskGeminiAQuestion(prompt, country, webSearch, imageUrl)

Ask Gemini a question

Send a prompt to Gemini and get the answer plus the web sources it cited.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = GeminiApi()
val prompt : kotlin.String = prompt_example // kotlin.String | The prompt to send to Gemini (max 4096 characters).
val country : kotlin.String = country_example // kotlin.String | ISO-3166 alpha-2 egress country, e.g. 'US', 'GB', 'DE'.
val webSearch : kotlin.String = webSearch_example // kotlin.String | auto (let Gemini decide) | force (ask it to browse) | off (answer from memory). `web_search_triggered` in the response always reports what actually happened.
val imageUrl : kotlin.String = imageUrl_example // kotlin.String | Public http(s) URL of an image to attach to the prompt. Gemini reads it and answers about it. POST also accepts `image_base64`. Exactly one of the two.
try {
    val result : kotlin.Any = apiInstance.geminiAskGeminiAQuestion(prompt, country, webSearch, imageUrl)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GeminiApi#geminiAskGeminiAQuestion")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GeminiApi#geminiAskGeminiAQuestion")
    e.printStackTrace()
}
```

### Parameters
| **prompt** | **kotlin.String**| The prompt to send to Gemini (max 4096 characters). | |
| **country** | **kotlin.String**| ISO-3166 alpha-2 egress country, e.g. &#39;US&#39;, &#39;GB&#39;, &#39;DE&#39;. | [optional] |
| **webSearch** | **kotlin.String**| auto (let Gemini decide) | force (ask it to browse) | off (answer from memory). &#x60;web_search_triggered&#x60; in the response always reports what actually happened. | [optional] [default to &quot;auto&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **imageUrl** | **kotlin.String**| Public http(s) URL of an image to attach to the prompt. Gemini reads it and answers about it. POST also accepts &#x60;image_base64&#x60;. Exactly one of the two. | [optional] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="geminiAskGeminiAQuestionPost"></a>
# **geminiAskGeminiAQuestionPost**
> kotlin.Any geminiAskGeminiAQuestionPost()

Ask Gemini a question (POST)

POST form of &#x60;/ask&#x60;, for prompts too long for a query string.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = GeminiApi()
try {
    val result : kotlin.Any = apiInstance.geminiAskGeminiAQuestionPost()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GeminiApi#geminiAskGeminiAQuestionPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GeminiApi#geminiAskGeminiAQuestionPost")
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

<a id="geminiGeminiScraperHealthCheck"></a>
# **geminiGeminiScraperHealthCheck**
> kotlin.Any geminiGeminiScraperHealthCheck()

Gemini scraper health check

Check health of the Gemini scraper service (accepts HEAD).

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = GeminiApi()
try {
    val result : kotlin.Any = apiInstance.geminiGeminiScraperHealthCheck()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GeminiApi#geminiGeminiScraperHealthCheck")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GeminiApi#geminiGeminiScraperHealthCheck")
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

<a id="geminiGeminiScraperHealthCheckHead"></a>
# **geminiGeminiScraperHealthCheckHead**
> kotlin.Any geminiGeminiScraperHealthCheckHead()

Gemini scraper health check

Check health of the Gemini scraper service (accepts HEAD).

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = GeminiApi()
try {
    val result : kotlin.Any = apiInstance.geminiGeminiScraperHealthCheckHead()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GeminiApi#geminiGeminiScraperHealthCheckHead")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GeminiApi#geminiGeminiScraperHealthCheckHead")
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

<a id="geminiMeasureABrandSVisibilityInAGeminiAnswer"></a>
# **geminiMeasureABrandSVisibilityInAGeminiAnswer**
> kotlin.Any geminiMeasureABrandSVisibilityInAGeminiAnswer(prompt, brand, domain, aliases, competitors, country, webSearch)

Measure a brand&#39;s visibility in a Gemini answer

Ask Gemini, then report whether the brand is mentioned, cited and how prominently.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = GeminiApi()
val prompt : kotlin.String = prompt_example // kotlin.String | The prompt to ask Gemini.
val brand : kotlin.String = brand_example // kotlin.String | Brand name to look for in the answer.
val domain : kotlin.String = domain_example // kotlin.String | Brand domain, for citation matching.
val aliases : kotlin.String = aliases_example // kotlin.String | Comma-separated alternative names.
val competitors : kotlin.String = competitors_example // kotlin.String | Comma-separated competitor names.
val country : kotlin.String = country_example // kotlin.String | ISO-3166 alpha-2 egress country.
val webSearch : kotlin.String = webSearch_example // kotlin.String | auto | force | off
try {
    val result : kotlin.Any = apiInstance.geminiMeasureABrandSVisibilityInAGeminiAnswer(prompt, brand, domain, aliases, competitors, country, webSearch)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GeminiApi#geminiMeasureABrandSVisibilityInAGeminiAnswer")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GeminiApi#geminiMeasureABrandSVisibilityInAGeminiAnswer")
    e.printStackTrace()
}
```

### Parameters
| **prompt** | **kotlin.String**| The prompt to ask Gemini. | |
| **brand** | **kotlin.String**| Brand name to look for in the answer. | |
| **domain** | **kotlin.String**| Brand domain, for citation matching. | [optional] |
| **aliases** | **kotlin.String**| Comma-separated alternative names. | [optional] |
| **competitors** | **kotlin.String**| Comma-separated competitor names. | [optional] |
| **country** | **kotlin.String**| ISO-3166 alpha-2 egress country. | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **webSearch** | **kotlin.String**| auto | force | off | [optional] [default to &quot;force&quot;] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="geminiMeasureABrandSVisibilityInAGeminiAnswerPost"></a>
# **geminiMeasureABrandSVisibilityInAGeminiAnswerPost**
> kotlin.Any geminiMeasureABrandSVisibilityInAGeminiAnswerPost()

Measure a brand&#39;s visibility in a Gemini answer (POST)

POST form, for longer prompts and larger competitor sets.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = GeminiApi()
try {
    val result : kotlin.Any = apiInstance.geminiMeasureABrandSVisibilityInAGeminiAnswerPost()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GeminiApi#geminiMeasureABrandSVisibilityInAGeminiAnswerPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GeminiApi#geminiMeasureABrandSVisibilityInAGeminiAnswerPost")
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

