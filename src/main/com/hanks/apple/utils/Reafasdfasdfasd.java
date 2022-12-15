package com.hanks.apple.utils;

import java.util.List;

public class Reafasdfasdfasd {

    private String msg;
    private DataBean data;
    private int status;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public static class DataBean {
        private int testCount;
        private int registerDays;
        private int creditSum;
        private List<CreditTaskDayListBean> creditTaskDayList;
        private CreditScoreLeveLBean creditScoreLeveL;
        private List<CreditScoreListBean> creditScoreList;
        private int passPercent;
        private List<UserLevelRecordListBean> userLevelRecordList;

        public int getTestCount() {
            return testCount;
        }

        public void setTestCount(int testCount) {
            this.testCount = testCount;
        }

        public int getRegisterDays() {
            return registerDays;
        }

        public void setRegisterDays(int registerDays) {
            this.registerDays = registerDays;
        }

        public int getCreditSum() {
            return creditSum;
        }

        public void setCreditSum(int creditSum) {
            this.creditSum = creditSum;
        }

        public List<CreditTaskDayListBean> getCreditTaskDayList() {
            return creditTaskDayList;
        }

        public void setCreditTaskDayList(List<CreditTaskDayListBean> creditTaskDayList) {
            this.creditTaskDayList = creditTaskDayList;
        }

        public CreditScoreLeveLBean getCreditScoreLeveL() {
            return creditScoreLeveL;
        }

        public void setCreditScoreLeveL(CreditScoreLeveLBean creditScoreLeveL) {
            this.creditScoreLeveL = creditScoreLeveL;
        }

        public List<CreditScoreListBean> getCreditScoreList() {
            return creditScoreList;
        }

        public void setCreditScoreList(List<CreditScoreListBean> creditScoreList) {
            this.creditScoreList = creditScoreList;
        }

        public int getPassPercent() {
            return passPercent;
        }

        public void setPassPercent(int passPercent) {
            this.passPercent = passPercent;
        }

        public List<UserLevelRecordListBean> getUserLevelRecordList() {
            return userLevelRecordList;
        }

        public void setUserLevelRecordList(List<UserLevelRecordListBean> userLevelRecordList) {
            this.userLevelRecordList = userLevelRecordList;
        }

        public static class CreditScoreLeveLBean {
            private int score;
            private String logoImgUrl;
            private int level;
            private String levelName;
            private int id;

            public int getScore() {
                return score;
            }

            public void setScore(int score) {
                this.score = score;
            }

            public String getLogoImgUrl() {
                return logoImgUrl;
            }

            public void setLogoImgUrl(String logoImgUrl) {
                this.logoImgUrl = logoImgUrl;
            }

            public int getLevel() {
                return level;
            }

            public void setLevel(int level) {
                this.level = level;
            }

            public String getLevelName() {
                return levelName;
            }

            public void setLevelName(String levelName) {
                this.levelName = levelName;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }
        }

        public static class CreditTaskDayListBean {
            private int limit;
            private String taskName;
            private int taskId;
            private int isComplete;

            public int getLimit() {
                return limit;
            }

            public void setLimit(int limit) {
                this.limit = limit;
            }

            public String getTaskName() {
                return taskName;
            }

            public void setTaskName(String taskName) {
                this.taskName = taskName;
            }

            public int getTaskId() {
                return taskId;
            }

            public void setTaskId(int taskId) {
                this.taskId = taskId;
            }

            public int getIsComplete() {
                return isComplete;
            }

            public void setIsComplete(int isComplete) {
                this.isComplete = isComplete;
            }
        }

        public static class CreditScoreListBean {
            private int score;
            private String logoImgUrl;
            private int level;
            private String levelName;
            private int id;

            public int getScore() {
                return score;
            }

            public void setScore(int score) {
                this.score = score;
            }

            public String getLogoImgUrl() {
                return logoImgUrl;
            }

            public void setLogoImgUrl(String logoImgUrl) {
                this.logoImgUrl = logoImgUrl;
            }

            public int getLevel() {
                return level;
            }

            public void setLevel(int level) {
                this.level = level;
            }

            public String getLevelName() {
                return levelName;
            }

            public void setLevelName(String levelName) {
                this.levelName = levelName;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }
        }

        public static class UserLevelRecordListBean {
            private int stockValue;
            private Object receiveTime;
            private String propCount;
            private String stockIconUrl;
            private List<PropListBean> propList;
            private long createTime;
            private LevelBean level;
            private int levelId;
            private int propIsReceive;
            private int userId;
            private int rewardMaster;

            public int getStockValue() {
                return stockValue;
            }

            public void setStockValue(int stockValue) {
                this.stockValue = stockValue;
            }

            public Object getReceiveTime() {
                return receiveTime;
            }

            public void setReceiveTime(Object receiveTime) {
                this.receiveTime = receiveTime;
            }

            public String getPropCount() {
                return propCount;
            }

            public void setPropCount(String propCount) {
                this.propCount = propCount;
            }

            public String getStockIconUrl() {
                return stockIconUrl;
            }

            public void setStockIconUrl(String stockIconUrl) {
                this.stockIconUrl = stockIconUrl;
            }

            public List<PropListBean> getPropList() {
                return propList;
            }

            public void setPropList(List<PropListBean> propList) {
                this.propList = propList;
            }

            public long getCreateTime() {
                return createTime;
            }

            public void setCreateTime(long createTime) {
                this.createTime = createTime;
            }

            public LevelBean getLevel() {
                return level;
            }

            public void setLevel(LevelBean level) {
                this.level = level;
            }

            public int getLevelId() {
                return levelId;
            }

            public void setLevelId(int levelId) {
                this.levelId = levelId;
            }

            public int getPropIsReceive() {
                return propIsReceive;
            }

            public void setPropIsReceive(int propIsReceive) {
                this.propIsReceive = propIsReceive;
            }

            public int getUserId() {
                return userId;
            }

            public void setUserId(int userId) {
                this.userId = userId;
            }

            public int getRewardMaster() {
                return rewardMaster;
            }

            public void setRewardMaster(int rewardMaster) {
                this.rewardMaster = rewardMaster;
            }

            public static class LevelBean {
                private int score;
                private String logoImgUrl;
                private int level;
                private String levelName;
                private int id;

                public int getScore() {
                    return score;
                }

                public void setScore(int score) {
                    this.score = score;
                }

                public String getLogoImgUrl() {
                    return logoImgUrl;
                }

                public void setLogoImgUrl(String logoImgUrl) {
                    this.logoImgUrl = logoImgUrl;
                }

                public int getLevel() {
                    return level;
                }

                public void setLevel(int level) {
                    this.level = level;
                }

                public String getLevelName() {
                    return levelName;
                }

                public void setLevelName(String levelName) {
                    this.levelName = levelName;
                }

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }
            }

            public static class PropListBean {
                private Object productSkuId;
                private String prpoPicture;
                private int unitQuantity;
                private String propsName;
                private int id;

                public Object getProductSkuId() {
                    return productSkuId;
                }

                public void setProductSkuId(Object productSkuId) {
                    this.productSkuId = productSkuId;
                }

                public String getPrpoPicture() {
                    return prpoPicture;
                }

                public void setPrpoPicture(String prpoPicture) {
                    this.prpoPicture = prpoPicture;
                }

                public int getUnitQuantity() {
                    return unitQuantity;
                }

                public void setUnitQuantity(int unitQuantity) {
                    this.unitQuantity = unitQuantity;
                }

                public String getPropsName() {
                    return propsName;
                }

                public void setPropsName(String propsName) {
                    this.propsName = propsName;
                }

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }
            }
        }
    }
}
