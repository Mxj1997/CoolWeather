package com.coolweather.android.gson;

import com.coolweather.android.db.City;
import com.google.gson.annotations.SerializedName;

public class Basic {

    /**
     * JSON中一些字段不太适合直接作为java字段来命名，所以使用@SerializedName注解的方式来让JSON和java字段之间建立映射关系
     */

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String wertherId;

    public Update update;

    public class Update{

        @SerializedName("loc")
        public String updateTime;
    }
}
