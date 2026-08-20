# EBayApi

All URIs are relative to *https://scrapebadger.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**ebayBrowseACategory**](EBayApi.md#ebayBrowseACategory) | **GET** /v1/ebay/categories/{category_id}/items | Browse a category |
| [**ebayCompletedSoldListings**](EBayApi.md#ebayCompletedSoldListings) | **GET** /v1/ebay/completed | Completed / sold listings |
| [**ebayEbayScraperHealthCheck**](EBayApi.md#ebayEbayScraperHealthCheck) | **GET** /v1/ebay/health | eBay scraper health check |
| [**ebayEbayScraperHealthCheckHead**](EBayApi.md#ebayEbayScraperHealthCheckHead) | **HEAD** /v1/ebay/health | eBay scraper health check |
| [**ebayGetItemDetail**](EBayApi.md#ebayGetItemDetail) | **GET** /v1/ebay/items/{item_id} | Get item detail |
| [**ebayGetItemReviews**](EBayApi.md#ebayGetItemReviews) | **GET** /v1/ebay/items/{item_id}/reviews | Get item reviews |
| [**ebayGetSellerFeedback**](EBayApi.md#ebayGetSellerFeedback) | **GET** /v1/ebay/sellers/{username}/feedback | Get seller feedback |
| [**ebayGetSellerListings**](EBayApi.md#ebayGetSellerListings) | **GET** /v1/ebay/sellers/{username}/items | Get seller listings |
| [**ebayGetSellerProfile**](EBayApi.md#ebayGetSellerProfile) | **GET** /v1/ebay/sellers/{username} | Get seller profile |
| [**ebayKeywordSuggestions**](EBayApi.md#ebayKeywordSuggestions) | **GET** /v1/ebay/autocomplete | Keyword suggestions |
| [**ebayListCategories**](EBayApi.md#ebayListCategories) | **GET** /v1/ebay/categories | List categories |
| [**ebayListMarkets**](EBayApi.md#ebayListMarkets) | **GET** /v1/ebay/markets | List markets |
| [**ebaySearchListings**](EBayApi.md#ebaySearchListings) | **GET** /v1/ebay/search | Search listings |


<a id="ebayBrowseACategory"></a>
# **ebayBrowseACategory**
> kotlin.Any ebayBrowseACategory(categoryId, domain, page, perPage, sortBy, minPrice, maxPrice)

Browse a category

List active listings within an eBay category.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = EBayApi()
val categoryId : kotlin.String = categoryId_example // kotlin.String | 
val domain : kotlin.String = domain_example // kotlin.String | 
val page : kotlin.Int = 56 // kotlin.Int | 
val perPage : kotlin.Int = 56 // kotlin.Int | 
val sortBy : kotlin.String = sortBy_example // kotlin.String | best_match|ending_soonest|newly_listed|price_low_to_high|price_high_to_low
val minPrice : java.math.BigDecimal = 8.14 // java.math.BigDecimal | 
val maxPrice : java.math.BigDecimal = 8.14 // java.math.BigDecimal | 
try {
    val result : kotlin.Any = apiInstance.ebayBrowseACategory(categoryId, domain, page, perPage, sortBy, minPrice, maxPrice)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EBayApi#ebayBrowseACategory")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EBayApi#ebayBrowseACategory")
    e.printStackTrace()
}
```

### Parameters
| **categoryId** | **kotlin.String**|  | |
| **domain** | **kotlin.String**|  | [optional] [default to &quot;com&quot;] |
| **page** | **kotlin.Int**|  | [optional] [default to 1] |
| **perPage** | **kotlin.Int**|  | [optional] |
| **sortBy** | **kotlin.String**| best_match|ending_soonest|newly_listed|price_low_to_high|price_high_to_low | [optional] [default to &quot;best_match&quot;] |
| **minPrice** | **java.math.BigDecimal**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **maxPrice** | **java.math.BigDecimal**|  | [optional] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="ebayCompletedSoldListings"></a>
# **ebayCompletedSoldListings**
> kotlin.Any ebayCompletedSoldListings(query, domain, categoryId, page, perPage, sortBy, condition, minPrice, maxPrice)

Completed / sold listings

Search completed/sold listings — eBay&#39;s sold-price history.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = EBayApi()
val query : kotlin.String = query_example // kotlin.String | Search keywords
val domain : kotlin.String = domain_example // kotlin.String | Marketplace domain (com, co.uk, de …)
val categoryId : kotlin.String = categoryId_example // kotlin.String | Restrict to a category id
val page : kotlin.Int = 56 // kotlin.Int | 
val perPage : kotlin.Int = 56 // kotlin.Int | 60, 120 or 240
val sortBy : kotlin.String = sortBy_example // kotlin.String | best_match|ending_soonest|newly_listed|price_low_to_high|price_high_to_low
val condition : kotlin.String = condition_example // kotlin.String | new|open_box|refurbished|used|for_parts
val minPrice : java.math.BigDecimal = 8.14 // java.math.BigDecimal | 
val maxPrice : java.math.BigDecimal = 8.14 // java.math.BigDecimal | 
try {
    val result : kotlin.Any = apiInstance.ebayCompletedSoldListings(query, domain, categoryId, page, perPage, sortBy, condition, minPrice, maxPrice)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EBayApi#ebayCompletedSoldListings")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EBayApi#ebayCompletedSoldListings")
    e.printStackTrace()
}
```

### Parameters
| **query** | **kotlin.String**| Search keywords | |
| **domain** | **kotlin.String**| Marketplace domain (com, co.uk, de …) | [optional] [default to &quot;com&quot;] |
| **categoryId** | **kotlin.String**| Restrict to a category id | [optional] |
| **page** | **kotlin.Int**|  | [optional] [default to 1] |
| **perPage** | **kotlin.Int**| 60, 120 or 240 | [optional] |
| **sortBy** | **kotlin.String**| best_match|ending_soonest|newly_listed|price_low_to_high|price_high_to_low | [optional] [default to &quot;best_match&quot;] |
| **condition** | **kotlin.String**| new|open_box|refurbished|used|for_parts | [optional] |
| **minPrice** | **java.math.BigDecimal**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **maxPrice** | **java.math.BigDecimal**|  | [optional] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="ebayEbayScraperHealthCheck"></a>
# **ebayEbayScraperHealthCheck**
> kotlin.Any ebayEbayScraperHealthCheck()

eBay scraper health check

Check health of the eBay scraper service (accepts HEAD for UptimeRobot).

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = EBayApi()
try {
    val result : kotlin.Any = apiInstance.ebayEbayScraperHealthCheck()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EBayApi#ebayEbayScraperHealthCheck")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EBayApi#ebayEbayScraperHealthCheck")
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

<a id="ebayEbayScraperHealthCheckHead"></a>
# **ebayEbayScraperHealthCheckHead**
> kotlin.Any ebayEbayScraperHealthCheckHead()

eBay scraper health check

Check health of the eBay scraper service (accepts HEAD for UptimeRobot).

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = EBayApi()
try {
    val result : kotlin.Any = apiInstance.ebayEbayScraperHealthCheckHead()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EBayApi#ebayEbayScraperHealthCheckHead")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EBayApi#ebayEbayScraperHealthCheckHead")
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

<a id="ebayGetItemDetail"></a>
# **ebayGetItemDetail**
> kotlin.Any ebayGetItemDetail(itemId, domain)

Get item detail

Get a single eBay listing&#39;s full detail.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = EBayApi()
val itemId : kotlin.String = itemId_example // kotlin.String | 
val domain : kotlin.String = domain_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.ebayGetItemDetail(itemId, domain)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EBayApi#ebayGetItemDetail")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EBayApi#ebayGetItemDetail")
    e.printStackTrace()
}
```

### Parameters
| **itemId** | **kotlin.String**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **domain** | **kotlin.String**|  | [optional] [default to &quot;com&quot;] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="ebayGetItemReviews"></a>
# **ebayGetItemReviews**
> kotlin.Any ebayGetItemReviews(itemId, domain, page)

Get item reviews

Get catalog product reviews shown on an eBay listing.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = EBayApi()
val itemId : kotlin.String = itemId_example // kotlin.String | 
val domain : kotlin.String = domain_example // kotlin.String | 
val page : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.Any = apiInstance.ebayGetItemReviews(itemId, domain, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EBayApi#ebayGetItemReviews")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EBayApi#ebayGetItemReviews")
    e.printStackTrace()
}
```

### Parameters
| **itemId** | **kotlin.String**|  | |
| **domain** | **kotlin.String**|  | [optional] [default to &quot;com&quot;] |
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

<a id="ebayGetSellerFeedback"></a>
# **ebayGetSellerFeedback**
> kotlin.Any ebayGetSellerFeedback(username, domain, page)

Get seller feedback

Get a seller&#39;s recent feedback comments.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = EBayApi()
val username : kotlin.String = username_example // kotlin.String | 
val domain : kotlin.String = domain_example // kotlin.String | 
val page : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.Any = apiInstance.ebayGetSellerFeedback(username, domain, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EBayApi#ebayGetSellerFeedback")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EBayApi#ebayGetSellerFeedback")
    e.printStackTrace()
}
```

### Parameters
| **username** | **kotlin.String**|  | |
| **domain** | **kotlin.String**|  | [optional] [default to &quot;com&quot;] |
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

<a id="ebayGetSellerListings"></a>
# **ebayGetSellerListings**
> kotlin.Any ebayGetSellerListings(username, domain, query, page, perPage)

Get seller listings

List the active listings of a single eBay seller.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = EBayApi()
val username : kotlin.String = username_example // kotlin.String | 
val domain : kotlin.String = domain_example // kotlin.String | 
val query : kotlin.String = query_example // kotlin.String | 
val page : kotlin.Int = 56 // kotlin.Int | 
val perPage : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.Any = apiInstance.ebayGetSellerListings(username, domain, query, page, perPage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EBayApi#ebayGetSellerListings")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EBayApi#ebayGetSellerListings")
    e.printStackTrace()
}
```

### Parameters
| **username** | **kotlin.String**|  | |
| **domain** | **kotlin.String**|  | [optional] [default to &quot;com&quot;] |
| **query** | **kotlin.String**|  | [optional] |
| **page** | **kotlin.Int**|  | [optional] [default to 1] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **perPage** | **kotlin.Int**|  | [optional] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="ebayGetSellerProfile"></a>
# **ebayGetSellerProfile**
> kotlin.Any ebayGetSellerProfile(username, domain)

Get seller profile

Get an eBay seller&#39;s public profile.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = EBayApi()
val username : kotlin.String = username_example // kotlin.String | 
val domain : kotlin.String = domain_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.ebayGetSellerProfile(username, domain)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EBayApi#ebayGetSellerProfile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EBayApi#ebayGetSellerProfile")
    e.printStackTrace()
}
```

### Parameters
| **username** | **kotlin.String**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **domain** | **kotlin.String**|  | [optional] [default to &quot;com&quot;] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="ebayKeywordSuggestions"></a>
# **ebayKeywordSuggestions**
> kotlin.Any ebayKeywordSuggestions(query, domain)

Keyword suggestions

Return eBay keyword autocomplete suggestions.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = EBayApi()
val query : kotlin.String = query_example // kotlin.String | Partial query prefix
val domain : kotlin.String = domain_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.ebayKeywordSuggestions(query, domain)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EBayApi#ebayKeywordSuggestions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EBayApi#ebayKeywordSuggestions")
    e.printStackTrace()
}
```

### Parameters
| **query** | **kotlin.String**| Partial query prefix | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **domain** | **kotlin.String**|  | [optional] [default to &quot;com&quot;] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="ebayListCategories"></a>
# **ebayListCategories**
> kotlin.Any ebayListCategories()

List categories

List eBay&#39;s top-level category ids.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = EBayApi()
try {
    val result : kotlin.Any = apiInstance.ebayListCategories()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EBayApi#ebayListCategories")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EBayApi#ebayListCategories")
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

<a id="ebayListMarkets"></a>
# **ebayListMarkets**
> kotlin.Any ebayListMarkets()

List markets

List all supported eBay marketplaces.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = EBayApi()
try {
    val result : kotlin.Any = apiInstance.ebayListMarkets()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EBayApi#ebayListMarkets")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EBayApi#ebayListMarkets")
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

<a id="ebaySearchListings"></a>
# **ebaySearchListings**
> kotlin.Any ebaySearchListings(query, domain, categoryId, page, perPage, sortBy, condition, buyingFormat, minPrice, maxPrice, freeShipping)

Search listings

Search an eBay marketplace for active listings.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = EBayApi()
val query : kotlin.String = query_example // kotlin.String | Search keywords
val domain : kotlin.String = domain_example // kotlin.String | Marketplace domain (com, co.uk, de …)
val categoryId : kotlin.String = categoryId_example // kotlin.String | Restrict to a category id
val page : kotlin.Int = 56 // kotlin.Int | 
val perPage : kotlin.Int = 56 // kotlin.Int | 60, 120 or 240
val sortBy : kotlin.String = sortBy_example // kotlin.String | best_match|ending_soonest|newly_listed|price_low_to_high|price_high_to_low
val condition : kotlin.String = condition_example // kotlin.String | new|open_box|refurbished|used|for_parts
val buyingFormat : kotlin.String = buyingFormat_example // kotlin.String | auction|buy_it_now|best_offer
val minPrice : java.math.BigDecimal = 8.14 // java.math.BigDecimal | 
val maxPrice : java.math.BigDecimal = 8.14 // java.math.BigDecimal | 
val freeShipping : kotlin.Boolean = true // kotlin.Boolean | 
try {
    val result : kotlin.Any = apiInstance.ebaySearchListings(query, domain, categoryId, page, perPage, sortBy, condition, buyingFormat, minPrice, maxPrice, freeShipping)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EBayApi#ebaySearchListings")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EBayApi#ebaySearchListings")
    e.printStackTrace()
}
```

### Parameters
| **query** | **kotlin.String**| Search keywords | |
| **domain** | **kotlin.String**| Marketplace domain (com, co.uk, de …) | [optional] [default to &quot;com&quot;] |
| **categoryId** | **kotlin.String**| Restrict to a category id | [optional] |
| **page** | **kotlin.Int**|  | [optional] [default to 1] |
| **perPage** | **kotlin.Int**| 60, 120 or 240 | [optional] |
| **sortBy** | **kotlin.String**| best_match|ending_soonest|newly_listed|price_low_to_high|price_high_to_low | [optional] [default to &quot;best_match&quot;] |
| **condition** | **kotlin.String**| new|open_box|refurbished|used|for_parts | [optional] |
| **buyingFormat** | **kotlin.String**| auction|buy_it_now|best_offer | [optional] |
| **minPrice** | **java.math.BigDecimal**|  | [optional] |
| **maxPrice** | **java.math.BigDecimal**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **freeShipping** | **kotlin.Boolean**|  | [optional] [default to false] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

