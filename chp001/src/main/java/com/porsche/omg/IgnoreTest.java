package com.porsche.omg;

import org.testng.annotations.Test;

/**
 * @author gyfhcf
 * @date 2020/12/6 14:49
 */
public class IgnoreTest {

    @Test
    public void ignore1() {
        System.out.println("ignore1 running.");
    }

    @Test(enabled = false)
    public void ignore2() {
        System.out.println("ignore2 running....");
    }
}
