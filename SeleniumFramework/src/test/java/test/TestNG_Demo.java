package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestNG_Demo {
	
	 WebDriver driver = null;	
	
	@BeforeTest
	public void setUpTest(){
	
		String ProjectPath = System.getProperty("user.dir");
		System.out.println("ProjectPath "+ProjectPath);
		System.setProperty("webdriver.chrome.driver", ProjectPath + "/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		
	}
	
	@Test
	public void googleSearch(){
			
		// Launch google
		driver.get("https://www.google.com/");
		
		// Enter text in search box
		WebElement InputText= driver.findElement(By.xpath("//input[@name='q']"));
		InputText.sendKeys("Selenium Automation");
		
		// Click on Search Button
		WebElement GoogleSearchBtn = driver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@name='btnK']"));
		//GoogleSearchBtn.click();
		GoogleSearchBtn.sendKeys(Keys.RETURN);
		//driver.close();
			
	}
	
	@AfterTest
	public void tearDownTest(){
		driver.close();
		//driver.quit();
		System.out.println("Test Completed Sucessfully");
		
		
		
		
	}
}
