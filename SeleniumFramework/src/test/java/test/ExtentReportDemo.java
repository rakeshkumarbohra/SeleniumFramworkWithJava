package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportDemo {
	
	private static WebDriver driver = null; 

	public static void main(String[] args) {
	
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extentReport.html");
		
		 // create ExtentReports and attach reporter(s)
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(htmlReporter);

     // creates a toggle for the given test, adds all log events under it    
        ExtentTest test1 = extent.createTest("Google Search Test One", "Test to validate google search");
        
        String ProjectPath = System.getProperty("user.dir");
		System.out.println("ProjectPath "+ProjectPath);
		System.setProperty("webdriver.chrome.driver", ProjectPath + "/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		
		test1.log(Status.INFO, "Starting test case");
		driver.get("https://google.com");
		test1.pass("Navigated to google.com");
		
		driver.findElement(By.name("q")).sendKeys("Automation");
		test1.pass("Entered text in searchbox");
		
		driver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@name='btnK']")).sendKeys(Keys.RETURN);
		
		//driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		test1.pass("Click on search button");

		
		driver.close();
		driver.quit();
		test1.pass("Closed the browser");
		test1.info("Test Completed");
		extent.flush();
		
        
	}

}
