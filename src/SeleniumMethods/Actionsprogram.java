
package SeleniumMethods;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionsprogram {
	public static WebDriver driver;
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.edge.driver", "C:\\Users\\Siva\\Downloads\\edgedriver_win32\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.naukri.com/");
		
		//WebElement el1 = driver.findElement(By.xpath("//a[@title=\"Search Jobs\"]"));
		//WebElement el2 = driver.findElement(By.xpath("//a[@title=\"IT jobs\"]"));
		
		Actions act = new Actions(driver);
		// below line is focused to mouse over to the particular option
		//act.moveToElement(el1).build().perform();
		// below line is focused to click on mouse over to the particular option
		//act.moveToElement(el2).click().build().perform();
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		//WebElement el3 = driver.findElement(By.xpath("//span[contains(text(),\"right click me\")]"));
		
		
		//WebElement el4 = driver.findElement(By.xpath("//*[text()=\"Edit\"]"));
		// below line is perform right click operation
		//act.contextClick(el3).build().perform();
		//el4.click();
		// below line is perfrom alerts
		
		
		//String alerttext = al.getText();
		//System.out.println("alert text is "+alerttext);
		//al.accept();
		
		WebElement el5 = driver.findElement(By.xpath("//*[@id=\"authentication\"]//button"));
		
		//*[@id="authentication"]/button
		///html/body/button
		act.doubleClick(el5).build().perform();
		
		Thread.sleep(2000);
		Alert al = driver.switchTo().alert();
		String alerttext2 = al.getText();
		System.out.println(alerttext2);
		al.accept();
		
		
		
		

	}

}
