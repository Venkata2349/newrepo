package SeleniumMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddrop {
	public static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.edge.driver", "C:\\Users\\Siva\\Downloads\\edgedriver_win32\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
//		driver.get("https://demo.guru99.com/test/drag_drop.html");
//		WebElement fromLocation = driver.findElement(By.xpath("//a[text()=\" BANK \"]"));
//		
//		WebElement toLocation =  driver.findElement(By.xpath("//*[@id=\"bank\"]/li"));
//		
//		Actions act = new Actions(driver);
//		act.dragAndDrop(fromLocation, toLocation).build().perform();
		// how to get the toatal links in page
		driver.get("http://www.google.com");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		for(int i=0;i<links.size();i++) {
			String linkstext = links.get(i).getText();
			System.out.println(linkstext);
			
	
		}
		
		
		
	}

}
