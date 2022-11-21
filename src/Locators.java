import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", "C://Drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://rahulshettyacademy.com/locatorspractice/");
	driver.findElement(By.id("inputUsername")).sendKeys("deneme1");
	driver.findElement(By.name("inputPassword")).sendKeys("deneme2");
	//driver.findElement(By.className("signInBtn")).click();
	driver.findElement(By.cssSelector("button[type='submit']")).click();
	System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
	driver.findElement(By.linkText("Forgot your password?")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Gökhan");
	driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("gokhan.kocaman@hotmail.com");
	driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
	driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("gokhan.kocaman@gmail.com");
	driver.findElement(By.xpath("//form/input[3]")).sendKeys("23232323");
	driver.findElement(By.className("reset-pwd-btn")).click();
	System.out.println(driver.findElement(By.cssSelector(".infoMsg")).getText());
	driver.findElement(By.cssSelector(".go-to-login-btn")).click();
	driver.findElement(By.id("inputUsername")).sendKeys("gökhan");
	driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
	Thread.sleep(500);
	driver.findElement(By.xpath("//input[@id='chkboxOne']")).click();
	Thread.sleep(500);
	driver.findElement(By.xpath("//input[@id='chkboxTwo']")).click();
	Thread.sleep(500);
	
	driver.findElement(By.cssSelector("button[type='submit']")).click();
	
	
	}

}
//p[@class='error']