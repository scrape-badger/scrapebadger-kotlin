# AccountApi

All URIs are relative to *https://scrapebadger.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**accountGetAccountInfo**](AccountApi.md#accountGetAccountInfo) | **GET** /v1/account/me | Get account info |
| [**accountGetTheWebhookSigningSecret**](AccountApi.md#accountGetTheWebhookSigningSecret) | **GET** /v1/account/webhook-secret | Get the webhook signing secret |
| [**accountRotateTheWebhookSigningSecret**](AccountApi.md#accountRotateTheWebhookSigningSecret) | **POST** /v1/account/webhook-secret/rotate | Rotate the webhook signing secret |


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

