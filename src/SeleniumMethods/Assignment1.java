package SeleniumMethods;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.edge.driver", "C:\\Users\\Siva\\Downloads\\edgedriver_win32\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://electoralsearch.eci.gov.in/");
		driver.findElement(By.xpath("//*[@id=\"firstNameID\"]")).sendKeys("Siva");
		driver.findElement(By.xpath("//*[@id=\"lastNameID\"]")).sendKeys("prasad");
		driver.findElement(By.xpath("//*[@id=\"relFirstNameID\"]")).sendKeys("Raghu");
		driver.findElement(By.xpath("//*[@id=\"relLastNameID\"]")).sendKeys("Ram");
       WebElement Age = driver.findElement(By.id("ageID"));
       Age.click();
       Thread.sleep(2000);
       Select sel1 = new Select(Age);
       Alert al = driver.switchTo().alert();
       al.accept();
       
       Select sel = new Select(driver.findElement(By.xpath("//select[@id=\"ageID\"]")));
       sel.selectByVisibleText("31");
       Select selstate = new Select(driver.findElement(By.id("stateID")));
       selstate.selectByValue("S02");
       
       
        
	}

}
