# TargetApi

All URIs are relative to *https://scrapebadger.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**targetBrowseACategory**](TargetApi.md#targetBrowseACategory) | **GET** /v1/target/category | Browse a category |
| [**targetFindNearbyStores**](TargetApi.md#targetFindNearbyStores) | **GET** /v1/target/stores | Find nearby stores |
| [**targetGetCategories**](TargetApi.md#targetGetCategories) | **GET** /v1/target/categories | Get categories |
| [**targetGetProductAvailability**](TargetApi.md#targetGetProductAvailability) | **GET** /v1/target/products/{tcin}/availability | Get product availability |
| [**targetGetProductDetail**](TargetApi.md#targetGetProductDetail) | **GET** /v1/target/products/{tcin} | Get product detail |
| [**targetGetProductQuestions**](TargetApi.md#targetGetProductQuestions) | **GET** /v1/target/products/{tcin}/questions | Get product questions |
| [**targetGetProductReviews**](TargetApi.md#targetGetProductReviews) | **GET** /v1/target/products/{tcin}/reviews | Get product reviews |
| [**targetGetSearchSuggestions**](TargetApi.md#targetGetSearchSuggestions) | **GET** /v1/target/autocomplete | Get search suggestions |
| [**targetGetStoreDetail**](TargetApi.md#targetGetStoreDetail) | **GET** /v1/target/stores/{store_id} | Get store detail |
| [**targetListSupportedMarkets**](TargetApi.md#targetListSupportedMarkets) | **GET** /v1/target/markets | List supported markets |
| [**targetSearchProducts**](TargetApi.md#targetSearchProducts) | **GET** /v1/target/search | Search products |


<a id="targetBrowseACategory"></a>
# **targetBrowseACategory**
> kotlin.Any targetBrowseACategory(categoryId, page, pageSize, storeId, zipCode)

Browse a category

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = TargetApi()
val categoryId : kotlin.String = categoryId_example // kotlin.String | 
val page : kotlin.Int = 56 // kotlin.Int | 
val pageSize : kotlin.Int = 56 // kotlin.Int | 
val storeId : kotlin.String = storeId_example // kotlin.String | 
val zipCode : kotlin.String = zipCode_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.targetBrowseACategory(categoryId, page, pageSize, storeId, zipCode)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TargetApi#targetBrowseACategory")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TargetApi#targetBrowseACategory")
    e.printStackTrace()
}
```

### Parameters
| **categoryId** | **kotlin.String**|  | |
| **page** | **kotlin.Int**|  | [optional] [default to 1] |
| **pageSize** | **kotlin.Int**|  | [optional] [default to 24] |
| **storeId** | **kotlin.String**|  | [optional] [default to &quot;1375&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **zipCode** | **kotlin.String**|  | [optional] [default to &quot;55403&quot;] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="targetFindNearbyStores"></a>
# **targetFindNearbyStores**
> kotlin.Any targetFindNearbyStores(zipCode, limit)

Find nearby stores

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = TargetApi()
val zipCode : kotlin.String = zipCode_example // kotlin.String | 
val limit : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.Any = apiInstance.targetFindNearbyStores(zipCode, limit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TargetApi#targetFindNearbyStores")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TargetApi#targetFindNearbyStores")
    e.printStackTrace()
}
```

### Parameters
| **zipCode** | **kotlin.String**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **limit** | **kotlin.Int**|  | [optional] [default to 10] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="targetGetCategories"></a>
# **targetGetCategories**
> kotlin.Any targetGetCategories(categoryId)

Get categories

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = TargetApi()
val categoryId : kotlin.String = categoryId_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.targetGetCategories(categoryId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TargetApi#targetGetCategories")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TargetApi#targetGetCategories")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **categoryId** | **kotlin.String**|  | [optional] [default to &quot;5xtly&quot;] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="targetGetProductAvailability"></a>
# **targetGetProductAvailability**
> kotlin.Any targetGetProductAvailability(tcin, zipCode, limit)

Get product availability

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = TargetApi()
val tcin : kotlin.String = tcin_example // kotlin.String | 
val zipCode : kotlin.String = zipCode_example // kotlin.String | 
val limit : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.Any = apiInstance.targetGetProductAvailability(tcin, zipCode, limit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TargetApi#targetGetProductAvailability")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TargetApi#targetGetProductAvailability")
    e.printStackTrace()
}
```

### Parameters
| **tcin** | **kotlin.String**|  | |
| **zipCode** | **kotlin.String**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **limit** | **kotlin.Int**|  | [optional] [default to 10] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="targetGetProductDetail"></a>
# **targetGetProductDetail**
> kotlin.Any targetGetProductDetail(tcin, storeId, zipCode)

Get product detail

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = TargetApi()
val tcin : kotlin.String = tcin_example // kotlin.String | 
val storeId : kotlin.String = storeId_example // kotlin.String | 
val zipCode : kotlin.String = zipCode_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.targetGetProductDetail(tcin, storeId, zipCode)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TargetApi#targetGetProductDetail")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TargetApi#targetGetProductDetail")
    e.printStackTrace()
}
```

### Parameters
| **tcin** | **kotlin.String**|  | |
| **storeId** | **kotlin.String**|  | [optional] [default to &quot;1375&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **zipCode** | **kotlin.String**|  | [optional] [default to &quot;55403&quot;] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="targetGetProductQuestions"></a>
# **targetGetProductQuestions**
> kotlin.Any targetGetProductQuestions(tcin, page, pageSize)

Get product questions

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = TargetApi()
val tcin : kotlin.String = tcin_example // kotlin.String | 
val page : kotlin.Int = 56 // kotlin.Int | 
val pageSize : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.Any = apiInstance.targetGetProductQuestions(tcin, page, pageSize)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TargetApi#targetGetProductQuestions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TargetApi#targetGetProductQuestions")
    e.printStackTrace()
}
```

### Parameters
| **tcin** | **kotlin.String**|  | |
| **page** | **kotlin.Int**|  | [optional] [default to 1] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageSize** | **kotlin.Int**|  | [optional] [default to 10] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="targetGetProductReviews"></a>
# **targetGetProductReviews**
> kotlin.Any targetGetProductReviews(tcin, page, pageSize, sort)

Get product reviews

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = TargetApi()
val tcin : kotlin.String = tcin_example // kotlin.String | 
val page : kotlin.Int = 56 // kotlin.Int | 
val pageSize : kotlin.Int = 56 // kotlin.Int | 
val sort : kotlin.String = sort_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.targetGetProductReviews(tcin, page, pageSize, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TargetApi#targetGetProductReviews")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TargetApi#targetGetProductReviews")
    e.printStackTrace()
}
```

### Parameters
| **tcin** | **kotlin.String**|  | |
| **page** | **kotlin.Int**|  | [optional] [default to 1] |
| **pageSize** | **kotlin.Int**|  | [optional] [default to 10] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sort** | **kotlin.String**|  | [optional] [default to most_recent] [enum: most_recent, most_helpful, highest_rated, lowest_rated] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="targetGetSearchSuggestions"></a>
# **targetGetSearchSuggestions**
> kotlin.Any targetGetSearchSuggestions(query)

Get search suggestions

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = TargetApi()
val query : kotlin.String = query_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.targetGetSearchSuggestions(query)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TargetApi#targetGetSearchSuggestions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TargetApi#targetGetSearchSuggestions")
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

<a id="targetGetStoreDetail"></a>
# **targetGetStoreDetail**
> kotlin.Any targetGetStoreDetail(storeId)

Get store detail

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = TargetApi()
val storeId : kotlin.String = storeId_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.targetGetStoreDetail(storeId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TargetApi#targetGetStoreDetail")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TargetApi#targetGetStoreDetail")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **storeId** | **kotlin.String**|  | |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="targetListSupportedMarkets"></a>
# **targetListSupportedMarkets**
> kotlin.Any targetListSupportedMarkets()

List supported markets

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = TargetApi()
try {
    val result : kotlin.Any = apiInstance.targetListSupportedMarkets()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TargetApi#targetListSupportedMarkets")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TargetApi#targetListSupportedMarkets")
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

<a id="targetSearchProducts"></a>
# **targetSearchProducts**
> kotlin.Any targetSearchProducts(query, page, pageSize, storeId, zipCode, sort)

Search products

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = TargetApi()
val query : kotlin.String = query_example // kotlin.String | 
val page : kotlin.Int = 56 // kotlin.Int | 
val pageSize : kotlin.Int = 56 // kotlin.Int | 
val storeId : kotlin.String = storeId_example // kotlin.String | 
val zipCode : kotlin.String = zipCode_example // kotlin.String | 
val sort : kotlin.String = sort_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.targetSearchProducts(query, page, pageSize, storeId, zipCode, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TargetApi#targetSearchProducts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TargetApi#targetSearchProducts")
    e.printStackTrace()
}
```

### Parameters
| **query** | **kotlin.String**|  | |
| **page** | **kotlin.Int**|  | [optional] [default to 1] |
| **pageSize** | **kotlin.Int**|  | [optional] [default to 24] |
| **storeId** | **kotlin.String**|  | [optional] [default to &quot;1375&quot;] |
| **zipCode** | **kotlin.String**|  | [optional] [default to &quot;55403&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sort** | **kotlin.String**|  | [optional] [default to relevance] [enum: relevance, PriceLow, PriceHigh, RatingHigh, bestselling, newest] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

