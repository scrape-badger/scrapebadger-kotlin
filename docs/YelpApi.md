# YelpApi

All URIs are relative to *https://scrapebadger.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**yelpListMarkets**](YelpApi.md#yelpListMarkets) | **GET** /v1/yelp/markets | List markets |
| [**yelpSearchBusinesses**](YelpApi.md#yelpSearchBusinesses) | **GET** /v1/yelp/search | Search businesses |


<a id="yelpListMarkets"></a>
# **yelpListMarkets**
> YelpMarketsResponse yelpListMarkets()

List markets

Yelp sites this API verifiably searches. Free.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = YelpApi()
try {
    val result : YelpMarketsResponse = apiInstance.yelpListMarkets()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling YelpApi#yelpListMarkets")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling YelpApi#yelpListMarkets")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**YelpMarketsResponse**](YelpMarketsResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="yelpSearchBusinesses"></a>
# **yelpSearchBusinesses**
> YelpSearchResponse yelpSearchBusinesses(location, query, market, category, sortBy, price, features, page)

Search businesses

Ranked Yelp businesses for a location, with ads kept separate. 15 credits; empty results free.  Ten businesses per page, pages 1-11. Narrow the location, category or filters to reach more businesses. Business detail and reviews are not part of this API.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = YelpApi()
val location : kotlin.String = location_example // kotlin.String | Where to search, as typed into Yelp: city, neighbourhood, address or postcode.
val query : kotlin.String = query_example // kotlin.String | What to search for (e.g. pizza, plumbers). Optional when category is set.
val market : kotlin.String = market_example // kotlin.String | Yelp site to search; see /markets.
val category : kotlin.String = category_example // kotlin.String | Yelp category alias, e.g. pizza, coffee, plumbing.
val sortBy : kotlin.String = sortBy_example // kotlin.String | 
val price : kotlin.String = price_example // kotlin.String | Comma-separated price levels 1-4 ($ to $$$$).
val features : kotlin.String = features_example // kotlin.String | Comma-separated refinements: delivery, takeout, reservations, outdoor_seating, good_for_kids, dogs_allowed, free_wifi, wheelchair_accessible.
val page : kotlin.Int = 56 // kotlin.Int | 1-based page, ten businesses each; pages 1-11.
try {
    val result : YelpSearchResponse = apiInstance.yelpSearchBusinesses(location, query, market, category, sortBy, price, features, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling YelpApi#yelpSearchBusinesses")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling YelpApi#yelpSearchBusinesses")
    e.printStackTrace()
}
```

### Parameters
| **location** | **kotlin.String**| Where to search, as typed into Yelp: city, neighbourhood, address or postcode. | |
| **query** | **kotlin.String**| What to search for (e.g. pizza, plumbers). Optional when category is set. | [optional] |
| **market** | **kotlin.String**| Yelp site to search; see /markets. | [optional] [default to us] [enum: us, ca] |
| **category** | **kotlin.String**| Yelp category alias, e.g. pizza, coffee, plumbing. | [optional] |
| **sortBy** | **kotlin.String**|  | [optional] [default to recommended] [enum: recommended, rating, review_count] |
| **price** | **kotlin.String**| Comma-separated price levels 1-4 ($ to $$$$). | [optional] |
| **features** | **kotlin.String**| Comma-separated refinements: delivery, takeout, reservations, outdoor_seating, good_for_kids, dogs_allowed, free_wifi, wheelchair_accessible. | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **page** | **kotlin.Int**| 1-based page, ten businesses each; pages 1-11. | [optional] [default to 1] |

### Return type

[**YelpSearchResponse**](YelpSearchResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

