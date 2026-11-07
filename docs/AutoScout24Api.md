# AutoScout24Api

All URIs are relative to *https://scrapebadger.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**autoscout24CheckAutoscout24Health**](AutoScout24Api.md#autoscout24CheckAutoscout24Health) | **GET** /v1/autoscout24/health | Check AutoScout24 health |
| [**autoscout24GetListing**](AutoScout24Api.md#autoscout24GetListing) | **GET** /v1/autoscout24/listing | Get listing |
| [**autoscout24ListMarkets**](AutoScout24Api.md#autoscout24ListMarkets) | **GET** /v1/autoscout24/markets | List markets |
| [**autoscout24ListSearchFilters**](AutoScout24Api.md#autoscout24ListSearchFilters) | **GET** /v1/autoscout24/filters | List search filters |
| [**autoscout24SearchVehicles**](AutoScout24Api.md#autoscout24SearchVehicles) | **GET** /v1/autoscout24/search | Search vehicles |


<a id="autoscout24CheckAutoscout24Health"></a>
# **autoscout24CheckAutoscout24Health**
> kotlin.Any autoscout24CheckAutoscout24Health()

Check AutoScout24 health

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = AutoScout24Api()
try {
    val result : kotlin.Any = apiInstance.autoscout24CheckAutoscout24Health()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AutoScout24Api#autoscout24CheckAutoscout24Health")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AutoScout24Api#autoscout24CheckAutoscout24Health")
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

<a id="autoscout24GetListing"></a>
# **autoscout24GetListing**
> AutoScout24ListingResponse autoscout24GetListing(url, listingId, market)

Get listing

Full public vehicle specifications, equipment, photos, price and seller data.  Exactly one of url or listing_id is required. Supported markets match /markets. Successful detail costs 10 credits; removed or missing listings return an unbilled 404. Invalid inputs return 422 and source failures 503.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = AutoScout24Api()
val url : kotlin.String = url_example // kotlin.String | Full HTTPS listing URL from search results. Supply url or listing_id, not both.
val listingId : kotlin.String = listingId_example // kotlin.String | Listing UUID from search results; requires no SEO slug.
val market : kotlin.String = market_example // kotlin.String | Inferred from URL, otherwise de. Explicit market must match the URL host.
try {
    val result : AutoScout24ListingResponse = apiInstance.autoscout24GetListing(url, listingId, market)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AutoScout24Api#autoscout24GetListing")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AutoScout24Api#autoscout24GetListing")
    e.printStackTrace()
}
```

### Parameters
| **url** | **kotlin.String**| Full HTTPS listing URL from search results. Supply url or listing_id, not both. | [optional] |
| **listingId** | **kotlin.String**| Listing UUID from search results; requires no SEO slug. | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **market** | **kotlin.String**| Inferred from URL, otherwise de. Explicit market must match the URL host. | [optional] [enum: de, at, be, es, fr, it, lu, nl] |

### Return type

[**AutoScout24ListingResponse**](AutoScout24ListingResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="autoscout24ListMarkets"></a>
# **autoscout24ListMarkets**
> AutoScout24MarketsResponse autoscout24ListMarkets()

List markets

Verified marketplaces, domains, languages and currency. Free reference endpoint.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = AutoScout24Api()
try {
    val result : AutoScout24MarketsResponse = apiInstance.autoscout24ListMarkets()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AutoScout24Api#autoscout24ListMarkets")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AutoScout24Api#autoscout24ListMarkets")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AutoScout24MarketsResponse**](AutoScout24MarketsResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="autoscout24ListSearchFilters"></a>
# **autoscout24ListSearchFilters**
> AutoScout24FiltersResponse autoscout24ListSearchFilters(market, make)

List search filters

Current native make, model and vehicle filter options. Set make for its models.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = AutoScout24Api()
val market : kotlin.String = market_example // kotlin.String | 
val make : kotlin.String = make_example // kotlin.String | 
try {
    val result : AutoScout24FiltersResponse = apiInstance.autoscout24ListSearchFilters(market, make)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AutoScout24Api#autoscout24ListSearchFilters")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AutoScout24Api#autoscout24ListSearchFilters")
    e.printStackTrace()
}
```

### Parameters
| **market** | **kotlin.String**|  | [optional] [default to de] [enum: de, at, be, es, fr, it, lu, nl] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **make** | **kotlin.String**|  | [optional] |

### Return type

[**AutoScout24FiltersResponse**](AutoScout24FiltersResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="autoscout24SearchVehicles"></a>
# **autoscout24SearchVehicles**
> AutoScout24SearchResponse autoscout24SearchVehicles(market, make, model, priceMin, priceMax, mileageMin, mileageMax, yearMin, yearMax, powerMin, powerMax, fuelType, transmission, bodyType, sellerType, condition, zip, radius, sortBy, page)

Search vehicles

Search live vehicle cards, seller/location information and current filter taxonomy.  Browsing is capped at 200 pages (normally 20 cards each). Narrow the query to reach more inventory. Empty results cost zero credits. Pass a result&#39;s url or id to /listing for its full specifications and equipment.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = AutoScout24Api()
val market : kotlin.String = market_example // kotlin.String | 
val make : kotlin.String = make_example // kotlin.String | Native make slug, e.g. volkswagen or bmw.
val model : kotlin.String = model_example // kotlin.String | Native model slug, e.g. golf. Requires make.
val priceMin : kotlin.Int = 56 // kotlin.Int | 
val priceMax : kotlin.Int = 56 // kotlin.Int | 
val mileageMin : kotlin.Int = 56 // kotlin.Int | Kilometres.
val mileageMax : kotlin.Int = 56 // kotlin.Int | 
val yearMin : kotlin.Int = 56 // kotlin.Int | 
val yearMax : kotlin.Int = 56 // kotlin.Int | 
val powerMin : kotlin.Int = 56 // kotlin.Int | Engine power in kW.
val powerMax : kotlin.Int = 56 // kotlin.Int | 
val fuelType : kotlin.String = fuelType_example // kotlin.String | 
val transmission : kotlin.String = transmission_example // kotlin.String | 
val bodyType : kotlin.String = bodyType_example // kotlin.String | 
val sellerType : kotlin.String = sellerType_example // kotlin.String | 
val condition : kotlin.String = condition_example // kotlin.String | 
val zip : kotlin.String = zip_example // kotlin.String | Postal code in the requested market.
val radius : kotlin.Int = 56 // kotlin.Int | Kilometres; requires zip.
val sortBy : kotlin.String = sortBy_example // kotlin.String | 
val page : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : AutoScout24SearchResponse = apiInstance.autoscout24SearchVehicles(market, make, model, priceMin, priceMax, mileageMin, mileageMax, yearMin, yearMax, powerMin, powerMax, fuelType, transmission, bodyType, sellerType, condition, zip, radius, sortBy, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AutoScout24Api#autoscout24SearchVehicles")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AutoScout24Api#autoscout24SearchVehicles")
    e.printStackTrace()
}
```

### Parameters
| **market** | **kotlin.String**|  | [optional] [default to de] [enum: de, at, be, es, fr, it, lu, nl] |
| **make** | **kotlin.String**| Native make slug, e.g. volkswagen or bmw. | [optional] |
| **model** | **kotlin.String**| Native model slug, e.g. golf. Requires make. | [optional] |
| **priceMin** | **kotlin.Int**|  | [optional] |
| **priceMax** | **kotlin.Int**|  | [optional] |
| **mileageMin** | **kotlin.Int**| Kilometres. | [optional] |
| **mileageMax** | **kotlin.Int**|  | [optional] |
| **yearMin** | **kotlin.Int**|  | [optional] |
| **yearMax** | **kotlin.Int**|  | [optional] |
| **powerMin** | **kotlin.Int**| Engine power in kW. | [optional] |
| **powerMax** | **kotlin.Int**|  | [optional] |
| **fuelType** | **kotlin.String**|  | [optional] [enum: petrol, diesel, electric, hybrid_petrol, hybrid_diesel, cng, hydrogen, lpg, ethanol, other] |
| **transmission** | **kotlin.String**|  | [optional] [enum: automatic, manual, semi_automatic] |
| **bodyType** | **kotlin.String**|  | [optional] [enum: compact, convertible, coupe, suv, station_wagon, sedan, van, transporter, other] |
| **sellerType** | **kotlin.String**|  | [optional] [enum: dealer, private] |
| **condition** | **kotlin.String**|  | [optional] [enum: new, used, annual, classic, demo, day_registration] |
| **zip** | **kotlin.String**| Postal code in the requested market. | [optional] |
| **radius** | **kotlin.Int**| Kilometres; requires zip. | [optional] |
| **sortBy** | **kotlin.String**|  | [optional] [default to best_match] [enum: best_match, price_asc, price_desc, mileage_asc, mileage_desc, registration_asc, registration_desc, power_asc, power_desc, newest] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **page** | **kotlin.Int**|  | [optional] [default to 1] |

### Return type

[**AutoScout24SearchResponse**](AutoScout24SearchResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

