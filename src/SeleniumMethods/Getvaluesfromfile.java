package SeleniumMethods;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;import graphql.parser.antlr.GraphqlParser.ArgumentsContext;

public class Getvaluesfromfile {
	public static WebDriver driver;

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Siva\\Downloads\\edgedriver_win32\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		//driver.manage().window().maximize();
		driver.get("https://electoralsearch.eci.gov.in/");
		
		FileInputStream fis = new FileInputStream("C:\\Users\\Siva\\eclipse-workspace\\Project123\\src\\ObjectProperties");
		Properties prop = new Properties();
		prop.load(fis);
		
		Select state = new Select(driver.findElement(By.xpath(prop.getProperty("selectState.xpath"))));
		state.selectByVisibleText("Andhra Pradesh");

		Thread.sleep(2000);
		driver.findElement(By.id(prop.getProperty("Firstname_id"))).sendKeys("chenna");
		
		// how to enter the value without using sendkeys method
		WebElement lastname = driver.findElement((By.id(prop.getProperty("Lastname.id"))));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='testuser'", lastname); 
		
		
		
	}

}
