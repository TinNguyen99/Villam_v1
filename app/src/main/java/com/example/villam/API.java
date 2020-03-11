package com.example.villam;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface API {
        String base_url_garden = "http://66.42.48.59:8000";

        @GET("/api/Gardens")
        Call<List<Farm>> getData();

}
