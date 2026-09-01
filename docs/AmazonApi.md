# AmazonApi

All URIs are relative to *https://scrapebadger.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**amazonAmazonScraperHealthCheck**](AmazonApi.md#amazonAmazonScraperHealthCheck) | **GET** /v1/amazon/health | Amazon scraper health check |
| [**amazonAmazonScraperHealthCheckHead**](AmazonApi.md#amazonAmazonScraperHealthCheckHead) | **HEAD** /v1/amazon/health | Amazon scraper health check |
| [**amazonBestsellersByCategory**](AmazonApi.md#amazonBestsellersByCategory) | **GET** /v1/amazon/bestsellers | Bestsellers by category |
| [**amazonBrowseNodeCategoryListing**](AmazonApi.md#amazonBrowseNodeCategoryListing) | **GET** /v1/amazon/category | Browse-node category listing |
| [**amazonGetAllSellerOffersBuybox**](AmazonApi.md#amazonGetAllSellerOffersBuybox) | **GET** /v1/amazon/products/{asin}/offers | Get all seller offers (buybox) |
| [**amazonGetProductDetail**](AmazonApi.md#amazonGetProductDetail) | **GET** /v1/amazon/products/{asin} | Get product detail |
| [**amazonGetProductReviews**](AmazonApi.md#amazonGetProductReviews) | **GET** /v1/amazon/products/{asin}/reviews | Get product reviews |
| [**amazonGetSellerFeedback**](AmazonApi.md#amazonGetSellerFeedback) | **GET** /v1/amazon/sellers/{seller_id}/feedback | Get seller feedback |
| [**amazonGetSellerProfile**](AmazonApi.md#amazonGetSellerProfile) | **GET** /v1/amazon/sellers/{seller_id} | Get seller profile |
| [**amazonGetSellerStorefrontProducts**](AmazonApi.md#amazonGetSellerStorefrontProducts) | **GET** /v1/amazon/sellers/{seller_id}/products | Get seller storefront products |
| [**amazonKeywordSuggestions**](AmazonApi.md#amazonKeywordSuggestions) | **GET** /v1/amazon/autocomplete | Keyword suggestions |
| [**amazonListCategoryAliases**](AmazonApi.md#amazonListCategoryAliases) | **GET** /v1/amazon/categories | List category aliases |
| [**amazonListMarketplaces**](AmazonApi.md#amazonListMarketplaces) | **GET** /v1/amazon/markets | List marketplaces |
| [**amazonNewReleasesByCategory**](AmazonApi.md#amazonNewReleasesByCategory) | **GET** /v1/amazon/new-releases | New releases by category |
| [**amazonSearchAmazonProducts**](AmazonApi.md#amazonSearchAmazonProducts) | **GET** /v1/amazon/search | Search Amazon products |
| [**amazonTodaySDeals**](AmazonApi.md#amazonTodaySDeals) | **GET** /v1/amazon/deals | Today&#39;s deals |


<a id="amazonAmazonScraperHealthCheck"></a>
# **amazonAmazonScraperHealthCheck**
> kotlin.Any amazonAmazonScraperHealthCheck()

Amazon scraper health check

Check health of the Amazon scraper service (accepts HEAD for UptimeRobot).

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = AmazonApi()
try {
    val result : kotlin.Any = apiInstance.amazonAmazonScraperHealthCheck()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AmazonApi#amazonAmazonScraperHealthCheck")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AmazonApi#amazonAmazonScraperHealthCheck")
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

<a id="amazonAmazonScraperHealthCheckHead"></a>
# **amazonAmazonScraperHealthCheckHead**
> kotlin.Any amazonAmazonScraperHealthCheckHead()

Amazon scraper health check

Check health of the Amazon scraper service (accepts HEAD for UptimeRobot).

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = AmazonApi()
try {
    val result : kotlin.Any = apiInstance.amazonAmazonScraperHealthCheckHead()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AmazonApi#amazonAmazonScraperHealthCheckHead")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AmazonApi#amazonAmazonScraperHealthCheckHead")
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

<a id="amazonBestsellersByCategory"></a>
# **amazonBestsellersByCategory**
> kotlin.Any amazonBestsellersByCategory(domain, category, page)

Bestsellers by category

Top-selling products for a category (browse node).

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = AmazonApi()
val domain : kotlin.String = domain_example // kotlin.String | 
val category : kotlin.String = category_example // kotlin.String | Bestsellers node id or slug
val page : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.Any = apiInstance.amazonBestsellersByCategory(domain, category, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AmazonApi#amazonBestsellersByCategory")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AmazonApi#amazonBestsellersByCategory")
    e.printStackTrace()
}
```

### Parameters
| **domain** | **kotlin.String**|  | [optional] [default to &quot;com&quot;] |
| **category** | **kotlin.String**| Bestsellers node id or slug | [optional] |
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

<a id="amazonBrowseNodeCategoryListing"></a>
# **amazonBrowseNodeCategoryListing**
> kotlin.Any amazonBrowseNodeCategoryListing(node, domain, page, sortBy)

Browse-node category listing

List products within an Amazon browse-node category.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = AmazonApi()
val node : kotlin.String = node_example // kotlin.String | Amazon browse-node id
val domain : kotlin.String = domain_example // kotlin.String | 
val page : kotlin.Int = 56 // kotlin.Int | 
val sortBy : kotlin.String = sortBy_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.amazonBrowseNodeCategoryListing(node, domain, page, sortBy)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AmazonApi#amazonBrowseNodeCategoryListing")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AmazonApi#amazonBrowseNodeCategoryListing")
    e.printStackTrace()
}
```

### Parameters
| **node** | **kotlin.String**| Amazon browse-node id | |
| **domain** | **kotlin.String**|  | [optional] [default to &quot;com&quot;] |
| **page** | **kotlin.Int**|  | [optional] [default to 1] |
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

<a id="amazonGetAllSellerOffersBuybox"></a>
# **amazonGetAllSellerOffersBuybox**
> kotlin.Any amazonGetAllSellerOffersBuybox(asin, domain, zip, page)

Get all seller offers (buybox)

All third-party offers for an ASIN, including the Buy Box winner.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = AmazonApi()
val asin : kotlin.String = asin_example // kotlin.String | 
val domain : kotlin.String = domain_example // kotlin.String | 
val zip : kotlin.String = zip_example // kotlin.String | 
val page : kotlin.Int = 56 // kotlin.Int | Offer page, 10 rows each
try {
    val result : kotlin.Any = apiInstance.amazonGetAllSellerOffersBuybox(asin, domain, zip, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AmazonApi#amazonGetAllSellerOffersBuybox")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AmazonApi#amazonGetAllSellerOffersBuybox")
    e.printStackTrace()
}
```

### Parameters
| **asin** | **kotlin.String**|  | |
| **domain** | **kotlin.String**|  | [optional] [default to &quot;com&quot;] |
| **zip** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **page** | **kotlin.Int**| Offer page, 10 rows each | [optional] [default to 1] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="amazonGetProductDetail"></a>
# **amazonGetProductDetail**
> kotlin.Any amazonGetProductDetail(asin, domain, zip, language)

Get product detail

Full product detail by ASIN (price, variants, badges, buybox, ranks…).

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = AmazonApi()
val asin : kotlin.String = asin_example // kotlin.String | 
val domain : kotlin.String = domain_example // kotlin.String | 
val zip : kotlin.String = zip_example // kotlin.String | Delivery postal/zip for localized buybox
val language : kotlin.String = language_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.amazonGetProductDetail(asin, domain, zip, language)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AmazonApi#amazonGetProductDetail")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AmazonApi#amazonGetProductDetail")
    e.printStackTrace()
}
```

### Parameters
| **asin** | **kotlin.String**|  | |
| **domain** | **kotlin.String**|  | [optional] [default to &quot;com&quot;] |
| **zip** | **kotlin.String**| Delivery postal/zip for localized buybox | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **language** | **kotlin.String**|  | [optional] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="amazonGetProductReviews"></a>
# **amazonGetProductReviews**
> kotlin.Any amazonGetProductReviews(asin, domain, page, sortBy, star, verifiedOnly, mediaOnly)

Get product reviews

Customer reviews for an ASIN (featured + paginated, with filters).

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = AmazonApi()
val asin : kotlin.String = asin_example // kotlin.String | 
val domain : kotlin.String = domain_example // kotlin.String | 
val page : kotlin.Int = 56 // kotlin.Int | Review page (1-100, ~10 reviews/page)
val sortBy : kotlin.String = sortBy_example // kotlin.String | helpful | recent
val star : kotlin.String = star_example // kotlin.String | one_star..five_star | positive | critical
val verifiedOnly : kotlin.Boolean = true // kotlin.Boolean | 
val mediaOnly : kotlin.Boolean = true // kotlin.Boolean | 
try {
    val result : kotlin.Any = apiInstance.amazonGetProductReviews(asin, domain, page, sortBy, star, verifiedOnly, mediaOnly)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AmazonApi#amazonGetProductReviews")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AmazonApi#amazonGetProductReviews")
    e.printStackTrace()
}
```

### Parameters
| **asin** | **kotlin.String**|  | |
| **domain** | **kotlin.String**|  | [optional] [default to &quot;com&quot;] |
| **page** | **kotlin.Int**| Review page (1-100, ~10 reviews/page) | [optional] [default to 1] |
| **sortBy** | **kotlin.String**| helpful | recent | [optional] [default to &quot;helpful&quot;] |
| **star** | **kotlin.String**| one_star..five_star | positive | critical | [optional] |
| **verifiedOnly** | **kotlin.Boolean**|  | [optional] [default to false] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mediaOnly** | **kotlin.Boolean**|  | [optional] [default to false] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="amazonGetSellerFeedback"></a>
# **amazonGetSellerFeedback**
> kotlin.Any amazonGetSellerFeedback(sellerId, domain, page)

Get seller feedback

Buyer feedback entries for a seller.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = AmazonApi()
val sellerId : kotlin.String = sellerId_example // kotlin.String | 
val domain : kotlin.String = domain_example // kotlin.String | 
val page : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.Any = apiInstance.amazonGetSellerFeedback(sellerId, domain, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AmazonApi#amazonGetSellerFeedback")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AmazonApi#amazonGetSellerFeedback")
    e.printStackTrace()
}
```

### Parameters
| **sellerId** | **kotlin.String**|  | |
| **domain** | **kotlin.String**|  | [optional] [default to &quot;com&quot;] |
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

<a id="amazonGetSellerProfile"></a>
# **amazonGetSellerProfile**
> kotlin.Any amazonGetSellerProfile(sellerId, domain)

Get seller profile

Seller profile, ratings and feedback summary.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = AmazonApi()
val sellerId : kotlin.String = sellerId_example // kotlin.String | 
val domain : kotlin.String = domain_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.amazonGetSellerProfile(sellerId, domain)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AmazonApi#amazonGetSellerProfile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AmazonApi#amazonGetSellerProfile")
    e.printStackTrace()
}
```

### Parameters
| **sellerId** | **kotlin.String**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **domain** | **kotlin.String**|  | [optional] [default to &quot;com&quot;] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="amazonGetSellerStorefrontProducts"></a>
# **amazonGetSellerStorefrontProducts**
> kotlin.Any amazonGetSellerStorefrontProducts(sellerId, domain, page)

Get seller storefront products

Products listed in a seller&#39;s storefront.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = AmazonApi()
val sellerId : kotlin.String = sellerId_example // kotlin.String | 
val domain : kotlin.String = domain_example // kotlin.String | 
val page : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.Any = apiInstance.amazonGetSellerStorefrontProducts(sellerId, domain, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AmazonApi#amazonGetSellerStorefrontProducts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AmazonApi#amazonGetSellerStorefrontProducts")
    e.printStackTrace()
}
```

### Parameters
| **sellerId** | **kotlin.String**|  | |
| **domain** | **kotlin.String**|  | [optional] [default to &quot;com&quot;] |
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

<a id="amazonKeywordSuggestions"></a>
# **amazonKeywordSuggestions**
> kotlin.Any amazonKeywordSuggestions(query, domain)

Keyword suggestions

Get Amazon search autocomplete suggestions for keyword research.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = AmazonApi()
val query : kotlin.String = query_example // kotlin.String | Partial search term
val domain : kotlin.String = domain_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.amazonKeywordSuggestions(query, domain)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AmazonApi#amazonKeywordSuggestions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AmazonApi#amazonKeywordSuggestions")
    e.printStackTrace()
}
```

### Parameters
| **query** | **kotlin.String**| Partial search term | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **domain** | **kotlin.String**|  | [optional] [default to &quot;com&quot;] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="amazonListCategoryAliases"></a>
# **amazonListCategoryAliases**
> kotlin.Any amazonListCategoryAliases(domain)

List category aliases

List common Amazon department/category aliases and bestseller nodes.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = AmazonApi()
val domain : kotlin.String = domain_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.amazonListCategoryAliases(domain)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AmazonApi#amazonListCategoryAliases")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AmazonApi#amazonListCategoryAliases")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **domain** | **kotlin.String**|  | [optional] [default to &quot;com&quot;] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="amazonListMarketplaces"></a>
# **amazonListMarketplaces**
> kotlin.Any amazonListMarketplaces()

List marketplaces

List all supported Amazon marketplaces.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = AmazonApi()
try {
    val result : kotlin.Any = apiInstance.amazonListMarketplaces()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AmazonApi#amazonListMarketplaces")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AmazonApi#amazonListMarketplaces")
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

<a id="amazonNewReleasesByCategory"></a>
# **amazonNewReleasesByCategory**
> kotlin.Any amazonNewReleasesByCategory(domain, category, page)

New releases by category

Newly released products for a category (browse node).

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = AmazonApi()
val domain : kotlin.String = domain_example // kotlin.String | 
val category : kotlin.String = category_example // kotlin.String | 
val page : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.Any = apiInstance.amazonNewReleasesByCategory(domain, category, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AmazonApi#amazonNewReleasesByCategory")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AmazonApi#amazonNewReleasesByCategory")
    e.printStackTrace()
}
```

### Parameters
| **domain** | **kotlin.String**|  | [optional] [default to &quot;com&quot;] |
| **category** | **kotlin.String**|  | [optional] |
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

<a id="amazonSearchAmazonProducts"></a>
# **amazonSearchAmazonProducts**
> kotlin.Any amazonSearchAmazonProducts(query, domain, page, sortBy, category, minPrice, maxPrice, zip, language)

Search Amazon products

Search the Amazon catalog with filters and sorting.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = AmazonApi()
val query : kotlin.String = query_example // kotlin.String | Search keywords
val domain : kotlin.String = domain_example // kotlin.String | Amazon marketplace TLD or code (com, co.uk, de…)
val page : kotlin.Int = 56 // kotlin.Int | 
val sortBy : kotlin.String = sortBy_example // kotlin.String | relevance | price_low_to_high | price_high_to_low | avg_review | newest
val category : kotlin.String = category_example // kotlin.String | Department/category alias (i= param)
val minPrice : java.math.BigDecimal = 8.14 // java.math.BigDecimal | 
val maxPrice : java.math.BigDecimal = 8.14 // java.math.BigDecimal | 
val zip : kotlin.String = zip_example // kotlin.String | Delivery postal/zip code for localized pricing
val language : kotlin.String = language_example // kotlin.String | Locale for results, e.g. en_US, fr_FR
try {
    val result : kotlin.Any = apiInstance.amazonSearchAmazonProducts(query, domain, page, sortBy, category, minPrice, maxPrice, zip, language)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AmazonApi#amazonSearchAmazonProducts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AmazonApi#amazonSearchAmazonProducts")
    e.printStackTrace()
}
```

### Parameters
| **query** | **kotlin.String**| Search keywords | |
| **domain** | **kotlin.String**| Amazon marketplace TLD or code (com, co.uk, de…) | [optional] [default to &quot;com&quot;] |
| **page** | **kotlin.Int**|  | [optional] [default to 1] |
| **sortBy** | **kotlin.String**| relevance | price_low_to_high | price_high_to_low | avg_review | newest | [optional] |
| **category** | **kotlin.String**| Department/category alias (i&#x3D; param) | [optional] |
| **minPrice** | **java.math.BigDecimal**|  | [optional] |
| **maxPrice** | **java.math.BigDecimal**|  | [optional] |
| **zip** | **kotlin.String**| Delivery postal/zip code for localized pricing | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **language** | **kotlin.String**| Locale for results, e.g. en_US, fr_FR | [optional] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="amazonTodaySDeals"></a>
# **amazonTodaySDeals**
> kotlin.Any amazonTodaySDeals(domain, category, page)

Today&#39;s deals

Current Amazon deals (lightning deals, best deals).

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = AmazonApi()
val domain : kotlin.String = domain_example // kotlin.String | 
val category : kotlin.String = category_example // kotlin.String | 
val page : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.Any = apiInstance.amazonTodaySDeals(domain, category, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AmazonApi#amazonTodaySDeals")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AmazonApi#amazonTodaySDeals")
    e.printStackTrace()
}
```

### Parameters
| **domain** | **kotlin.String**|  | [optional] [default to &quot;com&quot;] |
| **category** | **kotlin.String**|  | [optional] |
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

