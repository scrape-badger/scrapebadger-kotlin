# GoogleApi

All URIs are relative to *https://scrapebadger.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**googleGetAuthorCitationsPerYearChart**](GoogleApi.md#googleGetAuthorCitationsPerYearChart) | **GET** /v1/google/scholar/author/citation | Get author citations-per-year chart |
| [**googleGetBusinessPosts**](GoogleApi.md#googleGetBusinessPosts) | **GET** /v1/google/maps/posts | Get business posts |
| [**googleGetCitationFormatsForAScholarPaper**](GoogleApi.md#googleGetCitationFormatsForAScholarPaper) | **GET** /v1/google/scholar/cite | Get citation formats for a Scholar paper |
| [**googleGetPlaceDetails**](GoogleApi.md#googleGetPlaceDetails) | **GET** /v1/google/maps/place | Get place details |
| [**googleGetPlacePhotos**](GoogleApi.md#googleGetPlacePhotos) | **GET** /v1/google/maps/photos | Get place photos |
| [**googleGetPlaceReviews**](GoogleApi.md#googleGetPlaceReviews) | **GET** /v1/google/maps/reviews | Get place reviews |
| [**googleGetScholarAuthorProfile**](GoogleApi.md#googleGetScholarAuthorProfile) | **GET** /v1/google/scholar/author | Get Scholar author profile |
| [**googleGetStockIndexQuote**](GoogleApi.md#googleGetStockIndexQuote) | **GET** /v1/google/finance/quote | Get stock/index quote |
| [**googleGoogleAiModeSearch**](GoogleApi.md#googleGoogleAiModeSearch) | **GET** /v1/google/ai-mode/search | Google AI Mode search |
| [**googleGoogleAiOverviewInlineSerpBlock**](GoogleApi.md#googleGoogleAiOverviewInlineSerpBlock) | **GET** /v1/google/ai-overview | Google AI Overview (inline SERP block) |
| [**googleGoogleFlightsCalendarCheapestFarePerDate**](GoogleApi.md#googleGoogleFlightsCalendarCheapestFarePerDate) | **GET** /v1/google/flights/calendar | Google Flights calendar — cheapest fare per date |
| [**googleGoogleFlightsSearch**](GoogleApi.md#googleGoogleFlightsSearch) | **GET** /v1/google/flights/search | Google Flights search |
| [**googleGoogleLensVisualSearch**](GoogleApi.md#googleGoogleLensVisualSearch) | **GET** /v1/google/lens/search | Google Lens visual search |
| [**googleGoogleScraperHealthCheck**](GoogleApi.md#googleGoogleScraperHealthCheck) | **GET** /v1/google/health | Google scraper health check |
| [**googleGoogleScraperHealthCheckHead**](GoogleApi.md#googleGoogleScraperHealthCheckHead) | **HEAD** /v1/google/health | Google scraper health check |
| [**googleGoogleSearchSuggestions**](GoogleApi.md#googleGoogleSearchSuggestions) | **GET** /v1/google/autocomplete | Google search suggestions |
| [**googleGoogleShortsSearch**](GoogleApi.md#googleGoogleShortsSearch) | **GET** /v1/google/shorts/search | Google Shorts search |
| [**googleGoogleWebSearch**](GoogleApi.md#googleGoogleWebSearch) | **GET** /v1/google/search | Google web search |
| [**googleHotelDetails**](GoogleApi.md#googleHotelDetails) | **GET** /v1/google/hotels/details | Hotel details |
| [**googleImmersiveProductDetail**](GoogleApi.md#googleImmersiveProductDetail) | **GET** /v1/google/products/detail | Immersive product detail |
| [**googleInterestByRegion**](GoogleApi.md#googleInterestByRegion) | **GET** /v1/google/trends/regions | Interest by region |
| [**googleInterestOverTime**](GoogleApi.md#googleInterestOverTime) | **GET** /v1/google/trends/interest | Interest over time |
| [**googleMultiSellerOffersByBarcode**](GoogleApi.md#googleMultiSellerOffersByBarcode) | **GET** /v1/google/shopping/offers | Multi-seller offers by barcode |
| [**googleNewsByTopic**](GoogleApi.md#googleNewsByTopic) | **GET** /v1/google/news/topics | News by topic |
| [**googlePatentDetails**](GoogleApi.md#googlePatentDetails) | **GET** /v1/google/patents/detail | Patent details |
| [**googleRelatedTopicsQueries**](GoogleApi.md#googleRelatedTopicsQueries) | **GET** /v1/google/trends/related | Related topics &amp; queries |
| [**googleSearchGoogleImages**](GoogleApi.md#googleSearchGoogleImages) | **GET** /v1/google/images/search | Search Google Images |
| [**googleSearchGoogleJobs**](GoogleApi.md#googleSearchGoogleJobs) | **GET** /v1/google/jobs/search | Search Google Jobs |
| [**googleSearchGoogleMapsPlaces**](GoogleApi.md#googleSearchGoogleMapsPlaces) | **GET** /v1/google/maps/search | Search Google Maps places |
| [**googleSearchGoogleNews**](GoogleApi.md#googleSearchGoogleNews) | **GET** /v1/google/news/search | Search Google News |
| [**googleSearchGoogleScholar**](GoogleApi.md#googleSearchGoogleScholar) | **GET** /v1/google/scholar/search | Search Google Scholar |
| [**googleSearchGoogleVideos**](GoogleApi.md#googleSearchGoogleVideos) | **GET** /v1/google/videos/search | Search Google Videos |
| [**googleSearchHotels**](GoogleApi.md#googleSearchHotels) | **GET** /v1/google/hotels/search | Search hotels |
| [**googleSearchPatents**](GoogleApi.md#googleSearchPatents) | **GET** /v1/google/patents/search | Search patents |
| [**googleSearchProducts**](GoogleApi.md#googleSearchProducts) | **GET** /v1/google/shopping/search | Search products |
| [**googleSearchScholarAuthorProfiles**](GoogleApi.md#googleSearchScholarAuthorProfiles) | **GET** /v1/google/scholar/profiles | Search Scholar author profiles |
| [**googleTrendingNews**](GoogleApi.md#googleTrendingNews) | **GET** /v1/google/news/trending | Trending news |
| [**googleTrendingSearches**](GoogleApi.md#googleTrendingSearches) | **GET** /v1/google/trends/trending | Trending searches |
| [**googleTrendsTopicAutocomplete**](GoogleApi.md#googleTrendsTopicAutocomplete) | **GET** /v1/google/trends/autocomplete | Trends topic autocomplete |


<a id="googleGetAuthorCitationsPerYearChart"></a>
# **googleGetAuthorCitationsPerYearChart**
> kotlin.Any googleGetAuthorCitationsPerYearChart(authorId, hl)

Get author citations-per-year chart

Return the citations-per-year chart for a Google Scholar author.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = GoogleApi()
val authorId : kotlin.String = authorId_example // kotlin.String | Scholar user ID
val hl : kotlin.String = hl_example // kotlin.String | Language code
try {
    val result : kotlin.Any = apiInstance.googleGetAuthorCitationsPerYearChart(authorId, hl)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GoogleApi#googleGetAuthorCitationsPerYearChart")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GoogleApi#googleGetAuthorCitationsPerYearChart")
    e.printStackTrace()
}
```

### Parameters
| **authorId** | **kotlin.String**| Scholar user ID | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **hl** | **kotlin.String**| Language code | [optional] [default to &quot;en&quot;] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="googleGetBusinessPosts"></a>
# **googleGetBusinessPosts**
> kotlin.Any googleGetBusinessPosts(dataId, nextPageToken)

Get business posts

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = GoogleApi()
val dataId : kotlin.String = dataId_example // kotlin.String | Maps data ID
val nextPageToken : kotlin.String = nextPageToken_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.googleGetBusinessPosts(dataId, nextPageToken)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GoogleApi#googleGetBusinessPosts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GoogleApi#googleGetBusinessPosts")
    e.printStackTrace()
}
```

### Parameters
| **dataId** | **kotlin.String**| Maps data ID | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **nextPageToken** | **kotlin.String**|  | [optional] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="googleGetCitationFormatsForAScholarPaper"></a>
# **googleGetCitationFormatsForAScholarPaper**
> kotlin.Any googleGetCitationFormatsForAScholarPaper(q, hl)

Get citation formats for a Scholar paper

Return MLA, APA, Chicago, Harvard, and Vancouver citation formats for a paper.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = GoogleApi()
val q : kotlin.String = q_example // kotlin.String | Cluster ID from a search result
val hl : kotlin.String = hl_example // kotlin.String | Language code
try {
    val result : kotlin.Any = apiInstance.googleGetCitationFormatsForAScholarPaper(q, hl)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GoogleApi#googleGetCitationFormatsForAScholarPaper")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GoogleApi#googleGetCitationFormatsForAScholarPaper")
    e.printStackTrace()
}
```

### Parameters
| **q** | **kotlin.String**| Cluster ID from a search result | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **hl** | **kotlin.String**| Language code | [optional] [default to &quot;en&quot;] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="googleGetPlaceDetails"></a>
# **googleGetPlaceDetails**
> kotlin.Any googleGetPlaceDetails(placeId, dataId, hl, gl)

Get place details

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = GoogleApi()
val placeId : kotlin.String = placeId_example // kotlin.String | 
val dataId : kotlin.String = dataId_example // kotlin.String | 
val hl : kotlin.String = hl_example // kotlin.String | 
val gl : kotlin.String = gl_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.googleGetPlaceDetails(placeId, dataId, hl, gl)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GoogleApi#googleGetPlaceDetails")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GoogleApi#googleGetPlaceDetails")
    e.printStackTrace()
}
```

### Parameters
| **placeId** | **kotlin.String**|  | [optional] |
| **dataId** | **kotlin.String**|  | [optional] |
| **hl** | **kotlin.String**|  | [optional] [default to &quot;en&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **gl** | **kotlin.String**|  | [optional] [default to &quot;us&quot;] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="googleGetPlacePhotos"></a>
# **googleGetPlacePhotos**
> kotlin.Any googleGetPlacePhotos(dataId, hl, nextPageToken)

Get place photos

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = GoogleApi()
val dataId : kotlin.String = dataId_example // kotlin.String | Maps data ID
val hl : kotlin.String = hl_example // kotlin.String | 
val nextPageToken : kotlin.String = nextPageToken_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.googleGetPlacePhotos(dataId, hl, nextPageToken)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GoogleApi#googleGetPlacePhotos")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GoogleApi#googleGetPlacePhotos")
    e.printStackTrace()
}
```

### Parameters
| **dataId** | **kotlin.String**| Maps data ID | |
| **hl** | **kotlin.String**|  | [optional] [default to &quot;en&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **nextPageToken** | **kotlin.String**|  | [optional] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="googleGetPlaceReviews"></a>
# **googleGetPlaceReviews**
> kotlin.Any googleGetPlaceReviews(dataId, sortBy, hl, nextPageToken, results)

Get place reviews

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = GoogleApi()
val dataId : kotlin.String = dataId_example // kotlin.String | Maps data ID
val sortBy : kotlin.String = sortBy_example // kotlin.String | qualityScore | newestFirst | ratingHigh | ratingLow
val hl : kotlin.String = hl_example // kotlin.String | 
val nextPageToken : kotlin.String = nextPageToken_example // kotlin.String | Cursor from the previous response's pagination.next; omit for page 1.
val results : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.Any = apiInstance.googleGetPlaceReviews(dataId, sortBy, hl, nextPageToken, results)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GoogleApi#googleGetPlaceReviews")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GoogleApi#googleGetPlaceReviews")
    e.printStackTrace()
}
```

### Parameters
| **dataId** | **kotlin.String**| Maps data ID | |
| **sortBy** | **kotlin.String**| qualityScore | newestFirst | ratingHigh | ratingLow | [optional] [default to &quot;qualityScore&quot;] |
| **hl** | **kotlin.String**|  | [optional] [default to &quot;en&quot;] |
| **nextPageToken** | **kotlin.String**| Cursor from the previous response&#39;s pagination.next; omit for page 1. | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **results** | **kotlin.Int**|  | [optional] [default to 10] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="googleGetScholarAuthorProfile"></a>
# **googleGetScholarAuthorProfile**
> kotlin.Any googleGetScholarAuthorProfile(authorId, hl, cstart, pagesize)

Get Scholar author profile

Get detailed Google Scholar author profile including articles, stats, co-authors.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = GoogleApi()
val authorId : kotlin.String = authorId_example // kotlin.String | Scholar user ID (the `user` query parameter)
val hl : kotlin.String = hl_example // kotlin.String | Language code
val cstart : kotlin.Int = 56 // kotlin.Int | Articles pagination offset
val pagesize : kotlin.Int = 56 // kotlin.Int | Articles per page
try {
    val result : kotlin.Any = apiInstance.googleGetScholarAuthorProfile(authorId, hl, cstart, pagesize)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GoogleApi#googleGetScholarAuthorProfile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GoogleApi#googleGetScholarAuthorProfile")
    e.printStackTrace()
}
```

### Parameters
| **authorId** | **kotlin.String**| Scholar user ID (the &#x60;user&#x60; query parameter) | |
| **hl** | **kotlin.String**| Language code | [optional] [default to &quot;en&quot;] |
| **cstart** | **kotlin.Int**| Articles pagination offset | [optional] [default to 0] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pagesize** | **kotlin.Int**| Articles per page | [optional] [default to 20] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="googleGetStockIndexQuote"></a>
# **googleGetStockIndexQuote**
> kotlin.Any googleGetStockIndexQuote(q, hl)

Get stock/index quote

Get a stock or index quote from Google Finance.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = GoogleApi()
val q : kotlin.String = q_example // kotlin.String | Ticker and exchange (e.g. \"AAPL:NASDAQ\", \"BTC-USD\")
val hl : kotlin.String = hl_example // kotlin.String | Language code
try {
    val result : kotlin.Any = apiInstance.googleGetStockIndexQuote(q, hl)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GoogleApi#googleGetStockIndexQuote")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GoogleApi#googleGetStockIndexQuote")
    e.printStackTrace()
}
```

### Parameters
| **q** | **kotlin.String**| Ticker and exchange (e.g. \&quot;AAPL:NASDAQ\&quot;, \&quot;BTC-USD\&quot;) | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **hl** | **kotlin.String**| Language code | [optional] [default to &quot;en&quot;] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="googleGoogleAiModeSearch"></a>
# **googleGoogleAiModeSearch**
> kotlin.Any googleGoogleAiModeSearch(q, gl, hl, includeHtml)

Google AI Mode search

Get AI-generated search results from Google AI Mode.  Returns the structured &#x60;text_blocks&#x60; (paragraphs, headings, comparison &#x60;table&#x60; blocks and lists), a flat &#x60;references&#x60; source list, a compact &#x60;markdown&#x60; rendering of the whole answer and — unless &#x60;include_html&#x60; is false — the raw &#x60;answer_html&#x60; body.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = GoogleApi()
val q : kotlin.String = q_example // kotlin.String | Search query for AI-generated response
val gl : kotlin.String = gl_example // kotlin.String | Country code
val hl : kotlin.String = hl_example // kotlin.String | Language code
val includeHtml : kotlin.Boolean = true // kotlin.Boolean | Include the raw `answer_html` (full answer body HTML) in the response for maximum parity. It can be 100s of KB — set false when you only need the structured `text_blocks` + `markdown`.
try {
    val result : kotlin.Any = apiInstance.googleGoogleAiModeSearch(q, gl, hl, includeHtml)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GoogleApi#googleGoogleAiModeSearch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GoogleApi#googleGoogleAiModeSearch")
    e.printStackTrace()
}
```

### Parameters
| **q** | **kotlin.String**| Search query for AI-generated response | |
| **gl** | **kotlin.String**| Country code | [optional] [default to &quot;us&quot;] |
| **hl** | **kotlin.String**| Language code | [optional] [default to &quot;en&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **includeHtml** | **kotlin.Boolean**| Include the raw &#x60;answer_html&#x60; (full answer body HTML) in the response for maximum parity. It can be 100s of KB — set false when you only need the structured &#x60;text_blocks&#x60; + &#x60;markdown&#x60;. | [optional] [default to true] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="googleGoogleAiOverviewInlineSerpBlock"></a>
# **googleGoogleAiOverviewInlineSerpBlock**
> kotlin.Any googleGoogleAiOverviewInlineSerpBlock(q, gl, hl)

Google AI Overview (inline SERP block)

Get the AI Overview block Google renders inline at the top of a SERP.  Deferred overviews (where Google lazy-loads the block via a follow-up &#x60;&#x60;page_token&#x60;&#x60;) are chased automatically.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = GoogleApi()
val q : kotlin.String = q_example // kotlin.String | Search query — same shape as a Google Search query
val gl : kotlin.String = gl_example // kotlin.String | Country code
val hl : kotlin.String = hl_example // kotlin.String | Language code
try {
    val result : kotlin.Any = apiInstance.googleGoogleAiOverviewInlineSerpBlock(q, gl, hl)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GoogleApi#googleGoogleAiOverviewInlineSerpBlock")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GoogleApi#googleGoogleAiOverviewInlineSerpBlock")
    e.printStackTrace()
}
```

### Parameters
| **q** | **kotlin.String**| Search query — same shape as a Google Search query | |
| **gl** | **kotlin.String**| Country code | [optional] [default to &quot;us&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **hl** | **kotlin.String**| Language code | [optional] [default to &quot;en&quot;] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="googleGoogleFlightsCalendarCheapestFarePerDate"></a>
# **googleGoogleFlightsCalendarCheapestFarePerDate**
> kotlin.Any googleGoogleFlightsCalendarCheapestFarePerDate(departureId, arrivalId, outboundDateFrom, outboundDateTo, tripType, tripLengthDays, returnDateFrom, returnDateTo, adults, children, infantsInSeat, infantsOnLap, travelClass, currency, gl, hl)

Google Flights calendar — cheapest fare per date

Price a whole range of dates in one call — up to 200 dates per request.  Google Flights&#39; own price graph / date grid: the cheapest fare per departure date instead of one search per date. Prices match &#x60;/flights/search&#x60; exactly.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = GoogleApi()
val departureId : kotlin.String = departureId_example // kotlin.String | Departure airport IATA code or location ID
val arrivalId : kotlin.String = arrivalId_example // kotlin.String | Arrival airport IATA code or location ID
val outboundDateFrom : kotlin.String = outboundDateFrom_example // kotlin.String | First outbound date to price (YYYY-MM-DD)
val outboundDateTo : kotlin.String = outboundDateTo_example // kotlin.String | Last outbound date to price (YYYY-MM-DD). At most 200 days from outbound_date_from, or 14 in date-grid mode.
val tripType : kotlin.String = tripType_example // kotlin.String | one_way | round_trip
val tripLengthDays : kotlin.Int = 56 // kotlin.Int | Round-trip stay length in nights (price-graph mode). Defaults to 7.
val returnDateFrom : kotlin.String = returnDateFrom_example // kotlin.String | Date-grid mode: first return date. With return_date_to, returns the full outbound x return matrix (each range at most 14 days). Round-trip only.
val returnDateTo : kotlin.String = returnDateTo_example // kotlin.String | Date-grid mode: last return date
val adults : kotlin.Int = 56 // kotlin.Int | 
val children : kotlin.Int = 56 // kotlin.Int | 
val infantsInSeat : kotlin.Int = 56 // kotlin.Int | 
val infantsOnLap : kotlin.Int = 56 // kotlin.Int | 
val travelClass : kotlin.String = travelClass_example // kotlin.String | 
val currency : kotlin.String = currency_example // kotlin.String | ISO-4217 currency
val gl : kotlin.String = gl_example // kotlin.String | 
val hl : kotlin.String = hl_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.googleGoogleFlightsCalendarCheapestFarePerDate(departureId, arrivalId, outboundDateFrom, outboundDateTo, tripType, tripLengthDays, returnDateFrom, returnDateTo, adults, children, infantsInSeat, infantsOnLap, travelClass, currency, gl, hl)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GoogleApi#googleGoogleFlightsCalendarCheapestFarePerDate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GoogleApi#googleGoogleFlightsCalendarCheapestFarePerDate")
    e.printStackTrace()
}
```

### Parameters
| **departureId** | **kotlin.String**| Departure airport IATA code or location ID | |
| **arrivalId** | **kotlin.String**| Arrival airport IATA code or location ID | |
| **outboundDateFrom** | **kotlin.String**| First outbound date to price (YYYY-MM-DD) | |
| **outboundDateTo** | **kotlin.String**| Last outbound date to price (YYYY-MM-DD). At most 200 days from outbound_date_from, or 14 in date-grid mode. | |
| **tripType** | **kotlin.String**| one_way | round_trip | [optional] [default to &quot;one_way&quot;] |
| **tripLengthDays** | **kotlin.Int**| Round-trip stay length in nights (price-graph mode). Defaults to 7. | [optional] |
| **returnDateFrom** | **kotlin.String**| Date-grid mode: first return date. With return_date_to, returns the full outbound x return matrix (each range at most 14 days). Round-trip only. | [optional] |
| **returnDateTo** | **kotlin.String**| Date-grid mode: last return date | [optional] |
| **adults** | **kotlin.Int**|  | [optional] [default to 1] |
| **children** | **kotlin.Int**|  | [optional] [default to 0] |
| **infantsInSeat** | **kotlin.Int**|  | [optional] [default to 0] |
| **infantsOnLap** | **kotlin.Int**|  | [optional] [default to 0] |
| **travelClass** | **kotlin.String**|  | [optional] [default to &quot;economy&quot;] |
| **currency** | **kotlin.String**| ISO-4217 currency | [optional] [default to &quot;USD&quot;] |
| **gl** | **kotlin.String**|  | [optional] [default to &quot;us&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **hl** | **kotlin.String**|  | [optional] [default to &quot;en&quot;] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="googleGoogleFlightsSearch"></a>
# **googleGoogleFlightsSearch**
> kotlin.Any googleGoogleFlightsSearch(departureId, arrivalId, outboundDate, returnDate, tripType, adults, children, infantsInSeat, infantsOnLap, travelClass, currency, gl, hl, stops, maxPrice, departureToken)

Google Flights search

Search Google Flights for available itineraries.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = GoogleApi()
val departureId : kotlin.String = departureId_example // kotlin.String | Departure airport IATA code or location ID
val arrivalId : kotlin.String = arrivalId_example // kotlin.String | Arrival airport IATA code or location ID
val outboundDate : kotlin.String = outboundDate_example // kotlin.String | Outbound date (YYYY-MM-DD)
val returnDate : kotlin.String = returnDate_example // kotlin.String | Return date (round-trip only)
val tripType : kotlin.String = tripType_example // kotlin.String | round_trip | one_way | multi_city
val adults : kotlin.Int = 56 // kotlin.Int | 
val children : kotlin.Int = 56 // kotlin.Int | 
val infantsInSeat : kotlin.Int = 56 // kotlin.Int | 
val infantsOnLap : kotlin.Int = 56 // kotlin.Int | 
val travelClass : kotlin.String = travelClass_example // kotlin.String | 
val currency : kotlin.String = currency_example // kotlin.String | ISO-4217 currency
val gl : kotlin.String = gl_example // kotlin.String | 
val hl : kotlin.String = hl_example // kotlin.String | 
val stops : kotlin.String = stops_example // kotlin.String | 
val maxPrice : kotlin.Int = 56 // kotlin.Int | 
val departureToken : kotlin.String = departureToken_example // kotlin.String | A round-trip offer's departure_token; returns the return-leg flights for that selected outbound (round-trip only).
try {
    val result : kotlin.Any = apiInstance.googleGoogleFlightsSearch(departureId, arrivalId, outboundDate, returnDate, tripType, adults, children, infantsInSeat, infantsOnLap, travelClass, currency, gl, hl, stops, maxPrice, departureToken)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GoogleApi#googleGoogleFlightsSearch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GoogleApi#googleGoogleFlightsSearch")
    e.printStackTrace()
}
```

### Parameters
| **departureId** | **kotlin.String**| Departure airport IATA code or location ID | |
| **arrivalId** | **kotlin.String**| Arrival airport IATA code or location ID | |
| **outboundDate** | **kotlin.String**| Outbound date (YYYY-MM-DD) | |
| **returnDate** | **kotlin.String**| Return date (round-trip only) | [optional] |
| **tripType** | **kotlin.String**| round_trip | one_way | multi_city | [optional] [default to &quot;round_trip&quot;] |
| **adults** | **kotlin.Int**|  | [optional] [default to 1] |
| **children** | **kotlin.Int**|  | [optional] [default to 0] |
| **infantsInSeat** | **kotlin.Int**|  | [optional] [default to 0] |
| **infantsOnLap** | **kotlin.Int**|  | [optional] [default to 0] |
| **travelClass** | **kotlin.String**|  | [optional] [default to &quot;economy&quot;] |
| **currency** | **kotlin.String**| ISO-4217 currency | [optional] [default to &quot;USD&quot;] |
| **gl** | **kotlin.String**|  | [optional] [default to &quot;us&quot;] |
| **hl** | **kotlin.String**|  | [optional] [default to &quot;en&quot;] |
| **stops** | **kotlin.String**|  | [optional] [default to &quot;any&quot;] |
| **maxPrice** | **kotlin.Int**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **departureToken** | **kotlin.String**| A round-trip offer&#39;s departure_token; returns the return-leg flights for that selected outbound (round-trip only). | [optional] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="googleGoogleLensVisualSearch"></a>
# **googleGoogleLensVisualSearch**
> kotlin.Any googleGoogleLensVisualSearch(url, query, country, language, gl, hl, product, visualMatches, exactMatches)

Google Lens visual search

Google Lens visual search.  Response carries &#x60;&#x60;lens_results&#x60;&#x60; (Scrapingdog parity alias) with &#x60;&#x60;title&#x60;&#x60; / &#x60;&#x60;source&#x60;&#x60; / &#x60;&#x60;source_favicon&#x60;&#x60; / &#x60;&#x60;thumbnail&#x60;&#x60; / &#x60;&#x60;original_thumbnail&#x60;&#x60; / &#x60;&#x60;rating&#x60;&#x60; / &#x60;&#x60;reviews&#x60;&#x60; / &#x60;&#x60;in_stock&#x60;&#x60;, plus &#x60;&#x60;price&#x60;&#x60; (&#x60;&#x60;{value, currency, extracted}&#x60;&#x60;) and the raw &#x60;&#x60;tag&#x60;&#x60; chip it is parsed from, on shoppable matches. &#x60;&#x60;related_searches&#x60;&#x60; chips come alongside. Legacy &#x60;&#x60;results&#x60;&#x60; alias kept for backwards compat.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = GoogleApi()
val url : kotlin.String = url_example // kotlin.String | Public URL of the image to search visually
val query : kotlin.String = query_example // kotlin.String | Optional text refinement (e.g. 'pizza')
val country : kotlin.String = country_example // kotlin.String | ISO country code (alias for gl)
val language : kotlin.String = language_example // kotlin.String | Language code (alias for hl)
val gl : kotlin.String = gl_example // kotlin.String | Country code
val hl : kotlin.String = hl_example // kotlin.String | Language code
val product : kotlin.Boolean = true // kotlin.Boolean | Bias towards shoppable product matches
val visualMatches : kotlin.Boolean = true // kotlin.Boolean | Include the visual-matches carousel
val exactMatches : kotlin.Boolean = true // kotlin.Boolean | Restrict to exact-match results
try {
    val result : kotlin.Any = apiInstance.googleGoogleLensVisualSearch(url, query, country, language, gl, hl, product, visualMatches, exactMatches)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GoogleApi#googleGoogleLensVisualSearch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GoogleApi#googleGoogleLensVisualSearch")
    e.printStackTrace()
}
```

### Parameters
| **url** | **kotlin.String**| Public URL of the image to search visually | |
| **query** | **kotlin.String**| Optional text refinement (e.g. &#39;pizza&#39;) | [optional] |
| **country** | **kotlin.String**| ISO country code (alias for gl) | [optional] |
| **language** | **kotlin.String**| Language code (alias for hl) | [optional] |
| **gl** | **kotlin.String**| Country code | [optional] [default to &quot;us&quot;] |
| **hl** | **kotlin.String**| Language code | [optional] [default to &quot;en&quot;] |
| **product** | **kotlin.Boolean**| Bias towards shoppable product matches | [optional] [default to false] |
| **visualMatches** | **kotlin.Boolean**| Include the visual-matches carousel | [optional] [default to true] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **exactMatches** | **kotlin.Boolean**| Restrict to exact-match results | [optional] [default to false] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="googleGoogleScraperHealthCheck"></a>
# **googleGoogleScraperHealthCheck**
> kotlin.Any googleGoogleScraperHealthCheck()

Google scraper health check

Check health of the Google scraper service.  Accepts &#x60;&#x60;HEAD&#x60;&#x60; so external uptime checkers (UptimeRobot uses HEAD by default for HTTP monitors) don&#39;t get a 405 Method Not Allowed.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = GoogleApi()
try {
    val result : kotlin.Any = apiInstance.googleGoogleScraperHealthCheck()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GoogleApi#googleGoogleScraperHealthCheck")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GoogleApi#googleGoogleScraperHealthCheck")
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

<a id="googleGoogleScraperHealthCheckHead"></a>
# **googleGoogleScraperHealthCheckHead**
> kotlin.Any googleGoogleScraperHealthCheckHead()

Google scraper health check

Check health of the Google scraper service.  Accepts &#x60;&#x60;HEAD&#x60;&#x60; so external uptime checkers (UptimeRobot uses HEAD by default for HTTP monitors) don&#39;t get a 405 Method Not Allowed.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = GoogleApi()
try {
    val result : kotlin.Any = apiInstance.googleGoogleScraperHealthCheckHead()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GoogleApi#googleGoogleScraperHealthCheckHead")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GoogleApi#googleGoogleScraperHealthCheckHead")
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

<a id="googleGoogleSearchSuggestions"></a>
# **googleGoogleSearchSuggestions**
> kotlin.Any googleGoogleSearchSuggestions(q, hl, gl)

Google search suggestions

Get Google search autocomplete suggestions.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = GoogleApi()
val q : kotlin.String = q_example // kotlin.String | Search query to get suggestions for
val hl : kotlin.String = hl_example // kotlin.String | Language code
val gl : kotlin.String = gl_example // kotlin.String | Country code
try {
    val result : kotlin.Any = apiInstance.googleGoogleSearchSuggestions(q, hl, gl)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GoogleApi#googleGoogleSearchSuggestions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GoogleApi#googleGoogleSearchSuggestions")
    e.printStackTrace()
}
```

### Parameters
| **q** | **kotlin.String**| Search query to get suggestions for | |
| **hl** | **kotlin.String**| Language code | [optional] [default to &quot;en&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **gl** | **kotlin.String**| Country code | [optional] [default to &quot;us&quot;] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="googleGoogleShortsSearch"></a>
# **googleGoogleShortsSearch**
> kotlin.Any googleGoogleShortsSearch(q, gl, hl, domain, num, start)

Google Shorts search

Return short-form video results (YouTube Shorts, TikToks) from Google Shorts mode.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = GoogleApi()
val q : kotlin.String = q_example // kotlin.String | Search query
val gl : kotlin.String = gl_example // kotlin.String | Country code
val hl : kotlin.String = hl_example // kotlin.String | Language code
val domain : kotlin.String = domain_example // kotlin.String | Google domain
val num : kotlin.Int = 56 // kotlin.Int | Results per page
val start : kotlin.Int = 56 // kotlin.Int | Pagination offset
try {
    val result : kotlin.Any = apiInstance.googleGoogleShortsSearch(q, gl, hl, domain, num, start)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GoogleApi#googleGoogleShortsSearch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GoogleApi#googleGoogleShortsSearch")
    e.printStackTrace()
}
```

### Parameters
| **q** | **kotlin.String**| Search query | |
| **gl** | **kotlin.String**| Country code | [optional] [default to &quot;us&quot;] |
| **hl** | **kotlin.String**| Language code | [optional] [default to &quot;en&quot;] |
| **domain** | **kotlin.String**| Google domain | [optional] [default to &quot;google.com&quot;] |
| **num** | **kotlin.Int**| Results per page | [optional] [default to 20] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **start** | **kotlin.Int**| Pagination offset | [optional] [default to 0] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="googleGoogleWebSearch"></a>
# **googleGoogleWebSearch**
> kotlin.Any googleGoogleWebSearch(q, gl, hl, num, start, domain, device, userAgent, output, location, lr, tbs, safe, uule, filter, nfpr, cr, ludocid, lsig, kgmid, si, ibp, uds, aiOverview)

Google web search

Search Google and get structured results (organic, ads, KG, AI overview, PAA).

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = GoogleApi()
val q : kotlin.String = q_example // kotlin.String | Search query (supports Google operators)
val gl : kotlin.String = gl_example // kotlin.String | Country code
val hl : kotlin.String = hl_example // kotlin.String | Language code
val num : kotlin.Int = 56 // kotlin.Int | 
val start : kotlin.Int = 56 // kotlin.Int | Page offset (0, 10, 20...)
val domain : kotlin.String = domain_example // kotlin.String | Google domain
val device : kotlin.String = device_example // kotlin.String | Device target: desktop, mobile, iphone, android, tablet
val userAgent : kotlin.String = userAgent_example // kotlin.String | Custom User-Agent (overrides device)
val output : kotlin.String = output_example // kotlin.String | Response format: json (parsed) or html (raw SERP)
val location : kotlin.String = location_example // kotlin.String | City-level geo-targeting
val lr : kotlin.String = lr_example // kotlin.String | Language restrict (e.g. lang_en)
val tbs : kotlin.String = tbs_example // kotlin.String | Time filter (e.g. qdr:d)
val safe : kotlin.String = safe_example // kotlin.String | 
val uule : kotlin.String = uule_example // kotlin.String | UULE encoded location
val filter : kotlin.Int = 56 // kotlin.Int | Show omitted results
val nfpr : kotlin.Int = 56 // kotlin.Int | Disable auto-correction
val cr : kotlin.String = cr_example // kotlin.String | Country restrict
val ludocid : kotlin.String = ludocid_example // kotlin.String | Google Place CID
val lsig : kotlin.String = lsig_example // kotlin.String | Knowledge Graph map ID
val kgmid : kotlin.String = kgmid_example // kotlin.String | Knowledge Graph entity ID
val si : kotlin.String = si_example // kotlin.String | Cached search params
val ibp : kotlin.String = ibp_example // kotlin.String | Layout control
val uds : kotlin.String = uds_example // kotlin.String | Google filter string
val aiOverview : kotlin.Boolean = true // kotlin.Boolean | Chase deferred AI Overview page_token with a follow-up fetch and merge the result. Adds ~1s and 1 credit when the SERP defers the overview.
try {
    val result : kotlin.Any = apiInstance.googleGoogleWebSearch(q, gl, hl, num, start, domain, device, userAgent, output, location, lr, tbs, safe, uule, filter, nfpr, cr, ludocid, lsig, kgmid, si, ibp, uds, aiOverview)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GoogleApi#googleGoogleWebSearch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GoogleApi#googleGoogleWebSearch")
    e.printStackTrace()
}
```

### Parameters
| **q** | **kotlin.String**| Search query (supports Google operators) | |
| **gl** | **kotlin.String**| Country code | [optional] [default to &quot;us&quot;] |
| **hl** | **kotlin.String**| Language code | [optional] [default to &quot;en&quot;] |
| **num** | **kotlin.Int**|  | [optional] [default to 10] |
| **start** | **kotlin.Int**| Page offset (0, 10, 20...) | [optional] [default to 0] |
| **domain** | **kotlin.String**| Google domain | [optional] [default to &quot;google.com&quot;] |
| **device** | **kotlin.String**| Device target: desktop, mobile, iphone, android, tablet | [optional] [default to desktop] [enum: desktop, mobile, iphone, android, tablet] |
| **userAgent** | **kotlin.String**| Custom User-Agent (overrides device) | [optional] |
| **output** | **kotlin.String**| Response format: json (parsed) or html (raw SERP) | [optional] [default to json] [enum: json, html] |
| **location** | **kotlin.String**| City-level geo-targeting | [optional] |
| **lr** | **kotlin.String**| Language restrict (e.g. lang_en) | [optional] |
| **tbs** | **kotlin.String**| Time filter (e.g. qdr:d) | [optional] |
| **safe** | **kotlin.String**|  | [optional] [default to &quot;off&quot;] |
| **uule** | **kotlin.String**| UULE encoded location | [optional] |
| **filter** | **kotlin.Int**| Show omitted results | [optional] |
| **nfpr** | **kotlin.Int**| Disable auto-correction | [optional] [default to 0] |
| **cr** | **kotlin.String**| Country restrict | [optional] |
| **ludocid** | **kotlin.String**| Google Place CID | [optional] |
| **lsig** | **kotlin.String**| Knowledge Graph map ID | [optional] |
| **kgmid** | **kotlin.String**| Knowledge Graph entity ID | [optional] |
| **si** | **kotlin.String**| Cached search params | [optional] |
| **ibp** | **kotlin.String**| Layout control | [optional] |
| **uds** | **kotlin.String**| Google filter string | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **aiOverview** | **kotlin.Boolean**| Chase deferred AI Overview page_token with a follow-up fetch and merge the result. Adds ~1s and 1 credit when the SERP defers the overview. | [optional] [default to false] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="googleHotelDetails"></a>
# **googleHotelDetails**
> kotlin.Any googleHotelDetails(propertyToken, checkIn, checkOut)

Hotel details

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = GoogleApi()
val propertyToken : kotlin.String = propertyToken_example // kotlin.String | Property token
val checkIn : kotlin.String = checkIn_example // kotlin.String | YYYY-MM-DD
val checkOut : kotlin.String = checkOut_example // kotlin.String | YYYY-MM-DD
try {
    val result : kotlin.Any = apiInstance.googleHotelDetails(propertyToken, checkIn, checkOut)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GoogleApi#googleHotelDetails")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GoogleApi#googleHotelDetails")
    e.printStackTrace()
}
```

### Parameters
| **propertyToken** | **kotlin.String**| Property token | |
| **checkIn** | **kotlin.String**| YYYY-MM-DD | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **checkOut** | **kotlin.String**| YYYY-MM-DD | |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="googleImmersiveProductDetail"></a>
# **googleImmersiveProductDetail**
> kotlin.Any googleImmersiveProductDetail(productId, q, gl, hl, catalogId, imageDocid, headlineOfferDocid, mid, includeOffers, includeVariants)

Immersive product detail

Get deep product details from Google&#39;s immersive product page.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = GoogleApi()
val productId : kotlin.String = productId_example // kotlin.String | Google Shopping ``gpcid`` — the product_id returned on ``/shopping/search`` tiles. Scrapingdog-compatible.
val q : kotlin.String = q_example // kotlin.String | Original search query that surfaced the product. Required by Google's ``/async/oapv`` RPC.
val gl : kotlin.String = gl_example // kotlin.String | Country code (ISO 3166 alpha-2)
val hl : kotlin.String = hl_example // kotlin.String | Language code
val catalogId : kotlin.String = catalogId_example // kotlin.String | Optional ``catalogid`` from the Shopping tile (improves parity).
val imageDocid : kotlin.String = imageDocid_example // kotlin.String | Optional ``imageDocid`` for higher-fidelity images.
val headlineOfferDocid : kotlin.String = headlineOfferDocid_example // kotlin.String | Optional ``headlineOfferDocid`` to pin the featured seller.
val mid : kotlin.String = mid_example // kotlin.String | Optional Google Knowledge-Graph ``mid``.
val includeOffers : kotlin.Boolean = true // kotlin.Boolean | When true, fetch the full merchant-offer list via a secondary RPC (``/async/piu_ps``). Adds ~1 s.
val includeVariants : kotlin.Boolean = true // kotlin.Boolean | When true, fetch size/colour variants via a secondary RPC (``/async/toy_v``). Adds ~1 s.
try {
    val result : kotlin.Any = apiInstance.googleImmersiveProductDetail(productId, q, gl, hl, catalogId, imageDocid, headlineOfferDocid, mid, includeOffers, includeVariants)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GoogleApi#googleImmersiveProductDetail")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GoogleApi#googleImmersiveProductDetail")
    e.printStackTrace()
}
```

### Parameters
| **productId** | **kotlin.String**| Google Shopping &#x60;&#x60;gpcid&#x60;&#x60; — the product_id returned on &#x60;&#x60;/shopping/search&#x60;&#x60; tiles. Scrapingdog-compatible. | |
| **q** | **kotlin.String**| Original search query that surfaced the product. Required by Google&#39;s &#x60;&#x60;/async/oapv&#x60;&#x60; RPC. | |
| **gl** | **kotlin.String**| Country code (ISO 3166 alpha-2) | [optional] [default to &quot;us&quot;] |
| **hl** | **kotlin.String**| Language code | [optional] [default to &quot;en&quot;] |
| **catalogId** | **kotlin.String**| Optional &#x60;&#x60;catalogid&#x60;&#x60; from the Shopping tile (improves parity). | [optional] |
| **imageDocid** | **kotlin.String**| Optional &#x60;&#x60;imageDocid&#x60;&#x60; for higher-fidelity images. | [optional] |
| **headlineOfferDocid** | **kotlin.String**| Optional &#x60;&#x60;headlineOfferDocid&#x60;&#x60; to pin the featured seller. | [optional] |
| **mid** | **kotlin.String**| Optional Google Knowledge-Graph &#x60;&#x60;mid&#x60;&#x60;. | [optional] |
| **includeOffers** | **kotlin.Boolean**| When true, fetch the full merchant-offer list via a secondary RPC (&#x60;&#x60;/async/piu_ps&#x60;&#x60;). Adds ~1 s. | [optional] [default to false] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **includeVariants** | **kotlin.Boolean**| When true, fetch size/colour variants via a secondary RPC (&#x60;&#x60;/async/toy_v&#x60;&#x60;). Adds ~1 s. | [optional] [default to false] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="googleInterestByRegion"></a>
# **googleInterestByRegion**
> kotlin.Any googleInterestByRegion(q, geo)

Interest by region

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = GoogleApi()
val q : kotlin.String = q_example // kotlin.String | Search term
val geo : kotlin.String = geo_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.googleInterestByRegion(q, geo)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GoogleApi#googleInterestByRegion")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GoogleApi#googleInterestByRegion")
    e.printStackTrace()
}
```

### Parameters
| **q** | **kotlin.String**| Search term | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **geo** | **kotlin.String**|  | [optional] [default to &quot;&quot;] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="googleInterestOverTime"></a>
# **googleInterestOverTime**
> kotlin.Any googleInterestOverTime(q, geo, date)

Interest over time

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = GoogleApi()
val q : kotlin.String = q_example // kotlin.String | Search terms
val geo : kotlin.String = geo_example // kotlin.String | 
val date : kotlin.String = date_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.googleInterestOverTime(q, geo, date)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GoogleApi#googleInterestOverTime")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GoogleApi#googleInterestOverTime")
    e.printStackTrace()
}
```

### Parameters
| **q** | **kotlin.String**| Search terms | |
| **geo** | **kotlin.String**|  | [optional] [default to &quot;&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **date** | **kotlin.String**|  | [optional] [default to &quot;today 12-m&quot;] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="googleMultiSellerOffersByBarcode"></a>
# **googleMultiSellerOffersByBarcode**
> kotlin.Any googleMultiSellerOffersByBarcode(barcode, gl, hl)

Multi-seller offers by barcode

Resolve a barcode to a product via Google web search, then return its Google Shopping seller offers (source + price per merchant).

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = GoogleApi()
val barcode : kotlin.String = barcode_example // kotlin.String | Product barcode — GTIN-8 / UPC-A / EAN-13 / GTIN-14
val gl : kotlin.String = gl_example // kotlin.String | Country code (ISO 3166 alpha-2)
val hl : kotlin.String = hl_example // kotlin.String | Language code
try {
    val result : kotlin.Any = apiInstance.googleMultiSellerOffersByBarcode(barcode, gl, hl)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GoogleApi#googleMultiSellerOffersByBarcode")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GoogleApi#googleMultiSellerOffersByBarcode")
    e.printStackTrace()
}
```

### Parameters
| **barcode** | **kotlin.String**| Product barcode — GTIN-8 / UPC-A / EAN-13 / GTIN-14 | |
| **gl** | **kotlin.String**| Country code (ISO 3166 alpha-2) | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **hl** | **kotlin.String**| Language code | [optional] [default to &quot;en&quot;] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="googleNewsByTopic"></a>
# **googleNewsByTopic**
> kotlin.Any googleNewsByTopic(topic, hl, gl, maxResults)

News by topic

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = GoogleApi()
val topic : kotlin.String = topic_example // kotlin.String | Topic name
val hl : kotlin.String = hl_example // kotlin.String | 
val gl : kotlin.String = gl_example // kotlin.String | 
val maxResults : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.Any = apiInstance.googleNewsByTopic(topic, hl, gl, maxResults)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GoogleApi#googleNewsByTopic")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GoogleApi#googleNewsByTopic")
    e.printStackTrace()
}
```

### Parameters
| **topic** | **kotlin.String**| Topic name | |
| **hl** | **kotlin.String**|  | [optional] [default to &quot;en&quot;] |
| **gl** | **kotlin.String**|  | [optional] [default to &quot;US&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **maxResults** | **kotlin.Int**|  | [optional] [default to 10] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="googlePatentDetails"></a>
# **googlePatentDetails**
> kotlin.Any googlePatentDetails(patentId)

Patent details

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = GoogleApi()
val patentId : kotlin.String = patentId_example // kotlin.String | Patent number
try {
    val result : kotlin.Any = apiInstance.googlePatentDetails(patentId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GoogleApi#googlePatentDetails")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GoogleApi#googlePatentDetails")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **patentId** | **kotlin.String**| Patent number | |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="googleRelatedTopicsQueries"></a>
# **googleRelatedTopicsQueries**
> kotlin.Any googleRelatedTopicsQueries(q, geo)

Related topics &amp; queries

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = GoogleApi()
val q : kotlin.String = q_example // kotlin.String | Search term
val geo : kotlin.String = geo_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.googleRelatedTopicsQueries(q, geo)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GoogleApi#googleRelatedTopicsQueries")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GoogleApi#googleRelatedTopicsQueries")
    e.printStackTrace()
}
```

### Parameters
| **q** | **kotlin.String**| Search term | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **geo** | **kotlin.String**|  | [optional] [default to &quot;&quot;] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="googleSearchGoogleImages"></a>
# **googleSearchGoogleImages**
> kotlin.Any googleSearchGoogleImages(q, gl, hl, tbs, imgsz, imgcolor, imgtype, safe, page)

Search Google Images

Search Google Images for visual content.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = GoogleApi()
val q : kotlin.String = q_example // kotlin.String | Image search query
val gl : kotlin.String = gl_example // kotlin.String | Country code
val hl : kotlin.String = hl_example // kotlin.String | Language code
val tbs : kotlin.String = tbs_example // kotlin.String | Time/filter string (e.g. qdr:d)
val imgsz : kotlin.String = imgsz_example // kotlin.String | Image size: l, m, i, xXl
val imgcolor : kotlin.String = imgcolor_example // kotlin.String | Image color filter
val imgtype : kotlin.String = imgtype_example // kotlin.String | Image type: face, photo, clipart
val safe : kotlin.String = safe_example // kotlin.String | Safe search
val page : kotlin.Int = 56 // kotlin.Int | Page number
try {
    val result : kotlin.Any = apiInstance.googleSearchGoogleImages(q, gl, hl, tbs, imgsz, imgcolor, imgtype, safe, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GoogleApi#googleSearchGoogleImages")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GoogleApi#googleSearchGoogleImages")
    e.printStackTrace()
}
```

### Parameters
| **q** | **kotlin.String**| Image search query | |
| **gl** | **kotlin.String**| Country code | [optional] [default to &quot;us&quot;] |
| **hl** | **kotlin.String**| Language code | [optional] [default to &quot;en&quot;] |
| **tbs** | **kotlin.String**| Time/filter string (e.g. qdr:d) | [optional] |
| **imgsz** | **kotlin.String**| Image size: l, m, i, xXl | [optional] |
| **imgcolor** | **kotlin.String**| Image color filter | [optional] |
| **imgtype** | **kotlin.String**| Image type: face, photo, clipart | [optional] |
| **safe** | **kotlin.String**| Safe search | [optional] [default to &quot;off&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **page** | **kotlin.Int**| Page number | [optional] [default to 0] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="googleSearchGoogleJobs"></a>
# **googleSearchGoogleJobs**
> kotlin.Any googleSearchGoogleJobs(q, location, gl, jobType, datePosted)

Search Google Jobs

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = GoogleApi()
val q : kotlin.String = q_example // kotlin.String | Job title, keywords
val location : kotlin.String = location_example // kotlin.String | 
val gl : kotlin.String = gl_example // kotlin.String | 
val jobType : kotlin.String = jobType_example // kotlin.String | 
val datePosted : kotlin.String = datePosted_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.googleSearchGoogleJobs(q, location, gl, jobType, datePosted)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GoogleApi#googleSearchGoogleJobs")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GoogleApi#googleSearchGoogleJobs")
    e.printStackTrace()
}
```

### Parameters
| **q** | **kotlin.String**| Job title, keywords | |
| **location** | **kotlin.String**|  | [optional] |
| **gl** | **kotlin.String**|  | [optional] [default to &quot;us&quot;] |
| **jobType** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datePosted** | **kotlin.String**|  | [optional] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="googleSearchGoogleMapsPlaces"></a>
# **googleSearchGoogleMapsPlaces**
> kotlin.Any googleSearchGoogleMapsPlaces(q, ll, gl, hl, start)

Search Google Maps places

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = GoogleApi()
val q : kotlin.String = q_example // kotlin.String | Search query
val ll : kotlin.String = ll_example // kotlin.String | 
val gl : kotlin.String = gl_example // kotlin.String | 
val hl : kotlin.String = hl_example // kotlin.String | 
val start : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.Any = apiInstance.googleSearchGoogleMapsPlaces(q, ll, gl, hl, start)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GoogleApi#googleSearchGoogleMapsPlaces")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GoogleApi#googleSearchGoogleMapsPlaces")
    e.printStackTrace()
}
```

### Parameters
| **q** | **kotlin.String**| Search query | |
| **ll** | **kotlin.String**|  | [optional] |
| **gl** | **kotlin.String**|  | [optional] [default to &quot;us&quot;] |
| **hl** | **kotlin.String**|  | [optional] [default to &quot;en&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **start** | **kotlin.Int**|  | [optional] [default to 0] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="googleSearchGoogleNews"></a>
# **googleSearchGoogleNews**
> kotlin.Any googleSearchGoogleNews(q, hl, gl, maxResults)

Search Google News

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = GoogleApi()
val q : kotlin.String = q_example // kotlin.String | Search query
val hl : kotlin.String = hl_example // kotlin.String | 
val gl : kotlin.String = gl_example // kotlin.String | 
val maxResults : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.Any = apiInstance.googleSearchGoogleNews(q, hl, gl, maxResults)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GoogleApi#googleSearchGoogleNews")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GoogleApi#googleSearchGoogleNews")
    e.printStackTrace()
}
```

### Parameters
| **q** | **kotlin.String**| Search query | |
| **hl** | **kotlin.String**|  | [optional] [default to &quot;en&quot;] |
| **gl** | **kotlin.String**|  | [optional] [default to &quot;US&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **maxResults** | **kotlin.Int**|  | [optional] [default to 10] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="googleSearchGoogleScholar"></a>
# **googleSearchGoogleScholar**
> kotlin.Any googleSearchGoogleScholar(q, hl, asYlo, asYhi, asSdt, page, num)

Search Google Scholar

Search Google Scholar for scholarly articles.  Each result ships with its doc &#x60;&#x60;id&#x60;&#x60;, &#x60;&#x60;type&#x60;&#x60; badge ([BOOK]/[PDF]/...), wrapped &#x60;&#x60;inline_links&#x60;&#x60; (versions + cited_by + related), PDF &#x60;&#x60;resources&#x60;&#x60; list, and structured &#x60;&#x60;authors&#x60;&#x60; (with &#x60;&#x60;author_id&#x60;&#x60; for profiled authors — pipe straight into &#x60;&#x60;/scholar/author&#x60;&#x60;). Envelope carries &#x60;&#x60;scholar_results&#x60;&#x60; alias (Scrapingdog parity), &#x60;&#x60;related_searches&#x60;&#x60;, and matched &#x60;&#x60;profiles&#x60;&#x60; cards.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = GoogleApi()
val q : kotlin.String = q_example // kotlin.String | Search query for scholarly articles
val hl : kotlin.String = hl_example // kotlin.String | Language code
val asYlo : kotlin.Int = 56 // kotlin.Int | Year from (e.g. 2020)
val asYhi : kotlin.Int = 56 // kotlin.Int | Year to (e.g. 2024)
val asSdt : kotlin.String = asSdt_example // kotlin.String | Search type: 0=exclude patents, 7=include
val page : kotlin.Int = 56 // kotlin.Int | Page number (0-based)
val num : kotlin.Int = 56 // kotlin.Int | Results per page (max 20)
try {
    val result : kotlin.Any = apiInstance.googleSearchGoogleScholar(q, hl, asYlo, asYhi, asSdt, page, num)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GoogleApi#googleSearchGoogleScholar")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GoogleApi#googleSearchGoogleScholar")
    e.printStackTrace()
}
```

### Parameters
| **q** | **kotlin.String**| Search query for scholarly articles | |
| **hl** | **kotlin.String**| Language code | [optional] [default to &quot;en&quot;] |
| **asYlo** | **kotlin.Int**| Year from (e.g. 2020) | [optional] |
| **asYhi** | **kotlin.Int**| Year to (e.g. 2024) | [optional] |
| **asSdt** | **kotlin.String**| Search type: 0&#x3D;exclude patents, 7&#x3D;include | [optional] [default to &quot;0&quot;] |
| **page** | **kotlin.Int**| Page number (0-based) | [optional] [default to 0] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **num** | **kotlin.Int**| Results per page (max 20) | [optional] [default to 10] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="googleSearchGoogleVideos"></a>
# **googleSearchGoogleVideos**
> kotlin.Any googleSearchGoogleVideos(q, gl, hl, tbs, safe, page)

Search Google Videos

Search Google for video results.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = GoogleApi()
val q : kotlin.String = q_example // kotlin.String | Video search query
val gl : kotlin.String = gl_example // kotlin.String | Country code
val hl : kotlin.String = hl_example // kotlin.String | Language code
val tbs : kotlin.String = tbs_example // kotlin.String | Time filter (e.g. qdr:d)
val safe : kotlin.String = safe_example // kotlin.String | Safe search
val page : kotlin.Int = 56 // kotlin.Int | Page number
try {
    val result : kotlin.Any = apiInstance.googleSearchGoogleVideos(q, gl, hl, tbs, safe, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GoogleApi#googleSearchGoogleVideos")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GoogleApi#googleSearchGoogleVideos")
    e.printStackTrace()
}
```

### Parameters
| **q** | **kotlin.String**| Video search query | |
| **gl** | **kotlin.String**| Country code | [optional] [default to &quot;us&quot;] |
| **hl** | **kotlin.String**| Language code | [optional] [default to &quot;en&quot;] |
| **tbs** | **kotlin.String**| Time filter (e.g. qdr:d) | [optional] |
| **safe** | **kotlin.String**| Safe search | [optional] [default to &quot;off&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **page** | **kotlin.Int**| Page number | [optional] [default to 0] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="googleSearchHotels"></a>
# **googleSearchHotels**
> kotlin.Any googleSearchHotels(q, checkIn, checkOut, adults, currency, gl)

Search hotels

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = GoogleApi()
val q : kotlin.String = q_example // kotlin.String | Location or hotel name
val checkIn : kotlin.String = checkIn_example // kotlin.String | YYYY-MM-DD
val checkOut : kotlin.String = checkOut_example // kotlin.String | YYYY-MM-DD
val adults : kotlin.Int = 56 // kotlin.Int | 
val currency : kotlin.String = currency_example // kotlin.String | 
val gl : kotlin.String = gl_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.googleSearchHotels(q, checkIn, checkOut, adults, currency, gl)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GoogleApi#googleSearchHotels")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GoogleApi#googleSearchHotels")
    e.printStackTrace()
}
```

### Parameters
| **q** | **kotlin.String**| Location or hotel name | |
| **checkIn** | **kotlin.String**| YYYY-MM-DD | |
| **checkOut** | **kotlin.String**| YYYY-MM-DD | |
| **adults** | **kotlin.Int**|  | [optional] [default to 2] |
| **currency** | **kotlin.String**|  | [optional] [default to &quot;USD&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **gl** | **kotlin.String**|  | [optional] [default to &quot;us&quot;] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="googleSearchPatents"></a>
# **googleSearchPatents**
> kotlin.Any googleSearchPatents(q, page, num, sort, inventor, assignee, country, language, status, patentType, before, after)

Search patents

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = GoogleApi()
val q : kotlin.String = q_example // kotlin.String | Search query (Boolean logic supported)
val page : kotlin.Int = 56 // kotlin.Int | 
val num : kotlin.Int = 56 // kotlin.Int | 
val sort : kotlin.String = sort_example // kotlin.String | 'new' or 'old'
val inventor : kotlin.String = inventor_example // kotlin.String | Inventor name(s)
val assignee : kotlin.String = assignee_example // kotlin.String | Assignee / company name(s)
val country : kotlin.String = country_example // kotlin.String | Country code (US, EP, WO, …)
val language : kotlin.String = language_example // kotlin.String | Patent language: ENGLISH, GERMAN, CHINESE, FRENCH, JAPANESE, KOREAN, SPANISH
val status : kotlin.String = status_example // kotlin.String | GRANT or APPLICATION
val patentType : kotlin.String = patentType_example // kotlin.String | PATENT or DESIGN
val before : kotlin.String = before_example // kotlin.String | Before date YYYYMMDD
val after : kotlin.String = after_example // kotlin.String | After date YYYYMMDD
try {
    val result : kotlin.Any = apiInstance.googleSearchPatents(q, page, num, sort, inventor, assignee, country, language, status, patentType, before, after)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GoogleApi#googleSearchPatents")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GoogleApi#googleSearchPatents")
    e.printStackTrace()
}
```

### Parameters
| **q** | **kotlin.String**| Search query (Boolean logic supported) | |
| **page** | **kotlin.Int**|  | [optional] [default to 0] |
| **num** | **kotlin.Int**|  | [optional] [default to 10] |
| **sort** | **kotlin.String**| &#39;new&#39; or &#39;old&#39; | [optional] |
| **inventor** | **kotlin.String**| Inventor name(s) | [optional] |
| **assignee** | **kotlin.String**| Assignee / company name(s) | [optional] |
| **country** | **kotlin.String**| Country code (US, EP, WO, …) | [optional] |
| **language** | **kotlin.String**| Patent language: ENGLISH, GERMAN, CHINESE, FRENCH, JAPANESE, KOREAN, SPANISH | [optional] |
| **status** | **kotlin.String**| GRANT or APPLICATION | [optional] |
| **patentType** | **kotlin.String**| PATENT or DESIGN | [optional] |
| **before** | **kotlin.String**| Before date YYYYMMDD | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **after** | **kotlin.String**| After date YYYYMMDD | [optional] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="googleSearchProducts"></a>
# **googleSearchProducts**
> kotlin.Any googleSearchProducts(q, gl, minPrice, maxPrice, sortBy)

Search products

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = GoogleApi()
val q : kotlin.String = q_example // kotlin.String | Product search query
val gl : kotlin.String = gl_example // kotlin.String | 
val minPrice : kotlin.Int = 56 // kotlin.Int | 
val maxPrice : kotlin.Int = 56 // kotlin.Int | 
val sortBy : kotlin.String = sortBy_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.googleSearchProducts(q, gl, minPrice, maxPrice, sortBy)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GoogleApi#googleSearchProducts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GoogleApi#googleSearchProducts")
    e.printStackTrace()
}
```

### Parameters
| **q** | **kotlin.String**| Product search query | |
| **gl** | **kotlin.String**|  | [optional] [default to &quot;us&quot;] |
| **minPrice** | **kotlin.Int**|  | [optional] |
| **maxPrice** | **kotlin.Int**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sortBy** | **kotlin.String**|  | [optional] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="googleSearchScholarAuthorProfiles"></a>
# **googleSearchScholarAuthorProfiles**
> kotlin.Any googleSearchScholarAuthorProfiles(mauthors, hl, afterAuthor, beforeAuthor)

Search Scholar author profiles

Search Google Scholar for author profiles by name.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = GoogleApi()
val mauthors : kotlin.String = mauthors_example // kotlin.String | Author name query (e.g. 'Geoffrey Hinton')
val hl : kotlin.String = hl_example // kotlin.String | Language code
val afterAuthor : kotlin.String = afterAuthor_example // kotlin.String | Pagination token (next page)
val beforeAuthor : kotlin.String = beforeAuthor_example // kotlin.String | Pagination token (previous page)
try {
    val result : kotlin.Any = apiInstance.googleSearchScholarAuthorProfiles(mauthors, hl, afterAuthor, beforeAuthor)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GoogleApi#googleSearchScholarAuthorProfiles")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GoogleApi#googleSearchScholarAuthorProfiles")
    e.printStackTrace()
}
```

### Parameters
| **mauthors** | **kotlin.String**| Author name query (e.g. &#39;Geoffrey Hinton&#39;) | |
| **hl** | **kotlin.String**| Language code | [optional] [default to &quot;en&quot;] |
| **afterAuthor** | **kotlin.String**| Pagination token (next page) | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **beforeAuthor** | **kotlin.String**| Pagination token (previous page) | [optional] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="googleTrendingNews"></a>
# **googleTrendingNews**
> kotlin.Any googleTrendingNews(hl, gl, maxResults)

Trending news

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = GoogleApi()
val hl : kotlin.String = hl_example // kotlin.String | 
val gl : kotlin.String = gl_example // kotlin.String | 
val maxResults : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.Any = apiInstance.googleTrendingNews(hl, gl, maxResults)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GoogleApi#googleTrendingNews")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GoogleApi#googleTrendingNews")
    e.printStackTrace()
}
```

### Parameters
| **hl** | **kotlin.String**|  | [optional] [default to &quot;en&quot;] |
| **gl** | **kotlin.String**|  | [optional] [default to &quot;US&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **maxResults** | **kotlin.Int**|  | [optional] [default to 10] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="googleTrendingSearches"></a>
# **googleTrendingSearches**
> kotlin.Any googleTrendingSearches(geo)

Trending searches

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = GoogleApi()
val geo : kotlin.String = geo_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.googleTrendingSearches(geo)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GoogleApi#googleTrendingSearches")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GoogleApi#googleTrendingSearches")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **geo** | **kotlin.String**|  | [optional] [default to &quot;US&quot;] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="googleTrendsTopicAutocomplete"></a>
# **googleTrendsTopicAutocomplete**
> kotlin.Any googleTrendsTopicAutocomplete(q, hl, tz)

Trends topic autocomplete

Return categorized Knowledge Graph topic entities (mid, type) for a query.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = GoogleApi()
val q : kotlin.String = q_example // kotlin.String | Query prefix to resolve into Trends topics
val hl : kotlin.String = hl_example // kotlin.String | Language code
val tz : kotlin.String = tz_example // kotlin.String | Timezone offset in minutes
try {
    val result : kotlin.Any = apiInstance.googleTrendsTopicAutocomplete(q, hl, tz)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GoogleApi#googleTrendsTopicAutocomplete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GoogleApi#googleTrendsTopicAutocomplete")
    e.printStackTrace()
}
```

### Parameters
| **q** | **kotlin.String**| Query prefix to resolve into Trends topics | |
| **hl** | **kotlin.String**| Language code | [optional] [default to &quot;en-US&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tz** | **kotlin.String**| Timezone offset in minutes | [optional] [default to &quot;0&quot;] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

