# DuckDuckGoApi

All URIs are relative to *https://scrapebadger.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**duckduckgoDuckduckgoScraperHealthCheck**](DuckDuckGoApi.md#duckduckgoDuckduckgoScraperHealthCheck) | **GET** /v1/duckduckgo/health | DuckDuckGo scraper health check |
| [**duckduckgoDuckduckgoScraperHealthCheckHead**](DuckDuckGoApi.md#duckduckgoDuckduckgoScraperHealthCheckHead) | **HEAD** /v1/duckduckgo/health | DuckDuckGo scraper health check |
| [**duckduckgoImageSearch**](DuckDuckGoApi.md#duckduckgoImageSearch) | **GET** /v1/duckduckgo/images | Image search |
| [**duckduckgoInstantAnswer**](DuckDuckGoApi.md#duckduckgoInstantAnswer) | **GET** /v1/duckduckgo/instant | Instant Answer |
| [**duckduckgoListSupportedRegions**](DuckDuckGoApi.md#duckduckgoListSupportedRegions) | **GET** /v1/duckduckgo/regions | List supported regions |
| [**duckduckgoNewsSearch**](DuckDuckGoApi.md#duckduckgoNewsSearch) | **GET** /v1/duckduckgo/news | News search |
| [**duckduckgoSearchSuggestions**](DuckDuckGoApi.md#duckduckgoSearchSuggestions) | **GET** /v1/duckduckgo/autocomplete | Search suggestions |
| [**duckduckgoVideoSearch**](DuckDuckGoApi.md#duckduckgoVideoSearch) | **GET** /v1/duckduckgo/videos | Video search |
| [**duckduckgoWebSearch**](DuckDuckGoApi.md#duckduckgoWebSearch) | **GET** /v1/duckduckgo/search | Web search |


<a id="duckduckgoDuckduckgoScraperHealthCheck"></a>
# **duckduckgoDuckduckgoScraperHealthCheck**
> kotlin.Any duckduckgoDuckduckgoScraperHealthCheck()

DuckDuckGo scraper health check

Check health of the DuckDuckGo scraper service (accepts HEAD for UptimeRobot).

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = DuckDuckGoApi()
try {
    val result : kotlin.Any = apiInstance.duckduckgoDuckduckgoScraperHealthCheck()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DuckDuckGoApi#duckduckgoDuckduckgoScraperHealthCheck")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DuckDuckGoApi#duckduckgoDuckduckgoScraperHealthCheck")
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

<a id="duckduckgoDuckduckgoScraperHealthCheckHead"></a>
# **duckduckgoDuckduckgoScraperHealthCheckHead**
> kotlin.Any duckduckgoDuckduckgoScraperHealthCheckHead()

DuckDuckGo scraper health check

Check health of the DuckDuckGo scraper service (accepts HEAD for UptimeRobot).

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = DuckDuckGoApi()
try {
    val result : kotlin.Any = apiInstance.duckduckgoDuckduckgoScraperHealthCheckHead()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DuckDuckGoApi#duckduckgoDuckduckgoScraperHealthCheckHead")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DuckDuckGoApi#duckduckgoDuckduckgoScraperHealthCheckHead")
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

<a id="duckduckgoImageSearch"></a>
# **duckduckgoImageSearch**
> kotlin.Any duckduckgoImageSearch(query, region, safesearch, page, size, color, imageType, layout, license)

Image search

DuckDuckGo image search with size/color/type/layout/license filters.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = DuckDuckGoApi()
val query : kotlin.String = query_example // kotlin.String | Search query
val region : kotlin.String = region_example // kotlin.String | DuckDuckGo region code (kl), e.g. us-en, uk-en, de-de. wt-wt = all regions.
val safesearch : kotlin.String = safesearch_example // kotlin.String | on | moderate | off
val page : kotlin.Int = 56 // kotlin.Int | 100 results per page
val size : kotlin.String = size_example // kotlin.String | Small | Medium | Large | Wallpaper
val color : kotlin.String = color_example // kotlin.String | color | Monochrome | Red | Blue | …
val imageType : kotlin.String = imageType_example // kotlin.String | photo | clipart | gif | transparent | line
val layout : kotlin.String = layout_example // kotlin.String | Square | Tall | Wide
val license : kotlin.String = license_example // kotlin.String | Any | Public | Share | ShareCommercially | Modify
try {
    val result : kotlin.Any = apiInstance.duckduckgoImageSearch(query, region, safesearch, page, size, color, imageType, layout, license)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DuckDuckGoApi#duckduckgoImageSearch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DuckDuckGoApi#duckduckgoImageSearch")
    e.printStackTrace()
}
```

### Parameters
| **query** | **kotlin.String**| Search query | |
| **region** | **kotlin.String**| DuckDuckGo region code (kl), e.g. us-en, uk-en, de-de. wt-wt &#x3D; all regions. | [optional] [default to &quot;wt-wt&quot;] |
| **safesearch** | **kotlin.String**| on | moderate | off | [optional] [default to &quot;moderate&quot;] |
| **page** | **kotlin.Int**| 100 results per page | [optional] [default to 1] |
| **size** | **kotlin.String**| Small | Medium | Large | Wallpaper | [optional] [default to &quot;&quot;] |
| **color** | **kotlin.String**| color | Monochrome | Red | Blue | … | [optional] [default to &quot;&quot;] |
| **imageType** | **kotlin.String**| photo | clipart | gif | transparent | line | [optional] [default to &quot;&quot;] |
| **layout** | **kotlin.String**| Square | Tall | Wide | [optional] [default to &quot;&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **license** | **kotlin.String**| Any | Public | Share | ShareCommercially | Modify | [optional] [default to &quot;&quot;] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="duckduckgoInstantAnswer"></a>
# **duckduckgoInstantAnswer**
> kotlin.Any duckduckgoInstantAnswer(query)

Instant Answer

DuckDuckGo Instant Answer — abstract, definition, direct answer, related topics.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = DuckDuckGoApi()
val query : kotlin.String = query_example // kotlin.String | Query for the Instant Answer API
try {
    val result : kotlin.Any = apiInstance.duckduckgoInstantAnswer(query)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DuckDuckGoApi#duckduckgoInstantAnswer")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DuckDuckGoApi#duckduckgoInstantAnswer")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **query** | **kotlin.String**| Query for the Instant Answer API | |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="duckduckgoListSupportedRegions"></a>
# **duckduckgoListSupportedRegions**
> kotlin.Any duckduckgoListSupportedRegions()

List supported regions

The full DuckDuckGo region (kl) code list.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = DuckDuckGoApi()
try {
    val result : kotlin.Any = apiInstance.duckduckgoListSupportedRegions()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DuckDuckGoApi#duckduckgoListSupportedRegions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DuckDuckGoApi#duckduckgoListSupportedRegions")
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

<a id="duckduckgoNewsSearch"></a>
# **duckduckgoNewsSearch**
> kotlin.Any duckduckgoNewsSearch(query, region, safesearch, timelimit, page)

News search

DuckDuckGo news search — headline, source, excerpt, unix + ISO date, image.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = DuckDuckGoApi()
val query : kotlin.String = query_example // kotlin.String | Search query
val region : kotlin.String = region_example // kotlin.String | DuckDuckGo region code (kl), e.g. us-en, uk-en, de-de. wt-wt = all regions.
val safesearch : kotlin.String = safesearch_example // kotlin.String | on | moderate | off
val timelimit : kotlin.String = timelimit_example // kotlin.String | day | week | month | year
val page : kotlin.Int = 56 // kotlin.Int | 30 results per page
try {
    val result : kotlin.Any = apiInstance.duckduckgoNewsSearch(query, region, safesearch, timelimit, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DuckDuckGoApi#duckduckgoNewsSearch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DuckDuckGoApi#duckduckgoNewsSearch")
    e.printStackTrace()
}
```

### Parameters
| **query** | **kotlin.String**| Search query | |
| **region** | **kotlin.String**| DuckDuckGo region code (kl), e.g. us-en, uk-en, de-de. wt-wt &#x3D; all regions. | [optional] [default to &quot;wt-wt&quot;] |
| **safesearch** | **kotlin.String**| on | moderate | off | [optional] [default to &quot;moderate&quot;] |
| **timelimit** | **kotlin.String**| day | week | month | year | [optional] [default to &quot;&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **page** | **kotlin.Int**| 30 results per page | [optional] [default to 1] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="duckduckgoSearchSuggestions"></a>
# **duckduckgoSearchSuggestions**
> kotlin.Any duckduckgoSearchSuggestions(query, region)

Search suggestions

DuckDuckGo search-box suggestions.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = DuckDuckGoApi()
val query : kotlin.String = query_example // kotlin.String | Partial query to complete
val region : kotlin.String = region_example // kotlin.String | DuckDuckGo region code (kl), e.g. us-en, uk-en, de-de. wt-wt = all regions.
try {
    val result : kotlin.Any = apiInstance.duckduckgoSearchSuggestions(query, region)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DuckDuckGoApi#duckduckgoSearchSuggestions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DuckDuckGoApi#duckduckgoSearchSuggestions")
    e.printStackTrace()
}
```

### Parameters
| **query** | **kotlin.String**| Partial query to complete | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **region** | **kotlin.String**| DuckDuckGo region code (kl), e.g. us-en, uk-en, de-de. wt-wt &#x3D; all regions. | [optional] [default to &quot;wt-wt&quot;] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="duckduckgoVideoSearch"></a>
# **duckduckgoVideoSearch**
> kotlin.Any duckduckgoVideoSearch(query, region, safesearch, page, duration, resolution)

Video search

DuckDuckGo video search — title, publisher, uploader, duration, views, thumbnails.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = DuckDuckGoApi()
val query : kotlin.String = query_example // kotlin.String | Search query
val region : kotlin.String = region_example // kotlin.String | DuckDuckGo region code (kl), e.g. us-en, uk-en, de-de. wt-wt = all regions.
val safesearch : kotlin.String = safesearch_example // kotlin.String | on | moderate | off
val page : kotlin.Int = 56 // kotlin.Int | 60 results per page
val duration : kotlin.String = duration_example // kotlin.String | short | medium | long
val resolution : kotlin.String = resolution_example // kotlin.String | high | standard
try {
    val result : kotlin.Any = apiInstance.duckduckgoVideoSearch(query, region, safesearch, page, duration, resolution)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DuckDuckGoApi#duckduckgoVideoSearch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DuckDuckGoApi#duckduckgoVideoSearch")
    e.printStackTrace()
}
```

### Parameters
| **query** | **kotlin.String**| Search query | |
| **region** | **kotlin.String**| DuckDuckGo region code (kl), e.g. us-en, uk-en, de-de. wt-wt &#x3D; all regions. | [optional] [default to &quot;wt-wt&quot;] |
| **safesearch** | **kotlin.String**| on | moderate | off | [optional] [default to &quot;moderate&quot;] |
| **page** | **kotlin.Int**| 60 results per page | [optional] [default to 1] |
| **duration** | **kotlin.String**| short | medium | long | [optional] [default to &quot;&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **resolution** | **kotlin.String**| high | standard | [optional] [default to &quot;&quot;] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="duckduckgoWebSearch"></a>
# **duckduckgoWebSearch**
> kotlin.Any duckduckgoWebSearch(query, region, safesearch, timelimit, page)

Web search

DuckDuckGo web SERP — organic results, the zero-click abstract box, ads flagged.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = DuckDuckGoApi()
val query : kotlin.String = query_example // kotlin.String | Search query
val region : kotlin.String = region_example // kotlin.String | DuckDuckGo region code (kl), e.g. us-en, uk-en, de-de. wt-wt = all regions.
val safesearch : kotlin.String = safesearch_example // kotlin.String | on | moderate | off
val timelimit : kotlin.String = timelimit_example // kotlin.String | day | week | month | year
val page : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.Any = apiInstance.duckduckgoWebSearch(query, region, safesearch, timelimit, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DuckDuckGoApi#duckduckgoWebSearch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DuckDuckGoApi#duckduckgoWebSearch")
    e.printStackTrace()
}
```

### Parameters
| **query** | **kotlin.String**| Search query | |
| **region** | **kotlin.String**| DuckDuckGo region code (kl), e.g. us-en, uk-en, de-de. wt-wt &#x3D; all regions. | [optional] [default to &quot;wt-wt&quot;] |
| **safesearch** | **kotlin.String**| on | moderate | off | [optional] [default to &quot;moderate&quot;] |
| **timelimit** | **kotlin.String**| day | week | month | year | [optional] [default to &quot;&quot;] |
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

