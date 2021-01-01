package com.porsche.omg;

import org.testng.annotations.Test;

public class TimeOutTest {

    @Test(timeOut=3000) //ms
    public void testSuccess() throws InterruptedException {
        Thread.sleep(2000);
    }

    @Test(timeOut = 2000) //ms
    public void testFailed() throws InterruptedException {
        Thread.sleep(3000);
    }

}
