# MetaAiApi

All URIs are relative to *https://scrapebadger.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**metaAiAskMetaAiAQuestion**](MetaAiApi.md#metaAiAskMetaAiAQuestion) | **GET** /v1/meta-ai/ask | Ask Meta AI a question |
| [**metaAiAskMetaAiAQuestionPost**](MetaAiApi.md#metaAiAskMetaAiAQuestionPost) | **POST** /v1/meta-ai/ask | Ask Meta AI a question (POST) |
| [**metaAiListMetaAiAssistantModes**](MetaAiApi.md#metaAiListMetaAiAssistantModes) | **GET** /v1/meta-ai/models | List Meta AI assistant modes |
| [**metaAiMetaAiScraperHealthCheck**](MetaAiApi.md#metaAiMetaAiScraperHealthCheck) | **GET** /v1/meta-ai/health | Meta AI scraper health check |
| [**metaAiMetaAiScraperHealthCheckHead**](MetaAiApi.md#metaAiMetaAiScraperHealthCheckHead) | **HEAD** /v1/meta-ai/health | Meta AI scraper health check |


<a id="metaAiAskMetaAiAQuestion"></a>
# **metaAiAskMetaAiAQuestion**
> kotlin.Any metaAiAskMetaAiAQuestion(prompt, country)

Ask Meta AI a question

Send a prompt to meta.ai and get the answer (anonymous, no Meta account).

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = MetaAiApi()
val prompt : kotlin.String = prompt_example // kotlin.String | The prompt to send to Meta AI (max 4000 characters).
val country : kotlin.String = country_example // kotlin.String | ISO-3166 alpha-2 egress country, e.g. 'US', 'GB', 'DE'.
try {
    val result : kotlin.Any = apiInstance.metaAiAskMetaAiAQuestion(prompt, country)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MetaAiApi#metaAiAskMetaAiAQuestion")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MetaAiApi#metaAiAskMetaAiAQuestion")
    e.printStackTrace()
}
```

### Parameters
| **prompt** | **kotlin.String**| The prompt to send to Meta AI (max 4000 characters). | |
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

<a id="metaAiAskMetaAiAQuestionPost"></a>
# **metaAiAskMetaAiAQuestionPost**
> kotlin.Any metaAiAskMetaAiAQuestionPost()

Ask Meta AI a question (POST)

POST form of &#x60;/ask&#x60;, for prompts too long for a query string.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = MetaAiApi()
try {
    val result : kotlin.Any = apiInstance.metaAiAskMetaAiAQuestionPost()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MetaAiApi#metaAiAskMetaAiAQuestionPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MetaAiApi#metaAiAskMetaAiAQuestionPost")
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

<a id="metaAiListMetaAiAssistantModes"></a>
# **metaAiListMetaAiAssistantModes**
> kotlin.Any metaAiListMetaAiAssistantModes(country)

List Meta AI assistant modes

Assistant modes meta.ai currently serves to an anonymous visitor.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = MetaAiApi()
val country : kotlin.String = country_example // kotlin.String | ISO-3166 alpha-2 egress country.
try {
    val result : kotlin.Any = apiInstance.metaAiListMetaAiAssistantModes(country)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MetaAiApi#metaAiListMetaAiAssistantModes")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MetaAiApi#metaAiListMetaAiAssistantModes")
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

<a id="metaAiMetaAiScraperHealthCheck"></a>
# **metaAiMetaAiScraperHealthCheck**
> kotlin.Any metaAiMetaAiScraperHealthCheck()

Meta AI scraper health check

Check health of the Meta AI scraper service (accepts HEAD).

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = MetaAiApi()
try {
    val result : kotlin.Any = apiInstance.metaAiMetaAiScraperHealthCheck()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MetaAiApi#metaAiMetaAiScraperHealthCheck")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MetaAiApi#metaAiMetaAiScraperHealthCheck")
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

<a id="metaAiMetaAiScraperHealthCheckHead"></a>
# **metaAiMetaAiScraperHealthCheckHead**
> kotlin.Any metaAiMetaAiScraperHealthCheckHead()

Meta AI scraper health check

Check health of the Meta AI scraper service (accepts HEAD).

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = MetaAiApi()
try {
    val result : kotlin.Any = apiInstance.metaAiMetaAiScraperHealthCheckHead()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MetaAiApi#metaAiMetaAiScraperHealthCheckHead")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MetaAiApi#metaAiMetaAiScraperHealthCheckHead")
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

