# YahooApi

All URIs are relative to *https://scrapebadger.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**yahooImageSearch**](YahooApi.md#yahooImageSearch) | **GET** /v1/yahoo/images | Image search |
| [**yahooListSupportedMarkets**](YahooApi.md#yahooListSupportedMarkets) | **GET** /v1/yahoo/markets | List supported markets |
| [**yahooNewsSearch**](YahooApi.md#yahooNewsSearch) | **GET** /v1/yahoo/news | News search |
| [**yahooSearchSuggestions**](YahooApi.md#yahooSearchSuggestions) | **GET** /v1/yahoo/autocomplete | Search suggestions |
| [**yahooVideoSearch**](YahooApi.md#yahooVideoSearch) | **GET** /v1/yahoo/videos | Video search |
| [**yahooWebSearch**](YahooApi.md#yahooWebSearch) | **GET** /v1/yahoo/search | Web search |
| [**yahooYahooScraperHealthCheck**](YahooApi.md#yahooYahooScraperHealthCheck) | **GET** /v1/yahoo/health | Yahoo scraper health check |
| [**yahooYahooScraperHealthCheckHead**](YahooApi.md#yahooYahooScraperHealthCheckHead) | **HEAD** /v1/yahoo/health | Yahoo scraper health check |


<a id="yahooImageSearch"></a>
# **yahooImageSearch**
> kotlin.Any yahooImageSearch(query, market, count)

Image search

Yahoo Images — thumbnail, full-size and source URL per result.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = YahooApi()
val query : kotlin.String = query_example // kotlin.String | Search keywords, e.g. 'golden retriever'
val market : kotlin.String = market_example // kotlin.String | Yahoo market code, e.g. 'us', 'uk', 'fr', 'de'. See /markets.
val count : kotlin.Int = 56 // kotlin.Int | Results to return
try {
    val result : kotlin.Any = apiInstance.yahooImageSearch(query, market, count)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling YahooApi#yahooImageSearch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling YahooApi#yahooImageSearch")
    e.printStackTrace()
}
```

### Parameters
| **query** | **kotlin.String**| Search keywords, e.g. &#39;golden retriever&#39; | |
| **market** | **kotlin.String**| Yahoo market code, e.g. &#39;us&#39;, &#39;uk&#39;, &#39;fr&#39;, &#39;de&#39;. See /markets. | [optional] [default to &quot;us&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **count** | **kotlin.Int**| Results to return | [optional] [default to 30] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="yahooListSupportedMarkets"></a>
# **yahooListSupportedMarkets**
> kotlin.Any yahooListSupportedMarkets()

List supported markets

Supported Yahoo market codes. Free — costs no credits.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = YahooApi()
try {
    val result : kotlin.Any = apiInstance.yahooListSupportedMarkets()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling YahooApi#yahooListSupportedMarkets")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling YahooApi#yahooListSupportedMarkets")
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

<a id="yahooNewsSearch"></a>
# **yahooNewsSearch**
> kotlin.Any yahooNewsSearch(query, market)

News search

Yahoo News — headline, source, published time and snippet per article.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = YahooApi()
val query : kotlin.String = query_example // kotlin.String | Search keywords, e.g. 'interest rates'
val market : kotlin.String = market_example // kotlin.String | Yahoo market code, e.g. 'us', 'uk', 'fr', 'de'. See /markets.
try {
    val result : kotlin.Any = apiInstance.yahooNewsSearch(query, market)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling YahooApi#yahooNewsSearch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling YahooApi#yahooNewsSearch")
    e.printStackTrace()
}
```

### Parameters
| **query** | **kotlin.String**| Search keywords, e.g. &#39;interest rates&#39; | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **market** | **kotlin.String**| Yahoo market code, e.g. &#39;us&#39;, &#39;uk&#39;, &#39;fr&#39;, &#39;de&#39;. See /markets. | [optional] [default to &quot;us&quot;] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="yahooSearchSuggestions"></a>
# **yahooSearchSuggestions**
> kotlin.Any yahooSearchSuggestions(query, market)

Search suggestions

Yahoo search-box query suggestions.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = YahooApi()
val query : kotlin.String = query_example // kotlin.String | Partial search term, e.g. 'coff'
val market : kotlin.String = market_example // kotlin.String | Yahoo market code, e.g. 'us', 'uk', 'fr', 'de'. See /markets.
try {
    val result : kotlin.Any = apiInstance.yahooSearchSuggestions(query, market)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling YahooApi#yahooSearchSuggestions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling YahooApi#yahooSearchSuggestions")
    e.printStackTrace()
}
```

### Parameters
| **query** | **kotlin.String**| Partial search term, e.g. &#39;coff&#39; | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **market** | **kotlin.String**| Yahoo market code, e.g. &#39;us&#39;, &#39;uk&#39;, &#39;fr&#39;, &#39;de&#39;. See /markets. | [optional] [default to &quot;us&quot;] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="yahooVideoSearch"></a>
# **yahooVideoSearch**
> kotlin.Any yahooVideoSearch(query, market, count)

Video search

Yahoo Videos — title, thumbnail, duration, publisher and source per result.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = YahooApi()
val query : kotlin.String = query_example // kotlin.String | Search keywords, e.g. 'espresso tutorial'
val market : kotlin.String = market_example // kotlin.String | Yahoo market code, e.g. 'us', 'uk', 'fr', 'de'. See /markets.
val count : kotlin.Int = 56 // kotlin.Int | Results to return
try {
    val result : kotlin.Any = apiInstance.yahooVideoSearch(query, market, count)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling YahooApi#yahooVideoSearch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling YahooApi#yahooVideoSearch")
    e.printStackTrace()
}
```

### Parameters
| **query** | **kotlin.String**| Search keywords, e.g. &#39;espresso tutorial&#39; | |
| **market** | **kotlin.String**| Yahoo market code, e.g. &#39;us&#39;, &#39;uk&#39;, &#39;fr&#39;, &#39;de&#39;. See /markets. | [optional] [default to &quot;us&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **count** | **kotlin.Int**| Results to return | [optional] [default to 30] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="yahooWebSearch"></a>
# **yahooWebSearch**
> kotlin.Any yahooWebSearch(query, market, offset, safeSearch)

Web search

Yahoo web SERP — organic results, ads, related searches and total count.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = YahooApi()
val query : kotlin.String = query_example // kotlin.String | Search keywords, e.g. 'coffee machine'
val market : kotlin.String = market_example // kotlin.String | Yahoo market code, e.g. 'us', 'uk', 'fr', 'de'. See /markets.
val offset : kotlin.Int = 56 // kotlin.Int | Zero-based result offset for pagination
val safeSearch : kotlin.String = safeSearch_example // kotlin.String | off | moderate | strict (default moderate)
try {
    val result : kotlin.Any = apiInstance.yahooWebSearch(query, market, offset, safeSearch)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling YahooApi#yahooWebSearch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling YahooApi#yahooWebSearch")
    e.printStackTrace()
}
```

### Parameters
| **query** | **kotlin.String**| Search keywords, e.g. &#39;coffee machine&#39; | |
| **market** | **kotlin.String**| Yahoo market code, e.g. &#39;us&#39;, &#39;uk&#39;, &#39;fr&#39;, &#39;de&#39;. See /markets. | [optional] [default to &quot;us&quot;] |
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

<a id="yahooYahooScraperHealthCheck"></a>
# **yahooYahooScraperHealthCheck**
> kotlin.Any yahooYahooScraperHealthCheck()

Yahoo scraper health check

Check health of the Yahoo scraper service (accepts HEAD for UptimeRobot).

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = YahooApi()
try {
    val result : kotlin.Any = apiInstance.yahooYahooScraperHealthCheck()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling YahooApi#yahooYahooScraperHealthCheck")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling YahooApi#yahooYahooScraperHealthCheck")
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

<a id="yahooYahooScraperHealthCheckHead"></a>
# **yahooYahooScraperHealthCheckHead**
> kotlin.Any yahooYahooScraperHealthCheckHead()

Yahoo scraper health check

Check health of the Yahoo scraper service (accepts HEAD for UptimeRobot).

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = YahooApi()
try {
    val result : kotlin.Any = apiInstance.yahooYahooScraperHealthCheckHead()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling YahooApi#yahooYahooScraperHealthCheckHead")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling YahooApi#yahooYahooScraperHealthCheckHead")
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

