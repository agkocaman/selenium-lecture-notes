import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class alartsMessage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String text = "gökhan";
		System.setProperty("webdriver.chrome.driver", "C://Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("name")).sendKeys(text);
		driver.findElement(By.id("alertbtn")).click();
		Assert.assertEquals(driver.switchTo().alert().getText(),"Hello "+text+", share this practice page and share your knowledge");
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
		driver.findElement(By.id("name")).sendKeys(text);
		Thread.sleep(1000);
		driver.findElement(By.id("confirmbtn")).click();
		Assert.assertEquals(driver.switchTo().alert().getText(),"Hello "+text+", Are you sure you want to confirm?");
		driver.switchTo().alert().dismiss();
		
		

	}

}
