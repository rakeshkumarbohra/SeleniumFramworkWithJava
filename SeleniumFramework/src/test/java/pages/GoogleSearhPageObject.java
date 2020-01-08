package pages;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearhPageObject {
	WebDriver driver =null;
	By textBoxSearch = By.name("q");
	By buttonSearch = By.name("btnK");
	
	public GoogleSearhPageObject(WebDriver driver){
		this.driver=driver;
	}
	
	
	public void setTextInSearchBox(String text){
		driver.findElement(textBoxSearch).sendKeys(text);
	}

	public void clickSearchBox(){
		driver.findElement(buttonSearch).sendKeys(Keys.RETURN);
	}
}
