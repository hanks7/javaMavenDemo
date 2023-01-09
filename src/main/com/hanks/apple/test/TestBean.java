package com.hanks.apple.test;

import java.io.Serializable;

public class TestBean {


    /**
     * status : 200
     * data : {"userId":634810,"userNickName":"夏天","userHeadUrl":"https://zsdlqn.zijiapuzi.com/20210429132523cdad7c56ed5c46209b5851fb5ed902ef.jpg","studentNumber":"370967","phone":"18670801569","userSex":0,"birthday":1611417600000,"age":1,"accountStatus":1,"forbidTest":0,"forbidComment":0,"forbidBonus":0,"userAuth":0,"provinceCode":null,"provinceName":null,"cityCode":"310000","cityName":"上海市","userSign":"发个根本扭扭捏捏","bgImgUrl":"https://zsdlqn.zijiapuzi.com/20210720144730e2e7058a501744a585508d52dde87e56.jpg","userInfoScore":71,"dayTaskScore":null,"identity":{"userId":634810,"userType":3,"isCenter":0,"isPartner":1,"creatorType":0,"isClassAdmin":0,"isVvip":0,"isMaster":1,"isInstructor":0,"instructorEndTime":null,"isSpecAccount":0,"createTime":1661478156000,"updateTime":null,"userAutoPolling":1},"socialInfo":{"userId":634810,"likesCount":0,"flowCount":0,"fansCount":0,"likesLastUpdate":null,"flowLastUpdate":null,"fansLastUpdate":null,"updateTime":null,"createTime":1662445826000},"token":"eyJhbGciOiJIUzI1NiJ9.eyJ1c2VyTmlja05hbWUiOiLlpI_lpKkiLCJleHAiOjE2NjQzNDM5NTYsInVzZXJJZCI6NjM0ODEwLCJpYXQiOjE2NjQyNTc1NTYsImp0aSI6IjI5NzY0YjcxMDJjZTRiZjJiYzJhMTE1ZmQxZmI0ZWY0In0.TO5eCnHvhUwEdHec2XRbIhwlH9tjpeDOjWHGiVGXvsk","easemobUser":{"userId":634810,"nickname":"夏天","password":"f2d136ea22a5b6e0ed0120a03ab795c2","createTime":1662445825000,"updateTime":null,"headImgUrl":"https://zsdlqn.zijiapuzi.com/20210429132523cdad7c56ed5c46209b5851fb5ed902ef.jpg"}}
     * msg :
     */

