package DemoSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class formHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\drivers\\SeleniumDrivers\\74\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); 
		String baseUrl = "http://demo.guru99.com/test/login.html";
		driver.get(baseUrl);
		
		//get the WebElement corresponding to the email address(textfield)
		WebElement email = driver.findElement(By.id("email"));
		
		//get the WebElement corresponding to the password field
		WebElement password = driver.findElement(By.id("passwd"));
		
		email.sendKeys("abcd@gmail.com");
		password.sendKeys("abcdefgh1kjl");
		Thread.sleep(5000);
		System.out.println("Text field set");
		driver.findElement(By.id("SubmitLogin")).click();
		driver.close();
		
		
		
	}

}
