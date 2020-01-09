package com.example.retrofitproject.api;

public class ApiUtils {

    public static final String BASE_URL="https://jsonplaceholder.typicode.com/";
    public static ApiInterface getApi() {
      return ApiClient.getRetrofit(BASE_URL).create(ApiInterface.class);


    }

}
