package defaultPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	public static WebDriver driver;
	
	@BeforeSuite
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
	}
	
	@Test
	public void doLogin() {
		driver.get("http://gmail.com");
		driver.findElement(By.id("Email")).sendKeys("trainer@wayautomation");
		driver.findElement(By.id("Passwd")).sendKeys("sdfsdr");
		System.out.println("Hello");
	}
	
	@AfterSuite
	public void tearDown() {
		driver.quit();
	}
}
