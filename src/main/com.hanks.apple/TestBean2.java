package com.hanks.apple;

import java.io.Serializable;
import java.util.List;

public class TestBean2 {


    /**
     * data : {"list":[{"userId":650165,"userNickName":"匿名用户","userHeadUrl":"https://zsdlqn.zijiapuzi.com/20210525214711b1e7974477c84af08f90f70f8a0850f4","registerTime":1.619962739E12,"accountStatus":1},{"userId":647111,"userNickName":"Clack","userHeadUrl":"https://thirdwx.qlogo.cn/mmopen/vi_32/2ibSic53HNEZRj8EVibkr0R8bPdnyR0Xb9icmPb1oIjrPRDZaQubnsOIMkXBLfnHib58kl3fTTt5pTMFbharU7GsIlA/132","registerTime":1.617283768E12,"accountStatus":1}],"page":1,"size":20,"totalElements":2,"totalPages":1}
     * status : 200
     */

    private DataBean data;
    private int status;

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

    public static class DataBean implements Serializable {
        /**
         * list : [{"userId":650165,"userNickName":"匿名用户","userHeadUrl":"https://zsdlqn.zijiapuzi.com/20210525214711b1e7974477c84af08f90f70f8a0850f4","registerTime":1.619962739E12,"accountStatus":1},{"userId":647111,"userNickName":"Clack","userHeadUrl":"https://thirdwx.qlogo.cn/mmopen/vi_32/2ibSic53HNEZRj8EVibkr0R8bPdnyR0Xb9icmPb1oIjrPRDZaQubnsOIMkXBLfnHib58kl3fTTt5pTMFbharU7GsIlA/132","registerTime":1.617283768E12,"accountStatus":1}]
         * page : 1
         * size : 20
         * totalElements : 2
         * totalPages : 1
         */

        private int page;
        private int size;
        private int totalElements;
        private int totalPages;
        private List<ListBean> list;

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

        public List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        public static class ListBean implements Serializable {
            /**
             * userId : 650165.0
             * userNickName : 匿名用户
             * userHeadUrl : https://zsdlqn.zijiapuzi.com/20210525214711b1e7974477c84af08f90f70f8a0850f4
             * registerTime : 1.619962739E12
             * accountStatus : 1.0
             */

            private double userId;
            private String userNickName;
            private String userHeadUrl;
            private double registerTime;
            private double accountStatus;

            public double getUserId() {
                return userId;
            }

            public void setUserId(double userId) {
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

            public double getRegisterTime() {
                return registerTime;
            }

            public void setRegisterTime(double registerTime) {
                this.registerTime = registerTime;
            }

            public double getAccountStatus() {
                return accountStatus;
            }

            public void setAccountStatus(double accountStatus) {
                this.accountStatus = accountStatus;
            }
        }
    }
}
