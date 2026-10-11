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
| [**gumtreeLocationSuggestions**](GumtreeApi.md#gumtreeLocationSuggestions) | **GET** /v1/gumtree/locations/autocomplete | Location suggestions |
| [**gumtreeSearchListings**](GumtreeApi.md#gumtreeSearchListings) | **GET** /v1/gumtree/search | Search listings |
| [**gumtreeSearchSuggestions**](GumtreeApi.md#gumtreeSearchSuggestions) | **GET** /v1/gumtree/autocomplete | Search suggestions |


<a id="gumtreeGetListing"></a>
# **gumtreeGetListing**
> kotlin.Any gumtreeGetListing(listingId)

Get listing

Full listing — description, attributes, images, seller, similar listings.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = GumtreeApi()
val listingId : kotlin.String = listingId_example // kotlin.String | Gumtree listing id — the number at the end of a gumtree.com/p/... URL
try {
    val result : kotlin.Any = apiInstance.gumtreeGetListing(listingId)
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
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **listingId** | **kotlin.String**| Gumtree listing id — the number at the end of a gumtree.com/p/... URL | |

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
> kotlin.Any gumtreeGetSearchFilters(category, location, query)

Get search filters

Filters, sort orders and radius options for a category, with live counts.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = GumtreeApi()
val category : kotlin.String = category_example // kotlin.String | Category slug, e.g. 'cars', 'for-sale', 'property-to-rent', 'jobs'. Default 'all'.
val location : kotlin.String = location_example // kotlin.String | Location slug ('london'), town name or UK postcode ('SW1A 1AA'). Default 'uk'.
val query : kotlin.String = query_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.gumtreeGetSearchFilters(category, location, query)
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
| **category** | **kotlin.String**| Category slug, e.g. &#39;cars&#39;, &#39;for-sale&#39;, &#39;property-to-rent&#39;, &#39;jobs&#39;. Default &#39;all&#39;. | [optional] [default to &quot;all&quot;] |
| **location** | **kotlin.String**| Location slug (&#39;london&#39;), town name or UK postcode (&#39;SW1A 1AA&#39;). Default &#39;uk&#39;. | [optional] [default to &quot;uk&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **query** | **kotlin.String**|  | [optional] |

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
> kotlin.Any gumtreeGetSellerListings(listingId, page)

Get seller listings

Every live listing by the seller of the given listing.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = GumtreeApi()
val listingId : kotlin.String = listingId_example // kotlin.String | Gumtree listing id — the number at the end of a gumtree.com/p/... URL
val page : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.Any = apiInstance.gumtreeGetSellerListings(listingId, page)
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
| **listingId** | **kotlin.String**| Gumtree listing id — the number at the end of a gumtree.com/p/... URL | |
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
> kotlin.Any gumtreeListCategories(parentId)

List categories

Browse Gumtree&#39;s category tree. A node&#39;s &#x60;slug&#x60; is the &#x60;/search&#x60; category.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = GumtreeApi()
val parentId : kotlin.Int = 56 // kotlin.Int | Parent category id (default: all)
try {
    val result : kotlin.Any = apiInstance.gumtreeListCategories(parentId)
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
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **parentId** | **kotlin.Int**| Parent category id (default: all) | [optional] [default to 1] |

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
> kotlin.Any gumtreeListLocations(parentId)

List locations

Browse Gumtree&#39;s location tree.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = GumtreeApi()
val parentId : kotlin.Int = 56 // kotlin.Int | Parent location id (default: UK)
try {
    val result : kotlin.Any = apiInstance.gumtreeListLocations(parentId)
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
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **parentId** | **kotlin.Int**| Parent location id (default: UK) | [optional] [default to 10000392] |

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
> kotlin.Any gumtreeLocationSuggestions(query)

Location suggestions

Resolve a place name or postcode to Gumtree locations with coordinates.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = GumtreeApi()
val query : kotlin.String = query_example // kotlin.String | Town or postcode prefix, e.g. 'manch'
try {
    val result : kotlin.Any = apiInstance.gumtreeLocationSuggestions(query)
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
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **query** | **kotlin.String**| Town or postcode prefix, e.g. &#39;manch&#39; | |

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
> kotlin.Any gumtreeSearchListings(query, category, location, distance, minPrice, maxPrice, sort, sellerType, urgentOnly, withPhotos, filters, page)

Search listings

Search gumtree.com listings. ~25-30 per page, up to 50 pages.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = GumtreeApi()
val query : kotlin.String = query_example // kotlin.String | Search keywords, e.g. 'mountain bike'
val category : kotlin.String = category_example // kotlin.String | Category slug, e.g. 'cars', 'for-sale', 'property-to-rent', 'jobs'. Default 'all'.
val location : kotlin.String = location_example // kotlin.String | Location slug ('london'), town name or UK postcode ('SW1A 1AA'). Default 'uk'.
val distance : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Radius in miles
val minPrice : kotlin.Int = 56 // kotlin.Int | GBP; needs a category
val maxPrice : kotlin.Int = 56 // kotlin.Int | GBP; needs a category
val sort : kotlin.String = sort_example // kotlin.String | 
val sellerType : kotlin.String = sellerType_example // kotlin.String | 
val urgentOnly : kotlin.Boolean = true // kotlin.Boolean | 
val withPhotos : kotlin.Boolean = true // kotlin.Boolean | 
val filters : kotlin.String = filters_example // kotlin.String | Category filters as key:value pairs, e.g. 'vehicle_make:bmw,vehicle_fuel_type:petrol'
val page : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.Any = apiInstance.gumtreeSearchListings(query, category, location, distance, minPrice, maxPrice, sort, sellerType, urgentOnly, withPhotos, filters, page)
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
| **category** | **kotlin.String**| Category slug, e.g. &#39;cars&#39;, &#39;for-sale&#39;, &#39;property-to-rent&#39;, &#39;jobs&#39;. Default &#39;all&#39;. | [optional] [default to &quot;all&quot;] |
| **location** | **kotlin.String**| Location slug (&#39;london&#39;), town name or UK postcode (&#39;SW1A 1AA&#39;). Default &#39;uk&#39;. | [optional] [default to &quot;uk&quot;] |
| **distance** | **java.math.BigDecimal**| Radius in miles | [optional] |
| **minPrice** | **kotlin.Int**| GBP; needs a category | [optional] |
| **maxPrice** | **kotlin.Int**| GBP; needs a category | [optional] |
| **sort** | **kotlin.String**|  | [optional] [enum: relevance, date, price_asc, price_desc, distance] |
| **sellerType** | **kotlin.String**|  | [optional] [enum: private, trade] |
| **urgentOnly** | **kotlin.Boolean**|  | [optional] [default to false] |
| **withPhotos** | **kotlin.Boolean**|  | [optional] [default to false] |
| **filters** | **kotlin.String**| Category filters as key:value pairs, e.g. &#39;vehicle_make:bmw,vehicle_fuel_type:petrol&#39; | [optional] |
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

<a id="gumtreeSearchSuggestions"></a>
# **gumtreeSearchSuggestions**
> kotlin.Any gumtreeSearchSuggestions(query)

Search suggestions

Gumtree search-box keyword suggestions with their categories.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = GumtreeApi()
val query : kotlin.String = query_example // kotlin.String | Partial search term, e.g. 'iph'
try {
    val result : kotlin.Any = apiInstance.gumtreeSearchSuggestions(query)
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
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **query** | **kotlin.String**| Partial search term, e.g. &#39;iph&#39; | |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

