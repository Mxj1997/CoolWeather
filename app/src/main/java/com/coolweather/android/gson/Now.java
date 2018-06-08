package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

public class Now {
    /**
     * JSON中一些字段不太适合直接作为java字段来命名，所以使用@SerializedName注解的方式来让JSON和java字段之间建立映射关系
     */

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }
}
