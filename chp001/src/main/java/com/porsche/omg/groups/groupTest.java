package com.porsche.omg.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

/**
 * @author gyfhcf
 * @date 2020/12/6 15:06
 */
public class groupTest {

    @Test(groups = "Server")
    public void test1() {
        System.out.println("服务端 Test11111111111 running...");
    }

    @Test(groups = "Server")
    public void test2() {
        System.out.println("服务端 Test22222222 running...");
    }

    @Test(groups = "Client")
    public void test3() {
        System.out.println("客户端 Test 111111  running....");
    }

    @Test(groups = "Client")
    public void test4() {
        System.out.println("客户端 Test 2222222 running....");
    }

    @BeforeGroups("Server")
    public void beforeServerGroups() {
        System.out.println("Before Server running....");
    }

    @AfterGroups("Server")
    public void afterServerGroups() {
        System.out.println("After server running....");
    }

    @BeforeGroups("Client")
    public void beforeClientGroups() {
        System.out.println("before client running....");
    }

    @AfterGroups("Client")
    public void afterClientGroups() {
        System.out.println("after client running....");
    }


}
