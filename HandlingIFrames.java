package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingIFrames {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\IdeaProjects\\SeleniumIntro\\src\\chromedriver.exe");
        //launch browser
        WebDriver driver = new ChromeDriver();
        //maximize the browser
        driver.manage().window().maximize();
        // navigates to the Url
        driver.get("https://jqueryui.com/");
        driver.findElement(By.xpath("//a[contains(text(),'Dialog')]")).click();
        Thread.sleep(5000);
        driver.switchTo().frame("ui-button-icon");
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/button[1]/span[1]")).click();




    }
}
