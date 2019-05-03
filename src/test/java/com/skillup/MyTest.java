package com.skillup;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MyTest extends TestRunner {
    private static final String EXPECTED_TITLE = "Google";
    private static final String URL = "https://www.google.com";

    @Test
    public void myTest() {

        driver.get(URL);
        String actualTitle = driver.getTitle();
        //true

//        Assert.assertTrue(EXPECTED_TITLE.equals(actualTitle));
        Assert.assertEquals("sda,ds", EXPECTED_TITLE, "Site title is wrong");

//        if (EXPECTED_TITLE.equals(actualTitle)) {
//            System.out.println("HEY HEY. TEST PASSED");
//        } else {
//            System.out.println("SAD. TEST FAILED");
//        }


    }
}
