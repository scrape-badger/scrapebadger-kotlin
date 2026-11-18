# AccountApi

All URIs are relative to *https://scrapebadger.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**accountGetAccountInfo**](AccountApi.md#accountGetAccountInfo) | **GET** /v1/account/me | Get account info |
| [**accountGetTheWebhookSigningSecret**](AccountApi.md#accountGetTheWebhookSigningSecret) | **GET** /v1/account/webhook-secret | Get the webhook signing secret |
| [**accountRotateTheWebhookSigningSecret**](AccountApi.md#accountRotateTheWebhookSigningSecret) | **POST** /v1/account/webhook-secret/rotate | Rotate the webhook signing secret |
| [**accountWebhookDeliveries**](AccountApi.md#accountWebhookDeliveries) | **GET** /v1/account/webhook-deliveries | Webhook deliveries |


<a id="accountGetAccountInfo"></a>
# **accountGetAccountInfo**
> AccountInfo accountGetAccountInfo()

Get account info

Get account details for the authenticated API key.  Returns credit balances, tier, rate limit, and subscription details. No credits are deducted for this call.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = AccountApi()
try {
    val result : AccountInfo = apiInstance.accountGetAccountInfo()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountApi#accountGetAccountInfo")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountApi#accountGetAccountInfo")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AccountInfo**](AccountInfo.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="accountGetTheWebhookSigningSecret"></a>
# **accountGetTheWebhookSigningSecret**
> WebhookSecret accountGetTheWebhookSigningSecret()

Get the webhook signing secret

The secret that signs this account&#39;s async-request webhooks, created on first read. Verify a delivery by comparing &#x60;&#x60;X-ScrapeBadger-Signature&#x60;&#x60; with &#x60;&#x60;sha256&#x3D;&#x60;&#x60; + hex HMAC-SHA256(secret, raw body).

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = AccountApi()
try {
    val result : WebhookSecret = apiInstance.accountGetTheWebhookSigningSecret()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountApi#accountGetTheWebhookSigningSecret")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountApi#accountGetTheWebhookSigningSecret")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**WebhookSecret**](WebhookSecret.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="accountRotateTheWebhookSigningSecret"></a>
# **accountRotateTheWebhookSigningSecret**
> WebhookSecret accountRotateTheWebhookSigningSecret()

Rotate the webhook signing secret

Replace the signing secret. Deliveries that start from now on are signed with the new one; retries of a delivery already under way keep the old one.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = AccountApi()
try {
    val result : WebhookSecret = apiInstance.accountRotateTheWebhookSigningSecret()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountApi#accountRotateTheWebhookSigningSecret")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountApi#accountRotateTheWebhookSigningSecret")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**WebhookSecret**](WebhookSecret.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="accountWebhookDeliveries"></a>
# **accountWebhookDeliveries**
> WebhookDeliveries accountWebhookDeliveries(limit)

Webhook deliveries

This account&#39;s async-request webhook deliveries of the last 24 h, newest first. Free. Needs a full-access API key, like the webhook secret: a trial key gets &#x60;403 trial_not_allowed&#x60;, a key restricted to some APIs &#x60;403 full_access_required&#x60;.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = AccountApi()
val limit : kotlin.Int = 56 // kotlin.Int | How many deliveries to return (1-200).
try {
    val result : WebhookDeliveries = apiInstance.accountWebhookDeliveries(limit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountApi#accountWebhookDeliveries")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountApi#accountWebhookDeliveries")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **limit** | **kotlin.Int**| How many deliveries to return (1-200). | [optional] [default to 50] |

### Return type

[**WebhookDeliveries**](WebhookDeliveries.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

