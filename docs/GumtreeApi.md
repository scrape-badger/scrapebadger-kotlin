# GumtreeApi

All URIs are relative to *https://scrapebadger.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**gumtreeGetListing**](GumtreeApi.md#gumtreeGetListing) | **GET** /v1/gumtree/listings/{listing_id} | Get listing |
| [**gumtreeGetSearchFilters**](GumtreeApi.md#gumtreeGetSearchFilters) | **GET** /v1/gumtree/search/filters | Get search filters |
| [**gumtreeGetSellerListings**](GumtreeApi.md#gumtreeGetSellerListings) | **GET** /v1/gumtree/listings/{listing_id}/seller-listings | Get seller listings |
| [**gumtreeGumtreeScraperHealthCheck**](GumtreeApi.md#gumtreeGumtreeScraperHealthCheck) | **GET** /v1/gumtree/health | Gumtree scraper health check |
| [**gumtreeGumtreeScraperHealthCheckHead**](GumtreeApi.md#gumtreeGumtreeScraperHealthCheckHead) | **HEAD** /v1/gumtree/health | Gumtree scraper health check |
| [**gumtreeListCategories**](GumtreeApi.md#gumtreeListCategories) | **GET** /v1/gumtree/categories | List categories |
| [**gumtreeListLocations**](GumtreeApi.md#gumtreeListLocations) | **GET** /v1/gumtree/locations | List locations |
| [**gumtreeListMarkets**](GumtreeApi.md#gumtreeListMarkets) | **GET** /v1/gumtree/markets | List markets |
| [**gumtreeLocationSuggestions**](GumtreeApi.md#gumtreeLocationSuggestions) | **GET** /v1/gumtree/locations/autocomplete | Location suggestions |
| [**gumtreeSearchListings**](GumtreeApi.md#gumtreeSearchListings) | **GET** /v1/gumtree/search | Search listings |
| [**gumtreeSearchSuggestions**](GumtreeApi.md#gumtreeSearchSuggestions) | **GET** /v1/gumtree/autocomplete | Search suggestions |


<a id="gumtreeGetListing"></a>
# **gumtreeGetListing**
> kotlin.Any gumtreeGetListing(listingId, market)

Get listing

Full listing — description, attributes, images, seller, similar listings.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = GumtreeApi()
val listingId : kotlin.String = listingId_example // kotlin.String | Gumtree listing id — the number at the end of the listing URL (uk/au: ~10 digits; za: the full 26-digit ad id, not the short one)
val market : kotlin.String = market_example // kotlin.String | Which Gumtree: 'uk' (gumtree.com, GBP), 'au' (gumtree.com.au, AUD) or 'za' (gumtree.co.za, ZAR). Separate sites — ids from one market mean nothing in another.
try {
    val result : kotlin.Any = apiInstance.gumtreeGetListing(listingId, market)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GumtreeApi#gumtreeGetListing")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GumtreeApi#gumtreeGetListing")
    e.printStackTrace()
}
```

### Parameters
| **listingId** | **kotlin.String**| Gumtree listing id — the number at the end of the listing URL (uk/au: ~10 digits; za: the full 26-digit ad id, not the short one) | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **market** | **kotlin.String**| Which Gumtree: &#39;uk&#39; (gumtree.com, GBP), &#39;au&#39; (gumtree.com.au, AUD) or &#39;za&#39; (gumtree.co.za, ZAR). Separate sites — ids from one market mean nothing in another. | [optional] [default to uk] [enum: uk, au, za] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="gumtreeGetSearchFilters"></a>
# **gumtreeGetSearchFilters**
> kotlin.Any gumtreeGetSearchFilters(category, location, query, filters, market)

Get search filters

Filters, sort orders and radius options for a category, with live counts.  Feed a &#x60;key&#x60; and a &#x60;value&#x60; back into &#x60;/search&#x60; as &#x60;filters&#x3D;key:value&#x60;.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = GumtreeApi()
val category : kotlin.String = category_example // kotlin.String | uk: category slug, e.g. 'cars', 'for-sale', 'property-to-rent', 'jobs', 'bicycles'. au/za: numeric category id, e.g. '18320' (au cars) or '9077' (za cars). Use /categories to browse the tree. Default 'all'.
val location : kotlin.String = location_example // kotlin.String | uk: location slug ('london'), town name or UK postcode ('SW1A 1AA'). au/za: numeric location id, e.g. '3003435' (au Sydney) or '3100003' (za Gauteng). Use /locations/autocomplete to resolve one. Default: the whole country.
val query : kotlin.String = query_example // kotlin.String | Optional keywords to scope the counts
val filters : kotlin.String = filters_example // kotlin.String | za only: filters already applied (e.g. 'ma:toyota' to list Toyota models)
val market : kotlin.String = market_example // kotlin.String | Which Gumtree: 'uk' (gumtree.com, GBP), 'au' (gumtree.com.au, AUD) or 'za' (gumtree.co.za, ZAR). Separate sites — ids from one market mean nothing in another.
try {
    val result : kotlin.Any = apiInstance.gumtreeGetSearchFilters(category, location, query, filters, market)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GumtreeApi#gumtreeGetSearchFilters")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GumtreeApi#gumtreeGetSearchFilters")
    e.printStackTrace()
}
```

### Parameters
| **category** | **kotlin.String**| uk: category slug, e.g. &#39;cars&#39;, &#39;for-sale&#39;, &#39;property-to-rent&#39;, &#39;jobs&#39;, &#39;bicycles&#39;. au/za: numeric category id, e.g. &#39;18320&#39; (au cars) or &#39;9077&#39; (za cars). Use /categories to browse the tree. Default &#39;all&#39;. | [optional] [default to &quot;all&quot;] |
| **location** | **kotlin.String**| uk: location slug (&#39;london&#39;), town name or UK postcode (&#39;SW1A 1AA&#39;). au/za: numeric location id, e.g. &#39;3003435&#39; (au Sydney) or &#39;3100003&#39; (za Gauteng). Use /locations/autocomplete to resolve one. Default: the whole country. | [optional] |
| **query** | **kotlin.String**| Optional keywords to scope the counts | [optional] |
| **filters** | **kotlin.String**| za only: filters already applied (e.g. &#39;ma:toyota&#39; to list Toyota models) | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **market** | **kotlin.String**| Which Gumtree: &#39;uk&#39; (gumtree.com, GBP), &#39;au&#39; (gumtree.com.au, AUD) or &#39;za&#39; (gumtree.co.za, ZAR). Separate sites — ids from one market mean nothing in another. | [optional] [default to uk] [enum: uk, au, za] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="gumtreeGetSellerListings"></a>
# **gumtreeGetSellerListings**
> kotlin.Any gumtreeGetSellerListings(listingId, page, market)

Get seller listings

Every live listing by the seller of the given listing.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = GumtreeApi()
val listingId : kotlin.String = listingId_example // kotlin.String | Gumtree listing id — the number at the end of the listing URL (uk/au: ~10 digits; za: the full 26-digit ad id, not the short one)
val page : kotlin.Int = 56 // kotlin.Int | 
val market : kotlin.String = market_example // kotlin.String | Which Gumtree: 'uk' (gumtree.com, GBP), 'au' (gumtree.com.au, AUD) or 'za' (gumtree.co.za, ZAR). Separate sites — ids from one market mean nothing in another.
try {
    val result : kotlin.Any = apiInstance.gumtreeGetSellerListings(listingId, page, market)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GumtreeApi#gumtreeGetSellerListings")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GumtreeApi#gumtreeGetSellerListings")
    e.printStackTrace()
}
```

### Parameters
| **listingId** | **kotlin.String**| Gumtree listing id — the number at the end of the listing URL (uk/au: ~10 digits; za: the full 26-digit ad id, not the short one) | |
| **page** | **kotlin.Int**|  | [optional] [default to 1] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **market** | **kotlin.String**| Which Gumtree: &#39;uk&#39; (gumtree.com, GBP), &#39;au&#39; (gumtree.com.au, AUD) or &#39;za&#39; (gumtree.co.za, ZAR). Separate sites — ids from one market mean nothing in another. | [optional] [default to uk] [enum: uk, au, za] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="gumtreeGumtreeScraperHealthCheck"></a>
# **gumtreeGumtreeScraperHealthCheck**
> kotlin.Any gumtreeGumtreeScraperHealthCheck()

Gumtree scraper health check

Check health of the Gumtree scraper service (accepts HEAD for UptimeRobot).

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = GumtreeApi()
try {
    val result : kotlin.Any = apiInstance.gumtreeGumtreeScraperHealthCheck()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GumtreeApi#gumtreeGumtreeScraperHealthCheck")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GumtreeApi#gumtreeGumtreeScraperHealthCheck")
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

<a id="gumtreeGumtreeScraperHealthCheckHead"></a>
# **gumtreeGumtreeScraperHealthCheckHead**
> kotlin.Any gumtreeGumtreeScraperHealthCheckHead()

Gumtree scraper health check

Check health of the Gumtree scraper service (accepts HEAD for UptimeRobot).

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = GumtreeApi()
try {
    val result : kotlin.Any = apiInstance.gumtreeGumtreeScraperHealthCheckHead()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GumtreeApi#gumtreeGumtreeScraperHealthCheckHead")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GumtreeApi#gumtreeGumtreeScraperHealthCheckHead")
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

<a id="gumtreeListCategories"></a>
# **gumtreeListCategories**
> kotlin.Any gumtreeListCategories(parentId, market)

List categories

Browse Gumtree&#39;s category tree.  A node&#39;s &#x60;slug&#x60; (uk) or &#x60;id&#x60; (au/za) is the &#x60;/search&#x60; category.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = GumtreeApi()
val parentId : kotlin.Int = 56 // kotlin.Int | Category id to list the children of (default: all)
val market : kotlin.String = market_example // kotlin.String | Which Gumtree: 'uk' (gumtree.com, GBP), 'au' (gumtree.com.au, AUD) or 'za' (gumtree.co.za, ZAR). Separate sites — ids from one market mean nothing in another.
try {
    val result : kotlin.Any = apiInstance.gumtreeListCategories(parentId, market)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GumtreeApi#gumtreeListCategories")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GumtreeApi#gumtreeListCategories")
    e.printStackTrace()
}
```

### Parameters
| **parentId** | **kotlin.Int**| Category id to list the children of (default: all) | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **market** | **kotlin.String**| Which Gumtree: &#39;uk&#39; (gumtree.com, GBP), &#39;au&#39; (gumtree.com.au, AUD) or &#39;za&#39; (gumtree.co.za, ZAR). Separate sites — ids from one market mean nothing in another. | [optional] [default to uk] [enum: uk, au, za] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="gumtreeListLocations"></a>
# **gumtreeListLocations**
> kotlin.Any gumtreeListLocations(parentId, market)

List locations

Browse Gumtree&#39;s location tree.  uk: UK -&gt; nations -&gt; counties -&gt; towns. au: states -&gt; regions -&gt; areas, each with its live ad count. za: provinces -&gt; towns.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = GumtreeApi()
val parentId : kotlin.Int = 56 // kotlin.Int | Location id to list the children of (default: the whole country)
val market : kotlin.String = market_example // kotlin.String | Which Gumtree: 'uk' (gumtree.com, GBP), 'au' (gumtree.com.au, AUD) or 'za' (gumtree.co.za, ZAR). Separate sites — ids from one market mean nothing in another.
try {
    val result : kotlin.Any = apiInstance.gumtreeListLocations(parentId, market)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GumtreeApi#gumtreeListLocations")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GumtreeApi#gumtreeListLocations")
    e.printStackTrace()
}
```

### Parameters
| **parentId** | **kotlin.Int**| Location id to list the children of (default: the whole country) | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **market** | **kotlin.String**| Which Gumtree: &#39;uk&#39; (gumtree.com, GBP), &#39;au&#39; (gumtree.com.au, AUD) or &#39;za&#39; (gumtree.co.za, ZAR). Separate sites — ids from one market mean nothing in another. | [optional] [default to uk] [enum: uk, au, za] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="gumtreeListMarkets"></a>
# **gumtreeListMarkets**
> kotlin.Any gumtreeListMarkets()

List markets

The Gumtree sites this API covers (uk, au, za) with currency and id formats.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = GumtreeApi()
try {
    val result : kotlin.Any = apiInstance.gumtreeListMarkets()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GumtreeApi#gumtreeListMarkets")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GumtreeApi#gumtreeListMarkets")
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

<a id="gumtreeLocationSuggestions"></a>
# **gumtreeLocationSuggestions**
> kotlin.Any gumtreeLocationSuggestions(query, market)

Location suggestions

Resolve a place name or postcode to Gumtree location ids (uk: with coordinates).  The &#x60;id&#x60; (au/za) or &#x60;name&#x60; (uk) is what &#x60;/search&#x60; takes as &#x60;location&#x60;.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = GumtreeApi()
val query : kotlin.String = query_example // kotlin.String | Town, area or postcode prefix, e.g. 'manch' or 'SW1A'
val market : kotlin.String = market_example // kotlin.String | Which Gumtree: 'uk' (gumtree.com, GBP), 'au' (gumtree.com.au, AUD) or 'za' (gumtree.co.za, ZAR). Separate sites — ids from one market mean nothing in another.
try {
    val result : kotlin.Any = apiInstance.gumtreeLocationSuggestions(query, market)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GumtreeApi#gumtreeLocationSuggestions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GumtreeApi#gumtreeLocationSuggestions")
    e.printStackTrace()
}
```

### Parameters
| **query** | **kotlin.String**| Town, area or postcode prefix, e.g. &#39;manch&#39; or &#39;SW1A&#39; | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **market** | **kotlin.String**| Which Gumtree: &#39;uk&#39; (gumtree.com, GBP), &#39;au&#39; (gumtree.com.au, AUD) or &#39;za&#39; (gumtree.co.za, ZAR). Separate sites — ids from one market mean nothing in another. | [optional] [default to uk] [enum: uk, au, za] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="gumtreeSearchListings"></a>
# **gumtreeSearchListings**
> kotlin.Any gumtreeSearchListings(query, category, location, distance, minPrice, maxPrice, sort, sellerType, urgentOnly, withPhotos, filters, page, market)

Search listings

Search Gumtree listings in the UK, Australia or South Africa.  Up to 50 pages. Page size: uk 25, au 24 (plus up to 6 featured top ads), za 20.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = GumtreeApi()
val query : kotlin.String = query_example // kotlin.String | Search keywords, e.g. 'mountain bike'
val category : kotlin.String = category_example // kotlin.String | uk: category slug, e.g. 'cars', 'for-sale', 'property-to-rent', 'jobs', 'bicycles'. au/za: numeric category id, e.g. '18320' (au cars) or '9077' (za cars). Use /categories to browse the tree. Default 'all'.
val location : kotlin.String = location_example // kotlin.String | uk: location slug ('london'), town name or UK postcode ('SW1A 1AA'). au/za: numeric location id, e.g. '3003435' (au Sydney) or '3100003' (za Gauteng). Use /locations/autocomplete to resolve one. Default: the whole country.
val distance : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Radius around `location`: miles (uk) or km (au). Not offered by za.
val minPrice : kotlin.Int = 56 // kotlin.Int | Minimum price in the market's currency (uk: needs a category, not 'all')
val maxPrice : kotlin.Int = 56 // kotlin.Int | Maximum price in the market's currency (uk: needs a category, not 'all')
val sort : kotlin.String = sort_example // kotlin.String | Result ordering (default relevance). 'distance' needs uk, or au with a location.
val sellerType : kotlin.String = sellerType_example // kotlin.String | uk/za: 'trade' covers dealers, agencies and recruiters. au: not supported — use a category filter such as 'cars.forsaleby_s:ownr'.
val urgentOnly : kotlin.Boolean = true // kotlin.Boolean | uk only: only ads marked urgent
val withPhotos : kotlin.Boolean = true // kotlin.Boolean | uk only: only ads with photos
val filters : kotlin.String = filters_example // kotlin.String | Category-specific filters as comma-separated key:value pairs, e.g. 'vehicle_make:bmw,vehicle_fuel_type:petrol,min_vehicle_mileage:10000' (uk), 'cars.carmake_s:toyota,cars.forsaleby_s:ownr' (au) or 'ma:toyota,fu:petrol,max_km:100000' (za). Range filters take min_<key>/max_<key>. Discover keys and values with /search/filters for the same market.
val page : kotlin.Int = 56 // kotlin.Int | 
val market : kotlin.String = market_example // kotlin.String | Which Gumtree: 'uk' (gumtree.com, GBP), 'au' (gumtree.com.au, AUD) or 'za' (gumtree.co.za, ZAR). Separate sites — ids from one market mean nothing in another.
try {
    val result : kotlin.Any = apiInstance.gumtreeSearchListings(query, category, location, distance, minPrice, maxPrice, sort, sellerType, urgentOnly, withPhotos, filters, page, market)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GumtreeApi#gumtreeSearchListings")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GumtreeApi#gumtreeSearchListings")
    e.printStackTrace()
}
```

### Parameters
| **query** | **kotlin.String**| Search keywords, e.g. &#39;mountain bike&#39; | [optional] |
| **category** | **kotlin.String**| uk: category slug, e.g. &#39;cars&#39;, &#39;for-sale&#39;, &#39;property-to-rent&#39;, &#39;jobs&#39;, &#39;bicycles&#39;. au/za: numeric category id, e.g. &#39;18320&#39; (au cars) or &#39;9077&#39; (za cars). Use /categories to browse the tree. Default &#39;all&#39;. | [optional] [default to &quot;all&quot;] |
| **location** | **kotlin.String**| uk: location slug (&#39;london&#39;), town name or UK postcode (&#39;SW1A 1AA&#39;). au/za: numeric location id, e.g. &#39;3003435&#39; (au Sydney) or &#39;3100003&#39; (za Gauteng). Use /locations/autocomplete to resolve one. Default: the whole country. | [optional] |
| **distance** | **java.math.BigDecimal**| Radius around &#x60;location&#x60;: miles (uk) or km (au). Not offered by za. | [optional] |
| **minPrice** | **kotlin.Int**| Minimum price in the market&#39;s currency (uk: needs a category, not &#39;all&#39;) | [optional] |
| **maxPrice** | **kotlin.Int**| Maximum price in the market&#39;s currency (uk: needs a category, not &#39;all&#39;) | [optional] |
| **sort** | **kotlin.String**| Result ordering (default relevance). &#39;distance&#39; needs uk, or au with a location. | [optional] [enum: relevance, date, price_asc, price_desc, distance] |
| **sellerType** | **kotlin.String**| uk/za: &#39;trade&#39; covers dealers, agencies and recruiters. au: not supported — use a category filter such as &#39;cars.forsaleby_s:ownr&#39;. | [optional] [enum: private, trade] |
| **urgentOnly** | **kotlin.Boolean**| uk only: only ads marked urgent | [optional] [default to false] |
| **withPhotos** | **kotlin.Boolean**| uk only: only ads with photos | [optional] [default to false] |
| **filters** | **kotlin.String**| Category-specific filters as comma-separated key:value pairs, e.g. &#39;vehicle_make:bmw,vehicle_fuel_type:petrol,min_vehicle_mileage:10000&#39; (uk), &#39;cars.carmake_s:toyota,cars.forsaleby_s:ownr&#39; (au) or &#39;ma:toyota,fu:petrol,max_km:100000&#39; (za). Range filters take min_&lt;key&gt;/max_&lt;key&gt;. Discover keys and values with /search/filters for the same market. | [optional] |
| **page** | **kotlin.Int**|  | [optional] [default to 1] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **market** | **kotlin.String**| Which Gumtree: &#39;uk&#39; (gumtree.com, GBP), &#39;au&#39; (gumtree.com.au, AUD) or &#39;za&#39; (gumtree.co.za, ZAR). Separate sites — ids from one market mean nothing in another. | [optional] [default to uk] [enum: uk, au, za] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="gumtreeSearchSuggestions"></a>
# **gumtreeSearchSuggestions**
> kotlin.Any gumtreeSearchSuggestions(query, market)

Search suggestions

Gumtree search-box keyword suggestions with their categories.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = GumtreeApi()
val query : kotlin.String = query_example // kotlin.String | Partial search term, e.g. 'iph'
val market : kotlin.String = market_example // kotlin.String | Which Gumtree: 'uk' (gumtree.com, GBP), 'au' (gumtree.com.au, AUD) or 'za' (gumtree.co.za, ZAR). Separate sites — ids from one market mean nothing in another.
try {
    val result : kotlin.Any = apiInstance.gumtreeSearchSuggestions(query, market)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GumtreeApi#gumtreeSearchSuggestions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GumtreeApi#gumtreeSearchSuggestions")
    e.printStackTrace()
}
```

### Parameters
| **query** | **kotlin.String**| Partial search term, e.g. &#39;iph&#39; | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **market** | **kotlin.String**| Which Gumtree: &#39;uk&#39; (gumtree.com, GBP), &#39;au&#39; (gumtree.com.au, AUD) or &#39;za&#39; (gumtree.co.za, ZAR). Separate sites — ids from one market mean nothing in another. | [optional] [default to uk] [enum: uk, au, za] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

