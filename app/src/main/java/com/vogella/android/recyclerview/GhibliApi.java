package com.vogella.android.recyclerview;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GhibliApi {
    @GET("/films")
    Call<List<Ghibli>> getGhibliResponse();

    //Can add more here, for the characters and else, ...
}
