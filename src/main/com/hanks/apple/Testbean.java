package com.hanks.apple;

import java.io.Serializable;
import java.util.List;

public class Testbean {

    /**
     * status : 200
     * data : [{"propId":1,"propName":"小纸条","productType":2,"productGiftType":0,"shelvesState":1,"propEffect":"默认选择正确每场考试限用3张","isDelete":0,"sort":5,"propSumIn":12,"propSumOut":12,"propStock":0},{"propId":2,"propName":"补考证","productType":2,"productGiftType":0,"shelvesState":1,"propEffect":"答错后默认使用+50分（无补考证-50分）","isDelete":0,"sort":4,"propSumIn":12,"propSumOut":12,"propStock":0},{"propId":3,"propName":"橡皮擦","productType":2,"productGiftType":0,"shelvesState":1,"propEffect":"排除一个错误选项每题限用1块","isDelete":0,"sort":3,"propSumIn":14,"propSumOut":14,"propStock":0},{"propId":4,"propName":"小红花","productType":2,"productGiftType":0,"shelvesState":1,"propEffect":"积攒10朵小红花可用于修改头像昵称","isDelete":0,"sort":2,"propSumIn":19,"propSumOut":0,"propStock":19},{"propId":7,"propName":"学分加速卡","productType":2,"productGiftType":0,"shelvesState":1,"propEffect":"在原有获得学分基础上额外增加100%","isDelete":0,"sort":1,"createTime":1660790127000,"propSumIn":0,"propSumOut":0,"propStock":0},{"propId":100,"propName":"教员礼包","instructorEndDay":0,"inBuy":1}]
     * msg :
     */

    private List<MyPropBean> data;

    public List<MyPropBean> getData() {
        return data;
    }

    public void setData(List<MyPropBean> data) {
        this.data = data;
    }

    public static class MyPropBean implements Serializable {
        /**
         * propId : 1
         * propName : 小纸条
         * productType : 2
         * productGiftType : 0
         * shelvesState : 1
         * propEffect : 默认选择正确每场考试限用3张
         * isDelete : 0
         * sort : 5
         * propSumIn : 12
         * propSumOut : 12
         * propStock : 0
         * createTime : 1660790127000
         * instructorEndDay : 0
         * inBuy : 1
         */

        private int propId;
        private String propName;
        private int productType;
        private int productGiftType;
        private int shelvesState;
        private String propEffect;
        private int isDelete;
        private int sort;
        private int propSumIn;
        private int propSumOut;
        private int propStock;
        private long createTime;
        private int instructorEndDay;
        private int inBuy;

        public int getPropId() {
            return propId;
        }

        public void setPropId(int propId) {
            this.propId = propId;
        }

        public String getPropName() {
            return propName;
        }

        public void setPropName(String propName) {
            this.propName = propName;
        }

        public int getProductType() {
            return productType;
        }

        public void setProductType(int productType) {
            this.productType = productType;
        }

        public int getProductGiftType() {
            return productGiftType;
        }

        public void setProductGiftType(int productGiftType) {
            this.productGiftType = productGiftType;
        }

        public int getShelvesState() {
            return shelvesState;
        }

        public void setShelvesState(int shelvesState) {
            this.shelvesState = shelvesState;
        }

        public String getPropEffect() {
            return propEffect;
        }

        public void setPropEffect(String propEffect) {
            this.propEffect = propEffect;
        }

        public int getIsDelete() {
            return isDelete;
        }

        public void setIsDelete(int isDelete) {
            this.isDelete = isDelete;
        }

        public int getSort() {
            return sort;
        }

        public void setSort(int sort) {
            this.sort = sort;
        }

        public int getPropSumIn() {
            return propSumIn;
        }

        public void setPropSumIn(int propSumIn) {
            this.propSumIn = propSumIn;
        }

        public int getPropSumOut() {
            return propSumOut;
        }

        public void setPropSumOut(int propSumOut) {
            this.propSumOut = propSumOut;
        }

        public int getPropStock() {
            return propStock;
        }

        public void setPropStock(int propStock) {
            this.propStock = propStock;
        }

        public long getCreateTime() {
            return createTime;
        }

        public void setCreateTime(long createTime) {
            this.createTime = createTime;
        }

        public int getInstructorEndDay() {
            return instructorEndDay;
        }

        public void setInstructorEndDay(int instructorEndDay) {
            this.instructorEndDay = instructorEndDay;
        }

        public int getInBuy() {
            return inBuy;
        }

        public void setInBuy(int inBuy) {
            this.inBuy = inBuy;
        }
    }
}
