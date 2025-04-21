package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Test_01 {
	WebDriver driver;

	@BeforeClass
	public void beforeClass() {
		driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
	}

	@Test
	public void TC_01() {
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("dongafc@gmail.com");
	}

	@Test
	public void TC_02() {
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("AfcSeJ4@");
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

}
