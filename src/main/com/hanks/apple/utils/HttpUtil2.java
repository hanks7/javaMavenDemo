package com.hanks.apple.utils;

import java.util.HashMap;


public class HttpUtil2 extends BaseHttpUtl {
    static String base_url = "http://testzsdl.zijiapuzi.com";

    public static void main(String[] args) {

//        selectLatelyBookList();
//        selectChapterDetail();
//        selectMyBadgeInfo();

//        selectLatelyBookList();
//        selectLatelyExamList();

//        selectMyCentreWorksList();
//        createElectricRecord();

//        createElectricRecord();
//        selectChapterRewardRecordList();

//        selectChapterDetail();

//        selectChapterDetail();

//        selectChapterDetail();

//        httpPost(
//                "http://testzsdl.zijiapuzi.com/account/electricRecharge/createPayElectricRecharge"
//                ,
//                "{" +
//                        "\"payType\":1," +
//                        "\"rechargeBusinessNumber\":\"101Q202211231634386405080394\"," +
//                        "\"payPassword\":\"123456\"" +
//                        "}"
//        );
//        selectChapterDetail();
//        httpPost(
//                "http://testzsdl.zijiapuzi.com/account/account/myCreditCareer"
//                ,
//                "{\"userId\":\"634810\"}"
//        );

//        httpPost(
//                "http://testzsdl.zijiapuzi.com/thirdParty/aliyun/smartVerify/init"
//                ,
//                "{\"certNo\":\"341102199008010616\",\"metaInfo\":\"{\\\"apdidToken\\\":\\\"\\\",\\\"appName\\\":\\\"com.riying.educated\\\",\\\"appVersion\\\":\\\"2.0\\\",\\\"bioMetaInfo\\\":\\\"5.1.0:11501568,4\\\",\\\"deviceBrand\\\":\\\"Redmi\\\",\\\"deviceManufacturer\\\":\\\"Xiaomi\\\",\\\"deviceModel\\\":\\\"M2010J19SC\\\",\\\"deviceType\\\":\\\"android\\\",\\\"identityVer\\\":\\\"1.0.0\\\",\\\"osVersion\\\":\\\"11\\\",\\\"sdkVersion\\\":\\\"1.3.2\\\"}\",\"certName\":\"侯建军\",\"mobile\":\"18670801569\",\"userId\":634810}\n" +
//                        " "
//        );

/*        请求url:http://testzsdl.zijiapuzi.com/social/chapter/selectChapterDetail
        请求方式:POST
        请求Content-Type:application/json; charset=utf-8
        请求参数:{"chapterId":975218698563353,"userId":634810}
        */
//        httpPost(
//                "http://testzsdl.zijiapuzi.com/social/chapter/selectChapterDetail"
//                ,
//                "{\"chapterId\":975218698563353,\"userId\":634810}"
//        );
//        请求url:http://testzsdl.zijiapuzi.com/account/bankcard/selectUserBankCardType
//        请求方式:POST
//        请求Content-Type:application/json; charset=utf-8
//        请求参数:{"bankCardNumber":"6226095511409778","userId":634810}

//        userTestList();

//        selectChapterDetail();


//        selectLatelyExamChapterList();
//        selectChapterRewardRecordList();
//        userAuth();

//        myCreditCareer();

//        userTestList();

//        httpPost(
//                "http://testzsdl.zijiapuzi.com/account/bankcard/selectUserBankCardType"
//                ,
//                "{\"bankCardNumber\":\"6226095511409778\",\"userId\":634810}"
//        );
//        httpPost(
//                "http://testzsdl.zijiapuzi.com/account/withdrawal/selectWithdrawalRecordList"
//                ,
//                "{\"userId\":107}"
//        );
        /**
         * 请求url:http://testzsdl.zijiapuzi.com/account/withdrawal/bindingWX
         *     请求方式:POST
         *     请求Content-Type:application/json; charset=utf-8
         *     请求参数:{"code":"091ZV3Ja1f41pE0qPrIa1FEcNa1ZV3JF","userId":634810}
         */
//        httpPost(
//                "http://testzsdl.zijiapuzi.com/account/withdrawal/bindingWX"
//                ,
//                "{\"code\":\"0119ux0w344PKZ2wvv0w3uw0MS39ux0A\",\"userId\":634810}"
//        );
        /**
         *     请求url:http://testzsdl.zijiapuzi.com/account/bankcard/bindingBankCard
         *     请求方式:POST
         *     请求Content-Type:application/json; charset=utf-8
         *     请求参数:{"code":"123456","bankCardNumber":"6226095511409778","phone":"18670801569","userId":634810}
         *     请求结果:{"status":500,"msg":"操作失败，系统繁忙","data":null}
         */
//        httpPost(
//                "http://testzsdl.zijiapuzi.com/account/bankcard/bindingBankCard"
//                ,
//                "{\"code\":\"123456\",\"bankCardNumber\":\"6226095511409778\",\"phone\":\"18670801569\",\"userId\":634810}"
//        );

//        selectShopGiftList();

//        selectUserWithdrawalInfo();

//        httpPost(
//                "http://testzsdl.zijiapuzi.com/account/withdrawal/selectUserWithdrawalInfo"
//                ,
//                "{\"withdrawalType\":1,\"userId\":634810}"
//        );
//        httpPost(
//                "http://testzsdl.zijiapuzi.com/account/withdrawal/selectUserWithdrawalInfo"
//                ,
//                "{\"withdrawalType\":3,\"userId\":634810}"
//        );


/*        String url = "http://testzsdl.zijiapuzi.com/account/withdrawal/createBalanceWithdrawal";
        HashMap<String, Object> map = new HashMap<>();
        map.put("userId", "1094540");
        map.put("withdrawalType", 3);
        map.put("withdrawalAmount", 40);
        map.put("password", "123456");
        map.put("id", "6227002584510479656");
        httpPost(url, map);

        HashMap<String, Object> map2 = new HashMap<>();
        map2.put("userId", "634810");
        map2.put("withdrawalType", 1);
        map2.put("withdrawalAmount", 40);
        map2.put("password", "123456");
        httpPost(url, map2);*/


//        请求url:http://testzsdl.zijiapuzi.com/account/withdrawal/createBalanceWithdrawal
//        请求方式:POST
//        请求Content-Type:application/json; charset=utf-8
//        请求参数:{"withdrawalType":1,"password":"123456","withdrawalAmount":"156","userId":634810}
//        请求结果:{"status":200,"msg":"","data":""}

//        httpPost("http://testzsdl.zijiapuzi.com/account/withdrawal/selectUserWithdrawalInfo",
//                "{\"withdrawalType\":1,\"password\":\"123456\",\"withdrawalAmount\":\"100\",\"userId\":634810}");


        httpPost("http://testzsdl.zijiapuzi.com/account/user/belongToPartner",
                "{\"userId\":944139491635584}");

    }

