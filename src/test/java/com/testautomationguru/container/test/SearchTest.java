package com.testautomationguru.container.test;

import java.net.MalformedURLException;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.testautomationguru.container.pages.SearchPage;

public class SearchTest extends BaseTest {

    private SearchPage google;

    @BeforeTest
    public void setUp() throws MalformedURLException {
        super.setUp();
        google = new SearchPage(driver);
    }

    @Test(dataProvider = "search-keywords")
    public void googleTest(String searchKeyword) {
        google.goTo();
        google.searchFor(searchKeyword);
        Assert.assertTrue(searchForElement("q"));
    }
   

}
