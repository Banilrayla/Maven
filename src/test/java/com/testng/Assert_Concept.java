package com.testng;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert_Concept {
//@Test
//	private void demo() {
//String actual_Username="Johnson";
//String expected_Username="John";
////validation
//Assert.assertNotEquals(actual_Username, expected_Username);
//	}
//}
@Test
private void demo() {
String actual_Username="Johnson";
String expected_Username="John";
//Verification
SoftAssert soft= new SoftAssert();
soft.assertEquals(actual_Username, expected_Username);
System.out.println("Data Verification");
soft.assertAll();// shows the realresult

}
}


