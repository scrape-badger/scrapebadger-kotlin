# ZillowApi

All URIs are relative to *https://scrapebadger.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**zillowGetAgentProfileListings**](ZillowApi.md#zillowGetAgentProfileListings) | **GET** /v1/zillow/agent | Get agent profile + listings |
| [**zillowGetPropertyDetail**](ZillowApi.md#zillowGetPropertyDetail) | **GET** /v1/zillow/property/{zpid} | Get property detail |
| [**zillowGetPropertyDetailByUrl**](ZillowApi.md#zillowGetPropertyDetailByUrl) | **GET** /v1/zillow/property | Get property detail by URL |
| [**zillowListCoverageMarkets**](ZillowApi.md#zillowListCoverageMarkets) | **GET** /v1/zillow/markets | List coverage markets |
| [**zillowRegionAddressSuggestions**](ZillowApi.md#zillowRegionAddressSuggestions) | **GET** /v1/zillow/autocomplete | Region/address suggestions |
| [**zillowSearchProperties**](ZillowApi.md#zillowSearchProperties) | **GET** /v1/zillow/search | Search properties |
| [**zillowZillowScraperHealthCheck**](ZillowApi.md#zillowZillowScraperHealthCheck) | **GET** /v1/zillow/health | Zillow scraper health check |
| [**zillowZillowScraperHealthCheckHead**](ZillowApi.md#zillowZillowScraperHealthCheckHead) | **HEAD** /v1/zillow/health | Zillow scraper health check |


<a id="zillowGetAgentProfileListings"></a>
# **zillowGetAgentProfileListings**
> kotlin.Any zillowGetAgentProfileListings(username, url)

Get agent profile + listings

Get a Zillow professional&#39;s profile and their active listings.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = ZillowApi()
val username : kotlin.String = username_example // kotlin.String | Zillow profile username
val url : kotlin.String = url_example // kotlin.String | Full Zillow /profile/... URL
try {
    val result : kotlin.Any = apiInstance.zillowGetAgentProfileListings(username, url)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ZillowApi#zillowGetAgentProfileListings")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ZillowApi#zillowGetAgentProfileListings")
    e.printStackTrace()
}
```

### Parameters
| **username** | **kotlin.String**| Zillow profile username | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **url** | **kotlin.String**| Full Zillow /profile/... URL | [optional] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="zillowGetPropertyDetail"></a>
# **zillowGetPropertyDetail**
> kotlin.Any zillowGetPropertyDetail(zpid)

Get property detail

Get a single Zillow property&#39;s full detail by zpid.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = ZillowApi()
val zpid : kotlin.String = zpid_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.zillowGetPropertyDetail(zpid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ZillowApi#zillowGetPropertyDetail")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ZillowApi#zillowGetPropertyDetail")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **zpid** | **kotlin.String**|  | |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="zillowGetPropertyDetailByUrl"></a>
# **zillowGetPropertyDetailByUrl**
> kotlin.Any zillowGetPropertyDetailByUrl(url)

Get property detail by URL

Get a single Zillow property&#39;s full detail by its homedetails URL.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = ZillowApi()
val url : kotlin.String = url_example // kotlin.String | Full Zillow /homedetails/... URL
try {
    val result : kotlin.Any = apiInstance.zillowGetPropertyDetailByUrl(url)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ZillowApi#zillowGetPropertyDetailByUrl")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ZillowApi#zillowGetPropertyDetailByUrl")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **url** | **kotlin.String**| Full Zillow /homedetails/... URL | |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="zillowListCoverageMarkets"></a>
# **zillowListCoverageMarkets**
> kotlin.Any zillowListCoverageMarkets()

List coverage markets

List Zillow coverage regions (US + Canada).

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = ZillowApi()
try {
    val result : kotlin.Any = apiInstance.zillowListCoverageMarkets()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ZillowApi#zillowListCoverageMarkets")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ZillowApi#zillowListCoverageMarkets")
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

<a id="zillowRegionAddressSuggestions"></a>
# **zillowRegionAddressSuggestions**
> kotlin.Any zillowRegionAddressSuggestions(query)

Region/address suggestions

Resolve a search term to Zillow regions/addresses.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = ZillowApi()
val query : kotlin.String = query_example // kotlin.String | Partial location — city, ZIP, address, neighborhood
try {
    val result : kotlin.Any = apiInstance.zillowRegionAddressSuggestions(query)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ZillowApi#zillowRegionAddressSuggestions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ZillowApi#zillowRegionAddressSuggestions")
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

<a id="zillowSearchProperties"></a>
# **zillowSearchProperties**
> kotlin.Any zillowSearchProperties(location, status, page, sort, priceMin, priceMax, bedsMin, bathsMin, homeType, sqftMin, sqftMax, lotMin, lotMax, yearBuiltMin, yearBuiltMax, hoaMax, keywords, daysOn, north, south, east, west)

Search properties

Search Zillow for for-sale / for-rent / recently-sold properties.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = ZillowApi()
val location : kotlin.String = location_example // kotlin.String | City/state, ZIP, address or neighborhood
val status : kotlin.String = status_example // kotlin.String | for_sale|for_rent|sold
val page : kotlin.Int = 56 // kotlin.Int | 
val sort : kotlin.String = sort_example // kotlin.String | homes_for_you|newest|price_high_to_low|price_low_to_high|bedrooms|bathrooms|square_feet|lot_size|year_built
val priceMin : kotlin.Int = 56 // kotlin.Int | 
val priceMax : kotlin.Int = 56 // kotlin.Int | 
val bedsMin : kotlin.Int = 56 // kotlin.Int | 
val bathsMin : java.math.BigDecimal = 8.14 // java.math.BigDecimal | 
val homeType : kotlin.String = homeType_example // kotlin.String | houses|condos|townhomes|apartments|manufactured|lots|multi_family
val sqftMin : kotlin.Int = 56 // kotlin.Int | 
val sqftMax : kotlin.Int = 56 // kotlin.Int | 
val lotMin : kotlin.Int = 56 // kotlin.Int | 
val lotMax : kotlin.Int = 56 // kotlin.Int | 
val yearBuiltMin : kotlin.Int = 56 // kotlin.Int | 
val yearBuiltMax : kotlin.Int = 56 // kotlin.Int | 
val hoaMax : kotlin.Int = 56 // kotlin.Int | 
val keywords : kotlin.String = keywords_example // kotlin.String | 
val daysOn : kotlin.String = daysOn_example // kotlin.String | 
val north : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Map bounds for tiling past the 820 cap
val south : java.math.BigDecimal = 8.14 // java.math.BigDecimal | 
val east : java.math.BigDecimal = 8.14 // java.math.BigDecimal | 
val west : java.math.BigDecimal = 8.14 // java.math.BigDecimal | 
try {
    val result : kotlin.Any = apiInstance.zillowSearchProperties(location, status, page, sort, priceMin, priceMax, bedsMin, bathsMin, homeType, sqftMin, sqftMax, lotMin, lotMax, yearBuiltMin, yearBuiltMax, hoaMax, keywords, daysOn, north, south, east, west)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ZillowApi#zillowSearchProperties")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ZillowApi#zillowSearchProperties")
    e.printStackTrace()
}
```

### Parameters
| **location** | **kotlin.String**| City/state, ZIP, address or neighborhood | |
| **status** | **kotlin.String**| for_sale|for_rent|sold | [optional] [default to &quot;for_sale&quot;] |
| **page** | **kotlin.Int**|  | [optional] [default to 1] |
| **sort** | **kotlin.String**| homes_for_you|newest|price_high_to_low|price_low_to_high|bedrooms|bathrooms|square_feet|lot_size|year_built | [optional] |
| **priceMin** | **kotlin.Int**|  | [optional] |
| **priceMax** | **kotlin.Int**|  | [optional] |
| **bedsMin** | **kotlin.Int**|  | [optional] |
| **bathsMin** | **java.math.BigDecimal**|  | [optional] |
| **homeType** | **kotlin.String**| houses|condos|townhomes|apartments|manufactured|lots|multi_family | [optional] |
| **sqftMin** | **kotlin.Int**|  | [optional] |
| **sqftMax** | **kotlin.Int**|  | [optional] |
| **lotMin** | **kotlin.Int**|  | [optional] |
| **lotMax** | **kotlin.Int**|  | [optional] |
| **yearBuiltMin** | **kotlin.Int**|  | [optional] |
| **yearBuiltMax** | **kotlin.Int**|  | [optional] |
| **hoaMax** | **kotlin.Int**|  | [optional] |
| **keywords** | **kotlin.String**|  | [optional] |
| **daysOn** | **kotlin.String**|  | [optional] |
| **north** | **java.math.BigDecimal**| Map bounds for tiling past the 820 cap | [optional] |
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

<a id="zillowZillowScraperHealthCheck"></a>
# **zillowZillowScraperHealthCheck**
> kotlin.Any zillowZillowScraperHealthCheck()

Zillow scraper health check

Check health of the Zillow scraper service (accepts HEAD for UptimeRobot).

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = ZillowApi()
try {
    val result : kotlin.Any = apiInstance.zillowZillowScraperHealthCheck()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ZillowApi#zillowZillowScraperHealthCheck")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ZillowApi#zillowZillowScraperHealthCheck")
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

<a id="zillowZillowScraperHealthCheckHead"></a>
# **zillowZillowScraperHealthCheckHead**
> kotlin.Any zillowZillowScraperHealthCheckHead()

Zillow scraper health check

Check health of the Zillow scraper service (accepts HEAD for UptimeRobot).

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = ZillowApi()
try {
    val result : kotlin.Any = apiInstance.zillowZillowScraperHealthCheckHead()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ZillowApi#zillowZillowScraperHealthCheckHead")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ZillowApi#zillowZillowScraperHealthCheckHead")
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

