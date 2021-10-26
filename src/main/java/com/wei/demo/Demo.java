package com.wei.demo;

import org.junit.Test;

public class Demo {
    String str = "12345";

    @Test
    public void Test() {
        StringBuilder stringBuilder = new StringBuilder();
        char[] chars = str.toCharArray();
        System.out.println("字符串的长度是" + chars.length);
        int m = 1;

        for (int i = chars.length; i >= 1; i--) {
            stringBuilder = stringBuilder.append(chars[i - 1]);
            System.out.println("the" + m + "char is--" + chars[i - 1]);
            m++;
        }
        System.out.println(stringBuilder.toString());
    }


    @Test
    public void Test2() {
        StringBuilder stringBuilder = new StringBuilder(str);
        System.out.println(stringBuilder.reverse().toString());
    }

    @Test
    public void Test3() {
        char[] chars = str.toCharArray();
        String str_reverse="";
        for (int i = chars.length - 1; i >= 0; i--) {
            str_reverse += chars[i];
        }
        System.out.println(str_reverse);
    }

    @Test
    public void Test4() {
        String str_reverse = "";
        int length = str.length();
        for (int i = 0; i < length; i++) {
            str_reverse = str.charAt(i) + str_reverse;
        }
        System.out.println(str_reverse);
    }
}
