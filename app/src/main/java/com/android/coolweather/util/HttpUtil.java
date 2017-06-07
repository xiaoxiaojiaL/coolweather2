package com.android.coolweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by Administrator on 2017-06-06.
 */

public class HttpUtil {
    public  static  void sendOkHttpRequest(String address,okhttp3.Callback callback){
        //创建OkHttps实例
        OkHttpClient client=new OkHttpClient();
        //发起一条Http请求，就需要创建一个Request对象：
        Request request=new Request.Builder().url(address).build();
       //之后调用OkHttpClient的newCall()方法来创建一个Call对象，并调用它的execute()方法来发送请求并获取服务器返回的数据。
        client.newCall(request).enqueue(callback);
    }
}
