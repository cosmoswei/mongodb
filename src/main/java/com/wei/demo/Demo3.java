package com.wei.demo;

import org.junit.Test;

public class Demo3 {
    String str = "a1a2a3a4a5a";

    @Test
    public void Test() {

        System.out.println(str);
        String str1 = str.replace("a", "b");
        System.out.println(str1);


        String str2 = str.replace("a4", "bE");
        System.out.println(str2);

        String str3 = str.replaceAll("\\d", "E");
        System.out.println(str3);

    }
}
