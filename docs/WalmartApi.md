# WalmartApi

All URIs are relative to *https://scrapebadger.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**walmartBrowseACategory**](WalmartApi.md#walmartBrowseACategory) | **GET** /v1/walmart/category | Browse a category |
| [**walmartDealsRollbacksAndClearance**](WalmartApi.md#walmartDealsRollbacksAndClearance) | **GET** /v1/walmart/deals | Deals, rollbacks and clearance |
| [**walmartGetASellerSCatalogue**](WalmartApi.md#walmartGetASellerSCatalogue) | **GET** /v1/walmart/sellers/{seller_id}/products | Get a seller&#39;s catalogue |
| [**walmartGetProductDetail**](WalmartApi.md#walmartGetProductDetail) | **GET** /v1/walmart/products/{item_id} | Get product detail |
| [**walmartGetProductReviews**](WalmartApi.md#walmartGetProductReviews) | **GET** /v1/walmart/products/{item_id}/reviews | Get product reviews |
| [**walmartGetSellerProfile**](WalmartApi.md#walmartGetSellerProfile) | **GET** /v1/walmart/sellers/{seller_id} | Get seller profile |
| [**walmartGetStoreNearbyStores**](WalmartApi.md#walmartGetStoreNearbyStores) | **GET** /v1/walmart/stores/{store_id} | Get store + nearby stores |
| [**walmartListSupportedMarkets**](WalmartApi.md#walmartListSupportedMarkets) | **GET** /v1/walmart/markets | List supported markets |
| [**walmartSearchProducts**](WalmartApi.md#walmartSearchProducts) | **GET** /v1/walmart/search | Search products |
| [**walmartSearchSuggestions**](WalmartApi.md#walmartSearchSuggestions) | **GET** /v1/walmart/autocomplete | Search suggestions |
| [**walmartWalmartScraperHealthCheck**](WalmartApi.md#walmartWalmartScraperHealthCheck) | **GET** /v1/walmart/health | Walmart scraper health check |
| [**walmartWalmartScraperHealthCheckHead**](WalmartApi.md#walmartWalmartScraperHealthCheckHead) | **HEAD** /v1/walmart/health | Walmart scraper health check |


<a id="walmartBrowseACategory"></a>
# **walmartBrowseACategory**
> kotlin.Any walmartBrowseACategory(path, page, minPrice, maxPrice, facet)

Browse a category

Browse a Walmart category. Same result shape as search.  No &#x60;sort&#x60;: Walmart&#39;s browse pages ignore it. Sort on &#x60;/search&#x60; instead.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = WalmartApi()
val path : kotlin.String = path_example // kotlin.String | Browse path, e.g. 'electronics/3944', or a '/cp/...' path
val page : kotlin.Int = 56 // kotlin.Int | 
val minPrice : java.math.BigDecimal = 8.14 // java.math.BigDecimal | 
val maxPrice : java.math.BigDecimal = 8.14 // java.math.BigDecimal | 
val facet : kotlin.String = facet_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.walmartBrowseACategory(path, page, minPrice, maxPrice, facet)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WalmartApi#walmartBrowseACategory")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WalmartApi#walmartBrowseACategory")
    e.printStackTrace()
}
```

### Parameters
| **path** | **kotlin.String**| Browse path, e.g. &#39;electronics/3944&#39;, or a &#39;/cp/...&#39; path | |
| **page** | **kotlin.Int**|  | [optional] [default to 1] |
| **minPrice** | **java.math.BigDecimal**|  | [optional] |
| **maxPrice** | **java.math.BigDecimal**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **facet** | **kotlin.String**|  | [optional] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="walmartDealsRollbacksAndClearance"></a>
# **walmartDealsRollbacksAndClearance**
> kotlin.Any walmartDealsRollbacksAndClearance(page, minPrice, maxPrice)

Deals, rollbacks and clearance

Walmart&#39;s current deals, rollbacks and clearance.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = WalmartApi()
val page : kotlin.Int = 56 // kotlin.Int | 
val minPrice : java.math.BigDecimal = 8.14 // java.math.BigDecimal | 
val maxPrice : java.math.BigDecimal = 8.14 // java.math.BigDecimal | 
try {
    val result : kotlin.Any = apiInstance.walmartDealsRollbacksAndClearance(page, minPrice, maxPrice)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WalmartApi#walmartDealsRollbacksAndClearance")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WalmartApi#walmartDealsRollbacksAndClearance")
    e.printStackTrace()
}
```

### Parameters
| **page** | **kotlin.Int**|  | [optional] [default to 1] |
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

<a id="walmartGetASellerSCatalogue"></a>
# **walmartGetASellerSCatalogue**
> kotlin.Any walmartGetASellerSCatalogue(sellerId, query, page, sort)

Get a seller&#39;s catalogue

A marketplace seller&#39;s catalogue, scoped by a search term.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = WalmartApi()
val sellerId : kotlin.String = sellerId_example // kotlin.String | Numeric catalog seller id, e.g. '101040442' — the `catalog_seller_id` on a product, NOT the 32-char hex `seller_id` (which 404s).
val query : kotlin.String = query_example // kotlin.String | Required — Walmart returns nothing for a seller facet alone
val page : kotlin.Int = 56 // kotlin.Int | 
val sort : kotlin.String = sort_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.walmartGetASellerSCatalogue(sellerId, query, page, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WalmartApi#walmartGetASellerSCatalogue")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WalmartApi#walmartGetASellerSCatalogue")
    e.printStackTrace()
}
```

### Parameters
| **sellerId** | **kotlin.String**| Numeric catalog seller id, e.g. &#39;101040442&#39; — the &#x60;catalog_seller_id&#x60; on a product, NOT the 32-char hex &#x60;seller_id&#x60; (which 404s). | |
| **query** | **kotlin.String**| Required — Walmart returns nothing for a seller facet alone | |
| **page** | **kotlin.Int**|  | [optional] [default to 1] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sort** | **kotlin.String**|  | [optional] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="walmartGetProductDetail"></a>
# **walmartGetProductDetail**
> kotlin.Any walmartGetProductDetail(itemId)

Get product detail

Full product detail — price, stock, specs, variants, seller, reviews sample.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = WalmartApi()
val itemId : kotlin.String = itemId_example // kotlin.String | Walmart usItemId, e.g. '5689919121'
try {
    val result : kotlin.Any = apiInstance.walmartGetProductDetail(itemId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WalmartApi#walmartGetProductDetail")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WalmartApi#walmartGetProductDetail")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **itemId** | **kotlin.String**| Walmart usItemId, e.g. &#39;5689919121&#39; | |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="walmartGetProductReviews"></a>
# **walmartGetProductReviews**
> kotlin.Any walmartGetProductReviews(itemId, page, sort)

Get product reviews

Paginated reviews with the full star histogram. 10 per page.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = WalmartApi()
val itemId : kotlin.String = itemId_example // kotlin.String | Walmart usItemId, e.g. '5689919121'
val page : kotlin.Int = 56 // kotlin.Int | 
val sort : kotlin.String = sort_example // kotlin.String | relevancy | submission-desc | submission-asc | rating-desc | rating-asc | helpful
try {
    val result : kotlin.Any = apiInstance.walmartGetProductReviews(itemId, page, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WalmartApi#walmartGetProductReviews")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WalmartApi#walmartGetProductReviews")
    e.printStackTrace()
}
```

### Parameters
| **itemId** | **kotlin.String**| Walmart usItemId, e.g. &#39;5689919121&#39; | |
| **page** | **kotlin.Int**|  | [optional] [default to 1] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sort** | **kotlin.String**| relevancy | submission-desc | submission-asc | rating-desc | rating-asc | helpful | [optional] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="walmartGetSellerProfile"></a>
# **walmartGetSellerProfile**
> kotlin.Any walmartGetSellerProfile(sellerId)

Get seller profile

Marketplace seller profile — contact details, address, rating, policies.  No &#x60;page&#x60;: adding one makes Walmart&#39;s own SSR throw. Use &#x60;/sellers/{id}/products&#x60; for the catalogue.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = WalmartApi()
val sellerId : kotlin.String = sellerId_example // kotlin.String | Numeric catalog seller id, e.g. '101040442' — the `catalog_seller_id` on a product, NOT the 32-char hex `seller_id` (which 404s).
try {
    val result : kotlin.Any = apiInstance.walmartGetSellerProfile(sellerId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WalmartApi#walmartGetSellerProfile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WalmartApi#walmartGetSellerProfile")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sellerId** | **kotlin.String**| Numeric catalog seller id, e.g. &#39;101040442&#39; — the &#x60;catalog_seller_id&#x60; on a product, NOT the 32-char hex &#x60;seller_id&#x60; (which 404s). | |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="walmartGetStoreNearbyStores"></a>
# **walmartGetStoreNearbyStores**
> kotlin.Any walmartGetStoreNearbyStores(storeId)

Get store + nearby stores

Store detail with hours, per-department services, and nearby stores.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = WalmartApi()
val storeId : kotlin.String = storeId_example // kotlin.String | Walmart store number, e.g. '100'
try {
    val result : kotlin.Any = apiInstance.walmartGetStoreNearbyStores(storeId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WalmartApi#walmartGetStoreNearbyStores")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WalmartApi#walmartGetStoreNearbyStores")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **storeId** | **kotlin.String**| Walmart store number, e.g. &#39;100&#39; | |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="walmartListSupportedMarkets"></a>
# **walmartListSupportedMarkets**
> kotlin.Any walmartListSupportedMarkets()

List supported markets

Supported Walmart markets.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = WalmartApi()
try {
    val result : kotlin.Any = apiInstance.walmartListSupportedMarkets()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WalmartApi#walmartListSupportedMarkets")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WalmartApi#walmartListSupportedMarkets")
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

<a id="walmartSearchProducts"></a>
# **walmartSearchProducts**
> kotlin.Any walmartSearchProducts(query, page, sort, minPrice, maxPrice, facet)

Search products

Search walmart.com. ~40-60 organic products per page; ad tiles are dropped.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = WalmartApi()
val query : kotlin.String = query_example // kotlin.String | Search keywords, e.g. 'laptop'
val page : kotlin.Int = 56 // kotlin.Int | Results dry up after page 10
val sort : kotlin.String = sort_example // kotlin.String | best_match | best_seller | price_low | price_high | rating_high | new
val minPrice : java.math.BigDecimal = 8.14 // java.math.BigDecimal | 
val maxPrice : java.math.BigDecimal = 8.14 // java.math.BigDecimal | 
val facet : kotlin.String = facet_example // kotlin.String | Facet filter, e.g. 'brand:HP'
try {
    val result : kotlin.Any = apiInstance.walmartSearchProducts(query, page, sort, minPrice, maxPrice, facet)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WalmartApi#walmartSearchProducts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WalmartApi#walmartSearchProducts")
    e.printStackTrace()
}
```

### Parameters
| **query** | **kotlin.String**| Search keywords, e.g. &#39;laptop&#39; | |
| **page** | **kotlin.Int**| Results dry up after page 10 | [optional] [default to 1] |
| **sort** | **kotlin.String**| best_match | best_seller | price_low | price_high | rating_high | new | [optional] |
| **minPrice** | **java.math.BigDecimal**|  | [optional] |
| **maxPrice** | **java.math.BigDecimal**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **facet** | **kotlin.String**| Facet filter, e.g. &#39;brand:HP&#39; | [optional] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="walmartSearchSuggestions"></a>
# **walmartSearchSuggestions**
> kotlin.Any walmartSearchSuggestions(query)

Search suggestions

Walmart search-box suggestions.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = WalmartApi()
val query : kotlin.String = query_example // kotlin.String | Partial search term, e.g. 'lapt'
try {
    val result : kotlin.Any = apiInstance.walmartSearchSuggestions(query)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WalmartApi#walmartSearchSuggestions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WalmartApi#walmartSearchSuggestions")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **query** | **kotlin.String**| Partial search term, e.g. &#39;lapt&#39; | |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="walmartWalmartScraperHealthCheck"></a>
# **walmartWalmartScraperHealthCheck**
> kotlin.Any walmartWalmartScraperHealthCheck()

Walmart scraper health check

Check health of the Walmart scraper service (accepts HEAD for UptimeRobot).

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = WalmartApi()
try {
    val result : kotlin.Any = apiInstance.walmartWalmartScraperHealthCheck()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WalmartApi#walmartWalmartScraperHealthCheck")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WalmartApi#walmartWalmartScraperHealthCheck")
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

<a id="walmartWalmartScraperHealthCheckHead"></a>
# **walmartWalmartScraperHealthCheckHead**
> kotlin.Any walmartWalmartScraperHealthCheckHead()

Walmart scraper health check

Check health of the Walmart scraper service (accepts HEAD for UptimeRobot).

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = WalmartApi()
try {
    val result : kotlin.Any = apiInstance.walmartWalmartScraperHealthCheckHead()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WalmartApi#walmartWalmartScraperHealthCheckHead")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WalmartApi#walmartWalmartScraperHealthCheckHead")
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

