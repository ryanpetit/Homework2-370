package com.example.jeff.homework2_370;

import android.app.Application;


public class HomeworkApplication extends Application {
    private static HomeworkApplication instance;

    private String baseApiUrl;
    private String apiKey;
    private String appId;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;

        initialize();
    }

    private void initialize() {


        appId = getString(R.string.app_id);
        apiKey = getString(R.string.api_key);
        baseApiUrl = getString(R.string.base_api_url);
    }

    public static HomeworkApplication getInstance() {
        return instance;
    }

    public String getBaseApiUrl() {
        return baseApiUrl;
    }

    public String getApiKey() {
        return apiKey;
    }

    public String getAppId() {
        return appId;
    }
}
