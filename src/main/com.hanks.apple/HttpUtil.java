package com.hanks.apple;

import com.github.kevinsawicki.http.HttpRequest;

import java.net.URL;

import static com.github.kevinsawicki.http.HttpRequest.METHOD_GET;

public class HttpUtil {
    public static void main(String[] args) {
        String response = HttpRequest.get("https://releasezsdlkaoshih5.zijiapuzi.com/shouYiTiXian/getShouYeMingXi?personId=107&dateStr=2021-02").body();
        System.out.print(response);
    }

    public static HttpRequest get(final URL url) throws HttpRequest.HttpRequestException {
        return new HttpRequest(url, METHOD_GET);
    }
}
