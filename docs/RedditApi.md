# RedditApi

All URIs are relative to *https://scrapebadger.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**redditGetCrossPosts**](RedditApi.md#redditGetCrossPosts) | **GET** /v1/reddit/posts/{post_id}/duplicates | Get cross-posts |
| [**redditGetPostComments**](RedditApi.md#redditGetPostComments) | **GET** /v1/reddit/posts/{post_id}/comments | Get post comments |
| [**redditGetPostDetail**](RedditApi.md#redditGetPostDetail) | **GET** /v1/reddit/posts/{post_id} | Get post detail |
| [**redditGetPostsByDomain**](RedditApi.md#redditGetPostsByDomain) | **GET** /v1/reddit/domains/{domain}/posts | Get posts by domain |
| [**redditGetSubredditInfo**](RedditApi.md#redditGetSubredditInfo) | **GET** /v1/reddit/subreddits/{subreddit} | Get subreddit info |
| [**redditGetSubredditPosts**](RedditApi.md#redditGetSubredditPosts) | **GET** /v1/reddit/subreddits/{subreddit}/posts | Get subreddit posts |
| [**redditGetSubredditRules**](RedditApi.md#redditGetSubredditRules) | **GET** /v1/reddit/subreddits/{subreddit}/rules | Get subreddit rules |
| [**redditGetTrendingPosts**](RedditApi.md#redditGetTrendingPosts) | **GET** /v1/reddit/posts/trending | Get trending posts |
| [**redditGetUserProfile**](RedditApi.md#redditGetUserProfile) | **GET** /v1/reddit/users/{username} | Get user profile |
| [**redditGetUserSComments**](RedditApi.md#redditGetUserSComments) | **GET** /v1/reddit/users/{username}/comments | Get user&#39;s comments |
| [**redditGetUserSModeratedSubreddits**](RedditApi.md#redditGetUserSModeratedSubreddits) | **GET** /v1/reddit/users/{username}/moderated | Get user&#39;s moderated subreddits |
| [**redditGetUserSPosts**](RedditApi.md#redditGetUserSPosts) | **GET** /v1/reddit/users/{username}/posts | Get user&#39;s posts |
| [**redditGetUserSTrophies**](RedditApi.md#redditGetUserSTrophies) | **GET** /v1/reddit/users/{username}/trophies | Get user&#39;s trophies |
| [**redditGetWikiPageContent**](RedditApi.md#redditGetWikiPageContent) | **GET** /v1/reddit/subreddits/{subreddit}/wiki/{page} | Get wiki page content |
| [**redditListWikiPages**](RedditApi.md#redditListWikiPages) | **GET** /v1/reddit/subreddits/{subreddit}/wiki | List wiki pages |
| [**redditNewSubreddits**](RedditApi.md#redditNewSubreddits) | **GET** /v1/reddit/subreddits/new | New subreddits |
| [**redditPopularSubreddits**](RedditApi.md#redditPopularSubreddits) | **GET** /v1/reddit/subreddits/popular | Popular subreddits |
| [**redditRedditScraperHealthCheck**](RedditApi.md#redditRedditScraperHealthCheck) | **GET** /v1/reddit/health | Reddit scraper health check |
| [**redditRedditScraperHealthCheckHead**](RedditApi.md#redditRedditScraperHealthCheckHead) | **HEAD** /v1/reddit/health | Reddit scraper health check |
| [**redditSearchRedditPosts**](RedditApi.md#redditSearchRedditPosts) | **GET** /v1/reddit/search/posts | Search Reddit posts |
| [**redditSearchSubreddits**](RedditApi.md#redditSearchSubreddits) | **GET** /v1/reddit/search/subreddits | Search subreddits |
| [**redditSearchUsers**](RedditApi.md#redditSearchUsers) | **GET** /v1/reddit/search/users | Search users |


<a id="redditGetCrossPosts"></a>
# **redditGetCrossPosts**
> kotlin.Any redditGetCrossPosts(postId, limit, after)

Get cross-posts

Get cross-posts and duplicates of a Reddit post.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = RedditApi()
val postId : kotlin.String = postId_example // kotlin.String | 
val limit : kotlin.Int = 56 // kotlin.Int | 
val after : kotlin.String = after_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.redditGetCrossPosts(postId, limit, after)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RedditApi#redditGetCrossPosts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RedditApi#redditGetCrossPosts")
    e.printStackTrace()
}
```

### Parameters
| **postId** | **kotlin.String**|  | |
| **limit** | **kotlin.Int**|  | [optional] [default to 25] |
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

<a id="redditGetPostComments"></a>
# **redditGetPostComments**
> kotlin.Any redditGetPostComments(postId, sort, limit, depth)

Get post comments

Get comment tree for a Reddit post.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = RedditApi()
val postId : kotlin.String = postId_example // kotlin.String | 
val sort : kotlin.String = sort_example // kotlin.String | Sort: confidence, top, new, controversial, old, qa
val limit : kotlin.Int = 56 // kotlin.Int | 
val depth : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.Any = apiInstance.redditGetPostComments(postId, sort, limit, depth)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RedditApi#redditGetPostComments")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RedditApi#redditGetPostComments")
    e.printStackTrace()
}
```

### Parameters
| **postId** | **kotlin.String**|  | |
| **sort** | **kotlin.String**| Sort: confidence, top, new, controversial, old, qa | [optional] [default to &quot;confidence&quot;] |
| **limit** | **kotlin.Int**|  | [optional] [default to 25] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **depth** | **kotlin.Int**|  | [optional] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="redditGetPostDetail"></a>
# **redditGetPostDetail**
> kotlin.Any redditGetPostDetail(postId)

Get post detail

Get detailed information about a Reddit post.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = RedditApi()
val postId : kotlin.String = postId_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.redditGetPostDetail(postId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RedditApi#redditGetPostDetail")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RedditApi#redditGetPostDetail")
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

<a id="redditGetPostsByDomain"></a>
# **redditGetPostsByDomain**
> kotlin.Any redditGetPostsByDomain(domain, sort, t, limit, after)

Get posts by domain

Get Reddit posts linking to a specific domain.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = RedditApi()
val domain : kotlin.String = domain_example // kotlin.String | 
val sort : kotlin.String = sort_example // kotlin.String | 
val t : kotlin.String = t_example // kotlin.String | 
val limit : kotlin.Int = 56 // kotlin.Int | 
val after : kotlin.String = after_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.redditGetPostsByDomain(domain, sort, t, limit, after)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RedditApi#redditGetPostsByDomain")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RedditApi#redditGetPostsByDomain")
    e.printStackTrace()
}
```

### Parameters
| **domain** | **kotlin.String**|  | |
| **sort** | **kotlin.String**|  | [optional] [default to &quot;hot&quot;] |
| **t** | **kotlin.String**|  | [optional] [default to &quot;all&quot;] |
| **limit** | **kotlin.Int**|  | [optional] [default to 25] |
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

<a id="redditGetSubredditInfo"></a>
# **redditGetSubredditInfo**
> kotlin.Any redditGetSubredditInfo(subreddit)

Get subreddit info

Get detailed information about a subreddit.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = RedditApi()
val subreddit : kotlin.String = subreddit_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.redditGetSubredditInfo(subreddit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RedditApi#redditGetSubredditInfo")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RedditApi#redditGetSubredditInfo")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **subreddit** | **kotlin.String**|  | |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="redditGetSubredditPosts"></a>
# **redditGetSubredditPosts**
> kotlin.Any redditGetSubredditPosts(subreddit, sort, t, limit, after)

Get subreddit posts

Get posts from a subreddit with sorting options.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = RedditApi()
val subreddit : kotlin.String = subreddit_example // kotlin.String | 
val sort : kotlin.String = sort_example // kotlin.String | Sort: hot, new, top, rising, controversial
val t : kotlin.String = t_example // kotlin.String | Time filter
val limit : kotlin.Int = 56 // kotlin.Int | 
val after : kotlin.String = after_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.redditGetSubredditPosts(subreddit, sort, t, limit, after)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RedditApi#redditGetSubredditPosts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RedditApi#redditGetSubredditPosts")
    e.printStackTrace()
}
```

### Parameters
| **subreddit** | **kotlin.String**|  | |
| **sort** | **kotlin.String**| Sort: hot, new, top, rising, controversial | [optional] [default to &quot;hot&quot;] |
| **t** | **kotlin.String**| Time filter | [optional] [default to &quot;all&quot;] |
| **limit** | **kotlin.Int**|  | [optional] [default to 25] |
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

<a id="redditGetSubredditRules"></a>
# **redditGetSubredditRules**
> kotlin.Any redditGetSubredditRules(subreddit)

Get subreddit rules

Get the rules of a subreddit.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = RedditApi()
val subreddit : kotlin.String = subreddit_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.redditGetSubredditRules(subreddit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RedditApi#redditGetSubredditRules")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RedditApi#redditGetSubredditRules")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **subreddit** | **kotlin.String**|  | |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="redditGetTrendingPosts"></a>
# **redditGetTrendingPosts**
> kotlin.Any redditGetTrendingPosts(sort, t, limit, after)

Get trending posts

Get trending posts from Reddit&#39;s front page.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = RedditApi()
val sort : kotlin.String = sort_example // kotlin.String | Sort: hot, new, top, rising, controversial, best
val t : kotlin.String = t_example // kotlin.String | Time filter
val limit : kotlin.Int = 56 // kotlin.Int | 
val after : kotlin.String = after_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.redditGetTrendingPosts(sort, t, limit, after)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RedditApi#redditGetTrendingPosts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RedditApi#redditGetTrendingPosts")
    e.printStackTrace()
}
```

### Parameters
| **sort** | **kotlin.String**| Sort: hot, new, top, rising, controversial, best | [optional] [default to &quot;hot&quot;] |
| **t** | **kotlin.String**| Time filter | [optional] [default to &quot;day&quot;] |
| **limit** | **kotlin.Int**|  | [optional] [default to 25] |
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

<a id="redditGetUserProfile"></a>
# **redditGetUserProfile**
> kotlin.Any redditGetUserProfile(username)

Get user profile

Get a Reddit user&#39;s profile.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = RedditApi()
val username : kotlin.String = username_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.redditGetUserProfile(username)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RedditApi#redditGetUserProfile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RedditApi#redditGetUserProfile")
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

<a id="redditGetUserSComments"></a>
# **redditGetUserSComments**
> kotlin.Any redditGetUserSComments(username, sort, t, limit, after)

Get user&#39;s comments

Get comments by a Reddit user.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = RedditApi()
val username : kotlin.String = username_example // kotlin.String | 
val sort : kotlin.String = sort_example // kotlin.String | 
val t : kotlin.String = t_example // kotlin.String | 
val limit : kotlin.Int = 56 // kotlin.Int | 
val after : kotlin.String = after_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.redditGetUserSComments(username, sort, t, limit, after)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RedditApi#redditGetUserSComments")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RedditApi#redditGetUserSComments")
    e.printStackTrace()
}
```

### Parameters
| **username** | **kotlin.String**|  | |
| **sort** | **kotlin.String**|  | [optional] [default to &quot;new&quot;] |
| **t** | **kotlin.String**|  | [optional] [default to &quot;all&quot;] |
| **limit** | **kotlin.Int**|  | [optional] [default to 25] |
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

<a id="redditGetUserSModeratedSubreddits"></a>
# **redditGetUserSModeratedSubreddits**
> kotlin.Any redditGetUserSModeratedSubreddits(username)

Get user&#39;s moderated subreddits

Get subreddits moderated by a user.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = RedditApi()
val username : kotlin.String = username_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.redditGetUserSModeratedSubreddits(username)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RedditApi#redditGetUserSModeratedSubreddits")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RedditApi#redditGetUserSModeratedSubreddits")
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

<a id="redditGetUserSPosts"></a>
# **redditGetUserSPosts**
> kotlin.Any redditGetUserSPosts(username, sort, t, limit, after)

Get user&#39;s posts

Get posts submitted by a Reddit user.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = RedditApi()
val username : kotlin.String = username_example // kotlin.String | 
val sort : kotlin.String = sort_example // kotlin.String | 
val t : kotlin.String = t_example // kotlin.String | 
val limit : kotlin.Int = 56 // kotlin.Int | 
val after : kotlin.String = after_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.redditGetUserSPosts(username, sort, t, limit, after)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RedditApi#redditGetUserSPosts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RedditApi#redditGetUserSPosts")
    e.printStackTrace()
}
```

### Parameters
| **username** | **kotlin.String**|  | |
| **sort** | **kotlin.String**|  | [optional] [default to &quot;new&quot;] |
| **t** | **kotlin.String**|  | [optional] [default to &quot;all&quot;] |
| **limit** | **kotlin.Int**|  | [optional] [default to 25] |
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

<a id="redditGetUserSTrophies"></a>
# **redditGetUserSTrophies**
> kotlin.Any redditGetUserSTrophies(username)

Get user&#39;s trophies

Get a user&#39;s trophy case.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = RedditApi()
val username : kotlin.String = username_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.redditGetUserSTrophies(username)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RedditApi#redditGetUserSTrophies")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RedditApi#redditGetUserSTrophies")
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

<a id="redditGetWikiPageContent"></a>
# **redditGetWikiPageContent**
> kotlin.Any redditGetWikiPageContent(subreddit, page)

Get wiki page content

Get the content of a specific wiki page.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = RedditApi()
val subreddit : kotlin.String = subreddit_example // kotlin.String | 
val page : kotlin.String = page_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.redditGetWikiPageContent(subreddit, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RedditApi#redditGetWikiPageContent")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RedditApi#redditGetWikiPageContent")
    e.printStackTrace()
}
```

### Parameters
| **subreddit** | **kotlin.String**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **page** | **kotlin.String**|  | |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="redditListWikiPages"></a>
# **redditListWikiPages**
> kotlin.Any redditListWikiPages(subreddit)

List wiki pages

List all wiki pages in a subreddit.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = RedditApi()
val subreddit : kotlin.String = subreddit_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.redditListWikiPages(subreddit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RedditApi#redditListWikiPages")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RedditApi#redditListWikiPages")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **subreddit** | **kotlin.String**|  | |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="redditNewSubreddits"></a>
# **redditNewSubreddits**
> kotlin.Any redditNewSubreddits(limit, after)

New subreddits

Get recently created subreddits.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = RedditApi()
val limit : kotlin.Int = 56 // kotlin.Int | 
val after : kotlin.String = after_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.redditNewSubreddits(limit, after)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RedditApi#redditNewSubreddits")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RedditApi#redditNewSubreddits")
    e.printStackTrace()
}
```

### Parameters
| **limit** | **kotlin.Int**|  | [optional] [default to 25] |
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

<a id="redditPopularSubreddits"></a>
# **redditPopularSubreddits**
> kotlin.Any redditPopularSubreddits(limit, after)

Popular subreddits

Get popular subreddits by subscriber count.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = RedditApi()
val limit : kotlin.Int = 56 // kotlin.Int | 
val after : kotlin.String = after_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.redditPopularSubreddits(limit, after)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RedditApi#redditPopularSubreddits")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RedditApi#redditPopularSubreddits")
    e.printStackTrace()
}
```

### Parameters
| **limit** | **kotlin.Int**|  | [optional] [default to 25] |
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

<a id="redditRedditScraperHealthCheck"></a>
# **redditRedditScraperHealthCheck**
> kotlin.Any redditRedditScraperHealthCheck()

Reddit scraper health check

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = RedditApi()
try {
    val result : kotlin.Any = apiInstance.redditRedditScraperHealthCheck()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RedditApi#redditRedditScraperHealthCheck")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RedditApi#redditRedditScraperHealthCheck")
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

<a id="redditRedditScraperHealthCheckHead"></a>
# **redditRedditScraperHealthCheckHead**
> kotlin.Any redditRedditScraperHealthCheckHead()

Reddit scraper health check

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = RedditApi()
try {
    val result : kotlin.Any = apiInstance.redditRedditScraperHealthCheckHead()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RedditApi#redditRedditScraperHealthCheckHead")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RedditApi#redditRedditScraperHealthCheckHead")
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

<a id="redditSearchRedditPosts"></a>
# **redditSearchRedditPosts**
> kotlin.Any redditSearchRedditPosts(q, subreddit, sort, t, limit, after)

Search Reddit posts

Search Reddit posts globally or within a subreddit.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = RedditApi()
val q : kotlin.String = q_example // kotlin.String | Search query
val subreddit : kotlin.String = subreddit_example // kotlin.String | Restrict to subreddit
val sort : kotlin.String = sort_example // kotlin.String | Sort: relevance, hot, top, new, comments
val t : kotlin.String = t_example // kotlin.String | Time: hour, day, week, month, year, all
val limit : kotlin.Int = 56 // kotlin.Int | 
val after : kotlin.String = after_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.redditSearchRedditPosts(q, subreddit, sort, t, limit, after)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RedditApi#redditSearchRedditPosts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RedditApi#redditSearchRedditPosts")
    e.printStackTrace()
}
```

### Parameters
| **q** | **kotlin.String**| Search query | |
| **subreddit** | **kotlin.String**| Restrict to subreddit | [optional] |
| **sort** | **kotlin.String**| Sort: relevance, hot, top, new, comments | [optional] [default to &quot;relevance&quot;] |
| **t** | **kotlin.String**| Time: hour, day, week, month, year, all | [optional] [default to &quot;all&quot;] |
| **limit** | **kotlin.Int**|  | [optional] [default to 25] |
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

<a id="redditSearchSubreddits"></a>
# **redditSearchSubreddits**
> kotlin.Any redditSearchSubreddits(q, limit, after)

Search subreddits

Search for subreddits by keyword.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = RedditApi()
val q : kotlin.String = q_example // kotlin.String | Search query
val limit : kotlin.Int = 56 // kotlin.Int | 
val after : kotlin.String = after_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.redditSearchSubreddits(q, limit, after)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RedditApi#redditSearchSubreddits")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RedditApi#redditSearchSubreddits")
    e.printStackTrace()
}
```

### Parameters
| **q** | **kotlin.String**| Search query | |
| **limit** | **kotlin.Int**|  | [optional] [default to 25] |
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

<a id="redditSearchUsers"></a>
# **redditSearchUsers**
> kotlin.Any redditSearchUsers(q, limit, after)

Search users

Search for Reddit users.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = RedditApi()
val q : kotlin.String = q_example // kotlin.String | Search query
val limit : kotlin.Int = 56 // kotlin.Int | 
val after : kotlin.String = after_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.redditSearchUsers(q, limit, after)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RedditApi#redditSearchUsers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RedditApi#redditSearchUsers")
    e.printStackTrace()
}
```

### Parameters
| **q** | **kotlin.String**| Search query | |
| **limit** | **kotlin.Int**|  | [optional] [default to 25] |
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

