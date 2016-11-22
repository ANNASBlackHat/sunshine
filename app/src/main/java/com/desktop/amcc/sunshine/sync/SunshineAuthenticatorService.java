package com.desktop.amcc.sunshine.sync;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/**
 * Created by ANNASBlackHat on 5/14/2016.
 * This will allow the framework to access our SunshineAuthenticator.
 * This is also almost exactly the same as the stub code from the
 * Developer Guide on sync adapters.
 * (http://developer.android.com/training/sync-adapters/creating-authenticator.html)
 */
public class SunshineAuthenticatorService extends Service {
    // Instance field that stores the authenticator object
    private SunshineAuthenticator mAuthenticator;

    @Override
    public void onCreate() {
        // Create a new authenticator object
        mAuthenticator = new SunshineAuthenticator(this);
    }

    /*
     * When the system binds to this Service to make the RPC call
     * return the authenticator's IBinder.
     */
    @Override
    public IBinder onBind(Intent intent) {
        return mAuthenticator.getIBinder();
    }
}