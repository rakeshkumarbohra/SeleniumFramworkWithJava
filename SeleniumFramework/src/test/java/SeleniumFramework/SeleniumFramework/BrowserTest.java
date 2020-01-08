package SeleniumFramework.SeleniumFramework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserTest {


	public static void main(String[] args) throws InterruptedException {

		String ProjectPath = System.getProperty("user.dir");
		System.out.println("ProjectPath "+ProjectPath);

		//System.setProperty("webdriver.gecko.driver", ProjectPath + "/drivers/geckodriver.exe");
		// WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", ProjectPath + "/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//System.setProperty("webdriver.ie.driver", ProjectPath + "/drivers/IEDriverServer.exe");
		//WebDriver driver = new InternetExplorerDriver();
		//WebDriverManager.chromedriver().setup();
		//WebDriver driver = new ChromeDriver();
		driver.get("https://google.com/");
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		WebElement GoogleTextSearch = driver.findElement(By.xpath("//*[@type='text']"));
		GoogleTextSearch.sendKeys("Selenium Automation");
		List <WebElement> ListofInputElements = driver.findElements(By.xpath("//input"));
		int count= ListofInputElements.size();
		System.out.println("Count of Elements= "+count);
		driver.close();
		


	}

}
