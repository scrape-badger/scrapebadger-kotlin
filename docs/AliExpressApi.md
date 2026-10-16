# AliExpressApi

All URIs are relative to *https://scrapebadger.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**aliexpressGetCategoryNavigation**](AliExpressApi.md#aliexpressGetCategoryNavigation) | **GET** /v1/aliexpress/categories | Get category navigation |
| [**aliexpressGetProductDetail**](AliExpressApi.md#aliexpressGetProductDetail) | **GET** /v1/aliexpress/products/{product_id} | Get product detail |
| [**aliexpressGetProductReviews**](AliExpressApi.md#aliexpressGetProductReviews) | **GET** /v1/aliexpress/products/{product_id}/reviews | Get product reviews |
| [**aliexpressGetSearchSuggestions**](AliExpressApi.md#aliexpressGetSearchSuggestions) | **GET** /v1/aliexpress/autocomplete | Get search suggestions |
| [**aliexpressGetStoreProductCategories**](AliExpressApi.md#aliexpressGetStoreProductCategories) | **GET** /v1/aliexpress/stores/{store_id}/categories | Get store product categories |
| [**aliexpressGetStoreProducts**](AliExpressApi.md#aliexpressGetStoreProducts) | **GET** /v1/aliexpress/stores/{store_id}/products | Get store products |
| [**aliexpressGetStoreProfile**](AliExpressApi.md#aliexpressGetStoreProfile) | **GET** /v1/aliexpress/stores/{store_id} | Get store profile |
| [**aliexpressSearchProducts**](AliExpressApi.md#aliexpressSearchProducts) | **GET** /v1/aliexpress/search | Search products |


<a id="aliexpressGetCategoryNavigation"></a>
# **aliexpressGetCategoryNavigation**
> kotlin.Any aliexpressGetCategoryNavigation()

Get category navigation

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = AliExpressApi()
try {
    val result : kotlin.Any = apiInstance.aliexpressGetCategoryNavigation()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AliExpressApi#aliexpressGetCategoryNavigation")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AliExpressApi#aliexpressGetCategoryNavigation")
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

<a id="aliexpressGetProductDetail"></a>
# **aliexpressGetProductDetail**
> kotlin.Any aliexpressGetProductDetail(productId, country, currency, language)

Get product detail

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = AliExpressApi()
val productId : kotlin.String = productId_example // kotlin.String | 
val country : kotlin.String = country_example // kotlin.String | 
val currency : kotlin.String = currency_example // kotlin.String | 
val language : kotlin.String = language_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.aliexpressGetProductDetail(productId, country, currency, language)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AliExpressApi#aliexpressGetProductDetail")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AliExpressApi#aliexpressGetProductDetail")
    e.printStackTrace()
}
```

### Parameters
| **productId** | **kotlin.String**|  | |
| **country** | **kotlin.String**|  | [optional] [default to &quot;US&quot;] |
| **currency** | **kotlin.String**|  | [optional] [default to &quot;USD&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **language** | **kotlin.String**|  | [optional] [default to &quot;en_US&quot;] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="aliexpressGetProductReviews"></a>
# **aliexpressGetProductReviews**
> kotlin.Any aliexpressGetProductReviews(productId, page, pageSize, sort)

Get product reviews

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = AliExpressApi()
val productId : kotlin.String = productId_example // kotlin.String | 
val page : kotlin.Int = 56 // kotlin.Int | 
val pageSize : kotlin.Int = 56 // kotlin.Int | 
val sort : kotlin.String = sort_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.aliexpressGetProductReviews(productId, page, pageSize, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AliExpressApi#aliexpressGetProductReviews")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AliExpressApi#aliexpressGetProductReviews")
    e.printStackTrace()
}
```

### Parameters
| **productId** | **kotlin.String**|  | |
| **page** | **kotlin.Int**|  | [optional] [default to 1] |
| **pageSize** | **kotlin.Int**|  | [optional] [default to 10] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sort** | **kotlin.String**|  | [optional] [default to complex_default] [enum: complex_default, latest_sort] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="aliexpressGetSearchSuggestions"></a>
# **aliexpressGetSearchSuggestions**
> kotlin.Any aliexpressGetSearchSuggestions(query, country, language)

Get search suggestions

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = AliExpressApi()
val query : kotlin.String = query_example // kotlin.String | 
val country : kotlin.String = country_example // kotlin.String | 
val language : kotlin.String = language_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.aliexpressGetSearchSuggestions(query, country, language)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AliExpressApi#aliexpressGetSearchSuggestions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AliExpressApi#aliexpressGetSearchSuggestions")
    e.printStackTrace()
}
```

### Parameters
| **query** | **kotlin.String**|  | |
| **country** | **kotlin.String**|  | [optional] [default to &quot;US&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **language** | **kotlin.String**|  | [optional] [default to &quot;en&quot;] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="aliexpressGetStoreProductCategories"></a>
# **aliexpressGetStoreProductCategories**
> kotlin.Any aliexpressGetStoreProductCategories(storeId, country)

Get store product categories

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = AliExpressApi()
val storeId : kotlin.String = storeId_example // kotlin.String | 
val country : kotlin.String = country_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.aliexpressGetStoreProductCategories(storeId, country)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AliExpressApi#aliexpressGetStoreProductCategories")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AliExpressApi#aliexpressGetStoreProductCategories")
    e.printStackTrace()
}
```

### Parameters
| **storeId** | **kotlin.String**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **country** | **kotlin.String**|  | [optional] [default to &quot;US&quot;] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="aliexpressGetStoreProducts"></a>
# **aliexpressGetStoreProducts**
> kotlin.Any aliexpressGetStoreProducts(storeId, page, pageSize, country, currency, language, query, sort)

Get store products

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = AliExpressApi()
val storeId : kotlin.String = storeId_example // kotlin.String | 
val page : kotlin.Int = 56 // kotlin.Int | 
val pageSize : kotlin.Int = 56 // kotlin.Int | 
val country : kotlin.String = country_example // kotlin.String | 
val currency : kotlin.String = currency_example // kotlin.String | 
val language : kotlin.String = language_example // kotlin.String | 
val query : kotlin.String = query_example // kotlin.String | 
val sort : kotlin.String = sort_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.aliexpressGetStoreProducts(storeId, page, pageSize, country, currency, language, query, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AliExpressApi#aliexpressGetStoreProducts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AliExpressApi#aliexpressGetStoreProducts")
    e.printStackTrace()
}
```

### Parameters
| **storeId** | **kotlin.String**|  | |
| **page** | **kotlin.Int**|  | [optional] [default to 1] |
| **pageSize** | **kotlin.Int**|  | [optional] [default to 24] |
| **country** | **kotlin.String**|  | [optional] [default to &quot;US&quot;] |
| **currency** | **kotlin.String**|  | [optional] [default to &quot;USD&quot;] |
| **language** | **kotlin.String**|  | [optional] [default to &quot;en&quot;] |
| **query** | **kotlin.String**|  | [optional] [default to &quot;&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sort** | **kotlin.String**|  | [optional] [default to bestmatch_sort] [enum: bestmatch_sort, price_asc, price_desc, orders_desc] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="aliexpressGetStoreProfile"></a>
# **aliexpressGetStoreProfile**
> kotlin.Any aliexpressGetStoreProfile(storeId, country, currency, language)

Get store profile

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = AliExpressApi()
val storeId : kotlin.String = storeId_example // kotlin.String | 
val country : kotlin.String = country_example // kotlin.String | 
val currency : kotlin.String = currency_example // kotlin.String | 
val language : kotlin.String = language_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.aliexpressGetStoreProfile(storeId, country, currency, language)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AliExpressApi#aliexpressGetStoreProfile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AliExpressApi#aliexpressGetStoreProfile")
    e.printStackTrace()
}
```

### Parameters
| **storeId** | **kotlin.String**|  | |
| **country** | **kotlin.String**|  | [optional] [default to &quot;US&quot;] |
| **currency** | **kotlin.String**|  | [optional] [default to &quot;USD&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **language** | **kotlin.String**|  | [optional] [default to &quot;en&quot;] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="aliexpressSearchProducts"></a>
# **aliexpressSearchProducts**
> kotlin.Any aliexpressSearchProducts(query, page, country, currency, language, sort, minPrice, maxPrice)

Search products

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = AliExpressApi()
val query : kotlin.String = query_example // kotlin.String | 
val page : kotlin.Int = 56 // kotlin.Int | 
val country : kotlin.String = country_example // kotlin.String | 
val currency : kotlin.String = currency_example // kotlin.String | 
val language : kotlin.String = language_example // kotlin.String | 
val sort : kotlin.String = sort_example // kotlin.String | 
val minPrice : java.math.BigDecimal = 8.14 // java.math.BigDecimal | 
val maxPrice : java.math.BigDecimal = 8.14 // java.math.BigDecimal | 
try {
    val result : kotlin.Any = apiInstance.aliexpressSearchProducts(query, page, country, currency, language, sort, minPrice, maxPrice)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AliExpressApi#aliexpressSearchProducts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AliExpressApi#aliexpressSearchProducts")
    e.printStackTrace()
}
```

### Parameters
| **query** | **kotlin.String**|  | |
| **page** | **kotlin.Int**|  | [optional] [default to 1] |
| **country** | **kotlin.String**|  | [optional] [default to &quot;US&quot;] |
| **currency** | **kotlin.String**|  | [optional] [default to &quot;USD&quot;] |
| **language** | **kotlin.String**|  | [optional] [default to &quot;en&quot;] |
| **sort** | **kotlin.String**|  | [optional] [default to default] [enum: default, price_asc, price_desc, total_tranpro_desc] |
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

