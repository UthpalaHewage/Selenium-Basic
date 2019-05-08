package DemoSelenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\drivers\\SeleniumDrivers\\74\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); 
		
		//put an implicit wait, this means that any search for element on the page could take the time 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//launch the url
		driver.get("http://toolsqa.wpengine.com/automation-practice-switch-windows/");
		
		//store and print the name of the first window on the console
		String handle = driver.getWindowHandle();
		System.out.println(handle);
		
		//click on the button "new msg window"
		driver.findElement(By.xpath("//*[@id='content']/p[3]/button")).click();
		
		//store an print the name of all windows open
		Set handles = driver.getWindowHandles();
		System.out.println(handles);
		
		
		//pass a window handle to the other window
		//advanced for loop
		for(String handle1 : driver.getWindowHandles()) {
		System.out.println(handle1);
		driver.switchTo().window(handle1);
		}
		
		//closing pop up window
		Thread.sleep(5000);
		driver.close();
		
		//close original window
		Thread.sleep(5000);
		
		driver.quit();
		
		
	}

}
