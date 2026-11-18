# DepopApi

All URIs are relative to *https://scrapebadger.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**depopDepopScraperHealthCheck**](DepopApi.md#depopDepopScraperHealthCheck) | **GET** /v1/depop/health | Depop scraper health check |
| [**depopDepopScraperHealthCheckHead**](DepopApi.md#depopDepopScraperHealthCheckHead) | **HEAD** /v1/depop/health | Depop scraper health check |
| [**depopGetAUserSProducts**](DepopApi.md#depopGetAUserSProducts) | **GET** /v1/depop/users/{username}/products | Get a user&#39;s products |
| [**depopGetProductDetail**](DepopApi.md#depopGetProductDetail) | **GET** /v1/depop/products/{product_id} | Get product detail |
| [**depopGetShopUserProfile**](DepopApi.md#depopGetShopUserProfile) | **GET** /v1/depop/users/{username} | Get shop/user profile |
| [**depopListMarkets**](DepopApi.md#depopListMarkets) | **GET** /v1/depop/markets | List markets |
| [**depopSearchDepopProducts**](DepopApi.md#depopSearchDepopProducts) | **GET** /v1/depop/search | Search Depop products |


<a id="depopDepopScraperHealthCheck"></a>
# **depopDepopScraperHealthCheck**
> kotlin.Any depopDepopScraperHealthCheck()

Depop scraper health check

Check health of the Depop scraper service (accepts HEAD).

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = DepopApi()
try {
    val result : kotlin.Any = apiInstance.depopDepopScraperHealthCheck()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DepopApi#depopDepopScraperHealthCheck")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DepopApi#depopDepopScraperHealthCheck")
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

<a id="depopDepopScraperHealthCheckHead"></a>
# **depopDepopScraperHealthCheckHead**
> kotlin.Any depopDepopScraperHealthCheckHead()

Depop scraper health check

Check health of the Depop scraper service (accepts HEAD).

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = DepopApi()
try {
    val result : kotlin.Any = apiInstance.depopDepopScraperHealthCheckHead()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DepopApi#depopDepopScraperHealthCheckHead")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DepopApi#depopDepopScraperHealthCheckHead")
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

<a id="depopGetAUserSProducts"></a>
# **depopGetAUserSProducts**
> kotlin.Any depopGetAUserSProducts(username, market, perPage, cursor, prefer, xCallbackURL, idempotencyKey, async, asyncWait, callbackUrl, idempotencyKey2)

Get a user&#39;s products

A user&#39;s active listings (cursor-paginated).

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = DepopApi()
val username : kotlin.String = username_example // kotlin.String | 
val market : kotlin.String = market_example // kotlin.String | Market code
val perPage : kotlin.Int = 56 // kotlin.Int | 
val cursor : kotlin.String = cursor_example // kotlin.String | Pagination cursor
val prefer : kotlin.String = respond-async, wait=25 // kotlin.String | `respond-async[, wait=N]` (RFC 7240): run the call async. If it has not finished after `wait` seconds (0-120, default 25) the answer is `202` with a `request_id`; poll `GET /v1/requests/{request_id}`. Its `wait=` wins over `async_wait`; without one, `async_wait` sets the wait.
val xCallbackURL : java.net.URI = xCallbackURL_example // java.net.URI | An `https` URL that receives the signed `request.completed` webhook when the call finishes. Implies async: on its own (no `Prefer`, `async` or `async_wait`) the answer is an immediate `202`; with `Prefer: respond-async` or `async=true` the call still waits 25 s unless a wait is given. Wins over `callback_url`.
val idempotencyKey : kotlin.String = idempotencyKey_example // kotlin.String | 1-200 visible ASCII characters, per account, kept as long as the result (about 15 minutes). The same key on the same call returns that call's current state (`Idempotent-Replayed: true`) without running or billing it again; on a different call it is `409 idempotency_key_reused`. Applies to async calls only; on a synchronous call it is ignored. Wins over `idempotency_key`.
val async : kotlin.Boolean = true // kotlin.Boolean | Query form of `Prefer: respond-async`: `true` or `1` (also `yes`, `on`; `false`, `0`, `no`, `off` leave the call synchronous). Waits 25 s unless `async_wait` is given. Not sent to the scraper.
val asyncWait : kotlin.Int = 56 // kotlin.Int | Seconds (0-120; values outside are clamped) to wait for the result before answering `202`. Implies async. Not sent to the scraper.
val callbackUrl : java.net.URI = callbackUrl_example // java.net.URI | Query form of `X-Callback-URL` (URL-encode it). Implies async; on its own the answer is an immediate `202` (wait 0). Not sent to the scraper.
val idempotencyKey2 : kotlin.String = idempotencyKey_example // kotlin.String | Query form of `Idempotency-Key`. Not sent to the scraper.
try {
    val result : kotlin.Any = apiInstance.depopGetAUserSProducts(username, market, perPage, cursor, prefer, xCallbackURL, idempotencyKey, async, asyncWait, callbackUrl, idempotencyKey2)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DepopApi#depopGetAUserSProducts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DepopApi#depopGetAUserSProducts")
    e.printStackTrace()
}
```

### Parameters
| **username** | **kotlin.String**|  | |
| **market** | **kotlin.String**| Market code | [optional] [default to &quot;us&quot;] |
| **perPage** | **kotlin.Int**|  | [optional] [default to 24] |
| **cursor** | **kotlin.String**| Pagination cursor | [optional] |
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

<a id="depopGetProductDetail"></a>
# **depopGetProductDetail**
> kotlin.Any depopGetProductDetail(productId, market, prefer, xCallbackURL, idempotencyKey, async, asyncWait, callbackUrl, idempotencyKey2)

Get product detail

Full detail for a single product (by numeric id or slug).

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = DepopApi()
val productId : kotlin.String = productId_example // kotlin.String | 
val market : kotlin.String = market_example // kotlin.String | Market code
val prefer : kotlin.String = respond-async, wait=25 // kotlin.String | `respond-async[, wait=N]` (RFC 7240): run the call async. If it has not finished after `wait` seconds (0-120, default 25) the answer is `202` with a `request_id`; poll `GET /v1/requests/{request_id}`. Its `wait=` wins over `async_wait`; without one, `async_wait` sets the wait.
val xCallbackURL : java.net.URI = xCallbackURL_example // java.net.URI | An `https` URL that receives the signed `request.completed` webhook when the call finishes. Implies async: on its own (no `Prefer`, `async` or `async_wait`) the answer is an immediate `202`; with `Prefer: respond-async` or `async=true` the call still waits 25 s unless a wait is given. Wins over `callback_url`.
val idempotencyKey : kotlin.String = idempotencyKey_example // kotlin.String | 1-200 visible ASCII characters, per account, kept as long as the result (about 15 minutes). The same key on the same call returns that call's current state (`Idempotent-Replayed: true`) without running or billing it again; on a different call it is `409 idempotency_key_reused`. Applies to async calls only; on a synchronous call it is ignored. Wins over `idempotency_key`.
val async : kotlin.Boolean = true // kotlin.Boolean | Query form of `Prefer: respond-async`: `true` or `1` (also `yes`, `on`; `false`, `0`, `no`, `off` leave the call synchronous). Waits 25 s unless `async_wait` is given. Not sent to the scraper.
val asyncWait : kotlin.Int = 56 // kotlin.Int | Seconds (0-120; values outside are clamped) to wait for the result before answering `202`. Implies async. Not sent to the scraper.
val callbackUrl : java.net.URI = callbackUrl_example // java.net.URI | Query form of `X-Callback-URL` (URL-encode it). Implies async; on its own the answer is an immediate `202` (wait 0). Not sent to the scraper.
val idempotencyKey2 : kotlin.String = idempotencyKey_example // kotlin.String | Query form of `Idempotency-Key`. Not sent to the scraper.
try {
    val result : kotlin.Any = apiInstance.depopGetProductDetail(productId, market, prefer, xCallbackURL, idempotencyKey, async, asyncWait, callbackUrl, idempotencyKey2)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DepopApi#depopGetProductDetail")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DepopApi#depopGetProductDetail")
    e.printStackTrace()
}
```

### Parameters
| **productId** | **kotlin.String**|  | |
| **market** | **kotlin.String**| Market code | [optional] [default to &quot;us&quot;] |
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

<a id="depopGetShopUserProfile"></a>
# **depopGetShopUserProfile**
> kotlin.Any depopGetShopUserProfile(username, market, prefer, xCallbackURL, idempotencyKey, async, asyncWait, callbackUrl, idempotencyKey2)

Get shop/user profile

Public shop/user profile by username.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = DepopApi()
val username : kotlin.String = username_example // kotlin.String | 
val market : kotlin.String = market_example // kotlin.String | Market code
val prefer : kotlin.String = respond-async, wait=25 // kotlin.String | `respond-async[, wait=N]` (RFC 7240): run the call async. If it has not finished after `wait` seconds (0-120, default 25) the answer is `202` with a `request_id`; poll `GET /v1/requests/{request_id}`. Its `wait=` wins over `async_wait`; without one, `async_wait` sets the wait.
val xCallbackURL : java.net.URI = xCallbackURL_example // java.net.URI | An `https` URL that receives the signed `request.completed` webhook when the call finishes. Implies async: on its own (no `Prefer`, `async` or `async_wait`) the answer is an immediate `202`; with `Prefer: respond-async` or `async=true` the call still waits 25 s unless a wait is given. Wins over `callback_url`.
val idempotencyKey : kotlin.String = idempotencyKey_example // kotlin.String | 1-200 visible ASCII characters, per account, kept as long as the result (about 15 minutes). The same key on the same call returns that call's current state (`Idempotent-Replayed: true`) without running or billing it again; on a different call it is `409 idempotency_key_reused`. Applies to async calls only; on a synchronous call it is ignored. Wins over `idempotency_key`.
val async : kotlin.Boolean = true // kotlin.Boolean | Query form of `Prefer: respond-async`: `true` or `1` (also `yes`, `on`; `false`, `0`, `no`, `off` leave the call synchronous). Waits 25 s unless `async_wait` is given. Not sent to the scraper.
val asyncWait : kotlin.Int = 56 // kotlin.Int | Seconds (0-120; values outside are clamped) to wait for the result before answering `202`. Implies async. Not sent to the scraper.
val callbackUrl : java.net.URI = callbackUrl_example // java.net.URI | Query form of `X-Callback-URL` (URL-encode it). Implies async; on its own the answer is an immediate `202` (wait 0). Not sent to the scraper.
val idempotencyKey2 : kotlin.String = idempotencyKey_example // kotlin.String | Query form of `Idempotency-Key`. Not sent to the scraper.
try {
    val result : kotlin.Any = apiInstance.depopGetShopUserProfile(username, market, prefer, xCallbackURL, idempotencyKey, async, asyncWait, callbackUrl, idempotencyKey2)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DepopApi#depopGetShopUserProfile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DepopApi#depopGetShopUserProfile")
    e.printStackTrace()
}
```

### Parameters
| **username** | **kotlin.String**|  | |
| **market** | **kotlin.String**| Market code | [optional] [default to &quot;us&quot;] |
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

<a id="depopListMarkets"></a>
# **depopListMarkets**
> kotlin.Any depopListMarkets(prefer, xCallbackURL, idempotencyKey, async, asyncWait, callbackUrl, idempotencyKey2)

List markets

List supported Depop markets (country + currency).

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = DepopApi()
val prefer : kotlin.String = respond-async, wait=25 // kotlin.String | `respond-async[, wait=N]` (RFC 7240): run the call async. If it has not finished after `wait` seconds (0-120, default 25) the answer is `202` with a `request_id`; poll `GET /v1/requests/{request_id}`. Its `wait=` wins over `async_wait`; without one, `async_wait` sets the wait.
val xCallbackURL : java.net.URI = xCallbackURL_example // java.net.URI | An `https` URL that receives the signed `request.completed` webhook when the call finishes. Implies async: on its own (no `Prefer`, `async` or `async_wait`) the answer is an immediate `202`; with `Prefer: respond-async` or `async=true` the call still waits 25 s unless a wait is given. Wins over `callback_url`.
val idempotencyKey : kotlin.String = idempotencyKey_example // kotlin.String | 1-200 visible ASCII characters, per account, kept as long as the result (about 15 minutes). The same key on the same call returns that call's current state (`Idempotent-Replayed: true`) without running or billing it again; on a different call it is `409 idempotency_key_reused`. Applies to async calls only; on a synchronous call it is ignored. Wins over `idempotency_key`.
val async : kotlin.Boolean = true // kotlin.Boolean | Query form of `Prefer: respond-async`: `true` or `1` (also `yes`, `on`; `false`, `0`, `no`, `off` leave the call synchronous). Waits 25 s unless `async_wait` is given. Not sent to the scraper.
val asyncWait : kotlin.Int = 56 // kotlin.Int | Seconds (0-120; values outside are clamped) to wait for the result before answering `202`. Implies async. Not sent to the scraper.
val callbackUrl : java.net.URI = callbackUrl_example // java.net.URI | Query form of `X-Callback-URL` (URL-encode it). Implies async; on its own the answer is an immediate `202` (wait 0). Not sent to the scraper.
val idempotencyKey2 : kotlin.String = idempotencyKey_example // kotlin.String | Query form of `Idempotency-Key`. Not sent to the scraper.
try {
    val result : kotlin.Any = apiInstance.depopListMarkets(prefer, xCallbackURL, idempotencyKey, async, asyncWait, callbackUrl, idempotencyKey2)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DepopApi#depopListMarkets")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DepopApi#depopListMarkets")
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

<a id="depopSearchDepopProducts"></a>
# **depopSearchDepopProducts**
> kotlin.Any depopSearchDepopProducts(query, market, perPage, cursor, priceMin, priceMax, brands, categories, sizes, conditions, gender, sort, prefer, xCallbackURL, idempotencyKey, async, asyncWait, callbackUrl, idempotencyKey2)

Search Depop products

Search the Depop catalog with filters (cursor-paginated).

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = DepopApi()
val query : kotlin.String = query_example // kotlin.String | Search text, e.g. 'nike vintage'
val market : kotlin.String = market_example // kotlin.String | Market code (us, gb, au, it, fr, ...)
val perPage : kotlin.Int = 56 // kotlin.Int | Results per page
val cursor : kotlin.String = cursor_example // kotlin.String | Pagination cursor (from previous page)
val priceMin : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Minimum price
val priceMax : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Maximum price
val brands : kotlin.String = brands_example // kotlin.String | Comma-separated brand IDs
val categories : kotlin.String = categories_example // kotlin.String | Comma-separated category IDs
val sizes : kotlin.String = sizes_example // kotlin.String | Comma-separated size IDs
val conditions : kotlin.String = conditions_example // kotlin.String | Comma-separated condition slugs (brand_new, used_excellent, ...)
val gender : kotlin.String = gender_example // kotlin.String | male | female
val sort : kotlin.String = sort_example // kotlin.String | relevance (default) | priceAscending | priceDescending
val prefer : kotlin.String = respond-async, wait=25 // kotlin.String | `respond-async[, wait=N]` (RFC 7240): run the call async. If it has not finished after `wait` seconds (0-120, default 25) the answer is `202` with a `request_id`; poll `GET /v1/requests/{request_id}`. Its `wait=` wins over `async_wait`; without one, `async_wait` sets the wait.
val xCallbackURL : java.net.URI = xCallbackURL_example // java.net.URI | An `https` URL that receives the signed `request.completed` webhook when the call finishes. Implies async: on its own (no `Prefer`, `async` or `async_wait`) the answer is an immediate `202`; with `Prefer: respond-async` or `async=true` the call still waits 25 s unless a wait is given. Wins over `callback_url`.
val idempotencyKey : kotlin.String = idempotencyKey_example // kotlin.String | 1-200 visible ASCII characters, per account, kept as long as the result (about 15 minutes). The same key on the same call returns that call's current state (`Idempotent-Replayed: true`) without running or billing it again; on a different call it is `409 idempotency_key_reused`. Applies to async calls only; on a synchronous call it is ignored. Wins over `idempotency_key`.
val async : kotlin.Boolean = true // kotlin.Boolean | Query form of `Prefer: respond-async`: `true` or `1` (also `yes`, `on`; `false`, `0`, `no`, `off` leave the call synchronous). Waits 25 s unless `async_wait` is given. Not sent to the scraper.
val asyncWait : kotlin.Int = 56 // kotlin.Int | Seconds (0-120; values outside are clamped) to wait for the result before answering `202`. Implies async. Not sent to the scraper.
val callbackUrl : java.net.URI = callbackUrl_example // java.net.URI | Query form of `X-Callback-URL` (URL-encode it). Implies async; on its own the answer is an immediate `202` (wait 0). Not sent to the scraper.
val idempotencyKey2 : kotlin.String = idempotencyKey_example // kotlin.String | Query form of `Idempotency-Key`. Not sent to the scraper.
try {
    val result : kotlin.Any = apiInstance.depopSearchDepopProducts(query, market, perPage, cursor, priceMin, priceMax, brands, categories, sizes, conditions, gender, sort, prefer, xCallbackURL, idempotencyKey, async, asyncWait, callbackUrl, idempotencyKey2)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DepopApi#depopSearchDepopProducts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DepopApi#depopSearchDepopProducts")
    e.printStackTrace()
}
```

### Parameters
| **query** | **kotlin.String**| Search text, e.g. &#39;nike vintage&#39; | |
| **market** | **kotlin.String**| Market code (us, gb, au, it, fr, ...) | [optional] [default to &quot;us&quot;] |
| **perPage** | **kotlin.Int**| Results per page | [optional] [default to 24] |
| **cursor** | **kotlin.String**| Pagination cursor (from previous page) | [optional] |
| **priceMin** | **java.math.BigDecimal**| Minimum price | [optional] |
| **priceMax** | **java.math.BigDecimal**| Maximum price | [optional] |
| **brands** | **kotlin.String**| Comma-separated brand IDs | [optional] |
| **categories** | **kotlin.String**| Comma-separated category IDs | [optional] |
| **sizes** | **kotlin.String**| Comma-separated size IDs | [optional] |
| **conditions** | **kotlin.String**| Comma-separated condition slugs (brand_new, used_excellent, ...) | [optional] |
| **gender** | **kotlin.String**| male | female | [optional] |
| **sort** | **kotlin.String**| relevance (default) | priceAscending | priceDescending | [optional] |
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

