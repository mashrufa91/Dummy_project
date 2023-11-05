package tutorial_Ninja;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;




public class TN_LOGIN {
	
		public WebDriver driver;
		
		
		@Test
		public void loginTNTest() {
			
			driver = new ChromeDriver();
			driver.get("https://tutorialsninja.com/demo");
			driver.findElement(By.linkText("My Account")).click();
			driver.findElement(By.linkText("Login")).click();
			driver.findElement(By.id("input-email")).sendKeys("mashrufashanjia100@gmail.com");
			driver.findElement(By.id("input-password")).sendKeys("Mashrufa@123");
			driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
			Assert.assertTrue(driver.findElement(By.linkText("Logout")).isDisplayed());	
		}
		
		
		
		@AfterMethod
		public void tearDown() {
			driver.quit();
		}

	}


