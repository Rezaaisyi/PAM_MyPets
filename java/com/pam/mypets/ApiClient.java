package com.pam.mypets;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by yourapps on 15/03/18.
 */

class ApiClient {

    private static final String BASE_URL = "http://192.168.1.25:81/cupang/";
    private static Retrofit retrofit;

    static Retrofit getApiClient() {

        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

        }
        return retrofit;
    }

}
