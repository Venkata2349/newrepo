package SeleniumMethods;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new EdgeDriver();
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Siva\\Downloads\\edgedriver_win32\\msedgedriver.exe");
		driver.manage().window().maximize();
		driver.get("https://electoralsearch.eci.gov.in/");
		
		WebElement search_button = driver.findElement(By.xpath("//button[contains(text(),\"SEARCH\")]"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView()", search_button);
		
		// Source File
		File SourceFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		//Destination file name location
		File Destination_location = new File("C:\\Users\\Siva\\Desktop\\Siva1.png");
		FileHandler.copy(SourceFile, Destination_location);
		
			
		
		
	}

	

}
