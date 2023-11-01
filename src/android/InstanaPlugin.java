package ar.com.yamamoto.cordova.plugin.instana;

import org.apache.cordova.*;
import org.json.JSONArray;
import org.json.JSONException;

import android.util.Log;

import com.instana.android.Instana;
import com.instana.android.core.InstanaConfig;


public class InstanaPlugin extends CordovaPlugin {

    public static final String TAG = "InstanaPlugin";

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {

        if(action.equals("initPlugin")) {

            Log.i(TAG, "Initializing Instana ;)");

            String instanaKey = args.getString(0);
            String instanaUrl = args.getString(1);

            Log.i(TAG, String.format("Key = %s, URL = %s", instanaKey, instanaUrl));

            InstanaConfig instanaConfig = new InstanaConfig(
                instanaKey,
                instanaUrl
            );

            Instana.setup(
                cordova.getActivity().getApplication(),
                instanaConfig
            );

            return true;
        }

        return false;

    }



}