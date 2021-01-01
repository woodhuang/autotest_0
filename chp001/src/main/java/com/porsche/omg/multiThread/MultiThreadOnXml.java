package com.porsche.omg.multiThread;

import org.testng.annotations.Test;

/**
 * @author gyfhcf
 * @date 2020/12/7 23:23
 */
public class MultiThreadOnXml {

    @Test
    public void test1() {
        System.out.printf("Thread ID: %s%n", Thread.currentThread().getId());
    }

    @Test
    public void test2() {
        System.out.printf("Thread ID: %s%n", Thread.currentThread().getId());
    }

    @Test
    public void test3() {
        System.out.printf("Thread ID: %s%n", Thread.currentThread().getId());
    }
}
