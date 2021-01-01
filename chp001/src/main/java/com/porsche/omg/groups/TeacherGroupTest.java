package com.porsche.omg.groups;

import org.testng.annotations.Test;

/**
 * @author gyfhcf
 * @date 2020/12/6 16:01
 */

@Test(groups = "teach")
public class TeacherGroupTest {

    public void teacTestMethod1() {
        System.out.println("teach 11111111 running...");
    }

    public void teachTestMethod2() {
        System.out.println("teach 2222222 running.....");
    }

}
