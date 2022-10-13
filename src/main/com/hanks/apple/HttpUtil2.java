package com.hanks.apple;

import java.util.HashMap;

public class HttpUtil2 extends BaseHttpUtl {
    static String base_url = "http://testzsdl.zijiapuzi.com";

    public static void main(String[] args) {

        extracted2();
    }

    private static void extracted() {
        String url = base_url + "/event/examRoom/roomList";
        HashMap<String, Object> map = new HashMap<>();
        map.put("page", 1);
        map.put("rows", 10);
        map.put("userId", 634810);
        map.put("searchType", 1);
        getHttpRequest(url, map);
    }

    private static void extracted2() {
        String url = "http://testzsdl.zijiapuzi.com/shop/prop/selectMyPropList";
        HashMap<String, Object> map = new HashMap<>();
        map.put("userId", 634810);
        getHttpRequest(url, map);
    }


}
