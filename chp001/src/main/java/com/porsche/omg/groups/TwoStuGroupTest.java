package com.porsche.omg.groups;

import org.testng.annotations.Test;

/**
 * @author gyfhcf
 * @date 2020/12/6 16:00
 */

@Test(groups = "stu")
public class TwoStuGroupTest {

    public void stuTestMethod1() {
        System.out.println("two stu 11111111 running...");
    }

    public void stuTestMethod2() {
        System.out.println("two stu 2222222 running.....");
    }
}
