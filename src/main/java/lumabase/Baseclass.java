package lumabase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass {
	
	public static WebDriver driver;
	public static void BrowserLaunch(String url) {
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}
	public static void demo_click(WebElement element) {
		element.click();
	}
	public static void Sendkeys(WebDriver driver, WebElement ele,String st) {
		
		ele.sendKeys(st);
	}

}