    private static void selectUserWithdrawalInfo() {
        String url = "http://testzsdl.zijiapuzi.com/account/withdrawal/selectUserWithdrawalInfo";
        httpPost(url, "{\"withdrawalType\":1,\"userId\":634810}");
    }


    //考试记录
    private static void userAuth() {
        String url = "http://testzsdl.zijiapuzi.com/account/user/userAuth";
        HashMap<String, Object> map = new HashMap<>();
        map.put("userId", 631613);
        map.put("realName", "侯建军");
        map.put("idNumber", 341102199008010616L);
        httpPost(url, map);
    }

    //考试记录
    private static void userTestList() {
        String url = "http://testzsdl.zijiapuzi.com/event/exam/userTestList";
        HashMap<String, Object> map = new HashMap<>();
        map.put("userId", 107);
        map.put("page", 1);
        map.put("rows", 10);
        httpPost(url, map);
    }

    //充电榜单
    private static void selectChapterRewardRecordList() {
        String url = "http://testzsdl.zijiapuzi.com/social/chapterreward/selectChapterRewardRecordList";
        HashMap<String, Object> map = new HashMap<>();
        map.put("userId", 631613);
        map.put("chapterId", 978787094983572l);
        map.put("page", 1);
        map.put("rows", 10);
        httpPost(url, "{\"chapterId\":978787094983572,\"page\":1,\"rows\":3}");
    }


