package WebTables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\drivers\\SeleniumDrivers\\74\\chromedriver.exe");
			String baseUrl = "http://demo.guru99.com/test/write-xpath-table.html";
			WebDriver driver = new ChromeDriver();

			driver.get(baseUrl);
			String innerText = driver.findElement(
				By.xpath("//table/tbody/tr[1]/td[2]")).getText(); 	//first row second column
		        System.out.println(innerText); 
			driver.quit();
			
	}

}
