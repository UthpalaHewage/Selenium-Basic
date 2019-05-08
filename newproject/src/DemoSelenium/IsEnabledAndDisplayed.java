package DemoSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledAndDisplayed {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\drivers\\SeleniumDrivers\\74\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		String contactUrl = "http://www.testdiary.com/training/selenium/selenium-test-page/";
		
		driver.get(contactUrl);
		
		WebElement seleniumCheckbox = driver.findElement(By.id("seleniumbox"));
		WebElement restCheckbox = driver.findElement(By.id("restapibox"));
		
		//Declaring a local variable of type "Boolean" to initialize the value of the webElement (checkSelenium) & webElement (checkRestApi)
		//Using the isSelected method we check if the check box is selected or not
		
		Boolean checkSelenium = seleniumCheckbox.isSelected();
		Boolean checkRestApi = restCheckbox.isSelected();
		
		//use an if condition to check if boolean returned false
		//if false then it was not selected click and select the checkbox
		if(checkSelenium == false) {
			seleniumCheckbox.click();
			System.out.println("Test has selected Selenium checkbox");
		}
		else {
			System.out.println("Selenium checkbox was selected on default");
		}
		
		//repeat the process for checkRestApi
		if(checkRestApi == false) {
			restCheckbox.click();
			System.out.println("Test has selected Rest api checkbox");
		}
		else {
			System.out.println("Rest Api checkbox was selected on default");
		}
		
		//check if save button is displayed on the WebPage
		WebElement saveButton = driver.findElement(By.id("demo"));
		
		Boolean checkSaveIsDisplayed = saveButton.isDisplayed();
		
		if(checkSaveIsDisplayed == true) {
			System.out.println("save button is displayed");
		}
		
		//check if save button is not enabled on the webpage
		Boolean checkSaveIsEnabled = saveButton.isEnabled();
		
		if(checkSaveIsEnabled == false) {
			System.out.println("save button is not enabled");
		}		
		
		//click on a radio button then check if the save button is now enabled
		
		
		
		

	}

}
