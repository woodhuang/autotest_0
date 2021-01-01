package com.porsche.omg.multiThread;

import org.testng.annotations.Test;

/**
 * @author gyfhcf
 * @date 2020/12/7 22:41
 */
public class MultiThreadOnAnnotion {

    @Test(invocationCount = 10, threadPoolSize = 3)
    public void testt() {
        System.out.println("1");
        System.out.printf("Thread ID: %s%n",Thread.currentThread().getId());
    }
}
