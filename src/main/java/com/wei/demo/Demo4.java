package com.wei.demo;

import org.junit.Test;

public class Demo4 {

        @Test
        public void TestSubString() {

            String str= "123456789";

            System.out.println(str.substring(0, 7));
            System.out.println(str.substring(1, 7));

            System.out.println(str.substring(4));
            System.out.println(str.substring(0));
    }
}
