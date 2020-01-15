package SeleniumFramework.SeleniumFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCapabilitiesDemo {

	
	public static void main(String[] args) {
		String ProjectPath = System.getProperty("user.dir");
		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("ignoreZoomSetting", true);
		System.out.println("ProjectPath "+ProjectPath);
		System.setProperty("webdriver.ie.driver", ProjectPath + "/drivers/IEDriverServer.exe");
	    WebDriver driver = new InternetExplorerDriver();
	    
	    driver.get("https://google.com");

		WebElement InputText= driver.findElement(By.xpath("//input[@name='q']"));
		InputText.sendKeys("Selenium Automation");
		
		WebElement GoogleSearchBtn = driver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@name='btnK']"));
		//GoogleSearchBtn.click();
		GoogleSearchBtn.sendKeys(Keys.RETURN);
		
		driver.close();
		driver.quit();
	    

	}

}