    //打赏
    private static void createElectricRecord() {
        String url = "http://testzsdl.zijiapuzi.com/account/electricrecord/createElectricRecord";
        HashMap<String, Object> map = new HashMap<>();
        map.put("userId", 631613);
        map.put("chapterId", 970910527559681l);
        map.put("page", 1);
        map.put("rows", 10);
        httpPost(url, "{\"rewardId\":631613,\"chapterId\":978787094983572,\"rewardedId\":924394411035909," +
                "\"payPassword\":\"123456\",\"rewardElectricity\":\"1\"}");
    }

    private static void selectChapterList() {
        String url = "http://testzsdl.zijiapuzi.com/social/chapter/selectChapterList";
        HashMap<String, Object> map = new HashMap<>();
        map.put("examBookId", 974517478033665L);
        httpPost(url, map);
    }

    private static void myCreditCareer() {
        String url = "http://testzsdl.zijiapuzi.com/account/account/myCreditCareer";
        HashMap<String, Object> map = new HashMap<>();
        map.put("userId", 631613);
        httpPost(url, map);
    }


    /**
     * 尊享身份
     */
    private static void selectMyBadgeInfo() {
        String url = "http://testzsdl.zijiapuzi.com/account/userinfo/selectMyBadgeInfo";
        HashMap<String, Object> map = new HashMap<>();
        map.put("userId", 634810);
        httpPost(url, "{\"userId\":\"634810\"}");
    }


    private static void creatOrder() {
        String url = "http://testzsdl.zijiapuzi.com/shop/order/creatOrder";
        httpPost(url,
                "{\"id\":\"980981345147776\"" +
                        ",\"payPassword\":\"123456\"" +
                        ",\"payType\":1" +
                        ",\"productId\":\"46\"" +
                        ",\"productNumbers\":1" +
                        ",\"productSkuId\":\"null\"" +
                        ",\"terminalType\":3" +
                        ",\"userId\":\"634810\"}");
    }

    /**
     * 查询章节详情 userId
     * string
     * 用户获取用户之间的关注状态
     * chapterId
     * string
     * roomId
     * string
     * 查询近期必考时必传
     */
    private static void selectChapterDetail() {
        String url = "http://testzsdl.zijiapuzi.com/social/chapter/selectChapterDetail";
        HashMap<String, Object> map = new HashMap<>();
        map.put("userId", 634810);
        map.put("chapterId", 975218690174806L);
        map.put("roomId", 995579226100228L);
        httpPost(url, map);
    }


    private static void selectUserAddressList() {
        String url = "http://testzsdl.zijiapuzi.com/base/address/selectUserAddressList";
        HashMap<String, Object> map = new HashMap<>();
        map.put("userId", 631613);
        httpPost(url, map);
    }


    private static void selectShopGiftInfo() {
        String url = "http://testzsdl.zijiapuzi.com/shop/shop/selectShopGiftInfo";
        HashMap<String, Object> map = new HashMap<>();
        map.put("productId", 71);
        httpPost(url, map);
    }

    /**
     * 首页房间 最近访问考场
     */
    private static void lastRoom() {
        String url = "http://testzsdl.zijiapuzi.com/event/examRoom/lastRoom";
        HashMap<String, Object> map = new HashMap<>();
        map.put("userId", 107);
        httpPost(url, map);
    }

    private static void myPocket() {
        String url = "http://testzsdl.zijiapuzi.com/account/account/myPocket";
        HashMap<String, Object> map = new HashMap<>();
        map.put("userId", 924394411035909L);
        httpPost(url, map);
    }

