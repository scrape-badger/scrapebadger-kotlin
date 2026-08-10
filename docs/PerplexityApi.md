# PerplexityApi

All URIs are relative to *https://scrapebadger.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**perplexityAskPerplexityAQuestion**](PerplexityApi.md#perplexityAskPerplexityAQuestion) | **GET** /v1/perplexity/ask | Ask Perplexity a question |
| [**perplexityAskPerplexityAQuestionPost**](PerplexityApi.md#perplexityAskPerplexityAQuestionPost) | **POST** /v1/perplexity/ask | Ask Perplexity a question (POST) |
| [**perplexityMeasureABrandSVisibilityInAPerplexityAnswer**](PerplexityApi.md#perplexityMeasureABrandSVisibilityInAPerplexityAnswer) | **GET** /v1/perplexity/brand-visibility | Measure a brand&#39;s visibility in a Perplexity answer |
| [**perplexityMeasureABrandSVisibilityInAPerplexityAnswerPost**](PerplexityApi.md#perplexityMeasureABrandSVisibilityInAPerplexityAnswerPost) | **POST** /v1/perplexity/brand-visibility | Measure a brand&#39;s visibility in a Perplexity answer (POST) |
| [**perplexityPerplexityScraperHealthCheck**](PerplexityApi.md#perplexityPerplexityScraperHealthCheck) | **GET** /v1/perplexity/health | Perplexity scraper health check |
| [**perplexityPerplexityScraperHealthCheckHead**](PerplexityApi.md#perplexityPerplexityScraperHealthCheckHead) | **HEAD** /v1/perplexity/health | Perplexity scraper health check |


<a id="perplexityAskPerplexityAQuestion"></a>
# **perplexityAskPerplexityAQuestion**
> kotlin.Any perplexityAskPerplexityAQuestion(prompt, country)

Ask Perplexity a question

Send a prompt to Perplexity and get the answer plus the web sources it cited.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = PerplexityApi()
val prompt : kotlin.String = prompt_example // kotlin.String | The prompt to send to Perplexity (max 4096 characters).
val country : kotlin.String = country_example // kotlin.String | ISO-3166 alpha-2 egress country, e.g. 'US', 'GB', 'DE'.
try {
    val result : kotlin.Any = apiInstance.perplexityAskPerplexityAQuestion(prompt, country)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PerplexityApi#perplexityAskPerplexityAQuestion")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PerplexityApi#perplexityAskPerplexityAQuestion")
    e.printStackTrace()
}
```

### Parameters
| **prompt** | **kotlin.String**| The prompt to send to Perplexity (max 4096 characters). | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **country** | **kotlin.String**| ISO-3166 alpha-2 egress country, e.g. &#39;US&#39;, &#39;GB&#39;, &#39;DE&#39;. | [optional] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="perplexityAskPerplexityAQuestionPost"></a>
# **perplexityAskPerplexityAQuestionPost**
> kotlin.Any perplexityAskPerplexityAQuestionPost()

Ask Perplexity a question (POST)

POST form of &#x60;/ask&#x60;, for prompts too long for a query string.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = PerplexityApi()
try {
    val result : kotlin.Any = apiInstance.perplexityAskPerplexityAQuestionPost()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PerplexityApi#perplexityAskPerplexityAQuestionPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PerplexityApi#perplexityAskPerplexityAQuestionPost")
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

<a id="perplexityMeasureABrandSVisibilityInAPerplexityAnswer"></a>
# **perplexityMeasureABrandSVisibilityInAPerplexityAnswer**
> kotlin.Any perplexityMeasureABrandSVisibilityInAPerplexityAnswer(prompt, brand, domain, aliases, competitors, country)

Measure a brand&#39;s visibility in a Perplexity answer

Ask Perplexity, then report whether the brand is mentioned, cited and how prominently.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = PerplexityApi()
val prompt : kotlin.String = prompt_example // kotlin.String | The prompt to ask Perplexity.
val brand : kotlin.String = brand_example // kotlin.String | Brand name to look for in the answer.
val domain : kotlin.String = domain_example // kotlin.String | Brand domain, for citation matching.
val aliases : kotlin.String = aliases_example // kotlin.String | Comma-separated alternative names.
val competitors : kotlin.String = competitors_example // kotlin.String | Comma-separated competitor names.
val country : kotlin.String = country_example // kotlin.String | ISO-3166 alpha-2 egress country.
try {
    val result : kotlin.Any = apiInstance.perplexityMeasureABrandSVisibilityInAPerplexityAnswer(prompt, brand, domain, aliases, competitors, country)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PerplexityApi#perplexityMeasureABrandSVisibilityInAPerplexityAnswer")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PerplexityApi#perplexityMeasureABrandSVisibilityInAPerplexityAnswer")
    e.printStackTrace()
}
```

### Parameters
| **prompt** | **kotlin.String**| The prompt to ask Perplexity. | |
| **brand** | **kotlin.String**| Brand name to look for in the answer. | |
| **domain** | **kotlin.String**| Brand domain, for citation matching. | [optional] |
| **aliases** | **kotlin.String**| Comma-separated alternative names. | [optional] |
| **competitors** | **kotlin.String**| Comma-separated competitor names. | [optional] |
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

<a id="perplexityMeasureABrandSVisibilityInAPerplexityAnswerPost"></a>
# **perplexityMeasureABrandSVisibilityInAPerplexityAnswerPost**
> kotlin.Any perplexityMeasureABrandSVisibilityInAPerplexityAnswerPost()

Measure a brand&#39;s visibility in a Perplexity answer (POST)

POST form, for longer prompts and larger competitor sets.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = PerplexityApi()
try {
    val result : kotlin.Any = apiInstance.perplexityMeasureABrandSVisibilityInAPerplexityAnswerPost()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PerplexityApi#perplexityMeasureABrandSVisibilityInAPerplexityAnswerPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PerplexityApi#perplexityMeasureABrandSVisibilityInAPerplexityAnswerPost")
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

<a id="perplexityPerplexityScraperHealthCheck"></a>
# **perplexityPerplexityScraperHealthCheck**
> kotlin.Any perplexityPerplexityScraperHealthCheck()

Perplexity scraper health check

Check health of the Perplexity scraper service (accepts HEAD).

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = PerplexityApi()
try {
    val result : kotlin.Any = apiInstance.perplexityPerplexityScraperHealthCheck()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PerplexityApi#perplexityPerplexityScraperHealthCheck")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PerplexityApi#perplexityPerplexityScraperHealthCheck")
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

<a id="perplexityPerplexityScraperHealthCheckHead"></a>
# **perplexityPerplexityScraperHealthCheckHead**
> kotlin.Any perplexityPerplexityScraperHealthCheckHead()

Perplexity scraper health check

Check health of the Perplexity scraper service (accepts HEAD).

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = PerplexityApi()
try {
    val result : kotlin.Any = apiInstance.perplexityPerplexityScraperHealthCheckHead()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PerplexityApi#perplexityPerplexityScraperHealthCheckHead")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PerplexityApi#perplexityPerplexityScraperHealthCheckHead")
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

