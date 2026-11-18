
# AsyncAccepted

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **requestId** | **kotlin.String** |  |  |
| **status** | [**inline**](#Status) |  |  |
| **retryAfterSeconds** | **kotlin.Int** |  |  |
| **nextAction** | [**AsyncAcceptedNextAction**](AsyncAcceptedNextAction.md) |  |  |
| **detail** | **kotlin.String** |  |  [optional] |
| **callback** | [**kotlin.Any**](.md) | Only on a poll of a call submitted with a callback: the delivery state so far (&#x60;status&#x60;, &#x60;attempts&#x60;, &#x60;last_error&#x60;). |  [optional] |


<a id="Status"></a>
## Enum: status
| Name | Value |
| ---- | ----- |
| status | running |



