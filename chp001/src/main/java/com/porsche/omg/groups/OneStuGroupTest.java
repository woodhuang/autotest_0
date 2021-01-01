package com.porsche.omg.groups;

import org.testng.annotations.Test;

/**
 * @author gyfhcf
 * @date 2020/12/6 15:57
 */

@Test(groups = "stu")
public class OneStuGroupTest {

    public void stuTestMethod1() {
        System.out.println("one stu 11111111 running...");
    }

    public void stuTestMethod2() {
        System.out.println("one stu 2222222 running.....");
    }
}
