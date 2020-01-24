import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import java.io.IOException;

public class TestSelenium {
	
	public static void main(String[] args) throws IOException, InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
		ChromeOptions chromeOptions = new ChromeOptions();
		//chromeOptions.addArguments("--headless");
		chromeOptions.addArguments("--no-sandbox");

		WebDriver driver = new ChromeDriver(chromeOptions);

		System.out.println("Hi, Welcome to Josleke Selenium Test");

		driver.get("http://localhost:8080");

		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.id("about-us")).click();

		Thread.sleep(1000);
		driver.quit();
	}
}
