# Adil Cloud Functions

Adil use several Cloud Functions to provide functionalities for the Android App. Functions will be called directly inside the registered Android App.

## Initialize the client SDK

Make sure the Android App specifies Function region during initialization

```
private lateinit var functions: FirebaseFunctions
// ...
functions = Firebase.functions("asia-southeast2")
```

## Function parameters

Here are data parameters required to be passed during functions invocation.
```
Function: getSignedUrl
val data = hasMapOf (
  "bucket" to "adil-pdf",
  "filenmae" to "11e44c4ed09124909b9c313231363531.0.pdf"
)

Function: getTimeline
val data = hasMapOf (
   "docId" to "11e44c4ed09124909b9c313231363531"
)

Function: queryLegislation
val data = hasMapOf (
   "query" to "Undang-Undang / Keyword yang dicari"
)
```

## Testing Functions

Here are data parameters example to test the functions

Test here: https://console.cloud.google.com/functions/list?project=adil-gcp&tab=logs

```
Function: getSignedUrl
{
  "data": {
    "bucket": "adil-pdf",
    "filename": "11e44c4ed09124909b9c313231363531.0.pdf"
  }
}

Function: getTimeline
{
  "data": {
    "docId": "11e44c4ed09124909b9c313231363531"
  }
}

Function: queryLegislation
{
  "data": {
    "query": "Perlindungan"
  }
}
```
