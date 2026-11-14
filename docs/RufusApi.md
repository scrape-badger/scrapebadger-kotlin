# RufusApi

All URIs are relative to *https://scrapebadger.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**rufusAmazonRufusScraperHealthCheck**](RufusApi.md#rufusAmazonRufusScraperHealthCheck) | **GET** /v1/rufus/health | Amazon Rufus scraper health check |
| [**rufusAmazonRufusScraperHealthCheckHead**](RufusApi.md#rufusAmazonRufusScraperHealthCheckHead) | **HEAD** /v1/rufus/health | Amazon Rufus scraper health check |
| [**rufusAskAmazonRufusAQuestion**](RufusApi.md#rufusAskAmazonRufusAQuestion) | **GET** /v1/rufus/ask | Ask Amazon Rufus a question |
| [**rufusAskAmazonRufusAQuestionPost**](RufusApi.md#rufusAskAmazonRufusAQuestionPost) | **POST** /v1/rufus/ask | Ask Amazon Rufus a question (POST) |
| [**rufusListAmazonRufusModels**](RufusApi.md#rufusListAmazonRufusModels) | **GET** /v1/rufus/models | List Amazon Rufus models |


<a id="rufusAmazonRufusScraperHealthCheck"></a>
# **rufusAmazonRufusScraperHealthCheck**
> kotlin.Any rufusAmazonRufusScraperHealthCheck()

Amazon Rufus scraper health check

Check health of the Amazon service that serves Rufus (accepts HEAD).

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = RufusApi()
try {
    val result : kotlin.Any = apiInstance.rufusAmazonRufusScraperHealthCheck()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RufusApi#rufusAmazonRufusScraperHealthCheck")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RufusApi#rufusAmazonRufusScraperHealthCheck")
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

<a id="rufusAmazonRufusScraperHealthCheckHead"></a>
# **rufusAmazonRufusScraperHealthCheckHead**
> kotlin.Any rufusAmazonRufusScraperHealthCheckHead()

Amazon Rufus scraper health check

Check health of the Amazon service that serves Rufus (accepts HEAD).

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = RufusApi()
try {
    val result : kotlin.Any = apiInstance.rufusAmazonRufusScraperHealthCheckHead()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RufusApi#rufusAmazonRufusScraperHealthCheckHead")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RufusApi#rufusAmazonRufusScraperHealthCheckHead")
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

<a id="rufusAskAmazonRufusAQuestion"></a>
# **rufusAskAmazonRufusAQuestion**
> kotlin.Any rufusAskAmazonRufusAQuestion(prompt, asin)

Ask Amazon Rufus a question

Ask Alexa for Shopping (Rufus) and get its answer and product cards.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = RufusApi()
val prompt : kotlin.String = prompt_example // kotlin.String | The shopping question to ask (max 4000 characters).
val asin : kotlin.String = asin_example // kotlin.String | Optional product ASIN whose page should provide the shopping context.
try {
    val result : kotlin.Any = apiInstance.rufusAskAmazonRufusAQuestion(prompt, asin)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RufusApi#rufusAskAmazonRufusAQuestion")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RufusApi#rufusAskAmazonRufusAQuestion")
    e.printStackTrace()
}
```

### Parameters
| **prompt** | **kotlin.String**| The shopping question to ask (max 4000 characters). | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **asin** | **kotlin.String**| Optional product ASIN whose page should provide the shopping context. | [optional] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="rufusAskAmazonRufusAQuestionPost"></a>
# **rufusAskAmazonRufusAQuestionPost**
> kotlin.Any rufusAskAmazonRufusAQuestionPost(rufusAskRequest)

Ask Amazon Rufus a question (POST)

POST form of &#x60;/ask&#x60;, accepting prompt and optional asin in the JSON body.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = RufusApi()
val rufusAskRequest : RufusAskRequest =  // RufusAskRequest | 
try {
    val result : kotlin.Any = apiInstance.rufusAskAmazonRufusAQuestionPost(rufusAskRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RufusApi#rufusAskAmazonRufusAQuestionPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RufusApi#rufusAskAmazonRufusAQuestionPost")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **rufusAskRequest** | [**RufusAskRequest**](RufusAskRequest.md)|  | |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="rufusListAmazonRufusModels"></a>
# **rufusListAmazonRufusModels**
> kotlin.Any rufusListAmazonRufusModels()

List Amazon Rufus models

List the Amazon shopping assistant surface exposed by this API.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = RufusApi()
try {
    val result : kotlin.Any = apiInstance.rufusListAmazonRufusModels()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RufusApi#rufusListAmazonRufusModels")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RufusApi#rufusListAmazonRufusModels")
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

