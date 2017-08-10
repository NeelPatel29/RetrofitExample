package com.example.neel.retrofitexample.API;

import com.example.neel.retrofitexample.Model.Country;

import retrofit2.Call;
import retrofit2.http.GET;
/**
 * Created by NEEL on 8/10/2017.
 */

public interface ApiInterface {
    @GET("tutorial/jsonparsetutorial.txt")
    Call<Country> getAllDetails();
}
