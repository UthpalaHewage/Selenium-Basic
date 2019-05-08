package DemoSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\drivers\\SeleniumDrivers\\74\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.get("http://demo.guru99.com/test/radio.html");
		
		//selecting checkbox
		WebElement option1 = driver.findElement(By.id("vfb-6-0"));
		option1.click();
		Thread.sleep(5000);
		
		//check whether checkbox is toggled on
		if(option1.isSelected()) {
			System.out.println("Checkbox is Toggled on");
			
		}
		else{
			System.out.println("Checkbox is Toggled off");
		}
		driver.close();
	}

}
