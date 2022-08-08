package org.example;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseTest {

    WebDriver webdriver;
    WebDriverWait w;

    @Before
    public void openWebbrowser(){
        System.out.println("Before Test");
        // lokasi web driver
        System.setProperty("webdriver.chrome.driver", "D:\\WebDriver\\chromedriver.exe");
        webdriver = new ChromeDriver();

        webdriver.get("https://demo.midtrans.com/");
        webdriver.manage().window().maximize();
        w = new WebDriverWait(webdriver, Duration.ofSeconds(3));
    }
    @After
    public void closeWebBrowser(){
        webdriver.quit();
    }
}