    private static void myInvitedList() {
        String url = "http://testzsdl.zijiapuzi.com/account/user/myInvitedList";
        HashMap<String, Object> map = new HashMap<>();
        map.put("page", 1);
        map.put("rows", 10);
        map.put("userId", 631613);
        httpPost(url, map);
    }

    /**
     * 取消/恢复轮询
     */
    private static void setUserAutoPolling() {
        String url = "http://testzsdl.zijiapuzi.com/account/user/setUserAutoPolling";
        HashMap<String, Object> map = new HashMap<>();
        map.put("userId", 631613);
        map.put("fromUserId", 107);
        map.put("forbidValue", 0);//  1.恢复 2.关闭
        httpPost(url, map);
    }

    /**
     * 取消/恢复月度分红
     */
    private static void forbidMonthBonus() {
        String url = "http://testzsdl.zijiapuzi.com/account/account/forbidMonthBonus";
        HashMap<String, Object> map = new HashMap<>();
        map.put("userId", 631613);
        map.put("fromUserId", 107);
        map.put("forbidValue", 0);//0.恢复 1.禁止
        httpPost(url, map);
    }

    /**
     * 查看推荐人
     */
    private static void belongToUser() {
        String url = "http://testzsdl.zijiapuzi.com/account/user/belongToUser";
        HashMap<String, Object> map = new HashMap<>();
        map.put("userId", 631613);
        httpPost(url, map);
    }

    private static void createQuestionsLibraryInfo() {
        String url = "http://testzsdl.zijiapuzi.com/social/questionsLibrary/createQuestionsLibraryInfo";
        HashMap<String, Object> map = new HashMap<>();
        map.put("productId", 3);
        httpPost(url, map);
    }


    /**
     * 查询关注状态
     */
    private static void queryFollowState() {
        String url = "http://testzsdl.zijiapuzi.com/social/follow/queryFollowState";
        HashMap<String, Object> map = new HashMap<>();
        map.put("userId", 631613);
        map.put("beUserId", 107);
        httpPost(url, map);
    }


    /**
     * 我的关注
     */
    private static void selectMyFollowList() {
        String url = "http://testzsdl.zijiapuzi.com/social/follow/selectMyFollowList";
        HashMap<String, Object> map = new HashMap<>();
        map.put("page", 1);
        map.put("rows", 10);
        map.put("userId", 1094540);
        httpPost(url, map);
    }

    private static void selectMyFansList() {
        String url = "http://testzsdl.zijiapuzi.com/social/follow/selectMyFansList";
        HashMap<String, Object> map = new HashMap<>();
        map.put("page", 1);
        map.put("rows", 10);
        map.put("userId", 631613);
        httpPost(url, map);
    }


    /**
     * 订单详情
     */
    private static void selectMyOrderInfo() {
        String url = "http://testzsdl.zijiapuzi.com/shop/order/selectMyOrderInfo";
        HashMap<String, Object> map = new HashMap<>();
        map.put("id", 963913480492161L);
        httpPost(url, map);
    }

    /**
     * 查询近期考试列表中必考的章节
     * {
     * "bookId": "965716242728064",
     * "bookChapter": [965716242728065]
     * }
     */
    private static void selectLatelyExamChapterList() {
        String url = "http://testzsdl.zijiapuzi.com/social/exam/selectLatelyExamChapterList";
//        ExamListParam param = new ExamListParam();
//        ArrayList<Long> list = new ArrayList<>();
//        list.add(965716242728065L);
//        param.setBookChapter(list);
//        param.setBookId("965716242728064");
//        String json = Ugson.toJson(param);
        httpPost(url, "{ \"bookId\":\"985314656812561\"}");
    }


