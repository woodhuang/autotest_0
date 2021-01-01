package com.porsche.omg.paramter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * @author gyfhcf
 * @date 2020/12/6 21:21
 */
public class ParamterTest {

    @Test()
    @Parameters({"name","age"})
    public void paraTest1(String name, int age) {
        System.out.println("Input - name = " + name + ", age=" + age);
    }
}
