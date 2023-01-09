package com.hanks.apple.utils;

import java.math.BigDecimal;
import java.text.DecimalFormat;

/**
 * @Description: 数字、金额处理工具类
 * @Author: ab
 * @date: 2022/10/20 17:11
 */
public class NumberUtil {

    /**
     * @Description: 数字处理，示例如下
     * 10000以内显示：4110显示为4110
     * 超过1万显示：56007800显示为5600.8万，四舍五入
     * 超过1亿显示：180009000显示为1.8亿，四舍五入
     * @Author: ab
     * @date: 2022/10/20 17:12
     */
    public static String getNumber(int number){

        DecimalFormat nf = new DecimalFormat("#.0");
        String numbers = null;

        if(number < 10000){
            numbers = String.valueOf(number);
        }else if(number < 100000000){
            double value = number / 10000D;
            numbers = nf.format(value) + "万";
        }else{
            double value = number / 100000000D;
            numbers = nf.format(value) + "亿";
        }
        return numbers;
    }

    /**
     * @Description: 金额处理，千分位显示，示例：5,607,800.80
     * @Author: ab
     * @date: 2022/10/20 17:17
     */
    public static String getAmount(BigDecimal handleAmount){
        String amount = null;
        if (handleAmount.compareTo(new BigDecimal(0)) == 0) {
            amount = "0.00";
        }else if (handleAmount.compareTo(new BigDecimal(1)) == -1) {
            DecimalFormat df = new DecimalFormat("0.00");
            amount = df.format(handleAmount);

        }else {
            DecimalFormat formatter = new DecimalFormat("#,###.00");
            amount = formatter.format(handleAmount);
        }
        return amount;
    }

    /**
     * @Description: 金额处理，不要小数点，千分位显示，示例：5,607,800.80
     * @Author: ab
     * @date: 2022/10/20 17:17
     */
    public static String getNewAmount(BigDecimal handleAmount){
        String amount = null;
        if (handleAmount.compareTo(new BigDecimal(0)) == 0) {
            amount = "0";
        }else {
            DecimalFormat formatter = new DecimalFormat("#,###");
            amount = formatter.format(handleAmount);
        }
        return amount;
    }

    public static void main(String[] args) {
        BigDecimal handleAmount = new BigDecimal(12310.23);
        String amount = getAmount(handleAmount);
        System.out.println("==========" + amount);
    }
}