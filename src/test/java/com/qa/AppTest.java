
package com.qa;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import static org.junit.Assert.assertTrue;

public class AppTest {

    private ChromeDriver driver;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\personalproject\\PersonalProectSelenium\\src\\test\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @After
    public void tearDown(){
        driver.close();
    }

    @Test
    public void createTest() throws InterruptedException {
        driver.get("http://35.246.117.181/builds.html");
        Thread.sleep(2000);
        Select drpRing = new Select(driver.findElementByXPath("/html/body/form/div[1]/div[1]/select"));
        drpRing.selectByVisibleText("Ring of Crescent Guardian");
        Select drpEarring = new Select(driver.findElementByXPath("/html/body/form/div[1]/div[2]/select"));
        drpEarring.selectByVisibleText("Black Distortion Earring");
        Select drpNecklace = new Select(driver.findElementByXPath("/html/body/form/div[1]/div[3]/select"));
        drpNecklace.selectByVisibleText("Ogre Ring");
        WebElement saveField = driver.findElementById("buildnameinput");
        saveField.sendKeys("yes1263125636715136");
        WebElement submitButton = driver.findElementByXPath("/html/body/form/input");
        Thread.sleep(1000);
        submitButton.click();
        Thread.sleep(5000);
    }

    @Test
    public void updateTest() throws InterruptedException {
        driver.get("http://35.246.117.181/saved_builds.html");
        Thread.sleep(2000);
        WebElement viewButton = driver.findElementByName("yes1263125636715136");
        viewButton.click();
        Thread.sleep(1000);
        Select drpRing = new Select(driver.findElementByXPath("/html/body/div[1]/div/div/div[2]/form/div/div[1]/select"));
        drpRing.selectByVisibleText("Ring of Cadry Guardian");
        Select drpEarring = new Select(driver.findElementByXPath("/html/body/div[1]/div/div/div[2]/form/div/div[2]/select"));
        drpEarring.selectByVisibleText("Blue Coral Earring");
        Select drpNecklace = new Select(driver.findElementByXPath("/html/body/div[1]/div/div/div[2]/form/div/div[3]/select"));
        drpNecklace.selectByVisibleText("Sicil's Necklace");
        Thread.sleep(2000);
        WebElement saveButton = driver.findElementByXPath("/html/body/div[1]/div/div/div[2]/form/input[3]");
        saveButton.click();
        Thread.sleep(1000);
    }

    @Test
    public void deleteTest() throws InterruptedException {
        driver.get("http://35.246.117.181/saved_builds.html");
        Thread.sleep(2000);
        WebElement deleteButton = driver.findElementByXPath("/html/body/table/tbody/tr[4]/td[6]/button[1]");
        deleteButton.click();
        Thread.sleep(1000);
    }
}