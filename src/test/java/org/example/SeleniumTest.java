package org.example;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class SeleniumTest extends BaseTest{
    // open web browse
    // open url https://demo.midtrans.com/
    @Test
    public void testMidtrans() throws InterruptedException {

        webdriver.findElement(By.xpath("//a[.='BUY NOW']"))
                .click();
        webdriver.findElement(By.xpath("//input[@class='text-right']")).
                clear();
        webdriver.findElement(By.xpath("//input[@class='text-right']")).
                sendKeys("50000");
        webdriver.findElement(By.xpath("//input[@type='text']")).
                clear();
        webdriver.findElement(By.xpath("//input[@type='text']")).
                sendKeys("syuffie");
        webdriver.findElement(By.xpath("//input[@type='email']")).
                clear();
        webdriver.findElement(By.xpath("//input[@type='email']")).
                sendKeys("rozakana99@gmail.com");
        webdriver.findElement(By.xpath("//input[@value='081808466410']")).
                clear();
        webdriver.findElement(By.xpath("//input[@value='081808466410']")).
                sendKeys("086756601952");
        webdriver.findElement(By.xpath("//input[@value='Jakarta']")).
                clear();
        webdriver.findElement(By.xpath("//input[@value='Jakarta']")).
                sendKeys("Tulungagung");
        webdriver.findElement(By.cssSelector("textarea")).
                clear();
        webdriver.findElement(By.cssSelector("textarea")).
                sendKeys("bangoan");
        webdriver.findElement(By.xpath("//input[@value='10220']")).clear();
        webdriver.findElement(By.xpath("//input[@value='10220']")).sendKeys("66229");
        webdriver.findElement(By.xpath("//div[@class='cart-checkout']")).click();
        webdriver.switchTo().frame(webdriver.findElement(By.xpath("//iframe[@id='snap-midtrans']")));
        webdriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='merchant-name']")));
        webdriver.findElement(By.xpath("//a[@href='#/credit-card']//div[@class='list-payment-logo']")).
                click();
        webdriver.findElement(By.xpath("//div[@class='card-number-input-container']/input[@class='valid-input-value']")).
                sendKeys("4811111111111114");
        webdriver.findElement(By.xpath("//input[@id='card-expiry']")).sendKeys("0125");
        webdriver.findElement(By.xpath("//input[@id='card-cvv']")).sendKeys("123");
        webdriver.findElement(By.xpath("//label[.='Potongan 10% - Demo Promo Engine']")).click();
        webdriver.findElement(By.xpath("//button[@class='btn full primary']")).click();
        webdriver.switchTo().frame(webdriver.findElement(By.cssSelector(".iframe-3ds")));
        webdriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        webdriver.findElement(By.xpath("//input[@id='PaRes']")).sendKeys("112233");
        webdriver.findElement(By.xpath("//button[@name='ok']")).click();
        webdriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));


    }

}
