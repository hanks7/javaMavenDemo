package com.hanks.apple;

import java.io.Serializable;
import java.util.List;

public class Testbean {

    /**
     * status : 200
     * data : {"list":[{"productId":15,"productType":1,"productGiftType":1,"shelvesState":1,"productName":"电动牙刷","productIntroduce":"产品简介","productExplain":"产品说明","coverUrl1":"https://zsdlqn.zijiapuzi.com/20200807095740023333627c924f769976d36f5dbb6257.jpg","unitQuantity":1,"unit":"个","everydayRecommendState":1,"salesProductPropObject":"[{\"id\": \"1\",\"productSkuId\": \"160\",\"unitQuantity\": \"10\"},{\"id\": \"2\",\"productSkuId\": \"160\",\"unitQuantity\": \"10\"},{\"id\": \"3\",\"productSkuId\": \"160\",\"unitQuantity\": \"10\"}]","sort":4,"salesPrice":150,"lowPrice":150,"highPrice":150,"totalStock":1000,"factSalesCount":0,"pretendSalesCount":0},{"productId":16,"productType":1,"productGiftType":1,"shelvesState":1,"productName":"除湿器","productIntroduce":"产品简介","productExplain":"产品说明","coverUrl1":"https://zsdlqn.zijiapuzi.com/20200807095740023333627c924f769976d36f5dbb6257.jpg","unitQuantity":1,"unit":"个","everydayRecommendState":1,"salesProductPropObject":"[{\"id\": \"1\",\"productSkuId\": \"160\",\"unitQuantity\": \"10\"},{\"id\": \"2\",\"productSkuId\": \"160\",\"unitQuantity\": \"10\"},{\"id\": \"3\",\"productSkuId\": \"160\",\"unitQuantity\": \"10\"}]","sort":3,"salesPrice":160,"lowPrice":160,"highPrice":160,"totalStock":1500,"factSalesCount":0,"pretendSalesCount":0},{"productId":17,"productType":1,"productGiftType":1,"shelvesState":1,"productName":"史努比电动牙刷","productIntroduce":"产品简介","productExplain":"产品说明","coverUrl1":"https://zsdlqn.zijiapuzi.com/20200807095740023333627c924f769976d36f5dbb6257.jpg","unitQuantity":1,"unit":"个","everydayRecommendState":1,"salesProductPropObject":"[{\"id\": \"1\",\"productSkuId\": \"160\",\"unitQuantity\": \"10\"},{\"id\": \"2\",\"productSkuId\": \"160\",\"unitQuantity\": \"10\"},{\"id\": \"3\",\"productSkuId\": \"160\",\"unitQuantity\": \"10\"}]","sort":2,"salesPrice":200,"lowPrice":200,"highPrice":200,"totalStock":1500,"factSalesCount":0,"pretendSalesCount":0},{"productId":18,"productType":1,"productGiftType":1,"shelvesState":1,"productName":"流心月饼","productIntroduce":"产品简介","productExplain":"产品说明","coverUrl1":"https://zsdlqn.zijiapuzi.com/20200807095740023333627c924f769976d36f5dbb6257.jpg","unitQuantity":1,"unit":"个","everydayRecommendState":1,"salesProductPropObject":"[{\"id\": \"1\",\"productSkuId\": \"160\",\"unitQuantity\": \"10\"},{\"id\": \"2\",\"productSkuId\": \"160\",\"unitQuantity\": \"10\"},{\"id\": \"3\",\"productSkuId\": \"160\",\"unitQuantity\": \"10\"}]","sort":1,"salesPrice":999,"lowPrice":999,"highPrice":999,"totalStock":6000,"factSalesCount":0,"pretendSalesCount":0}],"totalElements":4,"totalPages":1,"page":1,"size":10}
     * msg :
     */

