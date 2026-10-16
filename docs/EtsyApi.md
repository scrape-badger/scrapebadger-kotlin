# EtsyApi

All URIs are relative to *https://scrapebadger.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**etsyGetCategories**](EtsyApi.md#etsyGetCategories) | **GET** /v1/etsy/categories | Get categories |
| [**etsyGetListingDetail**](EtsyApi.md#etsyGetListingDetail) | **GET** /v1/etsy/listings/{listing_id} | Get listing detail |
| [**etsyGetListingReviews**](EtsyApi.md#etsyGetListingReviews) | **GET** /v1/etsy/listings/{listing_id}/reviews | Get listing reviews |
| [**etsyGetSearchSuggestions**](EtsyApi.md#etsyGetSearchSuggestions) | **GET** /v1/etsy/autocomplete | Get search suggestions |
| [**etsyGetShopListings**](EtsyApi.md#etsyGetShopListings) | **GET** /v1/etsy/shops/{shop_name}/listings | Get shop listings |
| [**etsyGetShopProfile**](EtsyApi.md#etsyGetShopProfile) | **GET** /v1/etsy/shops/{shop_name} | Get shop profile |
| [**etsyGetShopReviews**](EtsyApi.md#etsyGetShopReviews) | **GET** /v1/etsy/shops/{shop_name}/reviews | Get shop reviews |
| [**etsySearchListings**](EtsyApi.md#etsySearchListings) | **GET** /v1/etsy/search | Search listings |


<a id="etsyGetCategories"></a>
# **etsyGetCategories**
> kotlin.Any etsyGetCategories(country, currency, language)

Get categories

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = EtsyApi()
val country : kotlin.String = country_example // kotlin.String | 
val currency : kotlin.String = currency_example // kotlin.String | 
val language : kotlin.String = language_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.etsyGetCategories(country, currency, language)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EtsyApi#etsyGetCategories")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EtsyApi#etsyGetCategories")
    e.printStackTrace()
}
```

### Parameters
| **country** | **kotlin.String**|  | [optional] [default to &quot;US&quot;] |
| **currency** | **kotlin.String**|  | [optional] [default to &quot;USD&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **language** | **kotlin.String**|  | [optional] [default to &quot;en-US&quot;] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="etsyGetListingDetail"></a>
# **etsyGetListingDetail**
> kotlin.Any etsyGetListingDetail(listingId, country, currency, language)

Get listing detail

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = EtsyApi()
val listingId : kotlin.String = listingId_example // kotlin.String | 
val country : kotlin.String = country_example // kotlin.String | 
val currency : kotlin.String = currency_example // kotlin.String | 
val language : kotlin.String = language_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.etsyGetListingDetail(listingId, country, currency, language)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EtsyApi#etsyGetListingDetail")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EtsyApi#etsyGetListingDetail")
    e.printStackTrace()
}
```

### Parameters
| **listingId** | **kotlin.String**|  | |
| **country** | **kotlin.String**|  | [optional] [default to &quot;US&quot;] |
| **currency** | **kotlin.String**|  | [optional] [default to &quot;USD&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **language** | **kotlin.String**|  | [optional] [default to &quot;en-US&quot;] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="etsyGetListingReviews"></a>
# **etsyGetListingReviews**
> kotlin.Any etsyGetListingReviews(listingId, page, sort, country, currency, language)

Get listing reviews

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = EtsyApi()
val listingId : kotlin.String = listingId_example // kotlin.String | 
val page : kotlin.Int = 56 // kotlin.Int | 
val sort : kotlin.String = sort_example // kotlin.String | 
val country : kotlin.String = country_example // kotlin.String | 
val currency : kotlin.String = currency_example // kotlin.String | 
val language : kotlin.String = language_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.etsyGetListingReviews(listingId, page, sort, country, currency, language)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EtsyApi#etsyGetListingReviews")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EtsyApi#etsyGetListingReviews")
    e.printStackTrace()
}
```

### Parameters
| **listingId** | **kotlin.String**|  | |
| **page** | **kotlin.Int**|  | [optional] [default to 1] |
| **sort** | **kotlin.String**|  | [optional] [default to Relevancy] [enum: Relevancy, Recency, Highest, Lowest] |
| **country** | **kotlin.String**|  | [optional] [default to &quot;US&quot;] |
| **currency** | **kotlin.String**|  | [optional] [default to &quot;USD&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **language** | **kotlin.String**|  | [optional] [default to &quot;en-US&quot;] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="etsyGetSearchSuggestions"></a>
# **etsyGetSearchSuggestions**
> kotlin.Any etsyGetSearchSuggestions(query, country, currency, language)

Get search suggestions

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = EtsyApi()
val query : kotlin.String = query_example // kotlin.String | 
val country : kotlin.String = country_example // kotlin.String | 
val currency : kotlin.String = currency_example // kotlin.String | 
val language : kotlin.String = language_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.etsyGetSearchSuggestions(query, country, currency, language)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EtsyApi#etsyGetSearchSuggestions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EtsyApi#etsyGetSearchSuggestions")
    e.printStackTrace()
}
```

### Parameters
| **query** | **kotlin.String**|  | |
| **country** | **kotlin.String**|  | [optional] [default to &quot;US&quot;] |
| **currency** | **kotlin.String**|  | [optional] [default to &quot;USD&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **language** | **kotlin.String**|  | [optional] [default to &quot;en-US&quot;] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="etsyGetShopListings"></a>
# **etsyGetShopListings**
> kotlin.Any etsyGetShopListings(shopName, page, country, currency, language)

Get shop listings

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = EtsyApi()
val shopName : kotlin.String = shopName_example // kotlin.String | 
val page : kotlin.Int = 56 // kotlin.Int | 
val country : kotlin.String = country_example // kotlin.String | 
val currency : kotlin.String = currency_example // kotlin.String | 
val language : kotlin.String = language_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.etsyGetShopListings(shopName, page, country, currency, language)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EtsyApi#etsyGetShopListings")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EtsyApi#etsyGetShopListings")
    e.printStackTrace()
}
```

### Parameters
| **shopName** | **kotlin.String**|  | |
| **page** | **kotlin.Int**|  | [optional] [default to 1] |
| **country** | **kotlin.String**|  | [optional] [default to &quot;US&quot;] |
| **currency** | **kotlin.String**|  | [optional] [default to &quot;USD&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **language** | **kotlin.String**|  | [optional] [default to &quot;en-US&quot;] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="etsyGetShopProfile"></a>
# **etsyGetShopProfile**
> kotlin.Any etsyGetShopProfile(shopName, country, currency, language)

Get shop profile

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = EtsyApi()
val shopName : kotlin.String = shopName_example // kotlin.String | 
val country : kotlin.String = country_example // kotlin.String | 
val currency : kotlin.String = currency_example // kotlin.String | 
val language : kotlin.String = language_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.etsyGetShopProfile(shopName, country, currency, language)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EtsyApi#etsyGetShopProfile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EtsyApi#etsyGetShopProfile")
    e.printStackTrace()
}
```

### Parameters
| **shopName** | **kotlin.String**|  | |
| **country** | **kotlin.String**|  | [optional] [default to &quot;US&quot;] |
| **currency** | **kotlin.String**|  | [optional] [default to &quot;USD&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **language** | **kotlin.String**|  | [optional] [default to &quot;en-US&quot;] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="etsyGetShopReviews"></a>
# **etsyGetShopReviews**
> kotlin.Any etsyGetShopReviews(shopName, page, country, currency, language)

Get shop reviews

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = EtsyApi()
val shopName : kotlin.String = shopName_example // kotlin.String | 
val page : kotlin.Int = 56 // kotlin.Int | 
val country : kotlin.String = country_example // kotlin.String | 
val currency : kotlin.String = currency_example // kotlin.String | 
val language : kotlin.String = language_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.etsyGetShopReviews(shopName, page, country, currency, language)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EtsyApi#etsyGetShopReviews")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EtsyApi#etsyGetShopReviews")
    e.printStackTrace()
}
```

### Parameters
| **shopName** | **kotlin.String**|  | |
| **page** | **kotlin.Int**|  | [optional] [default to 1] |
| **country** | **kotlin.String**|  | [optional] [default to &quot;US&quot;] |
| **currency** | **kotlin.String**|  | [optional] [default to &quot;USD&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **language** | **kotlin.String**|  | [optional] [default to &quot;en-US&quot;] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="etsySearchListings"></a>
# **etsySearchListings**
> kotlin.Any etsySearchListings(query, page, country, currency, language, sort, minPrice, maxPrice)

Search listings

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = EtsyApi()
val query : kotlin.String = query_example // kotlin.String | 
val page : kotlin.Int = 56 // kotlin.Int | 
val country : kotlin.String = country_example // kotlin.String | 
val currency : kotlin.String = currency_example // kotlin.String | 
val language : kotlin.String = language_example // kotlin.String | 
val sort : kotlin.String = sort_example // kotlin.String | 
val minPrice : java.math.BigDecimal = 8.14 // java.math.BigDecimal | 
val maxPrice : java.math.BigDecimal = 8.14 // java.math.BigDecimal | 
try {
    val result : kotlin.Any = apiInstance.etsySearchListings(query, page, country, currency, language, sort, minPrice, maxPrice)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EtsyApi#etsySearchListings")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EtsyApi#etsySearchListings")
    e.printStackTrace()
}
```

### Parameters
| **query** | **kotlin.String**|  | |
| **page** | **kotlin.Int**|  | [optional] [default to 1] |
| **country** | **kotlin.String**|  | [optional] [default to &quot;US&quot;] |
| **currency** | **kotlin.String**|  | [optional] [default to &quot;USD&quot;] |
| **language** | **kotlin.String**|  | [optional] [default to &quot;en-US&quot;] |
| **sort** | **kotlin.String**|  | [optional] [default to most_relevant] [enum: most_relevant, date_desc, price_asc, price_desc] |
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

