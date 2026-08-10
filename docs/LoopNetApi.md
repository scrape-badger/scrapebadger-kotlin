# LoopNetApi

All URIs are relative to *https://scrapebadger.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**loopnetGetBrokerProfile**](LoopNetApi.md#loopnetGetBrokerProfile) | **GET** /v1/loopnet/brokers/{slug}/{broker_id} | Get broker profile |
| [**loopnetGetListingDetail**](LoopNetApi.md#loopnetGetListingDetail) | **GET** /v1/loopnet/listings/{listing_id} | Get listing detail |
| [**loopnetListCoverageMarkets**](LoopNetApi.md#loopnetListCoverageMarkets) | **GET** /v1/loopnet/markets | List coverage markets |
| [**loopnetListPropertyTypes**](LoopNetApi.md#loopnetListPropertyTypes) | **GET** /v1/loopnet/property-types | List property types |
| [**loopnetLoopnetScraperHealthCheck**](LoopNetApi.md#loopnetLoopnetScraperHealthCheck) | **GET** /v1/loopnet/health | LoopNet scraper health check |
| [**loopnetLoopnetScraperHealthCheckHead**](LoopNetApi.md#loopnetLoopnetScraperHealthCheckHead) | **HEAD** /v1/loopnet/health | LoopNet scraper health check |
| [**loopnetSearchCommercialRealEstate**](LoopNetApi.md#loopnetSearchCommercialRealEstate) | **GET** /v1/loopnet/search | Search commercial real estate |


<a id="loopnetGetBrokerProfile"></a>
# **loopnetGetBrokerProfile**
> kotlin.Any loopnetGetBrokerProfile(slug, brokerId, market)

Get broker profile

Get a LoopNet broker profile + their listings by slug + id.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = LoopNetApi()
val slug : kotlin.String = slug_example // kotlin.String | 
val brokerId : kotlin.String = brokerId_example // kotlin.String | 
val market : kotlin.String = market_example // kotlin.String | us|ca|uk|fr|es
try {
    val result : kotlin.Any = apiInstance.loopnetGetBrokerProfile(slug, brokerId, market)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LoopNetApi#loopnetGetBrokerProfile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LoopNetApi#loopnetGetBrokerProfile")
    e.printStackTrace()
}
```

### Parameters
| **slug** | **kotlin.String**|  | |
| **brokerId** | **kotlin.String**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **market** | **kotlin.String**| us|ca|uk|fr|es | [optional] [default to &quot;us&quot;] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="loopnetGetListingDetail"></a>
# **loopnetGetListingDetail**
> kotlin.Any loopnetGetListingDetail(listingId, market)

Get listing detail

Get a single LoopNet listing&#39;s full detail by its numeric id.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = LoopNetApi()
val listingId : kotlin.String = listingId_example // kotlin.String | 
val market : kotlin.String = market_example // kotlin.String | us|ca|uk|fr|es
try {
    val result : kotlin.Any = apiInstance.loopnetGetListingDetail(listingId, market)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LoopNetApi#loopnetGetListingDetail")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LoopNetApi#loopnetGetListingDetail")
    e.printStackTrace()
}
```

### Parameters
| **listingId** | **kotlin.String**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **market** | **kotlin.String**| us|ca|uk|fr|es | [optional] [default to &quot;us&quot;] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="loopnetListCoverageMarkets"></a>
# **loopnetListCoverageMarkets**
> kotlin.Any loopnetListCoverageMarkets()

List coverage markets

List LoopNet coverage markets (US, CA, UK, FR, ES).

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = LoopNetApi()
try {
    val result : kotlin.Any = apiInstance.loopnetListCoverageMarkets()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LoopNetApi#loopnetListCoverageMarkets")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LoopNetApi#loopnetListCoverageMarkets")
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

<a id="loopnetListPropertyTypes"></a>
# **loopnetListPropertyTypes**
> kotlin.Any loopnetListPropertyTypes()

List property types

List LoopNet property-type facets accepted by /search.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = LoopNetApi()
try {
    val result : kotlin.Any = apiInstance.loopnetListPropertyTypes()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LoopNetApi#loopnetListPropertyTypes")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LoopNetApi#loopnetListPropertyTypes")
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

<a id="loopnetLoopnetScraperHealthCheck"></a>
# **loopnetLoopnetScraperHealthCheck**
> kotlin.Any loopnetLoopnetScraperHealthCheck()

LoopNet scraper health check

Check health of the LoopNet scraper service (accepts HEAD for UptimeRobot).

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = LoopNetApi()
try {
    val result : kotlin.Any = apiInstance.loopnetLoopnetScraperHealthCheck()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LoopNetApi#loopnetLoopnetScraperHealthCheck")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LoopNetApi#loopnetLoopnetScraperHealthCheck")
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

<a id="loopnetLoopnetScraperHealthCheckHead"></a>
# **loopnetLoopnetScraperHealthCheckHead**
> kotlin.Any loopnetLoopnetScraperHealthCheckHead()

LoopNet scraper health check

Check health of the LoopNet scraper service (accepts HEAD for UptimeRobot).

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = LoopNetApi()
try {
    val result : kotlin.Any = apiInstance.loopnetLoopnetScraperHealthCheckHead()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LoopNetApi#loopnetLoopnetScraperHealthCheckHead")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LoopNetApi#loopnetLoopnetScraperHealthCheckHead")
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

<a id="loopnetSearchCommercialRealEstate"></a>
# **loopnetSearchCommercialRealEstate**
> kotlin.Any loopnetSearchCommercialRealEstate(location, market, listingType, propertyType, page, minPrice, maxPrice, priceType, minSize, maxSize)

Search commercial real estate

Search LoopNet for-lease / for-sale / auction listings across all markets.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = LoopNetApi()
val location : kotlin.String = location_example // kotlin.String | City/state, ZIP, state code, or 'usa'
val market : kotlin.String = market_example // kotlin.String | us|ca|uk|fr|es
val listingType : kotlin.String = listingType_example // kotlin.String | for-lease|for-sale|auctions
val propertyType : kotlin.String = propertyType_example // kotlin.String | Slug from /property-types
val page : kotlin.Int = 56 // kotlin.Int | 
val minPrice : kotlin.Int = 56 // kotlin.Int | 
val maxPrice : kotlin.Int = 56 // kotlin.Int | 
val priceType : kotlin.String = priceType_example // kotlin.String | unit | sf | acre
val minSize : kotlin.Int = 56 // kotlin.Int | 
val maxSize : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.Any = apiInstance.loopnetSearchCommercialRealEstate(location, market, listingType, propertyType, page, minPrice, maxPrice, priceType, minSize, maxSize)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LoopNetApi#loopnetSearchCommercialRealEstate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LoopNetApi#loopnetSearchCommercialRealEstate")
    e.printStackTrace()
}
```

### Parameters
| **location** | **kotlin.String**| City/state, ZIP, state code, or &#39;usa&#39; | |
| **market** | **kotlin.String**| us|ca|uk|fr|es | [optional] [default to &quot;us&quot;] |
| **listingType** | **kotlin.String**| for-lease|for-sale|auctions | [optional] [default to &quot;for-lease&quot;] |
| **propertyType** | **kotlin.String**| Slug from /property-types | [optional] |
| **page** | **kotlin.Int**|  | [optional] [default to 1] |
| **minPrice** | **kotlin.Int**|  | [optional] |
| **maxPrice** | **kotlin.Int**|  | [optional] |
| **priceType** | **kotlin.String**| unit | sf | acre | [optional] |
| **minSize** | **kotlin.Int**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **maxSize** | **kotlin.Int**|  | [optional] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

