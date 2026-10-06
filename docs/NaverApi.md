# NaverApi

All URIs are relative to *https://scrapebadger.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**naverNaverBlogSearch**](NaverApi.md#naverNaverBlogSearch) | **GET** /v1/naver/blog | Naver blog search |
| [**naverNaverDatalabShoppingKeywordInsight**](NaverApi.md#naverNaverDatalabShoppingKeywordInsight) | **GET** /v1/naver/shopping/insight | Naver DataLab shopping keyword insight |
| [**naverNaverNewsSearch**](NaverApi.md#naverNaverNewsSearch) | **GET** /v1/naver/news | Naver news search |
| [**naverNaverPlaceDetail**](NaverApi.md#naverNaverPlaceDetail) | **GET** /v1/naver/place/{place_id} | Naver place detail |
| [**naverNaverPlaceLocalSearch**](NaverApi.md#naverNaverPlaceLocalSearch) | **GET** /v1/naver/local | Naver Place/Local search |
| [**naverNaverPlaceVisitorReviews**](NaverApi.md#naverNaverPlaceVisitorReviews) | **GET** /v1/naver/place/{place_id}/reviews | Naver place visitor reviews |
| [**naverNaverScraperHealthCheck**](NaverApi.md#naverNaverScraperHealthCheck) | **GET** /v1/naver/health | Naver scraper health check |
| [**naverNaverScraperHealthCheckHead**](NaverApi.md#naverNaverScraperHealthCheckHead) | **HEAD** /v1/naver/health | Naver scraper health check |
| [**naverNaverShoppingBestsellerRankings**](NaverApi.md#naverNaverShoppingBestsellerRankings) | **GET** /v1/naver/shopping/bestsellers | Naver Shopping bestseller rankings |
| [**naverNaverShoppingCategoryReference**](NaverApi.md#naverNaverShoppingCategoryReference) | **GET** /v1/naver/shopping/categories | Naver Shopping category reference |
| [**naverNaverShoppingTrendingKeywordRankings**](NaverApi.md#naverNaverShoppingTrendingKeywordRankings) | **GET** /v1/naver/shopping/keywords | Naver Shopping trending keyword rankings |
| [**naverNaverWebSearch**](NaverApi.md#naverNaverWebSearch) | **GET** /v1/naver/search | Naver web search |
| [**naverSearchSuggestions**](NaverApi.md#naverSearchSuggestions) | **GET** /v1/naver/autocomplete | Search suggestions |


<a id="naverNaverBlogSearch"></a>
# **naverNaverBlogSearch**
> kotlin.Any naverNaverBlogSearch(query, page)

Naver blog search

Naver blog vertical — post title, blog name and real post URLs.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = NaverApi()
val query : kotlin.String = query_example // kotlin.String | 검색어
val page : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.Any = apiInstance.naverNaverBlogSearch(query, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NaverApi#naverNaverBlogSearch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NaverApi#naverNaverBlogSearch")
    e.printStackTrace()
}
```

### Parameters
| **query** | **kotlin.String**| 검색어 | |
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

<a id="naverNaverDatalabShoppingKeywordInsight"></a>
# **naverNaverDatalabShoppingKeywordInsight**
> kotlin.Any naverNaverDatalabShoppingKeywordInsight(categoryId, startDate, endDate, timeUnit, count)

Naver DataLab shopping keyword insight

DataLab Shopping Insight — top search keywords in a category over a window.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = NaverApi()
val categoryId : kotlin.String = categoryId_example // kotlin.String | DataLab category id (cid), e.g. 50000000
val startDate : kotlin.String = startDate_example // kotlin.String | YYYY-MM-DD
val endDate : kotlin.String = endDate_example // kotlin.String | YYYY-MM-DD
val timeUnit : kotlin.String = timeUnit_example // kotlin.String | date | week | month
val count : kotlin.Int = 56 // kotlin.Int | Keywords to return
try {
    val result : kotlin.Any = apiInstance.naverNaverDatalabShoppingKeywordInsight(categoryId, startDate, endDate, timeUnit, count)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NaverApi#naverNaverDatalabShoppingKeywordInsight")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NaverApi#naverNaverDatalabShoppingKeywordInsight")
    e.printStackTrace()
}
```

### Parameters
| **categoryId** | **kotlin.String**| DataLab category id (cid), e.g. 50000000 | |
| **startDate** | **kotlin.String**| YYYY-MM-DD | |
| **endDate** | **kotlin.String**| YYYY-MM-DD | |
| **timeUnit** | **kotlin.String**| date | week | month | [optional] [default to &quot;date&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **count** | **kotlin.Int**| Keywords to return | [optional] [default to 20] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="naverNaverNewsSearch"></a>
# **naverNaverNewsSearch**
> kotlin.Any naverNaverNewsSearch(query, page)

Naver news search

Naver news vertical — publisher, age string and real article URLs.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = NaverApi()
val query : kotlin.String = query_example // kotlin.String | 검색어
val page : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.Any = apiInstance.naverNaverNewsSearch(query, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NaverApi#naverNaverNewsSearch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NaverApi#naverNaverNewsSearch")
    e.printStackTrace()
}
```

### Parameters
| **query** | **kotlin.String**| 검색어 | |
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

<a id="naverNaverPlaceDetail"></a>
# **naverNaverPlaceDetail**
> kotlin.Any naverNaverPlaceDetail(placeId)

Naver place detail

Naver Place detail by place id.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = NaverApi()
val placeId : kotlin.String = placeId_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.naverNaverPlaceDetail(placeId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NaverApi#naverNaverPlaceDetail")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NaverApi#naverNaverPlaceDetail")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **placeId** | **kotlin.String**|  | |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="naverNaverPlaceLocalSearch"></a>
# **naverNaverPlaceLocalSearch**
> kotlin.Any naverNaverPlaceLocalSearch(query)

Naver Place/Local search

Naver Place/Local search — name, category, rating, hours status.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = NaverApi()
val query : kotlin.String = query_example // kotlin.String | Place query, e.g. '성남 카페'
try {
    val result : kotlin.Any = apiInstance.naverNaverPlaceLocalSearch(query)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NaverApi#naverNaverPlaceLocalSearch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NaverApi#naverNaverPlaceLocalSearch")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **query** | **kotlin.String**| Place query, e.g. &#39;성남 카페&#39; | |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="naverNaverPlaceVisitorReviews"></a>
# **naverNaverPlaceVisitorReviews**
> kotlin.Any naverNaverPlaceVisitorReviews(placeId)

Naver place visitor reviews

Visitor reviews for a Naver place — rating, body, reviewer, voted keywords, photos.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = NaverApi()
val placeId : kotlin.String = placeId_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.naverNaverPlaceVisitorReviews(placeId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NaverApi#naverNaverPlaceVisitorReviews")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NaverApi#naverNaverPlaceVisitorReviews")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **placeId** | **kotlin.String**|  | |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="naverNaverScraperHealthCheck"></a>
# **naverNaverScraperHealthCheck**
> kotlin.Any naverNaverScraperHealthCheck()

Naver scraper health check

Check health of the Naver scraper service (accepts HEAD for UptimeRobot).

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = NaverApi()
try {
    val result : kotlin.Any = apiInstance.naverNaverScraperHealthCheck()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NaverApi#naverNaverScraperHealthCheck")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NaverApi#naverNaverScraperHealthCheck")
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

<a id="naverNaverScraperHealthCheckHead"></a>
# **naverNaverScraperHealthCheckHead**
> kotlin.Any naverNaverScraperHealthCheckHead()

Naver scraper health check

Check health of the Naver scraper service (accepts HEAD for UptimeRobot).

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = NaverApi()
try {
    val result : kotlin.Any = apiInstance.naverNaverScraperHealthCheckHead()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NaverApi#naverNaverScraperHealthCheckHead")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NaverApi#naverNaverScraperHealthCheckHead")
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

<a id="naverNaverShoppingBestsellerRankings"></a>
# **naverNaverShoppingBestsellerRankings**
> kotlin.Any naverNaverShoppingBestsellerRankings(categoryId, ageType, sortType, periodType)

Naver Shopping bestseller rankings

Naver Shopping bestseller rankings — ranked products with price, review score, mall.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = NaverApi()
val categoryId : kotlin.String = categoryId_example // kotlin.String | Naver shopping category id, or ALL
val ageType : kotlin.String = ageType_example // kotlin.String | ALL | MEN_20 | WOMEN_20 | ...
val sortType : kotlin.String = sortType_example // kotlin.String | PRODUCT_CLICK | PRODUCT_BUY
val periodType : kotlin.String = periodType_example // kotlin.String | DAILY | WEEKLY
try {
    val result : kotlin.Any = apiInstance.naverNaverShoppingBestsellerRankings(categoryId, ageType, sortType, periodType)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NaverApi#naverNaverShoppingBestsellerRankings")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NaverApi#naverNaverShoppingBestsellerRankings")
    e.printStackTrace()
}
```

### Parameters
| **categoryId** | **kotlin.String**| Naver shopping category id, or ALL | [optional] [default to &quot;ALL&quot;] |
| **ageType** | **kotlin.String**| ALL | MEN_20 | WOMEN_20 | ... | [optional] [default to &quot;ALL&quot;] |
| **sortType** | **kotlin.String**| PRODUCT_CLICK | PRODUCT_BUY | [optional] [default to &quot;PRODUCT_CLICK&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **periodType** | **kotlin.String**| DAILY | WEEKLY | [optional] [default to &quot;DAILY&quot;] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="naverNaverShoppingCategoryReference"></a>
# **naverNaverShoppingCategoryReference**
> kotlin.Any naverNaverShoppingCategoryReference()

Naver Shopping category reference

Naver Shopping top-level category ids (for bestsellers/keywords/insight). Free.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = NaverApi()
try {
    val result : kotlin.Any = apiInstance.naverNaverShoppingCategoryReference()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NaverApi#naverNaverShoppingCategoryReference")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NaverApi#naverNaverShoppingCategoryReference")
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

<a id="naverNaverShoppingTrendingKeywordRankings"></a>
# **naverNaverShoppingTrendingKeywordRankings**
> kotlin.Any naverNaverShoppingTrendingKeywordRankings(categoryId, ageType, sortType, periodType)

Naver Shopping trending keyword rankings

Trending Naver Shopping keywords for a category (snxbest keyword rankings).

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = NaverApi()
val categoryId : kotlin.String = categoryId_example // kotlin.String | Naver shopping category id (see /shopping/categories)
val ageType : kotlin.String = ageType_example // kotlin.String | ALL | MEN_20 | WOMEN_20 | ...
val sortType : kotlin.String = sortType_example // kotlin.String | 
val periodType : kotlin.String = periodType_example // kotlin.String | DAILY | WEEKLY
try {
    val result : kotlin.Any = apiInstance.naverNaverShoppingTrendingKeywordRankings(categoryId, ageType, sortType, periodType)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NaverApi#naverNaverShoppingTrendingKeywordRankings")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NaverApi#naverNaverShoppingTrendingKeywordRankings")
    e.printStackTrace()
}
```

### Parameters
| **categoryId** | **kotlin.String**| Naver shopping category id (see /shopping/categories) | |
| **ageType** | **kotlin.String**| ALL | MEN_20 | WOMEN_20 | ... | [optional] [default to &quot;ALL&quot;] |
| **sortType** | **kotlin.String**|  | [optional] [default to &quot;KEYWORD_POPULAR&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **periodType** | **kotlin.String**| DAILY | WEEKLY | [optional] [default to &quot;WEEKLY&quot;] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="naverNaverWebSearch"></a>
# **naverNaverWebSearch**
> kotlin.Any naverNaverWebSearch(query, page)

Naver web search

Naver integrated SERP — organic results plus the inline Place pack.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = NaverApi()
val query : kotlin.String = query_example // kotlin.String | 검색어, e.g. '성남 카페'
val page : kotlin.Int = 56 // kotlin.Int | Result page
try {
    val result : kotlin.Any = apiInstance.naverNaverWebSearch(query, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NaverApi#naverNaverWebSearch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NaverApi#naverNaverWebSearch")
    e.printStackTrace()
}
```

### Parameters
| **query** | **kotlin.String**| 검색어, e.g. &#39;성남 카페&#39; | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **page** | **kotlin.Int**| Result page | [optional] [default to 1] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="naverSearchSuggestions"></a>
# **naverSearchSuggestions**
> kotlin.Any naverSearchSuggestions(query)

Search suggestions

Naver search-box suggestions.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = NaverApi()
val query : kotlin.String = query_example // kotlin.String | Partial search term
try {
    val result : kotlin.Any = apiInstance.naverSearchSuggestions(query)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NaverApi#naverSearchSuggestions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NaverApi#naverSearchSuggestions")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **query** | **kotlin.String**| Partial search term | |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

