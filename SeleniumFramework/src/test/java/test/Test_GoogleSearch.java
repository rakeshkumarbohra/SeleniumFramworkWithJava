package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Test_GoogleSearch {
	
	public static void main(String[] args) {
		googleSearch();
	}
	
	public static void googleSearch(){
		
		String ProjectPath = System.getProperty("user.dir");
		System.out.println("ProjectPath "+ProjectPath);
		System.setProperty("webdriver.chrome.driver", ProjectPath + "/drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		// Launch google
		driver.get("https://www.google.com/");
		
		// Enter text in search box
		WebElement InputText= driver.findElement(By.xpath("//input[@name='q']"));
		InputText.sendKeys("Selenium Automation");
		
		// Click on Search Button
		WebElement GoogleSearchBtn = driver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@name='btnK']"));
		//GoogleSearchBtn.click();
		GoogleSearchBtn.sendKeys(Keys.RETURN);
		driver.close();
		
	
	}
}
