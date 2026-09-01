# WebApi

All URIs are relative to *https://scrapebadger.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**webDetectAntiBotAndCaptchaSystems**](WebApi.md#webDetectAntiBotAndCaptchaSystems) | **POST** /v1/web/detect | Detect anti-bot and CAPTCHA systems |
| [**webExtractStructuredData**](WebApi.md#webExtractStructuredData) | **POST** /v1/web/extract | Extract structured data |
| [**webGetBatchJobStatus**](WebApi.md#webGetBatchJobStatus) | **GET** /v1/web/batch/{job_id} | Get batch job status |
| [**webPollAnAutoUnblockDiscoveryJob**](WebApi.md#webPollAnAutoUnblockDiscoveryJob) | **GET** /v1/web/unblock/{job_id} | Poll an auto-unblock discovery job |
| [**webScrapeAUrl**](WebApi.md#webScrapeAUrl) | **POST** /v1/web/scrape | Scrape a URL |
| [**webSubmitBatchScrapingJob**](WebApi.md#webSubmitBatchScrapingJob) | **POST** /v1/web/batch | Submit batch scraping job |
| [**webTakeAScreenshot**](WebApi.md#webTakeAScreenshot) | **POST** /v1/web/screenshot | Take a screenshot |
| [**webWebScraperHealthCheck**](WebApi.md#webWebScraperHealthCheck) | **GET** /v1/web/health | Web scraper health check |
| [**webWebScraperHealthCheckHead**](WebApi.md#webWebScraperHealthCheckHead) | **HEAD** /v1/web/health | Web scraper health check |


<a id="webDetectAntiBotAndCaptchaSystems"></a>
# **webDetectAntiBotAndCaptchaSystems**
> kotlin.Any webDetectAntiBotAndCaptchaSystems()

Detect anti-bot and CAPTCHA systems

Detect which anti-bot and CAPTCHA systems are present on a URL.  Uses rnet to fetch the page and identify DataDome, Cloudflare, Akamai, Kasada, Amazon WAF, reCAPTCHA, hCaptcha, GeeTest, and more. Cost: 1 credit.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = WebApi()
try {
    val result : kotlin.Any = apiInstance.webDetectAntiBotAndCaptchaSystems()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebApi#webDetectAntiBotAndCaptchaSystems")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebApi#webDetectAntiBotAndCaptchaSystems")
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

<a id="webExtractStructuredData"></a>
# **webExtractStructuredData**
> kotlin.Any webExtractStructuredData()

Extract structured data

Extract structured data from a URL using CSS or XPath selectors. (Phase 6)

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = WebApi()
try {
    val result : kotlin.Any = apiInstance.webExtractStructuredData()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebApi#webExtractStructuredData")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebApi#webExtractStructuredData")
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

<a id="webGetBatchJobStatus"></a>
# **webGetBatchJobStatus**
> kotlin.Any webGetBatchJobStatus(jobId)

Get batch job status

Get the status of a batch scraping job. (Phase 6)

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = WebApi()
val jobId : kotlin.String = jobId_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.webGetBatchJobStatus(jobId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebApi#webGetBatchJobStatus")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebApi#webGetBatchJobStatus")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **jobId** | **kotlin.String**|  | |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="webPollAnAutoUnblockDiscoveryJob"></a>
# **webPollAnAutoUnblockDiscoveryJob**
> kotlin.Any webPollAnAutoUnblockDiscoveryJob(jobId)

Poll an auto-unblock discovery job

Return the status + progress narration for an auto-unblock job.  Polled by the playground loader. &#x60;&#x60;job_id&#x60;&#x60; is an unguessable UUID handed out in the &#x60;&#x60;202 unblocking&#x60;&#x60; envelope and acts as a capability token, so any authenticated caller holding it can read the job (this is what lets several users share one discovery run&#39;s loader).

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = WebApi()
val jobId : kotlin.String = jobId_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.webPollAnAutoUnblockDiscoveryJob(jobId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebApi#webPollAnAutoUnblockDiscoveryJob")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebApi#webPollAnAutoUnblockDiscoveryJob")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **jobId** | **kotlin.String**|  | |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="webScrapeAUrl"></a>
# **webScrapeAUrl**
> kotlin.Any webScrapeAUrl()

Scrape a URL

Scrape a URL and return its content.  The Generic Web Scraping API is fully user-driven: callers pick their own request parameters (engine, proxy tier, country, JS rendering, …). A blocked target surfaces the raw 422 &#x60;&#x60;blocking_page_detected&#x60;&#x60; so the caller can tune parameters themselves — we do NOT auto-trigger host discovery. Curated per-origin overrides (which the dedicated scraper APIs depend on) still apply.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = WebApi()
try {
    val result : kotlin.Any = apiInstance.webScrapeAUrl()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebApi#webScrapeAUrl")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebApi#webScrapeAUrl")
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

<a id="webSubmitBatchScrapingJob"></a>
# **webSubmitBatchScrapingJob**
> kotlin.Any webSubmitBatchScrapingJob()

Submit batch scraping job

Submit a batch of URLs for scraping. (Phase 6)

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = WebApi()
try {
    val result : kotlin.Any = apiInstance.webSubmitBatchScrapingJob()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebApi#webSubmitBatchScrapingJob")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebApi#webSubmitBatchScrapingJob")
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

<a id="webTakeAScreenshot"></a>
# **webTakeAScreenshot**
> kotlin.Any webTakeAScreenshot()

Take a screenshot

Take a screenshot of a URL. (browser engine)

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = WebApi()
try {
    val result : kotlin.Any = apiInstance.webTakeAScreenshot()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebApi#webTakeAScreenshot")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebApi#webTakeAScreenshot")
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

<a id="webWebScraperHealthCheck"></a>
# **webWebScraperHealthCheck**
> kotlin.Any webWebScraperHealthCheck()

Web scraper health check

Check health of the web scraper service.  Bypasses the proxy abstraction because web-scraper exposes &#x60;&#x60;/health&#x60;&#x60; at the root (no &#x60;&#x60;/api/v1&#x60;&#x60; prefix, unlike the other scraper services).  Accepts &#x60;&#x60;HEAD&#x60;&#x60; so external uptime checkers (UptimeRobot uses HEAD by default for HTTP monitors) don&#39;t get a 405 Method Not Allowed.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = WebApi()
try {
    val result : kotlin.Any = apiInstance.webWebScraperHealthCheck()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebApi#webWebScraperHealthCheck")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebApi#webWebScraperHealthCheck")
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

<a id="webWebScraperHealthCheckHead"></a>
# **webWebScraperHealthCheckHead**
> kotlin.Any webWebScraperHealthCheckHead()

Web scraper health check

Check health of the web scraper service.  Bypasses the proxy abstraction because web-scraper exposes &#x60;&#x60;/health&#x60;&#x60; at the root (no &#x60;&#x60;/api/v1&#x60;&#x60; prefix, unlike the other scraper services).  Accepts &#x60;&#x60;HEAD&#x60;&#x60; so external uptime checkers (UptimeRobot uses HEAD by default for HTTP monitors) don&#39;t get a 405 Method Not Allowed.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = WebApi()
try {
    val result : kotlin.Any = apiInstance.webWebScraperHealthCheckHead()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebApi#webWebScraperHealthCheckHead")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebApi#webWebScraperHealthCheckHead")
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