    private int status;
    private DataBean data;
    private String msg;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public static class DataBean implements Serializable {
        /**
         * userId : 634810
         * userNickName : 夏天
         * userHeadUrl : https://zsdlqn.zijiapuzi.com/20210429132523cdad7c56ed5c46209b5851fb5ed902ef.jpg
         * studentNumber : 370967
         * phone : 18670801569
         * userSex : 0
         * birthday : 1611417600000
         * age : 1
         * accountStatus : 1
         * forbidTest : 0
         * forbidComment : 0
         * forbidBonus : 0
         * userAuth : 0
         * provinceCode : null
         * provinceName : null
         * cityCode : 310000
         * cityName : 上海市
         * userSign : 发个根本扭扭捏捏
         * bgImgUrl : https://zsdlqn.zijiapuzi.com/20210720144730e2e7058a501744a585508d52dde87e56.jpg
         * userInfoScore : 71
         * dayTaskScore : null
         * identity : {"userId":634810,"userType":3,"isCenter":0,"isPartner":1,"creatorType":0,"isClassAdmin":0,"isVvip":0,"isMaster":1,"isInstructor":0,"instructorEndTime":null,"isSpecAccount":0,"createTime":1661478156000,"updateTime":null,"userAutoPolling":1}
         * socialInfo : {"userId":634810,"likesCount":0,"flowCount":0,"fansCount":0,"likesLastUpdate":null,"flowLastUpdate":null,"fansLastUpdate":null,"updateTime":null,"createTime":1662445826000}
         * token : eyJhbGciOiJIUzI1NiJ9.eyJ1c2VyTmlja05hbWUiOiLlpI_lpKkiLCJleHAiOjE2NjQzNDM5NTYsInVzZXJJZCI6NjM0ODEwLCJpYXQiOjE2NjQyNTc1NTYsImp0aSI6IjI5NzY0YjcxMDJjZTRiZjJiYzJhMTE1ZmQxZmI0ZWY0In0.TO5eCnHvhUwEdHec2XRbIhwlH9tjpeDOjWHGiVGXvsk
         * easemobUser : {"userId":634810,"nickname":"夏天","password":"f2d136ea22a5b6e0ed0120a03ab795c2","createTime":1662445825000,"updateTime":null,"headImgUrl":"https://zsdlqn.zijiapuzi.com/20210429132523cdad7c56ed5c46209b5851fb5ed902ef.jpg"}
         */

        private int userId;
        private String userNickName;
        private String userHeadUrl;
        private String studentNumber;
        private String phone;
        private int userSex;
        private long birthday;
        private int age;
        private int accountStatus;
        private int forbidTest;
        private int forbidComment;
        private int forbidBonus;
        private int userAuth;
        private Object provinceCode;
        private Object provinceName;
        private String cityCode;
        private String cityName;
        private String userSign;
        private String bgImgUrl;
        private int userInfoScore;
        private Object dayTaskScore;
        private IdentityBean identity;
        private SocialInfoBean socialInfo;
        private String token;
        private EasemobUserBean easemobUser;

        public int getUserId() {
            return userId;
        }

        public void setUserId(int userId) {
            this.userId = userId;
        }

        public String getUserNickName() {
            return userNickName;
        }

        public void setUserNickName(String userNickName) {
            this.userNickName = userNickName;
        }

        public String getUserHeadUrl() {
            return userHeadUrl;
        }

        public void setUserHeadUrl(String userHeadUrl) {
            this.userHeadUrl = userHeadUrl;
        }

        public String getStudentNumber() {
            return studentNumber;
        }

        public void setStudentNumber(String studentNumber) {
            this.studentNumber = studentNumber;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public int getUserSex() {
            return userSex;
        }

        public void setUserSex(int userSex) {
            this.userSex = userSex;
        }

        public long getBirthday() {
            return birthday;
        }

        public void setBirthday(long birthday) {
            this.birthday = birthday;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public int getAccountStatus() {
            return accountStatus;
        }

        public void setAccountStatus(int accountStatus) {
            this.accountStatus = accountStatus;
        }

        public int getForbidTest() {
            return forbidTest;
        }

        public void setForbidTest(int forbidTest) {
            this.forbidTest = forbidTest;
        }

        public int getForbidComment() {
            return forbidComment;
        }

        public void setForbidComment(int forbidComment) {
            this.forbidComment = forbidComment;
        }

        public int getForbidBonus() {
            return forbidBonus;
        }

        public void setForbidBonus(int forbidBonus) {
            this.forbidBonus = forbidBonus;
        }

        public int getUserAuth() {
            return userAuth;
        }

        public void setUserAuth(int userAuth) {
            this.userAuth = userAuth;
        }

        public Object getProvinceCode() {
            return provinceCode;
        }

        public void setProvinceCode(Object provinceCode) {
            this.provinceCode = provinceCode;
        }

        public Object getProvinceName() {
            return provinceName;
        }

        public void setProvinceName(Object provinceName) {
            this.provinceName = provinceName;
        }

        public String getCityCode() {
            return cityCode;
        }

        public void setCityCode(String cityCode) {
            this.cityCode = cityCode;
        }

        public String getCityName() {
            return cityName;
        }

        public void setCityName(String cityName) {
            this.cityName = cityName;
        }

        public String getUserSign() {
            return userSign;
        }

        public void setUserSign(String userSign) {
            this.userSign = userSign;
        }

        public String getBgImgUrl() {
            return bgImgUrl;
        }

        public void setBgImgUrl(String bgImgUrl) {
            this.bgImgUrl = bgImgUrl;
        }

        public int getUserInfoScore() {
            return userInfoScore;
        }

        public void setUserInfoScore(int userInfoScore) {
            this.userInfoScore = userInfoScore;
        }

        public Object getDayTaskScore() {
            return dayTaskScore;
        }

        public void setDayTaskScore(Object dayTaskScore) {
            this.dayTaskScore = dayTaskScore;
        }

        public IdentityBean getIdentity() {
            return identity;
        }

        public void setIdentity(IdentityBean identity) {
            this.identity = identity;
        }

        public SocialInfoBean getSocialInfo() {
            return socialInfo;
        }

        public void setSocialInfo(SocialInfoBean socialInfo) {
            this.socialInfo = socialInfo;
        }

        public String getToken() {
            return token;
        }

        public void setToken(String token) {
            this.token = token;
        }

        public EasemobUserBean getEasemobUser() {
            return easemobUser;
        }

        public void setEasemobUser(EasemobUserBean easemobUser) {
            this.easemobUser = easemobUser;
        }

        public static class IdentityBean implements Serializable {
            /**
             * userId : 634810
             * userType : 3
             * isCenter : 0
             * isPartner : 1
             * creatorType : 0
             * isClassAdmin : 0
             * isVvip : 0
             * isMaster : 1
             * isInstructor : 0
             * instructorEndTime : null
             * isSpecAccount : 0
             * createTime : 1661478156000
             * updateTime : null
             * userAutoPolling : 1
             */

            private int userId;
            private int userType;
            private int isCenter;
            private int isPartner;
            private int creatorType;
            private int isClassAdmin;
            private int isVvip;
            private int isMaster;
            private int isInstructor;
            private Object instructorEndTime;
            private int isSpecAccount;
            private long createTime;
            private Object updateTime;
            private int userAutoPolling;

            public int getUserId() {
                return userId;
            }

            public void setUserId(int userId) {
                this.userId = userId;
            }

            public int getUserType() {
                return userType;
            }

            public void setUserType(int userType) {
                this.userType = userType;
            }

            public int getIsCenter() {
                return isCenter;
            }

            public void setIsCenter(int isCenter) {
                this.isCenter = isCenter;
            }

            public int getIsPartner() {
                return isPartner;
            }

            public void setIsPartner(int isPartner) {
                this.isPartner = isPartner;
            }

            public int getCreatorType() {
                return creatorType;
            }

            public void setCreatorType(int creatorType) {
                this.creatorType = creatorType;
            }

            public int getIsClassAdmin() {
                return isClassAdmin;
            }

            public void setIsClassAdmin(int isClassAdmin) {
                this.isClassAdmin = isClassAdmin;
            }

            public int getIsVvip() {
                return isVvip;
            }

            public void setIsVvip(int isVvip) {
                this.isVvip = isVvip;
            }

            public int getIsMaster() {
                return isMaster;
            }

            public void setIsMaster(int isMaster) {
                this.isMaster = isMaster;
            }

            public int getIsInstructor() {
                return isInstructor;
            }

            public void setIsInstructor(int isInstructor) {
                this.isInstructor = isInstructor;
            }

            public Object getInstructorEndTime() {
                return instructorEndTime;
            }

            public void setInstructorEndTime(Object instructorEndTime) {
                this.instructorEndTime = instructorEndTime;
            }

            public int getIsSpecAccount() {
                return isSpecAccount;
            }

            public void setIsSpecAccount(int isSpecAccount) {
                this.isSpecAccount = isSpecAccount;
            }

            public long getCreateTime() {
                return createTime;
            }

            public void setCreateTime(long createTime) {
                this.createTime = createTime;
            }

            public Object getUpdateTime() {
                return updateTime;
            }

            public void setUpdateTime(Object updateTime) {
                this.updateTime = updateTime;
            }

            public int getUserAutoPolling() {
                return userAutoPolling;
            }

            public void setUserAutoPolling(int userAutoPolling) {
                this.userAutoPolling = userAutoPolling;
            }
        }

        public static class SocialInfoBean implements Serializable {
            /**
             * userId : 634810
             * likesCount : 0
             * flowCount : 0
             * fansCount : 0
             * likesLastUpdate : null
             * flowLastUpdate : null
             * fansLastUpdate : null
             * updateTime : null
             * createTime : 1662445826000
             */

            private int userId;
            private int likesCount;
            private int flowCount;
            private int fansCount;
            private Object likesLastUpdate;
            private Object flowLastUpdate;
            private Object fansLastUpdate;
            private Object updateTime;
            private long createTime;

            public int getUserId() {
                return userId;
            }

            public void setUserId(int userId) {
                this.userId = userId;
            }

            public int getLikesCount() {
                return likesCount;
            }

            public void setLikesCount(int likesCount) {
                this.likesCount = likesCount;
            }

            public int getFlowCount() {
                return flowCount;
            }

            public void setFlowCount(int flowCount) {
                this.flowCount = flowCount;
            }

            public int getFansCount() {
                return fansCount;
            }

            public void setFansCount(int fansCount) {
                this.fansCount = fansCount;
            }

            public Object getLikesLastUpdate() {
                return likesLastUpdate;
            }

            public void setLikesLastUpdate(Object likesLastUpdate) {
                this.likesLastUpdate = likesLastUpdate;
            }

            public Object getFlowLastUpdate() {
                return flowLastUpdate;
            }

            public void setFlowLastUpdate(Object flowLastUpdate) {
                this.flowLastUpdate = flowLastUpdate;
            }

            public Object getFansLastUpdate() {
                return fansLastUpdate;
            }

            public void setFansLastUpdate(Object fansLastUpdate) {
                this.fansLastUpdate = fansLastUpdate;
            }

            public Object getUpdateTime() {
                return updateTime;
            }

            public void setUpdateTime(Object updateTime) {
                this.updateTime = updateTime;
            }

            public long getCreateTime() {
                return createTime;
            }

            public void setCreateTime(long createTime) {
                this.createTime = createTime;
            }
        }

        public static class EasemobUserBean implements Serializable {
            /**
             * userId : 634810
             * nickname : 夏天
             * password : f2d136ea22a5b6e0ed0120a03ab795c2
             * createTime : 1662445825000
             * updateTime : null
             * headImgUrl : https://zsdlqn.zijiapuzi.com/20210429132523cdad7c56ed5c46209b5851fb5ed902ef.jpg
             */

            private int userId;
            private String nickname;
            private String password;
            private long createTime;
            private Object updateTime;
            private String headImgUrl;

            public int getUserId() {
                return userId;
            }

            public void setUserId(int userId) {
                this.userId = userId;
            }

            public String getNickname() {
                return nickname;
            }

            public void setNickname(String nickname) {
                this.nickname = nickname;
            }

            public String getPassword() {
                return password;
            }

            public void setPassword(String password) {
                this.password = password;
            }

            public long getCreateTime() {
                return createTime;
            }

            public void setCreateTime(long createTime) {
                this.createTime = createTime;
            }

            public Object getUpdateTime() {
                return updateTime;
            }

            public void setUpdateTime(Object updateTime) {
                this.updateTime = updateTime;
            }

            public String getHeadImgUrl() {
                return headImgUrl;
            }

            public void setHeadImgUrl(String headImgUrl) {
                this.headImgUrl = headImgUrl;
            }
        }
    }
}
