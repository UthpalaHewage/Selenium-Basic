package DemoSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigationHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\drivers\\SeleniumDrivers\\74\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		String URL = "http://www.facbook.com";
		
		driver.navigate().to(URL);
		driver.findElement(By.linkText("Forgotten account?")).click();
		driver.navigate().back();
		Thread.sleep(10000);
		driver.navigate().forward();
	}

}
