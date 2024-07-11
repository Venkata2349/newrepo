package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class WindowProgram {
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Siva\\Downloads\\edgedriver_win32\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm#");
		WebElement P1 = driver.findElement(By.xpath("//*[text()=\"Products & Services\"]"));
		P1.click();
		//TO perform multiple window
		
		String parenthandle = driver.getWindowHandle();			
		for(String childwindow : driver.getWindowHandles()) {
			driver.switchTo().window(childwindow);
		}
			
			driver.manage().window().maximize();
			driver.findElement(By.linkText("Funds Transfer")).click();
			// To perform parent window
			driver.switchTo().window(parenthandle);
		Thread.sleep(2000);	
		driver.findElement(By.linkText("CONTINUE TO LOGIN")).click();
		
		
		
		
		
		

	}

}
