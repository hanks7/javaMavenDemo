package com.hanks.apple;

/**
 * @ClassName: com.riying.educated.module.bag.bean.ApifoxModel
 * @CreateDate: 2022/11/3 17:46
 * @Author: 侯建军
 * @Description: TODO
 */
public class CreatOrderParam {
    private String id;
    private String payPassword;
    private long payType;
    private String productId;
    private long productNumbers;
    private String productSkuId;
    private long terminalType;
    private String userId;

    /**
     * 收货人地址id，如果产品类型为2和3时，则此id不需传。产品类型：1.商店实物礼包，2.商店虚拟道具 3.商店虚拟礼包 4.电量充值礼品
     */
    public String getid() {
        return id;
    }

    public void setid(String value) {
        this.id = value;
    }

    /**
     * 支付密码，月娥支付时必传
     */
    public String getPayPassword() {
        return payPassword;
    }

    public void setPayPassword(String value) {
        this.payPassword = value;
    }

    /**
     * 支付类型：1.余额支付 2.微信支付 3.支付宝支付 4.银行卡支付 5.组合支付，余额支付+微信支付 6.组合支付，余额支付+支付宝支付 7.组合支付，余额支付+银行卡支付
     */
    public long getPayType() {
        return payType;
    }

    public void setPayType(long value) {
        this.payType = value;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String value) {
        this.productId = value;
    }

    /**
     * 产品份数
     */
    public long getProductNumbers() {
        return productNumbers;
    }

    public void setProductNumbers(long value) {
        this.productNumbers = value;
    }

    /**
     * sku编码
     */
    public String getProductSkuId() {
        return productSkuId;
    }

    public void setProductSkuId(String value) {
        this.productSkuId = value;
    }

    /**
     * 终端类型：1.小程序 2.IOS 3.Android，4.虚拟微信支付，实际线下收款 5.PC
     */
    public long getTerminalType() {
        return terminalType;
    }

    public void setTerminalType(long value) {
        this.terminalType = value;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String value) {
        this.userId = value;
    }
}
