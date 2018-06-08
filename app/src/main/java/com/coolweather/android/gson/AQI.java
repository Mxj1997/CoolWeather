package com.coolweather.android.gson;

public class AQI {
    /**
     * JSON中一些字段不太适合直接作为java字段来命名，所以使用@SerializedName注解的方式来让JSON和java字段之间建立映射关系
     */

    public AQICity city;

    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
