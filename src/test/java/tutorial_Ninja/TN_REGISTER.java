package tutorial_Ninja;

import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import Specialclass.Util;



public class TN_REGISTER {
	
		public WebDriver driver;
		
		
		@Test
		public void registerTNTest() {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://tutorialsninja.com/demo");
			driver.findElement(By.linkText("My Account")).click();
			driver.findElement(By.linkText("Register")).click();
			driver.findElement(By.cssSelector("input#input-firstname")).sendKeys("Mashrufa123");
			driver.findElement(By.cssSelector("input#input-lastname")).sendKeys("Shanjia123");
			driver.findElement(By.cssSelector("input#input-email")).sendKeys(Util.emailWithDateTimeStamp());
			driver.findElement(By.cssSelector("input#input-telephone")).sendKeys("1234567");
			driver.findElement(By.cssSelector("input#input-password")).sendKeys("Mashrufa@123");
			driver.findElement(By.cssSelector("input#input-confirm")).sendKeys("Shanjia@123");
			driver.findElement(By.cssSelector("input[name = agree]")).click();
			driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
			String actualAccountSuccessMessage = driver.findElement(By.xpath("//div[@id = 'content']/child::p[1]")).getText();
			String expectedAccountSuccessMessage = "Congratulations! Your new account has been successfully created!";
			Assert.assertTrue(actualAccountSuccessMessage.contains(expectedAccountSuccessMessage));
			
		
		}
		
		@AfterMethod
		public void tearDown() {
			driver.quit();
		}

	}


