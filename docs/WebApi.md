# WebApi

All URIs are relative to *https://scrapebadger.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**webDetectAntiBotAndCaptchaSystems**](WebApi.md#webDetectAntiBotAndCaptchaSystems) | **POST** /v1/web/detect | Detect anti-bot and CAPTCHA systems |
| [**webExtractStructuredData**](WebApi.md#webExtractStructuredData) | **POST** /v1/web/extract | Extract structured data |
| [**webPollAnAutoUnblockDiscoveryJob**](WebApi.md#webPollAnAutoUnblockDiscoveryJob) | **GET** /v1/web/unblock/{job_id} | Poll an auto-unblock discovery job |
| [**webScrapeAUrl**](WebApi.md#webScrapeAUrl) | **POST** /v1/web/scrape | Scrape a URL |
| [**webTakeAScreenshot**](WebApi.md#webTakeAScreenshot) | **POST** /v1/web/screenshot | Take a screenshot |
| [**webWebScraperHealthCheck**](WebApi.md#webWebScraperHealthCheck) | **GET** /v1/web/health | Web scraper health check |
| [**webWebScraperHealthCheckHead**](WebApi.md#webWebScraperHealthCheckHead) | **HEAD** /v1/web/health | Web scraper health check |


<a id="webDetectAntiBotAndCaptchaSystems"></a>
# **webDetectAntiBotAndCaptchaSystems**
> kotlin.Any webDetectAntiBotAndCaptchaSystems(prefer, xCallbackURL, idempotencyKey, async, asyncWait, callbackUrl, idempotencyKey2)

Detect anti-bot and CAPTCHA systems

Detect which anti-bot and CAPTCHA systems are present on a URL.  Uses rnet to fetch the page and identify DataDome, Cloudflare, Akamai, Kasada, Amazon WAF, reCAPTCHA, hCaptcha, GeeTest, and more. Cost: 1 credit.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = WebApi()
val prefer : kotlin.String = respond-async, wait=25 // kotlin.String | `respond-async[, wait=N]` (RFC 7240): run the call async. If it has not finished after `wait` seconds (0-120, default 25) the answer is `202` with a `request_id`; poll `GET /v1/requests/{request_id}`. Its `wait=` wins over `async_wait`; without one, `async_wait` sets the wait.
val xCallbackURL : java.net.URI = xCallbackURL_example // java.net.URI | An `https` URL that receives the signed `request.completed` webhook when the call finishes. Implies async: on its own (no `Prefer`, `async` or `async_wait`) the answer is an immediate `202`; with `Prefer: respond-async` or `async=true` the call still waits 25 s unless a wait is given. Wins over `callback_url`.
val idempotencyKey : kotlin.String = idempotencyKey_example // kotlin.String | 1-200 visible ASCII characters, per account, kept as long as the result (about 15 minutes). The same key on the same call returns that call's current state (`Idempotent-Replayed: true`) without running or billing it again; on a different call it is `409 idempotency_key_reused`. Applies to async calls only; on a synchronous call it is ignored. Wins over `idempotency_key`.
val async : kotlin.Boolean = true // kotlin.Boolean | Query form of `Prefer: respond-async`: `true` or `1` (also `yes`, `on`; `false`, `0`, `no`, `off` leave the call synchronous). Waits 25 s unless `async_wait` is given. Not sent to the scraper.
val asyncWait : kotlin.Int = 56 // kotlin.Int | Seconds (0-120; values outside are clamped) to wait for the result before answering `202`. Implies async. Not sent to the scraper.
val callbackUrl : java.net.URI = callbackUrl_example // java.net.URI | Query form of `X-Callback-URL` (URL-encode it). Implies async; on its own the answer is an immediate `202` (wait 0). Not sent to the scraper.
val idempotencyKey2 : kotlin.String = idempotencyKey_example // kotlin.String | Query form of `Idempotency-Key`. Not sent to the scraper.
try {
    val result : kotlin.Any = apiInstance.webDetectAntiBotAndCaptchaSystems(prefer, xCallbackURL, idempotencyKey, async, asyncWait, callbackUrl, idempotencyKey2)
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
| **prefer** | **kotlin.String**| &#x60;respond-async[, wait&#x3D;N]&#x60; (RFC 7240): run the call async. If it has not finished after &#x60;wait&#x60; seconds (0-120, default 25) the answer is &#x60;202&#x60; with a &#x60;request_id&#x60;; poll &#x60;GET /v1/requests/{request_id}&#x60;. Its &#x60;wait&#x3D;&#x60; wins over &#x60;async_wait&#x60;; without one, &#x60;async_wait&#x60; sets the wait. | [optional] |
| **xCallbackURL** | **java.net.URI**| An &#x60;https&#x60; URL that receives the signed &#x60;request.completed&#x60; webhook when the call finishes. Implies async: on its own (no &#x60;Prefer&#x60;, &#x60;async&#x60; or &#x60;async_wait&#x60;) the answer is an immediate &#x60;202&#x60;; with &#x60;Prefer: respond-async&#x60; or &#x60;async&#x3D;true&#x60; the call still waits 25 s unless a wait is given. Wins over &#x60;callback_url&#x60;. | [optional] |
| **idempotencyKey** | **kotlin.String**| 1-200 visible ASCII characters, per account, kept as long as the result (about 15 minutes). The same key on the same call returns that call&#39;s current state (&#x60;Idempotent-Replayed: true&#x60;) without running or billing it again; on a different call it is &#x60;409 idempotency_key_reused&#x60;. Applies to async calls only; on a synchronous call it is ignored. Wins over &#x60;idempotency_key&#x60;. | [optional] |
| **async** | **kotlin.Boolean**| Query form of &#x60;Prefer: respond-async&#x60;: &#x60;true&#x60; or &#x60;1&#x60; (also &#x60;yes&#x60;, &#x60;on&#x60;; &#x60;false&#x60;, &#x60;0&#x60;, &#x60;no&#x60;, &#x60;off&#x60; leave the call synchronous). Waits 25 s unless &#x60;async_wait&#x60; is given. Not sent to the scraper. | [optional] |
| **asyncWait** | **kotlin.Int**| Seconds (0-120; values outside are clamped) to wait for the result before answering &#x60;202&#x60;. Implies async. Not sent to the scraper. | [optional] |
| **callbackUrl** | **java.net.URI**| Query form of &#x60;X-Callback-URL&#x60; (URL-encode it). Implies async; on its own the answer is an immediate &#x60;202&#x60; (wait 0). Not sent to the scraper. | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **idempotencyKey2** | **kotlin.String**| Query form of &#x60;Idempotency-Key&#x60;. Not sent to the scraper. | [optional] |

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
> kotlin.Any webExtractStructuredData(extractRequest, prefer, xCallbackURL, idempotencyKey, async, asyncWait, callbackUrl, idempotencyKey2)

Extract structured data

Scrape a URL and extract fields with CSS/XPath selectors and/or AI.  &#x60;&#x60;extract_rules&#x60;&#x60; maps a field to a selector and returns &#x60;&#x60;data&#x60;&#x60;; &#x60;&#x60;ai_extract_rules&#x60;&#x60; (field -&gt; description) and &#x60;&#x60;ai_query&#x60;&#x60; return &#x60;&#x60;ai_extraction&#x60;&#x60;. Billed as a scrape, plus the AI extraction credits when AI is asked for and succeeds.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = WebApi()
val extractRequest : ExtractRequest =  // ExtractRequest | 
val prefer : kotlin.String = respond-async, wait=25 // kotlin.String | `respond-async[, wait=N]` (RFC 7240): run the call async. If it has not finished after `wait` seconds (0-120, default 25) the answer is `202` with a `request_id`; poll `GET /v1/requests/{request_id}`. Its `wait=` wins over `async_wait`; without one, `async_wait` sets the wait.
val xCallbackURL : java.net.URI = xCallbackURL_example // java.net.URI | An `https` URL that receives the signed `request.completed` webhook when the call finishes. Implies async: on its own (no `Prefer`, `async` or `async_wait`) the answer is an immediate `202`; with `Prefer: respond-async` or `async=true` the call still waits 25 s unless a wait is given. Wins over `callback_url`.
val idempotencyKey : kotlin.String = idempotencyKey_example // kotlin.String | 1-200 visible ASCII characters, per account, kept as long as the result (about 15 minutes). The same key on the same call returns that call's current state (`Idempotent-Replayed: true`) without running or billing it again; on a different call it is `409 idempotency_key_reused`. Applies to async calls only; on a synchronous call it is ignored. Wins over `idempotency_key`.
val async : kotlin.Boolean = true // kotlin.Boolean | Query form of `Prefer: respond-async`: `true` or `1` (also `yes`, `on`; `false`, `0`, `no`, `off` leave the call synchronous). Waits 25 s unless `async_wait` is given. Not sent to the scraper.
val asyncWait : kotlin.Int = 56 // kotlin.Int | Seconds (0-120; values outside are clamped) to wait for the result before answering `202`. Implies async. Not sent to the scraper.
val callbackUrl : java.net.URI = callbackUrl_example // java.net.URI | Query form of `X-Callback-URL` (URL-encode it). Implies async; on its own the answer is an immediate `202` (wait 0). Not sent to the scraper.
val idempotencyKey2 : kotlin.String = idempotencyKey_example // kotlin.String | Query form of `Idempotency-Key`. Not sent to the scraper.
try {
    val result : kotlin.Any = apiInstance.webExtractStructuredData(extractRequest, prefer, xCallbackURL, idempotencyKey, async, asyncWait, callbackUrl, idempotencyKey2)
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
| **extractRequest** | [**ExtractRequest**](ExtractRequest.md)|  | |
| **prefer** | **kotlin.String**| &#x60;respond-async[, wait&#x3D;N]&#x60; (RFC 7240): run the call async. If it has not finished after &#x60;wait&#x60; seconds (0-120, default 25) the answer is &#x60;202&#x60; with a &#x60;request_id&#x60;; poll &#x60;GET /v1/requests/{request_id}&#x60;. Its &#x60;wait&#x3D;&#x60; wins over &#x60;async_wait&#x60;; without one, &#x60;async_wait&#x60; sets the wait. | [optional] |
| **xCallbackURL** | **java.net.URI**| An &#x60;https&#x60; URL that receives the signed &#x60;request.completed&#x60; webhook when the call finishes. Implies async: on its own (no &#x60;Prefer&#x60;, &#x60;async&#x60; or &#x60;async_wait&#x60;) the answer is an immediate &#x60;202&#x60;; with &#x60;Prefer: respond-async&#x60; or &#x60;async&#x3D;true&#x60; the call still waits 25 s unless a wait is given. Wins over &#x60;callback_url&#x60;. | [optional] |
| **idempotencyKey** | **kotlin.String**| 1-200 visible ASCII characters, per account, kept as long as the result (about 15 minutes). The same key on the same call returns that call&#39;s current state (&#x60;Idempotent-Replayed: true&#x60;) without running or billing it again; on a different call it is &#x60;409 idempotency_key_reused&#x60;. Applies to async calls only; on a synchronous call it is ignored. Wins over &#x60;idempotency_key&#x60;. | [optional] |
| **async** | **kotlin.Boolean**| Query form of &#x60;Prefer: respond-async&#x60;: &#x60;true&#x60; or &#x60;1&#x60; (also &#x60;yes&#x60;, &#x60;on&#x60;; &#x60;false&#x60;, &#x60;0&#x60;, &#x60;no&#x60;, &#x60;off&#x60; leave the call synchronous). Waits 25 s unless &#x60;async_wait&#x60; is given. Not sent to the scraper. | [optional] |
| **asyncWait** | **kotlin.Int**| Seconds (0-120; values outside are clamped) to wait for the result before answering &#x60;202&#x60;. Implies async. Not sent to the scraper. | [optional] |
| **callbackUrl** | **java.net.URI**| Query form of &#x60;X-Callback-URL&#x60; (URL-encode it). Implies async; on its own the answer is an immediate &#x60;202&#x60; (wait 0). Not sent to the scraper. | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **idempotencyKey2** | **kotlin.String**| Query form of &#x60;Idempotency-Key&#x60;. Not sent to the scraper. | [optional] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: application/json
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
> kotlin.Any webScrapeAUrl(prefer, xCallbackURL, idempotencyKey, async, asyncWait, callbackUrl, idempotencyKey2)

Scrape a URL

Scrape a URL and return its content.  Callers pick their own request parameters (engine, proxy tier, country, JS rendering, …). When a host has a per-origin override, its access settings (engine chain, proxy tier/type/country, warm-up, injected headers) are used instead of the caller&#39;s, and the response&#39;s &#x60;&#x60;X-Proxy-Tier-Effective&#x60;&#x60; header names the tier billed; output settings (&#x60;&#x60;render_js&#x60;&#x60;, &#x60;&#x60;wait_for&#x60;&#x60;, &#x60;&#x60;js_scenario&#x60;&#x60;, &#x60;&#x60;format&#x60;&#x60;, …) stay the caller&#39;s. A blocked target returns 422 &#x60;&#x60;blocking_page_detected&#x60;&#x60; at once, with &#x60;&#x60;block_kind&#x60;&#x60;, &#x60;&#x60;vendor&#x60;&#x60; and, for a CAPTCHA wall, the gating &#x60;&#x60;captcha&#x60;&#x60;. Repeated blocks on a host with no override start a background search for a working configuration, reported as &#x60;&#x60;unblock&#x60;&#x60; / &#x60;&#x60;X-Unblock&#x60;&#x60; (&#x60;&#x60;discovering&#x60;&#x60; | &#x60;&#x60;cooldown&#x60;&#x60; | &#x60;&#x60;none&#x60;&#x60;); once found it applies to later requests automatically.  Repeated identical upstream failures can return 429 with Retry-After under the gateway&#39;s existing failure-backoff thresholds. Other URLs and changed request options (including credentials) remain independent; validation errors do not fund or trip this protection.  One exception, added for SB-001083/SCR-64: a plain &#x60;&#x60;google.com/search&#x60;&#x60; web-SERP fetch is served by the dedicated Google scraper, whose rotation loop is built for SearchGuard. Same request shape, same response shape, billed at what it actually cost — the caller sees only a better hit rate. &#x60;&#x60;serp_adapter&#x60;&#x60; fails closed, so any request carrying a parameter it does not recognise as route-or-cost takes the generic path unchanged, and the user-driven contract above still holds.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = WebApi()
val prefer : kotlin.String = respond-async, wait=25 // kotlin.String | `respond-async[, wait=N]` (RFC 7240): run the call async. If it has not finished after `wait` seconds (0-120, default 25) the answer is `202` with a `request_id`; poll `GET /v1/requests/{request_id}`. Its `wait=` wins over `async_wait`; without one, `async_wait` sets the wait.
val xCallbackURL : java.net.URI = xCallbackURL_example // java.net.URI | An `https` URL that receives the signed `request.completed` webhook when the call finishes. Implies async: on its own (no `Prefer`, `async` or `async_wait`) the answer is an immediate `202`; with `Prefer: respond-async` or `async=true` the call still waits 25 s unless a wait is given. Wins over `callback_url`.
val idempotencyKey : kotlin.String = idempotencyKey_example // kotlin.String | 1-200 visible ASCII characters, per account, kept as long as the result (about 15 minutes). The same key on the same call returns that call's current state (`Idempotent-Replayed: true`) without running or billing it again; on a different call it is `409 idempotency_key_reused`. Applies to async calls only; on a synchronous call it is ignored. Wins over `idempotency_key`.
val async : kotlin.Boolean = true // kotlin.Boolean | Query form of `Prefer: respond-async`: `true` or `1` (also `yes`, `on`; `false`, `0`, `no`, `off` leave the call synchronous). Waits 25 s unless `async_wait` is given. Not sent to the scraper.
val asyncWait : kotlin.Int = 56 // kotlin.Int | Seconds (0-120; values outside are clamped) to wait for the result before answering `202`. Implies async. Not sent to the scraper.
val callbackUrl : java.net.URI = callbackUrl_example // java.net.URI | Query form of `X-Callback-URL` (URL-encode it). Implies async; on its own the answer is an immediate `202` (wait 0). Not sent to the scraper.
val idempotencyKey2 : kotlin.String = idempotencyKey_example // kotlin.String | Query form of `Idempotency-Key`. Not sent to the scraper.
try {
    val result : kotlin.Any = apiInstance.webScrapeAUrl(prefer, xCallbackURL, idempotencyKey, async, asyncWait, callbackUrl, idempotencyKey2)
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
| **prefer** | **kotlin.String**| &#x60;respond-async[, wait&#x3D;N]&#x60; (RFC 7240): run the call async. If it has not finished after &#x60;wait&#x60; seconds (0-120, default 25) the answer is &#x60;202&#x60; with a &#x60;request_id&#x60;; poll &#x60;GET /v1/requests/{request_id}&#x60;. Its &#x60;wait&#x3D;&#x60; wins over &#x60;async_wait&#x60;; without one, &#x60;async_wait&#x60; sets the wait. | [optional] |
| **xCallbackURL** | **java.net.URI**| An &#x60;https&#x60; URL that receives the signed &#x60;request.completed&#x60; webhook when the call finishes. Implies async: on its own (no &#x60;Prefer&#x60;, &#x60;async&#x60; or &#x60;async_wait&#x60;) the answer is an immediate &#x60;202&#x60;; with &#x60;Prefer: respond-async&#x60; or &#x60;async&#x3D;true&#x60; the call still waits 25 s unless a wait is given. Wins over &#x60;callback_url&#x60;. | [optional] |
| **idempotencyKey** | **kotlin.String**| 1-200 visible ASCII characters, per account, kept as long as the result (about 15 minutes). The same key on the same call returns that call&#39;s current state (&#x60;Idempotent-Replayed: true&#x60;) without running or billing it again; on a different call it is &#x60;409 idempotency_key_reused&#x60;. Applies to async calls only; on a synchronous call it is ignored. Wins over &#x60;idempotency_key&#x60;. | [optional] |
| **async** | **kotlin.Boolean**| Query form of &#x60;Prefer: respond-async&#x60;: &#x60;true&#x60; or &#x60;1&#x60; (also &#x60;yes&#x60;, &#x60;on&#x60;; &#x60;false&#x60;, &#x60;0&#x60;, &#x60;no&#x60;, &#x60;off&#x60; leave the call synchronous). Waits 25 s unless &#x60;async_wait&#x60; is given. Not sent to the scraper. | [optional] |
| **asyncWait** | **kotlin.Int**| Seconds (0-120; values outside are clamped) to wait for the result before answering &#x60;202&#x60;. Implies async. Not sent to the scraper. | [optional] |
| **callbackUrl** | **java.net.URI**| Query form of &#x60;X-Callback-URL&#x60; (URL-encode it). Implies async; on its own the answer is an immediate &#x60;202&#x60; (wait 0). Not sent to the scraper. | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **idempotencyKey2** | **kotlin.String**| Query form of &#x60;Idempotency-Key&#x60;. Not sent to the scraper. | [optional] |

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
> kotlin.Any webTakeAScreenshot(screenshotRequest, prefer, xCallbackURL, idempotencyKey, async, asyncWait, callbackUrl, idempotencyKey2)

Take a screenshot

Render a URL in the browser engine and return a PNG screenshot.  &#x60;&#x60;screenshot&#x60;&#x60; is the PNG, base64-encoded. &#x60;&#x60;width&#x60;&#x60;/&#x60;&#x60;height&#x60;&#x60; set the viewport; &#x60;&#x60;full_page&#x60;&#x60; captures the whole scrollable page. Billed as a browser scrape (plus the proxy tier); a page that loads without a screenshot is a 502 and costs nothing.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = WebApi()
val screenshotRequest : ScreenshotRequest =  // ScreenshotRequest | 
val prefer : kotlin.String = respond-async, wait=25 // kotlin.String | `respond-async[, wait=N]` (RFC 7240): run the call async. If it has not finished after `wait` seconds (0-120, default 25) the answer is `202` with a `request_id`; poll `GET /v1/requests/{request_id}`. Its `wait=` wins over `async_wait`; without one, `async_wait` sets the wait.
val xCallbackURL : java.net.URI = xCallbackURL_example // java.net.URI | An `https` URL that receives the signed `request.completed` webhook when the call finishes. Implies async: on its own (no `Prefer`, `async` or `async_wait`) the answer is an immediate `202`; with `Prefer: respond-async` or `async=true` the call still waits 25 s unless a wait is given. Wins over `callback_url`.
val idempotencyKey : kotlin.String = idempotencyKey_example // kotlin.String | 1-200 visible ASCII characters, per account, kept as long as the result (about 15 minutes). The same key on the same call returns that call's current state (`Idempotent-Replayed: true`) without running or billing it again; on a different call it is `409 idempotency_key_reused`. Applies to async calls only; on a synchronous call it is ignored. Wins over `idempotency_key`.
val async : kotlin.Boolean = true // kotlin.Boolean | Query form of `Prefer: respond-async`: `true` or `1` (also `yes`, `on`; `false`, `0`, `no`, `off` leave the call synchronous). Waits 25 s unless `async_wait` is given. Not sent to the scraper.
val asyncWait : kotlin.Int = 56 // kotlin.Int | Seconds (0-120; values outside are clamped) to wait for the result before answering `202`. Implies async. Not sent to the scraper.
val callbackUrl : java.net.URI = callbackUrl_example // java.net.URI | Query form of `X-Callback-URL` (URL-encode it). Implies async; on its own the answer is an immediate `202` (wait 0). Not sent to the scraper.
val idempotencyKey2 : kotlin.String = idempotencyKey_example // kotlin.String | Query form of `Idempotency-Key`. Not sent to the scraper.
try {
    val result : kotlin.Any = apiInstance.webTakeAScreenshot(screenshotRequest, prefer, xCallbackURL, idempotencyKey, async, asyncWait, callbackUrl, idempotencyKey2)
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
| **screenshotRequest** | [**ScreenshotRequest**](ScreenshotRequest.md)|  | |
| **prefer** | **kotlin.String**| &#x60;respond-async[, wait&#x3D;N]&#x60; (RFC 7240): run the call async. If it has not finished after &#x60;wait&#x60; seconds (0-120, default 25) the answer is &#x60;202&#x60; with a &#x60;request_id&#x60;; poll &#x60;GET /v1/requests/{request_id}&#x60;. Its &#x60;wait&#x3D;&#x60; wins over &#x60;async_wait&#x60;; without one, &#x60;async_wait&#x60; sets the wait. | [optional] |
| **xCallbackURL** | **java.net.URI**| An &#x60;https&#x60; URL that receives the signed &#x60;request.completed&#x60; webhook when the call finishes. Implies async: on its own (no &#x60;Prefer&#x60;, &#x60;async&#x60; or &#x60;async_wait&#x60;) the answer is an immediate &#x60;202&#x60;; with &#x60;Prefer: respond-async&#x60; or &#x60;async&#x3D;true&#x60; the call still waits 25 s unless a wait is given. Wins over &#x60;callback_url&#x60;. | [optional] |
| **idempotencyKey** | **kotlin.String**| 1-200 visible ASCII characters, per account, kept as long as the result (about 15 minutes). The same key on the same call returns that call&#39;s current state (&#x60;Idempotent-Replayed: true&#x60;) without running or billing it again; on a different call it is &#x60;409 idempotency_key_reused&#x60;. Applies to async calls only; on a synchronous call it is ignored. Wins over &#x60;idempotency_key&#x60;. | [optional] |
| **async** | **kotlin.Boolean**| Query form of &#x60;Prefer: respond-async&#x60;: &#x60;true&#x60; or &#x60;1&#x60; (also &#x60;yes&#x60;, &#x60;on&#x60;; &#x60;false&#x60;, &#x60;0&#x60;, &#x60;no&#x60;, &#x60;off&#x60; leave the call synchronous). Waits 25 s unless &#x60;async_wait&#x60; is given. Not sent to the scraper. | [optional] |
| **asyncWait** | **kotlin.Int**| Seconds (0-120; values outside are clamped) to wait for the result before answering &#x60;202&#x60;. Implies async. Not sent to the scraper. | [optional] |
| **callbackUrl** | **java.net.URI**| Query form of &#x60;X-Callback-URL&#x60; (URL-encode it). Implies async; on its own the answer is an immediate &#x60;202&#x60; (wait 0). Not sent to the scraper. | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **idempotencyKey2** | **kotlin.String**| Query form of &#x60;Idempotency-Key&#x60;. Not sent to the scraper. | [optional] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: application/json
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

