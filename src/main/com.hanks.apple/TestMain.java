package com.hanks.apple;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestMain {
    public static void main(String[] args) {
        System.out.println(replaceNameX("发斯", 1));
    }


    // 保护用户隐私
    public static String replaceNameX(String str, int the_latter) {
        // 获取姓名长度
        String custName = str;
        int length = custName.length();

        String reg = ".{" + the_latter + "}";
        StringBuffer sb = new StringBuffer();
        Pattern p = Pattern.compile(reg);
        Matcher m = p.matcher(str);
        int i = 0;
        while (m.find()) {
            i++;
            if (i == length)
                continue;
            m.appendReplacement(sb, "*");
        }
        m.appendTail(sb);
        return sb.toString();
    }
}
