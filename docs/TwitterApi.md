# TwitterApi

All URIs are relative to *https://scrapebadger.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**twitterAdvancedTweetSearch**](TwitterApi.md#twitterAdvancedTweetSearch) | **GET** /v1/twitter/tweets/advanced_search | Advanced tweet search |
| [**twitterBatchGetUsersByIds**](TwitterApi.md#twitterBatchGetUsersByIds) | **GET** /v1/twitter/users/batch_by_ids | Batch get users by IDs |
| [**twitterBatchGetUsersByUsernames**](TwitterApi.md#twitterBatchGetUsersByUsernames) | **GET** /v1/twitter/users/batch_by_usernames | Batch get users by usernames |
| [**twitterConfigureWebhookOnAMonitor**](TwitterApi.md#twitterConfigureWebhookOnAMonitor) | **POST** /v1/twitter/stream/webhooks | Configure webhook on a monitor |
| [**twitterCreateFilterRule**](TwitterApi.md#twitterCreateFilterRule) | **POST** /v1/twitter/stream/filter-rules | Create filter rule |
| [**twitterCreateStreamMonitor**](TwitterApi.md#twitterCreateStreamMonitor) | **POST** /v1/twitter/stream/monitors | Create stream monitor |
| [**twitterDeleteFilterRule**](TwitterApi.md#twitterDeleteFilterRule) | **DELETE** /v1/twitter/stream/filter-rules/{rule_id} | Delete filter rule |
| [**twitterDeleteStreamMonitor**](TwitterApi.md#twitterDeleteStreamMonitor) | **DELETE** /v1/twitter/stream/monitors/{monitor_id} | Delete stream monitor |
| [**twitterGetArticleById**](TwitterApi.md#twitterGetArticleById) | **GET** /v1/twitter/tweets/article/{article_id} | Get article by ID |
| [**twitterGetBroadcastDetails**](TwitterApi.md#twitterGetBroadcastDetails) | **GET** /v1/twitter/spaces/broadcast/{broadcast_id} | Get broadcast details |
| [**twitterGetCommunityDetails**](TwitterApi.md#twitterGetCommunityDetails) | **GET** /v1/twitter/communities/{community_id} | Get community details |
| [**twitterGetCommunityNotes**](TwitterApi.md#twitterGetCommunityNotes) | **GET** /v1/twitter/tweets/tweet/{tweet_id}/community_notes | Get community notes |
| [**twitterGetCommunityTweets**](TwitterApi.md#twitterGetCommunityTweets) | **GET** /v1/twitter/communities/{community_id}/tweets | Get community tweets |
| [**twitterGetFilterRule**](TwitterApi.md#twitterGetFilterRule) | **GET** /v1/twitter/stream/filter-rules/{rule_id} | Get filter rule |
| [**twitterGetFilterRulePerPollRates**](TwitterApi.md#twitterGetFilterRulePerPollRates) | **GET** /v1/twitter/stream/filter-rules-pricing | Get filter rule per-poll rates |
| [**twitterGetListDetails**](TwitterApi.md#twitterGetListDetails) | **GET** /v1/twitter/lists/{list_id}/detail | Get list details |
| [**twitterGetListTweets**](TwitterApi.md#twitterGetListTweets) | **GET** /v1/twitter/lists/{list_id}/tweets | Get list tweets |
| [**twitterGetPlaceDetails**](TwitterApi.md#twitterGetPlaceDetails) | **GET** /v1/twitter/geo/places/{place_id} | Get place details |
| [**twitterGetSimilarTweets**](TwitterApi.md#twitterGetSimilarTweets) | **GET** /v1/twitter/tweets/tweet/{tweet_id}/similar | Get similar tweets |
| [**twitterGetSpaceDetails**](TwitterApi.md#twitterGetSpaceDetails) | **GET** /v1/twitter/spaces/{space_id} | Get Space details |
| [**twitterGetStreamMonitor**](TwitterApi.md#twitterGetStreamMonitor) | **GET** /v1/twitter/stream/monitors/{monitor_id} | Get stream monitor |
| [**twitterGetTrendingTopics**](TwitterApi.md#twitterGetTrendingTopics) | **GET** /v1/twitter/trends/ | Get trending topics |
| [**twitterGetTrendsByLocation**](TwitterApi.md#twitterGetTrendsByLocation) | **GET** /v1/twitter/trends/place/{woeid} | Get trends by location |
| [**twitterGetTweetDetails**](TwitterApi.md#twitterGetTweetDetails) | **GET** /v1/twitter/tweets/tweet/{tweet_id} | Get tweet details |
| [**twitterGetTweetEditHistory**](TwitterApi.md#twitterGetTweetEditHistory) | **GET** /v1/twitter/tweets/tweet/{tweet_id}/edit_history | Get tweet edit history |
| [**twitterGetTweetFavoriters**](TwitterApi.md#twitterGetTweetFavoriters) | **GET** /v1/twitter/tweets/tweet/{tweet_id}/favoriters | Get tweet favoriters |
| [**twitterGetTweetQuotes**](TwitterApi.md#twitterGetTweetQuotes) | **GET** /v1/twitter/tweets/tweet/{tweet_id}/quotes | Get tweet quotes |
| [**twitterGetTweetReplies**](TwitterApi.md#twitterGetTweetReplies) | **GET** /v1/twitter/tweets/tweet/{tweet_id}/replies | Get tweet replies |
| [**twitterGetTweetRetweeters**](TwitterApi.md#twitterGetTweetRetweeters) | **GET** /v1/twitter/tweets/tweet/{tweet_id}/retweeters | Get tweet retweeters |
| [**twitterGetTweetsByIds**](TwitterApi.md#twitterGetTweetsByIds) | **GET** /v1/twitter/tweets/ | Get tweets by IDs |
| [**twitterGetUserArticles**](TwitterApi.md#twitterGetUserArticles) | **GET** /v1/twitter/users/{user_id}/articles | Get user articles |
| [**twitterGetUserById**](TwitterApi.md#twitterGetUserById) | **GET** /v1/twitter/users/{user_id}/by_id | Get user by ID |
| [**twitterGetUserByUsername**](TwitterApi.md#twitterGetUserByUsername) | **GET** /v1/twitter/users/{username}/by_username | Get user by username |
| [**twitterGetUserFollowers**](TwitterApi.md#twitterGetUserFollowers) | **GET** /v1/twitter/users/{username}/followers | Get user followers |
| [**twitterGetUserFollowing**](TwitterApi.md#twitterGetUserFollowing) | **GET** /v1/twitter/users/{username}/followings | Get user following |
| [**twitterGetUserMentions**](TwitterApi.md#twitterGetUserMentions) | **GET** /v1/twitter/users/{username}/mentions | Get user mentions |
| [**twitterGetUserSubscriptions**](TwitterApi.md#twitterGetUserSubscriptions) | **GET** /v1/twitter/users/{user_id}/subscriptions | Get user subscriptions |
| [**twitterGetUserTweets**](TwitterApi.md#twitterGetUserTweets) | **GET** /v1/twitter/users/{username}/latest_tweets | Get user tweets |
| [**twitterListBillingLogs**](TwitterApi.md#twitterListBillingLogs) | **GET** /v1/twitter/stream/billing-logs | List billing logs |
| [**twitterListDeliveryLogsForAFilterRule**](TwitterApi.md#twitterListDeliveryLogsForAFilterRule) | **GET** /v1/twitter/stream/filter-rules/{rule_id}/logs | List delivery logs for a filter rule |
| [**twitterListFilterRules**](TwitterApi.md#twitterListFilterRules) | **GET** /v1/twitter/stream/filter-rules | List filter rules |
| [**twitterListStreamMonitors**](TwitterApi.md#twitterListStreamMonitors) | **GET** /v1/twitter/stream/monitors | List stream monitors |
| [**twitterListTweetDeliveryLogs**](TwitterApi.md#twitterListTweetDeliveryLogs) | **GET** /v1/twitter/stream/logs | List tweet delivery logs |
| [**twitterListWebhooks**](TwitterApi.md#twitterListWebhooks) | **GET** /v1/twitter/stream/webhooks | List webhooks |
| [**twitterRemoveWebhookFromMonitor**](TwitterApi.md#twitterRemoveWebhookFromMonitor) | **DELETE** /v1/twitter/stream/webhooks/{webhook_id} | Remove webhook from monitor |
| [**twitterSearchCommunities**](TwitterApi.md#twitterSearchCommunities) | **GET** /v1/twitter/communities/search | Search communities |
| [**twitterSearchListTweets**](TwitterApi.md#twitterSearchListTweets) | **GET** /v1/twitter/lists/{list_id}/search_tweets | Search list tweets |
| [**twitterSearchPlaces**](TwitterApi.md#twitterSearchPlaces) | **GET** /v1/twitter/geo/search | Search places |
| [**twitterSearchUsers**](TwitterApi.md#twitterSearchUsers) | **GET** /v1/twitter/users/search_users | Search users |
| [**twitterTestWebhookDelivery**](TwitterApi.md#twitterTestWebhookDelivery) | **POST** /v1/twitter/stream/webhooks/test | Test webhook delivery |
| [**twitterTwitterScraperHealthCheck**](TwitterApi.md#twitterTwitterScraperHealthCheck) | **GET** /v1/twitter/health | Twitter scraper health check |
| [**twitterTwitterScraperHealthCheckHead**](TwitterApi.md#twitterTwitterScraperHealthCheckHead) | **HEAD** /v1/twitter/health | Twitter scraper health check |
| [**twitterUpdateFilterRule**](TwitterApi.md#twitterUpdateFilterRule) | **PATCH** /v1/twitter/stream/filter-rules/{rule_id} | Update filter rule |
| [**twitterUpdateStreamMonitor**](TwitterApi.md#twitterUpdateStreamMonitor) | **PATCH** /v1/twitter/stream/monitors/{monitor_id} | Update stream monitor |
| [**twitterValidateSearchQuery**](TwitterApi.md#twitterValidateSearchQuery) | **POST** /v1/twitter/stream/filter-rules/validate | Validate search query |


<a id="twitterAdvancedTweetSearch"></a>
# **twitterAdvancedTweetSearch**
> kotlin.Any twitterAdvancedTweetSearch(query, queryType, count, cursor)

Advanced tweet search

Search tweets with advanced options.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = TwitterApi()
val query : kotlin.String = query_example // kotlin.String | 
val queryType : kotlin.String = queryType_example // kotlin.String | 
val count : kotlin.Int = 56 // kotlin.Int | 
val cursor : kotlin.String = cursor_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.twitterAdvancedTweetSearch(query, queryType, count, cursor)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TwitterApi#twitterAdvancedTweetSearch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TwitterApi#twitterAdvancedTweetSearch")
    e.printStackTrace()
}
```

### Parameters
| **query** | **kotlin.String**|  | |
| **queryType** | **kotlin.String**|  | [optional] |
| **count** | **kotlin.Int**|  | [optional] |
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

<a id="twitterBatchGetUsersByIds"></a>
# **twitterBatchGetUsersByIds**
> kotlin.Any twitterBatchGetUsersByIds(userIds)

Batch get users by IDs

Get multiple user profiles by their numeric IDs (comma-separated).

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = TwitterApi()
val userIds : kotlin.String = userIds_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.twitterBatchGetUsersByIds(userIds)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TwitterApi#twitterBatchGetUsersByIds")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TwitterApi#twitterBatchGetUsersByIds")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userIds** | **kotlin.String**|  | |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="twitterBatchGetUsersByUsernames"></a>
# **twitterBatchGetUsersByUsernames**
> kotlin.Any twitterBatchGetUsersByUsernames(usernames)

Batch get users by usernames

Get multiple user profiles by their usernames (comma-separated).

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = TwitterApi()
val usernames : kotlin.String = usernames_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.twitterBatchGetUsersByUsernames(usernames)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TwitterApi#twitterBatchGetUsersByUsernames")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TwitterApi#twitterBatchGetUsersByUsernames")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **usernames** | **kotlin.String**|  | |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="twitterConfigureWebhookOnAMonitor"></a>
# **twitterConfigureWebhookOnAMonitor**
> WebhookResponse twitterConfigureWebhookOnAMonitor(webhookCreate)

Configure webhook on a monitor

Configure a webhook delivery URL on a stream monitor.  The secret is returned only once on creation. Subsequent calls show secret_set: bool. If monitor already has a webhook, delete it first (409 is returned).

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = TwitterApi()
val webhookCreate : WebhookCreate =  // WebhookCreate | 
try {
    val result : WebhookResponse = apiInstance.twitterConfigureWebhookOnAMonitor(webhookCreate)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TwitterApi#twitterConfigureWebhookOnAMonitor")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TwitterApi#twitterConfigureWebhookOnAMonitor")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **webhookCreate** | [**WebhookCreate**](WebhookCreate.md)|  | |

### Return type

[**WebhookResponse**](WebhookResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="twitterCreateFilterRule"></a>
# **twitterCreateFilterRule**
> FilterRuleResponse twitterCreateFilterRule(filterRuleCreate)

Create filter rule

Create a new query-based tweet filter rule.  The rule starts in &#39;active&#39; status immediately. Credits must be positive. The (api_key_id, tag) pair must be unique.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = TwitterApi()
val filterRuleCreate : FilterRuleCreate =  // FilterRuleCreate | 
try {
    val result : FilterRuleResponse = apiInstance.twitterCreateFilterRule(filterRuleCreate)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TwitterApi#twitterCreateFilterRule")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TwitterApi#twitterCreateFilterRule")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **filterRuleCreate** | [**FilterRuleCreate**](FilterRuleCreate.md)|  | |

### Return type

[**FilterRuleResponse**](FilterRuleResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="twitterCreateStreamMonitor"></a>
# **twitterCreateStreamMonitor**
> StreamMonitorResponse twitterCreateStreamMonitor(streamMonitorCreate)

Create stream monitor

Create a new stream monitor to watch Twitter accounts in real-time.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = TwitterApi()
val streamMonitorCreate : StreamMonitorCreate =  // StreamMonitorCreate | 
try {
    val result : StreamMonitorResponse = apiInstance.twitterCreateStreamMonitor(streamMonitorCreate)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TwitterApi#twitterCreateStreamMonitor")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TwitterApi#twitterCreateStreamMonitor")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **streamMonitorCreate** | [**StreamMonitorCreate**](StreamMonitorCreate.md)|  | |

### Return type

[**StreamMonitorResponse**](StreamMonitorResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="twitterDeleteFilterRule"></a>
# **twitterDeleteFilterRule**
> twitterDeleteFilterRule(ruleId)

Delete filter rule

Delete a filter rule and all its logs.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = TwitterApi()
val ruleId : kotlin.String = ruleId_example // kotlin.String | 
try {
    apiInstance.twitterDeleteFilterRule(ruleId)
} catch (e: ClientException) {
    println("4xx response calling TwitterApi#twitterDeleteFilterRule")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TwitterApi#twitterDeleteFilterRule")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ruleId** | **kotlin.String**|  | |

### Return type

null (empty response body)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="twitterDeleteStreamMonitor"></a>
# **twitterDeleteStreamMonitor**
> twitterDeleteStreamMonitor(monitorId)

Delete stream monitor

Delete a stream monitor and all its logs.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = TwitterApi()
val monitorId : kotlin.String = monitorId_example // kotlin.String | 
try {
    apiInstance.twitterDeleteStreamMonitor(monitorId)
} catch (e: ClientException) {
    println("4xx response calling TwitterApi#twitterDeleteStreamMonitor")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TwitterApi#twitterDeleteStreamMonitor")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **monitorId** | **kotlin.String**|  | |

### Return type

null (empty response body)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="twitterGetArticleById"></a>
# **twitterGetArticleById**
> kotlin.Any twitterGetArticleById(articleId)

Get article by ID

Get a long-form article by its ID.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = TwitterApi()
val articleId : kotlin.String = articleId_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.twitterGetArticleById(articleId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TwitterApi#twitterGetArticleById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TwitterApi#twitterGetArticleById")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **articleId** | **kotlin.String**|  | |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="twitterGetBroadcastDetails"></a>
# **twitterGetBroadcastDetails**
> kotlin.Any twitterGetBroadcastDetails(broadcastId)

Get broadcast details

Get details of a live video broadcast.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = TwitterApi()
val broadcastId : kotlin.String = broadcastId_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.twitterGetBroadcastDetails(broadcastId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TwitterApi#twitterGetBroadcastDetails")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TwitterApi#twitterGetBroadcastDetails")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **broadcastId** | **kotlin.String**|  | |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="twitterGetCommunityDetails"></a>
# **twitterGetCommunityDetails**
> kotlin.Any twitterGetCommunityDetails(communityId)

Get community details

Get details of a specific community.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = TwitterApi()
val communityId : kotlin.String = communityId_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.twitterGetCommunityDetails(communityId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TwitterApi#twitterGetCommunityDetails")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TwitterApi#twitterGetCommunityDetails")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **communityId** | **kotlin.String**|  | |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="twitterGetCommunityNotes"></a>
# **twitterGetCommunityNotes**
> kotlin.Any twitterGetCommunityNotes(tweetId)

Get community notes

Get community notes (Birdwatch) for a specific tweet.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = TwitterApi()
val tweetId : kotlin.String = tweetId_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.twitterGetCommunityNotes(tweetId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TwitterApi#twitterGetCommunityNotes")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TwitterApi#twitterGetCommunityNotes")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tweetId** | **kotlin.String**|  | |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="twitterGetCommunityTweets"></a>
# **twitterGetCommunityTweets**
> kotlin.Any twitterGetCommunityTweets(communityId, tweetType, cursor)

Get community tweets

Get tweets from a specific community.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = TwitterApi()
val communityId : kotlin.String = communityId_example // kotlin.String | 
val tweetType : kotlin.String = tweetType_example // kotlin.String | 
val cursor : kotlin.String = cursor_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.twitterGetCommunityTweets(communityId, tweetType, cursor)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TwitterApi#twitterGetCommunityTweets")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TwitterApi#twitterGetCommunityTweets")
    e.printStackTrace()
}
```

### Parameters
| **communityId** | **kotlin.String**|  | |
| **tweetType** | **kotlin.String**|  | [optional] |
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

<a id="twitterGetFilterRule"></a>
# **twitterGetFilterRule**
> FilterRuleResponse twitterGetFilterRule(ruleId)

Get filter rule

Get a single filter rule by ID.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = TwitterApi()
val ruleId : kotlin.String = ruleId_example // kotlin.String | 
try {
    val result : FilterRuleResponse = apiInstance.twitterGetFilterRule(ruleId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TwitterApi#twitterGetFilterRule")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TwitterApi#twitterGetFilterRule")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ruleId** | **kotlin.String**|  | |

### Return type

[**FilterRuleResponse**](FilterRuleResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="twitterGetFilterRulePerPollRates"></a>
# **twitterGetFilterRulePerPollRates**
> PortalApiRoutersV1TwitterFilterRulesFilterRulePricingResponse twitterGetFilterRulePerPollRates()

Get filter rule per-poll rates

Current per-poll rates (auth required — used by SDK + dashboard).

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = TwitterApi()
try {
    val result : PortalApiRoutersV1TwitterFilterRulesFilterRulePricingResponse = apiInstance.twitterGetFilterRulePerPollRates()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TwitterApi#twitterGetFilterRulePerPollRates")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TwitterApi#twitterGetFilterRulePerPollRates")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**PortalApiRoutersV1TwitterFilterRulesFilterRulePricingResponse**](PortalApiRoutersV1TwitterFilterRulesFilterRulePricingResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="twitterGetListDetails"></a>
# **twitterGetListDetails**
> kotlin.Any twitterGetListDetails(listId)

Get list details

Get details of a specific list.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = TwitterApi()
val listId : kotlin.String = listId_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.twitterGetListDetails(listId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TwitterApi#twitterGetListDetails")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TwitterApi#twitterGetListDetails")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **listId** | **kotlin.String**|  | |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="twitterGetListTweets"></a>
# **twitterGetListTweets**
> kotlin.Any twitterGetListTweets(listId, cursor)

Get list tweets

Get tweets from a specific list.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = TwitterApi()
val listId : kotlin.String = listId_example // kotlin.String | 
val cursor : kotlin.String = cursor_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.twitterGetListTweets(listId, cursor)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TwitterApi#twitterGetListTweets")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TwitterApi#twitterGetListTweets")
    e.printStackTrace()
}
```

### Parameters
| **listId** | **kotlin.String**|  | |
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

<a id="twitterGetPlaceDetails"></a>
# **twitterGetPlaceDetails**
> kotlin.Any twitterGetPlaceDetails(placeId)

Get place details

Get details of a specific place.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = TwitterApi()
val placeId : kotlin.String = placeId_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.twitterGetPlaceDetails(placeId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TwitterApi#twitterGetPlaceDetails")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TwitterApi#twitterGetPlaceDetails")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **placeId** | **kotlin.String**|  | |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="twitterGetSimilarTweets"></a>
# **twitterGetSimilarTweets**
> kotlin.Any twitterGetSimilarTweets(tweetId)

Get similar tweets

Get tweets similar to a specific tweet.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = TwitterApi()
val tweetId : kotlin.String = tweetId_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.twitterGetSimilarTweets(tweetId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TwitterApi#twitterGetSimilarTweets")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TwitterApi#twitterGetSimilarTweets")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tweetId** | **kotlin.String**|  | |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="twitterGetSpaceDetails"></a>
# **twitterGetSpaceDetails**
> kotlin.Any twitterGetSpaceDetails(spaceId)

Get Space details

Get details of a Twitter Space.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = TwitterApi()
val spaceId : kotlin.String = spaceId_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.twitterGetSpaceDetails(spaceId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TwitterApi#twitterGetSpaceDetails")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TwitterApi#twitterGetSpaceDetails")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **spaceId** | **kotlin.String**|  | |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="twitterGetStreamMonitor"></a>
# **twitterGetStreamMonitor**
> StreamMonitorResponse twitterGetStreamMonitor(monitorId)

Get stream monitor

Get a single stream monitor by ID.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = TwitterApi()
val monitorId : kotlin.String = monitorId_example // kotlin.String | 
try {
    val result : StreamMonitorResponse = apiInstance.twitterGetStreamMonitor(monitorId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TwitterApi#twitterGetStreamMonitor")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TwitterApi#twitterGetStreamMonitor")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **monitorId** | **kotlin.String**|  | |

### Return type

[**StreamMonitorResponse**](StreamMonitorResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="twitterGetTrendingTopics"></a>
# **twitterGetTrendingTopics**
> kotlin.Any twitterGetTrendingTopics(category, count)

Get trending topics

Get trending topics.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = TwitterApi()
val category : kotlin.String = category_example // kotlin.String | 
val count : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.Any = apiInstance.twitterGetTrendingTopics(category, count)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TwitterApi#twitterGetTrendingTopics")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TwitterApi#twitterGetTrendingTopics")
    e.printStackTrace()
}
```

### Parameters
| **category** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **count** | **kotlin.Int**|  | [optional] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="twitterGetTrendsByLocation"></a>
# **twitterGetTrendsByLocation**
> kotlin.Any twitterGetTrendsByLocation(woeid)

Get trends by location

Get trending topics for a specific location (WOEID).

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = TwitterApi()
val woeid : kotlin.String = woeid_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.twitterGetTrendsByLocation(woeid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TwitterApi#twitterGetTrendsByLocation")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TwitterApi#twitterGetTrendsByLocation")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **woeid** | **kotlin.String**|  | |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="twitterGetTweetDetails"></a>
# **twitterGetTweetDetails**
> kotlin.Any twitterGetTweetDetails(tweetId, cursor)

Get tweet details

Get detailed information about a specific tweet.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = TwitterApi()
val tweetId : kotlin.String = tweetId_example // kotlin.String | 
val cursor : kotlin.String = cursor_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.twitterGetTweetDetails(tweetId, cursor)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TwitterApi#twitterGetTweetDetails")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TwitterApi#twitterGetTweetDetails")
    e.printStackTrace()
}
```

### Parameters
| **tweetId** | **kotlin.String**|  | |
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

<a id="twitterGetTweetEditHistory"></a>
# **twitterGetTweetEditHistory**
> kotlin.Any twitterGetTweetEditHistory(tweetId)

Get tweet edit history

Get the edit history of a tweet.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = TwitterApi()
val tweetId : kotlin.String = tweetId_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.twitterGetTweetEditHistory(tweetId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TwitterApi#twitterGetTweetEditHistory")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TwitterApi#twitterGetTweetEditHistory")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tweetId** | **kotlin.String**|  | |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="twitterGetTweetFavoriters"></a>
# **twitterGetTweetFavoriters**
> kotlin.Any twitterGetTweetFavoriters(tweetId, cursor)

Get tweet favoriters

Get users who favorited a specific tweet.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = TwitterApi()
val tweetId : kotlin.String = tweetId_example // kotlin.String | 
val cursor : kotlin.String = cursor_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.twitterGetTweetFavoriters(tweetId, cursor)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TwitterApi#twitterGetTweetFavoriters")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TwitterApi#twitterGetTweetFavoriters")
    e.printStackTrace()
}
```

### Parameters
| **tweetId** | **kotlin.String**|  | |
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

<a id="twitterGetTweetQuotes"></a>
# **twitterGetTweetQuotes**
> kotlin.Any twitterGetTweetQuotes(tweetId, cursor)

Get tweet quotes

Get tweets that quote a specific tweet.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = TwitterApi()
val tweetId : kotlin.String = tweetId_example // kotlin.String | 
val cursor : kotlin.String = cursor_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.twitterGetTweetQuotes(tweetId, cursor)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TwitterApi#twitterGetTweetQuotes")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TwitterApi#twitterGetTweetQuotes")
    e.printStackTrace()
}
```

### Parameters
| **tweetId** | **kotlin.String**|  | |
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

<a id="twitterGetTweetReplies"></a>
# **twitterGetTweetReplies**
> kotlin.Any twitterGetTweetReplies(tweetId, cursor)

Get tweet replies

Get replies to a specific tweet.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = TwitterApi()
val tweetId : kotlin.String = tweetId_example // kotlin.String | 
val cursor : kotlin.String = cursor_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.twitterGetTweetReplies(tweetId, cursor)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TwitterApi#twitterGetTweetReplies")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TwitterApi#twitterGetTweetReplies")
    e.printStackTrace()
}
```

### Parameters
| **tweetId** | **kotlin.String**|  | |
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

<a id="twitterGetTweetRetweeters"></a>
# **twitterGetTweetRetweeters**
> kotlin.Any twitterGetTweetRetweeters(tweetId, cursor)

Get tweet retweeters

Get users who retweeted a specific tweet.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = TwitterApi()
val tweetId : kotlin.String = tweetId_example // kotlin.String | 
val cursor : kotlin.String = cursor_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.twitterGetTweetRetweeters(tweetId, cursor)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TwitterApi#twitterGetTweetRetweeters")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TwitterApi#twitterGetTweetRetweeters")
    e.printStackTrace()
}
```

### Parameters
| **tweetId** | **kotlin.String**|  | |
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

<a id="twitterGetTweetsByIds"></a>
# **twitterGetTweetsByIds**
> kotlin.Any twitterGetTweetsByIds(tweets)

Get tweets by IDs

Get multiple tweets by their IDs.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = TwitterApi()
val tweets : kotlin.String = tweets_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.twitterGetTweetsByIds(tweets)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TwitterApi#twitterGetTweetsByIds")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TwitterApi#twitterGetTweetsByIds")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tweets** | **kotlin.String**|  | |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="twitterGetUserArticles"></a>
# **twitterGetUserArticles**
> kotlin.Any twitterGetUserArticles(userId, cursor)

Get user articles

Get long-form articles written by a user.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = TwitterApi()
val userId : kotlin.String = userId_example // kotlin.String | 
val cursor : kotlin.String = cursor_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.twitterGetUserArticles(userId, cursor)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TwitterApi#twitterGetUserArticles")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TwitterApi#twitterGetUserArticles")
    e.printStackTrace()
}
```

### Parameters
| **userId** | **kotlin.String**|  | |
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

<a id="twitterGetUserById"></a>
# **twitterGetUserById**
> kotlin.Any twitterGetUserById(userId)

Get user by ID

Get user profile by user ID.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = TwitterApi()
val userId : kotlin.String = userId_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.twitterGetUserById(userId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TwitterApi#twitterGetUserById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TwitterApi#twitterGetUserById")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **kotlin.String**|  | |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="twitterGetUserByUsername"></a>
# **twitterGetUserByUsername**
> kotlin.Any twitterGetUserByUsername(username)

Get user by username

Get user profile by username.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = TwitterApi()
val username : kotlin.String = username_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.twitterGetUserByUsername(username)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TwitterApi#twitterGetUserByUsername")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TwitterApi#twitterGetUserByUsername")
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

<a id="twitterGetUserFollowers"></a>
# **twitterGetUserFollowers**
> kotlin.Any twitterGetUserFollowers(username, cursor)

Get user followers

Get followers of a specific user.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = TwitterApi()
val username : kotlin.String = username_example // kotlin.String | 
val cursor : kotlin.String = cursor_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.twitterGetUserFollowers(username, cursor)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TwitterApi#twitterGetUserFollowers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TwitterApi#twitterGetUserFollowers")
    e.printStackTrace()
}
```

### Parameters
| **username** | **kotlin.String**|  | |
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

<a id="twitterGetUserFollowing"></a>
# **twitterGetUserFollowing**
> kotlin.Any twitterGetUserFollowing(username, cursor)

Get user following

Get users that a specific user is following.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = TwitterApi()
val username : kotlin.String = username_example // kotlin.String | 
val cursor : kotlin.String = cursor_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.twitterGetUserFollowing(username, cursor)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TwitterApi#twitterGetUserFollowing")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TwitterApi#twitterGetUserFollowing")
    e.printStackTrace()
}
```

### Parameters
| **username** | **kotlin.String**|  | |
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

<a id="twitterGetUserMentions"></a>
# **twitterGetUserMentions**
> kotlin.Any twitterGetUserMentions(username, count, cursor)

Get user mentions

Get tweets mentioning a specific user.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = TwitterApi()
val username : kotlin.String = username_example // kotlin.String | 
val count : kotlin.Int = 56 // kotlin.Int | 
val cursor : kotlin.String = cursor_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.twitterGetUserMentions(username, count, cursor)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TwitterApi#twitterGetUserMentions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TwitterApi#twitterGetUserMentions")
    e.printStackTrace()
}
```

### Parameters
| **username** | **kotlin.String**|  | |
| **count** | **kotlin.Int**|  | [optional] |
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

<a id="twitterGetUserSubscriptions"></a>
# **twitterGetUserSubscriptions**
> kotlin.Any twitterGetUserSubscriptions(userId, cursor)

Get user subscriptions

Get subscriptions of a specific user.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = TwitterApi()
val userId : kotlin.String = userId_example // kotlin.String | 
val cursor : kotlin.String = cursor_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.twitterGetUserSubscriptions(userId, cursor)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TwitterApi#twitterGetUserSubscriptions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TwitterApi#twitterGetUserSubscriptions")
    e.printStackTrace()
}
```

### Parameters
| **userId** | **kotlin.String**|  | |
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

<a id="twitterGetUserTweets"></a>
# **twitterGetUserTweets**
> kotlin.Any twitterGetUserTweets(username, cursor)

Get user tweets

Get latest tweets from a specific user.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = TwitterApi()
val username : kotlin.String = username_example // kotlin.String | 
val cursor : kotlin.String = cursor_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.twitterGetUserTweets(username, cursor)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TwitterApi#twitterGetUserTweets")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TwitterApi#twitterGetUserTweets")
    e.printStackTrace()
}
```

### Parameters
| **username** | **kotlin.String**|  | |
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

<a id="twitterListBillingLogs"></a>
# **twitterListBillingLogs**
> BillingLogListResponse twitterListBillingLogs(monitorId, page, pageSize)

List billing logs

List billing activity logs for the authenticated API key&#39;s monitors.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = TwitterApi()
val monitorId : kotlin.String = monitorId_example // kotlin.String | 
val page : kotlin.Int = 56 // kotlin.Int | 
val pageSize : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : BillingLogListResponse = apiInstance.twitterListBillingLogs(monitorId, page, pageSize)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TwitterApi#twitterListBillingLogs")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TwitterApi#twitterListBillingLogs")
    e.printStackTrace()
}
```

### Parameters
| **monitorId** | **kotlin.String**|  | [optional] |
| **page** | **kotlin.Int**|  | [optional] [default to 1] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageSize** | **kotlin.Int**|  | [optional] [default to 20] |

### Return type

[**BillingLogListResponse**](BillingLogListResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="twitterListDeliveryLogsForAFilterRule"></a>
# **twitterListDeliveryLogsForAFilterRule**
> FilterRuleDeliveryLogListResponse twitterListDeliveryLogsForAFilterRule(ruleId, deliveryStatus, authorUsername, page, pageSize, sort)

List delivery logs for a filter rule

List tweet delivery logs for a specific filter rule.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = TwitterApi()
val ruleId : kotlin.String = ruleId_example // kotlin.String | 
val deliveryStatus : kotlin.String = deliveryStatus_example // kotlin.String | 
val authorUsername : kotlin.String = authorUsername_example // kotlin.String | 
val page : kotlin.Int = 56 // kotlin.Int | 
val pageSize : kotlin.Int = 56 // kotlin.Int | 
val sort : kotlin.String = sort_example // kotlin.String | 
try {
    val result : FilterRuleDeliveryLogListResponse = apiInstance.twitterListDeliveryLogsForAFilterRule(ruleId, deliveryStatus, authorUsername, page, pageSize, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TwitterApi#twitterListDeliveryLogsForAFilterRule")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TwitterApi#twitterListDeliveryLogsForAFilterRule")
    e.printStackTrace()
}
```

### Parameters
| **ruleId** | **kotlin.String**|  | |
| **deliveryStatus** | **kotlin.String**|  | [optional] |
| **authorUsername** | **kotlin.String**|  | [optional] |
| **page** | **kotlin.Int**|  | [optional] [default to 1] |
| **pageSize** | **kotlin.Int**|  | [optional] [default to 20] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sort** | **kotlin.String**|  | [optional] [default to desc] [enum: asc, desc] |

### Return type

[**FilterRuleDeliveryLogListResponse**](FilterRuleDeliveryLogListResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="twitterListFilterRules"></a>
# **twitterListFilterRules**
> FilterRuleListResponse twitterListFilterRules(status, page, pageSize)

List filter rules

List all filter rules for the authenticated API key.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = TwitterApi()
val status : kotlin.String = status_example // kotlin.String | 
val page : kotlin.Int = 56 // kotlin.Int | 
val pageSize : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : FilterRuleListResponse = apiInstance.twitterListFilterRules(status, page, pageSize)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TwitterApi#twitterListFilterRules")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TwitterApi#twitterListFilterRules")
    e.printStackTrace()
}
```

### Parameters
| **status** | **kotlin.String**|  | [optional] |
| **page** | **kotlin.Int**|  | [optional] [default to 1] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageSize** | **kotlin.Int**|  | [optional] [default to 20] |

### Return type

[**FilterRuleListResponse**](FilterRuleListResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="twitterListStreamMonitors"></a>
# **twitterListStreamMonitors**
> StreamMonitorListResponse twitterListStreamMonitors(status, page, pageSize)

List stream monitors

List all stream monitors for the authenticated API key.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = TwitterApi()
val status : kotlin.String = status_example // kotlin.String | 
val page : kotlin.Int = 56 // kotlin.Int | 
val pageSize : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : StreamMonitorListResponse = apiInstance.twitterListStreamMonitors(status, page, pageSize)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TwitterApi#twitterListStreamMonitors")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TwitterApi#twitterListStreamMonitors")
    e.printStackTrace()
}
```

### Parameters
| **status** | **kotlin.String**|  | [optional] |
| **page** | **kotlin.Int**|  | [optional] [default to 1] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageSize** | **kotlin.Int**|  | [optional] [default to 20] |

### Return type

[**StreamMonitorListResponse**](StreamMonitorListResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="twitterListTweetDeliveryLogs"></a>
# **twitterListTweetDeliveryLogs**
> TweetDeliveryLogListResponse twitterListTweetDeliveryLogs(monitorId, authorUsername, deliveryStatus, page, pageSize, sort)

List tweet delivery logs

List tweet delivery logs for the authenticated API key&#39;s monitors.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = TwitterApi()
val monitorId : kotlin.String = monitorId_example // kotlin.String | 
val authorUsername : kotlin.String = authorUsername_example // kotlin.String | 
val deliveryStatus : kotlin.String = deliveryStatus_example // kotlin.String | 
val page : kotlin.Int = 56 // kotlin.Int | 
val pageSize : kotlin.Int = 56 // kotlin.Int | 
val sort : kotlin.String = sort_example // kotlin.String | 
try {
    val result : TweetDeliveryLogListResponse = apiInstance.twitterListTweetDeliveryLogs(monitorId, authorUsername, deliveryStatus, page, pageSize, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TwitterApi#twitterListTweetDeliveryLogs")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TwitterApi#twitterListTweetDeliveryLogs")
    e.printStackTrace()
}
```

### Parameters
| **monitorId** | **kotlin.String**|  | [optional] |
| **authorUsername** | **kotlin.String**|  | [optional] |
| **deliveryStatus** | **kotlin.String**|  | [optional] |
| **page** | **kotlin.Int**|  | [optional] [default to 1] |
| **pageSize** | **kotlin.Int**|  | [optional] [default to 20] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sort** | **kotlin.String**|  | [optional] [default to desc] [enum: asc, desc] |

### Return type

[**TweetDeliveryLogListResponse**](TweetDeliveryLogListResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="twitterListWebhooks"></a>
# **twitterListWebhooks**
> WebhookListResponse twitterListWebhooks(monitorId)

List webhooks

List all webhook-configured monitors for the authenticated API key.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = TwitterApi()
val monitorId : kotlin.String = monitorId_example // kotlin.String | 
try {
    val result : WebhookListResponse = apiInstance.twitterListWebhooks(monitorId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TwitterApi#twitterListWebhooks")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TwitterApi#twitterListWebhooks")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **monitorId** | **kotlin.String**|  | [optional] |

### Return type

[**WebhookListResponse**](WebhookListResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="twitterRemoveWebhookFromMonitor"></a>
# **twitterRemoveWebhookFromMonitor**
> twitterRemoveWebhookFromMonitor(webhookId)

Remove webhook from monitor

Remove webhook configuration from a monitor. webhook_id is the monitor_id.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = TwitterApi()
val webhookId : kotlin.String = webhookId_example // kotlin.String | 
try {
    apiInstance.twitterRemoveWebhookFromMonitor(webhookId)
} catch (e: ClientException) {
    println("4xx response calling TwitterApi#twitterRemoveWebhookFromMonitor")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TwitterApi#twitterRemoveWebhookFromMonitor")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **webhookId** | **kotlin.String**|  | |

### Return type

null (empty response body)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="twitterSearchCommunities"></a>
# **twitterSearchCommunities**
> kotlin.Any twitterSearchCommunities(query, cursor)

Search communities

Search for communities by query.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = TwitterApi()
val query : kotlin.String = query_example // kotlin.String | 
val cursor : kotlin.String = cursor_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.twitterSearchCommunities(query, cursor)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TwitterApi#twitterSearchCommunities")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TwitterApi#twitterSearchCommunities")
    e.printStackTrace()
}
```

### Parameters
| **query** | **kotlin.String**|  | |
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

<a id="twitterSearchListTweets"></a>
# **twitterSearchListTweets**
> kotlin.Any twitterSearchListTweets(listId, query, cursor)

Search list tweets

Search tweets within a specific list.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = TwitterApi()
val listId : kotlin.String = listId_example // kotlin.String | 
val query : kotlin.String = query_example // kotlin.String | 
val cursor : kotlin.String = cursor_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.twitterSearchListTweets(listId, query, cursor)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TwitterApi#twitterSearchListTweets")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TwitterApi#twitterSearchListTweets")
    e.printStackTrace()
}
```

### Parameters
| **listId** | **kotlin.String**|  | |
| **query** | **kotlin.String**|  | |
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

<a id="twitterSearchPlaces"></a>
# **twitterSearchPlaces**
> kotlin.Any twitterSearchPlaces(query, lat, long)

Search places

Search for places by query or coordinates.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = TwitterApi()
val query : kotlin.String = query_example // kotlin.String | 
val lat : java.math.BigDecimal = 8.14 // java.math.BigDecimal | 
val long : java.math.BigDecimal = 8.14 // java.math.BigDecimal | 
try {
    val result : kotlin.Any = apiInstance.twitterSearchPlaces(query, lat, long)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TwitterApi#twitterSearchPlaces")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TwitterApi#twitterSearchPlaces")
    e.printStackTrace()
}
```

### Parameters
| **query** | **kotlin.String**|  | [optional] |
| **lat** | **java.math.BigDecimal**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **long** | **java.math.BigDecimal**|  | [optional] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="twitterSearchUsers"></a>
# **twitterSearchUsers**
> kotlin.Any twitterSearchUsers(query, cursor)

Search users

Search for users by query.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = TwitterApi()
val query : kotlin.String = query_example // kotlin.String | 
val cursor : kotlin.String = cursor_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.twitterSearchUsers(query, cursor)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TwitterApi#twitterSearchUsers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TwitterApi#twitterSearchUsers")
    e.printStackTrace()
}
```

### Parameters
| **query** | **kotlin.String**|  | |
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

<a id="twitterTestWebhookDelivery"></a>
# **twitterTestWebhookDelivery**
> WebhookTestResponse twitterTestWebhookDelivery(webhookTestRequest)

Test webhook delivery

Send a test payload to a monitor&#39;s webhook URL.  The test payload has type&#x3D;\&quot;test\&quot; instead of type&#x3D;\&quot;tweet\&quot;. Makes a synchronous HTTP POST and returns the delivery result.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = TwitterApi()
val webhookTestRequest : WebhookTestRequest =  // WebhookTestRequest | 
try {
    val result : WebhookTestResponse = apiInstance.twitterTestWebhookDelivery(webhookTestRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TwitterApi#twitterTestWebhookDelivery")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TwitterApi#twitterTestWebhookDelivery")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **webhookTestRequest** | [**WebhookTestRequest**](WebhookTestRequest.md)|  | |

### Return type

[**WebhookTestResponse**](WebhookTestResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="twitterTwitterScraperHealthCheck"></a>
# **twitterTwitterScraperHealthCheck**
> kotlin.Any twitterTwitterScraperHealthCheck()

Twitter scraper health check

Check health of the Twitter scraper service.  Accepts &#x60;&#x60;HEAD&#x60;&#x60; so external uptime checkers (UptimeRobot uses HEAD by default for HTTP monitors) don&#39;t get a 405 Method Not Allowed.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = TwitterApi()
try {
    val result : kotlin.Any = apiInstance.twitterTwitterScraperHealthCheck()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TwitterApi#twitterTwitterScraperHealthCheck")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TwitterApi#twitterTwitterScraperHealthCheck")
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

<a id="twitterTwitterScraperHealthCheckHead"></a>
# **twitterTwitterScraperHealthCheckHead**
> kotlin.Any twitterTwitterScraperHealthCheckHead()

Twitter scraper health check

Check health of the Twitter scraper service.  Accepts &#x60;&#x60;HEAD&#x60;&#x60; so external uptime checkers (UptimeRobot uses HEAD by default for HTTP monitors) don&#39;t get a 405 Method Not Allowed.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = TwitterApi()
try {
    val result : kotlin.Any = apiInstance.twitterTwitterScraperHealthCheckHead()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TwitterApi#twitterTwitterScraperHealthCheckHead")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TwitterApi#twitterTwitterScraperHealthCheckHead")
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

<a id="twitterUpdateFilterRule"></a>
# **twitterUpdateFilterRule**
> FilterRuleResponse twitterUpdateFilterRule(ruleId, filterRuleUpdate)

Update filter rule

Partially update a filter rule.  Setting status&#x3D;&#39;active&#39; on a paused rule performs a credit check.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = TwitterApi()
val ruleId : kotlin.String = ruleId_example // kotlin.String | 
val filterRuleUpdate : FilterRuleUpdate =  // FilterRuleUpdate | 
try {
    val result : FilterRuleResponse = apiInstance.twitterUpdateFilterRule(ruleId, filterRuleUpdate)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TwitterApi#twitterUpdateFilterRule")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TwitterApi#twitterUpdateFilterRule")
    e.printStackTrace()
}
```

### Parameters
| **ruleId** | **kotlin.String**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **filterRuleUpdate** | [**FilterRuleUpdate**](FilterRuleUpdate.md)|  | |

### Return type

[**FilterRuleResponse**](FilterRuleResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="twitterUpdateStreamMonitor"></a>
# **twitterUpdateStreamMonitor**
> StreamMonitorResponse twitterUpdateStreamMonitor(monitorId, streamMonitorUpdate)

Update stream monitor

Partially update a stream monitor.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = TwitterApi()
val monitorId : kotlin.String = monitorId_example // kotlin.String | 
val streamMonitorUpdate : StreamMonitorUpdate =  // StreamMonitorUpdate | 
try {
    val result : StreamMonitorResponse = apiInstance.twitterUpdateStreamMonitor(monitorId, streamMonitorUpdate)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TwitterApi#twitterUpdateStreamMonitor")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TwitterApi#twitterUpdateStreamMonitor")
    e.printStackTrace()
}
```

### Parameters
| **monitorId** | **kotlin.String**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **streamMonitorUpdate** | [**StreamMonitorUpdate**](StreamMonitorUpdate.md)|  | |

### Return type

[**StreamMonitorResponse**](StreamMonitorResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="twitterValidateSearchQuery"></a>
# **twitterValidateSearchQuery**
> FilterRuleValidateResponse twitterValidateSearchQuery(filterRuleValidateRequest)

Validate search query

Validate a Twitter search query string.  Performs basic structural validation without making a live Twitter request. Returns valid&#x3D;True if the query passes syntax checks.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = TwitterApi()
val filterRuleValidateRequest : FilterRuleValidateRequest =  // FilterRuleValidateRequest | 
try {
    val result : FilterRuleValidateResponse = apiInstance.twitterValidateSearchQuery(filterRuleValidateRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TwitterApi#twitterValidateSearchQuery")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TwitterApi#twitterValidateSearchQuery")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **filterRuleValidateRequest** | [**FilterRuleValidateRequest**](FilterRuleValidateRequest.md)|  | |

### Return type

[**FilterRuleValidateResponse**](FilterRuleValidateResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

