# LinkedInApi

All URIs are relative to *https://scrapebadger.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**linkedinGetACompanySJobPostings**](LinkedInApi.md#linkedinGetACompanySJobPostings) | **GET** /v1/linkedin/companies/{company_id}/jobs | Get a company&#39;s job postings |
| [**linkedinGetACourse**](LinkedInApi.md#linkedinGetACourse) | **GET** /v1/linkedin/learning/{course_slug} | Get a course |
| [**linkedinGetAPublicArticle**](LinkedInApi.md#linkedinGetAPublicArticle) | **GET** /v1/linkedin/articles/{article_slug} | Get a public article |
| [**linkedinGetAPublicPost**](LinkedInApi.md#linkedinGetAPublicPost) | **GET** /v1/linkedin/posts/{post_slug} | Get a public post |
| [**linkedinGetCompany**](LinkedInApi.md#linkedinGetCompany) | **GET** /v1/linkedin/companies/{universal_name} | Get company |
| [**linkedinGetJobDetail**](LinkedInApi.md#linkedinGetJobDetail) | **GET** /v1/linkedin/jobs/{job_id} | Get job detail |
| [**linkedinGetPublicProfile**](LinkedInApi.md#linkedinGetPublicProfile) | **GET** /v1/linkedin/profiles/{public_id} | Get public profile |
| [**linkedinGetSchool**](LinkedInApi.md#linkedinGetSchool) | **GET** /v1/linkedin/schools/{universal_name} | Get school |
| [**linkedinLinkedinScraperHealthCheck**](LinkedInApi.md#linkedinLinkedinScraperHealthCheck) | **GET** /v1/linkedin/health | LinkedIn scraper health check |
| [**linkedinLinkedinScraperHealthCheckHead**](LinkedInApi.md#linkedinLinkedinScraperHealthCheckHead) | **HEAD** /v1/linkedin/health | LinkedIn scraper health check |
| [**linkedinSearchLinkedinJobs**](LinkedInApi.md#linkedinSearchLinkedinJobs) | **GET** /v1/linkedin/jobs/search | Search LinkedIn jobs |
| [**linkedinSuggestLocationGeoIds**](LinkedInApi.md#linkedinSuggestLocationGeoIds) | **GET** /v1/linkedin/geo/suggest | Suggest location geo ids |


<a id="linkedinGetACompanySJobPostings"></a>
# **linkedinGetACompanySJobPostings**
> kotlin.Any linkedinGetACompanySJobPostings(companyId, start, country)

Get a company&#39;s job postings

Public job postings for a company (numeric company id from the company endpoint).

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = LinkedInApi()
val companyId : kotlin.String = companyId_example // kotlin.String | 
val start : kotlin.Int = 56 // kotlin.Int | Pagination offset (0, 25, 50, ...)
val country : kotlin.String = country_example // kotlin.String | Residential proxy country
try {
    val result : kotlin.Any = apiInstance.linkedinGetACompanySJobPostings(companyId, start, country)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LinkedInApi#linkedinGetACompanySJobPostings")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LinkedInApi#linkedinGetACompanySJobPostings")
    e.printStackTrace()
}
```

### Parameters
| **companyId** | **kotlin.String**|  | |
| **start** | **kotlin.Int**| Pagination offset (0, 25, 50, ...) | [optional] [default to 0] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **country** | **kotlin.String**| Residential proxy country | [optional] [default to &quot;us&quot;] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="linkedinGetACourse"></a>
# **linkedinGetACourse**
> kotlin.Any linkedinGetACourse(courseSlug, country)

Get a course

A public LinkedIn Learning course — provider, workload, instructors, rating.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = LinkedInApi()
val courseSlug : kotlin.String = courseSlug_example // kotlin.String | 
val country : kotlin.String = country_example // kotlin.String | Residential proxy country
try {
    val result : kotlin.Any = apiInstance.linkedinGetACourse(courseSlug, country)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LinkedInApi#linkedinGetACourse")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LinkedInApi#linkedinGetACourse")
    e.printStackTrace()
}
```

### Parameters
| **courseSlug** | **kotlin.String**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **country** | **kotlin.String**| Residential proxy country | [optional] [default to &quot;us&quot;] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="linkedinGetAPublicArticle"></a>
# **linkedinGetAPublicArticle**
> kotlin.Any linkedinGetAPublicArticle(articleSlug, country)

Get a public article

A public Pulse article — title, body, author, reactions (JSON-LD).

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = LinkedInApi()
val articleSlug : kotlin.String = articleSlug_example // kotlin.String | 
val country : kotlin.String = country_example // kotlin.String | Residential proxy country
try {
    val result : kotlin.Any = apiInstance.linkedinGetAPublicArticle(articleSlug, country)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LinkedInApi#linkedinGetAPublicArticle")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LinkedInApi#linkedinGetAPublicArticle")
    e.printStackTrace()
}
```

### Parameters
| **articleSlug** | **kotlin.String**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **country** | **kotlin.String**| Residential proxy country | [optional] [default to &quot;us&quot;] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="linkedinGetAPublicPost"></a>
# **linkedinGetAPublicPost**
> kotlin.Any linkedinGetAPublicPost(postSlug, country)

Get a public post

A public activity share — text, author, reactions, comments (JSON-LD).

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = LinkedInApi()
val postSlug : kotlin.String = postSlug_example // kotlin.String | 
val country : kotlin.String = country_example // kotlin.String | Residential proxy country
try {
    val result : kotlin.Any = apiInstance.linkedinGetAPublicPost(postSlug, country)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LinkedInApi#linkedinGetAPublicPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LinkedInApi#linkedinGetAPublicPost")
    e.printStackTrace()
}
```

### Parameters
| **postSlug** | **kotlin.String**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **country** | **kotlin.String**| Residential proxy country | [optional] [default to &quot;us&quot;] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="linkedinGetCompany"></a>
# **linkedinGetCompany**
> kotlin.Any linkedinGetCompany(universalName, country)

Get company

Public company page — industry, size, HQ, followers, specialties (JSON-LD + SSR).

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = LinkedInApi()
val universalName : kotlin.String = universalName_example // kotlin.String | 
val country : kotlin.String = country_example // kotlin.String | Residential proxy country
try {
    val result : kotlin.Any = apiInstance.linkedinGetCompany(universalName, country)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LinkedInApi#linkedinGetCompany")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LinkedInApi#linkedinGetCompany")
    e.printStackTrace()
}
```

### Parameters
| **universalName** | **kotlin.String**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **country** | **kotlin.String**| Residential proxy country | [optional] [default to &quot;us&quot;] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="linkedinGetJobDetail"></a>
# **linkedinGetJobDetail**
> kotlin.Any linkedinGetJobDetail(jobId, country)

Get job detail

Full detail for one job posting (guest API, no login).

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = LinkedInApi()
val jobId : kotlin.String = jobId_example // kotlin.String | 
val country : kotlin.String = country_example // kotlin.String | Residential proxy country
try {
    val result : kotlin.Any = apiInstance.linkedinGetJobDetail(jobId, country)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LinkedInApi#linkedinGetJobDetail")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LinkedInApi#linkedinGetJobDetail")
    e.printStackTrace()
}
```

### Parameters
| **jobId** | **kotlin.String**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **country** | **kotlin.String**| Residential proxy country | [optional] [default to &quot;us&quot;] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="linkedinGetPublicProfile"></a>
# **linkedinGetPublicProfile**
> kotlin.Any linkedinGetPublicProfile(publicId, country)

Get public profile

Public profile by vanity id (the &#x60;&#x60;/in/{public_id}&#x60;&#x60; slug) — name, headline, location, about, experience, education (public JSON-LD + SSR subset).

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = LinkedInApi()
val publicId : kotlin.String = publicId_example // kotlin.String | 
val country : kotlin.String = country_example // kotlin.String | Residential proxy country
try {
    val result : kotlin.Any = apiInstance.linkedinGetPublicProfile(publicId, country)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LinkedInApi#linkedinGetPublicProfile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LinkedInApi#linkedinGetPublicProfile")
    e.printStackTrace()
}
```

### Parameters
| **publicId** | **kotlin.String**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **country** | **kotlin.String**| Residential proxy country | [optional] [default to &quot;us&quot;] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="linkedinGetSchool"></a>
# **linkedinGetSchool**
> kotlin.Any linkedinGetSchool(universalName, country)

Get school

Public school page — name, description, website, follower/alumni counts.

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = LinkedInApi()
val universalName : kotlin.String = universalName_example // kotlin.String | 
val country : kotlin.String = country_example // kotlin.String | Residential proxy country
try {
    val result : kotlin.Any = apiInstance.linkedinGetSchool(universalName, country)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LinkedInApi#linkedinGetSchool")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LinkedInApi#linkedinGetSchool")
    e.printStackTrace()
}
```

### Parameters
| **universalName** | **kotlin.String**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **country** | **kotlin.String**| Residential proxy country | [optional] [default to &quot;us&quot;] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="linkedinLinkedinScraperHealthCheck"></a>
# **linkedinLinkedinScraperHealthCheck**
> kotlin.Any linkedinLinkedinScraperHealthCheck()

LinkedIn scraper health check

Check health of the LinkedIn scraper service (accepts HEAD).

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = LinkedInApi()
try {
    val result : kotlin.Any = apiInstance.linkedinLinkedinScraperHealthCheck()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LinkedInApi#linkedinLinkedinScraperHealthCheck")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LinkedInApi#linkedinLinkedinScraperHealthCheck")
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

<a id="linkedinLinkedinScraperHealthCheckHead"></a>
# **linkedinLinkedinScraperHealthCheckHead**
> kotlin.Any linkedinLinkedinScraperHealthCheckHead()

LinkedIn scraper health check

Check health of the LinkedIn scraper service (accepts HEAD).

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = LinkedInApi()
try {
    val result : kotlin.Any = apiInstance.linkedinLinkedinScraperHealthCheckHead()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LinkedInApi#linkedinLinkedinScraperHealthCheckHead")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LinkedInApi#linkedinLinkedinScraperHealthCheckHead")
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

<a id="linkedinSearchLinkedinJobs"></a>
# **linkedinSearchLinkedinJobs**
> kotlin.Any linkedinSearchLinkedinJobs(keywords, location, geoId, companyId, datePosted, experience, jobType, workplace, sort, start, country)

Search LinkedIn jobs

Search public LinkedIn job postings (guest API, no login).

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = LinkedInApi()
val keywords : kotlin.String = keywords_example // kotlin.String | Job title / keywords
val location : kotlin.String = location_example // kotlin.String | Location text, e.g. 'New York'
val geoId : kotlin.String = geoId_example // kotlin.String | LinkedIn numeric geo id (overrides location)
val companyId : kotlin.String = companyId_example // kotlin.String | Restrict to a company (numeric id)
val datePosted : kotlin.String = datePosted_example // kotlin.String | past_24h | past_week | past_month | any
val experience : kotlin.String = experience_example // kotlin.String | internship|entry|associate|mid_senior|director|executive (comma-separated)
val jobType : kotlin.String = jobType_example // kotlin.String | full_time|part_time|contract|temporary|internship|volunteer|other
val workplace : kotlin.String = workplace_example // kotlin.String | onsite|remote|hybrid (comma-separated)
val sort : kotlin.String = sort_example // kotlin.String | relevant | recent
val start : kotlin.Int = 56 // kotlin.Int | Pagination offset (0, 25, 50, ...)
val country : kotlin.String = country_example // kotlin.String | Residential proxy country
try {
    val result : kotlin.Any = apiInstance.linkedinSearchLinkedinJobs(keywords, location, geoId, companyId, datePosted, experience, jobType, workplace, sort, start, country)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LinkedInApi#linkedinSearchLinkedinJobs")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LinkedInApi#linkedinSearchLinkedinJobs")
    e.printStackTrace()
}
```

### Parameters
| **keywords** | **kotlin.String**| Job title / keywords | [optional] |
| **location** | **kotlin.String**| Location text, e.g. &#39;New York&#39; | [optional] |
| **geoId** | **kotlin.String**| LinkedIn numeric geo id (overrides location) | [optional] |
| **companyId** | **kotlin.String**| Restrict to a company (numeric id) | [optional] |
| **datePosted** | **kotlin.String**| past_24h | past_week | past_month | any | [optional] |
| **experience** | **kotlin.String**| internship|entry|associate|mid_senior|director|executive (comma-separated) | [optional] |
| **jobType** | **kotlin.String**| full_time|part_time|contract|temporary|internship|volunteer|other | [optional] |
| **workplace** | **kotlin.String**| onsite|remote|hybrid (comma-separated) | [optional] |
| **sort** | **kotlin.String**| relevant | recent | [optional] |
| **start** | **kotlin.Int**| Pagination offset (0, 25, 50, ...) | [optional] [default to 0] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **country** | **kotlin.String**| Residential proxy country | [optional] [default to &quot;us&quot;] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="linkedinSuggestLocationGeoIds"></a>
# **linkedinSuggestLocationGeoIds**
> kotlin.Any linkedinSuggestLocationGeoIds(query, type)

Suggest location geo ids

Resolve a name to LinkedIn ids (job-search &#x60;&#x60;geo_id&#x60;&#x60; / &#x60;&#x60;company_id&#x60;&#x60; helper).

### Example
```kotlin
// Import classes:
//import com.scrapebadger.client.infrastructure.*
//import com.scrapebadger.client.models.*

val apiInstance = LinkedInApi()
val query : kotlin.String = query_example // kotlin.String | Location text, e.g. 'London'
val type : kotlin.String = type_example // kotlin.String | geo | company
try {
    val result : kotlin.Any = apiInstance.linkedinSuggestLocationGeoIds(query, type)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LinkedInApi#linkedinSuggestLocationGeoIds")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LinkedInApi#linkedinSuggestLocationGeoIds")
    e.printStackTrace()
}
```

### Parameters
| **query** | **kotlin.String**| Location text, e.g. &#39;London&#39; | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **type** | **kotlin.String**| geo | company | [optional] [default to &quot;geo&quot;] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

