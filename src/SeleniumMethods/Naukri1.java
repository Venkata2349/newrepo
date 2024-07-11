package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Naukri1 {
	public static WebDriver driver;
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		driver.findElement(By.id("register_Layer")).click();
		driver.findElement(By.id("name")).sendKeys("siva");
		driver.findElement(By.id("email")).sendKeys("sivapattem007@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Naukri@1234");
		driver.findElement(By.id("mobile")).sendKeys("8099172330");
		
	}

}
