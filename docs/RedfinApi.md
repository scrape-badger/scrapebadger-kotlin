# RedfinApi

All URIs are relative to *https://scrapebadger.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**redfinGetAgentProfileListings**](RedfinApi.md#redfinGetAgentProfileListings) | **GET** /v1/redfin/agent | Get agent profile + listings |
| [**redfinGetPropertyDetail**](RedfinApi.md#redfinGetPropertyDetail) | **GET** /v1/redfin/property/{property_id} | Get property detail |
| [**redfinGetPropertyDetailByUrl**](RedfinApi.md#redfinGetPropertyDetailByUrl) | **GET** /v1/redfin/property | Get property detail by URL |
| [**redfinListCoverageMarkets**](RedfinApi.md#redfinListCoverageMarkets) | **GET** /v1/redfin/markets | List coverage markets |
| [**redfinRedfinScraperHealthCheck**](RedfinApi.md#redfinRedfinScraperHealthCheck) | **GET** /v1/redfin/health | Redfin scraper health check |
| [**redfinRedfinScraperHealthCheckHead**](RedfinApi.md#redfinRedfinScraperHealthCheckHead) | **HEAD** /v1/redfin/health | Redfin scraper health check |
| [**redfinRegionAddressSuggestions**](RedfinApi.md#redfinRegionAddressSuggestions) | **GET** /v1/redfin/autocomplete | Region/address suggestions |
| [**redfinSearchProperties**](RedfinApi.md#redfinSearchProperties) | **GET** /v1/redfin/search | Search properties |


<a id="redfinGetAgentProfileListings"></a>
# **redfinGetAgentProfileListings**
> kotlin.Any redfinGetAgentProfileListings(url, agentId, prefer, xCallbackURL, idempotencyKey, async, asyncWait, callbackUrl, idempotencyKey2)

Get agent profile + listings

Get a Redfin real-estate agent&#39;s profile and their active listings.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = RedfinApi()
val url : kotlin.String = url_example // kotlin.String | Full Redfin /realestateagents/ URL
val agentId : kotlin.String = agentId_example // kotlin.String | Redfin agent id
val prefer : kotlin.String = respond-async, wait=25 // kotlin.String | `respond-async[, wait=N]` (RFC 7240): run the call async. If it has not finished after `wait` seconds (0-120, default 25) the answer is `202` with a `request_id`; poll `GET /v1/requests/{request_id}`. Its `wait=` wins over `async_wait`; without one, `async_wait` sets the wait.
val xCallbackURL : java.net.URI = xCallbackURL_example // java.net.URI | An `https` URL that receives the signed `request.completed` webhook when the call finishes. Implies async: on its own (no `Prefer`, `async` or `async_wait`) the answer is an immediate `202`; with `Prefer: respond-async` or `async=true` the call still waits 25 s unless a wait is given. Wins over `callback_url`.
val idempotencyKey : kotlin.String = idempotencyKey_example // kotlin.String | 1-200 visible ASCII characters, per account, kept as long as the result (about 15 minutes). The same key on the same call returns that call's current state (`Idempotent-Replayed: true`) without running or billing it again; on a different call it is `409 idempotency_key_reused`. Applies to async calls only; on a synchronous call it is ignored. Wins over `idempotency_key`.
val async : kotlin.Boolean = true // kotlin.Boolean | Query form of `Prefer: respond-async`: `true` or `1` (also `yes`, `on`; `false`, `0`, `no`, `off` leave the call synchronous). Waits 25 s unless `async_wait` is given. Not sent to the scraper.
val asyncWait : kotlin.Int = 56 // kotlin.Int | Seconds (0-120; values outside are clamped) to wait for the result before answering `202`. Implies async. Not sent to the scraper.
val callbackUrl : java.net.URI = callbackUrl_example // java.net.URI | Query form of `X-Callback-URL` (URL-encode it). Implies async; on its own the answer is an immediate `202` (wait 0). Not sent to the scraper.
val idempotencyKey2 : kotlin.String = idempotencyKey_example // kotlin.String | Query form of `Idempotency-Key`. Not sent to the scraper.
try {
    val result : kotlin.Any = apiInstance.redfinGetAgentProfileListings(url, agentId, prefer, xCallbackURL, idempotencyKey, async, asyncWait, callbackUrl, idempotencyKey2)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RedfinApi#redfinGetAgentProfileListings")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RedfinApi#redfinGetAgentProfileListings")
    e.printStackTrace()
}
```

### Parameters
| **url** | **kotlin.String**| Full Redfin /realestateagents/ URL | [optional] |
| **agentId** | **kotlin.String**| Redfin agent id | [optional] |
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

<a id="redfinGetPropertyDetail"></a>
# **redfinGetPropertyDetail**
> kotlin.Any redfinGetPropertyDetail(propertyId, prefer, xCallbackURL, idempotencyKey, async, asyncWait, callbackUrl, idempotencyKey2)

Get property detail

Get a single Redfin property&#39;s full detail by its numeric propertyId.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = RedfinApi()
val propertyId : kotlin.String = propertyId_example // kotlin.String | 
val prefer : kotlin.String = respond-async, wait=25 // kotlin.String | `respond-async[, wait=N]` (RFC 7240): run the call async. If it has not finished after `wait` seconds (0-120, default 25) the answer is `202` with a `request_id`; poll `GET /v1/requests/{request_id}`. Its `wait=` wins over `async_wait`; without one, `async_wait` sets the wait.
val xCallbackURL : java.net.URI = xCallbackURL_example // java.net.URI | An `https` URL that receives the signed `request.completed` webhook when the call finishes. Implies async: on its own (no `Prefer`, `async` or `async_wait`) the answer is an immediate `202`; with `Prefer: respond-async` or `async=true` the call still waits 25 s unless a wait is given. Wins over `callback_url`.
val idempotencyKey : kotlin.String = idempotencyKey_example // kotlin.String | 1-200 visible ASCII characters, per account, kept as long as the result (about 15 minutes). The same key on the same call returns that call's current state (`Idempotent-Replayed: true`) without running or billing it again; on a different call it is `409 idempotency_key_reused`. Applies to async calls only; on a synchronous call it is ignored. Wins over `idempotency_key`.
val async : kotlin.Boolean = true // kotlin.Boolean | Query form of `Prefer: respond-async`: `true` or `1` (also `yes`, `on`; `false`, `0`, `no`, `off` leave the call synchronous). Waits 25 s unless `async_wait` is given. Not sent to the scraper.
val asyncWait : kotlin.Int = 56 // kotlin.Int | Seconds (0-120; values outside are clamped) to wait for the result before answering `202`. Implies async. Not sent to the scraper.
val callbackUrl : java.net.URI = callbackUrl_example // java.net.URI | Query form of `X-Callback-URL` (URL-encode it). Implies async; on its own the answer is an immediate `202` (wait 0). Not sent to the scraper.
val idempotencyKey2 : kotlin.String = idempotencyKey_example // kotlin.String | Query form of `Idempotency-Key`. Not sent to the scraper.
try {
    val result : kotlin.Any = apiInstance.redfinGetPropertyDetail(propertyId, prefer, xCallbackURL, idempotencyKey, async, asyncWait, callbackUrl, idempotencyKey2)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RedfinApi#redfinGetPropertyDetail")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RedfinApi#redfinGetPropertyDetail")
    e.printStackTrace()
}
```

### Parameters
| **propertyId** | **kotlin.String**|  | |
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

<a id="redfinGetPropertyDetailByUrl"></a>
# **redfinGetPropertyDetailByUrl**
> kotlin.Any redfinGetPropertyDetailByUrl(url, prefer, xCallbackURL, idempotencyKey, async, asyncWait, callbackUrl, idempotencyKey2)

Get property detail by URL

Get a single Redfin property&#39;s full detail by its home URL.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = RedfinApi()
val url : kotlin.String = url_example // kotlin.String | Full Redfin property URL (/CA/City/.../home/12345678)
val prefer : kotlin.String = respond-async, wait=25 // kotlin.String | `respond-async[, wait=N]` (RFC 7240): run the call async. If it has not finished after `wait` seconds (0-120, default 25) the answer is `202` with a `request_id`; poll `GET /v1/requests/{request_id}`. Its `wait=` wins over `async_wait`; without one, `async_wait` sets the wait.
val xCallbackURL : java.net.URI = xCallbackURL_example // java.net.URI | An `https` URL that receives the signed `request.completed` webhook when the call finishes. Implies async: on its own (no `Prefer`, `async` or `async_wait`) the answer is an immediate `202`; with `Prefer: respond-async` or `async=true` the call still waits 25 s unless a wait is given. Wins over `callback_url`.
val idempotencyKey : kotlin.String = idempotencyKey_example // kotlin.String | 1-200 visible ASCII characters, per account, kept as long as the result (about 15 minutes). The same key on the same call returns that call's current state (`Idempotent-Replayed: true`) without running or billing it again; on a different call it is `409 idempotency_key_reused`. Applies to async calls only; on a synchronous call it is ignored. Wins over `idempotency_key`.
val async : kotlin.Boolean = true // kotlin.Boolean | Query form of `Prefer: respond-async`: `true` or `1` (also `yes`, `on`; `false`, `0`, `no`, `off` leave the call synchronous). Waits 25 s unless `async_wait` is given. Not sent to the scraper.
val asyncWait : kotlin.Int = 56 // kotlin.Int | Seconds (0-120; values outside are clamped) to wait for the result before answering `202`. Implies async. Not sent to the scraper.
val callbackUrl : java.net.URI = callbackUrl_example // java.net.URI | Query form of `X-Callback-URL` (URL-encode it). Implies async; on its own the answer is an immediate `202` (wait 0). Not sent to the scraper.
val idempotencyKey2 : kotlin.String = idempotencyKey_example // kotlin.String | Query form of `Idempotency-Key`. Not sent to the scraper.
try {
    val result : kotlin.Any = apiInstance.redfinGetPropertyDetailByUrl(url, prefer, xCallbackURL, idempotencyKey, async, asyncWait, callbackUrl, idempotencyKey2)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RedfinApi#redfinGetPropertyDetailByUrl")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RedfinApi#redfinGetPropertyDetailByUrl")
    e.printStackTrace()
}
```

### Parameters
| **url** | **kotlin.String**| Full Redfin property URL (/CA/City/.../home/12345678) | |
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

<a id="redfinListCoverageMarkets"></a>
# **redfinListCoverageMarkets**
> kotlin.Any redfinListCoverageMarkets(prefer, xCallbackURL, idempotencyKey, async, asyncWait, callbackUrl, idempotencyKey2)

List coverage markets

List Redfin coverage regions (US).

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = RedfinApi()
val prefer : kotlin.String = respond-async, wait=25 // kotlin.String | `respond-async[, wait=N]` (RFC 7240): run the call async. If it has not finished after `wait` seconds (0-120, default 25) the answer is `202` with a `request_id`; poll `GET /v1/requests/{request_id}`. Its `wait=` wins over `async_wait`; without one, `async_wait` sets the wait.
val xCallbackURL : java.net.URI = xCallbackURL_example // java.net.URI | An `https` URL that receives the signed `request.completed` webhook when the call finishes. Implies async: on its own (no `Prefer`, `async` or `async_wait`) the answer is an immediate `202`; with `Prefer: respond-async` or `async=true` the call still waits 25 s unless a wait is given. Wins over `callback_url`.
val idempotencyKey : kotlin.String = idempotencyKey_example // kotlin.String | 1-200 visible ASCII characters, per account, kept as long as the result (about 15 minutes). The same key on the same call returns that call's current state (`Idempotent-Replayed: true`) without running or billing it again; on a different call it is `409 idempotency_key_reused`. Applies to async calls only; on a synchronous call it is ignored. Wins over `idempotency_key`.
val async : kotlin.Boolean = true // kotlin.Boolean | Query form of `Prefer: respond-async`: `true` or `1` (also `yes`, `on`; `false`, `0`, `no`, `off` leave the call synchronous). Waits 25 s unless `async_wait` is given. Not sent to the scraper.
val asyncWait : kotlin.Int = 56 // kotlin.Int | Seconds (0-120; values outside are clamped) to wait for the result before answering `202`. Implies async. Not sent to the scraper.
val callbackUrl : java.net.URI = callbackUrl_example // java.net.URI | Query form of `X-Callback-URL` (URL-encode it). Implies async; on its own the answer is an immediate `202` (wait 0). Not sent to the scraper.
val idempotencyKey2 : kotlin.String = idempotencyKey_example // kotlin.String | Query form of `Idempotency-Key`. Not sent to the scraper.
try {
    val result : kotlin.Any = apiInstance.redfinListCoverageMarkets(prefer, xCallbackURL, idempotencyKey, async, asyncWait, callbackUrl, idempotencyKey2)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RedfinApi#redfinListCoverageMarkets")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RedfinApi#redfinListCoverageMarkets")
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

<a id="redfinRedfinScraperHealthCheck"></a>
# **redfinRedfinScraperHealthCheck**
> kotlin.Any redfinRedfinScraperHealthCheck()

Redfin scraper health check

Check health of the Redfin scraper service (accepts HEAD for UptimeRobot).

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = RedfinApi()
try {
    val result : kotlin.Any = apiInstance.redfinRedfinScraperHealthCheck()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RedfinApi#redfinRedfinScraperHealthCheck")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RedfinApi#redfinRedfinScraperHealthCheck")
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

<a id="redfinRedfinScraperHealthCheckHead"></a>
# **redfinRedfinScraperHealthCheckHead**
> kotlin.Any redfinRedfinScraperHealthCheckHead()

Redfin scraper health check

Check health of the Redfin scraper service (accepts HEAD for UptimeRobot).

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = RedfinApi()
try {
    val result : kotlin.Any = apiInstance.redfinRedfinScraperHealthCheckHead()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RedfinApi#redfinRedfinScraperHealthCheckHead")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RedfinApi#redfinRedfinScraperHealthCheckHead")
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

<a id="redfinRegionAddressSuggestions"></a>
# **redfinRegionAddressSuggestions**
> kotlin.Any redfinRegionAddressSuggestions(query, prefer, xCallbackURL, idempotencyKey, async, asyncWait, callbackUrl, idempotencyKey2)

Region/address suggestions

Resolve a search term to Redfin regions/addresses.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = RedfinApi()
val query : kotlin.String = query_example // kotlin.String | Partial location — city, ZIP, address, neighborhood
val prefer : kotlin.String = respond-async, wait=25 // kotlin.String | `respond-async[, wait=N]` (RFC 7240): run the call async. If it has not finished after `wait` seconds (0-120, default 25) the answer is `202` with a `request_id`; poll `GET /v1/requests/{request_id}`. Its `wait=` wins over `async_wait`; without one, `async_wait` sets the wait.
val xCallbackURL : java.net.URI = xCallbackURL_example // java.net.URI | An `https` URL that receives the signed `request.completed` webhook when the call finishes. Implies async: on its own (no `Prefer`, `async` or `async_wait`) the answer is an immediate `202`; with `Prefer: respond-async` or `async=true` the call still waits 25 s unless a wait is given. Wins over `callback_url`.
val idempotencyKey : kotlin.String = idempotencyKey_example // kotlin.String | 1-200 visible ASCII characters, per account, kept as long as the result (about 15 minutes). The same key on the same call returns that call's current state (`Idempotent-Replayed: true`) without running or billing it again; on a different call it is `409 idempotency_key_reused`. Applies to async calls only; on a synchronous call it is ignored. Wins over `idempotency_key`.
val async : kotlin.Boolean = true // kotlin.Boolean | Query form of `Prefer: respond-async`: `true` or `1` (also `yes`, `on`; `false`, `0`, `no`, `off` leave the call synchronous). Waits 25 s unless `async_wait` is given. Not sent to the scraper.
val asyncWait : kotlin.Int = 56 // kotlin.Int | Seconds (0-120; values outside are clamped) to wait for the result before answering `202`. Implies async. Not sent to the scraper.
val callbackUrl : java.net.URI = callbackUrl_example // java.net.URI | Query form of `X-Callback-URL` (URL-encode it). Implies async; on its own the answer is an immediate `202` (wait 0). Not sent to the scraper.
val idempotencyKey2 : kotlin.String = idempotencyKey_example // kotlin.String | Query form of `Idempotency-Key`. Not sent to the scraper.
try {
    val result : kotlin.Any = apiInstance.redfinRegionAddressSuggestions(query, prefer, xCallbackURL, idempotencyKey, async, asyncWait, callbackUrl, idempotencyKey2)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RedfinApi#redfinRegionAddressSuggestions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RedfinApi#redfinRegionAddressSuggestions")
    e.printStackTrace()
}
```

### Parameters
| **query** | **kotlin.String**| Partial location — city, ZIP, address, neighborhood | |
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

<a id="redfinSearchProperties"></a>
# **redfinSearchProperties**
> kotlin.Any redfinSearchProperties(location, page, sort, priceMin, priceMax, bedsMin, bathsMin, homeType, sqftMin, sqftMax, lotMin, lotMax, yearBuiltMin, yearBuiltMax, maxDaysOnMarket, north, south, east, west, prefer, xCallbackURL, idempotencyKey, async, asyncWait, callbackUrl, idempotencyKey2)

Search properties

Search Redfin for for-sale / for-rent / recently-sold properties.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = RedfinApi()
val location : kotlin.String = location_example // kotlin.String | City/state, ZIP, address or neighborhood
val page : kotlin.Int = 56 // kotlin.Int | 
val sort : kotlin.String = sort_example // kotlin.String | relevant|newest|price_high_to_low|price_low_to_high|square_feet|lot_size|price_per_sqft|beds|baths
val priceMin : kotlin.Int = 56 // kotlin.Int | 
val priceMax : kotlin.Int = 56 // kotlin.Int | 
val bedsMin : kotlin.Int = 56 // kotlin.Int | 
val bathsMin : java.math.BigDecimal = 8.14 // java.math.BigDecimal | 
val homeType : kotlin.String = homeType_example // kotlin.String | house|condo|townhouse|multi_family|land|mobile|coop|other
val sqftMin : kotlin.Int = 56 // kotlin.Int | 
val sqftMax : kotlin.Int = 56 // kotlin.Int | 
val lotMin : kotlin.Int = 56 // kotlin.Int | 
val lotMax : kotlin.Int = 56 // kotlin.Int | 
val yearBuiltMin : kotlin.Int = 56 // kotlin.Int | 
val yearBuiltMax : kotlin.Int = 56 // kotlin.Int | 
val maxDaysOnMarket : kotlin.Int = 56 // kotlin.Int | 
val north : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Map bounds for tiling past the cap
val south : java.math.BigDecimal = 8.14 // java.math.BigDecimal | 
val east : java.math.BigDecimal = 8.14 // java.math.BigDecimal | 
val west : java.math.BigDecimal = 8.14 // java.math.BigDecimal | 
val prefer : kotlin.String = respond-async, wait=25 // kotlin.String | `respond-async[, wait=N]` (RFC 7240): run the call async. If it has not finished after `wait` seconds (0-120, default 25) the answer is `202` with a `request_id`; poll `GET /v1/requests/{request_id}`. Its `wait=` wins over `async_wait`; without one, `async_wait` sets the wait.
val xCallbackURL : java.net.URI = xCallbackURL_example // java.net.URI | An `https` URL that receives the signed `request.completed` webhook when the call finishes. Implies async: on its own (no `Prefer`, `async` or `async_wait`) the answer is an immediate `202`; with `Prefer: respond-async` or `async=true` the call still waits 25 s unless a wait is given. Wins over `callback_url`.
val idempotencyKey : kotlin.String = idempotencyKey_example // kotlin.String | 1-200 visible ASCII characters, per account, kept as long as the result (about 15 minutes). The same key on the same call returns that call's current state (`Idempotent-Replayed: true`) without running or billing it again; on a different call it is `409 idempotency_key_reused`. Applies to async calls only; on a synchronous call it is ignored. Wins over `idempotency_key`.
val async : kotlin.Boolean = true // kotlin.Boolean | Query form of `Prefer: respond-async`: `true` or `1` (also `yes`, `on`; `false`, `0`, `no`, `off` leave the call synchronous). Waits 25 s unless `async_wait` is given. Not sent to the scraper.
val asyncWait : kotlin.Int = 56 // kotlin.Int | Seconds (0-120; values outside are clamped) to wait for the result before answering `202`. Implies async. Not sent to the scraper.
val callbackUrl : java.net.URI = callbackUrl_example // java.net.URI | Query form of `X-Callback-URL` (URL-encode it). Implies async; on its own the answer is an immediate `202` (wait 0). Not sent to the scraper.
val idempotencyKey2 : kotlin.String = idempotencyKey_example // kotlin.String | Query form of `Idempotency-Key`. Not sent to the scraper.
try {
    val result : kotlin.Any = apiInstance.redfinSearchProperties(location, page, sort, priceMin, priceMax, bedsMin, bathsMin, homeType, sqftMin, sqftMax, lotMin, lotMax, yearBuiltMin, yearBuiltMax, maxDaysOnMarket, north, south, east, west, prefer, xCallbackURL, idempotencyKey, async, asyncWait, callbackUrl, idempotencyKey2)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RedfinApi#redfinSearchProperties")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RedfinApi#redfinSearchProperties")
    e.printStackTrace()
}
```

### Parameters
| **location** | **kotlin.String**| City/state, ZIP, address or neighborhood | |
| **page** | **kotlin.Int**|  | [optional] [default to 1] |
| **sort** | **kotlin.String**| relevant|newest|price_high_to_low|price_low_to_high|square_feet|lot_size|price_per_sqft|beds|baths | [optional] |
| **priceMin** | **kotlin.Int**|  | [optional] |
| **priceMax** | **kotlin.Int**|  | [optional] |
| **bedsMin** | **kotlin.Int**|  | [optional] |
| **bathsMin** | **java.math.BigDecimal**|  | [optional] |
| **homeType** | **kotlin.String**| house|condo|townhouse|multi_family|land|mobile|coop|other | [optional] |
| **sqftMin** | **kotlin.Int**|  | [optional] |
| **sqftMax** | **kotlin.Int**|  | [optional] |
| **lotMin** | **kotlin.Int**|  | [optional] |
| **lotMax** | **kotlin.Int**|  | [optional] |
| **yearBuiltMin** | **kotlin.Int**|  | [optional] |
| **yearBuiltMax** | **kotlin.Int**|  | [optional] |
| **maxDaysOnMarket** | **kotlin.Int**|  | [optional] |
| **north** | **java.math.BigDecimal**| Map bounds for tiling past the cap | [optional] |
| **south** | **java.math.BigDecimal**|  | [optional] |
| **east** | **java.math.BigDecimal**|  | [optional] |
| **west** | **java.math.BigDecimal**|  | [optional] |
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

