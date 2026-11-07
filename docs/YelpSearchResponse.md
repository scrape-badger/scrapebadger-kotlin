
# YelpSearchResponse

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **market** | **kotlin.String** |  |  |
| **query** | **kotlin.String** |  |  |
| **location** | **kotlin.String** |  |  |
| **locationResolved** | [**YelpResolvedLocation**](YelpResolvedLocation.md) |  |  |
| **queryMatched** | **kotlin.Boolean** | False when Yelp could not place the query; results are then Yelp&#39;s broader ranking for the location, as Yelp shows them. |  |
| **totalResults** | **kotlin.Int** | Yelp&#39;s reported total; at most 110 are browsable. |  |
| **page** | **kotlin.Int** |  |  |
| **pageSize** | **kotlin.Int** |  |  |
| **totalPages** | **kotlin.Int** |  |  |
| **hasNextPage** | **kotlin.Boolean** |  |  |
| **results** | [**kotlin.collections.List&lt;YelpBusiness&gt;**](YelpBusiness.md) |  |  |
| **ads** | [**kotlin.collections.List&lt;YelpBusiness&gt;**](YelpBusiness.md) |  |  |
| **filters** | [**kotlin.collections.Map&lt;kotlin.String, YelpFilterGroup&gt;**](YelpFilterGroup.md) |  |  |
| **relatedSearches** | [**kotlin.collections.List&lt;YelpLink&gt;**](YelpLink.md) |  |  |
| **sourceUrl** | **kotlin.String** |  |  |
| **fetchedAt** | **kotlin.String** |  |  |
| **fetchedUtc** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  |  |
| **didYouMean** | **kotlin.String** |  |  [optional] |
| **nextPage** | **kotlin.Int** |  |  [optional] |



