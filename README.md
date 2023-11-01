Cordova Plugin test for integrating with IBM Instana (on Android)

Usage example:

Add the following in onDeviceReady()

```javascript

instana.initPlugin("INSTANA_KEY_PLUGIN_01",
    "https://<report-url>", callbackSuccess, callbackError);

```


