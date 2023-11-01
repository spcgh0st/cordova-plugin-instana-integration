module.exports = {

    initPlugin: function(instanaKey, instanaUrl, successCallback, errorCallback) {

        cordova.exec(successCallback, errorCallback, "InstanaPlugin", "initPlugin", [instanaKey, instanaUrl]);

    }

};