# BookingApi

All URIs are relative to *https://scrapebadger.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**bookingBookingScraperHealthCheck**](BookingApi.md#bookingBookingScraperHealthCheck) | **GET** /v1/booking/health | Booking scraper health check |
| [**bookingBookingScraperHealthCheckHead**](BookingApi.md#bookingBookingScraperHealthCheckHead) | **HEAD** /v1/booking/health | Booking scraper health check |
| [**bookingGetPropertyDetail**](BookingApi.md#bookingGetPropertyDetail) | **GET** /v1/booking/properties/{country_code}/{slug} | Get property detail |
| [**bookingGetPropertyReviews**](BookingApi.md#bookingGetPropertyReviews) | **GET** /v1/booking/properties/{country_code}/{slug}/reviews | Get property reviews |
| [**bookingSearchDestinations**](BookingApi.md#bookingSearchDestinations) | **GET** /v1/booking/destinations | Search destinations |
| [**bookingSearchProperties**](BookingApi.md#bookingSearchProperties) | **GET** /v1/booking/search | Search properties |


<a id="bookingBookingScraperHealthCheck"></a>
# **bookingBookingScraperHealthCheck**
> kotlin.Any bookingBookingScraperHealthCheck()

Booking scraper health check

Check health of the Booking scraper service (accepts HEAD).

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = BookingApi()
try {
    val result : kotlin.Any = apiInstance.bookingBookingScraperHealthCheck()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BookingApi#bookingBookingScraperHealthCheck")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BookingApi#bookingBookingScraperHealthCheck")
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

<a id="bookingBookingScraperHealthCheckHead"></a>
# **bookingBookingScraperHealthCheckHead**
> kotlin.Any bookingBookingScraperHealthCheckHead()

Booking scraper health check

Check health of the Booking scraper service (accepts HEAD).

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = BookingApi()
try {
    val result : kotlin.Any = apiInstance.bookingBookingScraperHealthCheckHead()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BookingApi#bookingBookingScraperHealthCheckHead")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BookingApi#bookingBookingScraperHealthCheckHead")
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

<a id="bookingGetPropertyDetail"></a>
# **bookingGetPropertyDetail**
> kotlin.Any bookingGetPropertyDetail(countryCode, slug, photos, questions, language)

Get property detail

Full detail for one property: description, address and coordinates, star rating, review score with per-category breakdown, facilities, house rules, room types with occupancy and beds, photos and guest Q&amp;A.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = BookingApi()
val countryCode : kotlin.String = countryCode_example // kotlin.String | Two-letter country code, e.g. 'it'
val slug : kotlin.String = slug_example // kotlin.String | Booking page name, e.g. 'hotel-artemide'
val photos : kotlin.Int = 56 // kotlin.Int | Gallery photos to return
val questions : kotlin.Int = 56 // kotlin.Int | Guest Q&A pairs to return
val language : kotlin.String = language_example // kotlin.String | Locale, e.g. en-us, fr
try {
    val result : kotlin.Any = apiInstance.bookingGetPropertyDetail(countryCode, slug, photos, questions, language)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BookingApi#bookingGetPropertyDetail")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BookingApi#bookingGetPropertyDetail")
    e.printStackTrace()
}
```

### Parameters
| **countryCode** | **kotlin.String**| Two-letter country code, e.g. &#39;it&#39; | |
| **slug** | **kotlin.String**| Booking page name, e.g. &#39;hotel-artemide&#39; | |
| **photos** | **kotlin.Int**| Gallery photos to return | [optional] [default to 40] |
| **questions** | **kotlin.Int**| Guest Q&amp;A pairs to return | [optional] [default to 10] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **language** | **kotlin.String**| Locale, e.g. en-us, fr | [optional] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="bookingGetPropertyReviews"></a>
# **bookingGetPropertyReviews**
> kotlin.Any bookingGetPropertyReviews(countryCode, slug, limit, offset, sort, reviewLanguage, guestType, language)

Get property reviews

Paginated guest reviews with score, positive and negative text, stay dates, room type, guest country and type, photos and the partner&#39;s reply.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = BookingApi()
val countryCode : kotlin.String = countryCode_example // kotlin.String | Two-letter country code, e.g. 'it'
val slug : kotlin.String = slug_example // kotlin.String | Booking page name, e.g. 'hotel-artemide'
val limit : kotlin.Int = 56 // kotlin.Int | 
val offset : kotlin.Int = 56 // kotlin.Int | 
val sort : kotlin.String = sort_example // kotlin.String | MOST_RELEVANT | NEWEST_FIRST | OLDEST_FIRST | SCORE_DESC | SCORE_ASC
val reviewLanguage : kotlin.String = reviewLanguage_example // kotlin.String | Only reviews written in this language, e.g. 'fr'
val guestType : kotlin.String = guestType_example // kotlin.String | FAMILIES | COUPLES | GROUP_OF_FRIENDS | SOLO_TRAVELLERS | BUSINESS_TRAVELLERS
val language : kotlin.String = language_example // kotlin.String | Locale for labels, e.g. en-us
try {
    val result : kotlin.Any = apiInstance.bookingGetPropertyReviews(countryCode, slug, limit, offset, sort, reviewLanguage, guestType, language)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BookingApi#bookingGetPropertyReviews")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BookingApi#bookingGetPropertyReviews")
    e.printStackTrace()
}
```

### Parameters
| **countryCode** | **kotlin.String**| Two-letter country code, e.g. &#39;it&#39; | |
| **slug** | **kotlin.String**| Booking page name, e.g. &#39;hotel-artemide&#39; | |
| **limit** | **kotlin.Int**|  | [optional] [default to 25] |
| **offset** | **kotlin.Int**|  | [optional] [default to 0] |
| **sort** | **kotlin.String**| MOST_RELEVANT | NEWEST_FIRST | OLDEST_FIRST | SCORE_DESC | SCORE_ASC | [optional] [default to &quot;MOST_RELEVANT&quot;] |
| **reviewLanguage** | **kotlin.String**| Only reviews written in this language, e.g. &#39;fr&#39; | [optional] |
| **guestType** | **kotlin.String**| FAMILIES | COUPLES | GROUP_OF_FRIENDS | SOLO_TRAVELLERS | BUSINESS_TRAVELLERS | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **language** | **kotlin.String**| Locale for labels, e.g. en-us | [optional] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="bookingSearchDestinations"></a>
# **bookingSearchDestinations**
> kotlin.Any bookingSearchDestinations(query, limit, language)

Search destinations

Resolve a place name to Booking&#39;s &#x60;dest_id&#x60;/&#x60;dest_type&#x60;, with coordinates and country — feed the pair back into /search for an exact match.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = BookingApi()
val query : kotlin.String = query_example // kotlin.String | Free-text place, e.g. 'amsterd'
val limit : kotlin.Int = 56 // kotlin.Int | 
val language : kotlin.String = language_example // kotlin.String | Locale, e.g. en-us, fr
try {
    val result : kotlin.Any = apiInstance.bookingSearchDestinations(query, limit, language)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BookingApi#bookingSearchDestinations")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BookingApi#bookingSearchDestinations")
    e.printStackTrace()
}
```

### Parameters
| **query** | **kotlin.String**| Free-text place, e.g. &#39;amsterd&#39; | |
| **limit** | **kotlin.Int**|  | [optional] [default to 8] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **language** | **kotlin.String**| Locale, e.g. en-us, fr | [optional] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="bookingSearchProperties"></a>
# **bookingSearchProperties**
> kotlin.Any bookingSearchProperties(location, destId, destType, checkin, checkout, adults, children, rooms, offset, limit, sort, filters, currency, language)

Search properties

Search Booking.com properties by destination, with dates, occupancy, sorting and filters. Returns prices, review scores, coordinates, room configuration and photos. Paginate with &#x60;offset&#x60;.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = BookingApi()
val location : kotlin.String = location_example // kotlin.String | Free-text destination, e.g. 'Rome'
val destId : kotlin.Int = 56 // kotlin.Int | Exact destination id (ufi) from /destinations
val destType : kotlin.String = destType_example // kotlin.String | Destination type, e.g. CITY
val checkin : kotlin.String = checkin_example // kotlin.String | Check-in date YYYY-MM-DD
val checkout : kotlin.String = checkout_example // kotlin.String | Check-out date YYYY-MM-DD
val adults : kotlin.Int = 56 // kotlin.Int | 
val children : kotlin.String = children_example // kotlin.String | Comma-separated children ages, e.g. '4,9'
val rooms : kotlin.Int = 56 // kotlin.Int | 
val offset : kotlin.Int = 56 // kotlin.Int | Result offset for pagination
val limit : kotlin.Int = 56 // kotlin.Int | 
val sort : kotlin.String = sort_example // kotlin.String | popularity | price | class_descending | class_ascending | distance_from_search | bayesian_review_score | review_score_and_price | upsort_bh
val filters : kotlin.String = filters_example // kotlin.String | Semicolon-separated Booking filter ids, e.g. 'class=4'
val currency : kotlin.String = currency_example // kotlin.String | ISO currency, e.g. EUR, USD, GBP
val language : kotlin.String = language_example // kotlin.String | Locale, e.g. en-us, fr, de, es
try {
    val result : kotlin.Any = apiInstance.bookingSearchProperties(location, destId, destType, checkin, checkout, adults, children, rooms, offset, limit, sort, filters, currency, language)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BookingApi#bookingSearchProperties")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BookingApi#bookingSearchProperties")
    e.printStackTrace()
}
```

### Parameters
| **location** | **kotlin.String**| Free-text destination, e.g. &#39;Rome&#39; | [optional] |
| **destId** | **kotlin.Int**| Exact destination id (ufi) from /destinations | [optional] |
| **destType** | **kotlin.String**| Destination type, e.g. CITY | [optional] [default to &quot;NO_DEST_TYPE&quot;] |
| **checkin** | **kotlin.String**| Check-in date YYYY-MM-DD | [optional] |
| **checkout** | **kotlin.String**| Check-out date YYYY-MM-DD | [optional] |
| **adults** | **kotlin.Int**|  | [optional] [default to 2] |
| **children** | **kotlin.String**| Comma-separated children ages, e.g. &#39;4,9&#39; | [optional] |
| **rooms** | **kotlin.Int**|  | [optional] [default to 1] |
| **offset** | **kotlin.Int**| Result offset for pagination | [optional] [default to 0] |
| **limit** | **kotlin.Int**|  | [optional] [default to 25] |
| **sort** | **kotlin.String**| popularity | price | class_descending | class_ascending | distance_from_search | bayesian_review_score | review_score_and_price | upsort_bh | [optional] |
| **filters** | **kotlin.String**| Semicolon-separated Booking filter ids, e.g. &#39;class&#x3D;4&#39; | [optional] |
| **currency** | **kotlin.String**| ISO currency, e.g. EUR, USD, GBP | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **language** | **kotlin.String**| Locale, e.g. en-us, fr, de, es | [optional] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

