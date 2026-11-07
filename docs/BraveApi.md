# BraveApi

All URIs are relative to *https://scrapebadger.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**braveAutocomplete**](BraveApi.md#braveAutocomplete) | **GET** /v1/brave/autocomplete | Autocomplete |
| [**braveImageSearch**](BraveApi.md#braveImageSearch) | **GET** /v1/brave/images | Image search |
| [**braveListSupportedLocales**](BraveApi.md#braveListSupportedLocales) | **GET** /v1/brave/locales | List supported locales |
| [**braveNewsSearch**](BraveApi.md#braveNewsSearch) | **GET** /v1/brave/news | News search |
| [**braveVideoSearch**](BraveApi.md#braveVideoSearch) | **GET** /v1/brave/videos | Video search |
| [**braveWebSearch**](BraveApi.md#braveWebSearch) | **GET** /v1/brave/search | Web search |


<a id="braveAutocomplete"></a>
# **braveAutocomplete**
> BraveAutocompleteResponse braveAutocomplete(query, country)

Autocomplete

Native search-box suggestions with entity descriptions and images. Two credits.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = BraveApi()
val query : kotlin.String = query_example // kotlin.String | 
val country : kotlin.String = country_example // kotlin.String | 
try {
    val result : BraveAutocompleteResponse = apiInstance.braveAutocomplete(query, country)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BraveApi#braveAutocomplete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BraveApi#braveAutocomplete")
    e.printStackTrace()
}
```

### Parameters
| **query** | **kotlin.String**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **country** | **kotlin.String**|  | [optional] [default to us] [enum: us, all, ar, au, at, be, br, ca, cl, cn, dk, fi, fr, de, gr, hk, in, id, it, jp, kr, my, mx, nl, nz, no, ph, pl, pt, ru, sa, sg, za, es, se, ch, tw, tr, gb] |

### Return type

[**BraveAutocompleteResponse**](BraveAutocompleteResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="braveImageSearch"></a>
# **braveImageSearch**
> BraveResponse braveImageSearch(query, country, uiLanguage, safeSearch, count)

Image search

Native image batch with original URLs, source pages, thumbnails and dimensions.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = BraveApi()
val query : kotlin.String = query_example // kotlin.String | Native Brave search query
val country : kotlin.String = country_example // kotlin.String | Native result region; see /locales
val uiLanguage : kotlin.String = uiLanguage_example // kotlin.String | UI labels/date language; does not restrict result language
val safeSearch : kotlin.String = safeSearch_example // kotlin.String | 
val count : kotlin.Int = 56 // kotlin.Int | Slice the initial native image batch
try {
    val result : BraveResponse = apiInstance.braveImageSearch(query, country, uiLanguage, safeSearch, count)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BraveApi#braveImageSearch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BraveApi#braveImageSearch")
    e.printStackTrace()
}
```

### Parameters
| **query** | **kotlin.String**| Native Brave search query | |
| **country** | **kotlin.String**| Native result region; see /locales | [optional] [default to us] [enum: us, all, ar, au, at, be, br, ca, cl, cn, dk, fi, fr, de, gr, hk, in, id, it, jp, kr, my, mx, nl, nz, no, ph, pl, pt, ru, sa, sg, za, es, se, ch, tw, tr, gb] |
| **uiLanguage** | **kotlin.String**| UI labels/date language; does not restrict result language | [optional] [default to en-us] [enum: en-us, az, id, ms, br, ca, cs, cy, da, de-de, et, en-ca, en-in, en-gb, es, eu, fr-ca, fr-fr, gl, hr, it, sw-ke, lv, lt, hu, nl, nb, pl, pt-br, ro, sq-al, sk, sl, sr-latn, fi-fi, sv, vi, tr, el, bg, ru, sr, uk, ka, th, ko, zh, zh-tw, ja-jp] |
| **safeSearch** | **kotlin.String**|  | [optional] [default to moderate] [enum: off, moderate, strict] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **count** | **kotlin.Int**| Slice the initial native image batch | [optional] [default to 50] |

### Return type

[**BraveResponse**](BraveResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="braveListSupportedLocales"></a>
# **braveListSupportedLocales**
> BraveLocalesResponse braveListSupportedLocales()

List supported locales

Native country and UI-language choices. Free; result language is a separate preference.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = BraveApi()
try {
    val result : BraveLocalesResponse = apiInstance.braveListSupportedLocales()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BraveApi#braveListSupportedLocales")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BraveApi#braveListSupportedLocales")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**BraveLocalesResponse**](BraveLocalesResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="braveNewsSearch"></a>
# **braveNewsSearch**
> BraveResponse braveNewsSearch(query, country, uiLanguage, safeSearch, count)

News search

Native news batch; relative source dates stay display strings.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = BraveApi()
val query : kotlin.String = query_example // kotlin.String | Native Brave search query
val country : kotlin.String = country_example // kotlin.String | Native result region; see /locales
val uiLanguage : kotlin.String = uiLanguage_example // kotlin.String | UI labels/date language; does not restrict result language
val safeSearch : kotlin.String = safeSearch_example // kotlin.String | 
val count : kotlin.Int = 56 // kotlin.Int | Slice the initial native news batch
try {
    val result : BraveResponse = apiInstance.braveNewsSearch(query, country, uiLanguage, safeSearch, count)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BraveApi#braveNewsSearch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BraveApi#braveNewsSearch")
    e.printStackTrace()
}
```

### Parameters
| **query** | **kotlin.String**| Native Brave search query | |
| **country** | **kotlin.String**| Native result region; see /locales | [optional] [default to us] [enum: us, all, ar, au, at, be, br, ca, cl, cn, dk, fi, fr, de, gr, hk, in, id, it, jp, kr, my, mx, nl, nz, no, ph, pl, pt, ru, sa, sg, za, es, se, ch, tw, tr, gb] |
| **uiLanguage** | **kotlin.String**| UI labels/date language; does not restrict result language | [optional] [default to en-us] [enum: en-us, az, id, ms, br, ca, cs, cy, da, de-de, et, en-ca, en-in, en-gb, es, eu, fr-ca, fr-fr, gl, hr, it, sw-ke, lv, lt, hu, nl, nb, pl, pt-br, ro, sq-al, sk, sl, sr-latn, fi-fi, sv, vi, tr, el, bg, ru, sr, uk, ka, th, ko, zh, zh-tw, ja-jp] |
| **safeSearch** | **kotlin.String**|  | [optional] [default to moderate] [enum: off, moderate, strict] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **count** | **kotlin.Int**| Slice the initial native news batch | [optional] [default to 35] |

### Return type

[**BraveResponse**](BraveResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="braveVideoSearch"></a>
# **braveVideoSearch**
> BravePagedResponse braveVideoSearch(query, country, uiLanguage, safeSearch, page, count)

Video search

Native video results with duration, creator, publisher and verified page ordinals.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = BraveApi()
val query : kotlin.String = query_example // kotlin.String | Native Brave search query
val country : kotlin.String = country_example // kotlin.String | Native result region; see /locales
val uiLanguage : kotlin.String = uiLanguage_example // kotlin.String | UI labels/date language; does not restrict result language
val safeSearch : kotlin.String = safeSearch_example // kotlin.String | 
val page : kotlin.Int = 56 // kotlin.Int | 1-based native page ordinal
val count : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : BravePagedResponse = apiInstance.braveVideoSearch(query, country, uiLanguage, safeSearch, page, count)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BraveApi#braveVideoSearch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BraveApi#braveVideoSearch")
    e.printStackTrace()
}
```

### Parameters
| **query** | **kotlin.String**| Native Brave search query | |
| **country** | **kotlin.String**| Native result region; see /locales | [optional] [default to us] [enum: us, all, ar, au, at, be, br, ca, cl, cn, dk, fi, fr, de, gr, hk, in, id, it, jp, kr, my, mx, nl, nz, no, ph, pl, pt, ru, sa, sg, za, es, se, ch, tw, tr, gb] |
| **uiLanguage** | **kotlin.String**| UI labels/date language; does not restrict result language | [optional] [default to en-us] [enum: en-us, az, id, ms, br, ca, cs, cy, da, de-de, et, en-ca, en-in, en-gb, es, eu, fr-ca, fr-fr, gl, hr, it, sw-ke, lv, lt, hu, nl, nb, pl, pt-br, ro, sq-al, sk, sl, sr-latn, fi-fi, sv, vi, tr, el, bg, ru, sr, uk, ka, th, ko, zh, zh-tw, ja-jp] |
| **safeSearch** | **kotlin.String**|  | [optional] [default to moderate] [enum: off, moderate, strict] |
| **page** | **kotlin.Int**| 1-based native page ordinal | [optional] [default to 1] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **count** | **kotlin.Int**|  | [optional] [default to 50] |

### Return type

[**BravePagedResponse**](BravePagedResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="braveWebSearch"></a>
# **braveWebSearch**
> BraveSearchResponse braveWebSearch(query, country, uiLanguage, safeSearch, page, count, freshness, spellcheck)

Web search

Native Brave organic results, rich source blocks and page metadata. Seven credits.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = BraveApi()
val query : kotlin.String = query_example // kotlin.String | Native Brave search query
val country : kotlin.String = country_example // kotlin.String | Native result region; see /locales
val uiLanguage : kotlin.String = uiLanguage_example // kotlin.String | UI labels/date language; does not restrict result language
val safeSearch : kotlin.String = safeSearch_example // kotlin.String | 
val page : kotlin.Int = 56 // kotlin.Int | 1-based native page ordinal
val count : kotlin.Int = 56 // kotlin.Int | Slice one native page; does not change native page boundaries
val freshness : kotlin.String = freshness_example // kotlin.String | 
val spellcheck : kotlin.Boolean = true // kotlin.Boolean | Allow native spelling correction
try {
    val result : BraveSearchResponse = apiInstance.braveWebSearch(query, country, uiLanguage, safeSearch, page, count, freshness, spellcheck)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BraveApi#braveWebSearch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BraveApi#braveWebSearch")
    e.printStackTrace()
}
```

### Parameters
| **query** | **kotlin.String**| Native Brave search query | |
| **country** | **kotlin.String**| Native result region; see /locales | [optional] [default to us] [enum: us, all, ar, au, at, be, br, ca, cl, cn, dk, fi, fr, de, gr, hk, in, id, it, jp, kr, my, mx, nl, nz, no, ph, pl, pt, ru, sa, sg, za, es, se, ch, tw, tr, gb] |
| **uiLanguage** | **kotlin.String**| UI labels/date language; does not restrict result language | [optional] [default to en-us] [enum: en-us, az, id, ms, br, ca, cs, cy, da, de-de, et, en-ca, en-in, en-gb, es, eu, fr-ca, fr-fr, gl, hr, it, sw-ke, lv, lt, hu, nl, nb, pl, pt-br, ro, sq-al, sk, sl, sr-latn, fi-fi, sv, vi, tr, el, bg, ru, sr, uk, ka, th, ko, zh, zh-tw, ja-jp] |
| **safeSearch** | **kotlin.String**|  | [optional] [default to moderate] [enum: off, moderate, strict] |
| **page** | **kotlin.Int**| 1-based native page ordinal | [optional] [default to 1] |
| **count** | **kotlin.Int**| Slice one native page; does not change native page boundaries | [optional] [default to 20] |
| **freshness** | **kotlin.String**|  | [optional] [default to any] [enum: any, day, week, month, year] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **spellcheck** | **kotlin.Boolean**| Allow native spelling correction | [optional] [default to false] |

### Return type

[**BraveSearchResponse**](BraveSearchResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

