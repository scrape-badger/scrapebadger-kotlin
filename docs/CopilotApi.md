# CopilotApi

All URIs are relative to *https://scrapebadger.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**copilotAskCopilotAQuestion**](CopilotApi.md#copilotAskCopilotAQuestion) | **GET** /v1/copilot/ask | Ask Copilot a question |
| [**copilotAskCopilotAQuestionPost**](CopilotApi.md#copilotAskCopilotAQuestionPost) | **POST** /v1/copilot/ask | Ask Copilot a question (POST) |
| [**copilotCopilotScraperHealthCheck**](CopilotApi.md#copilotCopilotScraperHealthCheck) | **GET** /v1/copilot/health | Copilot scraper health check |
| [**copilotCopilotScraperHealthCheckHead**](CopilotApi.md#copilotCopilotScraperHealthCheckHead) | **HEAD** /v1/copilot/health | Copilot scraper health check |
| [**copilotListCopilotMarkets**](CopilotApi.md#copilotListCopilotMarkets) | **GET** /v1/copilot/markets | List Copilot markets |
| [**copilotMeasureABrandSVisibilityInACopilotAnswer**](CopilotApi.md#copilotMeasureABrandSVisibilityInACopilotAnswer) | **GET** /v1/copilot/brand-visibility | Measure a brand&#39;s visibility in a Copilot answer |
| [**copilotMeasureABrandSVisibilityInACopilotAnswerPost**](CopilotApi.md#copilotMeasureABrandSVisibilityInACopilotAnswerPost) | **POST** /v1/copilot/brand-visibility | Measure a brand&#39;s visibility in a Copilot answer (POST) |


<a id="copilotAskCopilotAQuestion"></a>
# **copilotAskCopilotAQuestion**
> kotlin.Any copilotAskCopilotAQuestion(prompt, country, market, strictCountry)

Ask Copilot a question

Ask Microsoft Copilot (Copilot Search in Bing) and get the answer plus its cited sources.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = CopilotApi()
val prompt : kotlin.String = prompt_example // kotlin.String | The prompt to send to Copilot (max 2000 characters).
val country : kotlin.String = country_example // kotlin.String | ISO-3166 alpha-2 country to ask from, e.g. 'JP', 'US', 'GB'. Unless `market` is set, Copilot also answers in that country's market.
val market : kotlin.String = market_example // kotlin.String | Bing market (language-COUNTRY), e.g. 'ja-JP', 'en-GB'. Defaults to the country's.
val strictCountry : kotlin.Boolean = true // kotlin.Boolean | Answer only from an exit in `country`, never another one; 503 `country_unavailable` (not billed) when none answers. Requires `country`.
try {
    val result : kotlin.Any = apiInstance.copilotAskCopilotAQuestion(prompt, country, market, strictCountry)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CopilotApi#copilotAskCopilotAQuestion")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CopilotApi#copilotAskCopilotAQuestion")
    e.printStackTrace()
}
```

### Parameters
| **prompt** | **kotlin.String**| The prompt to send to Copilot (max 2000 characters). | |
| **country** | **kotlin.String**| ISO-3166 alpha-2 country to ask from, e.g. &#39;JP&#39;, &#39;US&#39;, &#39;GB&#39;. Unless &#x60;market&#x60; is set, Copilot also answers in that country&#39;s market. | [optional] |
| **market** | **kotlin.String**| Bing market (language-COUNTRY), e.g. &#39;ja-JP&#39;, &#39;en-GB&#39;. Defaults to the country&#39;s. | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **strictCountry** | **kotlin.Boolean**| Answer only from an exit in &#x60;country&#x60;, never another one; 503 &#x60;country_unavailable&#x60; (not billed) when none answers. Requires &#x60;country&#x60;. | [optional] [default to false] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="copilotAskCopilotAQuestionPost"></a>
# **copilotAskCopilotAQuestionPost**
> kotlin.Any copilotAskCopilotAQuestionPost()

Ask Copilot a question (POST)

POST form of &#x60;/ask&#x60;, for prompts too long for a query string.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = CopilotApi()
try {
    val result : kotlin.Any = apiInstance.copilotAskCopilotAQuestionPost()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CopilotApi#copilotAskCopilotAQuestionPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CopilotApi#copilotAskCopilotAQuestionPost")
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

<a id="copilotCopilotScraperHealthCheck"></a>
# **copilotCopilotScraperHealthCheck**
> kotlin.Any copilotCopilotScraperHealthCheck()

Copilot scraper health check

Check health of the Copilot scraper service (accepts HEAD).

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = CopilotApi()
try {
    val result : kotlin.Any = apiInstance.copilotCopilotScraperHealthCheck()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CopilotApi#copilotCopilotScraperHealthCheck")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CopilotApi#copilotCopilotScraperHealthCheck")
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

<a id="copilotCopilotScraperHealthCheckHead"></a>
# **copilotCopilotScraperHealthCheckHead**
> kotlin.Any copilotCopilotScraperHealthCheckHead()

Copilot scraper health check

Check health of the Copilot scraper service (accepts HEAD).

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = CopilotApi()
try {
    val result : kotlin.Any = apiInstance.copilotCopilotScraperHealthCheckHead()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CopilotApi#copilotCopilotScraperHealthCheckHead")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CopilotApi#copilotCopilotScraperHealthCheckHead")
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

<a id="copilotListCopilotMarkets"></a>
# **copilotListCopilotMarkets**
> kotlin.Any copilotListCopilotMarkets()

List Copilot markets

The Bing markets Copilot can be asked in.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = CopilotApi()
try {
    val result : kotlin.Any = apiInstance.copilotListCopilotMarkets()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CopilotApi#copilotListCopilotMarkets")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CopilotApi#copilotListCopilotMarkets")
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

<a id="copilotMeasureABrandSVisibilityInACopilotAnswer"></a>
# **copilotMeasureABrandSVisibilityInACopilotAnswer**
> kotlin.Any copilotMeasureABrandSVisibilityInACopilotAnswer(prompt, brand, domain, aliases, competitors, country, market, strictCountry)

Measure a brand&#39;s visibility in a Copilot answer

Ask Copilot, then report whether the brand is mentioned, cited and how prominently.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = CopilotApi()
val prompt : kotlin.String = prompt_example // kotlin.String | The prompt to ask Copilot.
val brand : kotlin.String = brand_example // kotlin.String | Brand name to look for in the answer.
val domain : kotlin.String = domain_example // kotlin.String | Brand domain, for citation matching.
val aliases : kotlin.String = aliases_example // kotlin.String | Comma-separated alternative names.
val competitors : kotlin.String = competitors_example // kotlin.String | Comma-separated competitor names.
val country : kotlin.String = country_example // kotlin.String | ISO-3166 alpha-2 country to ask from, e.g. 'JP', 'US', 'GB'. Unless `market` is set, Copilot also answers in that country's market.
val market : kotlin.String = market_example // kotlin.String | Bing market (language-COUNTRY), e.g. 'ja-JP', 'en-GB'. Defaults to the country's.
val strictCountry : kotlin.Boolean = true // kotlin.Boolean | Answer only from an exit in `country`, never another one; 503 `country_unavailable` (not billed) when none answers. Requires `country`.
try {
    val result : kotlin.Any = apiInstance.copilotMeasureABrandSVisibilityInACopilotAnswer(prompt, brand, domain, aliases, competitors, country, market, strictCountry)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CopilotApi#copilotMeasureABrandSVisibilityInACopilotAnswer")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CopilotApi#copilotMeasureABrandSVisibilityInACopilotAnswer")
    e.printStackTrace()
}
```

### Parameters
| **prompt** | **kotlin.String**| The prompt to ask Copilot. | |
| **brand** | **kotlin.String**| Brand name to look for in the answer. | |
| **domain** | **kotlin.String**| Brand domain, for citation matching. | [optional] |
| **aliases** | **kotlin.String**| Comma-separated alternative names. | [optional] |
| **competitors** | **kotlin.String**| Comma-separated competitor names. | [optional] |
| **country** | **kotlin.String**| ISO-3166 alpha-2 country to ask from, e.g. &#39;JP&#39;, &#39;US&#39;, &#39;GB&#39;. Unless &#x60;market&#x60; is set, Copilot also answers in that country&#39;s market. | [optional] |
| **market** | **kotlin.String**| Bing market (language-COUNTRY), e.g. &#39;ja-JP&#39;, &#39;en-GB&#39;. Defaults to the country&#39;s. | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **strictCountry** | **kotlin.Boolean**| Answer only from an exit in &#x60;country&#x60;, never another one; 503 &#x60;country_unavailable&#x60; (not billed) when none answers. Requires &#x60;country&#x60;. | [optional] [default to false] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="copilotMeasureABrandSVisibilityInACopilotAnswerPost"></a>
# **copilotMeasureABrandSVisibilityInACopilotAnswerPost**
> kotlin.Any copilotMeasureABrandSVisibilityInACopilotAnswerPost()

Measure a brand&#39;s visibility in a Copilot answer (POST)

POST form, for longer prompts and larger competitor sets.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = CopilotApi()
try {
    val result : kotlin.Any = apiInstance.copilotMeasureABrandSVisibilityInACopilotAnswerPost()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CopilotApi#copilotMeasureABrandSVisibilityInACopilotAnswerPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CopilotApi#copilotMeasureABrandSVisibilityInACopilotAnswerPost")
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

