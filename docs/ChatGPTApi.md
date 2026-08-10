# ChatGPTApi

All URIs are relative to *https://scrapebadger.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**chatgptAskChatgptAQuestion**](ChatGPTApi.md#chatgptAskChatgptAQuestion) | **GET** /v1/chatgpt/ask | Ask ChatGPT a question |
| [**chatgptAskChatgptAQuestionPost**](ChatGPTApi.md#chatgptAskChatgptAQuestionPost) | **POST** /v1/chatgpt/ask | Ask ChatGPT a question (POST) |
| [**chatgptChatgptScraperHealthCheck**](ChatGPTApi.md#chatgptChatgptScraperHealthCheck) | **GET** /v1/chatgpt/health | ChatGPT scraper health check |
| [**chatgptChatgptScraperHealthCheckHead**](ChatGPTApi.md#chatgptChatgptScraperHealthCheckHead) | **HEAD** /v1/chatgpt/health | ChatGPT scraper health check |
| [**chatgptListChatgptModels**](ChatGPTApi.md#chatgptListChatgptModels) | **GET** /v1/chatgpt/models | List ChatGPT models |
| [**chatgptMeasureABrandSVisibilityInAChatgptAnswer**](ChatGPTApi.md#chatgptMeasureABrandSVisibilityInAChatgptAnswer) | **GET** /v1/chatgpt/brand-visibility | Measure a brand&#39;s visibility in a ChatGPT answer |
| [**chatgptMeasureABrandSVisibilityInAChatgptAnswerPost**](ChatGPTApi.md#chatgptMeasureABrandSVisibilityInAChatgptAnswerPost) | **POST** /v1/chatgpt/brand-visibility | Measure a brand&#39;s visibility in a ChatGPT answer (POST) |


<a id="chatgptAskChatgptAQuestion"></a>
# **chatgptAskChatgptAQuestion**
> kotlin.Any chatgptAskChatgptAQuestion(prompt, country, webSearch)

Ask ChatGPT a question

Send a prompt to ChatGPT and get the answer plus the web sources it cited.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = ChatGPTApi()
val prompt : kotlin.String = prompt_example // kotlin.String | The prompt to send to ChatGPT (max 4096 characters).
val country : kotlin.String = country_example // kotlin.String | ISO-3166 alpha-2 egress country, e.g. 'US', 'GB', 'DE'.
val webSearch : kotlin.String = webSearch_example // kotlin.String | auto (let ChatGPT decide) | force (ask it to browse) | off (answer from memory). `web_search_triggered` in the response always reports what actually happened.
try {
    val result : kotlin.Any = apiInstance.chatgptAskChatgptAQuestion(prompt, country, webSearch)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ChatGPTApi#chatgptAskChatgptAQuestion")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ChatGPTApi#chatgptAskChatgptAQuestion")
    e.printStackTrace()
}
```

### Parameters
| **prompt** | **kotlin.String**| The prompt to send to ChatGPT (max 4096 characters). | |
| **country** | **kotlin.String**| ISO-3166 alpha-2 egress country, e.g. &#39;US&#39;, &#39;GB&#39;, &#39;DE&#39;. | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **webSearch** | **kotlin.String**| auto (let ChatGPT decide) | force (ask it to browse) | off (answer from memory). &#x60;web_search_triggered&#x60; in the response always reports what actually happened. | [optional] [default to &quot;auto&quot;] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="chatgptAskChatgptAQuestionPost"></a>
# **chatgptAskChatgptAQuestionPost**
> kotlin.Any chatgptAskChatgptAQuestionPost()

Ask ChatGPT a question (POST)

POST form of &#x60;/ask&#x60;, for prompts too long for a query string.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = ChatGPTApi()
try {
    val result : kotlin.Any = apiInstance.chatgptAskChatgptAQuestionPost()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ChatGPTApi#chatgptAskChatgptAQuestionPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ChatGPTApi#chatgptAskChatgptAQuestionPost")
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

<a id="chatgptChatgptScraperHealthCheck"></a>
# **chatgptChatgptScraperHealthCheck**
> kotlin.Any chatgptChatgptScraperHealthCheck()

ChatGPT scraper health check

Check health of the ChatGPT scraper service (accepts HEAD).

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = ChatGPTApi()
try {
    val result : kotlin.Any = apiInstance.chatgptChatgptScraperHealthCheck()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ChatGPTApi#chatgptChatgptScraperHealthCheck")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ChatGPTApi#chatgptChatgptScraperHealthCheck")
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

<a id="chatgptChatgptScraperHealthCheckHead"></a>
# **chatgptChatgptScraperHealthCheckHead**
> kotlin.Any chatgptChatgptScraperHealthCheckHead()

ChatGPT scraper health check

Check health of the ChatGPT scraper service (accepts HEAD).

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = ChatGPTApi()
try {
    val result : kotlin.Any = apiInstance.chatgptChatgptScraperHealthCheckHead()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ChatGPTApi#chatgptChatgptScraperHealthCheckHead")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ChatGPTApi#chatgptChatgptScraperHealthCheckHead")
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

<a id="chatgptListChatgptModels"></a>
# **chatgptListChatgptModels**
> kotlin.Any chatgptListChatgptModels(country)

List ChatGPT models

Models chatgpt.com currently serves to an anonymous visitor.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = ChatGPTApi()
val country : kotlin.String = country_example // kotlin.String | ISO-3166 alpha-2 egress country.
try {
    val result : kotlin.Any = apiInstance.chatgptListChatgptModels(country)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ChatGPTApi#chatgptListChatgptModels")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ChatGPTApi#chatgptListChatgptModels")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **country** | **kotlin.String**| ISO-3166 alpha-2 egress country. | [optional] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="chatgptMeasureABrandSVisibilityInAChatgptAnswer"></a>
# **chatgptMeasureABrandSVisibilityInAChatgptAnswer**
> kotlin.Any chatgptMeasureABrandSVisibilityInAChatgptAnswer(prompt, brand, domain, aliases, competitors, country, webSearch)

Measure a brand&#39;s visibility in a ChatGPT answer

Ask ChatGPT, then report whether the brand is mentioned, cited and how prominently.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = ChatGPTApi()
val prompt : kotlin.String = prompt_example // kotlin.String | The prompt to ask ChatGPT.
val brand : kotlin.String = brand_example // kotlin.String | Brand name to look for in the answer.
val domain : kotlin.String = domain_example // kotlin.String | Brand domain, for citation matching.
val aliases : kotlin.String = aliases_example // kotlin.String | Comma-separated alternative names.
val competitors : kotlin.String = competitors_example // kotlin.String | Comma-separated competitor names.
val country : kotlin.String = country_example // kotlin.String | ISO-3166 alpha-2 egress country.
val webSearch : kotlin.String = webSearch_example // kotlin.String | auto | force | off
try {
    val result : kotlin.Any = apiInstance.chatgptMeasureABrandSVisibilityInAChatgptAnswer(prompt, brand, domain, aliases, competitors, country, webSearch)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ChatGPTApi#chatgptMeasureABrandSVisibilityInAChatgptAnswer")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ChatGPTApi#chatgptMeasureABrandSVisibilityInAChatgptAnswer")
    e.printStackTrace()
}
```

### Parameters
| **prompt** | **kotlin.String**| The prompt to ask ChatGPT. | |
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

<a id="chatgptMeasureABrandSVisibilityInAChatgptAnswerPost"></a>
# **chatgptMeasureABrandSVisibilityInAChatgptAnswerPost**
> kotlin.Any chatgptMeasureABrandSVisibilityInAChatgptAnswerPost()

Measure a brand&#39;s visibility in a ChatGPT answer (POST)

POST form, for longer prompts and larger competitor sets.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = ChatGPTApi()
try {
    val result : kotlin.Any = apiInstance.chatgptMeasureABrandSVisibilityInAChatgptAnswerPost()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ChatGPTApi#chatgptMeasureABrandSVisibilityInAChatgptAnswerPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ChatGPTApi#chatgptMeasureABrandSVisibilityInAChatgptAnswerPost")
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

