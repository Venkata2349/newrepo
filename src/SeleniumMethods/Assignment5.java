package SeleniumMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver = new EdgeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
driver.get("https://retail.onlinesbi.sbi/retail/login.htm#");
WebElement manage = driver.findElement(By.linkText("Manage Debit Card E-Mandate"));
manage.click();
String parenthandle = driver.getWindowHandle();			
for(String childwindow : driver.getWindowHandles()) {
	driver.switchTo().window(childwindow);
}
//Thread.sleep(5000);
	driver.findElement(By.linkText("Continue")).click();
	driver.switchTo().window(parenthandle);
	driver.findElement(By.linkText("CONTINUE TO LOGIN")).click();
	}

}
