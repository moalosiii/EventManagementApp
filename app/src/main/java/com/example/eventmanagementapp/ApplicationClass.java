package com.example.eventmanagementapp;

import android.app.Application;

import com.backendless.Backendless;
import com.backendless.BackendlessUser;

public class ApplicationClass extends Application {
    public static final String APPLICATION_ID = "DC350EC1-8AF4-AF48-FFC3-815F6F54A100";
    public static final String API_KEY = "499F7833-9FCF-4B84-A899-1C333176093B";
    public static final String SERVER_URL = "https://api.backendless.com";

    public static BackendlessUser User;
    @Override
    public void onCreate() {
        super.onCreate();
        Backendless.setUrl( SERVER_URL );
        Backendless.initApp( getApplicationContext(),
                APPLICATION_ID,
                API_KEY );

    }
}
