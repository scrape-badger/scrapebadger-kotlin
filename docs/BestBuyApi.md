# BestBuyApi

All URIs are relative to *https://scrapebadger.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**bestbuyBrowseACategory**](BestBuyApi.md#bestbuyBrowseACategory) | **GET** /v1/bestbuy/category | Browse a category |
| [**bestbuyGetCategories**](BestBuyApi.md#bestbuyGetCategories) | **GET** /v1/bestbuy/categories | Get categories |
| [**bestbuyGetLaptopAndComputerDeals**](BestBuyApi.md#bestbuyGetLaptopAndComputerDeals) | **GET** /v1/bestbuy/deals | Get laptop and computer deals |
| [**bestbuyGetProductAvailability**](BestBuyApi.md#bestbuyGetProductAvailability) | **GET** /v1/bestbuy/products/{sku}/availability | Get product availability |
| [**bestbuyGetProductDetail**](BestBuyApi.md#bestbuyGetProductDetail) | **GET** /v1/bestbuy/products/{sku} | Get product detail |
| [**bestbuyGetProductQuestions**](BestBuyApi.md#bestbuyGetProductQuestions) | **GET** /v1/bestbuy/products/{sku}/questions | Get product questions |
| [**bestbuyGetProductReviews**](BestBuyApi.md#bestbuyGetProductReviews) | **GET** /v1/bestbuy/products/{sku}/reviews | Get product reviews |
| [**bestbuyGetSearchSuggestions**](BestBuyApi.md#bestbuyGetSearchSuggestions) | **GET** /v1/bestbuy/autocomplete | Get search suggestions |
| [**bestbuyListSupportedMarkets**](BestBuyApi.md#bestbuyListSupportedMarkets) | **GET** /v1/bestbuy/markets | List supported markets |
| [**bestbuySearchProducts**](BestBuyApi.md#bestbuySearchProducts) | **GET** /v1/bestbuy/search | Search products |


<a id="bestbuyBrowseACategory"></a>
# **bestbuyBrowseACategory**
> kotlin.Any bestbuyBrowseACategory(categoryId, page)

Browse a category

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = BestBuyApi()
val categoryId : kotlin.String = categoryId_example // kotlin.String | 
val page : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.Any = apiInstance.bestbuyBrowseACategory(categoryId, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BestBuyApi#bestbuyBrowseACategory")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BestBuyApi#bestbuyBrowseACategory")
    e.printStackTrace()
}
```

### Parameters
| **categoryId** | **kotlin.String**|  | |
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

<a id="bestbuyGetCategories"></a>
# **bestbuyGetCategories**
> kotlin.Any bestbuyGetCategories(query)

Get categories

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = BestBuyApi()
val query : kotlin.String = query_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.bestbuyGetCategories(query)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BestBuyApi#bestbuyGetCategories")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BestBuyApi#bestbuyGetCategories")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **query** | **kotlin.String**|  | [optional] [default to &quot;laptop&quot;] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="bestbuyGetLaptopAndComputerDeals"></a>
# **bestbuyGetLaptopAndComputerDeals**
> kotlin.Any bestbuyGetLaptopAndComputerDeals(page)

Get laptop and computer deals

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = BestBuyApi()
val page : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.Any = apiInstance.bestbuyGetLaptopAndComputerDeals(page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BestBuyApi#bestbuyGetLaptopAndComputerDeals")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BestBuyApi#bestbuyGetLaptopAndComputerDeals")
    e.printStackTrace()
}
```

### Parameters
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

<a id="bestbuyGetProductAvailability"></a>
# **bestbuyGetProductAvailability**
> kotlin.Any bestbuyGetProductAvailability(sku, zipCode, storeId)

Get product availability

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = BestBuyApi()
val sku : kotlin.String = sku_example // kotlin.String | 
val zipCode : kotlin.String = zipCode_example // kotlin.String | 
val storeId : kotlin.String = storeId_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.bestbuyGetProductAvailability(sku, zipCode, storeId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BestBuyApi#bestbuyGetProductAvailability")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BestBuyApi#bestbuyGetProductAvailability")
    e.printStackTrace()
}
```

### Parameters
| **sku** | **kotlin.String**|  | |
| **zipCode** | **kotlin.String**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **storeId** | **kotlin.String**|  | [optional] [default to &quot;7&quot;] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="bestbuyGetProductDetail"></a>
# **bestbuyGetProductDetail**
> kotlin.Any bestbuyGetProductDetail(sku)

Get product detail

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = BestBuyApi()
val sku : kotlin.String = sku_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.bestbuyGetProductDetail(sku)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BestBuyApi#bestbuyGetProductDetail")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BestBuyApi#bestbuyGetProductDetail")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sku** | **kotlin.String**|  | |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="bestbuyGetProductQuestions"></a>
# **bestbuyGetProductQuestions**
> kotlin.Any bestbuyGetProductQuestions(sku, page, pageSize, query)

Get product questions

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = BestBuyApi()
val sku : kotlin.String = sku_example // kotlin.String | 
val page : kotlin.Int = 56 // kotlin.Int | 
val pageSize : kotlin.Int = 56 // kotlin.Int | 
val query : kotlin.String = query_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.bestbuyGetProductQuestions(sku, page, pageSize, query)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BestBuyApi#bestbuyGetProductQuestions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BestBuyApi#bestbuyGetProductQuestions")
    e.printStackTrace()
}
```

### Parameters
| **sku** | **kotlin.String**|  | |
| **page** | **kotlin.Int**|  | [optional] [default to 1] |
| **pageSize** | **kotlin.Int**|  | [optional] [default to 10] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **query** | **kotlin.String**|  | [optional] [default to &quot;&quot;] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="bestbuyGetProductReviews"></a>
# **bestbuyGetProductReviews**
> kotlin.Any bestbuyGetProductReviews(sku, page, pageSize, sort)

Get product reviews

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = BestBuyApi()
val sku : kotlin.String = sku_example // kotlin.String | 
val page : kotlin.Int = 56 // kotlin.Int | 
val pageSize : kotlin.Int = 56 // kotlin.Int | 
val sort : kotlin.String = sort_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.bestbuyGetProductReviews(sku, page, pageSize, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BestBuyApi#bestbuyGetProductReviews")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BestBuyApi#bestbuyGetProductReviews")
    e.printStackTrace()
}
```

### Parameters
| **sku** | **kotlin.String**|  | |
| **page** | **kotlin.Int**|  | [optional] [default to 1] |
| **pageSize** | **kotlin.Int**|  | [optional] [default to 10] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sort** | **kotlin.String**|  | [optional] [default to MOST_RECENT] [enum: MOST_RECENT, BEST_REVIEW, MOST_HELPFUL, OLDEST, HIGHEST_RATING, LOWEST_RATING] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="bestbuyGetSearchSuggestions"></a>
# **bestbuyGetSearchSuggestions**
> kotlin.Any bestbuyGetSearchSuggestions(query)

Get search suggestions

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = BestBuyApi()
val query : kotlin.String = query_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.bestbuyGetSearchSuggestions(query)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BestBuyApi#bestbuyGetSearchSuggestions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BestBuyApi#bestbuyGetSearchSuggestions")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **query** | **kotlin.String**|  | |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="bestbuyListSupportedMarkets"></a>
# **bestbuyListSupportedMarkets**
> kotlin.Any bestbuyListSupportedMarkets()

List supported markets

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = BestBuyApi()
try {
    val result : kotlin.Any = apiInstance.bestbuyListSupportedMarkets()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BestBuyApi#bestbuyListSupportedMarkets")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BestBuyApi#bestbuyListSupportedMarkets")
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

<a id="bestbuySearchProducts"></a>
# **bestbuySearchProducts**
> kotlin.Any bestbuySearchProducts(query, page, sort)

Search products

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = BestBuyApi()
val query : kotlin.String = query_example // kotlin.String | 
val page : kotlin.Int = 56 // kotlin.Int | 
val sort : kotlin.String = sort_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.bestbuySearchProducts(query, page, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BestBuyApi#bestbuySearchProducts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BestBuyApi#bestbuySearchProducts")
    e.printStackTrace()
}
```

### Parameters
| **query** | **kotlin.String**|  | |
| **page** | **kotlin.Int**|  | [optional] [default to 1] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sort** | **kotlin.String**|  | [optional] [default to best_match] [enum: best_match, best_selling, price_low, price_high, rating, newest] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

