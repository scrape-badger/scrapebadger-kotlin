# WallapopApi

All URIs are relative to *https://scrapebadger.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**wallapopAutocomplete**](WallapopApi.md#wallapopAutocomplete) | **GET** /v1/wallapop/autocomplete | Autocomplete |
| [**wallapopGetListingDetail**](WallapopApi.md#wallapopGetListingDetail) | **GET** /v1/wallapop/items/{item_id} | Get listing detail |
| [**wallapopGetUserListings**](WallapopApi.md#wallapopGetUserListings) | **GET** /v1/wallapop/users/{user_id}/items | Get user listings |
| [**wallapopGetUserProfile**](WallapopApi.md#wallapopGetUserProfile) | **GET** /v1/wallapop/users/{user_id} | Get user profile |
| [**wallapopGetUserReviews**](WallapopApi.md#wallapopGetUserReviews) | **GET** /v1/wallapop/users/{user_id}/reviews | Get user reviews |
| [**wallapopListCategories**](WallapopApi.md#wallapopListCategories) | **GET** /v1/wallapop/categories | List categories |
| [**wallapopListFilterOptions**](WallapopApi.md#wallapopListFilterOptions) | **GET** /v1/wallapop/filters/{filter_id}/options | List filter options |
| [**wallapopListMarkets**](WallapopApi.md#wallapopListMarkets) | **GET** /v1/wallapop/markets | List markets |
| [**wallapopListSearchFilters**](WallapopApi.md#wallapopListSearchFilters) | **GET** /v1/wallapop/filters | List search filters |
| [**wallapopSearchListings**](WallapopApi.md#wallapopSearchListings) | **GET** /v1/wallapop/search | Search listings |
| [**wallapopWallapopScraperHealthCheck**](WallapopApi.md#wallapopWallapopScraperHealthCheck) | **GET** /v1/wallapop/health | Wallapop scraper health check |
| [**wallapopWallapopScraperHealthCheckHead**](WallapopApi.md#wallapopWallapopScraperHealthCheckHead) | **HEAD** /v1/wallapop/health | Wallapop scraper health check |


<a id="wallapopAutocomplete"></a>
# **wallapopAutocomplete**
> kotlin.Any wallapopAutocomplete(query, market)

Autocomplete

Wallapop&#39;s search-box suggestions for a partial query.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = WallapopApi()
val query : kotlin.String = query_example // kotlin.String | Partial search text, e.g. 'bici'
val market : kotlin.String = market_example // kotlin.String | Market: es (Spain), it (Italy), pt (Portugal)
try {
    val result : kotlin.Any = apiInstance.wallapopAutocomplete(query, market)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WallapopApi#wallapopAutocomplete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WallapopApi#wallapopAutocomplete")
    e.printStackTrace()
}
```

### Parameters
| **query** | **kotlin.String**| Partial search text, e.g. &#39;bici&#39; | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **market** | **kotlin.String**| Market: es (Spain), it (Italy), pt (Portugal) | [optional] [default to &quot;es&quot;] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="wallapopGetListingDetail"></a>
# **wallapopGetListingDetail**
> kotlin.Any wallapopGetListingDetail(itemId, market)

Get listing detail

Full listing detail by id (e.g. nzxeknm5x562) or listing slug.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = WallapopApi()
val itemId : kotlin.String = itemId_example // kotlin.String | 
val market : kotlin.String = market_example // kotlin.String | Market: es (Spain), it (Italy), pt (Portugal)
try {
    val result : kotlin.Any = apiInstance.wallapopGetListingDetail(itemId, market)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WallapopApi#wallapopGetListingDetail")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WallapopApi#wallapopGetListingDetail")
    e.printStackTrace()
}
```

### Parameters
| **itemId** | **kotlin.String**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **market** | **kotlin.String**| Market: es (Spain), it (Italy), pt (Portugal) | [optional] [default to &quot;es&quot;] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="wallapopGetUserListings"></a>
# **wallapopGetUserListings**
> kotlin.Any wallapopGetUserListings(userId, market, nextPage)

Get user listings

A seller&#39;s live listings, 40 per page.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = WallapopApi()
val userId : kotlin.String = userId_example // kotlin.String | 
val market : kotlin.String = market_example // kotlin.String | Market: es (Spain), it (Italy), pt (Portugal)
val nextPage : kotlin.String = nextPage_example // kotlin.String | Cursor from the previous page's next_page
try {
    val result : kotlin.Any = apiInstance.wallapopGetUserListings(userId, market, nextPage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WallapopApi#wallapopGetUserListings")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WallapopApi#wallapopGetUserListings")
    e.printStackTrace()
}
```

### Parameters
| **userId** | **kotlin.String**|  | |
| **market** | **kotlin.String**| Market: es (Spain), it (Italy), pt (Portugal) | [optional] [default to &quot;es&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **nextPage** | **kotlin.String**| Cursor from the previous page&#39;s next_page | [optional] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="wallapopGetUserProfile"></a>
# **wallapopGetUserProfile**
> kotlin.Any wallapopGetUserProfile(userId, market)

Get user profile

Seller profile with ratings, sales counters, response rate and verifications.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = WallapopApi()
val userId : kotlin.String = userId_example // kotlin.String | 
val market : kotlin.String = market_example // kotlin.String | Market: es (Spain), it (Italy), pt (Portugal)
try {
    val result : kotlin.Any = apiInstance.wallapopGetUserProfile(userId, market)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WallapopApi#wallapopGetUserProfile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WallapopApi#wallapopGetUserProfile")
    e.printStackTrace()
}
```

### Parameters
| **userId** | **kotlin.String**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **market** | **kotlin.String**| Market: es (Spain), it (Italy), pt (Portugal) | [optional] [default to &quot;es&quot;] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="wallapopGetUserReviews"></a>
# **wallapopGetUserReviews**
> kotlin.Any wallapopGetUserReviews(userId, market, nextPage)

Get user reviews

Reviews a seller received, newest first, 40 per page.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = WallapopApi()
val userId : kotlin.String = userId_example // kotlin.String | 
val market : kotlin.String = market_example // kotlin.String | Market: es (Spain), it (Italy), pt (Portugal)
val nextPage : kotlin.String = nextPage_example // kotlin.String | Cursor from the previous page's next_page
try {
    val result : kotlin.Any = apiInstance.wallapopGetUserReviews(userId, market, nextPage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WallapopApi#wallapopGetUserReviews")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WallapopApi#wallapopGetUserReviews")
    e.printStackTrace()
}
```

### Parameters
| **userId** | **kotlin.String**|  | |
| **market** | **kotlin.String**| Market: es (Spain), it (Italy), pt (Portugal) | [optional] [default to &quot;es&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **nextPage** | **kotlin.String**| Cursor from the previous page&#39;s next_page | [optional] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="wallapopListCategories"></a>
# **wallapopListCategories**
> kotlin.Any wallapopListCategories(market)

List categories

The full category tree; ids are usable as the search category_id.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = WallapopApi()
val market : kotlin.String = market_example // kotlin.String | Market: es (Spain), it (Italy), pt (Portugal)
try {
    val result : kotlin.Any = apiInstance.wallapopListCategories(market)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WallapopApi#wallapopListCategories")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WallapopApi#wallapopListCategories")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **market** | **kotlin.String**| Market: es (Spain), it (Italy), pt (Portugal) | [optional] [default to &quot;es&quot;] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="wallapopListFilterOptions"></a>
# **wallapopListFilterOptions**
> kotlin.Any wallapopListFilterOptions(filterId, categoryId, query, market)

List filter options

Long option lists (e.g. brand, model) for filters flagged options_endpoint.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = WallapopApi()
val filterId : kotlin.String = filterId_example // kotlin.String | 
val categoryId : kotlin.Int = 56 // kotlin.Int | Category to scope options to
val query : kotlin.String = query_example // kotlin.String | Search text to scope options to
val market : kotlin.String = market_example // kotlin.String | Market: es (Spain), it (Italy), pt (Portugal)
try {
    val result : kotlin.Any = apiInstance.wallapopListFilterOptions(filterId, categoryId, query, market)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WallapopApi#wallapopListFilterOptions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WallapopApi#wallapopListFilterOptions")
    e.printStackTrace()
}
```

### Parameters
| **filterId** | **kotlin.String**|  | |
| **categoryId** | **kotlin.Int**| Category to scope options to | [optional] |
| **query** | **kotlin.String**| Search text to scope options to | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **market** | **kotlin.String**| Market: es (Spain), it (Italy), pt (Portugal) | [optional] [default to &quot;es&quot;] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="wallapopListMarkets"></a>
# **wallapopListMarkets**
> kotlin.Any wallapopListMarkets()

List markets

Supported Wallapop markets and their default search location.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = WallapopApi()
try {
    val result : kotlin.Any = apiInstance.wallapopListMarkets()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WallapopApi#wallapopListMarkets")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WallapopApi#wallapopListMarkets")
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

<a id="wallapopListSearchFilters"></a>
# **wallapopListSearchFilters**
> kotlin.Any wallapopListSearchFilters(categoryId, query, market)

List search filters

The filters Wallapop offers for a category or query, with option ids.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = WallapopApi()
val categoryId : kotlin.Int = 56 // kotlin.Int | Category the filters apply to
val query : kotlin.String = query_example // kotlin.String | Search text the filters apply to
val market : kotlin.String = market_example // kotlin.String | Market: es (Spain), it (Italy), pt (Portugal)
try {
    val result : kotlin.Any = apiInstance.wallapopListSearchFilters(categoryId, query, market)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WallapopApi#wallapopListSearchFilters")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WallapopApi#wallapopListSearchFilters")
    e.printStackTrace()
}
```

### Parameters
| **categoryId** | **kotlin.Int**| Category the filters apply to | [optional] |
| **query** | **kotlin.String**| Search text the filters apply to | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **market** | **kotlin.String**| Market: es (Spain), it (Italy), pt (Portugal) | [optional] [default to &quot;es&quot;] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="wallapopSearchListings"></a>
# **wallapopSearchListings**
> kotlin.Any wallapopSearchListings(query, market, latitude, longitude, distanceKm, categoryId, minPrice, maxPrice, condition, brand, model, color, timeFilter, shippable, hasWarranty, refurbished, minYear, maxYear, minKm, maxKm, gearbox, minHorsepower, maxHorsepower, orderBy, nextPage)

Search listings

Search Wallapop listings (40 per page). Needs a query, a category_id, or both.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = WallapopApi()
val query : kotlin.String = query_example // kotlin.String | Search text, e.g. 'iphone 14'
val market : kotlin.String = market_example // kotlin.String | Market: es (Spain), it (Italy), pt (Portugal)
val latitude : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Search centre latitude (defaults to the market capital)
val longitude : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Search centre longitude
val distanceKm : kotlin.Int = 56 // kotlin.Int | Search radius
val categoryId : kotlin.Int = 56 // kotlin.Int | Category id from /categories
val minPrice : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Minimum price (EUR)
val maxPrice : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Maximum price (EUR)
val condition : kotlin.String = condition_example // kotlin.String | Comma-separated: un_opened, in_box, new, as_good_as_new, good, fair, has_given_it_all
val brand : kotlin.String = brand_example // kotlin.String | Brand, e.g. Apple
val model : kotlin.String = model_example // kotlin.String | Model, e.g. iPhone 14
val color : kotlin.String = color_example // kotlin.String | Colour id, e.g. black
val timeFilter : kotlin.String = timeFilter_example // kotlin.String | Only listings published within this window
val shippable : kotlin.Boolean = true // kotlin.Boolean | Only listings that ship
val hasWarranty : kotlin.Boolean = true // kotlin.Boolean | Only listings with a warranty
val refurbished : kotlin.Boolean = true // kotlin.Boolean | Only refurbished listings
val minYear : kotlin.Int = 56 // kotlin.Int | Cars: earliest model year
val maxYear : kotlin.Int = 56 // kotlin.Int | Cars: latest model year
val minKm : kotlin.Int = 56 // kotlin.Int | Cars: minimum mileage
val maxKm : kotlin.Int = 56 // kotlin.Int | Cars: maximum mileage
val gearbox : kotlin.String = gearbox_example // kotlin.String | Cars
val minHorsepower : kotlin.Int = 56 // kotlin.Int | Cars: minimum power
val maxHorsepower : kotlin.Int = 56 // kotlin.Int | Cars: maximum power
val orderBy : kotlin.String = orderBy_example // kotlin.String | Sort order
val nextPage : kotlin.String = nextPage_example // kotlin.String | Cursor from the previous page's next_page; other parameters are then ignored
try {
    val result : kotlin.Any = apiInstance.wallapopSearchListings(query, market, latitude, longitude, distanceKm, categoryId, minPrice, maxPrice, condition, brand, model, color, timeFilter, shippable, hasWarranty, refurbished, minYear, maxYear, minKm, maxKm, gearbox, minHorsepower, maxHorsepower, orderBy, nextPage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WallapopApi#wallapopSearchListings")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WallapopApi#wallapopSearchListings")
    e.printStackTrace()
}
```

### Parameters
| **query** | **kotlin.String**| Search text, e.g. &#39;iphone 14&#39; | [optional] |
| **market** | **kotlin.String**| Market: es (Spain), it (Italy), pt (Portugal) | [optional] [default to &quot;es&quot;] |
| **latitude** | **java.math.BigDecimal**| Search centre latitude (defaults to the market capital) | [optional] |
| **longitude** | **java.math.BigDecimal**| Search centre longitude | [optional] |
| **distanceKm** | **kotlin.Int**| Search radius | [optional] |
| **categoryId** | **kotlin.Int**| Category id from /categories | [optional] |
| **minPrice** | **java.math.BigDecimal**| Minimum price (EUR) | [optional] |
| **maxPrice** | **java.math.BigDecimal**| Maximum price (EUR) | [optional] |
| **condition** | **kotlin.String**| Comma-separated: un_opened, in_box, new, as_good_as_new, good, fair, has_given_it_all | [optional] |
| **brand** | **kotlin.String**| Brand, e.g. Apple | [optional] |
| **model** | **kotlin.String**| Model, e.g. iPhone 14 | [optional] |
| **color** | **kotlin.String**| Colour id, e.g. black | [optional] |
| **timeFilter** | **kotlin.String**| Only listings published within this window | [optional] [enum: today, lastWeek, lastMonth] |
| **shippable** | **kotlin.Boolean**| Only listings that ship | [optional] [default to false] |
| **hasWarranty** | **kotlin.Boolean**| Only listings with a warranty | [optional] [default to false] |
| **refurbished** | **kotlin.Boolean**| Only refurbished listings | [optional] [default to false] |
| **minYear** | **kotlin.Int**| Cars: earliest model year | [optional] |
| **maxYear** | **kotlin.Int**| Cars: latest model year | [optional] |
| **minKm** | **kotlin.Int**| Cars: minimum mileage | [optional] |
| **maxKm** | **kotlin.Int**| Cars: maximum mileage | [optional] |
| **gearbox** | **kotlin.String**| Cars | [optional] [enum: manual, automatic] |
| **minHorsepower** | **kotlin.Int**| Cars: minimum power | [optional] |
| **maxHorsepower** | **kotlin.Int**| Cars: maximum power | [optional] |
| **orderBy** | **kotlin.String**| Sort order | [optional] [default to most_relevance] [enum: most_relevance, newest, closest, price_low_to_high, price_high_to_low] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **nextPage** | **kotlin.String**| Cursor from the previous page&#39;s next_page; other parameters are then ignored | [optional] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="wallapopWallapopScraperHealthCheck"></a>
# **wallapopWallapopScraperHealthCheck**
> kotlin.Any wallapopWallapopScraperHealthCheck()

Wallapop scraper health check

Check health of the Wallapop scraper service (accepts HEAD).

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = WallapopApi()
try {
    val result : kotlin.Any = apiInstance.wallapopWallapopScraperHealthCheck()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WallapopApi#wallapopWallapopScraperHealthCheck")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WallapopApi#wallapopWallapopScraperHealthCheck")
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

<a id="wallapopWallapopScraperHealthCheckHead"></a>
# **wallapopWallapopScraperHealthCheckHead**
> kotlin.Any wallapopWallapopScraperHealthCheckHead()

Wallapop scraper health check

Check health of the Wallapop scraper service (accepts HEAD).

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = WallapopApi()
try {
    val result : kotlin.Any = apiInstance.wallapopWallapopScraperHealthCheckHead()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WallapopApi#wallapopWallapopScraperHealthCheckHead")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WallapopApi#wallapopWallapopScraperHealthCheckHead")
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

