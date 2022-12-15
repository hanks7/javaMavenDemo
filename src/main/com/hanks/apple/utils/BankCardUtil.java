package com.hanks.apple.utils;

/**
 * @ClassName: com.riying.educated.utils.BankCardUtil
 * @CreateDate: 2022/12/9 13:16
 * @Author: 侯建军
 * @Description: 验证银行卡准确性
 */
public class BankCardUtil {

    public static void main(String[] args) {
//        System.out.println(BankCardUtil.checkBankCard("6227002584510479656"));
        System.out.println(BankCardUtil.checkBankCard("6227-0025-8451-0479-656"));
    }

    public static boolean checkBankCard(String cardId) {
        if (cardId == null || cardId.isEmpty()) {
            return false;
        }
        char bit = getBankCardCheckCode(cardId
                .substring(0, cardId.length() - 1));
        if (bit == 'N') {
            return false;
        }
        return cardId.charAt(cardId.length() - 1) == bit;
    }

    /**
     * 从不含校验位的银行卡卡号采用 Luhm 校验算法获得校验位
     *
     * @param nonCheckCodeCardId
     * @return
     */
    public static char getBankCardCheckCode(String nonCheckCodeCardId) {
        if (nonCheckCodeCardId == null
                || nonCheckCodeCardId.trim().length() == 0
                || !nonCheckCodeCardId.matches("\\d+")) {
            // 如果传的不是数据返回N
            return 'N';
        }
        char[] chs = nonCheckCodeCardId.trim().toCharArray();
        int luhmSum = 0;
        for (int i = chs.length - 1, j = 0; i >= 0; i--, j++) {
            int k = chs[i] - '0';
            if (j % 2 == 0) {
                k *= 2;
                k = k / 10 + k % 10;
            }
            luhmSum += k;
        }
        return (luhmSum % 10 == 0) ? '0' : (char) ((10 - luhmSum % 10) + '0');
    }

}
