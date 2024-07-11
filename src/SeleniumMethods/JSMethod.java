package SeleniumMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class JSMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Siva\\Downloads\\edgedriver_win32\\msedgedriver.exe");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://electoralsearch.eci.gov.in/");
		// to write first name using js
		WebElement firstname = driver.findElement(By.id("firstNameID"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//1st way
		js.executeScript("arguments[0].value='Siva'", firstname);
		//2nd way
		//js.executeScript("document.getElementById('textbox_id').value='kumar';");//"document.getElementById('gsc-i-id1').value='Selenium'"
		//js.executeScript("document.getElementById('textbox_id').value='Selenium'", "");
		
		//js.executeScript("Scroll(0,370)", "");
		js.executeScript("scroll(0,350)", "");
		Thread.sleep(4000);
		js.executeScript("scroll(0,-350)", "");
		Thread.sleep(4000);
		js.executeScript("window.scrollBy(0,350)", "");
		Thread.sleep(4000);
		js.executeScript("scroll(0,350)", "");
		
		WebElement search_button = driver.findElement(By.xpath("//button[contains(text(),'SEARCH')]"));
		js.executeScript("arguments[0].scrollIntoView()", search_button);
		

	}

}
