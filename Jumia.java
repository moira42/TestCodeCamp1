package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jumia {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\IdeaProjects\\SeleniumIntro\\src\\chromedriver.exe.");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.jumia.com.ng/");
        driver.findElement(By.name("q")).sendKeys("redmi note 10");

    }
}