    /**
     * 获取考试书id
     */
    private static void selectMyCentreWorksList() {
        String url = "http://testzsdl.zijiapuzi.com/social/exam/selectMyCentreWorksList";
        HashMap<String, Object> map = new HashMap<>();
        map.put("page", 1);
        map.put("rows", 10);
        map.put("channelId", 1);
        httpPost(url, map);
    }

    private static void selectBannerlList() {
        String url = "http://testzsdl.zijiapuzi.com/zsdlbase/banner/selectBannerlList";
        HashMap<String, Object> map = new HashMap<>();
        httpPost(url, map);
    }

    /**
     * 我的订单
     */
    private static void selectMyOrderList() {
        String url = "http://testzsdl.zijiapuzi.com/shop/order/selectMyOrderList";
        HashMap<String, Object> map = new HashMap<>();
        map.put("page", 1);
        map.put("rows", 10);
        map.put("wlSendState", 3);//物流发货状态1.待发货 2.待收货 3.已签收
        map.put("userId", 631613);
        httpPost(url, map);
    }

    /**
     *
     */
    private static void selectLatelyExamList() {
        String url = "http://testzsdl.zijiapuzi.com/social/exam/selectLatelyExamList";
        HashMap<String, Object> map = new HashMap<>();
        map.put("page", 1);
        map.put("rows", 10);
        map.put("userId", 631613);
        httpPost(url, map);
    }

    private static void getInfo() {
        String url = "http://testzsdl.zijiapuzi.com/account/user/getInfo";
        HashMap<String, Object> map = new HashMap<>();
        map.put("userId", 107);
        httpPost(url, map);
    }

    /**
     * 我加入的班级
     */
    private static void seleteMyJoinClassList() {
        String url = "http://testzsdl.zijiapuzi.com/social/classinfo/seleteMyJoinClassList";
        HashMap<String, Object> map = new HashMap<>();
        map.put("userId", 631613);
        httpPost(url, map);
    }

    private static void seleteHotClassList() {
        String url = "http://testzsdl.zijiapuzi.com/social/classinfo/seleteHotClassList";
        HashMap<String, Object> map = new HashMap<>();
        map.put("userId", 631613);
        httpPost(url, map);
    }

    private static void selectLatelyBookList() {
        String url = "http://testzsdl.zijiapuzi.com/social/exam/selectLatelyBookList";
        HashMap<String, Object> map = new HashMap<>();
        map.put("page", 1);
        map.put("rows", 10);
        map.put("userId", 631613);
        httpPost(url, "{\"page\":1,\"rows\":10,\"userId\":1094540}");
    }

    private static void selectShopPropList() {
        String url = "http://testzsdl.zijiapuzi.com/shop/shop/selectShopPropList";
        HashMap<String, Object> map = new HashMap<>();
        map.put("userId", 631613);
        map.put("page", 1);
        map.put("rows", 10);
        map.put("shelvesState", 1);//上下架状态 1.上架 2.下架

        httpPost(url, map);
    }

    /**
     * 商店礼包
     */
    private static void selectShopGiftList() {
        String url = "http://testzsdl.zijiapuzi.com/shop/shop/selectShopGiftList";
        HashMap<String, Object> map = new HashMap<>();
        map.put("userId", 631613);
        map.put("page", 1);
        map.put("rows", 10);
        map.put("shelvesState", 1);//上下架状态 1.上架 2.下架

        httpPost(url, map);
    }

    /**
     * 近期考场
     */
    private static void roomList() {
        String url = base_url + "/event/examRoom/roomList";
        HashMap<String, Object> map = new HashMap<>();
        map.put("page", 1);
        map.put("rows", 10);
        map.put("userId", 107);
        map.put("searchType", 1);
        httpPost(url, "{\"searchType\":4,\"page\":1,\"rows\":10,\"userId\":107}");
    }

    private static void selectMyPropList() {
        String url = "http://testzsdl.zijiapuzi.com/shop/prop/selectMyPropList";
        HashMap<String, Object> map = new HashMap<>();
        map.put("userId", 631613);
        httpPost(url, map);
    }


}
