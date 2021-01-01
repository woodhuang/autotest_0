package com.porsche.omg;

import org.testng.annotations.Test;

/**
 * @author gyfhcf
 * @date 2020/12/6 21:05
 */
public class DependTest {
    @Test
    public void test1111() {
        System.out.println("test1111 running....");
    }

    @Test(dependsOnMethods = {"test1111", "test3333"})
    public void test2222() {
        System.out.println("test2222 running.....");
    }

    @Test
    public void test3333() {
        System.out.println("test3333 running....");
    }
}
