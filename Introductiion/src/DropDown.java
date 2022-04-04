import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		
		// set the driver properties
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ivan\\eclipse\\ChromeDriver\\chromedriver.exe");
		//create a new driver
		WebDriver driver = new ChromeDriver();
		//open the url
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		
		//Duration timeToWait = Duration.ofSeconds(2);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("(//a[@value='MAA'])[2]"))));
		///Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		
		

 }
}
