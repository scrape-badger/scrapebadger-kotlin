# BaiduApi

All URIs are relative to *https://scrapebadger.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**baiduBaiduImageSearch**](BaiduApi.md#baiduBaiduImageSearch) | **GET** /v1/baidu/images | Baidu image search |
| [**baiduBaiduNewsSearch**](BaiduApi.md#baiduBaiduNewsSearch) | **GET** /v1/baidu/news | Baidu news search |
| [**baiduBaiduScraperHealthCheck**](BaiduApi.md#baiduBaiduScraperHealthCheck) | **GET** /v1/baidu/health | Baidu scraper health check |
| [**baiduBaiduScraperHealthCheckHead**](BaiduApi.md#baiduBaiduScraperHealthCheckHead) | **HEAD** /v1/baidu/health | Baidu scraper health check |
| [**baiduBaiduWebSearch**](BaiduApi.md#baiduBaiduWebSearch) | **GET** /v1/baidu/search | Baidu web search |
| [**baiduSearchSuggestions**](BaiduApi.md#baiduSearchSuggestions) | **GET** /v1/baidu/autocomplete | Search suggestions |


<a id="baiduBaiduImageSearch"></a>
# **baiduBaiduImageSearch**
> kotlin.Any baiduBaiduImageSearch(query, page)

Baidu image search

Baidu image search via the acjson JSON API.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = BaiduApi()
val query : kotlin.String = query_example // kotlin.String | Search keywords
val page : kotlin.Int = 56 // kotlin.Int | 30 images per page
try {
    val result : kotlin.Any = apiInstance.baiduBaiduImageSearch(query, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BaiduApi#baiduBaiduImageSearch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BaiduApi#baiduBaiduImageSearch")
    e.printStackTrace()
}
```

### Parameters
| **query** | **kotlin.String**| Search keywords | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **page** | **kotlin.Int**| 30 images per page | [optional] [default to 1] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="baiduBaiduNewsSearch"></a>
# **baiduBaiduNewsSearch**
> kotlin.Any baiduBaiduNewsSearch(query, page)

Baidu news search

Baidu news vertical — articles with source, publish date and real URLs.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = BaiduApi()
val query : kotlin.String = query_example // kotlin.String | Search keywords
val page : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.Any = apiInstance.baiduBaiduNewsSearch(query, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BaiduApi#baiduBaiduNewsSearch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BaiduApi#baiduBaiduNewsSearch")
    e.printStackTrace()
}
```

### Parameters
| **query** | **kotlin.String**| Search keywords | |
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

<a id="baiduBaiduScraperHealthCheck"></a>
# **baiduBaiduScraperHealthCheck**
> kotlin.Any baiduBaiduScraperHealthCheck()

Baidu scraper health check

Check health of the Baidu scraper service (accepts HEAD for UptimeRobot).

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = BaiduApi()
try {
    val result : kotlin.Any = apiInstance.baiduBaiduScraperHealthCheck()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BaiduApi#baiduBaiduScraperHealthCheck")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BaiduApi#baiduBaiduScraperHealthCheck")
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

<a id="baiduBaiduScraperHealthCheckHead"></a>
# **baiduBaiduScraperHealthCheckHead**
> kotlin.Any baiduBaiduScraperHealthCheckHead()

Baidu scraper health check

Check health of the Baidu scraper service (accepts HEAD for UptimeRobot).

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = BaiduApi()
try {
    val result : kotlin.Any = apiInstance.baiduBaiduScraperHealthCheckHead()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BaiduApi#baiduBaiduScraperHealthCheckHead")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BaiduApi#baiduBaiduScraperHealthCheckHead")
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

<a id="baiduBaiduWebSearch"></a>
# **baiduBaiduWebSearch**
> kotlin.Any baiduBaiduWebSearch(query, page, num)

Baidu web search

Baidu web SERP — organic results with real target URLs, related searches, total count.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = BaiduApi()
val query : kotlin.String = query_example // kotlin.String | Search keywords, e.g. '咖啡机' or 'coffee machine'
val page : kotlin.Int = 56 // kotlin.Int | Result page (10 results per page)
val num : kotlin.Int = 56 // kotlin.Int | Results per page (rn)
try {
    val result : kotlin.Any = apiInstance.baiduBaiduWebSearch(query, page, num)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BaiduApi#baiduBaiduWebSearch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BaiduApi#baiduBaiduWebSearch")
    e.printStackTrace()
}
```

### Parameters
| **query** | **kotlin.String**| Search keywords, e.g. &#39;咖啡机&#39; or &#39;coffee machine&#39; | |
| **page** | **kotlin.Int**| Result page (10 results per page) | [optional] [default to 1] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **num** | **kotlin.Int**| Results per page (rn) | [optional] [default to 10] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="baiduSearchSuggestions"></a>
# **baiduSearchSuggestions**
> kotlin.Any baiduSearchSuggestions(query)

Search suggestions

Baidu search-box suggestions.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = BaiduApi()
val query : kotlin.String = query_example // kotlin.String | Partial search term, e.g. '咖啡' or 'coff'
try {
    val result : kotlin.Any = apiInstance.baiduSearchSuggestions(query)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BaiduApi#baiduSearchSuggestions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BaiduApi#baiduSearchSuggestions")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **query** | **kotlin.String**| Partial search term, e.g. &#39;咖啡&#39; or &#39;coff&#39; | |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

