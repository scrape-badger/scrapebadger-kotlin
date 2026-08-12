# AppStoreApi

All URIs are relative to *https://scrapebadger.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**appStoreGetAppDetail**](AppStoreApi.md#appStoreGetAppDetail) | **GET** /v1/app-store/apps/{app_id} | Get app detail |
| [**appStoreGetAppReviews**](AppStoreApi.md#appStoreGetAppReviews) | **GET** /v1/app-store/apps/{app_id}/reviews | Get app reviews |
| [**appStoreGetDeveloperApps**](AppStoreApi.md#appStoreGetDeveloperApps) | **GET** /v1/app-store/developers/{artist_id} | Get developer apps |
| [**appStoreListGenres**](AppStoreApi.md#appStoreListGenres) | **GET** /v1/app-store/genres | List genres |
| [**appStoreListMarkets**](AppStoreApi.md#appStoreListMarkets) | **GET** /v1/app-store/markets | List markets |
| [**appStoreSearchApps**](AppStoreApi.md#appStoreSearchApps) | **GET** /v1/app-store/search | Search apps |
| [**appStoreTopCharts**](AppStoreApi.md#appStoreTopCharts) | **GET** /v1/app-store/charts | Top charts |


<a id="appStoreGetAppDetail"></a>
# **appStoreGetAppDetail**
> kotlin.Any appStoreGetAppDetail(appId, country, lang, includeExtras)

Get app detail

App detail: bundle id, version, pricing, ratings, genres, min OS, size, languages, screenshots, in-app purchases and version history.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = AppStoreApi()
val appId : kotlin.String = appId_example // kotlin.String | Numeric trackId (e.g. '310633997') or bundle id (e.g. 'net.whatsapp.WhatsApp').
val country : kotlin.String = country_example // kotlin.String | 
val lang : kotlin.String = lang_example // kotlin.String | Result language, e.g. 'en_us'
val includeExtras : kotlin.Boolean = true // kotlin.Boolean | Fetch the storefront page for rating histogram, IAP list, full-res screenshots and App Privacy. Set false to skip the 2nd fetch.
try {
    val result : kotlin.Any = apiInstance.appStoreGetAppDetail(appId, country, lang, includeExtras)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AppStoreApi#appStoreGetAppDetail")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AppStoreApi#appStoreGetAppDetail")
    e.printStackTrace()
}
```

### Parameters
| **appId** | **kotlin.String**| Numeric trackId (e.g. &#39;310633997&#39;) or bundle id (e.g. &#39;net.whatsapp.WhatsApp&#39;). | |
| **country** | **kotlin.String**|  | [optional] [default to &quot;us&quot;] |
| **lang** | **kotlin.String**| Result language, e.g. &#39;en_us&#39; | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **includeExtras** | **kotlin.Boolean**| Fetch the storefront page for rating histogram, IAP list, full-res screenshots and App Privacy. Set false to skip the 2nd fetch. | [optional] [default to true] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="appStoreGetAppReviews"></a>
# **appStoreGetAppReviews**
> kotlin.Any appStoreGetAppReviews(appId, country, page, sort)

Get app reviews

Paginated customer reviews (50 per page, up to 10 pages).

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = AppStoreApi()
val appId : kotlin.String = appId_example // kotlin.String | Numeric trackId, e.g. '310633997'
val country : kotlin.String = country_example // kotlin.String | 
val page : kotlin.Int = 56 // kotlin.Int | Apple caps reviews at 10 pages
val sort : kotlin.String = sort_example // kotlin.String | mostRecent | mostHelpful
try {
    val result : kotlin.Any = apiInstance.appStoreGetAppReviews(appId, country, page, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AppStoreApi#appStoreGetAppReviews")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AppStoreApi#appStoreGetAppReviews")
    e.printStackTrace()
}
```

### Parameters
| **appId** | **kotlin.String**| Numeric trackId, e.g. &#39;310633997&#39; | |
| **country** | **kotlin.String**|  | [optional] [default to &quot;us&quot;] |
| **page** | **kotlin.Int**| Apple caps reviews at 10 pages | [optional] [default to 1] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sort** | **kotlin.String**| mostRecent | mostHelpful | [optional] [default to &quot;mostRecent&quot;] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="appStoreGetDeveloperApps"></a>
# **appStoreGetDeveloperApps**
> kotlin.Any appStoreGetDeveloperApps(artistId, country)

Get developer apps

Developer info and their published apps.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = AppStoreApi()
val artistId : kotlin.String = artistId_example // kotlin.String | Numeric artistId (developer id)
val country : kotlin.String = country_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.appStoreGetDeveloperApps(artistId, country)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AppStoreApi#appStoreGetDeveloperApps")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AppStoreApi#appStoreGetDeveloperApps")
    e.printStackTrace()
}
```

### Parameters
| **artistId** | **kotlin.String**| Numeric artistId (developer id) | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **country** | **kotlin.String**|  | [optional] [default to &quot;us&quot;] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="appStoreListGenres"></a>
# **appStoreListGenres**
> kotlin.Any appStoreListGenres()

List genres

The Apple App Store genre/category ids.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = AppStoreApi()
try {
    val result : kotlin.Any = apiInstance.appStoreListGenres()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AppStoreApi#appStoreListGenres")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AppStoreApi#appStoreListGenres")
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

<a id="appStoreListMarkets"></a>
# **appStoreListMarkets**
> kotlin.Any appStoreListMarkets()

List markets

Supported App Store country codes.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = AppStoreApi()
try {
    val result : kotlin.Any = apiInstance.appStoreListMarkets()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AppStoreApi#appStoreListMarkets")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AppStoreApi#appStoreListMarkets")
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

<a id="appStoreSearchApps"></a>
# **appStoreSearchApps**
> kotlin.Any appStoreSearchApps(query, country, entity, limit, offset, lang)

Search apps

Search the Apple App Store.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = AppStoreApi()
val query : kotlin.String = query_example // kotlin.String | Search term, e.g. 'chat'
val country : kotlin.String = country_example // kotlin.String | App Store country code
val entity : kotlin.String = entity_example // kotlin.String | software | iPadSoftware | macSoftware
val limit : kotlin.Int = 56 // kotlin.Int | 
val offset : kotlin.Int = 56 // kotlin.Int | 
val lang : kotlin.String = lang_example // kotlin.String | Language, e.g. 'en_us'
try {
    val result : kotlin.Any = apiInstance.appStoreSearchApps(query, country, entity, limit, offset, lang)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AppStoreApi#appStoreSearchApps")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AppStoreApi#appStoreSearchApps")
    e.printStackTrace()
}
```

### Parameters
| **query** | **kotlin.String**| Search term, e.g. &#39;chat&#39; | |
| **country** | **kotlin.String**| App Store country code | [optional] [default to &quot;us&quot;] |
| **entity** | **kotlin.String**| software | iPadSoftware | macSoftware | [optional] [default to &quot;software&quot;] |
| **limit** | **kotlin.Int**|  | [optional] [default to 25] |
| **offset** | **kotlin.Int**|  | [optional] [default to 0] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **lang** | **kotlin.String**| Language, e.g. &#39;en_us&#39; | [optional] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="appStoreTopCharts"></a>
# **appStoreTopCharts**
> kotlin.Any appStoreTopCharts(country, type, genre, limit, entity)

Top charts

Top charts, optionally scoped to a genre.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = AppStoreApi()
val country : kotlin.String = country_example // kotlin.String | 
val type : kotlin.String = type_example // kotlin.String | top-free | top-paid | top-grossing
val genre : kotlin.Int = 56 // kotlin.Int | Apple genre id (optional), e.g. 6014
val limit : kotlin.Int = 56 // kotlin.Int | 
val entity : kotlin.String = entity_example // kotlin.String | apps (iPhone) | ipad
try {
    val result : kotlin.Any = apiInstance.appStoreTopCharts(country, type, genre, limit, entity)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AppStoreApi#appStoreTopCharts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AppStoreApi#appStoreTopCharts")
    e.printStackTrace()
}
```

### Parameters
| **country** | **kotlin.String**|  | [optional] [default to &quot;us&quot;] |
| **type** | **kotlin.String**| top-free | top-paid | top-grossing | [optional] [default to &quot;top-free&quot;] |
| **genre** | **kotlin.Int**| Apple genre id (optional), e.g. 6014 | [optional] |
| **limit** | **kotlin.Int**|  | [optional] [default to 50] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **entity** | **kotlin.String**| apps (iPhone) | ipad | [optional] [default to &quot;apps&quot;] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

