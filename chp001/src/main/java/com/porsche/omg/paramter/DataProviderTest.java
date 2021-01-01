package com.porsche.omg.paramter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

/**
 * @author gyfhcf
 * @date 2020/12/6 21:50
 */
public class DataProviderTest {

    @Test(dataProvider="data")
    public void dataProdTest(String name, int age) {
        System.out.println("Name = " + name + ", age = " + age);
    }

    @DataProvider(name = "data")
    public Object[][] prodData() {
        Object[][] o = new Object[][] {
                {"zhang san", 18},
                {"li si", 28},
                {"wang wu", 30}
        };
        return o;
    }


    @Test(dataProvider = "methodData")
    public void dpTest1(String name, int age) {
        System.out.println("Test11111111 for name=" + name + "; age=" + age);
    }

    @Test(dataProvider = "methodData")
    public void dpTest2(String name, int age) {
        System.out.println("Test222222 for name=" + name + "; age=" + age);
    }

    @DataProvider(name = "methodData")
    public Object[][] prodMethodData(Method methd) {
        Object[][] obj = null;

        if (methd.getName().equals("dpTest1")) {
            obj = new Object[][] {
                    {"wangmazi", 89},
                    {"zhaolaoliu", 99}
            };
        } else if (methd.getName().equals("dpTest2")) {
            obj = new Object[][] {
                    {"zhangsanfeng", 45},
                    {"lidazhao", 55}
            };
        }
        return obj;
    }

}
