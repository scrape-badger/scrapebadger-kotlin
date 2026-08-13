# AirbnbApi

All URIs are relative to *https://scrapebadger.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**airbnbAirbnbScraperHealthCheck**](AirbnbApi.md#airbnbAirbnbScraperHealthCheck) | **GET** /v1/airbnb/health | Airbnb scraper health check |
| [**airbnbAirbnbScraperHealthCheckHead**](AirbnbApi.md#airbnbAirbnbScraperHealthCheckHead) | **HEAD** /v1/airbnb/health | Airbnb scraper health check |
| [**airbnbGetAvailabilityCalendar**](AirbnbApi.md#airbnbGetAvailabilityCalendar) | **GET** /v1/airbnb/listings/{room_id}/calendar | Get availability calendar |
| [**airbnbGetExperienceDetail**](AirbnbApi.md#airbnbGetExperienceDetail) | **GET** /v1/airbnb/experiences/{experience_id} | Get experience detail |
| [**airbnbGetListingDetail**](AirbnbApi.md#airbnbGetListingDetail) | **GET** /v1/airbnb/listings/{room_id} | Get listing detail |
| [**airbnbGetListingReviews**](AirbnbApi.md#airbnbGetListingReviews) | **GET** /v1/airbnb/listings/{room_id}/reviews | Get listing reviews |
| [**airbnbSearchExperiences**](AirbnbApi.md#airbnbSearchExperiences) | **GET** /v1/airbnb/experiences | Search experiences |
| [**airbnbSearchStays**](AirbnbApi.md#airbnbSearchStays) | **GET** /v1/airbnb/search | Search stays |


<a id="airbnbAirbnbScraperHealthCheck"></a>
# **airbnbAirbnbScraperHealthCheck**
> kotlin.Any airbnbAirbnbScraperHealthCheck()

Airbnb scraper health check

Check health of the Airbnb scraper service (accepts HEAD).

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = AirbnbApi()
try {
    val result : kotlin.Any = apiInstance.airbnbAirbnbScraperHealthCheck()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AirbnbApi#airbnbAirbnbScraperHealthCheck")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AirbnbApi#airbnbAirbnbScraperHealthCheck")
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

<a id="airbnbAirbnbScraperHealthCheckHead"></a>
# **airbnbAirbnbScraperHealthCheckHead**
> kotlin.Any airbnbAirbnbScraperHealthCheckHead()

Airbnb scraper health check

Check health of the Airbnb scraper service (accepts HEAD).

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = AirbnbApi()
try {
    val result : kotlin.Any = apiInstance.airbnbAirbnbScraperHealthCheckHead()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AirbnbApi#airbnbAirbnbScraperHealthCheckHead")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AirbnbApi#airbnbAirbnbScraperHealthCheckHead")
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

<a id="airbnbGetAvailabilityCalendar"></a>
# **airbnbGetAvailabilityCalendar**
> kotlin.Any airbnbGetAvailabilityCalendar(roomId, month, year, months, currency, locale)

Get availability calendar

Day-by-day availability for up to 12 months: bookable, check-in/out windows and min/max nights per date.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = AirbnbApi()
val roomId : kotlin.String = roomId_example // kotlin.String | 
val month : kotlin.Int = 56 // kotlin.Int | Start month (1-12)
val year : kotlin.Int = 56 // kotlin.Int | Start year
val months : kotlin.Int = 56 // kotlin.Int | Number of months (max 12)
val currency : kotlin.String = currency_example // kotlin.String | 
val locale : kotlin.String = locale_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.airbnbGetAvailabilityCalendar(roomId, month, year, months, currency, locale)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AirbnbApi#airbnbGetAvailabilityCalendar")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AirbnbApi#airbnbGetAvailabilityCalendar")
    e.printStackTrace()
}
```

### Parameters
| **roomId** | **kotlin.String**|  | |
| **month** | **kotlin.Int**| Start month (1-12) | [optional] [default to 1] |
| **year** | **kotlin.Int**| Start year | [optional] [default to 2026] |
| **months** | **kotlin.Int**| Number of months (max 12) | [optional] [default to 12] |
| **currency** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **locale** | **kotlin.String**|  | [optional] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="airbnbGetExperienceDetail"></a>
# **airbnbGetExperienceDetail**
> kotlin.Any airbnbGetExperienceDetail(experienceId, adults, children, infants, currency, locale)

Get experience detail

Full detail for one experience: description, rating, host, location and photos.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = AirbnbApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
val adults : kotlin.Int = 56 // kotlin.Int | 
val children : kotlin.Int = 56 // kotlin.Int | 
val infants : kotlin.Int = 56 // kotlin.Int | 
val currency : kotlin.String = currency_example // kotlin.String | 
val locale : kotlin.String = locale_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.airbnbGetExperienceDetail(experienceId, adults, children, infants, currency, locale)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AirbnbApi#airbnbGetExperienceDetail")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AirbnbApi#airbnbGetExperienceDetail")
    e.printStackTrace()
}
```

### Parameters
| **experienceId** | **kotlin.String**|  | |
| **adults** | **kotlin.Int**|  | [optional] [default to 1] |
| **children** | **kotlin.Int**|  | [optional] [default to 0] |
| **infants** | **kotlin.Int**|  | [optional] [default to 0] |
| **currency** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **locale** | **kotlin.String**|  | [optional] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="airbnbGetListingDetail"></a>
# **airbnbGetListingDetail**
> kotlin.Any airbnbGetListingDetail(roomId, adults, currency, locale)

Get listing detail

Full detail for one listing: amenities, house rules, host, ratings, coordinates and photos.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = AirbnbApi()
val roomId : kotlin.String = roomId_example // kotlin.String | 
val adults : kotlin.Int = 56 // kotlin.Int | 
val currency : kotlin.String = currency_example // kotlin.String | 
val locale : kotlin.String = locale_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.airbnbGetListingDetail(roomId, adults, currency, locale)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AirbnbApi#airbnbGetListingDetail")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AirbnbApi#airbnbGetListingDetail")
    e.printStackTrace()
}
```

### Parameters
| **roomId** | **kotlin.String**|  | |
| **adults** | **kotlin.Int**|  | [optional] [default to 1] |
| **currency** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **locale** | **kotlin.String**|  | [optional] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="airbnbGetListingReviews"></a>
# **airbnbGetListingReviews**
> kotlin.Any airbnbGetListingReviews(roomId, limit, offset, sort, currency, locale)

Get listing reviews

Paginated guest reviews with reviewer, rating, date, text and host response.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = AirbnbApi()
val roomId : kotlin.String = roomId_example // kotlin.String | 
val limit : kotlin.Int = 56 // kotlin.Int | 
val offset : kotlin.Int = 56 // kotlin.Int | 
val sort : kotlin.String = sort_example // kotlin.String | MOST_RECENT | RATING_DESC | RATING_ASC
val currency : kotlin.String = currency_example // kotlin.String | 
val locale : kotlin.String = locale_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.airbnbGetListingReviews(roomId, limit, offset, sort, currency, locale)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AirbnbApi#airbnbGetListingReviews")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AirbnbApi#airbnbGetListingReviews")
    e.printStackTrace()
}
```

### Parameters
| **roomId** | **kotlin.String**|  | |
| **limit** | **kotlin.Int**|  | [optional] [default to 24] |
| **offset** | **kotlin.Int**|  | [optional] [default to 0] |
| **sort** | **kotlin.String**| MOST_RECENT | RATING_DESC | RATING_ASC | [optional] [default to &quot;MOST_RECENT&quot;] |
| **currency** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **locale** | **kotlin.String**|  | [optional] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="airbnbSearchExperiences"></a>
# **airbnbSearchExperiences**
> kotlin.Any airbnbSearchExperiences(location, cursor, currency, locale)

Search experiences

Search Airbnb Experiences by location.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = AirbnbApi()
val location : kotlin.String = location_example // kotlin.String | Free-text place, e.g. 'Rome, Italy'
val cursor : kotlin.String = cursor_example // kotlin.String | next_page_cursor from a prior response
val currency : kotlin.String = currency_example // kotlin.String | 
val locale : kotlin.String = locale_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.airbnbSearchExperiences(location, cursor, currency, locale)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AirbnbApi#airbnbSearchExperiences")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AirbnbApi#airbnbSearchExperiences")
    e.printStackTrace()
}
```

### Parameters
| **location** | **kotlin.String**| Free-text place, e.g. &#39;Rome, Italy&#39; | |
| **cursor** | **kotlin.String**| next_page_cursor from a prior response | [optional] |
| **currency** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **locale** | **kotlin.String**|  | [optional] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="airbnbSearchStays"></a>
# **airbnbSearchStays**
> kotlin.Any airbnbSearchStays(location, neLat, neLng, swLat, swLng, checkIn, checkOut, adults, children, infants, pets, priceMin, priceMax, minBedrooms, minBeds, minBathrooms, roomType, cursor, limit, currency, locale)

Search stays

Search Airbnb stays by place name and/or map bounding box, with dates, guests, price and property filters. Paginate with the &#x60;cursor&#x60;.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = AirbnbApi()
val location : kotlin.String = location_example // kotlin.String | Free-text place, e.g. 'Paris, France'
val neLat : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Map bounding-box NE latitude
val neLng : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Map bounding-box NE longitude
val swLat : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Map bounding-box SW latitude
val swLng : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Map bounding-box SW longitude
val checkIn : kotlin.String = checkIn_example // kotlin.String | Check-in date YYYY-MM-DD
val checkOut : kotlin.String = checkOut_example // kotlin.String | Check-out date YYYY-MM-DD
val adults : kotlin.Int = 56 // kotlin.Int | 
val children : kotlin.Int = 56 // kotlin.Int | 
val infants : kotlin.Int = 56 // kotlin.Int | 
val pets : kotlin.Int = 56 // kotlin.Int | 
val priceMin : kotlin.Int = 56 // kotlin.Int | 
val priceMax : kotlin.Int = 56 // kotlin.Int | 
val minBedrooms : kotlin.Int = 56 // kotlin.Int | 
val minBeds : kotlin.Int = 56 // kotlin.Int | 
val minBathrooms : kotlin.Int = 56 // kotlin.Int | 
val roomType : kotlin.String = roomType_example // kotlin.String | e.g. 'Entire home/apt', 'Private room'
val cursor : kotlin.String = cursor_example // kotlin.String | next_page_cursor from a prior response
val limit : kotlin.Int = 56 // kotlin.Int | 
val currency : kotlin.String = currency_example // kotlin.String | ISO currency, e.g. USD, EUR
val locale : kotlin.String = locale_example // kotlin.String | Locale, e.g. en, fr
try {
    val result : kotlin.Any = apiInstance.airbnbSearchStays(location, neLat, neLng, swLat, swLng, checkIn, checkOut, adults, children, infants, pets, priceMin, priceMax, minBedrooms, minBeds, minBathrooms, roomType, cursor, limit, currency, locale)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AirbnbApi#airbnbSearchStays")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AirbnbApi#airbnbSearchStays")
    e.printStackTrace()
}
```

### Parameters
| **location** | **kotlin.String**| Free-text place, e.g. &#39;Paris, France&#39; | [optional] |
| **neLat** | **java.math.BigDecimal**| Map bounding-box NE latitude | [optional] |
| **neLng** | **java.math.BigDecimal**| Map bounding-box NE longitude | [optional] |
| **swLat** | **java.math.BigDecimal**| Map bounding-box SW latitude | [optional] |
| **swLng** | **java.math.BigDecimal**| Map bounding-box SW longitude | [optional] |
| **checkIn** | **kotlin.String**| Check-in date YYYY-MM-DD | [optional] |
| **checkOut** | **kotlin.String**| Check-out date YYYY-MM-DD | [optional] |
| **adults** | **kotlin.Int**|  | [optional] [default to 1] |
| **children** | **kotlin.Int**|  | [optional] [default to 0] |
| **infants** | **kotlin.Int**|  | [optional] [default to 0] |
| **pets** | **kotlin.Int**|  | [optional] [default to 0] |
| **priceMin** | **kotlin.Int**|  | [optional] |
| **priceMax** | **kotlin.Int**|  | [optional] |
| **minBedrooms** | **kotlin.Int**|  | [optional] |
| **minBeds** | **kotlin.Int**|  | [optional] |
| **minBathrooms** | **kotlin.Int**|  | [optional] |
| **roomType** | **kotlin.String**| e.g. &#39;Entire home/apt&#39;, &#39;Private room&#39; | [optional] |
| **cursor** | **kotlin.String**| next_page_cursor from a prior response | [optional] |
| **limit** | **kotlin.Int**|  | [optional] [default to 18] |
| **currency** | **kotlin.String**| ISO currency, e.g. USD, EUR | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **locale** | **kotlin.String**| Locale, e.g. en, fr | [optional] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

