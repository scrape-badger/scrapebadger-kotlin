
# WebhookEvent

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **event** | [**inline**](#Event) |  |  |
| **requestId** | **kotlin.String** |  |  |
| **batchId** | **kotlin.String** |  |  |
| **status** | **kotlin.Int** | The call&#39;s own HTTP status. |  |
| **headers** | **kotlin.collections.Map&lt;kotlin.String, kotlin.String&gt;** | The call&#39;s kept response headers, lower-case (content-type, x-credits-used, x-request-duration-ms, x-api-tier). |  |
| **resultUrl** | **kotlin.String** |  |  |
| **resultExpiresAt** | **kotlin.Int** | Unix time. |  |
| **bodySize** | **kotlin.Int** |  |  |
| **body** | [**kotlin.Any**](.md) |  |  |
| **attempt** | **kotlin.Int** |  |  |
| **sentAt** | **kotlin.Int** | Unix time of this attempt. |  |
| **bodyOmitted** | **kotlin.Boolean** | Present (true) when the body was over 1 MB: fetch &#x60;result_url&#x60;. |  [optional] |


<a id="Event"></a>
## Enum: event
| Name | Value |
| ---- | ----- |
| event | request.completed |



