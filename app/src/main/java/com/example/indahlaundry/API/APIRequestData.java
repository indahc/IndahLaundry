package com.example.indahlaundry.API;

import com.example.indahlaundry.Model.ResponseModel;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIRequestData {
    @GET("retriew.php")
    Call<ResponseModel> ardRetrieveData();
}
