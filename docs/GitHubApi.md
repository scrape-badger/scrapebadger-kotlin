# GitHubApi

All URIs are relative to *https://scrapebadger.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**githubGetProfile**](GitHubApi.md#githubGetProfile) | **GET** /v1/github/profiles/{username} | Get profile |
| [**githubGetRepository**](GitHubApi.md#githubGetRepository) | **GET** /v1/github/repositories/{owner}/{repo} | Get repository |


<a id="githubGetProfile"></a>
# **githubGetProfile**
> GitHubProfileResponse githubGetProfile(username, tab, year, page, nextPageToken)

Get profile

Public user or organization profile, pins/popular repositories, README and contributions.  The overview preserves GitHub&#39;s public website sections, including organization-specific metadata. Compact displayed counts are approximate and marked with *_approximate. Unavailable or blocked data is an unbilled error, never an empty success.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = GitHubApi()
val username : kotlin.String = username_example // kotlin.String | 
val tab : kotlin.String = tab_example // kotlin.String | Profile section; stars is available for users only
val year : kotlin.Int = 56 // kotlin.Int | Overview only: 1970 through the current UTC year; activity is December or current month
val page : kotlin.Int = 56 // kotlin.Int | Repositories only: page number, 30 rows per page
val nextPageToken : kotlin.String = nextPageToken_example // kotlin.String | Stars only: previous pagination.next_page_token
try {
    val result : GitHubProfileResponse = apiInstance.githubGetProfile(username, tab, year, page, nextPageToken)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GitHubApi#githubGetProfile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GitHubApi#githubGetProfile")
    e.printStackTrace()
}
```

### Parameters
| **username** | **kotlin.String**|  | |
| **tab** | **kotlin.String**| Profile section; stars is available for users only | [optional] [default to overview] [enum: overview, repositories, stars] |
| **year** | **kotlin.Int**| Overview only: 1970 through the current UTC year; activity is December or current month | [optional] |
| **page** | **kotlin.Int**| Repositories only: page number, 30 rows per page | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **nextPageToken** | **kotlin.String**| Stars only: previous pagination.next_page_token | [optional] |

### Return type

[**GitHubProfileResponse**](GitHubProfileResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="githubGetRepository"></a>
# **githubGetRepository**
> GitHubRepositoryResponse githubGetRepository(owner, repo)

Get repository

Public default-branch repository detail, native README, files and latest commit.  Use owner.login and name from a profile repository summary. Root file and contributor previews are not exhaustive recursive trees or membership lists. No GitHub token, market, ref, search or pagination parameter is accepted.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = GitHubApi()
val owner : kotlin.String = owner_example // kotlin.String | 
val repo : kotlin.String = repo_example // kotlin.String | 
try {
    val result : GitHubRepositoryResponse = apiInstance.githubGetRepository(owner, repo)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GitHubApi#githubGetRepository")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GitHubApi#githubGetRepository")
    e.printStackTrace()
}
```

### Parameters
| **owner** | **kotlin.String**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **repo** | **kotlin.String**|  | |

### Return type

[**GitHubRepositoryResponse**](GitHubRepositoryResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

