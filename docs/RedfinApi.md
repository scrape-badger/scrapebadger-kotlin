# RedfinApi

All URIs are relative to *https://scrapebadger.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**redfinGetAgentProfileListings**](RedfinApi.md#redfinGetAgentProfileListings) | **GET** /v1/redfin/agent | Get agent profile + listings |
| [**redfinGetPropertyDetail**](RedfinApi.md#redfinGetPropertyDetail) | **GET** /v1/redfin/property/{property_id} | Get property detail |
| [**redfinGetPropertyDetailByUrl**](RedfinApi.md#redfinGetPropertyDetailByUrl) | **GET** /v1/redfin/property | Get property detail by URL |
| [**redfinListCoverageMarkets**](RedfinApi.md#redfinListCoverageMarkets) | **GET** /v1/redfin/markets | List coverage markets |
| [**redfinRedfinScraperHealthCheck**](RedfinApi.md#redfinRedfinScraperHealthCheck) | **GET** /v1/redfin/health | Redfin scraper health check |
| [**redfinRedfinScraperHealthCheckHead**](RedfinApi.md#redfinRedfinScraperHealthCheckHead) | **HEAD** /v1/redfin/health | Redfin scraper health check |
| [**redfinRegionAddressSuggestions**](RedfinApi.md#redfinRegionAddressSuggestions) | **GET** /v1/redfin/autocomplete | Region/address suggestions |
| [**redfinSearchProperties**](RedfinApi.md#redfinSearchProperties) | **GET** /v1/redfin/search | Search properties |


<a id="redfinGetAgentProfileListings"></a>
# **redfinGetAgentProfileListings**
> kotlin.Any redfinGetAgentProfileListings(url, agentId)

Get agent profile + listings

Get a Redfin real-estate agent&#39;s profile and their active listings.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = RedfinApi()
val url : kotlin.String = url_example // kotlin.String | Full Redfin /realestateagents/ URL
val agentId : kotlin.String = agentId_example // kotlin.String | Redfin agent id
try {
    val result : kotlin.Any = apiInstance.redfinGetAgentProfileListings(url, agentId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RedfinApi#redfinGetAgentProfileListings")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RedfinApi#redfinGetAgentProfileListings")
    e.printStackTrace()
}
```

### Parameters
| **url** | **kotlin.String**| Full Redfin /realestateagents/ URL | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **agentId** | **kotlin.String**| Redfin agent id | [optional] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="redfinGetPropertyDetail"></a>
# **redfinGetPropertyDetail**
> kotlin.Any redfinGetPropertyDetail(propertyId)

Get property detail

Get a single Redfin property&#39;s full detail by its numeric propertyId.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = RedfinApi()
val propertyId : kotlin.String = propertyId_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.redfinGetPropertyDetail(propertyId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RedfinApi#redfinGetPropertyDetail")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RedfinApi#redfinGetPropertyDetail")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **propertyId** | **kotlin.String**|  | |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="redfinGetPropertyDetailByUrl"></a>
# **redfinGetPropertyDetailByUrl**
> kotlin.Any redfinGetPropertyDetailByUrl(url)

Get property detail by URL

Get a single Redfin property&#39;s full detail by its home URL.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = RedfinApi()
val url : kotlin.String = url_example // kotlin.String | Full Redfin property URL (/CA/City/.../home/12345678)
try {
    val result : kotlin.Any = apiInstance.redfinGetPropertyDetailByUrl(url)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RedfinApi#redfinGetPropertyDetailByUrl")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RedfinApi#redfinGetPropertyDetailByUrl")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **url** | **kotlin.String**| Full Redfin property URL (/CA/City/.../home/12345678) | |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="redfinListCoverageMarkets"></a>
# **redfinListCoverageMarkets**
> kotlin.Any redfinListCoverageMarkets()

List coverage markets

List Redfin coverage regions (US).

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = RedfinApi()
try {
    val result : kotlin.Any = apiInstance.redfinListCoverageMarkets()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RedfinApi#redfinListCoverageMarkets")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RedfinApi#redfinListCoverageMarkets")
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

<a id="redfinRedfinScraperHealthCheck"></a>
# **redfinRedfinScraperHealthCheck**
> kotlin.Any redfinRedfinScraperHealthCheck()

Redfin scraper health check

Check health of the Redfin scraper service (accepts HEAD for UptimeRobot).

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = RedfinApi()
try {
    val result : kotlin.Any = apiInstance.redfinRedfinScraperHealthCheck()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RedfinApi#redfinRedfinScraperHealthCheck")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RedfinApi#redfinRedfinScraperHealthCheck")
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

<a id="redfinRedfinScraperHealthCheckHead"></a>
# **redfinRedfinScraperHealthCheckHead**
> kotlin.Any redfinRedfinScraperHealthCheckHead()

Redfin scraper health check

Check health of the Redfin scraper service (accepts HEAD for UptimeRobot).

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = RedfinApi()
try {
    val result : kotlin.Any = apiInstance.redfinRedfinScraperHealthCheckHead()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RedfinApi#redfinRedfinScraperHealthCheckHead")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RedfinApi#redfinRedfinScraperHealthCheckHead")
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

<a id="redfinRegionAddressSuggestions"></a>
# **redfinRegionAddressSuggestions**
> kotlin.Any redfinRegionAddressSuggestions(query)

Region/address suggestions

Resolve a search term to Redfin regions/addresses.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = RedfinApi()
val query : kotlin.String = query_example // kotlin.String | Partial location — city, ZIP, address, neighborhood
try {
    val result : kotlin.Any = apiInstance.redfinRegionAddressSuggestions(query)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RedfinApi#redfinRegionAddressSuggestions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RedfinApi#redfinRegionAddressSuggestions")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **query** | **kotlin.String**| Partial location — city, ZIP, address, neighborhood | |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="redfinSearchProperties"></a>
# **redfinSearchProperties**
> kotlin.Any redfinSearchProperties(location, page, sort, priceMin, priceMax, bedsMin, bathsMin, homeType, sqftMin, sqftMax, lotMin, lotMax, yearBuiltMin, yearBuiltMax, maxDaysOnMarket, north, south, east, west)

Search properties

Search Redfin for for-sale / for-rent / recently-sold properties.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = RedfinApi()
val location : kotlin.String = location_example // kotlin.String | City/state, ZIP, address or neighborhood
val page : kotlin.Int = 56 // kotlin.Int | 
val sort : kotlin.String = sort_example // kotlin.String | relevant|newest|price_high_to_low|price_low_to_high|square_feet|lot_size|price_per_sqft|beds|baths
val priceMin : kotlin.Int = 56 // kotlin.Int | 
val priceMax : kotlin.Int = 56 // kotlin.Int | 
val bedsMin : kotlin.Int = 56 // kotlin.Int | 
val bathsMin : java.math.BigDecimal = 8.14 // java.math.BigDecimal | 
val homeType : kotlin.String = homeType_example // kotlin.String | house|condo|townhouse|multi_family|land|mobile|coop|other
val sqftMin : kotlin.Int = 56 // kotlin.Int | 
val sqftMax : kotlin.Int = 56 // kotlin.Int | 
val lotMin : kotlin.Int = 56 // kotlin.Int | 
val lotMax : kotlin.Int = 56 // kotlin.Int | 
val yearBuiltMin : kotlin.Int = 56 // kotlin.Int | 
val yearBuiltMax : kotlin.Int = 56 // kotlin.Int | 
val maxDaysOnMarket : kotlin.Int = 56 // kotlin.Int | 
val north : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Map bounds for tiling past the cap
val south : java.math.BigDecimal = 8.14 // java.math.BigDecimal | 
val east : java.math.BigDecimal = 8.14 // java.math.BigDecimal | 
val west : java.math.BigDecimal = 8.14 // java.math.BigDecimal | 
try {
    val result : kotlin.Any = apiInstance.redfinSearchProperties(location, page, sort, priceMin, priceMax, bedsMin, bathsMin, homeType, sqftMin, sqftMax, lotMin, lotMax, yearBuiltMin, yearBuiltMax, maxDaysOnMarket, north, south, east, west)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RedfinApi#redfinSearchProperties")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RedfinApi#redfinSearchProperties")
    e.printStackTrace()
}
```

### Parameters
| **location** | **kotlin.String**| City/state, ZIP, address or neighborhood | |
| **page** | **kotlin.Int**|  | [optional] [default to 1] |
| **sort** | **kotlin.String**| relevant|newest|price_high_to_low|price_low_to_high|square_feet|lot_size|price_per_sqft|beds|baths | [optional] |
| **priceMin** | **kotlin.Int**|  | [optional] |
| **priceMax** | **kotlin.Int**|  | [optional] |
| **bedsMin** | **kotlin.Int**|  | [optional] |
| **bathsMin** | **java.math.BigDecimal**|  | [optional] |
| **homeType** | **kotlin.String**| house|condo|townhouse|multi_family|land|mobile|coop|other | [optional] |
| **sqftMin** | **kotlin.Int**|  | [optional] |
| **sqftMax** | **kotlin.Int**|  | [optional] |
| **lotMin** | **kotlin.Int**|  | [optional] |
| **lotMax** | **kotlin.Int**|  | [optional] |
| **yearBuiltMin** | **kotlin.Int**|  | [optional] |
| **yearBuiltMax** | **kotlin.Int**|  | [optional] |
| **maxDaysOnMarket** | **kotlin.Int**|  | [optional] |
| **north** | **java.math.BigDecimal**| Map bounds for tiling past the cap | [optional] |
| **south** | **java.math.BigDecimal**|  | [optional] |
| **east** | **java.math.BigDecimal**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **west** | **java.math.BigDecimal**|  | [optional] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

