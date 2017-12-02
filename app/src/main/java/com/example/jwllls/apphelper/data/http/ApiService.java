package com.example.jwllls.apphelper.data.http;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by jwllls on 2017/11/27.
 */

public interface ApiService {

    public static final String BASE_URL = "http://112.124.22.238:8081/course_api/cniaoplay/";

    @GET("featured")
    Call<ResponseBody> getApps(@Query("q") String jsonPrama);


}
