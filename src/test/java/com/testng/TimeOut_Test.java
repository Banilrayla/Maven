package com.testng;

import org.testng.annotations.Test;

public class TimeOut_Test {
@Test(timeOut = 7000)
private void logIn() throws InterruptedException {
System.out.println("set property");
System.out.println("launch browser");
Thread.sleep(1000);
System.out.println("get url");
System.out.println("maximize");
Thread.sleep(5000);

System.out.println("click log");
Thread.sleep(900);
System.out.println("navigate to home page");
}
}
