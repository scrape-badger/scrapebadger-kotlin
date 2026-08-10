# RealtorApi

All URIs are relative to *https://scrapebadger.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**realtorGetFullPropertyDetail**](RealtorApi.md#realtorGetFullPropertyDetail) | **GET** /v1/realtor/properties/{property_id} | Get full property detail |
| [**realtorListMarkets**](RealtorApi.md#realtorListMarkets) | **GET** /v1/realtor/markets | List markets |
| [**realtorLocationAutocomplete**](RealtorApi.md#realtorLocationAutocomplete) | **GET** /v1/realtor/autocomplete | Location autocomplete |
| [**realtorRealtorScraperHealthCheck**](RealtorApi.md#realtorRealtorScraperHealthCheck) | **GET** /v1/realtor/health | Realtor scraper health check |
| [**realtorRealtorScraperHealthCheckHead**](RealtorApi.md#realtorRealtorScraperHealthCheckHead) | **HEAD** /v1/realtor/health | Realtor scraper health check |
| [**realtorSearchPropertyListings**](RealtorApi.md#realtorSearchPropertyListings) | **GET** /v1/realtor/search | Search property listings |


<a id="realtorGetFullPropertyDetail"></a>
# **realtorGetFullPropertyDetail**
> kotlin.Any realtorGetFullPropertyDetail(propertyId, market)

Get full property detail

Full listing detail: features, tax &amp; price history, schools, photos, agents.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = RealtorApi()
val propertyId : kotlin.String = propertyId_example // kotlin.String | 
val market : kotlin.String = market_example // kotlin.String | us (realtor.com) | ca (realtor.ca)
try {
    val result : kotlin.Any = apiInstance.realtorGetFullPropertyDetail(propertyId, market)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RealtorApi#realtorGetFullPropertyDetail")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RealtorApi#realtorGetFullPropertyDetail")
    e.printStackTrace()
}
```

### Parameters
| **propertyId** | **kotlin.String**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **market** | **kotlin.String**| us (realtor.com) | ca (realtor.ca) | [optional] [default to &quot;us&quot;] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="realtorListMarkets"></a>
# **realtorListMarkets**
> kotlin.Any realtorListMarkets()

List markets

List supported Realtor markets (US &#x3D; realtor.com, CA &#x3D; realtor.ca).

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = RealtorApi()
try {
    val result : kotlin.Any = apiInstance.realtorListMarkets()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RealtorApi#realtorListMarkets")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RealtorApi#realtorListMarkets")
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

<a id="realtorLocationAutocomplete"></a>
# **realtorLocationAutocomplete**
> kotlin.Any realtorLocationAutocomplete(query, market, limit)

Location autocomplete

Resolve a location query into candidate places to feed /search.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = RealtorApi()
val query : kotlin.String = query_example // kotlin.String | Freetext location (city, ZIP/postal, address…)
val market : kotlin.String = market_example // kotlin.String | us (realtor.com) | ca (realtor.ca)
val limit : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.Any = apiInstance.realtorLocationAutocomplete(query, market, limit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RealtorApi#realtorLocationAutocomplete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RealtorApi#realtorLocationAutocomplete")
    e.printStackTrace()
}
```

### Parameters
| **query** | **kotlin.String**| Freetext location (city, ZIP/postal, address…) | |
| **market** | **kotlin.String**| us (realtor.com) | ca (realtor.ca) | [optional] [default to &quot;us&quot;] |
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

<a id="realtorRealtorScraperHealthCheck"></a>
# **realtorRealtorScraperHealthCheck**
> kotlin.Any realtorRealtorScraperHealthCheck()

Realtor scraper health check

Check health of the realtor scraper service (accepts HEAD for UptimeRobot).

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = RealtorApi()
try {
    val result : kotlin.Any = apiInstance.realtorRealtorScraperHealthCheck()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RealtorApi#realtorRealtorScraperHealthCheck")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RealtorApi#realtorRealtorScraperHealthCheck")
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

<a id="realtorRealtorScraperHealthCheckHead"></a>
# **realtorRealtorScraperHealthCheckHead**
> kotlin.Any realtorRealtorScraperHealthCheckHead()

Realtor scraper health check

Check health of the realtor scraper service (accepts HEAD for UptimeRobot).

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = RealtorApi()
try {
    val result : kotlin.Any = apiInstance.realtorRealtorScraperHealthCheckHead()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RealtorApi#realtorRealtorScraperHealthCheckHead")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RealtorApi#realtorRealtorScraperHealthCheckHead")
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

<a id="realtorSearchPropertyListings"></a>
# **realtorSearchPropertyListings**
> kotlin.Any realtorSearchPropertyListings(location, market, status, priceMin, priceMax, bedsMin, bathsMin, sqftMin, sqftMax, propertyType, sort, page, limit, latMin, latMax, lngMin, lngMax)

Search property listings

Search for-sale/for-rent/sold listings with rich filters.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = RealtorApi()
val location : kotlin.String = location_example // kotlin.String | 'Austin, TX', a ZIP, 'Toronto, ON'…
val market : kotlin.String = market_example // kotlin.String | us (realtor.com) | ca (realtor.ca)
val status : kotlin.String = status_example // kotlin.String | for_sale | for_rent | sold | pending
val priceMin : java.math.BigDecimal = 8.14 // java.math.BigDecimal | 
val priceMax : java.math.BigDecimal = 8.14 // java.math.BigDecimal | 
val bedsMin : kotlin.Int = 56 // kotlin.Int | 
val bathsMin : kotlin.Int = 56 // kotlin.Int | 
val sqftMin : kotlin.Int = 56 // kotlin.Int | US only
val sqftMax : kotlin.Int = 56 // kotlin.Int | US only
val propertyType : kotlin.String = propertyType_example // kotlin.String | US only, CSV of property types
val sort : kotlin.String = sort_example // kotlin.String | relevant | newest | price_low | price_high | photo_count
val page : kotlin.Int = 56 // kotlin.Int | 
val limit : kotlin.Int = 56 // kotlin.Int | 
val latMin : java.math.BigDecimal = 8.14 // java.math.BigDecimal | CA bbox south
val latMax : java.math.BigDecimal = 8.14 // java.math.BigDecimal | CA bbox north
val lngMin : java.math.BigDecimal = 8.14 // java.math.BigDecimal | CA bbox west
val lngMax : java.math.BigDecimal = 8.14 // java.math.BigDecimal | CA bbox east
try {
    val result : kotlin.Any = apiInstance.realtorSearchPropertyListings(location, market, status, priceMin, priceMax, bedsMin, bathsMin, sqftMin, sqftMax, propertyType, sort, page, limit, latMin, latMax, lngMin, lngMax)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RealtorApi#realtorSearchPropertyListings")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RealtorApi#realtorSearchPropertyListings")
    e.printStackTrace()
}
```

### Parameters
| **location** | **kotlin.String**| &#39;Austin, TX&#39;, a ZIP, &#39;Toronto, ON&#39;… | [optional] |
| **market** | **kotlin.String**| us (realtor.com) | ca (realtor.ca) | [optional] [default to &quot;us&quot;] |
| **status** | **kotlin.String**| for_sale | for_rent | sold | pending | [optional] [default to &quot;for_sale&quot;] |
| **priceMin** | **java.math.BigDecimal**|  | [optional] |
| **priceMax** | **java.math.BigDecimal**|  | [optional] |
| **bedsMin** | **kotlin.Int**|  | [optional] |
| **bathsMin** | **kotlin.Int**|  | [optional] |
| **sqftMin** | **kotlin.Int**| US only | [optional] |
| **sqftMax** | **kotlin.Int**| US only | [optional] |
| **propertyType** | **kotlin.String**| US only, CSV of property types | [optional] |
| **sort** | **kotlin.String**| relevant | newest | price_low | price_high | photo_count | [optional] [default to &quot;relevant&quot;] |
| **page** | **kotlin.Int**|  | [optional] [default to 1] |
| **limit** | **kotlin.Int**|  | [optional] |
| **latMin** | **java.math.BigDecimal**| CA bbox south | [optional] |
| **latMax** | **java.math.BigDecimal**| CA bbox north | [optional] |
| **lngMin** | **java.math.BigDecimal**| CA bbox west | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **lngMax** | **java.math.BigDecimal**| CA bbox east | [optional] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

