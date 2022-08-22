package MySelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniunFirstProgram {

	public static void main(String[] args) throws InterruptedException {
		// Set Chrome driver path
		System.setProperty("webdriver.chrome.driver", ".//Resources//chromedriver.exe");
		// Create driver Object
		WebDriver driver = new ChromeDriver();
		// LunchApplication
		driver.get("https://www.google.com");
		// Static wait
		Thread.sleep(3000);
        //Create WebElement for search Text Box
		WebElement txtBox = driver.findElement(By.name("q"));
		// Type Automation Testing in the search text box
		txtBox.sendKeys("Automation Testing");
		//Create WebElement for Google search Button
		WebElement btnSearch = driver.findElement(By.name("btnK"));
		// Static wait
		Thread.sleep(2000);
		//Create Action class object
		Actions actObj = new Actions(driver);
		//perform click action on google search button using actions class 
		actObj.moveToElement(btnSearch).click().perform();
		// Static wait
		Thread.sleep(2000);
		//Close browser tab
		driver.close();
		//Quit browser
		driver.quit();

	}

}
