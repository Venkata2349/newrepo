package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://electoralsearch.eci.gov.in/");
		Select state = new Select(driver.findElement(By.id("stateID")));
		state.selectByVisibleText("Andhra Pradesh");
		 
	driver.findElement(By.xpath("//*[@id=\"firstNameID\"]")).sendKeys("Siva");
	driver.findElement(By.xpath("//*[@id=\"lastNameID\"]")).sendKeys("prasad");
	driver.findElement(By.xpath("//*[@id=\"relFirstNameID\"]")).sendKeys("Raghu");
	driver.findElement(By.xpath("//*[@id=\"relLastNameID\"]")).sendKeys("Ram");
	
	driver.findElement(By.id("ageID")).click();
    Select age = new Select(driver.findElement(By.xpath("//select[@id='ageID']")));
    age.selectByValue("21");
    driver.findElement(By.id("genderID")).click();
    Select dist = new Select(driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[3]/div[3]/div[2]/div[1]/div[2]/div/select")));
    dist.selectByVisibleText("Anakapalli");
    Thread.sleep(2000);
    Select cos = new Select(driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[3]/div[3]/div[2]/div[2]/div[2]/div/select")));
    
    ;
	cos.selectByVisibleText("Chodavaram");
	}

}
