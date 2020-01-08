package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.GoogleSearhPageObject;

public class GoogleSearchPageTest {
	
	private static WebDriver driver = null;
	
	public static void main(String[] args) {
		
	}
	
	public static void main(){
		String ProjectPath = System.getProperty("user.dir");
		System.out.println("ProjectPath "+ProjectPath);
		System.setProperty("webdriver.chrome.driver", ProjectPath + "/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		
		GoogleSearhPageObject searchPageObj = new GoogleSearhPageObject(driver);
		driver.get("https://google.com");
		searchPageObj.setTextInSearchBox("Selenium Automation");
		searchPageObj.clickSearchBox();
		
	}

}
