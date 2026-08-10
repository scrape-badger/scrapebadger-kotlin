# LeboncoinApi

All URIs are relative to *https://scrapebadger.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**leboncoinGetASellerSAds**](LeboncoinApi.md#leboncoinGetASellerSAds) | **GET** /v1/leboncoin/sellers/{user_id}/listings | Get a seller&#39;s ads |
| [**leboncoinGetAdDetail**](LeboncoinApi.md#leboncoinGetAdDetail) | **GET** /v1/leboncoin/ads/{list_id} | Get ad detail |
| [**leboncoinGetSellerProfile**](LeboncoinApi.md#leboncoinGetSellerProfile) | **GET** /v1/leboncoin/sellers/{user_id} | Get seller profile |
| [**leboncoinGetSimilarAds**](LeboncoinApi.md#leboncoinGetSimilarAds) | **GET** /v1/leboncoin/ads/{list_id}/similar | Get similar ads |
| [**leboncoinLeboncoinScraperHealthCheck**](LeboncoinApi.md#leboncoinLeboncoinScraperHealthCheck) | **GET** /v1/leboncoin/health | Leboncoin scraper health check |
| [**leboncoinLeboncoinScraperHealthCheckHead**](LeboncoinApi.md#leboncoinLeboncoinScraperHealthCheckHead) | **HEAD** /v1/leboncoin/health | Leboncoin scraper health check |
| [**leboncoinListCategories**](LeboncoinApi.md#leboncoinListCategories) | **GET** /v1/leboncoin/categories | List categories |
| [**leboncoinListDepartments**](LeboncoinApi.md#leboncoinListDepartments) | **GET** /v1/leboncoin/departments | List departments |
| [**leboncoinListMarkets**](LeboncoinApi.md#leboncoinListMarkets) | **GET** /v1/leboncoin/markets | List markets |
| [**leboncoinListRegions**](LeboncoinApi.md#leboncoinListRegions) | **GET** /v1/leboncoin/regions | List regions |
| [**leboncoinLocationAutocomplete**](LeboncoinApi.md#leboncoinLocationAutocomplete) | **GET** /v1/leboncoin/locations/search | Location autocomplete |
| [**leboncoinSearchLeboncoinAds**](LeboncoinApi.md#leboncoinSearchLeboncoinAds) | **GET** /v1/leboncoin/search | Search Leboncoin ads |


<a id="leboncoinGetASellerSAds"></a>
# **leboncoinGetASellerSAds**
> kotlin.Any leboncoinGetASellerSAds(userId, page, limit)

Get a seller&#39;s ads

A seller&#39;s active ads.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = LeboncoinApi()
val userId : kotlin.String = userId_example // kotlin.String | 
val page : kotlin.Int = 56 // kotlin.Int | 
val limit : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.Any = apiInstance.leboncoinGetASellerSAds(userId, page, limit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LeboncoinApi#leboncoinGetASellerSAds")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LeboncoinApi#leboncoinGetASellerSAds")
    e.printStackTrace()
}
```

### Parameters
| **userId** | **kotlin.String**|  | |
| **page** | **kotlin.Int**|  | [optional] [default to 1] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **limit** | **kotlin.Int**|  | [optional] [default to 35] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="leboncoinGetAdDetail"></a>
# **leboncoinGetAdDetail**
> kotlin.Any leboncoinGetAdDetail(listId)

Get ad detail

Full detail for a Leboncoin ad.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = LeboncoinApi()
val listId : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.Any = apiInstance.leboncoinGetAdDetail(listId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LeboncoinApi#leboncoinGetAdDetail")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LeboncoinApi#leboncoinGetAdDetail")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **listId** | **kotlin.Int**|  | |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="leboncoinGetSellerProfile"></a>
# **leboncoinGetSellerProfile**
> kotlin.Any leboncoinGetSellerProfile(userId)

Get seller profile

Public seller/pro-store profile.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = LeboncoinApi()
val userId : kotlin.String = userId_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.leboncoinGetSellerProfile(userId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LeboncoinApi#leboncoinGetSellerProfile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LeboncoinApi#leboncoinGetSellerProfile")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **kotlin.String**|  | |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="leboncoinGetSimilarAds"></a>
# **leboncoinGetSimilarAds**
> kotlin.Any leboncoinGetSimilarAds(listId, limit)

Get similar ads

Ads Leboncoin surfaces as similar to the given ad.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = LeboncoinApi()
val listId : kotlin.Int = 56 // kotlin.Int | 
val limit : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.Any = apiInstance.leboncoinGetSimilarAds(listId, limit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LeboncoinApi#leboncoinGetSimilarAds")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LeboncoinApi#leboncoinGetSimilarAds")
    e.printStackTrace()
}
```

### Parameters
| **listId** | **kotlin.Int**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **limit** | **kotlin.Int**|  | [optional] [default to 20] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="leboncoinLeboncoinScraperHealthCheck"></a>
# **leboncoinLeboncoinScraperHealthCheck**
> kotlin.Any leboncoinLeboncoinScraperHealthCheck()

Leboncoin scraper health check

Check health of the Leboncoin scraper service (accepts HEAD).

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = LeboncoinApi()
try {
    val result : kotlin.Any = apiInstance.leboncoinLeboncoinScraperHealthCheck()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LeboncoinApi#leboncoinLeboncoinScraperHealthCheck")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LeboncoinApi#leboncoinLeboncoinScraperHealthCheck")
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

<a id="leboncoinLeboncoinScraperHealthCheckHead"></a>
# **leboncoinLeboncoinScraperHealthCheckHead**
> kotlin.Any leboncoinLeboncoinScraperHealthCheckHead()

Leboncoin scraper health check

Check health of the Leboncoin scraper service (accepts HEAD).

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = LeboncoinApi()
try {
    val result : kotlin.Any = apiInstance.leboncoinLeboncoinScraperHealthCheckHead()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LeboncoinApi#leboncoinLeboncoinScraperHealthCheckHead")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LeboncoinApi#leboncoinLeboncoinScraperHealthCheckHead")
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

<a id="leboncoinListCategories"></a>
# **leboncoinListCategories**
> kotlin.Any leboncoinListCategories()

List categories

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = LeboncoinApi()
try {
    val result : kotlin.Any = apiInstance.leboncoinListCategories()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LeboncoinApi#leboncoinListCategories")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LeboncoinApi#leboncoinListCategories")
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

<a id="leboncoinListDepartments"></a>
# **leboncoinListDepartments**
> kotlin.Any leboncoinListDepartments(regionId)

List departments

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = LeboncoinApi()
val regionId : kotlin.String = regionId_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.leboncoinListDepartments(regionId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LeboncoinApi#leboncoinListDepartments")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LeboncoinApi#leboncoinListDepartments")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **regionId** | **kotlin.String**|  | [optional] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="leboncoinListMarkets"></a>
# **leboncoinListMarkets**
> kotlin.Any leboncoinListMarkets()

List markets

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = LeboncoinApi()
try {
    val result : kotlin.Any = apiInstance.leboncoinListMarkets()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LeboncoinApi#leboncoinListMarkets")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LeboncoinApi#leboncoinListMarkets")
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

<a id="leboncoinListRegions"></a>
# **leboncoinListRegions**
> kotlin.Any leboncoinListRegions()

List regions

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = LeboncoinApi()
try {
    val result : kotlin.Any = apiInstance.leboncoinListRegions()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LeboncoinApi#leboncoinListRegions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LeboncoinApi#leboncoinListRegions")
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

<a id="leboncoinLocationAutocomplete"></a>
# **leboncoinLocationAutocomplete**
> kotlin.Any leboncoinLocationAutocomplete(q)

Location autocomplete

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = LeboncoinApi()
val q : kotlin.String = q_example // kotlin.String | Place name
try {
    val result : kotlin.Any = apiInstance.leboncoinLocationAutocomplete(q)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LeboncoinApi#leboncoinLocationAutocomplete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LeboncoinApi#leboncoinLocationAutocomplete")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **q** | **kotlin.String**| Place name | |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="leboncoinSearchLeboncoinAds"></a>
# **leboncoinSearchLeboncoinAds**
> kotlin.Any leboncoinSearchLeboncoinAds(text, category, regionId, departmentId, city, zipcode, priceMin, priceMax, ownerType, adType, sort, page, limit)

Search Leboncoin ads

Search Leboncoin classifieds (France; scope by region/department/city).

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = LeboncoinApi()
val text : kotlin.String = text_example // kotlin.String | Free-text query
val category : kotlin.String = category_example // kotlin.String | Category id (see /categories)
val regionId : kotlin.String = regionId_example // kotlin.String | Region id (see /regions)
val departmentId : kotlin.String = departmentId_example // kotlin.String | Department id, e.g. 75
val city : kotlin.String = city_example // kotlin.String | 
val zipcode : kotlin.String = zipcode_example // kotlin.String | 
val priceMin : kotlin.Int = 56 // kotlin.Int | 
val priceMax : kotlin.Int = 56 // kotlin.Int | 
val ownerType : kotlin.String = ownerType_example // kotlin.String | all | pro | private
val adType : kotlin.String = adType_example // kotlin.String | offer | demand
val sort : kotlin.String = sort_example // kotlin.String | relevance|newest|oldest|price_low|price_high
val page : kotlin.Int = 56 // kotlin.Int | 
val limit : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.Any = apiInstance.leboncoinSearchLeboncoinAds(text, category, regionId, departmentId, city, zipcode, priceMin, priceMax, ownerType, adType, sort, page, limit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LeboncoinApi#leboncoinSearchLeboncoinAds")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LeboncoinApi#leboncoinSearchLeboncoinAds")
    e.printStackTrace()
}
```

### Parameters
| **text** | **kotlin.String**| Free-text query | [optional] |
| **category** | **kotlin.String**| Category id (see /categories) | [optional] |
| **regionId** | **kotlin.String**| Region id (see /regions) | [optional] |
| **departmentId** | **kotlin.String**| Department id, e.g. 75 | [optional] |
| **city** | **kotlin.String**|  | [optional] |
| **zipcode** | **kotlin.String**|  | [optional] |
| **priceMin** | **kotlin.Int**|  | [optional] |
| **priceMax** | **kotlin.Int**|  | [optional] |
| **ownerType** | **kotlin.String**| all | pro | private | [optional] [default to &quot;all&quot;] |
| **adType** | **kotlin.String**| offer | demand | [optional] [default to &quot;offer&quot;] |
| **sort** | **kotlin.String**| relevance|newest|oldest|price_low|price_high | [optional] [default to &quot;relevance&quot;] |
| **page** | **kotlin.Int**|  | [optional] [default to 1] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **limit** | **kotlin.Int**|  | [optional] [default to 35] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

