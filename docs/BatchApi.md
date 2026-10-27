# BatchApi

All URIs are relative to *https://scrapebadger.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**batchSubmitABatchOfAsyncRequests**](BatchApi.md#batchSubmitABatchOfAsyncRequests) | **POST** /v1/batch | Submit a batch of async requests |


<a id="batchSubmitABatchOfAsyncRequests"></a>
# **batchSubmitABatchOfAsyncRequests**
> kotlin.Any batchSubmitABatchOfAsyncRequests(batchRequest)

Submit a batch of async requests

Submit up to 100 GET reads in one call. Each item runs as its own &#x60;&#x60;Prefer: respond-async&#x60;&#x60; request under this key, with the same auth, credit check, rate limit and billing as if it were sent alone, and returns a request_id to poll (or a webhook to &#x60;&#x60;callback_url&#x60;&#x60;). At most 10 items of a batch run at the same time. Submitting is free; each item bills as it runs. Items are checked against the spendable balance first, at the endpoint&#39;s base price, so a batch never starts more than the account can pay for.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = BatchApi()
val batchRequest : BatchRequest =  // BatchRequest | 
try {
    val result : kotlin.Any = apiInstance.batchSubmitABatchOfAsyncRequests(batchRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BatchApi#batchSubmitABatchOfAsyncRequests")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BatchApi#batchSubmitABatchOfAsyncRequests")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **batchRequest** | [**BatchRequest**](BatchRequest.md)|  | |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

