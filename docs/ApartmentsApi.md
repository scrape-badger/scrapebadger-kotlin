# ApartmentsApi

All URIs are relative to *https://scrapebadger.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**apartmentsApartmentsScraperHealthCheck**](ApartmentsApi.md#apartmentsApartmentsScraperHealthCheck) | **GET** /v1/apartments/health | Apartments scraper health check |
| [**apartmentsApartmentsScraperHealthCheckHead**](ApartmentsApi.md#apartmentsApartmentsScraperHealthCheckHead) | **HEAD** /v1/apartments/health | Apartments scraper health check |
| [**apartmentsGetPropertyDetailBySlugId**](ApartmentsApi.md#apartmentsGetPropertyDetailBySlugId) | **GET** /v1/apartments/properties/{slug}/{property_id} | Get property detail by slug + id |
| [**apartmentsGetPropertyDetailByUrl**](ApartmentsApi.md#apartmentsGetPropertyDetailByUrl) | **GET** /v1/apartments/property | Get property detail by URL |
| [**apartmentsSearchRentalListings**](ApartmentsApi.md#apartmentsSearchRentalListings) | **GET** /v1/apartments/search | Search rental listings |


<a id="apartmentsApartmentsScraperHealthCheck"></a>
# **apartmentsApartmentsScraperHealthCheck**
> kotlin.Any apartmentsApartmentsScraperHealthCheck()

Apartments scraper health check

Check health of the Apartments scraper service (accepts HEAD for UptimeRobot).

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = ApartmentsApi()
try {
    val result : kotlin.Any = apiInstance.apartmentsApartmentsScraperHealthCheck()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ApartmentsApi#apartmentsApartmentsScraperHealthCheck")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ApartmentsApi#apartmentsApartmentsScraperHealthCheck")
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

<a id="apartmentsApartmentsScraperHealthCheckHead"></a>
# **apartmentsApartmentsScraperHealthCheckHead**
> kotlin.Any apartmentsApartmentsScraperHealthCheckHead()

Apartments scraper health check

Check health of the Apartments scraper service (accepts HEAD for UptimeRobot).

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = ApartmentsApi()
try {
    val result : kotlin.Any = apiInstance.apartmentsApartmentsScraperHealthCheckHead()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ApartmentsApi#apartmentsApartmentsScraperHealthCheckHead")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ApartmentsApi#apartmentsApartmentsScraperHealthCheckHead")
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

<a id="apartmentsGetPropertyDetailBySlugId"></a>
# **apartmentsGetPropertyDetailBySlugId**
> kotlin.Any apartmentsGetPropertyDetailBySlugId(slug, propertyId)

Get property detail by slug + id

Get a property by its SEO slug and 7-character listing id.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = ApartmentsApi()
val slug : kotlin.String = slug_example // kotlin.String | 
val propertyId : kotlin.String = propertyId_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.apartmentsGetPropertyDetailBySlugId(slug, propertyId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ApartmentsApi#apartmentsGetPropertyDetailBySlugId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ApartmentsApi#apartmentsGetPropertyDetailBySlugId")
    e.printStackTrace()
}
```

### Parameters
| **slug** | **kotlin.String**|  | |
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

<a id="apartmentsGetPropertyDetailByUrl"></a>
# **apartmentsGetPropertyDetailByUrl**
> kotlin.Any apartmentsGetPropertyDetailByUrl(url)

Get property detail by URL

Get an apartments.com property with full per-unit pricing and availability.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = ApartmentsApi()
val url : kotlin.String = url_example // kotlin.String | Full apartments.com property URL, e.g. https://www.apartments.com/urbane-kansas-city-mo/wcd6e5k/
try {
    val result : kotlin.Any = apiInstance.apartmentsGetPropertyDetailByUrl(url)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ApartmentsApi#apartmentsGetPropertyDetailByUrl")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ApartmentsApi#apartmentsGetPropertyDetailByUrl")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **url** | **kotlin.String**| Full apartments.com property URL, e.g. https://www.apartments.com/urbane-kansas-city-mo/wcd6e5k/ | |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apartmentsSearchRentalListings"></a>
# **apartmentsSearchRentalListings**
> kotlin.Any apartmentsSearchRentalListings(location, page, beds, minPrice, maxPrice)

Search rental listings

Search apartments.com for rental properties. 40 cards per page.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = ApartmentsApi()
val location : kotlin.String = location_example // kotlin.String | apartments.com location slug, e.g. 'kansas-city-mo'
val page : kotlin.Int = 56 // kotlin.Int | 
val beds : kotlin.Int = 56 // kotlin.Int | 0=studio, 1-4 bedrooms
val minPrice : kotlin.Int = 56 // kotlin.Int | 
val maxPrice : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.Any = apiInstance.apartmentsSearchRentalListings(location, page, beds, minPrice, maxPrice)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ApartmentsApi#apartmentsSearchRentalListings")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ApartmentsApi#apartmentsSearchRentalListings")
    e.printStackTrace()
}
```

### Parameters
| **location** | **kotlin.String**| apartments.com location slug, e.g. &#39;kansas-city-mo&#39; | |
| **page** | **kotlin.Int**|  | [optional] [default to 1] |
| **beds** | **kotlin.Int**| 0&#x3D;studio, 1-4 bedrooms | [optional] |
| **minPrice** | **kotlin.Int**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **maxPrice** | **kotlin.Int**|  | [optional] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

