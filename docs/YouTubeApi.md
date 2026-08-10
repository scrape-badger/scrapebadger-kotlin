# YouTubeApi

All URIs are relative to *https://scrapebadger.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**youtubeBatchVideoDetail**](YouTubeApi.md#youtubeBatchVideoDetail) | **POST** /v1/youtube/videos/batch | Batch video detail |
| [**youtubeChannelAbout**](YouTubeApi.md#youtubeChannelAbout) | **GET** /v1/youtube/channels/{channel_id}/about | Channel about |
| [**youtubeChannelPlaylists**](YouTubeApi.md#youtubeChannelPlaylists) | **GET** /v1/youtube/channels/{channel_id}/playlists | Channel playlists |
| [**youtubeChannelShorts**](YouTubeApi.md#youtubeChannelShorts) | **GET** /v1/youtube/channels/{channel_id}/shorts | Channel shorts |
| [**youtubeChannelStreams**](YouTubeApi.md#youtubeChannelStreams) | **GET** /v1/youtube/channels/{channel_id}/streams | Channel streams |
| [**youtubeChannelVideos**](YouTubeApi.md#youtubeChannelVideos) | **GET** /v1/youtube/channels/{channel_id}/videos | Channel videos |
| [**youtubeCommentReplies**](YouTubeApi.md#youtubeCommentReplies) | **GET** /v1/youtube/videos/{video_id}/comments/{comment_id}/replies | Comment replies |
| [**youtubeCommunityPostComments**](YouTubeApi.md#youtubeCommunityPostComments) | **GET** /v1/youtube/posts/{post_id}/comments | Community post comments |
| [**youtubeCommunityPosts**](YouTubeApi.md#youtubeCommunityPosts) | **GET** /v1/youtube/channels/{channel_id}/community | Community posts |
| [**youtubeContentRegions**](YouTubeApi.md#youtubeContentRegions) | **GET** /v1/youtube/regions | Content regions |
| [**youtubeGetACommunityPost**](YouTubeApi.md#youtubeGetACommunityPost) | **GET** /v1/youtube/posts/{post_id} | Get a community post |
| [**youtubeGetAMixRadioQueue**](YouTubeApi.md#youtubeGetAMixRadioQueue) | **GET** /v1/youtube/mixes/{playlist_id} | Get a mix / radio queue |
| [**youtubeGetAShort**](YouTubeApi.md#youtubeGetAShort) | **GET** /v1/youtube/shorts/{video_id} | Get a Short |
| [**youtubeGetChannelDetail**](YouTubeApi.md#youtubeGetChannelDetail) | **GET** /v1/youtube/channels/{channel_id} | Get channel detail |
| [**youtubeGetPlaylistDetail**](YouTubeApi.md#youtubeGetPlaylistDetail) | **GET** /v1/youtube/playlists/{playlist_id} | Get playlist detail |
| [**youtubeGetVideoDetail**](YouTubeApi.md#youtubeGetVideoDetail) | **GET** /v1/youtube/videos/{video_id} | Get video detail |
| [**youtubeGuestHomeFeed**](YouTubeApi.md#youtubeGuestHomeFeed) | **GET** /v1/youtube/home | Guest home feed |
| [**youtubeKeywordSuggestions**](YouTubeApi.md#youtubeKeywordSuggestions) | **GET** /v1/youtube/autocomplete | Keyword suggestions |
| [**youtubeListCaptionTracks**](YouTubeApi.md#youtubeListCaptionTracks) | **GET** /v1/youtube/videos/{video_id}/captions | List caption tracks |
| [**youtubeLiveChatMessages**](YouTubeApi.md#youtubeLiveChatMessages) | **GET** /v1/youtube/videos/{video_id}/live_chat | Live chat messages |
| [**youtubeOembedMetadata**](YouTubeApi.md#youtubeOembedMetadata) | **GET** /v1/youtube/oembed | oEmbed metadata |
| [**youtubePlaylistItemsPage**](YouTubeApi.md#youtubePlaylistItemsPage) | **GET** /v1/youtube/playlists/{playlist_id}/items | Playlist items page |
| [**youtubeRelatedVideos**](YouTubeApi.md#youtubeRelatedVideos) | **GET** /v1/youtube/videos/{video_id}/related | Related videos |
| [**youtubeResolveHandleUrlToId**](YouTubeApi.md#youtubeResolveHandleUrlToId) | **GET** /v1/youtube/channels/resolve | Resolve handle/URL to id |
| [**youtubeSearchWithinAChannel**](YouTubeApi.md#youtubeSearchWithinAChannel) | **GET** /v1/youtube/channels/{channel_id}/search | Search within a channel |
| [**youtubeSearchYoutube**](YouTubeApi.md#youtubeSearchYoutube) | **GET** /v1/youtube/search | Search YouTube |
| [**youtubeSearchYoutubeMusic**](YouTubeApi.md#youtubeSearchYoutubeMusic) | **GET** /v1/youtube/music/search | Search YouTube Music |
| [**youtubeShortsBySound**](YouTubeApi.md#youtubeShortsBySound) | **GET** /v1/youtube/shorts/by_sound/{sound_id} | Shorts by sound |
| [**youtubeStreamFormats**](YouTubeApi.md#youtubeStreamFormats) | **GET** /v1/youtube/videos/{video_id}/streams | Stream formats |
| [**youtubeSubscriberCountFast**](YouTubeApi.md#youtubeSubscriberCountFast) | **GET** /v1/youtube/channels/{channel_id}/subscriber_count | Subscriber count (fast) |
| [**youtubeSupportedMarkets**](YouTubeApi.md#youtubeSupportedMarkets) | **GET** /v1/youtube/markets | Supported markets |
| [**youtubeTrendingShorts**](YouTubeApi.md#youtubeTrendingShorts) | **GET** /v1/youtube/trending/shorts | Trending shorts |
| [**youtubeTrendingVideos**](YouTubeApi.md#youtubeTrendingVideos) | **GET** /v1/youtube/trending | Trending videos |
| [**youtubeUiLanguages**](YouTubeApi.md#youtubeUiLanguages) | **GET** /v1/youtube/languages | UI languages |
| [**youtubeVideoCategories**](YouTubeApi.md#youtubeVideoCategories) | **GET** /v1/youtube/categories | Video categories |
| [**youtubeVideoComments**](YouTubeApi.md#youtubeVideoComments) | **GET** /v1/youtube/videos/{video_id}/comments | Video comments |
| [**youtubeVideoTranscript**](YouTubeApi.md#youtubeVideoTranscript) | **GET** /v1/youtube/videos/{video_id}/transcript | Video transcript |
| [**youtubeVideosUnderAHashtag**](YouTubeApi.md#youtubeVideosUnderAHashtag) | **GET** /v1/youtube/hashtags/{tag} | Videos under a hashtag |
| [**youtubeYoutubeScraperHealthCheck**](YouTubeApi.md#youtubeYoutubeScraperHealthCheck) | **GET** /v1/youtube/health | YouTube scraper health check |
| [**youtubeYoutubeScraperHealthCheckHead**](YouTubeApi.md#youtubeYoutubeScraperHealthCheckHead) | **HEAD** /v1/youtube/health | YouTube scraper health check |


<a id="youtubeBatchVideoDetail"></a>
# **youtubeBatchVideoDetail**
> kotlin.Any youtubeBatchVideoDetail(requestBody)

Batch video detail

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = YouTubeApi()
val requestBody : kotlin.collections.Map<kotlin.String, kotlin.Any> = Object // kotlin.collections.Map<kotlin.String, kotlin.Any> | 
try {
    val result : kotlin.Any = apiInstance.youtubeBatchVideoDetail(requestBody)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling YouTubeApi#youtubeBatchVideoDetail")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling YouTubeApi#youtubeBatchVideoDetail")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **requestBody** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md)|  | |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="youtubeChannelAbout"></a>
# **youtubeChannelAbout**
> kotlin.Any youtubeChannelAbout(channelId)

Channel about

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = YouTubeApi()
val channelId : kotlin.String = channelId_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.youtubeChannelAbout(channelId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling YouTubeApi#youtubeChannelAbout")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling YouTubeApi#youtubeChannelAbout")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **channelId** | **kotlin.String**|  | |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="youtubeChannelPlaylists"></a>
# **youtubeChannelPlaylists**
> kotlin.Any youtubeChannelPlaylists(channelId)

Channel playlists

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = YouTubeApi()
val channelId : kotlin.String = channelId_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.youtubeChannelPlaylists(channelId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling YouTubeApi#youtubeChannelPlaylists")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling YouTubeApi#youtubeChannelPlaylists")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **channelId** | **kotlin.String**|  | |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="youtubeChannelShorts"></a>
# **youtubeChannelShorts**
> kotlin.Any youtubeChannelShorts(channelId)

Channel shorts

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = YouTubeApi()
val channelId : kotlin.String = channelId_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.youtubeChannelShorts(channelId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling YouTubeApi#youtubeChannelShorts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling YouTubeApi#youtubeChannelShorts")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **channelId** | **kotlin.String**|  | |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="youtubeChannelStreams"></a>
# **youtubeChannelStreams**
> kotlin.Any youtubeChannelStreams(channelId)

Channel streams

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = YouTubeApi()
val channelId : kotlin.String = channelId_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.youtubeChannelStreams(channelId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling YouTubeApi#youtubeChannelStreams")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling YouTubeApi#youtubeChannelStreams")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **channelId** | **kotlin.String**|  | |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="youtubeChannelVideos"></a>
# **youtubeChannelVideos**
> kotlin.Any youtubeChannelVideos(channelId)

Channel videos

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = YouTubeApi()
val channelId : kotlin.String = channelId_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.youtubeChannelVideos(channelId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling YouTubeApi#youtubeChannelVideos")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling YouTubeApi#youtubeChannelVideos")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **channelId** | **kotlin.String**|  | |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="youtubeCommentReplies"></a>
# **youtubeCommentReplies**
> kotlin.Any youtubeCommentReplies(videoId, commentId, continuation)

Comment replies

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = YouTubeApi()
val videoId : kotlin.String = videoId_example // kotlin.String | 
val commentId : kotlin.String = commentId_example // kotlin.String | 
val continuation : kotlin.String = continuation_example // kotlin.String | Replies continuation token
try {
    val result : kotlin.Any = apiInstance.youtubeCommentReplies(videoId, commentId, continuation)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling YouTubeApi#youtubeCommentReplies")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling YouTubeApi#youtubeCommentReplies")
    e.printStackTrace()
}
```

### Parameters
| **videoId** | **kotlin.String**|  | |
| **commentId** | **kotlin.String**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **continuation** | **kotlin.String**| Replies continuation token | |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="youtubeCommunityPostComments"></a>
# **youtubeCommunityPostComments**
> kotlin.Any youtubeCommunityPostComments(postId)

Community post comments

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = YouTubeApi()
val postId : kotlin.String = postId_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.youtubeCommunityPostComments(postId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling YouTubeApi#youtubeCommunityPostComments")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling YouTubeApi#youtubeCommunityPostComments")
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

<a id="youtubeCommunityPosts"></a>
# **youtubeCommunityPosts**
> kotlin.Any youtubeCommunityPosts(channelId)

Community posts

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = YouTubeApi()
val channelId : kotlin.String = channelId_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.youtubeCommunityPosts(channelId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling YouTubeApi#youtubeCommunityPosts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling YouTubeApi#youtubeCommunityPosts")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **channelId** | **kotlin.String**|  | |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="youtubeContentRegions"></a>
# **youtubeContentRegions**
> kotlin.Any youtubeContentRegions()

Content regions

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = YouTubeApi()
try {
    val result : kotlin.Any = apiInstance.youtubeContentRegions()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling YouTubeApi#youtubeContentRegions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling YouTubeApi#youtubeContentRegions")
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

<a id="youtubeGetACommunityPost"></a>
# **youtubeGetACommunityPost**
> kotlin.Any youtubeGetACommunityPost(postId)

Get a community post

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = YouTubeApi()
val postId : kotlin.String = postId_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.youtubeGetACommunityPost(postId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling YouTubeApi#youtubeGetACommunityPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling YouTubeApi#youtubeGetACommunityPost")
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

<a id="youtubeGetAMixRadioQueue"></a>
# **youtubeGetAMixRadioQueue**
> kotlin.Any youtubeGetAMixRadioQueue(playlistId)

Get a mix / radio queue

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = YouTubeApi()
val playlistId : kotlin.String = playlistId_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.youtubeGetAMixRadioQueue(playlistId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling YouTubeApi#youtubeGetAMixRadioQueue")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling YouTubeApi#youtubeGetAMixRadioQueue")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **playlistId** | **kotlin.String**|  | |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="youtubeGetAShort"></a>
# **youtubeGetAShort**
> kotlin.Any youtubeGetAShort(videoId)

Get a Short

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = YouTubeApi()
val videoId : kotlin.String = videoId_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.youtubeGetAShort(videoId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling YouTubeApi#youtubeGetAShort")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling YouTubeApi#youtubeGetAShort")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **videoId** | **kotlin.String**|  | |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="youtubeGetChannelDetail"></a>
# **youtubeGetChannelDetail**
> kotlin.Any youtubeGetChannelDetail(channelId, gl, hl)

Get channel detail

Channel detail (accepts a UC id, @handle, or custom URL).

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = YouTubeApi()
val channelId : kotlin.String = channelId_example // kotlin.String | 
val gl : kotlin.String = gl_example // kotlin.String | 
val hl : kotlin.String = hl_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.youtubeGetChannelDetail(channelId, gl, hl)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling YouTubeApi#youtubeGetChannelDetail")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling YouTubeApi#youtubeGetChannelDetail")
    e.printStackTrace()
}
```

### Parameters
| **channelId** | **kotlin.String**|  | |
| **gl** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **hl** | **kotlin.String**|  | [optional] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="youtubeGetPlaylistDetail"></a>
# **youtubeGetPlaylistDetail**
> kotlin.Any youtubeGetPlaylistDetail(playlistId)

Get playlist detail

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = YouTubeApi()
val playlistId : kotlin.String = playlistId_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.youtubeGetPlaylistDetail(playlistId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling YouTubeApi#youtubeGetPlaylistDetail")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling YouTubeApi#youtubeGetPlaylistDetail")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **playlistId** | **kotlin.String**|  | |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="youtubeGetVideoDetail"></a>
# **youtubeGetVideoDetail**
> kotlin.Any youtubeGetVideoDetail(videoId, gl, hl)

Get video detail

Full video detail — merged player + next (likes, comments, chapters, related).

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = YouTubeApi()
val videoId : kotlin.String = videoId_example // kotlin.String | 
val gl : kotlin.String = gl_example // kotlin.String | 
val hl : kotlin.String = hl_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.youtubeGetVideoDetail(videoId, gl, hl)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling YouTubeApi#youtubeGetVideoDetail")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling YouTubeApi#youtubeGetVideoDetail")
    e.printStackTrace()
}
```

### Parameters
| **videoId** | **kotlin.String**|  | |
| **gl** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **hl** | **kotlin.String**|  | [optional] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="youtubeGuestHomeFeed"></a>
# **youtubeGuestHomeFeed**
> kotlin.Any youtubeGuestHomeFeed()

Guest home feed

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = YouTubeApi()
try {
    val result : kotlin.Any = apiInstance.youtubeGuestHomeFeed()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling YouTubeApi#youtubeGuestHomeFeed")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling YouTubeApi#youtubeGuestHomeFeed")
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

<a id="youtubeKeywordSuggestions"></a>
# **youtubeKeywordSuggestions**
> kotlin.Any youtubeKeywordSuggestions(query, gl, hl)

Keyword suggestions

Return YouTube keyword autocomplete suggestions.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = YouTubeApi()
val query : kotlin.String = query_example // kotlin.String | Partial query prefix
val gl : kotlin.String = gl_example // kotlin.String | 
val hl : kotlin.String = hl_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.youtubeKeywordSuggestions(query, gl, hl)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling YouTubeApi#youtubeKeywordSuggestions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling YouTubeApi#youtubeKeywordSuggestions")
    e.printStackTrace()
}
```

### Parameters
| **query** | **kotlin.String**| Partial query prefix | |
| **gl** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **hl** | **kotlin.String**|  | [optional] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="youtubeListCaptionTracks"></a>
# **youtubeListCaptionTracks**
> kotlin.Any youtubeListCaptionTracks(videoId)

List caption tracks

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = YouTubeApi()
val videoId : kotlin.String = videoId_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.youtubeListCaptionTracks(videoId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling YouTubeApi#youtubeListCaptionTracks")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling YouTubeApi#youtubeListCaptionTracks")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **videoId** | **kotlin.String**|  | |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="youtubeLiveChatMessages"></a>
# **youtubeLiveChatMessages**
> kotlin.Any youtubeLiveChatMessages(videoId, continuation, replay)

Live chat messages

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = YouTubeApi()
val videoId : kotlin.String = videoId_example // kotlin.String | 
val continuation : kotlin.String = continuation_example // kotlin.String | 
val replay : kotlin.Boolean = true // kotlin.Boolean | 
try {
    val result : kotlin.Any = apiInstance.youtubeLiveChatMessages(videoId, continuation, replay)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling YouTubeApi#youtubeLiveChatMessages")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling YouTubeApi#youtubeLiveChatMessages")
    e.printStackTrace()
}
```

### Parameters
| **videoId** | **kotlin.String**|  | |
| **continuation** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **replay** | **kotlin.Boolean**|  | [optional] [default to false] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="youtubeOembedMetadata"></a>
# **youtubeOembedMetadata**
> kotlin.Any youtubeOembedMetadata(url)

oEmbed metadata

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = YouTubeApi()
val url : kotlin.String = url_example // kotlin.String | A YouTube URL
try {
    val result : kotlin.Any = apiInstance.youtubeOembedMetadata(url)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling YouTubeApi#youtubeOembedMetadata")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling YouTubeApi#youtubeOembedMetadata")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **url** | **kotlin.String**| A YouTube URL | |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="youtubePlaylistItemsPage"></a>
# **youtubePlaylistItemsPage**
> kotlin.Any youtubePlaylistItemsPage(playlistId)

Playlist items page

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = YouTubeApi()
val playlistId : kotlin.String = playlistId_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.youtubePlaylistItemsPage(playlistId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling YouTubeApi#youtubePlaylistItemsPage")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling YouTubeApi#youtubePlaylistItemsPage")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **playlistId** | **kotlin.String**|  | |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="youtubeRelatedVideos"></a>
# **youtubeRelatedVideos**
> kotlin.Any youtubeRelatedVideos(videoId)

Related videos

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = YouTubeApi()
val videoId : kotlin.String = videoId_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.youtubeRelatedVideos(videoId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling YouTubeApi#youtubeRelatedVideos")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling YouTubeApi#youtubeRelatedVideos")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **videoId** | **kotlin.String**|  | |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="youtubeResolveHandleUrlToId"></a>
# **youtubeResolveHandleUrlToId**
> kotlin.Any youtubeResolveHandleUrlToId(handle, url)

Resolve handle/URL to id

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = YouTubeApi()
val handle : kotlin.String = handle_example // kotlin.String | 
val url : kotlin.String = url_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.youtubeResolveHandleUrlToId(handle, url)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling YouTubeApi#youtubeResolveHandleUrlToId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling YouTubeApi#youtubeResolveHandleUrlToId")
    e.printStackTrace()
}
```

### Parameters
| **handle** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **url** | **kotlin.String**|  | [optional] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="youtubeSearchWithinAChannel"></a>
# **youtubeSearchWithinAChannel**
> kotlin.Any youtubeSearchWithinAChannel(channelId, query)

Search within a channel

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = YouTubeApi()
val channelId : kotlin.String = channelId_example // kotlin.String | 
val query : kotlin.String = query_example // kotlin.String | Search keywords
try {
    val result : kotlin.Any = apiInstance.youtubeSearchWithinAChannel(channelId, query)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling YouTubeApi#youtubeSearchWithinAChannel")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling YouTubeApi#youtubeSearchWithinAChannel")
    e.printStackTrace()
}
```

### Parameters
| **channelId** | **kotlin.String**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **query** | **kotlin.String**| Search keywords | |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="youtubeSearchYoutube"></a>
# **youtubeSearchYoutube**
> kotlin.Any youtubeSearchYoutube(query, type, sortBy, uploadDate, duration, features, gl, hl, continuation)

Search YouTube

Search videos / channels / playlists with the full filter matrix.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = YouTubeApi()
val query : kotlin.String = query_example // kotlin.String | Search keywords
val type : kotlin.String = type_example // kotlin.String | video|channel|playlist|movie|all
val sortBy : kotlin.String = sortBy_example // kotlin.String | relevance|date|views|rating
val uploadDate : kotlin.String = uploadDate_example // kotlin.String | hour|today|week|month|year
val duration : kotlin.String = duration_example // kotlin.String | short|medium|long
val features : kotlin.String = features_example // kotlin.String | hd,4k,360,vr180,3d,hdr,cc,subtitles,live
val gl : kotlin.String = gl_example // kotlin.String | Content region (US, GB, DE…)
val hl : kotlin.String = hl_example // kotlin.String | UI language
val continuation : kotlin.String = continuation_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.youtubeSearchYoutube(query, type, sortBy, uploadDate, duration, features, gl, hl, continuation)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling YouTubeApi#youtubeSearchYoutube")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling YouTubeApi#youtubeSearchYoutube")
    e.printStackTrace()
}
```

### Parameters
| **query** | **kotlin.String**| Search keywords | |
| **type** | **kotlin.String**| video|channel|playlist|movie|all | [optional] |
| **sortBy** | **kotlin.String**| relevance|date|views|rating | [optional] |
| **uploadDate** | **kotlin.String**| hour|today|week|month|year | [optional] |
| **duration** | **kotlin.String**| short|medium|long | [optional] |
| **features** | **kotlin.String**| hd,4k,360,vr180,3d,hdr,cc,subtitles,live | [optional] |
| **gl** | **kotlin.String**| Content region (US, GB, DE…) | [optional] |
| **hl** | **kotlin.String**| UI language | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **continuation** | **kotlin.String**|  | [optional] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="youtubeSearchYoutubeMusic"></a>
# **youtubeSearchYoutubeMusic**
> kotlin.Any youtubeSearchYoutubeMusic(query)

Search YouTube Music

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = YouTubeApi()
val query : kotlin.String = query_example // kotlin.String | Search keywords
try {
    val result : kotlin.Any = apiInstance.youtubeSearchYoutubeMusic(query)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling YouTubeApi#youtubeSearchYoutubeMusic")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling YouTubeApi#youtubeSearchYoutubeMusic")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **query** | **kotlin.String**| Search keywords | |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="youtubeShortsBySound"></a>
# **youtubeShortsBySound**
> kotlin.Any youtubeShortsBySound(soundId)

Shorts by sound

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = YouTubeApi()
val soundId : kotlin.String = soundId_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.youtubeShortsBySound(soundId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling YouTubeApi#youtubeShortsBySound")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling YouTubeApi#youtubeShortsBySound")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **soundId** | **kotlin.String**|  | |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="youtubeStreamFormats"></a>
# **youtubeStreamFormats**
> kotlin.Any youtubeStreamFormats(videoId, client)

Stream formats

Stream/format metadata (best-effort; media URLs may be PO-token gated).

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = YouTubeApi()
val videoId : kotlin.String = videoId_example // kotlin.String | 
val client : kotlin.String = client_example // kotlin.String | IOS|ANDROID|WEB
try {
    val result : kotlin.Any = apiInstance.youtubeStreamFormats(videoId, client)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling YouTubeApi#youtubeStreamFormats")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling YouTubeApi#youtubeStreamFormats")
    e.printStackTrace()
}
```

### Parameters
| **videoId** | **kotlin.String**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **client** | **kotlin.String**| IOS|ANDROID|WEB | [optional] [default to &quot;IOS&quot;] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="youtubeSubscriberCountFast"></a>
# **youtubeSubscriberCountFast**
> kotlin.Any youtubeSubscriberCountFast(channelId)

Subscriber count (fast)

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = YouTubeApi()
val channelId : kotlin.String = channelId_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.youtubeSubscriberCountFast(channelId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling YouTubeApi#youtubeSubscriberCountFast")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling YouTubeApi#youtubeSubscriberCountFast")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **channelId** | **kotlin.String**|  | |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="youtubeSupportedMarkets"></a>
# **youtubeSupportedMarkets**
> kotlin.Any youtubeSupportedMarkets()

Supported markets

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = YouTubeApi()
try {
    val result : kotlin.Any = apiInstance.youtubeSupportedMarkets()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling YouTubeApi#youtubeSupportedMarkets")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling YouTubeApi#youtubeSupportedMarkets")
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

<a id="youtubeTrendingShorts"></a>
# **youtubeTrendingShorts**
> kotlin.Any youtubeTrendingShorts()

Trending shorts

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = YouTubeApi()
try {
    val result : kotlin.Any = apiInstance.youtubeTrendingShorts()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling YouTubeApi#youtubeTrendingShorts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling YouTubeApi#youtubeTrendingShorts")
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

<a id="youtubeTrendingVideos"></a>
# **youtubeTrendingVideos**
> kotlin.Any youtubeTrendingVideos(gl, type)

Trending videos

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = YouTubeApi()
val gl : kotlin.String = gl_example // kotlin.String | 
val type : kotlin.String = type_example // kotlin.String | now|music|gaming|movies
try {
    val result : kotlin.Any = apiInstance.youtubeTrendingVideos(gl, type)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling YouTubeApi#youtubeTrendingVideos")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling YouTubeApi#youtubeTrendingVideos")
    e.printStackTrace()
}
```

### Parameters
| **gl** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **type** | **kotlin.String**| now|music|gaming|movies | [optional] [default to &quot;now&quot;] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="youtubeUiLanguages"></a>
# **youtubeUiLanguages**
> kotlin.Any youtubeUiLanguages()

UI languages

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = YouTubeApi()
try {
    val result : kotlin.Any = apiInstance.youtubeUiLanguages()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling YouTubeApi#youtubeUiLanguages")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling YouTubeApi#youtubeUiLanguages")
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

<a id="youtubeVideoCategories"></a>
# **youtubeVideoCategories**
> kotlin.Any youtubeVideoCategories(gl)

Video categories

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = YouTubeApi()
val gl : kotlin.String = gl_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.youtubeVideoCategories(gl)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling YouTubeApi#youtubeVideoCategories")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling YouTubeApi#youtubeVideoCategories")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **gl** | **kotlin.String**|  | [optional] [default to &quot;US&quot;] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="youtubeVideoComments"></a>
# **youtubeVideoComments**
> kotlin.Any youtubeVideoComments(videoId, sortBy, continuation)

Video comments

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = YouTubeApi()
val videoId : kotlin.String = videoId_example // kotlin.String | 
val sortBy : kotlin.String = sortBy_example // kotlin.String | top|newest
val continuation : kotlin.String = continuation_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.youtubeVideoComments(videoId, sortBy, continuation)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling YouTubeApi#youtubeVideoComments")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling YouTubeApi#youtubeVideoComments")
    e.printStackTrace()
}
```

### Parameters
| **videoId** | **kotlin.String**|  | |
| **sortBy** | **kotlin.String**| top|newest | [optional] [default to &quot;top&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **continuation** | **kotlin.String**|  | [optional] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="youtubeVideoTranscript"></a>
# **youtubeVideoTranscript**
> kotlin.Any youtubeVideoTranscript(videoId, language)

Video transcript

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = YouTubeApi()
val videoId : kotlin.String = videoId_example // kotlin.String | 
val language : kotlin.String = language_example // kotlin.String | BCP-47 language code
try {
    val result : kotlin.Any = apiInstance.youtubeVideoTranscript(videoId, language)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling YouTubeApi#youtubeVideoTranscript")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling YouTubeApi#youtubeVideoTranscript")
    e.printStackTrace()
}
```

### Parameters
| **videoId** | **kotlin.String**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **language** | **kotlin.String**| BCP-47 language code | [optional] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="youtubeVideosUnderAHashtag"></a>
# **youtubeVideosUnderAHashtag**
> kotlin.Any youtubeVideosUnderAHashtag(tag)

Videos under a hashtag

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = YouTubeApi()
val tag : kotlin.String = tag_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.youtubeVideosUnderAHashtag(tag)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling YouTubeApi#youtubeVideosUnderAHashtag")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling YouTubeApi#youtubeVideosUnderAHashtag")
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

<a id="youtubeYoutubeScraperHealthCheck"></a>
# **youtubeYoutubeScraperHealthCheck**
> kotlin.Any youtubeYoutubeScraperHealthCheck()

YouTube scraper health check

Check health of the YouTube scraper service (accepts HEAD for UptimeRobot).

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = YouTubeApi()
try {
    val result : kotlin.Any = apiInstance.youtubeYoutubeScraperHealthCheck()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling YouTubeApi#youtubeYoutubeScraperHealthCheck")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling YouTubeApi#youtubeYoutubeScraperHealthCheck")
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

<a id="youtubeYoutubeScraperHealthCheckHead"></a>
# **youtubeYoutubeScraperHealthCheckHead**
> kotlin.Any youtubeYoutubeScraperHealthCheckHead()

YouTube scraper health check

Check health of the YouTube scraper service (accepts HEAD for UptimeRobot).

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = YouTubeApi()
try {
    val result : kotlin.Any = apiInstance.youtubeYoutubeScraperHealthCheckHead()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling YouTubeApi#youtubeYoutubeScraperHealthCheckHead")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling YouTubeApi#youtubeYoutubeScraperHealthCheckHead")
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

