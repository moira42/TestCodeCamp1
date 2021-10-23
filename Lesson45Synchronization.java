package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lesson45Synchronization {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\IdeaProjects\\SeleniumIntro\\src\\chromedriver.exe");
        //launch browser
        WebDriver driver = new ChromeDriver();
        //maximize the browser
        driver.manage().window().maximize();
        // navigates to the Url
        driver.get("https://mail.google.com/");
        //click on email id
        driver.findElement(By.xpath("//input[@id 'identifierId']")).click();
        Thread.sleep(5000);
        //input email id: razelmoi@gmail.com
        driver.findElement(By.id("email address")).sendKeys("razelmoi@gmail.com");
        //click signup button
        driver.findElement(By.xpath("//body/div[1]/div[1]/div[2]")).click();


    }
}
