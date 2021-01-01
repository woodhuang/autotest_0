package com.porsche.omg;

import org.testng.annotations.Test;

/**
 * @author gyfhcf
 * @date 2020/12/6 20:52
 */
public class ExceptionTest {

    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionFailed() {
        System.out.println("This is exception test failed.");
    }

    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionSuccess() {
        System.out.println("This is exception test success...");
        throw new RuntimeException();

    }
}
