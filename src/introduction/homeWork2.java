package introduction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class homeWork2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='form-control ng-untouched ng-pristine ng-invalid' ][@name='name']")).sendKeys("Gökhan");
		driver.findElement(By.xpath("//input[@class='form-control ng-untouched ng-pristine ng-invalid' ][@name='email']")).sendKeys("gokhan.kocaman@gmail.com");
		driver.findElement(By.xpath("//input[@class='form-control' ][@type='password']")).sendKeys("12345");
		driver.findElement(By.xpath("//input[@class='form-check-input' ][@type='checkbox']")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//input[@class='form-check-input' ][@type='checkbox']")).isSelected());
		Select select = new Select(driver.findElement(By.xpath("//select[@class='form-control']")));
		select.selectByIndex(1);
		driver.findElement(By.xpath("//input[@class='form-check-input' ][@value='option1']")).click();
		driver.findElement(By.xpath("//input[@class='form-check-input' ][@value='option2']")).click();
		driver.findElement(By.xpath("//input[@class='form-check-input' ][@value='option3']")).click();
		driver.findElement(By.xpath("//input[@class='form-control' ][@name='bday']")).sendKeys("31.12.2022");
		driver.findElement(By.xpath("//input[@type='submit' ][@value='Submit']")).click();
		Thread.sleep(1000);
		System.out.println();
		Assert.assertEquals(driver.findElement(By.xpath("//strong[contains(text(),'Success!')]")).getText(), "Success!");
		
		
	}

}
