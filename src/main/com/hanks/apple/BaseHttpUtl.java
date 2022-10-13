package com.hanks.apple;

import com.github.kevinsawicki.http.HttpRequest;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParser;
import com.hanks.apple.utils.Ugson;

import java.net.URL;
import java.util.HashMap;

import static com.github.kevinsawicki.http.HttpRequest.METHOD_GET;

public class BaseHttpUtl {

    public static void show(String strResponseJson) {
        System.out.println(strResponseJson);
    }

    public static String getHttpRequest(String url, HashMap<String, Object> map) {
        String JsonStr = Ugson.toJson(map);
        show("请求url:\n" + url);
        show("请求参数:\n" + getJsonFormat(JsonStr));
        // 发起post请求 resp1接收返回的数据
        HttpRequest request = HttpRequest.post(url);
        request.header("Content-Type", "application/json");
        HttpRequest h = request.send(JsonStr);
        String strResponse = h.body();
        String s = getJsonFormat(strResponse);
        show("请求结果:\n" +s);
        return s;
    }

    public static String getHttpRequest(String url, String JsonStr) {
        show("请求url:\n" + url);
        show("请求参数:\n" + getJsonFormat(JsonStr));
        // 发起post请求 resp1接收返回的数据
        HttpRequest request = HttpRequest.post(url);
        request.header("Content-Type", "application/json");
        HttpRequest h = request.send(JsonStr);
        String strResponse = h.body();
        String s = getJsonFormat(strResponse);
        show("请求结果:\n" +s);
        return s;
    }

    private static String getJsonFormat(String strResponse) {
        return new GsonBuilder()
                .setPrettyPrinting()
                .create()
                .toJson(new JsonParser().parse(strResponse));
    }

    public static HttpRequest get(final URL url) throws HttpRequest.HttpRequestException {
        return new HttpRequest(url, METHOD_GET);
    }

}
