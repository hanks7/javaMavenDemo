package com.hanks.apple;

import com.hanks.apple.utils.Ugson;

import java.util.ArrayList;
import java.util.HashMap;


public class HttpUtil2 extends BaseHttpUtl {
    static String base_url = "http://testzsdl.zijiapuzi.com";

    public static void main(String[] args) {

//        extracted3();//商店道具
//        getInfo();
//        roomList();
//        selectShopGiftList();
//        selectMyCentreWorksList();//获取文章列表
//        selectLatelyExamChapterList();//查询文章
//        selectMyOrderList();
//        selectShopGiftList();
//        selectByPayOrderInfo();
//        selectLatelyExamChapterList();
//        selectMyCentreWorksList();
//        selectLatelyExamChapterList();
//        selectMyOrderList();
//        selectMyFansList();
//        roomList();//近期考场
//        getInfo();//
//        selectMyFollowList();//我的关注
//        queryFollowState();
//        selectMyBadgeInfo();//个人勋章
//        selectMyPropList();//背包道具
//        selectShopGiftList();

//        belongToUser();//查看直推
//        forbidMonthBonus();//取消/恢复月度分红
//        setUserAutoPolling();//取消/恢复月度分红
        myInvitedList();
    }



    private static void myInvitedList() {
        String url = "http://testzsdl.zijiapuzi.com/account/user/myInvitedList";
        HashMap<String, Object> map = new HashMap<>();
        map.put("page", 1);
        map.put("rows", 10);
        map.put("userId", 634810);
        httpPost(url, map);
    }
    /**
     * 取消/恢复轮询
     */
    private static void setUserAutoPolling() {
        String url = "http://testzsdl.zijiapuzi.com/account/user/setUserAutoPolling";
        HashMap<String, Object> map = new HashMap<>();
        map.put("userId", 634810);
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
        map.put("userId", 634810);
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
        map.put("userId", 634810);
        httpPost(url, map);
    }

    private static void createQuestionsLibraryInfo() {
        String url = "http://testzsdl.zijiapuzi.com/social/questionsLibrary/createQuestionsLibraryInfo";
        HashMap<String, Object> map = new HashMap<>();
        map.put("productId", 3);
        httpPost(url, map);
    }

    private static void selectMyBadgeInfo() {
        String url = "http://testzsdl.zijiapuzi.com/account/userinfo/selectMyBadgeInfo";
        HashMap<String, Object> map = new HashMap<>();
        map.put("userId", 634810);
        httpPost(url, map);
    }

    /**
     * 查询关注状态
     */
    private static void queryFollowState() {
        String url = "http://testzsdl.zijiapuzi.com/social/follow/queryFollowState";
        HashMap<String, Object> map = new HashMap<>();
        map.put("userId", 634810);
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
        map.put("userId", 634810);
        httpPost(url, map);
    }

    private static void selectMyFansList() {
        String url = "http://testzsdl.zijiapuzi.com/social/follow/selectMyFansList";
        HashMap<String, Object> map = new HashMap<>();
        map.put("page", 1);
        map.put("rows", 10);
        map.put("userId", 634810);
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
        ExamListParam param = new ExamListParam();
        ArrayList<Long> list = new ArrayList<>();
        list.add(965716242728065L);
        param.setBookChapter(list);
        param.setBookId("965716242728064");
        String json = Ugson.toJson(param);
        httpGet(url, json);
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
        map.put("userId", 634810);
        httpPost(url, map);
    }

    /**
     * 商店道具
     */
    private static void selectLatelyExamList() {
        String url = "http://testzsdl.zijiapuzi.com/social/exam/selectLatelyExamList";
        HashMap<String, Object> map = new HashMap<>();
        map.put("page", 1);
        map.put("rows", 10);
        map.put("userId", 634810);
        httpPost(url, map);
    }

    private static void getInfo() {
        String url = "http://testzsdl.zijiapuzi.com/account/user/getInfo";
        HashMap<String, Object> map = new HashMap<>();
        map.put("userId", 634810);
        httpPost(url, map);
    }

    /**
     * 我加入的班级
     */
    private static void seleteMyJoinClassList() {
        String url = "http://testzsdl.zijiapuzi.com/social/classinfo/seleteMyJoinClassList";
        HashMap<String, Object> map = new HashMap<>();
        map.put("userId", 634810);
        httpPost(url, map);
    }

    private static void seleteHotClassList() {
        String url = "http://testzsdl.zijiapuzi.com/social/classinfo/seleteHotClassList";
        HashMap<String, Object> map = new HashMap<>();
        map.put("userId", 634810);
        httpPost(url, map);
    }

    private static void selectLatelyBookList() {
        String url = "http://testzsdl.zijiapuzi.com/social/exam/selectLatelyBookList";
        HashMap<String, Object> map = new HashMap<>();
        map.put("page", 1);
        map.put("rows", 10);
        map.put("userId", 634810);
        httpPost(url, map);
    }

    private static void selectShopPropList() {
        String url = "http://testzsdl.zijiapuzi.com/shop/shop/selectShopPropList";
        HashMap<String, Object> map = new HashMap<>();
        map.put("userId", 634810);
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
        map.put("userId", 634810);
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
        httpPost(url, map);
    }

    private static void selectMyPropList() {
        String url = "http://testzsdl.zijiapuzi.com/shop/prop/selectMyPropList";
        HashMap<String, Object> map = new HashMap<>();
        map.put("userId", 634810);
        httpPost(url, map);
    }


}
