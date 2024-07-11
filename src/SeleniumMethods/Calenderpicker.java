package SeleniumMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Calenderpicker {

	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Siva\\Downloads\\edgedriver_win32\\msedgedriver.exe");
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		//Thread.sleep(2000);
		driver.findElement(By.id("datepicker")).click();
		List<WebElement> dates = driver.findElements(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr/td"));
		for (int i = 0;i<dates.size();i++) {
			String dateslist = dates.get(i).getText();
			System.out.println(dateslist);
			
			if(dateslist.equalsIgnoreCase("23")) {
				dates.get(i).click();
			     
			}
		}
//			}
//		}
	}
	
}
