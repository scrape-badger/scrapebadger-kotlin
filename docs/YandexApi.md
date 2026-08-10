# YandexApi

All URIs are relative to *https://scrapebadger.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**yandexImageSearch**](YandexApi.md#yandexImageSearch) | **GET** /v1/yandex/images/search | Image search |
| [**yandexListSupportedMarkets**](YandexApi.md#yandexListSupportedMarkets) | **GET** /v1/yandex/markets | List supported markets |
| [**yandexReverseImageSearch**](YandexApi.md#yandexReverseImageSearch) | **GET** /v1/yandex/images/reverse | Reverse image search |
| [**yandexWebSearch**](YandexApi.md#yandexWebSearch) | **GET** /v1/yandex/search | Web search |
| [**yandexYandexScraperHealthCheck**](YandexApi.md#yandexYandexScraperHealthCheck) | **GET** /v1/yandex/health | Yandex scraper health check |
| [**yandexYandexScraperHealthCheckHead**](YandexApi.md#yandexYandexScraperHealthCheckHead) | **HEAD** /v1/yandex/health | Yandex scraper health check |


<a id="yandexImageSearch"></a>
# **yandexImageSearch**
> kotlin.Any yandexImageSearch(query, domain, page)

Image search

Search Yandex Images by text — thumbnail, full-res URL, dimensions, source page.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = YandexApi()
val query : kotlin.String = query_example // kotlin.String | Image search query, e.g. 'coffee machine'
val domain : kotlin.String = domain_example // kotlin.String | Yandex market: 'tr' (yandex.com.tr, DEFAULT — the domain that reliably clears anti-bot), 'com', 'ru', 'by', 'kz', 'uz'. 'com'/'ru' have a lower success rate.
val page : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.Any = apiInstance.yandexImageSearch(query, domain, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling YandexApi#yandexImageSearch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling YandexApi#yandexImageSearch")
    e.printStackTrace()
}
```

### Parameters
| **query** | **kotlin.String**| Image search query, e.g. &#39;coffee machine&#39; | |
| **domain** | **kotlin.String**| Yandex market: &#39;tr&#39; (yandex.com.tr, DEFAULT — the domain that reliably clears anti-bot), &#39;com&#39;, &#39;ru&#39;, &#39;by&#39;, &#39;kz&#39;, &#39;uz&#39;. &#39;com&#39;/&#39;ru&#39; have a lower success rate. | [optional] [default to &quot;tr&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **page** | **kotlin.Int**|  | [optional] [default to 1] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="yandexListSupportedMarkets"></a>
# **yandexListSupportedMarkets**
> kotlin.Any yandexListSupportedMarkets()

List supported markets

Supported Yandex markets (domains, default region and language).

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = YandexApi()
try {
    val result : kotlin.Any = apiInstance.yandexListSupportedMarkets()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling YandexApi#yandexListSupportedMarkets")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling YandexApi#yandexListSupportedMarkets")
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

<a id="yandexReverseImageSearch"></a>
# **yandexReverseImageSearch**
> kotlin.Any yandexReverseImageSearch(imageUrl, domain)

Reverse image search

Reverse image search by URL — hosting pages, similar images, tags, other sizes.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = YandexApi()
val imageUrl : kotlin.String = imageUrl_example // kotlin.String | Public URL of the image to reverse-search
val domain : kotlin.String = domain_example // kotlin.String | Yandex market: 'tr' (yandex.com.tr, DEFAULT — the domain that reliably clears anti-bot), 'com', 'ru', 'by', 'kz', 'uz'. 'com'/'ru' have a lower success rate.
try {
    val result : kotlin.Any = apiInstance.yandexReverseImageSearch(imageUrl, domain)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling YandexApi#yandexReverseImageSearch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling YandexApi#yandexReverseImageSearch")
    e.printStackTrace()
}
```

### Parameters
| **imageUrl** | **kotlin.String**| Public URL of the image to reverse-search | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **domain** | **kotlin.String**| Yandex market: &#39;tr&#39; (yandex.com.tr, DEFAULT — the domain that reliably clears anti-bot), &#39;com&#39;, &#39;ru&#39;, &#39;by&#39;, &#39;kz&#39;, &#39;uz&#39;. &#39;com&#39;/&#39;ru&#39; have a lower success rate. | [optional] [default to &quot;tr&quot;] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="yandexWebSearch"></a>
# **yandexWebSearch**
> kotlin.Any yandexWebSearch(query, domain, page, lr, lang)

Web search

Search Yandex web results — organic results, ads, displayed URLs, snippets.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = YandexApi()
val query : kotlin.String = query_example // kotlin.String | Search query, e.g. 'coffee machine'
val domain : kotlin.String = domain_example // kotlin.String | Yandex market: 'tr' (yandex.com.tr, DEFAULT — the domain that reliably clears anti-bot), 'com', 'ru', 'by', 'kz', 'uz'. 'com'/'ru' have a lower success rate.
val page : kotlin.Int = 56 // kotlin.Int | 
val lr : kotlin.Int = 56 // kotlin.Int | Yandex region id, e.g. 213=Moscow, 84=USA
val lang : kotlin.String = lang_example // kotlin.String | UI language: ru, en, tr, be, kk, uk
try {
    val result : kotlin.Any = apiInstance.yandexWebSearch(query, domain, page, lr, lang)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling YandexApi#yandexWebSearch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling YandexApi#yandexWebSearch")
    e.printStackTrace()
}
```

### Parameters
| **query** | **kotlin.String**| Search query, e.g. &#39;coffee machine&#39; | |
| **domain** | **kotlin.String**| Yandex market: &#39;tr&#39; (yandex.com.tr, DEFAULT — the domain that reliably clears anti-bot), &#39;com&#39;, &#39;ru&#39;, &#39;by&#39;, &#39;kz&#39;, &#39;uz&#39;. &#39;com&#39;/&#39;ru&#39; have a lower success rate. | [optional] [default to &quot;tr&quot;] |
| **page** | **kotlin.Int**|  | [optional] [default to 1] |
| **lr** | **kotlin.Int**| Yandex region id, e.g. 213&#x3D;Moscow, 84&#x3D;USA | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **lang** | **kotlin.String**| UI language: ru, en, tr, be, kk, uk | [optional] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="yandexYandexScraperHealthCheck"></a>
# **yandexYandexScraperHealthCheck**
> kotlin.Any yandexYandexScraperHealthCheck()

Yandex scraper health check

Check health of the Yandex scraper service (accepts HEAD for UptimeRobot).

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = YandexApi()
try {
    val result : kotlin.Any = apiInstance.yandexYandexScraperHealthCheck()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling YandexApi#yandexYandexScraperHealthCheck")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling YandexApi#yandexYandexScraperHealthCheck")
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

<a id="yandexYandexScraperHealthCheckHead"></a>
# **yandexYandexScraperHealthCheckHead**
> kotlin.Any yandexYandexScraperHealthCheckHead()

Yandex scraper health check

Check health of the Yandex scraper service (accepts HEAD for UptimeRobot).

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = YandexApi()
try {
    val result : kotlin.Any = apiInstance.yandexYandexScraperHealthCheckHead()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling YandexApi#yandexYandexScraperHealthCheckHead")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling YandexApi#yandexYandexScraperHealthCheckHead")
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

