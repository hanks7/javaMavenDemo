package com.hanks.apple;

public class AuthInfoBean {


    /**
     * userNickName : 好的好的就到家
     * realName : 张三
     * userAuth : 0.0
     * userAuthType : 1.0
     * idNumber : 1
     */

    private String userNickName;
    private String realName;
    private double userAuth;
    private double userAuthType;
    private String idNumber;

    public String getUserNickName() {
        return userNickName;
    }

    public void setUserNickName(String userNickName) {
        this.userNickName = userNickName;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public double getUserAuth() {
        return userAuth;
    }

    public void setUserAuth(double userAuth) {
        this.userAuth = userAuth;
    }

    public double getUserAuthType() {
        return userAuthType;
    }

    public void setUserAuthType(double userAuthType) {
        this.userAuthType = userAuthType;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }
}
