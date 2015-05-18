package com.testingenesp.webdriver;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MiPrimerTest {

    @Test
    public void verificarTituloBlog(){

        WebDriver driver=new FirefoxDriver();

        driver.navigate().to("http://josepablosarco.wordpress.com");

        Assert.assertTrue("El titulo debe contener la palabra Testing", driver.getTitle().contains("Testing"));

        driver.close();

        driver.quit();
    }

}
