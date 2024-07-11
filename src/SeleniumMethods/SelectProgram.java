package SeleniumMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectProgram {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Siva\\Downloads\\edgedriver_win32\\msedgedriver.exe");

		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		
		WebElement w1 = driver.findElement(By.xpath("//select[@name='country']"));
		
		Select country = new Select(w1);
//		country.selectByVisibleText("INDIA");
//		Thread.sleep(2000);
//		country.selectByValue("ANTARCTICA");
//		Thread.sleep(2000);
//		country.selectByIndex(4);
		
		//Get all options
	    List<WebElement> CountryCount = country.getOptions();
	    System.out.println("County count is " +CountryCount.size());
	   
	    
	    for(int x=0;x<CountryCount.size();x++) {
	    	String countries = CountryCount.get(x).getText();
	    	System.out.println("Countries are listed in below");
	    	System.out.println(countries);
	    			
	    	
	    }
	    
	    
	    
	    
		
		

	}

}
