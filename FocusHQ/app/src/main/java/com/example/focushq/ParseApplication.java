package com.example.focushq;

import android.app.Application;

import com.parse.Parse;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        // set applicationId, and server server based on the values in the back4app settings.
        // any network interceptors must be added with the Configuration Builder given this syntax
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("nCo2aQy2KujDF7vDA4L4yKNOHK4mOEI1Ft3BBa8d") // should correspond to Application Id env variable
                .clientKey("vAfAE9MhU6xuzKk2tebdnkU9JteRQnvht86yFbpP")  // should correspond to Client key env variable
                .server("https://parseapi.back4app.com").build());
    }
}
