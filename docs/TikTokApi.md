# TikTokApi

All URIs are relative to *https://scrapebadger.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**tiktokGeneralSearch**](TikTokApi.md#tiktokGeneralSearch) | **GET** /v1/tiktok/search | General search |
| [**tiktokGetCommentReplies**](TikTokApi.md#tiktokGetCommentReplies) | **GET** /v1/tiktok/comments/{comment_id}/replies | Get comment replies |
| [**tiktokGetComments**](TikTokApi.md#tiktokGetComments) | **GET** /v1/tiktok/videos/{video_id}/comments | Get comments |
| [**tiktokGetFollowersDeprecated**](TikTokApi.md#tiktokGetFollowersDeprecated) | **GET** /v1/tiktok/users/{username}/followers | Get followers (deprecated) |
| [**tiktokGetFollowingDeprecated**](TikTokApi.md#tiktokGetFollowingDeprecated) | **GET** /v1/tiktok/users/{username}/following | Get following (deprecated) |
| [**tiktokGetHashtagDetail**](TikTokApi.md#tiktokGetHashtagDetail) | **GET** /v1/tiktok/hashtags/{name} | Get hashtag detail |
| [**tiktokGetHashtagVideos**](TikTokApi.md#tiktokGetHashtagVideos) | **GET** /v1/tiktok/hashtags/{name}/videos | Get hashtag videos |
| [**tiktokGetLikedVideosDeprecated**](TikTokApi.md#tiktokGetLikedVideosDeprecated) | **GET** /v1/tiktok/users/{username}/liked | Get liked videos (deprecated) |
| [**tiktokGetMusicSoundDetail**](TikTokApi.md#tiktokGetMusicSoundDetail) | **GET** /v1/tiktok/music/{music_id} | Get music/sound detail |
| [**tiktokGetMusicVideos**](TikTokApi.md#tiktokGetMusicVideos) | **GET** /v1/tiktok/music/{music_id}/videos | Get music videos |
| [**tiktokGetOembedMetadata**](TikTokApi.md#tiktokGetOembedMetadata) | **GET** /v1/tiktok/oembed | Get oEmbed metadata |
| [**tiktokGetRelatedVideos**](TikTokApi.md#tiktokGetRelatedVideos) | **GET** /v1/tiktok/videos/{video_id}/related | Get related videos |
| [**tiktokGetReposts**](TikTokApi.md#tiktokGetReposts) | **GET** /v1/tiktok/users/{username}/reposts | Get reposts |
| [**tiktokGetTranscript**](TikTokApi.md#tiktokGetTranscript) | **GET** /v1/tiktok/videos/{video_id}/transcript | Get transcript |
| [**tiktokGetUserProfile**](TikTokApi.md#tiktokGetUserProfile) | **GET** /v1/tiktok/users/{username} | Get user profile |
| [**tiktokGetUserVideos**](TikTokApi.md#tiktokGetUserVideos) | **GET** /v1/tiktok/users/{username}/videos | Get user videos |
| [**tiktokGetVideoDetail**](TikTokApi.md#tiktokGetVideoDetail) | **GET** /v1/tiktok/videos/{video_id} | Get video detail |
| [**tiktokHealthCheck**](TikTokApi.md#tiktokHealthCheck) | **GET** /v1/tiktok/health | Health check |
| [**tiktokHealthCheckHead**](TikTokApi.md#tiktokHealthCheckHead) | **HEAD** /v1/tiktok/health | Health check |
| [**tiktokListRegions**](TikTokApi.md#tiktokListRegions) | **GET** /v1/tiktok/regions | List regions |
| [**tiktokSearchHashtags**](TikTokApi.md#tiktokSearchHashtags) | **GET** /v1/tiktok/search/hashtags | Search hashtags |
| [**tiktokSearchTheTiktokAdLibrary**](TikTokApi.md#tiktokSearchTheTiktokAdLibrary) | **GET** /v1/tiktok/ads/search | Search the TikTok Ad Library |
| [**tiktokSearchUsers**](TikTokApi.md#tiktokSearchUsers) | **GET** /v1/tiktok/search/users | Search users |
| [**tiktokSearchVideos**](TikTokApi.md#tiktokSearchVideos) | **GET** /v1/tiktok/search/videos | Search videos |
| [**tiktokTrendingHashtags**](TikTokApi.md#tiktokTrendingHashtags) | **GET** /v1/tiktok/trending/hashtags | Trending hashtags |
| [**tiktokTrendingSongs**](TikTokApi.md#tiktokTrendingSongs) | **GET** /v1/tiktok/trending/songs | Trending songs |
| [**tiktokTrendingVideos**](TikTokApi.md#tiktokTrendingVideos) | **GET** /v1/tiktok/trending/videos | Trending videos |


<a id="tiktokGeneralSearch"></a>
# **tiktokGeneralSearch**
> kotlin.Any tiktokGeneralSearch(query, region, count, cursor)

General search

General TikTok search — video results from the Top feed.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = TikTokApi()
val query : kotlin.String = query_example // kotlin.String | Search keyword
val region : kotlin.String = region_example // kotlin.String | 
val count : kotlin.Int = 56 // kotlin.Int | 
val cursor : kotlin.String = cursor_example // kotlin.String | Composite pagination cursor (offset.search_id) from a prior page's pagination.cursor
try {
    val result : kotlin.Any = apiInstance.tiktokGeneralSearch(query, region, count, cursor)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TikTokApi#tiktokGeneralSearch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TikTokApi#tiktokGeneralSearch")
    e.printStackTrace()
}
```

### Parameters
| **query** | **kotlin.String**| Search keyword | |
| **region** | **kotlin.String**|  | [optional] [default to &quot;US&quot;] |
| **count** | **kotlin.Int**|  | [optional] [default to 20] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **cursor** | **kotlin.String**| Composite pagination cursor (offset.search_id) from a prior page&#39;s pagination.cursor | [optional] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="tiktokGetCommentReplies"></a>
# **tiktokGetCommentReplies**
> kotlin.Any tiktokGetCommentReplies(commentId, videoId, region, count, cursor)

Get comment replies

Get replies to a TikTok comment (best-effort).

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = TikTokApi()
val commentId : kotlin.String = commentId_example // kotlin.String | 
val videoId : kotlin.String = videoId_example // kotlin.String | Parent video id
val region : kotlin.String = region_example // kotlin.String | 
val count : kotlin.Int = 56 // kotlin.Int | 
val cursor : kotlin.String = cursor_example // kotlin.String | Pagination cursor from a prior page's pagination.cursor
try {
    val result : kotlin.Any = apiInstance.tiktokGetCommentReplies(commentId, videoId, region, count, cursor)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TikTokApi#tiktokGetCommentReplies")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TikTokApi#tiktokGetCommentReplies")
    e.printStackTrace()
}
```

### Parameters
| **commentId** | **kotlin.String**|  | |
| **videoId** | **kotlin.String**| Parent video id | |
| **region** | **kotlin.String**|  | [optional] [default to &quot;US&quot;] |
| **count** | **kotlin.Int**|  | [optional] [default to 20] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **cursor** | **kotlin.String**| Pagination cursor from a prior page&#39;s pagination.cursor | [optional] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="tiktokGetComments"></a>
# **tiktokGetComments**
> kotlin.Any tiktokGetComments(videoId, region, count, cursor)

Get comments

Get top-level comments on a TikTok video.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = TikTokApi()
val videoId : kotlin.String = videoId_example // kotlin.String | 
val region : kotlin.String = region_example // kotlin.String | 
val count : kotlin.Int = 56 // kotlin.Int | 
val cursor : kotlin.String = cursor_example // kotlin.String | Pagination cursor from a prior page's pagination.cursor
try {
    val result : kotlin.Any = apiInstance.tiktokGetComments(videoId, region, count, cursor)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TikTokApi#tiktokGetComments")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TikTokApi#tiktokGetComments")
    e.printStackTrace()
}
```

### Parameters
| **videoId** | **kotlin.String**|  | |
| **region** | **kotlin.String**|  | [optional] [default to &quot;US&quot;] |
| **count** | **kotlin.Int**|  | [optional] [default to 20] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **cursor** | **kotlin.String**| Pagination cursor from a prior page&#39;s pagination.cursor | [optional] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="tiktokGetFollowersDeprecated"></a>
# **tiktokGetFollowersDeprecated**
> kotlin.Any tiktokGetFollowersDeprecated(username, region, count)

Get followers (deprecated)

DEPRECATED — TikTok followers require an authenticated account session. Returns HTTP 410.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = TikTokApi()
val username : kotlin.String = username_example // kotlin.String | 
val region : kotlin.String = region_example // kotlin.String | 
val count : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.Any = apiInstance.tiktokGetFollowersDeprecated(username, region, count)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TikTokApi#tiktokGetFollowersDeprecated")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TikTokApi#tiktokGetFollowersDeprecated")
    e.printStackTrace()
}
```

### Parameters
| **username** | **kotlin.String**|  | |
| **region** | **kotlin.String**|  | [optional] [default to &quot;US&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **count** | **kotlin.Int**|  | [optional] [default to 30] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="tiktokGetFollowingDeprecated"></a>
# **tiktokGetFollowingDeprecated**
> kotlin.Any tiktokGetFollowingDeprecated(username, region, count)

Get following (deprecated)

DEPRECATED — TikTok following requires an authenticated account session. Returns HTTP 410.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = TikTokApi()
val username : kotlin.String = username_example // kotlin.String | 
val region : kotlin.String = region_example // kotlin.String | 
val count : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.Any = apiInstance.tiktokGetFollowingDeprecated(username, region, count)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TikTokApi#tiktokGetFollowingDeprecated")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TikTokApi#tiktokGetFollowingDeprecated")
    e.printStackTrace()
}
```

### Parameters
| **username** | **kotlin.String**|  | |
| **region** | **kotlin.String**|  | [optional] [default to &quot;US&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **count** | **kotlin.Int**|  | [optional] [default to 30] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="tiktokGetHashtagDetail"></a>
# **tiktokGetHashtagDetail**
> kotlin.Any tiktokGetHashtagDetail(name, region)

Get hashtag detail

Get TikTok hashtag/challenge detail.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = TikTokApi()
val name : kotlin.String = name_example // kotlin.String | 
val region : kotlin.String = region_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.tiktokGetHashtagDetail(name, region)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TikTokApi#tiktokGetHashtagDetail")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TikTokApi#tiktokGetHashtagDetail")
    e.printStackTrace()
}
```

### Parameters
| **name** | **kotlin.String**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **region** | **kotlin.String**|  | [optional] [default to &quot;US&quot;] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="tiktokGetHashtagVideos"></a>
# **tiktokGetHashtagVideos**
> kotlin.Any tiktokGetHashtagVideos(name, region, count, cursor)

Get hashtag videos

Get videos tagged with a TikTok hashtag.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = TikTokApi()
val name : kotlin.String = name_example // kotlin.String | 
val region : kotlin.String = region_example // kotlin.String | 
val count : kotlin.Int = 56 // kotlin.Int | 
val cursor : kotlin.String = cursor_example // kotlin.String | Pagination cursor from a prior page's pagination.cursor
try {
    val result : kotlin.Any = apiInstance.tiktokGetHashtagVideos(name, region, count, cursor)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TikTokApi#tiktokGetHashtagVideos")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TikTokApi#tiktokGetHashtagVideos")
    e.printStackTrace()
}
```

### Parameters
| **name** | **kotlin.String**|  | |
| **region** | **kotlin.String**|  | [optional] [default to &quot;US&quot;] |
| **count** | **kotlin.Int**|  | [optional] [default to 30] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **cursor** | **kotlin.String**| Pagination cursor from a prior page&#39;s pagination.cursor | [optional] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="tiktokGetLikedVideosDeprecated"></a>
# **tiktokGetLikedVideosDeprecated**
> kotlin.Any tiktokGetLikedVideosDeprecated(username, region, count)

Get liked videos (deprecated)

DEPRECATED — TikTok liked videos require an authenticated account session. Returns HTTP 410.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = TikTokApi()
val username : kotlin.String = username_example // kotlin.String | 
val region : kotlin.String = region_example // kotlin.String | 
val count : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.Any = apiInstance.tiktokGetLikedVideosDeprecated(username, region, count)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TikTokApi#tiktokGetLikedVideosDeprecated")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TikTokApi#tiktokGetLikedVideosDeprecated")
    e.printStackTrace()
}
```

### Parameters
| **username** | **kotlin.String**|  | |
| **region** | **kotlin.String**|  | [optional] [default to &quot;US&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **count** | **kotlin.Int**|  | [optional] [default to 30] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="tiktokGetMusicSoundDetail"></a>
# **tiktokGetMusicSoundDetail**
> kotlin.Any tiktokGetMusicSoundDetail(musicId, region)

Get music/sound detail

Get TikTok sound/music detail.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = TikTokApi()
val musicId : kotlin.String = musicId_example // kotlin.String | 
val region : kotlin.String = region_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.tiktokGetMusicSoundDetail(musicId, region)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TikTokApi#tiktokGetMusicSoundDetail")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TikTokApi#tiktokGetMusicSoundDetail")
    e.printStackTrace()
}
```

### Parameters
| **musicId** | **kotlin.String**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **region** | **kotlin.String**|  | [optional] [default to &quot;US&quot;] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="tiktokGetMusicVideos"></a>
# **tiktokGetMusicVideos**
> kotlin.Any tiktokGetMusicVideos(musicId, region, count, cursor)

Get music videos

Get videos using a given TikTok sound.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = TikTokApi()
val musicId : kotlin.String = musicId_example // kotlin.String | 
val region : kotlin.String = region_example // kotlin.String | 
val count : kotlin.Int = 56 // kotlin.Int | 
val cursor : kotlin.String = cursor_example // kotlin.String | Pagination cursor from a prior page's pagination.cursor
try {
    val result : kotlin.Any = apiInstance.tiktokGetMusicVideos(musicId, region, count, cursor)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TikTokApi#tiktokGetMusicVideos")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TikTokApi#tiktokGetMusicVideos")
    e.printStackTrace()
}
```

### Parameters
| **musicId** | **kotlin.String**|  | |
| **region** | **kotlin.String**|  | [optional] [default to &quot;US&quot;] |
| **count** | **kotlin.Int**|  | [optional] [default to 30] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **cursor** | **kotlin.String**| Pagination cursor from a prior page&#39;s pagination.cursor | [optional] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="tiktokGetOembedMetadata"></a>
# **tiktokGetOembedMetadata**
> kotlin.Any tiktokGetOembedMetadata(url, region)

Get oEmbed metadata

Get cheap unauthenticated oEmbed metadata for a TikTok URL.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = TikTokApi()
val url : kotlin.String = url_example // kotlin.String | Full TikTok video or profile URL
val region : kotlin.String = region_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.tiktokGetOembedMetadata(url, region)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TikTokApi#tiktokGetOembedMetadata")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TikTokApi#tiktokGetOembedMetadata")
    e.printStackTrace()
}
```

### Parameters
| **url** | **kotlin.String**| Full TikTok video or profile URL | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **region** | **kotlin.String**|  | [optional] [default to &quot;US&quot;] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="tiktokGetRelatedVideos"></a>
# **tiktokGetRelatedVideos**
> kotlin.Any tiktokGetRelatedVideos(videoId, region, count)

Get related videos

Get TikTok&#39;s related videos for a given video.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = TikTokApi()
val videoId : kotlin.String = videoId_example // kotlin.String | 
val region : kotlin.String = region_example // kotlin.String | 
val count : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.Any = apiInstance.tiktokGetRelatedVideos(videoId, region, count)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TikTokApi#tiktokGetRelatedVideos")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TikTokApi#tiktokGetRelatedVideos")
    e.printStackTrace()
}
```

### Parameters
| **videoId** | **kotlin.String**|  | |
| **region** | **kotlin.String**|  | [optional] [default to &quot;US&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **count** | **kotlin.Int**|  | [optional] [default to 16] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="tiktokGetReposts"></a>
# **tiktokGetReposts**
> kotlin.Any tiktokGetReposts(username, region, count)

Get reposts

Get videos a TikTok user has reposted.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = TikTokApi()
val username : kotlin.String = username_example // kotlin.String | 
val region : kotlin.String = region_example // kotlin.String | 
val count : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.Any = apiInstance.tiktokGetReposts(username, region, count)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TikTokApi#tiktokGetReposts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TikTokApi#tiktokGetReposts")
    e.printStackTrace()
}
```

### Parameters
| **username** | **kotlin.String**|  | |
| **region** | **kotlin.String**|  | [optional] [default to &quot;US&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **count** | **kotlin.Int**|  | [optional] [default to 30] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="tiktokGetTranscript"></a>
# **tiktokGetTranscript**
> kotlin.Any tiktokGetTranscript(videoId, region)

Get transcript

Get subtitle/caption tracks for a TikTok video.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = TikTokApi()
val videoId : kotlin.String = videoId_example // kotlin.String | 
val region : kotlin.String = region_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.tiktokGetTranscript(videoId, region)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TikTokApi#tiktokGetTranscript")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TikTokApi#tiktokGetTranscript")
    e.printStackTrace()
}
```

### Parameters
| **videoId** | **kotlin.String**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **region** | **kotlin.String**|  | [optional] [default to &quot;US&quot;] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="tiktokGetUserProfile"></a>
# **tiktokGetUserProfile**
> kotlin.Any tiktokGetUserProfile(username, region)

Get user profile

Get a TikTok user&#39;s full profile.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = TikTokApi()
val username : kotlin.String = username_example // kotlin.String | 
val region : kotlin.String = region_example // kotlin.String | Content region (ISO 3166-1 alpha-2)
try {
    val result : kotlin.Any = apiInstance.tiktokGetUserProfile(username, region)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TikTokApi#tiktokGetUserProfile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TikTokApi#tiktokGetUserProfile")
    e.printStackTrace()
}
```

### Parameters
| **username** | **kotlin.String**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **region** | **kotlin.String**| Content region (ISO 3166-1 alpha-2) | [optional] [default to &quot;US&quot;] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="tiktokGetUserVideos"></a>
# **tiktokGetUserVideos**
> kotlin.Any tiktokGetUserVideos(username, region, count, cursor)

Get user videos

Get a TikTok user&#39;s posted videos.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = TikTokApi()
val username : kotlin.String = username_example // kotlin.String | 
val region : kotlin.String = region_example // kotlin.String | 
val count : kotlin.Int = 56 // kotlin.Int | 
val cursor : kotlin.String = cursor_example // kotlin.String | Pagination cursor from a prior page's `pagination.cursor` (signer path only).
try {
    val result : kotlin.Any = apiInstance.tiktokGetUserVideos(username, region, count, cursor)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TikTokApi#tiktokGetUserVideos")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TikTokApi#tiktokGetUserVideos")
    e.printStackTrace()
}
```

### Parameters
| **username** | **kotlin.String**|  | |
| **region** | **kotlin.String**|  | [optional] [default to &quot;US&quot;] |
| **count** | **kotlin.Int**|  | [optional] [default to 30] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **cursor** | **kotlin.String**| Pagination cursor from a prior page&#39;s &#x60;pagination.cursor&#x60; (signer path only). | [optional] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="tiktokGetVideoDetail"></a>
# **tiktokGetVideoDetail**
> kotlin.Any tiktokGetVideoDetail(videoId, region, username)

Get video detail

Get full metadata for a single TikTok video/post.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = TikTokApi()
val videoId : kotlin.String = videoId_example // kotlin.String | 
val region : kotlin.String = region_example // kotlin.String | 
val username : kotlin.String = username_example // kotlin.String | Author handle (skips oEmbed lookup)
try {
    val result : kotlin.Any = apiInstance.tiktokGetVideoDetail(videoId, region, username)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TikTokApi#tiktokGetVideoDetail")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TikTokApi#tiktokGetVideoDetail")
    e.printStackTrace()
}
```

### Parameters
| **videoId** | **kotlin.String**|  | |
| **region** | **kotlin.String**|  | [optional] [default to &quot;US&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **username** | **kotlin.String**| Author handle (skips oEmbed lookup) | [optional] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="tiktokHealthCheck"></a>
# **tiktokHealthCheck**
> kotlin.Any tiktokHealthCheck()

Health check

Check health of the TikTok scraper service.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = TikTokApi()
try {
    val result : kotlin.Any = apiInstance.tiktokHealthCheck()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TikTokApi#tiktokHealthCheck")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TikTokApi#tiktokHealthCheck")
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

<a id="tiktokHealthCheckHead"></a>
# **tiktokHealthCheckHead**
> kotlin.Any tiktokHealthCheckHead()

Health check

Check health of the TikTok scraper service.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = TikTokApi()
try {
    val result : kotlin.Any = apiInstance.tiktokHealthCheckHead()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TikTokApi#tiktokHealthCheckHead")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TikTokApi#tiktokHealthCheckHead")
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

<a id="tiktokListRegions"></a>
# **tiktokListRegions**
> kotlin.Any tiktokListRegions()

List regions

List supported TikTok content regions.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = TikTokApi()
try {
    val result : kotlin.Any = apiInstance.tiktokListRegions()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TikTokApi#tiktokListRegions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TikTokApi#tiktokListRegions")
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

<a id="tiktokSearchHashtags"></a>
# **tiktokSearchHashtags**
> kotlin.Any tiktokSearchHashtags(query, region, count, cursor)

Search hashtags

Search TikTok hashtags by keyword.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = TikTokApi()
val query : kotlin.String = query_example // kotlin.String | Search keyword
val region : kotlin.String = region_example // kotlin.String | 
val count : kotlin.Int = 56 // kotlin.Int | 
val cursor : kotlin.String = cursor_example // kotlin.String | Composite pagination cursor (offset.search_id) from a prior page's pagination.cursor
try {
    val result : kotlin.Any = apiInstance.tiktokSearchHashtags(query, region, count, cursor)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TikTokApi#tiktokSearchHashtags")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TikTokApi#tiktokSearchHashtags")
    e.printStackTrace()
}
```

### Parameters
| **query** | **kotlin.String**| Search keyword | |
| **region** | **kotlin.String**|  | [optional] [default to &quot;US&quot;] |
| **count** | **kotlin.Int**|  | [optional] [default to 20] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **cursor** | **kotlin.String**| Composite pagination cursor (offset.search_id) from a prior page&#39;s pagination.cursor | [optional] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="tiktokSearchTheTiktokAdLibrary"></a>
# **tiktokSearchTheTiktokAdLibrary**
> kotlin.Any tiktokSearchTheTiktokAdLibrary(query, advertiserId, region, days, sort, offset, searchId, count)

Search the TikTok Ad Library

Search TikTok&#39;s Commercial Content Library (ad transparency) by keyword or advertiser.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = TikTokApi()
val query : kotlin.String = query_example // kotlin.String | Keyword (ignored when advertiser_id is set)
val advertiserId : kotlin.String = advertiserId_example // kotlin.String | Advertiser business id(s) for advertiser search
val region : kotlin.String = region_example // kotlin.String | EU region code (the Ad Library is EU-only)
val days : kotlin.Int = 56 // kotlin.Int | 
val sort : kotlin.String = sort_example // kotlin.String | 
val offset : kotlin.Int = 56 // kotlin.Int | 
val searchId : kotlin.String = searchId_example // kotlin.String | 
val count : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.Any = apiInstance.tiktokSearchTheTiktokAdLibrary(query, advertiserId, region, days, sort, offset, searchId, count)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TikTokApi#tiktokSearchTheTiktokAdLibrary")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TikTokApi#tiktokSearchTheTiktokAdLibrary")
    e.printStackTrace()
}
```

### Parameters
| **query** | **kotlin.String**| Keyword (ignored when advertiser_id is set) | [optional] [default to &quot;&quot;] |
| **advertiserId** | **kotlin.String**| Advertiser business id(s) for advertiser search | [optional] [default to &quot;&quot;] |
| **region** | **kotlin.String**| EU region code (the Ad Library is EU-only) | [optional] [default to &quot;DE&quot;] |
| **days** | **kotlin.Int**|  | [optional] [default to 30] |
| **sort** | **kotlin.String**|  | [optional] [default to &quot;last_shown_date,desc&quot;] |
| **offset** | **kotlin.Int**|  | [optional] [default to 0] |
| **searchId** | **kotlin.String**|  | [optional] [default to &quot;&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **count** | **kotlin.Int**|  | [optional] [default to 20] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="tiktokSearchUsers"></a>
# **tiktokSearchUsers**
> kotlin.Any tiktokSearchUsers(query, region, count, cursor)

Search users

Search TikTok users by keyword.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = TikTokApi()
val query : kotlin.String = query_example // kotlin.String | Search keyword
val region : kotlin.String = region_example // kotlin.String | 
val count : kotlin.Int = 56 // kotlin.Int | 
val cursor : kotlin.String = cursor_example // kotlin.String | Composite pagination cursor (offset.search_id) from a prior page's pagination.cursor
try {
    val result : kotlin.Any = apiInstance.tiktokSearchUsers(query, region, count, cursor)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TikTokApi#tiktokSearchUsers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TikTokApi#tiktokSearchUsers")
    e.printStackTrace()
}
```

### Parameters
| **query** | **kotlin.String**| Search keyword | |
| **region** | **kotlin.String**|  | [optional] [default to &quot;US&quot;] |
| **count** | **kotlin.Int**|  | [optional] [default to 20] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **cursor** | **kotlin.String**| Composite pagination cursor (offset.search_id) from a prior page&#39;s pagination.cursor | [optional] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="tiktokSearchVideos"></a>
# **tiktokSearchVideos**
> kotlin.Any tiktokSearchVideos(query, region, count, cursor)

Search videos

Search TikTok videos by keyword.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = TikTokApi()
val query : kotlin.String = query_example // kotlin.String | Search keyword
val region : kotlin.String = region_example // kotlin.String | 
val count : kotlin.Int = 56 // kotlin.Int | 
val cursor : kotlin.String = cursor_example // kotlin.String | Composite pagination cursor (offset.search_id) from a prior page's pagination.cursor
try {
    val result : kotlin.Any = apiInstance.tiktokSearchVideos(query, region, count, cursor)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TikTokApi#tiktokSearchVideos")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TikTokApi#tiktokSearchVideos")
    e.printStackTrace()
}
```

### Parameters
| **query** | **kotlin.String**| Search keyword | |
| **region** | **kotlin.String**|  | [optional] [default to &quot;US&quot;] |
| **count** | **kotlin.Int**|  | [optional] [default to 20] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **cursor** | **kotlin.String**| Composite pagination cursor (offset.search_id) from a prior page&#39;s pagination.cursor | [optional] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="tiktokTrendingHashtags"></a>
# **tiktokTrendingHashtags**
> kotlin.Any tiktokTrendingHashtags(region, period, count)

Trending hashtags

Get trending hashtags (mobile Discover surface — view_count + creators).

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = TikTokApi()
val region : kotlin.String = region_example // kotlin.String | 
val period : kotlin.Int = 56 // kotlin.Int | 
val count : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.Any = apiInstance.tiktokTrendingHashtags(region, period, count)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TikTokApi#tiktokTrendingHashtags")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TikTokApi#tiktokTrendingHashtags")
    e.printStackTrace()
}
```

### Parameters
| **region** | **kotlin.String**|  | [optional] [default to &quot;US&quot;] |
| **period** | **kotlin.Int**|  | [optional] [default to 7] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **count** | **kotlin.Int**|  | [optional] [default to 20] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="tiktokTrendingSongs"></a>
# **tiktokTrendingSongs**
> kotlin.Any tiktokTrendingSongs(region, period, count)

Trending songs

Get trending songs/sounds (mobile hot-music feed — ranked by usage).

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = TikTokApi()
val region : kotlin.String = region_example // kotlin.String | 
val period : kotlin.Int = 56 // kotlin.Int | 
val count : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.Any = apiInstance.tiktokTrendingSongs(region, period, count)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TikTokApi#tiktokTrendingSongs")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TikTokApi#tiktokTrendingSongs")
    e.printStackTrace()
}
```

### Parameters
| **region** | **kotlin.String**|  | [optional] [default to &quot;US&quot;] |
| **period** | **kotlin.Int**|  | [optional] [default to 7] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **count** | **kotlin.Int**|  | [optional] [default to 20] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="tiktokTrendingVideos"></a>
# **tiktokTrendingVideos**
> kotlin.Any tiktokTrendingVideos(region, count)

Trending videos

Get trending videos from the TikTok Explore feed.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = TikTokApi()
val region : kotlin.String = region_example // kotlin.String | 
val count : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.Any = apiInstance.tiktokTrendingVideos(region, count)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TikTokApi#tiktokTrendingVideos")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TikTokApi#tiktokTrendingVideos")
    e.printStackTrace()
}
```

### Parameters
| **region** | **kotlin.String**|  | [optional] [default to &quot;US&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **count** | **kotlin.Int**|  | [optional] [default to 20] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

