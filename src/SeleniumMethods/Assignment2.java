package SeleniumMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.edge.driver", "C:\\Users\\Siva\\Downloads\\edgedriver_win32\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.grtjewels.com/all-jewellery.html?utm_source=google&utm_medium=cpc&utm_campaign=RO-April_GRT-Jewellers_Ecom_Google_Brand%20GRT_Search_Sales_01042023Phrase_AP&HYD&gclid=EAIaIQobChMI9r_slqfvgQMVeheDAx3i7AbwEAAYASAAEgI98PD_BwE");
		String title = driver.getTitle();
		System.out.println("Title is "+title);
		WebElement Gold = driver.findElement(By.xpath("//a[@id=\"ui-id-3\"]/span[1]"));
		WebElement Jhumkas = driver.findElement(By.xpath("//*[@class=\"mega-col mega-col-5 mega-col-level-2\"]/div[4]/a/span"));
		Actions act = new Actions(driver);
		act.moveToElement(Gold).build().perform();
		act.moveToElement(Jhumkas).click().perform();
		WebElement Clear=driver.findElement(By.partialLinkText("Clear All"));
		Clear.click();
		
		driver.findElement(By.id("switcher-currency-trigger")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()=\"USD\"]")).click();
		
		
		
		
		
		WebElement account = driver.findElement(By.xpath("//*[@id=\"auth-menu\"]/img"));
		account.click();
		WebElement login = driver.findElement(By.xpath("//*[@id=\"login-button\"]/button/span"));
		login.click();
		
	}

}
