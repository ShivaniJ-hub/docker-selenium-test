package com.testautomationguru.container.test;

import java.net.MalformedURLException;
import org.testng.Assert.*;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.testautomationguru.container.pages.SearchPage;

public class SearchTest extends BaseTest {

    private SearchPage google;

    @BeforeTest
    public void setUp() throws MalformedURLException {
        super.setUp();
        google = new SearchPage(driver);
    }

    @Test
    public void googleTest() {
        google.goTo();
        Assert.assertTrue(true);
    }
    @AfterTest
    public void close_browser(){
       driver.close();
       driver.quit();
    } 
   

}
