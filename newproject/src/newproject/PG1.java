package newproject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PG1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\drivers\\SeleniumDrivers\\74\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String baseurl = "http://demo.guru99.com/test/newtours/";
		//String baseurl = "https://www.javatpoint.com/selenium-tutorial";
		String expectedTitle = "Welcome: Mercury Tours";
		String actualTitle = "";
		
		driver.get(baseurl);
		
		actualTitle = driver.getTitle();
		
		if(actualTitle.contentEquals(expectedTitle)) {
			System.out.println("Test passed!!");
		
		}
		else {
			System.out.println("Test failed!!");
		}
		
		driver.close();

	}

}
