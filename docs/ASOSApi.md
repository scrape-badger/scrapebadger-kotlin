# ASOSApi

All URIs are relative to *https://scrapebadger.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**asosGetProductDetail**](ASOSApi.md#asosGetProductDetail) | **GET** /v1/asos/products/{product_id} | Get product detail |
| [**asosGetStockAndPrices**](ASOSApi.md#asosGetStockAndPrices) | **GET** /v1/asos/stock-price | Get stock and prices |
| [**asosListCategories**](ASOSApi.md#asosListCategories) | **GET** /v1/asos/categories | List categories |
| [**asosListMarkets**](ASOSApi.md#asosListMarkets) | **GET** /v1/asos/markets | List markets |
| [**asosListSearchFilters**](ASOSApi.md#asosListSearchFilters) | **GET** /v1/asos/filters | List search filters |
| [**asosSearchProducts**](ASOSApi.md#asosSearchProducts) | **GET** /v1/asos/search | Search products |
| [**asosSearchSuggestions**](ASOSApi.md#asosSearchSuggestions) | **GET** /v1/asos/autocomplete | Search suggestions |


<a id="asosGetProductDetail"></a>
# **asosGetProductDetail**
> ProductResponse asosGetProductDetail(productId, market, store, country, currency, language)

Get product detail

Product, live per-size stock and price, images, descriptions, reviews and breadcrumbs.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = ASOSApi()
val productId : kotlin.Int = 56 // kotlin.Int | 
val market : kotlin.String = market_example // kotlin.String | Storefront: uk, us, au, de, fr, it, es, nl, se, dk, pl
val store : kotlin.String = store_example // kotlin.String | Override store, e.g. COM or US
val country : kotlin.String = country_example // kotlin.String | ISO country override
val currency : kotlin.String = currency_example // kotlin.String | Currency override
val language : kotlin.String = language_example // kotlin.String | Locale override, e.g. en-GB
try {
    val result : ProductResponse = apiInstance.asosGetProductDetail(productId, market, store, country, currency, language)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ASOSApi#asosGetProductDetail")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ASOSApi#asosGetProductDetail")
    e.printStackTrace()
}
```

### Parameters
| **productId** | **kotlin.Int**|  | |
| **market** | **kotlin.String**| Storefront: uk, us, au, de, fr, it, es, nl, se, dk, pl | [optional] [default to &quot;uk&quot;] |
| **store** | **kotlin.String**| Override store, e.g. COM or US | [optional] |
| **country** | **kotlin.String**| ISO country override | [optional] |
| **currency** | **kotlin.String**| Currency override | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **language** | **kotlin.String**| Locale override, e.g. en-GB | [optional] |

### Return type

[**ProductResponse**](ProductResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="asosGetStockAndPrices"></a>
# **asosGetStockAndPrices**
> StockResponse asosGetStockAndPrices(productIds, market, store, country, currency, language)

Get stock and prices

Refresh product and variant stock/prices; reports missing product ids explicitly.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = ASOSApi()
val productIds : kotlin.String = productIds_example // kotlin.String | 1–50 comma-separated product ids
val market : kotlin.String = market_example // kotlin.String | Storefront: uk, us, au, de, fr, it, es, nl, se, dk, pl
val store : kotlin.String = store_example // kotlin.String | Override store, e.g. COM or US
val country : kotlin.String = country_example // kotlin.String | ISO country override
val currency : kotlin.String = currency_example // kotlin.String | Currency override
val language : kotlin.String = language_example // kotlin.String | Locale override, e.g. en-GB
try {
    val result : StockResponse = apiInstance.asosGetStockAndPrices(productIds, market, store, country, currency, language)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ASOSApi#asosGetStockAndPrices")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ASOSApi#asosGetStockAndPrices")
    e.printStackTrace()
}
```

### Parameters
| **productIds** | **kotlin.String**| 1–50 comma-separated product ids | |
| **market** | **kotlin.String**| Storefront: uk, us, au, de, fr, it, es, nl, se, dk, pl | [optional] [default to &quot;uk&quot;] |
| **store** | **kotlin.String**| Override store, e.g. COM or US | [optional] |
| **country** | **kotlin.String**| ISO country override | [optional] |
| **currency** | **kotlin.String**| Currency override | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **language** | **kotlin.String**| Locale override, e.g. en-GB | [optional] |

### Return type

[**StockResponse**](StockResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="asosListCategories"></a>
# **asosListCategories**
> kotlin.Any asosListCategories(gender, market, store, country, currency, language)

List categories

Full nested navigation with category ids, names, images and links.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = ASOSApi()
val gender : kotlin.String = gender_example // kotlin.String | 
val market : kotlin.String = market_example // kotlin.String | Storefront: uk, us, au, de, fr, it, es, nl, se, dk, pl
val store : kotlin.String = store_example // kotlin.String | Override store, e.g. COM or US
val country : kotlin.String = country_example // kotlin.String | ISO country override
val currency : kotlin.String = currency_example // kotlin.String | Currency override
val language : kotlin.String = language_example // kotlin.String | Locale override, e.g. en-GB
try {
    val result : kotlin.Any = apiInstance.asosListCategories(gender, market, store, country, currency, language)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ASOSApi#asosListCategories")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ASOSApi#asosListCategories")
    e.printStackTrace()
}
```

### Parameters
| **gender** | **kotlin.String**|  | [optional] [default to men] [enum: men, women] |
| **market** | **kotlin.String**| Storefront: uk, us, au, de, fr, it, es, nl, se, dk, pl | [optional] [default to &quot;uk&quot;] |
| **store** | **kotlin.String**| Override store, e.g. COM or US | [optional] |
| **country** | **kotlin.String**| ISO country override | [optional] |
| **currency** | **kotlin.String**| Currency override | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **language** | **kotlin.String**| Locale override, e.g. en-GB | [optional] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="asosListMarkets"></a>
# **asosListMarkets**
> kotlin.Any asosListMarkets()

List markets

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = ASOSApi()
try {
    val result : kotlin.Any = apiInstance.asosListMarkets()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ASOSApi#asosListMarkets")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ASOSApi#asosListMarkets")
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

<a id="asosListSearchFilters"></a>
# **asosListSearchFilters**
> kotlin.Any asosListSearchFilters(query, categoryId, market, store, country, currency, language)

List search filters

Facet ids, labels, option counts and selections for a query or category.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = ASOSApi()
val query : kotlin.String = query_example // kotlin.String | 
val categoryId : kotlin.Int = 56 // kotlin.Int | 
val market : kotlin.String = market_example // kotlin.String | Storefront: uk, us, au, de, fr, it, es, nl, se, dk, pl
val store : kotlin.String = store_example // kotlin.String | Override store, e.g. COM or US
val country : kotlin.String = country_example // kotlin.String | ISO country override
val currency : kotlin.String = currency_example // kotlin.String | Currency override
val language : kotlin.String = language_example // kotlin.String | Locale override, e.g. en-GB
try {
    val result : kotlin.Any = apiInstance.asosListSearchFilters(query, categoryId, market, store, country, currency, language)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ASOSApi#asosListSearchFilters")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ASOSApi#asosListSearchFilters")
    e.printStackTrace()
}
```

### Parameters
| **query** | **kotlin.String**|  | [optional] |
| **categoryId** | **kotlin.Int**|  | [optional] |
| **market** | **kotlin.String**| Storefront: uk, us, au, de, fr, it, es, nl, se, dk, pl | [optional] [default to &quot;uk&quot;] |
| **store** | **kotlin.String**| Override store, e.g. COM or US | [optional] |
| **country** | **kotlin.String**| ISO country override | [optional] |
| **currency** | **kotlin.String**| Currency override | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **language** | **kotlin.String**| Locale override, e.g. en-GB | [optional] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="asosSearchProducts"></a>
# **asosSearchProducts**
> PortalApiRoutersV1AsosSearchResponse asosSearchProducts(query, categoryId, offset, limit, sort, brand, colour, size, minPrice, maxPrice, market, store, country, currency, language)

Search products

Search by query, category_id, or both. Includes price, images and filter facets.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = ASOSApi()
val query : kotlin.String = query_example // kotlin.String | Keyword, e.g. shoes
val categoryId : kotlin.Int = 56 // kotlin.Int | Category id from navigation
val offset : kotlin.Int = 56 // kotlin.Int | 
val limit : kotlin.Int = 56 // kotlin.Int | 
val sort : kotlin.String = sort_example // kotlin.String | 
val brand : kotlin.String = brand_example // kotlin.String | Comma-separated brand facet ids
val colour : kotlin.String = colour_example // kotlin.String | Comma-separated colour facet ids
val size : kotlin.String = size_example // kotlin.String | Comma-separated size facet ids
val minPrice : java.math.BigDecimal = 8.14 // java.math.BigDecimal | 
val maxPrice : java.math.BigDecimal = 8.14 // java.math.BigDecimal | 
val market : kotlin.String = market_example // kotlin.String | Storefront: uk, us, au, de, fr, it, es, nl, se, dk, pl
val store : kotlin.String = store_example // kotlin.String | Override store, e.g. COM or US
val country : kotlin.String = country_example // kotlin.String | ISO country override
val currency : kotlin.String = currency_example // kotlin.String | Currency override
val language : kotlin.String = language_example // kotlin.String | Locale override, e.g. en-GB
try {
    val result : PortalApiRoutersV1AsosSearchResponse = apiInstance.asosSearchProducts(query, categoryId, offset, limit, sort, brand, colour, size, minPrice, maxPrice, market, store, country, currency, language)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ASOSApi#asosSearchProducts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ASOSApi#asosSearchProducts")
    e.printStackTrace()
}
```

### Parameters
| **query** | **kotlin.String**| Keyword, e.g. shoes | [optional] |
| **categoryId** | **kotlin.Int**| Category id from navigation | [optional] |
| **offset** | **kotlin.Int**|  | [optional] [default to 0] |
| **limit** | **kotlin.Int**|  | [optional] [default to 48] |
| **sort** | **kotlin.String**|  | [optional] [default to recommended] [enum: recommended, freshness, priceasc, pricedesc] |
| **brand** | **kotlin.String**| Comma-separated brand facet ids | [optional] |
| **colour** | **kotlin.String**| Comma-separated colour facet ids | [optional] |
| **size** | **kotlin.String**| Comma-separated size facet ids | [optional] |
| **minPrice** | **java.math.BigDecimal**|  | [optional] |
| **maxPrice** | **java.math.BigDecimal**|  | [optional] |
| **market** | **kotlin.String**| Storefront: uk, us, au, de, fr, it, es, nl, se, dk, pl | [optional] [default to &quot;uk&quot;] |
| **store** | **kotlin.String**| Override store, e.g. COM or US | [optional] |
| **country** | **kotlin.String**| ISO country override | [optional] |
| **currency** | **kotlin.String**| Currency override | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **language** | **kotlin.String**| Locale override, e.g. en-GB | [optional] |

### Return type

[**PortalApiRoutersV1AsosSearchResponse**](PortalApiRoutersV1AsosSearchResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="asosSearchSuggestions"></a>
# **asosSearchSuggestions**
> kotlin.Any asosSearchSuggestions(query, market, store, country, currency, language)

Search suggestions

Search suggestions with result counts.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = ASOSApi()
val query : kotlin.String = query_example // kotlin.String | 
val market : kotlin.String = market_example // kotlin.String | Storefront: uk, us, au, de, fr, it, es, nl, se, dk, pl
val store : kotlin.String = store_example // kotlin.String | Override store, e.g. COM or US
val country : kotlin.String = country_example // kotlin.String | ISO country override
val currency : kotlin.String = currency_example // kotlin.String | Currency override
val language : kotlin.String = language_example // kotlin.String | Locale override, e.g. en-GB
try {
    val result : kotlin.Any = apiInstance.asosSearchSuggestions(query, market, store, country, currency, language)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ASOSApi#asosSearchSuggestions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ASOSApi#asosSearchSuggestions")
    e.printStackTrace()
}
```

### Parameters
| **query** | **kotlin.String**|  | |
| **market** | **kotlin.String**| Storefront: uk, us, au, de, fr, it, es, nl, se, dk, pl | [optional] [default to &quot;uk&quot;] |
| **store** | **kotlin.String**| Override store, e.g. COM or US | [optional] |
| **country** | **kotlin.String**| ISO country override | [optional] |
| **currency** | **kotlin.String**| Currency override | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **language** | **kotlin.String**| Locale override, e.g. en-GB | [optional] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

