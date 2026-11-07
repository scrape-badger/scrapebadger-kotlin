
# YelpBusiness

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **position** | **kotlin.Int** | 1-based place in Yelp&#39;s organic order across pages (page 2 starts at 11): Yelp&#39;s own number where it numbers the results; services searches are unnumbered and keep Yelp&#39;s order. For ads, the slot order. |  |
| **isAd** | **kotlin.Boolean** |  |  |
| **id** | **kotlin.String** | Yelp encrypted business ID. |  |
| **alias** | **kotlin.String** | Business slug used in /biz/&lt;alias&gt;. |  |
| **name** | **kotlin.String** |  |  |
| **url** | **kotlin.String** |  |  |
| **rating** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  |  [optional] |
| **reviewCount** | **kotlin.Int** |  |  [optional] |
| **price** | **kotlin.String** |  |  [optional] |
| **priceLevel** | **kotlin.Int** |  |  [optional] |
| **categories** | [**kotlin.collections.List&lt;YelpCategory&gt;**](YelpCategory.md) |  |  [optional] |
| **neighborhoods** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  [optional] |
| **address** | **kotlin.String** |  |  [optional] |
| **city** | **kotlin.String** |  |  [optional] |
| **phone** | **kotlin.String** |  |  [optional] |
| **timezone** | **kotlin.String** |  |  [optional] |
| **openingHours** | [**kotlin.collections.List&lt;YelpHours&gt;**](YelpHours.md) |  |  [optional] |
| **snippet** | **kotlin.String** |  |  [optional] |
| **snippetType** | **kotlin.String** |  |  [optional] |
| **highlights** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  [optional] |
| **tags** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  [optional] |
| **photos** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  [optional] |
| **alternateNames** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  [optional] |
| **isServiceAreaBusiness** | **kotlin.Boolean** |  |  [optional] |
| **isYelpGuaranteed** | **kotlin.Boolean** |  |  [optional] |
| **hasVerifiedLicense** | **kotlin.Boolean** |  |  [optional] |
| **adPlacement** | **kotlin.String** |  |  [optional] |



