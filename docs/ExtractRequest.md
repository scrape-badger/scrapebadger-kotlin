
# ExtractRequest

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **url** | **kotlin.String** | The page to fetch. |  |
| **waitFor** | **kotlin.String** |  |  [optional] |
| **country** | **kotlin.String** |  |  [optional] |
| **proxyTier** | [**inline**](#ProxyTier) | Proxy pool: simple, premium or ultra. |  [optional] |
| **extractRules** | [**kotlin.collections.Map&lt;kotlin.String, ExtractRequestExtractRulesValue&gt;**](ExtractRequestExtractRulesValue.md) |  |  [optional] |
| **aiExtractRules** | **kotlin.collections.Map&lt;kotlin.String, kotlin.String&gt;** |  |  [optional] |
| **aiQuery** | **kotlin.String** |  |  [optional] |
| **renderJs** | **kotlin.Boolean** | Render the page in a browser first. |  [optional] |


<a id="ProxyTier"></a>
## Enum: proxy_tier
| Name | Value |
| ---- | ----- |
| proxyTier | simple, premium, ultra |



