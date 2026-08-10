# BingApi

All URIs are relative to *https://scrapebadger.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**bingBingScraperHealthCheck**](BingApi.md#bingBingScraperHealthCheck) | **GET** /v1/bing/health | Bing scraper health check |
| [**bingBingScraperHealthCheckHead**](BingApi.md#bingBingScraperHealthCheckHead) | **HEAD** /v1/bing/health | Bing scraper health check |
| [**bingImageSearch**](BingApi.md#bingImageSearch) | **GET** /v1/bing/images | Image search |
| [**bingListSupportedMarkets**](BingApi.md#bingListSupportedMarkets) | **GET** /v1/bing/markets | List supported markets |
| [**bingNewsSearch**](BingApi.md#bingNewsSearch) | **GET** /v1/bing/news | News search |
| [**bingSearchSuggestions**](BingApi.md#bingSearchSuggestions) | **GET** /v1/bing/autocomplete | Search suggestions |
| [**bingVideoSearch**](BingApi.md#bingVideoSearch) | **GET** /v1/bing/videos | Video search |
| [**bingWebSearch**](BingApi.md#bingWebSearch) | **GET** /v1/bing/search | Web search |


<a id="bingBingScraperHealthCheck"></a>
# **bingBingScraperHealthCheck**
> kotlin.Any bingBingScraperHealthCheck()

Bing scraper health check

Check health of the Bing scraper service (accepts HEAD for UptimeRobot).

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = BingApi()
try {
    val result : kotlin.Any = apiInstance.bingBingScraperHealthCheck()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BingApi#bingBingScraperHealthCheck")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BingApi#bingBingScraperHealthCheck")
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

<a id="bingBingScraperHealthCheckHead"></a>
# **bingBingScraperHealthCheckHead**
> kotlin.Any bingBingScraperHealthCheckHead()

Bing scraper health check

Check health of the Bing scraper service (accepts HEAD for UptimeRobot).

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = BingApi()
try {
    val result : kotlin.Any = apiInstance.bingBingScraperHealthCheckHead()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BingApi#bingBingScraperHealthCheckHead")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BingApi#bingBingScraperHealthCheckHead")
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

<a id="bingImageSearch"></a>
# **bingImageSearch**
> kotlin.Any bingImageSearch(query, market, count, safeSearch)

Image search

Bing Images — thumbnail, full-size and source URL per result.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = BingApi()
val query : kotlin.String = query_example // kotlin.String | Search keywords, e.g. 'golden retriever'
val market : kotlin.String = market_example // kotlin.String | Bing market code, e.g. 'en-US', 'en-GB', 'de-DE'. See /markets.
val count : kotlin.Int = 56 // kotlin.Int | Results to return
val safeSearch : kotlin.String = safeSearch_example // kotlin.String | off | moderate | strict
try {
    val result : kotlin.Any = apiInstance.bingImageSearch(query, market, count, safeSearch)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BingApi#bingImageSearch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BingApi#bingImageSearch")
    e.printStackTrace()
}
```

### Parameters
| **query** | **kotlin.String**| Search keywords, e.g. &#39;golden retriever&#39; | |
| **market** | **kotlin.String**| Bing market code, e.g. &#39;en-US&#39;, &#39;en-GB&#39;, &#39;de-DE&#39;. See /markets. | [optional] [default to &quot;en-US&quot;] |
| **count** | **kotlin.Int**| Results to return | [optional] [default to 35] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **safeSearch** | **kotlin.String**| off | moderate | strict | [optional] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="bingListSupportedMarkets"></a>
# **bingListSupportedMarkets**
> kotlin.Any bingListSupportedMarkets()

List supported markets

Supported Bing market codes. Free — costs no credits.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = BingApi()
try {
    val result : kotlin.Any = apiInstance.bingListSupportedMarkets()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BingApi#bingListSupportedMarkets")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BingApi#bingListSupportedMarkets")
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

<a id="bingNewsSearch"></a>
# **bingNewsSearch**
> kotlin.Any bingNewsSearch(query, market, freshness)

News search

Bing News — headline, source, published time and snippet per article.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = BingApi()
val query : kotlin.String = query_example // kotlin.String | Search keywords, e.g. 'interest rates'
val market : kotlin.String = market_example // kotlin.String | Bing market code, e.g. 'en-US', 'en-GB', 'de-DE'. See /markets.
val freshness : kotlin.String = freshness_example // kotlin.String | day | week | month — restrict to recent articles
try {
    val result : kotlin.Any = apiInstance.bingNewsSearch(query, market, freshness)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BingApi#bingNewsSearch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BingApi#bingNewsSearch")
    e.printStackTrace()
}
```

### Parameters
| **query** | **kotlin.String**| Search keywords, e.g. &#39;interest rates&#39; | |
| **market** | **kotlin.String**| Bing market code, e.g. &#39;en-US&#39;, &#39;en-GB&#39;, &#39;de-DE&#39;. See /markets. | [optional] [default to &quot;en-US&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **freshness** | **kotlin.String**| day | week | month — restrict to recent articles | [optional] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="bingSearchSuggestions"></a>
# **bingSearchSuggestions**
> kotlin.Any bingSearchSuggestions(query, market)

Search suggestions

Bing search-box query suggestions.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = BingApi()
val query : kotlin.String = query_example // kotlin.String | Partial search term, e.g. 'coff'
val market : kotlin.String = market_example // kotlin.String | Bing market code, e.g. 'en-US', 'en-GB', 'de-DE'. See /markets.
try {
    val result : kotlin.Any = apiInstance.bingSearchSuggestions(query, market)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BingApi#bingSearchSuggestions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BingApi#bingSearchSuggestions")
    e.printStackTrace()
}
```

### Parameters
| **query** | **kotlin.String**| Partial search term, e.g. &#39;coff&#39; | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **market** | **kotlin.String**| Bing market code, e.g. &#39;en-US&#39;, &#39;en-GB&#39;, &#39;de-DE&#39;. See /markets. | [optional] [default to &quot;en-US&quot;] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="bingVideoSearch"></a>
# **bingVideoSearch**
> kotlin.Any bingVideoSearch(query, market, count, safeSearch)

Video search

Bing Videos — title, thumbnail, duration, publisher and source per result.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = BingApi()
val query : kotlin.String = query_example // kotlin.String | Search keywords, e.g. 'espresso tutorial'
val market : kotlin.String = market_example // kotlin.String | Bing market code, e.g. 'en-US', 'en-GB', 'de-DE'. See /markets.
val count : kotlin.Int = 56 // kotlin.Int | Results to return
val safeSearch : kotlin.String = safeSearch_example // kotlin.String | off | moderate | strict
try {
    val result : kotlin.Any = apiInstance.bingVideoSearch(query, market, count, safeSearch)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BingApi#bingVideoSearch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BingApi#bingVideoSearch")
    e.printStackTrace()
}
```

### Parameters
| **query** | **kotlin.String**| Search keywords, e.g. &#39;espresso tutorial&#39; | |
| **market** | **kotlin.String**| Bing market code, e.g. &#39;en-US&#39;, &#39;en-GB&#39;, &#39;de-DE&#39;. See /markets. | [optional] [default to &quot;en-US&quot;] |
| **count** | **kotlin.Int**| Results to return | [optional] [default to 35] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **safeSearch** | **kotlin.String**| off | moderate | strict | [optional] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="bingWebSearch"></a>
# **bingWebSearch**
> kotlin.Any bingWebSearch(query, market, count, offset, safeSearch)

Web search

Bing web SERP — organic results, ads, related searches and total count.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = BingApi()
val query : kotlin.String = query_example // kotlin.String | Search keywords, e.g. 'coffee machine'
val market : kotlin.String = market_example // kotlin.String | Bing market code, e.g. 'en-US', 'en-GB', 'de-DE'. See /markets.
val count : kotlin.Int = 56 // kotlin.Int | Results per page (1-50)
val offset : kotlin.Int = 56 // kotlin.Int | Zero-based result offset for pagination
val safeSearch : kotlin.String = safeSearch_example // kotlin.String | off | moderate | strict (default moderate)
try {
    val result : kotlin.Any = apiInstance.bingWebSearch(query, market, count, offset, safeSearch)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BingApi#bingWebSearch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BingApi#bingWebSearch")
    e.printStackTrace()
}
```

### Parameters
| **query** | **kotlin.String**| Search keywords, e.g. &#39;coffee machine&#39; | |
| **market** | **kotlin.String**| Bing market code, e.g. &#39;en-US&#39;, &#39;en-GB&#39;, &#39;de-DE&#39;. See /markets. | [optional] [default to &quot;en-US&quot;] |
| **count** | **kotlin.Int**| Results per page (1-50) | [optional] [default to 10] |
| **offset** | **kotlin.Int**| Zero-based result offset for pagination | [optional] [default to 0] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **safeSearch** | **kotlin.String**| off | moderate | strict (default moderate) | [optional] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

