package com.example.fenice.leweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Fenice on 2017/6/11.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{

        @SerializedName("loc")
        public String updateTime;

    }

}
