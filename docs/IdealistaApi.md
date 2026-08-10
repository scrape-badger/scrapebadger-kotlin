# IdealistaApi

All URIs are relative to *https://scrapebadger.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**idealistaAgencyByPhone**](IdealistaApi.md#idealistaAgencyByPhone) | **GET** /v1/idealista/agency/by-phone/{phone} | Agency by phone |
| [**idealistaAgencyProfileListings**](IdealistaApi.md#idealistaAgencyProfileListings) | **GET** /v1/idealista/agency/{short_name} | Agency profile + listings |
| [**idealistaGetListingEngagementStats**](IdealistaApi.md#idealistaGetListingEngagementStats) | **GET** /v1/idealista/properties/{property_code}/stats | Get listing engagement stats |
| [**idealistaGetPropertyDetail**](IdealistaApi.md#idealistaGetPropertyDetail) | **GET** /v1/idealista/properties/{property_code} | Get property detail |
| [**idealistaIdealistaScraperHealthCheck**](IdealistaApi.md#idealistaIdealistaScraperHealthCheck) | **GET** /v1/idealista/health | Idealista scraper health check |
| [**idealistaIdealistaScraperHealthCheckHead**](IdealistaApi.md#idealistaIdealistaScraperHealthCheckHead) | **HEAD** /v1/idealista/health | Idealista scraper health check |
| [**idealistaListMarkets**](IdealistaApi.md#idealistaListMarkets) | **GET** /v1/idealista/markets | List markets |
| [**idealistaResolveLocations**](IdealistaApi.md#idealistaResolveLocations) | **GET** /v1/idealista/suggest | Resolve locations |
| [**idealistaSearchAllBeatsResultCap**](IdealistaApi.md#idealistaSearchAllBeatsResultCap) | **GET** /v1/idealista/search/all | Search all (beats result cap) |
| [**idealistaSearchListings**](IdealistaApi.md#idealistaSearchListings) | **GET** /v1/idealista/search | Search listings |


<a id="idealistaAgencyByPhone"></a>
# **idealistaAgencyByPhone**
> kotlin.Any idealistaAgencyByPhone(phone, market, operation, propertyType, page, maxItems, includeListings)

Agency by phone

Reverse-lookup the agency behind a contact phone (national number), with its listings.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = IdealistaApi()
val phone : kotlin.String = phone_example // kotlin.String | 
val market : kotlin.String = market_example // kotlin.String | es|it|pt
val operation : kotlin.String = operation_example // kotlin.String | sale|rent
val propertyType : kotlin.String = propertyType_example // kotlin.String | homes|offices|premises|garages|newDevelopments|lands|storageRooms|buildings|bedrooms
val page : kotlin.Int = 56 // kotlin.Int | 
val maxItems : kotlin.Int = 56 // kotlin.Int | 
val includeListings : kotlin.Boolean = true // kotlin.Boolean | 
try {
    val result : kotlin.Any = apiInstance.idealistaAgencyByPhone(phone, market, operation, propertyType, page, maxItems, includeListings)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IdealistaApi#idealistaAgencyByPhone")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IdealistaApi#idealistaAgencyByPhone")
    e.printStackTrace()
}
```

### Parameters
| **phone** | **kotlin.String**|  | |
| **market** | **kotlin.String**| es|it|pt | [optional] [default to &quot;es&quot;] |
| **operation** | **kotlin.String**| sale|rent | [optional] |
| **propertyType** | **kotlin.String**| homes|offices|premises|garages|newDevelopments|lands|storageRooms|buildings|bedrooms | [optional] |
| **page** | **kotlin.Int**|  | [optional] [default to 1] |
| **maxItems** | **kotlin.Int**|  | [optional] [default to 30] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **includeListings** | **kotlin.Boolean**|  | [optional] [default to true] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="idealistaAgencyProfileListings"></a>
# **idealistaAgencyProfileListings**
> kotlin.Any idealistaAgencyProfileListings(shortName, market, operation, propertyType, page, maxItems, includeListings)

Agency profile + listings

An agency&#39;s microsite profile plus a page of its listings (by URL-slug shortName).

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = IdealistaApi()
val shortName : kotlin.String = shortName_example // kotlin.String | 
val market : kotlin.String = market_example // kotlin.String | es|it|pt
val operation : kotlin.String = operation_example // kotlin.String | sale|rent
val propertyType : kotlin.String = propertyType_example // kotlin.String | homes|offices|premises|garages|newDevelopments|lands|storageRooms|buildings|bedrooms
val page : kotlin.Int = 56 // kotlin.Int | 
val maxItems : kotlin.Int = 56 // kotlin.Int | 
val includeListings : kotlin.Boolean = true // kotlin.Boolean | 
try {
    val result : kotlin.Any = apiInstance.idealistaAgencyProfileListings(shortName, market, operation, propertyType, page, maxItems, includeListings)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IdealistaApi#idealistaAgencyProfileListings")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IdealistaApi#idealistaAgencyProfileListings")
    e.printStackTrace()
}
```

### Parameters
| **shortName** | **kotlin.String**|  | |
| **market** | **kotlin.String**| es|it|pt | [optional] [default to &quot;es&quot;] |
| **operation** | **kotlin.String**| sale|rent | [optional] |
| **propertyType** | **kotlin.String**| homes|offices|premises|garages|newDevelopments|lands|storageRooms|buildings|bedrooms | [optional] |
| **page** | **kotlin.Int**|  | [optional] [default to 1] |
| **maxItems** | **kotlin.Int**|  | [optional] [default to 30] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **includeListings** | **kotlin.Boolean**|  | [optional] [default to true] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="idealistaGetListingEngagementStats"></a>
# **idealistaGetListingEngagementStats**
> kotlin.Any idealistaGetListingEngagementStats(propertyCode, market, locale)

Get listing engagement stats

Engagement counters for a listing: views, email contacts, sent-to-friend, favourites.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = IdealistaApi()
val propertyCode : kotlin.String = propertyCode_example // kotlin.String | 
val market : kotlin.String = market_example // kotlin.String | es|it|pt
val locale : kotlin.String = locale_example // kotlin.String | Language for stat labels
try {
    val result : kotlin.Any = apiInstance.idealistaGetListingEngagementStats(propertyCode, market, locale)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IdealistaApi#idealistaGetListingEngagementStats")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IdealistaApi#idealistaGetListingEngagementStats")
    e.printStackTrace()
}
```

### Parameters
| **propertyCode** | **kotlin.String**|  | |
| **market** | **kotlin.String**| es|it|pt | [optional] [default to &quot;es&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **locale** | **kotlin.String**| Language for stat labels | [optional] [default to &quot;en&quot;] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="idealistaGetPropertyDetail"></a>
# **idealistaGetPropertyDetail**
> kotlin.Any idealistaGetPropertyDetail(propertyCode, market, locale)

Get property detail

Get a single Idealista listing&#39;s full detail (energy cert, characteristics, media).

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = IdealistaApi()
val propertyCode : kotlin.String = propertyCode_example // kotlin.String | 
val market : kotlin.String = market_example // kotlin.String | es|it|pt
val locale : kotlin.String = locale_example // kotlin.String | Response language (en, es, it, pt)
try {
    val result : kotlin.Any = apiInstance.idealistaGetPropertyDetail(propertyCode, market, locale)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IdealistaApi#idealistaGetPropertyDetail")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IdealistaApi#idealistaGetPropertyDetail")
    e.printStackTrace()
}
```

### Parameters
| **propertyCode** | **kotlin.String**|  | |
| **market** | **kotlin.String**| es|it|pt | [optional] [default to &quot;es&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **locale** | **kotlin.String**| Response language (en, es, it, pt) | [optional] [default to &quot;en&quot;] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="idealistaIdealistaScraperHealthCheck"></a>
# **idealistaIdealistaScraperHealthCheck**
> kotlin.Any idealistaIdealistaScraperHealthCheck()

Idealista scraper health check

Check health of the Idealista scraper service (accepts HEAD for UptimeRobot).

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = IdealistaApi()
try {
    val result : kotlin.Any = apiInstance.idealistaIdealistaScraperHealthCheck()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IdealistaApi#idealistaIdealistaScraperHealthCheck")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IdealistaApi#idealistaIdealistaScraperHealthCheck")
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

<a id="idealistaIdealistaScraperHealthCheckHead"></a>
# **idealistaIdealistaScraperHealthCheckHead**
> kotlin.Any idealistaIdealistaScraperHealthCheckHead()

Idealista scraper health check

Check health of the Idealista scraper service (accepts HEAD for UptimeRobot).

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = IdealistaApi()
try {
    val result : kotlin.Any = apiInstance.idealistaIdealistaScraperHealthCheckHead()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IdealistaApi#idealistaIdealistaScraperHealthCheckHead")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IdealistaApi#idealistaIdealistaScraperHealthCheckHead")
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

<a id="idealistaListMarkets"></a>
# **idealistaListMarkets**
> kotlin.Any idealistaListMarkets()

List markets

List supported Idealista markets (ES, IT, PT).

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = IdealistaApi()
try {
    val result : kotlin.Any = apiInstance.idealistaListMarkets()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IdealistaApi#idealistaListMarkets")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IdealistaApi#idealistaListMarkets")
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

<a id="idealistaResolveLocations"></a>
# **idealistaResolveLocations**
> kotlin.Any idealistaResolveLocations(query, operation, propertyType, market, locale)

Resolve locations

Resolve a free-text query into Idealista location codes for a search.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = IdealistaApi()
val query : kotlin.String = query_example // kotlin.String | Free-text location, e.g. 'sagrada familia'
val operation : kotlin.String = operation_example // kotlin.String | sale|rent
val propertyType : kotlin.String = propertyType_example // kotlin.String | homes|offices|premises|garages|newDevelopments|lands|storageRooms|buildings|bedrooms
val market : kotlin.String = market_example // kotlin.String | es|it|pt
val locale : kotlin.String = locale_example // kotlin.String | Response language (en, es, it, pt)
try {
    val result : kotlin.Any = apiInstance.idealistaResolveLocations(query, operation, propertyType, market, locale)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IdealistaApi#idealistaResolveLocations")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IdealistaApi#idealistaResolveLocations")
    e.printStackTrace()
}
```

### Parameters
| **query** | **kotlin.String**| Free-text location, e.g. &#39;sagrada familia&#39; | |
| **operation** | **kotlin.String**| sale|rent | [optional] [default to &quot;sale&quot;] |
| **propertyType** | **kotlin.String**| homes|offices|premises|garages|newDevelopments|lands|storageRooms|buildings|bedrooms | [optional] [default to &quot;homes&quot;] |
| **market** | **kotlin.String**| es|it|pt | [optional] [default to &quot;es&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **locale** | **kotlin.String**| Response language (en, es, it, pt) | [optional] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="idealistaSearchAllBeatsResultCap"></a>
# **idealistaSearchAllBeatsResultCap**
> kotlin.Any idealistaSearchAllBeatsResultCap(location, operation, propertyType, market, maxResults, minPrice, maxPrice, minSize, maxSize, minRooms, maxRooms, locale)

Search all (beats result cap)

Full inventory for a location, beating Idealista&#39;s ~1800 per-search cap via price-range tiling (deduped). Billed per page fetched.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = IdealistaApi()
val location : kotlin.String = location_example // kotlin.String | Idealista location code (from /suggest)
val operation : kotlin.String = operation_example // kotlin.String | sale|rent
val propertyType : kotlin.String = propertyType_example // kotlin.String | homes|offices|premises|garages|newDevelopments|lands|storageRooms|buildings|bedrooms
val market : kotlin.String = market_example // kotlin.String | es|it|pt
val maxResults : kotlin.Int = 56 // kotlin.Int | 
val minPrice : java.math.BigDecimal = 8.14 // java.math.BigDecimal | 
val maxPrice : java.math.BigDecimal = 8.14 // java.math.BigDecimal | 
val minSize : java.math.BigDecimal = 8.14 // java.math.BigDecimal | 
val maxSize : java.math.BigDecimal = 8.14 // java.math.BigDecimal | 
val minRooms : kotlin.Int = 56 // kotlin.Int | 
val maxRooms : kotlin.Int = 56 // kotlin.Int | 
val locale : kotlin.String = locale_example // kotlin.String | Response language (en, es, it, pt)
try {
    val result : kotlin.Any = apiInstance.idealistaSearchAllBeatsResultCap(location, operation, propertyType, market, maxResults, minPrice, maxPrice, minSize, maxSize, minRooms, maxRooms, locale)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IdealistaApi#idealistaSearchAllBeatsResultCap")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IdealistaApi#idealistaSearchAllBeatsResultCap")
    e.printStackTrace()
}
```

### Parameters
| **location** | **kotlin.String**| Idealista location code (from /suggest) | |
| **operation** | **kotlin.String**| sale|rent | [optional] [default to &quot;sale&quot;] |
| **propertyType** | **kotlin.String**| homes|offices|premises|garages|newDevelopments|lands|storageRooms|buildings|bedrooms | [optional] [default to &quot;homes&quot;] |
| **market** | **kotlin.String**| es|it|pt | [optional] [default to &quot;es&quot;] |
| **maxResults** | **kotlin.Int**|  | [optional] [default to 500] |
| **minPrice** | **java.math.BigDecimal**|  | [optional] |
| **maxPrice** | **java.math.BigDecimal**|  | [optional] |
| **minSize** | **java.math.BigDecimal**|  | [optional] |
| **maxSize** | **java.math.BigDecimal**|  | [optional] |
| **minRooms** | **kotlin.Int**|  | [optional] |
| **maxRooms** | **kotlin.Int**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **locale** | **kotlin.String**| Response language (en, es, it, pt) | [optional] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="idealistaSearchListings"></a>
# **idealistaSearchListings**
> kotlin.Any idealistaSearchListings(location, operation, propertyType, market, page, maxItems, sortBy, sortOrder, minPrice, maxPrice, minSize, maxSize, minRooms, maxRooms, locale)

Search listings

Search Idealista real-estate listings by location code.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = IdealistaApi()
val location : kotlin.String = location_example // kotlin.String | Idealista location code (from /suggest)
val operation : kotlin.String = operation_example // kotlin.String | sale|rent
val propertyType : kotlin.String = propertyType_example // kotlin.String | homes|offices|premises|garages|newDevelopments|lands|storageRooms|buildings|bedrooms
val market : kotlin.String = market_example // kotlin.String | es|it|pt
val page : kotlin.Int = 56 // kotlin.Int | 
val maxItems : kotlin.Int = 56 // kotlin.Int | 
val sortBy : kotlin.String = sortBy_example // kotlin.String | distance|size|rooms|floor|ratioeurm2|price|street|photos|modificationDate|publicationDate|weigh|priceDown|preservationTypeAndPrice|privateAds
val sortOrder : kotlin.String = sortOrder_example // kotlin.String | asc|desc
val minPrice : java.math.BigDecimal = 8.14 // java.math.BigDecimal | 
val maxPrice : java.math.BigDecimal = 8.14 // java.math.BigDecimal | 
val minSize : java.math.BigDecimal = 8.14 // java.math.BigDecimal | 
val maxSize : java.math.BigDecimal = 8.14 // java.math.BigDecimal | 
val minRooms : kotlin.Int = 56 // kotlin.Int | 
val maxRooms : kotlin.Int = 56 // kotlin.Int | 
val locale : kotlin.String = locale_example // kotlin.String | Response language (en, es, it, pt)
try {
    val result : kotlin.Any = apiInstance.idealistaSearchListings(location, operation, propertyType, market, page, maxItems, sortBy, sortOrder, minPrice, maxPrice, minSize, maxSize, minRooms, maxRooms, locale)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IdealistaApi#idealistaSearchListings")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IdealistaApi#idealistaSearchListings")
    e.printStackTrace()
}
```

### Parameters
| **location** | **kotlin.String**| Idealista location code (from /suggest) | |
| **operation** | **kotlin.String**| sale|rent | [optional] [default to &quot;sale&quot;] |
| **propertyType** | **kotlin.String**| homes|offices|premises|garages|newDevelopments|lands|storageRooms|buildings|bedrooms | [optional] [default to &quot;homes&quot;] |
| **market** | **kotlin.String**| es|it|pt | [optional] [default to &quot;es&quot;] |
| **page** | **kotlin.Int**|  | [optional] [default to 1] |
| **maxItems** | **kotlin.Int**|  | [optional] [default to 30] |
| **sortBy** | **kotlin.String**| distance|size|rooms|floor|ratioeurm2|price|street|photos|modificationDate|publicationDate|weigh|priceDown|preservationTypeAndPrice|privateAds | [optional] |
| **sortOrder** | **kotlin.String**| asc|desc | [optional] [default to &quot;desc&quot;] |
| **minPrice** | **java.math.BigDecimal**|  | [optional] |
| **maxPrice** | **java.math.BigDecimal**|  | [optional] |
| **minSize** | **java.math.BigDecimal**|  | [optional] |
| **maxSize** | **java.math.BigDecimal**|  | [optional] |
| **minRooms** | **kotlin.Int**|  | [optional] |
| **maxRooms** | **kotlin.Int**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **locale** | **kotlin.String**| Response language (en, es, it, pt) | [optional] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

