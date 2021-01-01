package com.porsche.omg;

import org.testng.annotations.*;

/**
 * @author gyfhcf
 * @date 2020/12/5 23:21
 */
public class BasicAnnotation {
    @Test
    public void testCase01(){
        System.out.println("这是第一个 testcase");
    }

    @Test
    public void testCase2(){
        System.out.println("这是第二个 testcase");
    }

    @BeforeMethod
    public void beforeTest() {
        System.out.println("Before case running.");
    }

    @AfterMethod
    public void afterTest(){
        System.out.println("After case running.");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("这是类之前运行");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("这是类之后运行");
    }

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("before 测试套件");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("after 测试套件");
    }
}
