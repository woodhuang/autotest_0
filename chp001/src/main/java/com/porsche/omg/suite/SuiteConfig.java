package com.porsche.omg.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

/**
 * @author gyfhcf
 * @date 2020/12/6 13:43
 */
public class SuiteConfig {
    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Before suite running");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("After suite running");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("before Test running.");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("after Test running.");
    }

}
