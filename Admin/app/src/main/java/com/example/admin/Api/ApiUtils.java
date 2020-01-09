package com.example.admin.Api;

public class ApiUtils {

    public static final String BASE_URL="https://culibrary1.000webhostapp.com/api/";

    public static ApiInterface getApi(){
        return ApiClient.getRetrofit(BASE_URL).create(ApiInterface.class);

    }
}
