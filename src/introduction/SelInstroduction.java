package introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelInstroduction  {

	public static void main(String[] args) {
		//Invoking Browser
		//Chrome - ChromeDriver ->Methods
		//WebDriver
		//System.setProperty("webdriver.chrome.driver", "C://Drivers/chromedriver.exe");
		System.setProperty("webdriver.edge.driver", "C://Drivers/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		driver.quit();
	}

}
