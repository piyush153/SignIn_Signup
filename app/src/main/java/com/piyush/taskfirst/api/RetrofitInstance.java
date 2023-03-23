package com.piyush.taskfirst.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
public class RetrofitInstance {
    public static RetrofitInstance instance;
    public ApiInterface  apIinterface;
    public  static String api="https://jsonplaceholder.typicode.com/photos";


    RetrofitInstance(){
        Retrofit retrofit=new Retrofit.Builder()
                .baseUrl(api)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        apIinterface=retrofit.create(ApiInterface.class);

    }

    public static  RetrofitInstance getInstance(){
        if(instance==null){
            instance=new RetrofitInstance();
        }
        return instance;
    }
}
