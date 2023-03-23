package com.piyush.taskfirst.api;

import com.piyush.taskfirst.modals.ApiModel;

import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

    @GET("photos")
    Call<List<ApiModel>> getUsers();


}
