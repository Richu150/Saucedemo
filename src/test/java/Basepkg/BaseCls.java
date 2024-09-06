package Basepkg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.BeforeClass;

	public class BaseCls {
		public WebDriver driver;
		
		@BeforeClass
		public void precondition()
		{
			driver= new ChromeDriver();
			driver.get("https://www.saucedemo.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
			
		}
//		@AfterClass
//		public void postCondition()
//		{
//			driver.quit();
//		}

	}
