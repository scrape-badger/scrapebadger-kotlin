# ImmobiliareApi

All URIs are relative to *https://scrapebadger.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**immobiliareGetAgencyProfile**](ImmobiliareApi.md#immobiliareGetAgencyProfile) | **GET** /v1/immobiliare/agencies/{agency_id} | Get agency profile |
| [**immobiliareGetAnAgencySListings**](ImmobiliareApi.md#immobiliareGetAnAgencySListings) | **GET** /v1/immobiliare/agencies/{agency_id}/listings | Get an agency&#39;s listings |
| [**immobiliareGetListingDetail**](ImmobiliareApi.md#immobiliareGetListingDetail) | **GET** /v1/immobiliare/listings/{listing_id} | Get listing detail |
| [**immobiliareImmobiliareScraperHealthCheck**](ImmobiliareApi.md#immobiliareImmobiliareScraperHealthCheck) | **GET** /v1/immobiliare/health | Immobiliare scraper health check |
| [**immobiliareImmobiliareScraperHealthCheckHead**](ImmobiliareApi.md#immobiliareImmobiliareScraperHealthCheckHead) | **HEAD** /v1/immobiliare/health | Immobiliare scraper health check |
| [**immobiliareListFilterEnums**](ImmobiliareApi.md#immobiliareListFilterEnums) | **GET** /v1/immobiliare/reference | List filter enums |
| [**immobiliareListMarkets**](ImmobiliareApi.md#immobiliareListMarkets) | **GET** /v1/immobiliare/markets | List markets |
| [**immobiliareLocationAutocomplete**](ImmobiliareApi.md#immobiliareLocationAutocomplete) | **GET** /v1/immobiliare/autocomplete | Location autocomplete |
| [**immobiliarePriceMTimeSeries**](ImmobiliareApi.md#immobiliarePriceMTimeSeries) | **GET** /v1/immobiliare/market-insights/prices | Price €/m² time series |
| [**immobiliareSearchListings**](ImmobiliareApi.md#immobiliareSearchListings) | **GET** /v1/immobiliare/search | Search listings |


<a id="immobiliareGetAgencyProfile"></a>
# **immobiliareGetAgencyProfile**
> kotlin.Any immobiliareGetAgencyProfile(agencyId, market)

Get agency profile

Public agency/advertiser profile.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = ImmobiliareApi()
val agencyId : kotlin.Int = 56 // kotlin.Int | 
val market : kotlin.String = market_example // kotlin.String | it | es | gr | lu
try {
    val result : kotlin.Any = apiInstance.immobiliareGetAgencyProfile(agencyId, market)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ImmobiliareApi#immobiliareGetAgencyProfile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ImmobiliareApi#immobiliareGetAgencyProfile")
    e.printStackTrace()
}
```

### Parameters
| **agencyId** | **kotlin.Int**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **market** | **kotlin.String**| it | es | gr | lu | [optional] [default to &quot;it&quot;] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="immobiliareGetAnAgencySListings"></a>
# **immobiliareGetAnAgencySListings**
> kotlin.Any immobiliareGetAnAgencySListings(agencyId, market, `contract`, page)

Get an agency&#39;s listings

An agency&#39;s active listings.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = ImmobiliareApi()
val agencyId : kotlin.Int = 56 // kotlin.Int | 
val market : kotlin.String = market_example // kotlin.String | it | es | gr | lu
val `contract` : kotlin.String = `contract`_example // kotlin.String | sale | rent
val page : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.Any = apiInstance.immobiliareGetAnAgencySListings(agencyId, market, `contract`, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ImmobiliareApi#immobiliareGetAnAgencySListings")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ImmobiliareApi#immobiliareGetAnAgencySListings")
    e.printStackTrace()
}
```

### Parameters
| **agencyId** | **kotlin.Int**|  | |
| **market** | **kotlin.String**| it | es | gr | lu | [optional] [default to &quot;it&quot;] |
| **&#x60;contract&#x60;** | **kotlin.String**| sale | rent | [optional] [default to &quot;sale&quot;] |
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

<a id="immobiliareGetListingDetail"></a>
# **immobiliareGetListingDetail**
> kotlin.Any immobiliareGetListingDetail(listingId, market)

Get listing detail

Full detail for a single listing.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = ImmobiliareApi()
val listingId : kotlin.Int = 56 // kotlin.Int | 
val market : kotlin.String = market_example // kotlin.String | it | es | gr | lu
try {
    val result : kotlin.Any = apiInstance.immobiliareGetListingDetail(listingId, market)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ImmobiliareApi#immobiliareGetListingDetail")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ImmobiliareApi#immobiliareGetListingDetail")
    e.printStackTrace()
}
```

### Parameters
| **listingId** | **kotlin.Int**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **market** | **kotlin.String**| it | es | gr | lu | [optional] [default to &quot;it&quot;] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="immobiliareImmobiliareScraperHealthCheck"></a>
# **immobiliareImmobiliareScraperHealthCheck**
> kotlin.Any immobiliareImmobiliareScraperHealthCheck()

Immobiliare scraper health check

Check health of the Immobiliare scraper service (accepts HEAD).

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = ImmobiliareApi()
try {
    val result : kotlin.Any = apiInstance.immobiliareImmobiliareScraperHealthCheck()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ImmobiliareApi#immobiliareImmobiliareScraperHealthCheck")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ImmobiliareApi#immobiliareImmobiliareScraperHealthCheck")
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

<a id="immobiliareImmobiliareScraperHealthCheckHead"></a>
# **immobiliareImmobiliareScraperHealthCheckHead**
> kotlin.Any immobiliareImmobiliareScraperHealthCheckHead()

Immobiliare scraper health check

Check health of the Immobiliare scraper service (accepts HEAD).

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = ImmobiliareApi()
try {
    val result : kotlin.Any = apiInstance.immobiliareImmobiliareScraperHealthCheckHead()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ImmobiliareApi#immobiliareImmobiliareScraperHealthCheckHead")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ImmobiliareApi#immobiliareImmobiliareScraperHealthCheckHead")
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

<a id="immobiliareListFilterEnums"></a>
# **immobiliareListFilterEnums**
> kotlin.Any immobiliareListFilterEnums()

List filter enums

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = ImmobiliareApi()
try {
    val result : kotlin.Any = apiInstance.immobiliareListFilterEnums()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ImmobiliareApi#immobiliareListFilterEnums")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ImmobiliareApi#immobiliareListFilterEnums")
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

<a id="immobiliareListMarkets"></a>
# **immobiliareListMarkets**
> kotlin.Any immobiliareListMarkets()

List markets

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = ImmobiliareApi()
try {
    val result : kotlin.Any = apiInstance.immobiliareListMarkets()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ImmobiliareApi#immobiliareListMarkets")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ImmobiliareApi#immobiliareListMarkets")
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

<a id="immobiliareLocationAutocomplete"></a>
# **immobiliareLocationAutocomplete**
> kotlin.Any immobiliareLocationAutocomplete(query, market)

Location autocomplete

Resolve a place name to region/province/city ids usable in search.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = ImmobiliareApi()
val query : kotlin.String = query_example // kotlin.String | Free-text place name, e.g. 'Milano'
val market : kotlin.String = market_example // kotlin.String | it | es | gr | lu
try {
    val result : kotlin.Any = apiInstance.immobiliareLocationAutocomplete(query, market)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ImmobiliareApi#immobiliareLocationAutocomplete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ImmobiliareApi#immobiliareLocationAutocomplete")
    e.printStackTrace()
}
```

### Parameters
| **query** | **kotlin.String**| Free-text place name, e.g. &#39;Milano&#39; | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **market** | **kotlin.String**| it | es | gr | lu | [optional] [default to &quot;it&quot;] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="immobiliarePriceMTimeSeries"></a>
# **immobiliarePriceMTimeSeries**
> kotlin.Any immobiliarePriceMTimeSeries(regionId, market, provinceId, cityId, `contract`)

Price €/m² time series

Historical €/m² price statistics for an area.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = ImmobiliareApi()
val regionId : kotlin.String = regionId_example // kotlin.String | Region id, e.g. 'lom'
val market : kotlin.String = market_example // kotlin.String | it | es | gr | lu
val provinceId : kotlin.String = provinceId_example // kotlin.String | Province id, e.g. 'MI'
val cityId : kotlin.String = cityId_example // kotlin.String | City id (idComune)
val `contract` : kotlin.String = `contract`_example // kotlin.String | sale | rent
try {
    val result : kotlin.Any = apiInstance.immobiliarePriceMTimeSeries(regionId, market, provinceId, cityId, `contract`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ImmobiliareApi#immobiliarePriceMTimeSeries")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ImmobiliareApi#immobiliarePriceMTimeSeries")
    e.printStackTrace()
}
```

### Parameters
| **regionId** | **kotlin.String**| Region id, e.g. &#39;lom&#39; | |
| **market** | **kotlin.String**| it | es | gr | lu | [optional] [default to &quot;it&quot;] |
| **provinceId** | **kotlin.String**| Province id, e.g. &#39;MI&#39; | [optional] |
| **cityId** | **kotlin.String**| City id (idComune) | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **&#x60;contract&#x60;** | **kotlin.String**| sale | rent | [optional] [default to &quot;sale&quot;] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="immobiliareSearchListings"></a>
# **immobiliareSearchListings**
> kotlin.Any immobiliareSearchListings(market, location, regionId, provinceId, cityId, `contract`, category, priceMin, priceMax, surfaceMin, surfaceMax, roomsMin, roomsMax, bathroomsMin, sort, page)

Search listings

Search Immobiliare-group listings (scope by location + contract + filters).

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = ImmobiliareApi()
val market : kotlin.String = market_example // kotlin.String | it | es | gr | lu
val location : kotlin.String = location_example // kotlin.String | Free-text place (auto-resolved)
val regionId : kotlin.String = regionId_example // kotlin.String | fkRegione (from /autocomplete)
val provinceId : kotlin.String = provinceId_example // kotlin.String | idProvincia (from /autocomplete)
val cityId : kotlin.String = cityId_example // kotlin.String | idComune (from /autocomplete)
val `contract` : kotlin.String = `contract`_example // kotlin.String | sale | rent
val category : kotlin.String = category_example // kotlin.String | see /reference
val priceMin : kotlin.Int = 56 // kotlin.Int | 
val priceMax : kotlin.Int = 56 // kotlin.Int | 
val surfaceMin : kotlin.Int = 56 // kotlin.Int | 
val surfaceMax : kotlin.Int = 56 // kotlin.Int | 
val roomsMin : kotlin.Int = 56 // kotlin.Int | 
val roomsMax : kotlin.Int = 56 // kotlin.Int | 
val bathroomsMin : kotlin.Int = 56 // kotlin.Int | 
val sort : kotlin.String = sort_example // kotlin.String | see /reference
val page : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.Any = apiInstance.immobiliareSearchListings(market, location, regionId, provinceId, cityId, `contract`, category, priceMin, priceMax, surfaceMin, surfaceMax, roomsMin, roomsMax, bathroomsMin, sort, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ImmobiliareApi#immobiliareSearchListings")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ImmobiliareApi#immobiliareSearchListings")
    e.printStackTrace()
}
```

### Parameters
| **market** | **kotlin.String**| it | es | gr | lu | [optional] [default to &quot;it&quot;] |
| **location** | **kotlin.String**| Free-text place (auto-resolved) | [optional] |
| **regionId** | **kotlin.String**| fkRegione (from /autocomplete) | [optional] |
| **provinceId** | **kotlin.String**| idProvincia (from /autocomplete) | [optional] |
| **cityId** | **kotlin.String**| idComune (from /autocomplete) | [optional] |
| **&#x60;contract&#x60;** | **kotlin.String**| sale | rent | [optional] [default to &quot;sale&quot;] |
| **category** | **kotlin.String**| see /reference | [optional] [default to &quot;residential&quot;] |
| **priceMin** | **kotlin.Int**|  | [optional] |
| **priceMax** | **kotlin.Int**|  | [optional] |
| **surfaceMin** | **kotlin.Int**|  | [optional] |
| **surfaceMax** | **kotlin.Int**|  | [optional] |
| **roomsMin** | **kotlin.Int**|  | [optional] |
| **roomsMax** | **kotlin.Int**|  | [optional] |
| **bathroomsMin** | **kotlin.Int**|  | [optional] |
| **sort** | **kotlin.String**| see /reference | [optional] [default to &quot;relevance&quot;] |
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

