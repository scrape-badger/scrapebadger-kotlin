# DepopApi

All URIs are relative to *https://scrapebadger.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**depopDepopScraperHealthCheck**](DepopApi.md#depopDepopScraperHealthCheck) | **GET** /v1/depop/health | Depop scraper health check |
| [**depopDepopScraperHealthCheckHead**](DepopApi.md#depopDepopScraperHealthCheckHead) | **HEAD** /v1/depop/health | Depop scraper health check |
| [**depopGetAUserSProducts**](DepopApi.md#depopGetAUserSProducts) | **GET** /v1/depop/users/{username}/products | Get a user&#39;s products |
| [**depopGetProductDetail**](DepopApi.md#depopGetProductDetail) | **GET** /v1/depop/products/{product_id} | Get product detail |
| [**depopGetShopUserProfile**](DepopApi.md#depopGetShopUserProfile) | **GET** /v1/depop/users/{username} | Get shop/user profile |
| [**depopListMarkets**](DepopApi.md#depopListMarkets) | **GET** /v1/depop/markets | List markets |
| [**depopSearchDepopProducts**](DepopApi.md#depopSearchDepopProducts) | **GET** /v1/depop/search | Search Depop products |


<a id="depopDepopScraperHealthCheck"></a>
# **depopDepopScraperHealthCheck**
> kotlin.Any depopDepopScraperHealthCheck()

Depop scraper health check

Check health of the Depop scraper service (accepts HEAD).

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = DepopApi()
try {
    val result : kotlin.Any = apiInstance.depopDepopScraperHealthCheck()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DepopApi#depopDepopScraperHealthCheck")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DepopApi#depopDepopScraperHealthCheck")
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

<a id="depopDepopScraperHealthCheckHead"></a>
# **depopDepopScraperHealthCheckHead**
> kotlin.Any depopDepopScraperHealthCheckHead()

Depop scraper health check

Check health of the Depop scraper service (accepts HEAD).

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = DepopApi()
try {
    val result : kotlin.Any = apiInstance.depopDepopScraperHealthCheckHead()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DepopApi#depopDepopScraperHealthCheckHead")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DepopApi#depopDepopScraperHealthCheckHead")
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

<a id="depopGetAUserSProducts"></a>
# **depopGetAUserSProducts**
> kotlin.Any depopGetAUserSProducts(username, market, perPage, cursor)

Get a user&#39;s products

A user&#39;s active listings (cursor-paginated).

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = DepopApi()
val username : kotlin.String = username_example // kotlin.String | 
val market : kotlin.String = market_example // kotlin.String | Market code
val perPage : kotlin.Int = 56 // kotlin.Int | 
val cursor : kotlin.String = cursor_example // kotlin.String | Pagination cursor
try {
    val result : kotlin.Any = apiInstance.depopGetAUserSProducts(username, market, perPage, cursor)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DepopApi#depopGetAUserSProducts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DepopApi#depopGetAUserSProducts")
    e.printStackTrace()
}
```

### Parameters
| **username** | **kotlin.String**|  | |
| **market** | **kotlin.String**| Market code | [optional] [default to &quot;us&quot;] |
| **perPage** | **kotlin.Int**|  | [optional] [default to 24] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **cursor** | **kotlin.String**| Pagination cursor | [optional] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="depopGetProductDetail"></a>
# **depopGetProductDetail**
> kotlin.Any depopGetProductDetail(productId, market)

Get product detail

Full detail for a single product (by numeric id or slug).

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = DepopApi()
val productId : kotlin.String = productId_example // kotlin.String | 
val market : kotlin.String = market_example // kotlin.String | Market code
try {
    val result : kotlin.Any = apiInstance.depopGetProductDetail(productId, market)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DepopApi#depopGetProductDetail")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DepopApi#depopGetProductDetail")
    e.printStackTrace()
}
```

### Parameters
| **productId** | **kotlin.String**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **market** | **kotlin.String**| Market code | [optional] [default to &quot;us&quot;] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="depopGetShopUserProfile"></a>
# **depopGetShopUserProfile**
> kotlin.Any depopGetShopUserProfile(username, market)

Get shop/user profile

Public shop/user profile by username.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = DepopApi()
val username : kotlin.String = username_example // kotlin.String | 
val market : kotlin.String = market_example // kotlin.String | Market code
try {
    val result : kotlin.Any = apiInstance.depopGetShopUserProfile(username, market)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DepopApi#depopGetShopUserProfile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DepopApi#depopGetShopUserProfile")
    e.printStackTrace()
}
```

### Parameters
| **username** | **kotlin.String**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **market** | **kotlin.String**| Market code | [optional] [default to &quot;us&quot;] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="depopListMarkets"></a>
# **depopListMarkets**
> kotlin.Any depopListMarkets()

List markets

List supported Depop markets (country + currency).

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = DepopApi()
try {
    val result : kotlin.Any = apiInstance.depopListMarkets()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DepopApi#depopListMarkets")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DepopApi#depopListMarkets")
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

<a id="depopSearchDepopProducts"></a>
# **depopSearchDepopProducts**
> kotlin.Any depopSearchDepopProducts(query, market, perPage, cursor, priceMin, priceMax, brands, categories, sizes, conditions, gender, sort)

Search Depop products

Search the Depop catalog with filters (cursor-paginated).

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = DepopApi()
val query : kotlin.String = query_example // kotlin.String | Search text, e.g. 'nike vintage'
val market : kotlin.String = market_example // kotlin.String | Market code (us, gb, au, it, fr, ...)
val perPage : kotlin.Int = 56 // kotlin.Int | Results per page
val cursor : kotlin.String = cursor_example // kotlin.String | Pagination cursor (from previous page)
val priceMin : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Minimum price
val priceMax : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Maximum price
val brands : kotlin.String = brands_example // kotlin.String | Comma-separated brand IDs
val categories : kotlin.String = categories_example // kotlin.String | Comma-separated category IDs
val sizes : kotlin.String = sizes_example // kotlin.String | Comma-separated size IDs
val conditions : kotlin.String = conditions_example // kotlin.String | Comma-separated condition slugs (brand_new, used_excellent, ...)
val gender : kotlin.String = gender_example // kotlin.String | male | female
val sort : kotlin.String = sort_example // kotlin.String | relevance | newlyListed | priceAscending | priceDescending
try {
    val result : kotlin.Any = apiInstance.depopSearchDepopProducts(query, market, perPage, cursor, priceMin, priceMax, brands, categories, sizes, conditions, gender, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DepopApi#depopSearchDepopProducts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DepopApi#depopSearchDepopProducts")
    e.printStackTrace()
}
```

### Parameters
| **query** | **kotlin.String**| Search text, e.g. &#39;nike vintage&#39; | |
| **market** | **kotlin.String**| Market code (us, gb, au, it, fr, ...) | [optional] [default to &quot;us&quot;] |
| **perPage** | **kotlin.Int**| Results per page | [optional] [default to 24] |
| **cursor** | **kotlin.String**| Pagination cursor (from previous page) | [optional] |
| **priceMin** | **java.math.BigDecimal**| Minimum price | [optional] |
| **priceMax** | **java.math.BigDecimal**| Maximum price | [optional] |
| **brands** | **kotlin.String**| Comma-separated brand IDs | [optional] |
| **categories** | **kotlin.String**| Comma-separated category IDs | [optional] |
| **sizes** | **kotlin.String**| Comma-separated size IDs | [optional] |
| **conditions** | **kotlin.String**| Comma-separated condition slugs (brand_new, used_excellent, ...) | [optional] |
| **gender** | **kotlin.String**| male | female | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sort** | **kotlin.String**| relevance | newlyListed | priceAscending | priceDescending | [optional] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

