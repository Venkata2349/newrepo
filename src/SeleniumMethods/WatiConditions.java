package SeleniumMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WatiConditions {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Siva\\Downloads\\edgedriver_win32\\msedgedriver.exe");
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://electoralsearch.eci.gov.in/");
			
		driver.findElement(By.id("firstNameID")).sendKeys("Siva");
		driver.findElement(By.id("lastNameID")).sendKeys("Kumar");
		driver.findElement(By.id("relFirstNameID2")).sendKeys("Prasad");
		
	}

}
