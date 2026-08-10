# FacebookApi

All URIs are relative to *https://scrapebadger.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**facebookBrowseAMarketplaceCategory**](FacebookApi.md#facebookBrowseAMarketplaceCategory) | **GET** /v1/facebook/marketplace/category/{category} | Browse a Marketplace category |
| [**facebookGetAMarketplaceItem**](FacebookApi.md#facebookGetAMarketplaceItem) | **GET** /v1/facebook/marketplace/item/{item_id} | Get a Marketplace item |
| [**facebookGetAnAd**](FacebookApi.md#facebookGetAnAd) | **GET** /v1/facebook/ads/{ad_archive_id} | Get an ad |
| [**facebookGetGroupDetail**](FacebookApi.md#facebookGetGroupDetail) | **GET** /v1/facebook/groups/{group_id} | Get group detail |
| [**facebookGetGroupPosts**](FacebookApi.md#facebookGetGroupPosts) | **GET** /v1/facebook/groups/{group_id}/posts | Get group posts |
| [**facebookGetPageDetail**](FacebookApi.md#facebookGetPageDetail) | **GET** /v1/facebook/pages/{identifier} | Get page detail |
| [**facebookGetPagePosts**](FacebookApi.md#facebookGetPagePosts) | **GET** /v1/facebook/pages/{identifier}/posts | Get page posts |
| [**facebookGetPostComments**](FacebookApi.md#facebookGetPostComments) | **GET** /v1/facebook/posts/{post_id}/comments | Get post comments |
| [**facebookGetPostDetail**](FacebookApi.md#facebookGetPostDetail) | **GET** /v1/facebook/posts/{post_id} | Get post detail |
| [**facebookGetProfileDetail**](FacebookApi.md#facebookGetProfileDetail) | **GET** /v1/facebook/profiles/{identifier} | Get profile detail |
| [**facebookGetProfilePosts**](FacebookApi.md#facebookGetProfilePosts) | **GET** /v1/facebook/profiles/{identifier}/posts | Get profile posts |
| [**facebookListCategories**](FacebookApi.md#facebookListCategories) | **GET** /v1/facebook/marketplace/categories | List categories |
| [**facebookListLocations**](FacebookApi.md#facebookListLocations) | **GET** /v1/facebook/marketplace/locations | List locations |
| [**facebookSearchEvents**](FacebookApi.md#facebookSearchEvents) | **GET** /v1/facebook/search/events | Search events |
| [**facebookSearchEverything**](FacebookApi.md#facebookSearchEverything) | **GET** /v1/facebook/search | Search everything |
| [**facebookSearchGroups**](FacebookApi.md#facebookSearchGroups) | **GET** /v1/facebook/search/groups | Search groups |
| [**facebookSearchMarketplace**](FacebookApi.md#facebookSearchMarketplace) | **GET** /v1/facebook/marketplace/search | Search Marketplace |
| [**facebookSearchPages**](FacebookApi.md#facebookSearchPages) | **GET** /v1/facebook/search/pages | Search Pages |
| [**facebookSearchPeople**](FacebookApi.md#facebookSearchPeople) | **GET** /v1/facebook/search/people | Search people |
| [**facebookSearchPlaces**](FacebookApi.md#facebookSearchPlaces) | **GET** /v1/facebook/search/places | Search places |
| [**facebookSearchPosts**](FacebookApi.md#facebookSearchPosts) | **GET** /v1/facebook/search/posts | Search posts |
| [**facebookSearchTheAdLibrary**](FacebookApi.md#facebookSearchTheAdLibrary) | **GET** /v1/facebook/ads/search | Search the Ad Library |


<a id="facebookBrowseAMarketplaceCategory"></a>
# **facebookBrowseAMarketplaceCategory**
> kotlin.Any facebookBrowseAMarketplaceCategory(category, location, minPrice, maxPrice, sortBy, after)

Browse a Marketplace category

Browse Marketplace listings in a category (vehicles, electronics, ...).

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = FacebookApi()
val category : kotlin.String = category_example // kotlin.String | 
val location : kotlin.String = location_example // kotlin.String | 
val minPrice : kotlin.Int = 56 // kotlin.Int | 
val maxPrice : kotlin.Int = 56 // kotlin.Int | 
val sortBy : kotlin.String = sortBy_example // kotlin.String | 
val after : kotlin.String = after_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.facebookBrowseAMarketplaceCategory(category, location, minPrice, maxPrice, sortBy, after)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FacebookApi#facebookBrowseAMarketplaceCategory")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FacebookApi#facebookBrowseAMarketplaceCategory")
    e.printStackTrace()
}
```

### Parameters
| **category** | **kotlin.String**|  | |
| **location** | **kotlin.String**|  | [optional] [default to &quot;nyc&quot;] |
| **minPrice** | **kotlin.Int**|  | [optional] |
| **maxPrice** | **kotlin.Int**|  | [optional] |
| **sortBy** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **after** | **kotlin.String**|  | [optional] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="facebookGetAMarketplaceItem"></a>
# **facebookGetAMarketplaceItem**
> kotlin.Any facebookGetAMarketplaceItem(itemId)

Get a Marketplace item

Get full detail for a single Marketplace listing.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = FacebookApi()
val itemId : kotlin.String = itemId_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.facebookGetAMarketplaceItem(itemId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FacebookApi#facebookGetAMarketplaceItem")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FacebookApi#facebookGetAMarketplaceItem")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **itemId** | **kotlin.String**|  | |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="facebookGetAnAd"></a>
# **facebookGetAnAd**
> kotlin.Any facebookGetAnAd(adArchiveId)

Get an ad

Get a single Ad Library ad by its archive id.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = FacebookApi()
val adArchiveId : kotlin.String = adArchiveId_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.facebookGetAnAd(adArchiveId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FacebookApi#facebookGetAnAd")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FacebookApi#facebookGetAnAd")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **adArchiveId** | **kotlin.String**|  | |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="facebookGetGroupDetail"></a>
# **facebookGetGroupDetail**
> kotlin.Any facebookGetGroupDetail(groupId)

Get group detail

Get a Facebook group&#39;s details.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = FacebookApi()
val groupId : kotlin.String = groupId_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.facebookGetGroupDetail(groupId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FacebookApi#facebookGetGroupDetail")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FacebookApi#facebookGetGroupDetail")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **groupId** | **kotlin.String**|  | |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="facebookGetGroupPosts"></a>
# **facebookGetGroupPosts**
> kotlin.Any facebookGetGroupPosts(groupId, after)

Get group posts

Get a Facebook group&#39;s post feed.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = FacebookApi()
val groupId : kotlin.String = groupId_example // kotlin.String | 
val after : kotlin.String = after_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.facebookGetGroupPosts(groupId, after)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FacebookApi#facebookGetGroupPosts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FacebookApi#facebookGetGroupPosts")
    e.printStackTrace()
}
```

### Parameters
| **groupId** | **kotlin.String**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **after** | **kotlin.String**|  | [optional] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="facebookGetPageDetail"></a>
# **facebookGetPageDetail**
> kotlin.Any facebookGetPageDetail(identifier)

Get page detail

Get a Facebook Page&#39;s profile (name, category, followers, about).

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = FacebookApi()
val identifier : kotlin.String = identifier_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.facebookGetPageDetail(identifier)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FacebookApi#facebookGetPageDetail")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FacebookApi#facebookGetPageDetail")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **identifier** | **kotlin.String**|  | |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="facebookGetPagePosts"></a>
# **facebookGetPagePosts**
> kotlin.Any facebookGetPagePosts(identifier, after)

Get page posts

Get a Facebook Page&#39;s timeline posts.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = FacebookApi()
val identifier : kotlin.String = identifier_example // kotlin.String | 
val after : kotlin.String = after_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.facebookGetPagePosts(identifier, after)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FacebookApi#facebookGetPagePosts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FacebookApi#facebookGetPagePosts")
    e.printStackTrace()
}
```

### Parameters
| **identifier** | **kotlin.String**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **after** | **kotlin.String**|  | [optional] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="facebookGetPostComments"></a>
# **facebookGetPostComments**
> kotlin.Any facebookGetPostComments(postId, after, sort)

Get post comments

Get a Facebook post&#39;s comment thread (paginated).

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = FacebookApi()
val postId : kotlin.String = postId_example // kotlin.String | 
val after : kotlin.String = after_example // kotlin.String | 
val sort : kotlin.String = sort_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.facebookGetPostComments(postId, after, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FacebookApi#facebookGetPostComments")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FacebookApi#facebookGetPostComments")
    e.printStackTrace()
}
```

### Parameters
| **postId** | **kotlin.String**|  | |
| **after** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sort** | **kotlin.String**|  | [optional] [default to &quot;relevance&quot;] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="facebookGetPostDetail"></a>
# **facebookGetPostDetail**
> kotlin.Any facebookGetPostDetail(postId)

Get post detail

Get a Facebook post&#39;s detail plus its top comments.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = FacebookApi()
val postId : kotlin.String = postId_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.facebookGetPostDetail(postId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FacebookApi#facebookGetPostDetail")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FacebookApi#facebookGetPostDetail")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **postId** | **kotlin.String**|  | |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="facebookGetProfileDetail"></a>
# **facebookGetProfileDetail**
> kotlin.Any facebookGetProfileDetail(identifier)

Get profile detail

Get a Facebook profile&#39;s details.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = FacebookApi()
val identifier : kotlin.String = identifier_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.facebookGetProfileDetail(identifier)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FacebookApi#facebookGetProfileDetail")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FacebookApi#facebookGetProfileDetail")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **identifier** | **kotlin.String**|  | |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="facebookGetProfilePosts"></a>
# **facebookGetProfilePosts**
> kotlin.Any facebookGetProfilePosts(identifier, after)

Get profile posts

Get a Facebook profile&#39;s timeline posts.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = FacebookApi()
val identifier : kotlin.String = identifier_example // kotlin.String | 
val after : kotlin.String = after_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.facebookGetProfilePosts(identifier, after)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FacebookApi#facebookGetProfilePosts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FacebookApi#facebookGetProfilePosts")
    e.printStackTrace()
}
```

### Parameters
| **identifier** | **kotlin.String**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **after** | **kotlin.String**|  | [optional] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="facebookListCategories"></a>
# **facebookListCategories**
> kotlin.Any facebookListCategories()

List categories

List Marketplace category slugs (free).

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = FacebookApi()
try {
    val result : kotlin.Any = apiInstance.facebookListCategories()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FacebookApi#facebookListCategories")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FacebookApi#facebookListCategories")
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

<a id="facebookListLocations"></a>
# **facebookListLocations**
> kotlin.Any facebookListLocations()

List locations

List common Marketplace location slugs (free).

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = FacebookApi()
try {
    val result : kotlin.Any = apiInstance.facebookListLocations()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FacebookApi#facebookListLocations")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FacebookApi#facebookListLocations")
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

<a id="facebookSearchEvents"></a>
# **facebookSearchEvents**
> kotlin.Any facebookSearchEvents(q, after)

Search events

Search Facebook events.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = FacebookApi()
val q : kotlin.String = q_example // kotlin.String | 
val after : kotlin.String = after_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.facebookSearchEvents(q, after)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FacebookApi#facebookSearchEvents")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FacebookApi#facebookSearchEvents")
    e.printStackTrace()
}
```

### Parameters
| **q** | **kotlin.String**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **after** | **kotlin.String**|  | [optional] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="facebookSearchEverything"></a>
# **facebookSearchEverything**
> kotlin.Any facebookSearchEverything(q, after)

Search everything

Global Facebook search (top results across pages, people, groups, posts).

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = FacebookApi()
val q : kotlin.String = q_example // kotlin.String | Search query
val after : kotlin.String = after_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.facebookSearchEverything(q, after)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FacebookApi#facebookSearchEverything")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FacebookApi#facebookSearchEverything")
    e.printStackTrace()
}
```

### Parameters
| **q** | **kotlin.String**| Search query | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **after** | **kotlin.String**|  | [optional] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="facebookSearchGroups"></a>
# **facebookSearchGroups**
> kotlin.Any facebookSearchGroups(q, after)

Search groups

Search Facebook groups.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = FacebookApi()
val q : kotlin.String = q_example // kotlin.String | 
val after : kotlin.String = after_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.facebookSearchGroups(q, after)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FacebookApi#facebookSearchGroups")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FacebookApi#facebookSearchGroups")
    e.printStackTrace()
}
```

### Parameters
| **q** | **kotlin.String**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **after** | **kotlin.String**|  | [optional] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="facebookSearchMarketplace"></a>
# **facebookSearchMarketplace**
> kotlin.Any facebookSearchMarketplace(query, location, minPrice, maxPrice, daysSinceListed, sortBy, itemCondition, deliveryMethod, after)

Search Marketplace

Search Facebook Marketplace listings by keyword and location.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = FacebookApi()
val query : kotlin.String = query_example // kotlin.String | Search keywords
val location : kotlin.String = location_example // kotlin.String | Marketplace location slug
val minPrice : kotlin.Int = 56 // kotlin.Int | 
val maxPrice : kotlin.Int = 56 // kotlin.Int | 
val daysSinceListed : kotlin.Int = 56 // kotlin.Int | 
val sortBy : kotlin.String = sortBy_example // kotlin.String | 
val itemCondition : kotlin.String = itemCondition_example // kotlin.String | 
val deliveryMethod : kotlin.String = deliveryMethod_example // kotlin.String | 
val after : kotlin.String = after_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.facebookSearchMarketplace(query, location, minPrice, maxPrice, daysSinceListed, sortBy, itemCondition, deliveryMethod, after)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FacebookApi#facebookSearchMarketplace")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FacebookApi#facebookSearchMarketplace")
    e.printStackTrace()
}
```

### Parameters
| **query** | **kotlin.String**| Search keywords | |
| **location** | **kotlin.String**| Marketplace location slug | [optional] [default to &quot;nyc&quot;] |
| **minPrice** | **kotlin.Int**|  | [optional] |
| **maxPrice** | **kotlin.Int**|  | [optional] |
| **daysSinceListed** | **kotlin.Int**|  | [optional] |
| **sortBy** | **kotlin.String**|  | [optional] |
| **itemCondition** | **kotlin.String**|  | [optional] |
| **deliveryMethod** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **after** | **kotlin.String**|  | [optional] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="facebookSearchPages"></a>
# **facebookSearchPages**
> kotlin.Any facebookSearchPages(q, after)

Search Pages

Search Facebook Pages.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = FacebookApi()
val q : kotlin.String = q_example // kotlin.String | 
val after : kotlin.String = after_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.facebookSearchPages(q, after)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FacebookApi#facebookSearchPages")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FacebookApi#facebookSearchPages")
    e.printStackTrace()
}
```

### Parameters
| **q** | **kotlin.String**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **after** | **kotlin.String**|  | [optional] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="facebookSearchPeople"></a>
# **facebookSearchPeople**
> kotlin.Any facebookSearchPeople(q, after)

Search people

Search Facebook profiles.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = FacebookApi()
val q : kotlin.String = q_example // kotlin.String | 
val after : kotlin.String = after_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.facebookSearchPeople(q, after)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FacebookApi#facebookSearchPeople")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FacebookApi#facebookSearchPeople")
    e.printStackTrace()
}
```

### Parameters
| **q** | **kotlin.String**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **after** | **kotlin.String**|  | [optional] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="facebookSearchPlaces"></a>
# **facebookSearchPlaces**
> kotlin.Any facebookSearchPlaces(q, after)

Search places

Search Facebook places.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = FacebookApi()
val q : kotlin.String = q_example // kotlin.String | 
val after : kotlin.String = after_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.facebookSearchPlaces(q, after)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FacebookApi#facebookSearchPlaces")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FacebookApi#facebookSearchPlaces")
    e.printStackTrace()
}
```

### Parameters
| **q** | **kotlin.String**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **after** | **kotlin.String**|  | [optional] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="facebookSearchPosts"></a>
# **facebookSearchPosts**
> kotlin.Any facebookSearchPosts(q, after)

Search posts

Search public Facebook posts.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = FacebookApi()
val q : kotlin.String = q_example // kotlin.String | 
val after : kotlin.String = after_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.facebookSearchPosts(q, after)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FacebookApi#facebookSearchPosts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FacebookApi#facebookSearchPosts")
    e.printStackTrace()
}
```

### Parameters
| **q** | **kotlin.String**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **after** | **kotlin.String**|  | [optional] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="facebookSearchTheAdLibrary"></a>
# **facebookSearchTheAdLibrary**
> kotlin.Any facebookSearchTheAdLibrary(query, country, adType, activeStatus, after)

Search the Ad Library

Search the Facebook Ad Library.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = FacebookApi()
val query : kotlin.String = query_example // kotlin.String | Advertiser or keyword
val country : kotlin.String = country_example // kotlin.String | 
val adType : kotlin.String = adType_example // kotlin.String | 
val activeStatus : kotlin.String = activeStatus_example // kotlin.String | 
val after : kotlin.String = after_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.facebookSearchTheAdLibrary(query, country, adType, activeStatus, after)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FacebookApi#facebookSearchTheAdLibrary")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FacebookApi#facebookSearchTheAdLibrary")
    e.printStackTrace()
}
```

### Parameters
| **query** | **kotlin.String**| Advertiser or keyword | |
| **country** | **kotlin.String**|  | [optional] [default to &quot;US&quot;] |
| **adType** | **kotlin.String**|  | [optional] [default to &quot;all&quot;] |
| **activeStatus** | **kotlin.String**|  | [optional] [default to &quot;active&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **after** | **kotlin.String**|  | [optional] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

