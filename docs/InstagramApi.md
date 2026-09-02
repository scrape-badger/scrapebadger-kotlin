# InstagramApi

All URIs are relative to *https://scrapebadger.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**instagramAboutThisAccount**](InstagramApi.md#instagramAboutThisAccount) | **GET** /v1/instagram/users/{username}/about | About this account |
| [**instagramBlendedTopSearch**](InstagramApi.md#instagramBlendedTopSearch) | **GET** /v1/instagram/search/top | Blended top search |
| [**instagramGetActiveStories**](InstagramApi.md#instagramGetActiveStories) | **GET** /v1/instagram/users/{username}/stories | Get active stories |
| [**instagramGetAudioTrack**](InstagramApi.md#instagramGetAudioTrack) | **GET** /v1/instagram/audio/{audio_id} | Get audio track |
| [**instagramGetComments**](InstagramApi.md#instagramGetComments) | **GET** /v1/instagram/media/{code}/comments | Get comments |
| [**instagramGetFollowers**](InstagramApi.md#instagramGetFollowers) | **GET** /v1/instagram/users/{username}/followers | Get followers |
| [**instagramGetFollowing**](InstagramApi.md#instagramGetFollowing) | **GET** /v1/instagram/users/{username}/following | Get following |
| [**instagramGetHashtagInfo**](InstagramApi.md#instagramGetHashtagInfo) | **GET** /v1/instagram/hashtags/{tag} | Get hashtag info |
| [**instagramGetHighlights**](InstagramApi.md#instagramGetHighlights) | **GET** /v1/instagram/users/{username}/highlights | Get highlights |
| [**instagramGetLikers**](InstagramApi.md#instagramGetLikers) | **GET** /v1/instagram/media/{code}/likers | Get likers |
| [**instagramGetLocation**](InstagramApi.md#instagramGetLocation) | **GET** /v1/instagram/locations/{location_pk} | Get location |
| [**instagramGetPostReelDetail**](InstagramApi.md#instagramGetPostReelDetail) | **GET** /v1/instagram/media/{code} | Get post/reel detail |
| [**instagramGetProfile**](InstagramApi.md#instagramGetProfile) | **GET** /v1/instagram/users/{username} | Get profile |
| [**instagramGetTaggedPosts**](InstagramApi.md#instagramGetTaggedPosts) | **GET** /v1/instagram/users/{username}/tagged | Get tagged posts |
| [**instagramGetUserPosts**](InstagramApi.md#instagramGetUserPosts) | **GET** /v1/instagram/users/{username}/posts | Get user posts |
| [**instagramGetUserReels**](InstagramApi.md#instagramGetUserReels) | **GET** /v1/instagram/users/{username}/reels | Get user reels |
| [**instagramHealth**](InstagramApi.md#instagramHealth) | **GET** /v1/instagram/health | Health |
| [**instagramHealthHead**](InstagramApi.md#instagramHealthHead) | **HEAD** /v1/instagram/health | Health |
| [**instagramRecentHashtagPosts**](InstagramApi.md#instagramRecentHashtagPosts) | **GET** /v1/instagram/hashtags/{tag}/recent | Recent hashtag posts |
| [**instagramRelatedProfiles**](InstagramApi.md#instagramRelatedProfiles) | **GET** /v1/instagram/users/{username}/related | Related profiles |
| [**instagramSearchHashtags**](InstagramApi.md#instagramSearchHashtags) | **GET** /v1/instagram/search/hashtags | Search hashtags |
| [**instagramSearchUsers**](InstagramApi.md#instagramSearchUsers) | **GET** /v1/instagram/search/users | Search users |
| [**instagramTopHashtagPosts**](InstagramApi.md#instagramTopHashtagPosts) | **GET** /v1/instagram/hashtags/{tag}/top | Top hashtag posts |


<a id="instagramAboutThisAccount"></a>
# **instagramAboutThisAccount**
> kotlin.Any instagramAboutThisAccount(username)

About this account

**Temporarily unavailable.** The authenticated Instagram tier is offline, so this endpoint currently returns &#x60;503 temporarily_unavailable&#x60; (not billed, &#x60;Retry-After&#x60; set) — see https://docs.scrapebadger.com/instagram/overview. Country, join date and former usernames.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = InstagramApi()
val username : kotlin.String = username_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.instagramAboutThisAccount(username)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InstagramApi#instagramAboutThisAccount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InstagramApi#instagramAboutThisAccount")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **username** | **kotlin.String**|  | |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="instagramBlendedTopSearch"></a>
# **instagramBlendedTopSearch**
> kotlin.Any instagramBlendedTopSearch(query)

Blended top search

**Temporarily unavailable.** The authenticated Instagram tier is offline, so this endpoint currently returns &#x60;503 temporarily_unavailable&#x60; (not billed, &#x60;Retry-After&#x60; set) — see https://docs.scrapebadger.com/instagram/overview.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = InstagramApi()
val query : kotlin.String = query_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.instagramBlendedTopSearch(query)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InstagramApi#instagramBlendedTopSearch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InstagramApi#instagramBlendedTopSearch")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **query** | **kotlin.String**|  | |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="instagramGetActiveStories"></a>
# **instagramGetActiveStories**
> kotlin.Any instagramGetActiveStories(username)

Get active stories

**Temporarily unavailable.** The authenticated Instagram tier is offline, so this endpoint currently returns &#x60;503 temporarily_unavailable&#x60; (not billed, &#x60;Retry-After&#x60; set) — see https://docs.scrapebadger.com/instagram/overview. Active stories (account pool only).

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = InstagramApi()
val username : kotlin.String = username_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.instagramGetActiveStories(username)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InstagramApi#instagramGetActiveStories")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InstagramApi#instagramGetActiveStories")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **username** | **kotlin.String**|  | |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="instagramGetAudioTrack"></a>
# **instagramGetAudioTrack**
> kotlin.Any instagramGetAudioTrack(audioId)

Get audio track

**Temporarily unavailable.** The authenticated Instagram tier is offline, so this endpoint currently returns &#x60;503 temporarily_unavailable&#x60; (not billed, &#x60;Retry-After&#x60; set) — see https://docs.scrapebadger.com/instagram/overview.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = InstagramApi()
val audioId : kotlin.String = audioId_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.instagramGetAudioTrack(audioId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InstagramApi#instagramGetAudioTrack")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InstagramApi#instagramGetAudioTrack")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **audioId** | **kotlin.String**|  | |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="instagramGetComments"></a>
# **instagramGetComments**
> kotlin.Any instagramGetComments(code, amount, cursor)

Get comments

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = InstagramApi()
val code : kotlin.String = code_example // kotlin.String | 
val amount : kotlin.Int = 56 // kotlin.Int | 
val cursor : kotlin.String = cursor_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.instagramGetComments(code, amount, cursor)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InstagramApi#instagramGetComments")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InstagramApi#instagramGetComments")
    e.printStackTrace()
}
```

### Parameters
| **code** | **kotlin.String**|  | |
| **amount** | **kotlin.Int**|  | [optional] [default to 20] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **cursor** | **kotlin.String**|  | [optional] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="instagramGetFollowers"></a>
# **instagramGetFollowers**
> kotlin.Any instagramGetFollowers(username, amount, cursor, order)

Get followers

**Temporarily unavailable.** The authenticated Instagram tier is offline, so this endpoint currently returns &#x60;503 temporarily_unavailable&#x60; (not billed, &#x60;Retry-After&#x60; set) — see https://docs.scrapebadger.com/instagram/overview. Followers list, paginated (account pool).

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = InstagramApi()
val username : kotlin.String = username_example // kotlin.String | 
val amount : kotlin.Int = 56 // kotlin.Int | 
val cursor : kotlin.String = cursor_example // kotlin.String | 
val order : kotlin.String = order_example // kotlin.String | date_followed_latest | date_followed_earliest
try {
    val result : kotlin.Any = apiInstance.instagramGetFollowers(username, amount, cursor, order)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InstagramApi#instagramGetFollowers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InstagramApi#instagramGetFollowers")
    e.printStackTrace()
}
```

### Parameters
| **username** | **kotlin.String**|  | |
| **amount** | **kotlin.Int**|  | [optional] [default to 50] |
| **cursor** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **order** | **kotlin.String**| date_followed_latest | date_followed_earliest | [optional] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="instagramGetFollowing"></a>
# **instagramGetFollowing**
> kotlin.Any instagramGetFollowing(username, amount, cursor)

Get following

**Temporarily unavailable.** The authenticated Instagram tier is offline, so this endpoint currently returns &#x60;503 temporarily_unavailable&#x60; (not billed, &#x60;Retry-After&#x60; set) — see https://docs.scrapebadger.com/instagram/overview.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = InstagramApi()
val username : kotlin.String = username_example // kotlin.String | 
val amount : kotlin.Int = 56 // kotlin.Int | 
val cursor : kotlin.String = cursor_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.instagramGetFollowing(username, amount, cursor)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InstagramApi#instagramGetFollowing")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InstagramApi#instagramGetFollowing")
    e.printStackTrace()
}
```

### Parameters
| **username** | **kotlin.String**|  | |
| **amount** | **kotlin.Int**|  | [optional] [default to 50] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **cursor** | **kotlin.String**|  | [optional] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="instagramGetHashtagInfo"></a>
# **instagramGetHashtagInfo**
> kotlin.Any instagramGetHashtagInfo(tag)

Get hashtag info

**Temporarily unavailable.** The authenticated Instagram tier is offline, so this endpoint currently returns &#x60;503 temporarily_unavailable&#x60; (not billed, &#x60;Retry-After&#x60; set) — see https://docs.scrapebadger.com/instagram/overview.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = InstagramApi()
val tag : kotlin.String = tag_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.instagramGetHashtagInfo(tag)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InstagramApi#instagramGetHashtagInfo")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InstagramApi#instagramGetHashtagInfo")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tag** | **kotlin.String**|  | |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="instagramGetHighlights"></a>
# **instagramGetHighlights**
> kotlin.Any instagramGetHighlights(username)

Get highlights

**Temporarily unavailable.** The authenticated Instagram tier is offline, so this endpoint currently returns &#x60;503 temporarily_unavailable&#x60; (not billed, &#x60;Retry-After&#x60; set) — see https://docs.scrapebadger.com/instagram/overview.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = InstagramApi()
val username : kotlin.String = username_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.instagramGetHighlights(username)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InstagramApi#instagramGetHighlights")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InstagramApi#instagramGetHighlights")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **username** | **kotlin.String**|  | |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="instagramGetLikers"></a>
# **instagramGetLikers**
> kotlin.Any instagramGetLikers(code)

Get likers

**Temporarily unavailable.** The authenticated Instagram tier is offline, so this endpoint currently returns &#x60;503 temporarily_unavailable&#x60; (not billed, &#x60;Retry-After&#x60; set) — see https://docs.scrapebadger.com/instagram/overview.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = InstagramApi()
val code : kotlin.String = code_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.instagramGetLikers(code)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InstagramApi#instagramGetLikers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InstagramApi#instagramGetLikers")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **code** | **kotlin.String**|  | |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="instagramGetLocation"></a>
# **instagramGetLocation**
> kotlin.Any instagramGetLocation(locationPk)

Get location

**Temporarily unavailable.** The authenticated Instagram tier is offline, so this endpoint currently returns &#x60;503 temporarily_unavailable&#x60; (not billed, &#x60;Retry-After&#x60; set) — see https://docs.scrapebadger.com/instagram/overview.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = InstagramApi()
val locationPk : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.Any = apiInstance.instagramGetLocation(locationPk)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InstagramApi#instagramGetLocation")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InstagramApi#instagramGetLocation")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **locationPk** | **kotlin.Int**|  | |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="instagramGetPostReelDetail"></a>
# **instagramGetPostReelDetail**
> kotlin.Any instagramGetPostReelDetail(code)

Get post/reel detail

Single post or reel: caption, media, counts, tags, location, carousel.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = InstagramApi()
val code : kotlin.String = code_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.instagramGetPostReelDetail(code)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InstagramApi#instagramGetPostReelDetail")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InstagramApi#instagramGetPostReelDetail")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **code** | **kotlin.String**|  | |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="instagramGetProfile"></a>
# **instagramGetProfile**
> kotlin.Any instagramGetProfile(username)

Get profile

Full public profile: bio, counts, verification, business contact, links.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = InstagramApi()
val username : kotlin.String = username_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.instagramGetProfile(username)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InstagramApi#instagramGetProfile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InstagramApi#instagramGetProfile")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **username** | **kotlin.String**|  | |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="instagramGetTaggedPosts"></a>
# **instagramGetTaggedPosts**
> kotlin.Any instagramGetTaggedPosts(username, amount, cursor)

Get tagged posts

**Temporarily unavailable.** The authenticated Instagram tier is offline, so this endpoint currently returns &#x60;503 temporarily_unavailable&#x60; (not billed, &#x60;Retry-After&#x60; set) — see https://docs.scrapebadger.com/instagram/overview.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = InstagramApi()
val username : kotlin.String = username_example // kotlin.String | 
val amount : kotlin.Int = 56 // kotlin.Int | 
val cursor : kotlin.String = cursor_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.instagramGetTaggedPosts(username, amount, cursor)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InstagramApi#instagramGetTaggedPosts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InstagramApi#instagramGetTaggedPosts")
    e.printStackTrace()
}
```

### Parameters
| **username** | **kotlin.String**|  | |
| **amount** | **kotlin.Int**|  | [optional] [default to 20] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **cursor** | **kotlin.String**|  | [optional] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="instagramGetUserPosts"></a>
# **instagramGetUserPosts**
> kotlin.Any instagramGetUserPosts(username, amount, cursor)

Get user posts

Timeline posts, paginated.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = InstagramApi()
val username : kotlin.String = username_example // kotlin.String | 
val amount : kotlin.Int = 56 // kotlin.Int | 
val cursor : kotlin.String = cursor_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.instagramGetUserPosts(username, amount, cursor)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InstagramApi#instagramGetUserPosts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InstagramApi#instagramGetUserPosts")
    e.printStackTrace()
}
```

### Parameters
| **username** | **kotlin.String**|  | |
| **amount** | **kotlin.Int**|  | [optional] [default to 20] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **cursor** | **kotlin.String**|  | [optional] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="instagramGetUserReels"></a>
# **instagramGetUserReels**
> kotlin.Any instagramGetUserReels(username, amount, cursor)

Get user reels

**Temporarily unavailable.** The authenticated Instagram tier is offline, so this endpoint currently returns &#x60;503 temporarily_unavailable&#x60; (not billed, &#x60;Retry-After&#x60; set) — see https://docs.scrapebadger.com/instagram/overview.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = InstagramApi()
val username : kotlin.String = username_example // kotlin.String | 
val amount : kotlin.Int = 56 // kotlin.Int | 
val cursor : kotlin.String = cursor_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.instagramGetUserReels(username, amount, cursor)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InstagramApi#instagramGetUserReels")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InstagramApi#instagramGetUserReels")
    e.printStackTrace()
}
```

### Parameters
| **username** | **kotlin.String**|  | |
| **amount** | **kotlin.Int**|  | [optional] [default to 20] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **cursor** | **kotlin.String**|  | [optional] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="instagramHealth"></a>
# **instagramHealth**
> kotlin.Any instagramHealth()

Health

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = InstagramApi()
try {
    val result : kotlin.Any = apiInstance.instagramHealth()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InstagramApi#instagramHealth")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InstagramApi#instagramHealth")
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

<a id="instagramHealthHead"></a>
# **instagramHealthHead**
> kotlin.Any instagramHealthHead()

Health

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = InstagramApi()
try {
    val result : kotlin.Any = apiInstance.instagramHealthHead()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InstagramApi#instagramHealthHead")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InstagramApi#instagramHealthHead")
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

<a id="instagramRecentHashtagPosts"></a>
# **instagramRecentHashtagPosts**
> kotlin.Any instagramRecentHashtagPosts(tag, amount, cursor)

Recent hashtag posts

**Temporarily unavailable.** The authenticated Instagram tier is offline, so this endpoint currently returns &#x60;503 temporarily_unavailable&#x60; (not billed, &#x60;Retry-After&#x60; set) — see https://docs.scrapebadger.com/instagram/overview.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = InstagramApi()
val tag : kotlin.String = tag_example // kotlin.String | 
val amount : kotlin.Int = 56 // kotlin.Int | 
val cursor : kotlin.String = cursor_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.instagramRecentHashtagPosts(tag, amount, cursor)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InstagramApi#instagramRecentHashtagPosts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InstagramApi#instagramRecentHashtagPosts")
    e.printStackTrace()
}
```

### Parameters
| **tag** | **kotlin.String**|  | |
| **amount** | **kotlin.Int**|  | [optional] [default to 20] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **cursor** | **kotlin.String**|  | [optional] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="instagramRelatedProfiles"></a>
# **instagramRelatedProfiles**
> kotlin.Any instagramRelatedProfiles(username)

Related profiles

**Temporarily unavailable.** The authenticated Instagram tier is offline, so this endpoint currently returns &#x60;503 temporarily_unavailable&#x60; (not billed, &#x60;Retry-After&#x60; set) — see https://docs.scrapebadger.com/instagram/overview.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = InstagramApi()
val username : kotlin.String = username_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.instagramRelatedProfiles(username)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InstagramApi#instagramRelatedProfiles")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InstagramApi#instagramRelatedProfiles")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **username** | **kotlin.String**|  | |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="instagramSearchHashtags"></a>
# **instagramSearchHashtags**
> kotlin.Any instagramSearchHashtags(query)

Search hashtags

**Temporarily unavailable.** The authenticated Instagram tier is offline, so this endpoint currently returns &#x60;503 temporarily_unavailable&#x60; (not billed, &#x60;Retry-After&#x60; set) — see https://docs.scrapebadger.com/instagram/overview.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = InstagramApi()
val query : kotlin.String = query_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.instagramSearchHashtags(query)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InstagramApi#instagramSearchHashtags")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InstagramApi#instagramSearchHashtags")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **query** | **kotlin.String**|  | |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="instagramSearchUsers"></a>
# **instagramSearchUsers**
> kotlin.Any instagramSearchUsers(query)

Search users

**Temporarily unavailable.** The authenticated Instagram tier is offline, so this endpoint currently returns &#x60;503 temporarily_unavailable&#x60; (not billed, &#x60;Retry-After&#x60; set) — see https://docs.scrapebadger.com/instagram/overview.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = InstagramApi()
val query : kotlin.String = query_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.instagramSearchUsers(query)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InstagramApi#instagramSearchUsers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InstagramApi#instagramSearchUsers")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **query** | **kotlin.String**|  | |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="instagramTopHashtagPosts"></a>
# **instagramTopHashtagPosts**
> kotlin.Any instagramTopHashtagPosts(tag, amount, cursor)

Top hashtag posts

**Temporarily unavailable.** The authenticated Instagram tier is offline, so this endpoint currently returns &#x60;503 temporarily_unavailable&#x60; (not billed, &#x60;Retry-After&#x60; set) — see https://docs.scrapebadger.com/instagram/overview.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = InstagramApi()
val tag : kotlin.String = tag_example // kotlin.String | 
val amount : kotlin.Int = 56 // kotlin.Int | 
val cursor : kotlin.String = cursor_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.instagramTopHashtagPosts(tag, amount, cursor)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InstagramApi#instagramTopHashtagPosts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InstagramApi#instagramTopHashtagPosts")
    e.printStackTrace()
}
```

### Parameters
| **tag** | **kotlin.String**|  | |
| **amount** | **kotlin.Int**|  | [optional] [default to 20] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **cursor** | **kotlin.String**|  | [optional] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

