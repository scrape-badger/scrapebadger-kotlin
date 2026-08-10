# VintedApi

All URIs are relative to *https://scrapebadger.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**vintedGetItemDetails**](VintedApi.md#vintedGetItemDetails) | **GET** /v1/vinted/items/{item_id} | Get item details |
| [**vintedGetUserProfile**](VintedApi.md#vintedGetUserProfile) | **GET** /v1/vinted/users/{user_id} | Get user profile |
| [**vintedGetUserSListedItems**](VintedApi.md#vintedGetUserSListedItems) | **GET** /v1/vinted/users/{user_id}/items | Get user&#39;s listed items |
| [**vintedListColors**](VintedApi.md#vintedListColors) | **GET** /v1/vinted/colors | List colors |
| [**vintedListItemConditions**](VintedApi.md#vintedListItemConditions) | **GET** /v1/vinted/statuses | List item conditions |
| [**vintedListMarkets**](VintedApi.md#vintedListMarkets) | **GET** /v1/vinted/markets | List markets |
| [**vintedSearchBrands**](VintedApi.md#vintedSearchBrands) | **GET** /v1/vinted/brands | Search brands |
| [**vintedSearchVintedItems**](VintedApi.md#vintedSearchVintedItems) | **GET** /v1/vinted/search | Search Vinted items |
| [**vintedVintedScraperHealthCheck**](VintedApi.md#vintedVintedScraperHealthCheck) | **GET** /v1/vinted/health | Vinted scraper health check |
| [**vintedVintedScraperHealthCheckHead**](VintedApi.md#vintedVintedScraperHealthCheckHead) | **HEAD** /v1/vinted/health | Vinted scraper health check |


<a id="vintedGetItemDetails"></a>
# **vintedGetItemDetails**
> kotlin.Any vintedGetItemDetails(itemId, market)

Get item details

Get detailed information about a Vinted item.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = VintedApi()
val itemId : kotlin.Int = 56 // kotlin.Int | 
val market : kotlin.String = market_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.vintedGetItemDetails(itemId, market)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VintedApi#vintedGetItemDetails")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VintedApi#vintedGetItemDetails")
    e.printStackTrace()
}
```

### Parameters
| **itemId** | **kotlin.Int**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **market** | **kotlin.String**|  | [optional] [default to &quot;fr&quot;] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="vintedGetUserProfile"></a>
# **vintedGetUserProfile**
> kotlin.Any vintedGetUserProfile(userId, market)

Get user profile

Get a Vinted user&#39;s profile.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = VintedApi()
val userId : kotlin.Int = 56 // kotlin.Int | 
val market : kotlin.String = market_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.vintedGetUserProfile(userId, market)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VintedApi#vintedGetUserProfile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VintedApi#vintedGetUserProfile")
    e.printStackTrace()
}
```

### Parameters
| **userId** | **kotlin.Int**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **market** | **kotlin.String**|  | [optional] [default to &quot;fr&quot;] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="vintedGetUserSListedItems"></a>
# **vintedGetUserSListedItems**
> kotlin.Any vintedGetUserSListedItems(userId, market, page, perPage)

Get user&#39;s listed items

Get items listed by a Vinted user.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = VintedApi()
val userId : kotlin.Int = 56 // kotlin.Int | 
val market : kotlin.String = market_example // kotlin.String | 
val page : kotlin.Int = 56 // kotlin.Int | 
val perPage : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.Any = apiInstance.vintedGetUserSListedItems(userId, market, page, perPage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VintedApi#vintedGetUserSListedItems")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VintedApi#vintedGetUserSListedItems")
    e.printStackTrace()
}
```

### Parameters
| **userId** | **kotlin.Int**|  | |
| **market** | **kotlin.String**|  | [optional] [default to &quot;fr&quot;] |
| **page** | **kotlin.Int**|  | [optional] [default to 1] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **perPage** | **kotlin.Int**|  | [optional] [default to 20] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="vintedListColors"></a>
# **vintedListColors**
> kotlin.Any vintedListColors(market)

List colors

Get available Vinted colors for filtering.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = VintedApi()
val market : kotlin.String = market_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.vintedListColors(market)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VintedApi#vintedListColors")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VintedApi#vintedListColors")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **market** | **kotlin.String**|  | [optional] [default to &quot;fr&quot;] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="vintedListItemConditions"></a>
# **vintedListItemConditions**
> kotlin.Any vintedListItemConditions(market)

List item conditions

Get available item condition statuses.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = VintedApi()
val market : kotlin.String = market_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.vintedListItemConditions(market)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VintedApi#vintedListItemConditions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VintedApi#vintedListItemConditions")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **market** | **kotlin.String**|  | [optional] [default to &quot;fr&quot;] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="vintedListMarkets"></a>
# **vintedListMarkets**
> kotlin.Any vintedListMarkets()

List markets

List all supported Vinted markets.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = VintedApi()
try {
    val result : kotlin.Any = apiInstance.vintedListMarkets()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VintedApi#vintedListMarkets")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VintedApi#vintedListMarkets")
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

<a id="vintedSearchBrands"></a>
# **vintedSearchBrands**
> kotlin.Any vintedSearchBrands(keyword, market)

Search brands

Search Vinted brands.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = VintedApi()
val keyword : kotlin.String = keyword_example // kotlin.String | Brand search keyword
val market : kotlin.String = market_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.vintedSearchBrands(keyword, market)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VintedApi#vintedSearchBrands")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VintedApi#vintedSearchBrands")
    e.printStackTrace()
}
```

### Parameters
| **keyword** | **kotlin.String**| Brand search keyword | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **market** | **kotlin.String**|  | [optional] [default to &quot;fr&quot;] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="vintedSearchVintedItems"></a>
# **vintedSearchVintedItems**
> kotlin.Any vintedSearchVintedItems(query, market, sellerCountry, page, perPage, priceFrom, priceTo, brandIds, catalogIds, colorIds, statusIds, order)

Search Vinted items

Search Vinted catalog items with filters.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = VintedApi()
val query : kotlin.String = query_example // kotlin.String | Search text
val market : kotlin.String = market_example // kotlin.String | Market code
val sellerCountry : kotlin.String = sellerCountry_example // kotlin.String | Filter to items whose seller is physically located in one of these comma-separated ISO-2 country codes (e.g. 'fr' or 'fr,be'). Market domains federate cross-border EU listings and Vinted has no native country filter, so each item is enriched with its seller's country and non-matching ones are dropped. Adds 1 credit per uncached seller looked up (cached for 7 days).
val page : kotlin.Int = 56 // kotlin.Int | 
val perPage : kotlin.Int = 56 // kotlin.Int | 
val priceFrom : java.math.BigDecimal = 8.14 // java.math.BigDecimal | 
val priceTo : java.math.BigDecimal = 8.14 // java.math.BigDecimal | 
val brandIds : kotlin.String = brandIds_example // kotlin.String | 
val catalogIds : kotlin.String = catalogIds_example // kotlin.String | Comma-separated Vinted catalog (category) IDs to restrict the search to, e.g. '1904' or '1904,79'. Vinted applies this before searching, so pagination totals reflect the filtered set. A catalog ID is the `catalog[]` value in a Vinted category URL (vinted.fr/catalog?catalog[]=1904).
val colorIds : kotlin.String = colorIds_example // kotlin.String | Comma-separated color IDs
val statusIds : kotlin.String = statusIds_example // kotlin.String | Comma-separated condition/status IDs
val order : kotlin.String = order_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.vintedSearchVintedItems(query, market, sellerCountry, page, perPage, priceFrom, priceTo, brandIds, catalogIds, colorIds, statusIds, order)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VintedApi#vintedSearchVintedItems")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VintedApi#vintedSearchVintedItems")
    e.printStackTrace()
}
```

### Parameters
| **query** | **kotlin.String**| Search text | |
| **market** | **kotlin.String**| Market code | [optional] [default to &quot;fr&quot;] |
| **sellerCountry** | **kotlin.String**| Filter to items whose seller is physically located in one of these comma-separated ISO-2 country codes (e.g. &#39;fr&#39; or &#39;fr,be&#39;). Market domains federate cross-border EU listings and Vinted has no native country filter, so each item is enriched with its seller&#39;s country and non-matching ones are dropped. Adds 1 credit per uncached seller looked up (cached for 7 days). | [optional] |
| **page** | **kotlin.Int**|  | [optional] [default to 1] |
| **perPage** | **kotlin.Int**|  | [optional] [default to 20] |
| **priceFrom** | **java.math.BigDecimal**|  | [optional] |
| **priceTo** | **java.math.BigDecimal**|  | [optional] |
| **brandIds** | **kotlin.String**|  | [optional] |
| **catalogIds** | **kotlin.String**| Comma-separated Vinted catalog (category) IDs to restrict the search to, e.g. &#39;1904&#39; or &#39;1904,79&#39;. Vinted applies this before searching, so pagination totals reflect the filtered set. A catalog ID is the &#x60;catalog[]&#x60; value in a Vinted category URL (vinted.fr/catalog?catalog[]&#x3D;1904). | [optional] |
| **colorIds** | **kotlin.String**| Comma-separated color IDs | [optional] |
| **statusIds** | **kotlin.String**| Comma-separated condition/status IDs | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **order** | **kotlin.String**|  | [optional] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="vintedVintedScraperHealthCheck"></a>
# **vintedVintedScraperHealthCheck**
> kotlin.Any vintedVintedScraperHealthCheck()

Vinted scraper health check

Check health of the Vinted scraper service.  Accepts &#x60;&#x60;HEAD&#x60;&#x60; so external uptime checkers (UptimeRobot uses HEAD by default for HTTP monitors) don&#39;t get a 405 Method Not Allowed.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = VintedApi()
try {
    val result : kotlin.Any = apiInstance.vintedVintedScraperHealthCheck()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VintedApi#vintedVintedScraperHealthCheck")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VintedApi#vintedVintedScraperHealthCheck")
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

<a id="vintedVintedScraperHealthCheckHead"></a>
# **vintedVintedScraperHealthCheckHead**
> kotlin.Any vintedVintedScraperHealthCheckHead()

Vinted scraper health check

Check health of the Vinted scraper service.  Accepts &#x60;&#x60;HEAD&#x60;&#x60; so external uptime checkers (UptimeRobot uses HEAD by default for HTTP monitors) don&#39;t get a 405 Method Not Allowed.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = VintedApi()
try {
    val result : kotlin.Any = apiInstance.vintedVintedScraperHealthCheckHead()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VintedApi#vintedVintedScraperHealthCheckHead")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VintedApi#vintedVintedScraperHealthCheckHead")
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

