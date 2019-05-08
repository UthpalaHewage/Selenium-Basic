package ChromeBrower;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LaunchApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\drivers\\SeleniumDrivers\\74\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.learn-automation.com");
		System.out.println(driver.getTitle());
	}

}
