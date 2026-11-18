
# WebhookDelivery

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **requestId** | **kotlin.String** |  |  |
| **endpoint** | **kotlin.String** | Path of the call, e.g. &#x60;/v1/perplexity/ask&#x60; (never its query). |  |
| **state** | [**inline**](#State) | &#x60;pending&#x60;: the call is still running. &#x60;delivering&#x60;: an attempt is under way or the next retry is due at &#x60;next_attempt_at&#x60;. &#x60;delivered&#x60;: the endpoint answered 2xx. &#x60;failed&#x60;: every attempt failed, a final status (not 408/429/5xx) came back, or a gateway restart interrupted the delivery (&#x60;last_error&#x60; \&quot;interrupted (gateway restart)\&quot;). |  |
| **attempts** | **kotlin.Int** |  |  |
| **createdAt** | **kotlin.Int** | Unix time the call was submitted. |  |
| **callbackHost** | **kotlin.String** |  |  |
| **lastStatus** | **kotlin.Int** |  |  [optional] |
| **lastError** | **kotlin.String** |  |  [optional] |
| **deliveredAt** | **kotlin.Int** |  |  [optional] |


<a id="State"></a>
## Enum: state
| Name | Value |
| ---- | ----- |
| state | pending, delivering, delivered, failed |



