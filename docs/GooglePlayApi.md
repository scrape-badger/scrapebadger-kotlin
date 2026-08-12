# GooglePlayApi

All URIs are relative to *https://scrapebadger.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**googlePlayBrowseACategory**](GooglePlayApi.md#googlePlayBrowseACategory) | **GET** /v1/google-play/categories/{category_id} | Browse a category |
| [**googlePlayGetAppDetail**](GooglePlayApi.md#googlePlayGetAppDetail) | **GET** /v1/google-play/apps/{app_id} | Get app detail |
| [**googlePlayGetAppPermissions**](GooglePlayApi.md#googlePlayGetAppPermissions) | **GET** /v1/google-play/apps/{app_id}/permissions | Get app permissions |
| [**googlePlayGetAppReviews**](GooglePlayApi.md#googlePlayGetAppReviews) | **GET** /v1/google-play/apps/{app_id}/reviews | Get app reviews |
| [**googlePlayGetDeveloperApps**](GooglePlayApi.md#googlePlayGetDeveloperApps) | **GET** /v1/google-play/developers/{developer} | Get developer apps |
| [**googlePlayGetSimilarApps**](GooglePlayApi.md#googlePlayGetSimilarApps) | **GET** /v1/google-play/apps/{app_id}/similar | Get similar apps |
| [**googlePlayListCategories**](GooglePlayApi.md#googlePlayListCategories) | **GET** /v1/google-play/categories | List categories |
| [**googlePlayListMarkets**](GooglePlayApi.md#googlePlayListMarkets) | **GET** /v1/google-play/markets | List markets |
| [**googlePlaySearchApps**](GooglePlayApi.md#googlePlaySearchApps) | **GET** /v1/google-play/search | Search apps |
| [**googlePlayTopCharts**](GooglePlayApi.md#googlePlayTopCharts) | **GET** /v1/google-play/collections/{collection} | Top charts |


<a id="googlePlayBrowseACategory"></a>
# **googlePlayBrowseACategory**
> kotlin.Any googlePlayBrowseACategory(categoryId, country, lang)

Browse a category

The top apps within a Play category.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = GooglePlayApi()
val categoryId : kotlin.String = categoryId_example // kotlin.String | Play category id, e.g. 'GAME_PUZZLE' or 'SOCIAL'
val country : kotlin.String = country_example // kotlin.String | Play storefront country (gl), ISO 3166-1 alpha-2, e.g. 'US'
val lang : kotlin.String = lang_example // kotlin.String | Play content language (hl), e.g. 'en' or 'pt-BR'
try {
    val result : kotlin.Any = apiInstance.googlePlayBrowseACategory(categoryId, country, lang)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GooglePlayApi#googlePlayBrowseACategory")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GooglePlayApi#googlePlayBrowseACategory")
    e.printStackTrace()
}
```

### Parameters
| **categoryId** | **kotlin.String**| Play category id, e.g. &#39;GAME_PUZZLE&#39; or &#39;SOCIAL&#39; | |
| **country** | **kotlin.String**| Play storefront country (gl), ISO 3166-1 alpha-2, e.g. &#39;US&#39; | [optional] [default to &quot;US&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **lang** | **kotlin.String**| Play content language (hl), e.g. &#39;en&#39; or &#39;pt-BR&#39; | [optional] [default to &quot;en&quot;] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="googlePlayGetAppDetail"></a>
# **googlePlayGetAppDetail**
> kotlin.Any googlePlayGetAppDetail(appId, country, lang)

Get app detail

Full app detail: ratings histogram, installs, pricing, IAP, developer, screenshots, version metadata and what&#39;s-new.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = GooglePlayApi()
val appId : kotlin.String = appId_example // kotlin.String | Android package id, e.g. 'com.whatsapp'.
val country : kotlin.String = country_example // kotlin.String | Play storefront country (gl), ISO 3166-1 alpha-2, e.g. 'US'
val lang : kotlin.String = lang_example // kotlin.String | Play content language (hl), e.g. 'en' or 'pt-BR'
try {
    val result : kotlin.Any = apiInstance.googlePlayGetAppDetail(appId, country, lang)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GooglePlayApi#googlePlayGetAppDetail")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GooglePlayApi#googlePlayGetAppDetail")
    e.printStackTrace()
}
```

### Parameters
| **appId** | **kotlin.String**| Android package id, e.g. &#39;com.whatsapp&#39;. | |
| **country** | **kotlin.String**| Play storefront country (gl), ISO 3166-1 alpha-2, e.g. &#39;US&#39; | [optional] [default to &quot;US&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **lang** | **kotlin.String**| Play content language (hl), e.g. &#39;en&#39; or &#39;pt-BR&#39; | [optional] [default to &quot;en&quot;] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="googlePlayGetAppPermissions"></a>
# **googlePlayGetAppPermissions**
> kotlin.Any googlePlayGetAppPermissions(appId, lang)

Get app permissions

The app&#39;s requested Android permissions, grouped.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = GooglePlayApi()
val appId : kotlin.String = appId_example // kotlin.String | Android package id, e.g. 'com.whatsapp'.
val lang : kotlin.String = lang_example // kotlin.String | Play content language (hl), e.g. 'en' or 'pt-BR'
try {
    val result : kotlin.Any = apiInstance.googlePlayGetAppPermissions(appId, lang)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GooglePlayApi#googlePlayGetAppPermissions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GooglePlayApi#googlePlayGetAppPermissions")
    e.printStackTrace()
}
```

### Parameters
| **appId** | **kotlin.String**| Android package id, e.g. &#39;com.whatsapp&#39;. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **lang** | **kotlin.String**| Play content language (hl), e.g. &#39;en&#39; or &#39;pt-BR&#39; | [optional] [default to &quot;en&quot;] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="googlePlayGetAppReviews"></a>
# **googlePlayGetAppReviews**
> kotlin.Any googlePlayGetAppReviews(appId, country, lang, sort, count, pageToken)

Get app reviews

Paginated app reviews via the Play batchexecute RPC.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = GooglePlayApi()
val appId : kotlin.String = appId_example // kotlin.String | Android package id, e.g. 'com.whatsapp'.
val country : kotlin.String = country_example // kotlin.String | Play storefront country (gl), ISO 3166-1 alpha-2, e.g. 'US'
val lang : kotlin.String = lang_example // kotlin.String | Play content language (hl), e.g. 'en' or 'pt-BR'
val sort : kotlin.String = sort_example // kotlin.String | newest | rating | helpfulness
val count : kotlin.Int = 56 // kotlin.Int | 
val pageToken : kotlin.String = pageToken_example // kotlin.String | Pagination token
try {
    val result : kotlin.Any = apiInstance.googlePlayGetAppReviews(appId, country, lang, sort, count, pageToken)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GooglePlayApi#googlePlayGetAppReviews")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GooglePlayApi#googlePlayGetAppReviews")
    e.printStackTrace()
}
```

### Parameters
| **appId** | **kotlin.String**| Android package id, e.g. &#39;com.whatsapp&#39;. | |
| **country** | **kotlin.String**| Play storefront country (gl), ISO 3166-1 alpha-2, e.g. &#39;US&#39; | [optional] [default to &quot;US&quot;] |
| **lang** | **kotlin.String**| Play content language (hl), e.g. &#39;en&#39; or &#39;pt-BR&#39; | [optional] [default to &quot;en&quot;] |
| **sort** | **kotlin.String**| newest | rating | helpfulness | [optional] [default to &quot;newest&quot;] |
| **count** | **kotlin.Int**|  | [optional] [default to 40] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageToken** | **kotlin.String**| Pagination token | [optional] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="googlePlayGetDeveloperApps"></a>
# **googlePlayGetDeveloperApps**
> kotlin.Any googlePlayGetDeveloperApps(developer, country, lang)

Get developer apps

A developer&#39;s published apps.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = GooglePlayApi()
val developer : kotlin.String = developer_example // kotlin.String | Developer name or numeric id
val country : kotlin.String = country_example // kotlin.String | Play storefront country (gl), ISO 3166-1 alpha-2, e.g. 'US'
val lang : kotlin.String = lang_example // kotlin.String | Play content language (hl), e.g. 'en' or 'pt-BR'
try {
    val result : kotlin.Any = apiInstance.googlePlayGetDeveloperApps(developer, country, lang)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GooglePlayApi#googlePlayGetDeveloperApps")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GooglePlayApi#googlePlayGetDeveloperApps")
    e.printStackTrace()
}
```

### Parameters
| **developer** | **kotlin.String**| Developer name or numeric id | |
| **country** | **kotlin.String**| Play storefront country (gl), ISO 3166-1 alpha-2, e.g. &#39;US&#39; | [optional] [default to &quot;US&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **lang** | **kotlin.String**| Play content language (hl), e.g. &#39;en&#39; or &#39;pt-BR&#39; | [optional] [default to &quot;en&quot;] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="googlePlayGetSimilarApps"></a>
# **googlePlayGetSimilarApps**
> kotlin.Any googlePlayGetSimilarApps(appId, country, lang)

Get similar apps

Apps Google Play lists as similar to this one.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = GooglePlayApi()
val appId : kotlin.String = appId_example // kotlin.String | Android package id, e.g. 'com.whatsapp'.
val country : kotlin.String = country_example // kotlin.String | Play storefront country (gl), ISO 3166-1 alpha-2, e.g. 'US'
val lang : kotlin.String = lang_example // kotlin.String | Play content language (hl), e.g. 'en' or 'pt-BR'
try {
    val result : kotlin.Any = apiInstance.googlePlayGetSimilarApps(appId, country, lang)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GooglePlayApi#googlePlayGetSimilarApps")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GooglePlayApi#googlePlayGetSimilarApps")
    e.printStackTrace()
}
```

### Parameters
| **appId** | **kotlin.String**| Android package id, e.g. &#39;com.whatsapp&#39;. | |
| **country** | **kotlin.String**| Play storefront country (gl), ISO 3166-1 alpha-2, e.g. &#39;US&#39; | [optional] [default to &quot;US&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **lang** | **kotlin.String**| Play content language (hl), e.g. &#39;en&#39; or &#39;pt-BR&#39; | [optional] [default to &quot;en&quot;] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="googlePlayListCategories"></a>
# **googlePlayListCategories**
> kotlin.Any googlePlayListCategories()

List categories

The Google Play app/game category ids.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = GooglePlayApi()
try {
    val result : kotlin.Any = apiInstance.googlePlayListCategories()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GooglePlayApi#googlePlayListCategories")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GooglePlayApi#googlePlayListCategories")
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

<a id="googlePlayListMarkets"></a>
# **googlePlayListMarkets**
> kotlin.Any googlePlayListMarkets()

List markets

Supported Google Play store countries and languages.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = GooglePlayApi()
try {
    val result : kotlin.Any = apiInstance.googlePlayListMarkets()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GooglePlayApi#googlePlayListMarkets")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GooglePlayApi#googlePlayListMarkets")
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

<a id="googlePlaySearchApps"></a>
# **googlePlaySearchApps**
> kotlin.Any googlePlaySearchApps(query, country, lang, price)

Search apps

Search Google Play for apps and games (the ~30 server-rendered results; Play exposes no page parameter).

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = GooglePlayApi()
val query : kotlin.String = query_example // kotlin.String | Search keywords, e.g. 'puzzle'
val country : kotlin.String = country_example // kotlin.String | Play storefront country (gl), ISO 3166-1 alpha-2, e.g. 'US'
val lang : kotlin.String = lang_example // kotlin.String | Play content language (hl), e.g. 'en' or 'pt-BR'
val price : kotlin.String = price_example // kotlin.String | free | paid | all
try {
    val result : kotlin.Any = apiInstance.googlePlaySearchApps(query, country, lang, price)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GooglePlayApi#googlePlaySearchApps")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GooglePlayApi#googlePlaySearchApps")
    e.printStackTrace()
}
```

### Parameters
| **query** | **kotlin.String**| Search keywords, e.g. &#39;puzzle&#39; | |
| **country** | **kotlin.String**| Play storefront country (gl), ISO 3166-1 alpha-2, e.g. &#39;US&#39; | [optional] [default to &quot;US&quot;] |
| **lang** | **kotlin.String**| Play content language (hl), e.g. &#39;en&#39; or &#39;pt-BR&#39; | [optional] [default to &quot;en&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **price** | **kotlin.String**| free | paid | all | [optional] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="googlePlayTopCharts"></a>
# **googlePlayTopCharts**
> kotlin.Any googlePlayTopCharts(collection, category, country, lang)

Top charts

Top charts for a collection, optionally scoped to a category.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = GooglePlayApi()
val collection : kotlin.String = collection_example // kotlin.String | topselling_free | topselling_paid | topgrossing
val category : kotlin.String = category_example // kotlin.String | Play category, e.g. 'GAME'
val country : kotlin.String = country_example // kotlin.String | Play storefront country (gl), ISO 3166-1 alpha-2, e.g. 'US'
val lang : kotlin.String = lang_example // kotlin.String | Play content language (hl), e.g. 'en' or 'pt-BR'
try {
    val result : kotlin.Any = apiInstance.googlePlayTopCharts(collection, category, country, lang)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GooglePlayApi#googlePlayTopCharts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GooglePlayApi#googlePlayTopCharts")
    e.printStackTrace()
}
```

### Parameters
| **collection** | **kotlin.String**| topselling_free | topselling_paid | topgrossing | |
| **category** | **kotlin.String**| Play category, e.g. &#39;GAME&#39; | [optional] [default to &quot;APPLICATION&quot;] |
| **country** | **kotlin.String**| Play storefront country (gl), ISO 3166-1 alpha-2, e.g. &#39;US&#39; | [optional] [default to &quot;US&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **lang** | **kotlin.String**| Play content language (hl), e.g. &#39;en&#39; or &#39;pt-BR&#39; | [optional] [default to &quot;en&quot;] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