    private DataBean data;

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean implements Serializable {
        /**
         * list : [{"productId":15,"productType":1,"productGiftType":1,"shelvesState":1,"productName":"电动牙刷","productIntroduce":"产品简介","productExplain":"产品说明","coverUrl1":"https://zsdlqn.zijiapuzi.com/20200807095740023333627c924f769976d36f5dbb6257.jpg","unitQuantity":1,"unit":"个","everydayRecommendState":1,"salesProductPropObject":"[{\"id\": \"1\",\"productSkuId\": \"160\",\"unitQuantity\": \"10\"},{\"id\": \"2\",\"productSkuId\": \"160\",\"unitQuantity\": \"10\"},{\"id\": \"3\",\"productSkuId\": \"160\",\"unitQuantity\": \"10\"}]","sort":4,"salesPrice":150,"lowPrice":150,"highPrice":150,"totalStock":1000,"factSalesCount":0,"pretendSalesCount":0},{"productId":16,"productType":1,"productGiftType":1,"shelvesState":1,"productName":"除湿器","productIntroduce":"产品简介","productExplain":"产品说明","coverUrl1":"https://zsdlqn.zijiapuzi.com/20200807095740023333627c924f769976d36f5dbb6257.jpg","unitQuantity":1,"unit":"个","everydayRecommendState":1,"salesProductPropObject":"[{\"id\": \"1\",\"productSkuId\": \"160\",\"unitQuantity\": \"10\"},{\"id\": \"2\",\"productSkuId\": \"160\",\"unitQuantity\": \"10\"},{\"id\": \"3\",\"productSkuId\": \"160\",\"unitQuantity\": \"10\"}]","sort":3,"salesPrice":160,"lowPrice":160,"highPrice":160,"totalStock":1500,"factSalesCount":0,"pretendSalesCount":0},{"productId":17,"productType":1,"productGiftType":1,"shelvesState":1,"productName":"史努比电动牙刷","productIntroduce":"产品简介","productExplain":"产品说明","coverUrl1":"https://zsdlqn.zijiapuzi.com/20200807095740023333627c924f769976d36f5dbb6257.jpg","unitQuantity":1,"unit":"个","everydayRecommendState":1,"salesProductPropObject":"[{\"id\": \"1\",\"productSkuId\": \"160\",\"unitQuantity\": \"10\"},{\"id\": \"2\",\"productSkuId\": \"160\",\"unitQuantity\": \"10\"},{\"id\": \"3\",\"productSkuId\": \"160\",\"unitQuantity\": \"10\"}]","sort":2,"salesPrice":200,"lowPrice":200,"highPrice":200,"totalStock":1500,"factSalesCount":0,"pretendSalesCount":0},{"productId":18,"productType":1,"productGiftType":1,"shelvesState":1,"productName":"流心月饼","productIntroduce":"产品简介","productExplain":"产品说明","coverUrl1":"https://zsdlqn.zijiapuzi.com/20200807095740023333627c924f769976d36f5dbb6257.jpg","unitQuantity":1,"unit":"个","everydayRecommendState":1,"salesProductPropObject":"[{\"id\": \"1\",\"productSkuId\": \"160\",\"unitQuantity\": \"10\"},{\"id\": \"2\",\"productSkuId\": \"160\",\"unitQuantity\": \"10\"},{\"id\": \"3\",\"productSkuId\": \"160\",\"unitQuantity\": \"10\"}]","sort":1,"salesPrice":999,"lowPrice":999,"highPrice":999,"totalStock":6000,"factSalesCount":0,"pretendSalesCount":0}]
         * totalElements : 4
         * totalPages : 1
         * page : 1
         * size : 10
         */

        private int totalElements;
        private int totalPages;
        private int page;
        private int size;
        private List<ListBean> list;

        public int getTotalElements() {
            return totalElements;
        }

        public void setTotalElements(int totalElements) {
            this.totalElements = totalElements;
        }

        public int getTotalPages() {
            return totalPages;
        }

        public void setTotalPages(int totalPages) {
            this.totalPages = totalPages;
        }

        public int getPage() {
            return page;
        }

        public void setPage(int page) {
            this.page = page;
        }

        public int getSize() {
            return size;
        }

        public void setSize(int size) {
            this.size = size;
        }

        public List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        public static class ListBean implements Serializable {
            /**
             * productId : 15
             * productType : 1
             * productGiftType : 1
             * shelvesState : 1
             * productName : 电动牙刷
             * productIntroduce : 产品简介
             * productExplain : 产品说明
             * coverUrl1 : https://zsdlqn.zijiapuzi.com/20200807095740023333627c924f769976d36f5dbb6257.jpg
             * unitQuantity : 1
             * unit : 个
             * everydayRecommendState : 1
             * salesProductPropObject : [{"id": "1","productSkuId": "160","unitQuantity": "10"},{"id": "2","productSkuId": "160","unitQuantity": "10"},{"id": "3","productSkuId": "160","unitQuantity": "10"}]
             * sort : 4
             * salesPrice : 150.0
             * lowPrice : 150.0
             * highPrice : 150.0
             * totalStock : 1000
             * factSalesCount : 0
             * pretendSalesCount : 0
             */

            private int productId;
            private int productType;
            private int productGiftType;
            private int shelvesState;
            private String productName;
            private String productIntroduce;
            private String productExplain;
            private String coverUrl1;
            private int unitQuantity;
            private String unit;
            private int everydayRecommendState;
            private String salesProductPropObject;
            private int sort;
            private double salesPrice;
            private double lowPrice;
            private double highPrice;
            private int totalStock;
            private int factSalesCount;
            private int pretendSalesCount;

            public int getProductId() {
                return productId;
            }

            public void setProductId(int productId) {
                this.productId = productId;
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

            public String getProductName() {
                return productName;
            }

            public void setProductName(String productName) {
                this.productName = productName;
            }

            public String getProductIntroduce() {
                return productIntroduce;
            }

            public void setProductIntroduce(String productIntroduce) {
                this.productIntroduce = productIntroduce;
            }

            public String getProductExplain() {
                return productExplain;
            }

            public void setProductExplain(String productExplain) {
                this.productExplain = productExplain;
            }

            public String getCoverUrl1() {
                return coverUrl1;
            }

            public void setCoverUrl1(String coverUrl1) {
                this.coverUrl1 = coverUrl1;
            }

            public int getUnitQuantity() {
                return unitQuantity;
            }

            public void setUnitQuantity(int unitQuantity) {
                this.unitQuantity = unitQuantity;
            }

            public String getUnit() {
                return unit;
            }

            public void setUnit(String unit) {
                this.unit = unit;
            }

            public int getEverydayRecommendState() {
                return everydayRecommendState;
            }

            public void setEverydayRecommendState(int everydayRecommendState) {
                this.everydayRecommendState = everydayRecommendState;
            }

            public String getSalesProductPropObject() {
                return salesProductPropObject;
            }

            public void setSalesProductPropObject(String salesProductPropObject) {
                this.salesProductPropObject = salesProductPropObject;
            }

            public int getSort() {
                return sort;
            }

            public void setSort(int sort) {
                this.sort = sort;
            }

            public double getSalesPrice() {
                return salesPrice;
            }

            public void setSalesPrice(double salesPrice) {
                this.salesPrice = salesPrice;
            }

            public double getLowPrice() {
                return lowPrice;
            }

            public void setLowPrice(double lowPrice) {
                this.lowPrice = lowPrice;
            }

            public double getHighPrice() {
                return highPrice;
            }

            public void setHighPrice(double highPrice) {
                this.highPrice = highPrice;
            }

            public int getTotalStock() {
                return totalStock;
            }

            public void setTotalStock(int totalStock) {
                this.totalStock = totalStock;
            }

            public int getFactSalesCount() {
                return factSalesCount;
            }

            public void setFactSalesCount(int factSalesCount) {
                this.factSalesCount = factSalesCount;
            }

            public int getPretendSalesCount() {
                return pretendSalesCount;
            }

            public void setPretendSalesCount(int pretendSalesCount) {
                this.pretendSalesCount = pretendSalesCount;
            }
        }
    }
}
