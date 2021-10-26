package com.wei.demo;

import org.junit.Test;

public class Demo2 {

        String str = "bb1a2a3a4a5a";

        @Test
        public void Test() {
            String[] str2 = str.split("a");
            for (int i = 0; i < str2.length; i++) {
                System.out.println(str2[i]);
            }
        }


        @Test
        public void Test2() {
            String[] str2 = str.split("a",3);
            for (int i = 0; i < str2.length; i++) {
                System.out.println(str2[i]);
            }
        }


        @Test
        public void Test3() {
            String[] str2 = str.split("\\d");
            for (int i = 0; i < str2.length; i++) {
                System.out.println(str2[i]);
            }
        }

        @Test
        public void Test4() {
            String[] str2 = str.split("\\d",3);
            for (int i = 0; i < str2.length; i++) {
                System.out.println(str2[i]);
            }
        }
}
