package pack1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileprogram {
	public static WebDriver driver;
	static int x = 10;

	public static void main(String args[]) throws Exception {
		System.out.println("java working");
		System.out.println(x);
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Siva\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/login.html");
		// to get the element locators from the file
		FileReader reader = new FileReader("C:\\Users\\Siva\\eclipse-workspace\\Project123\\Object");
		Properties pr = new Properties();
		pr.load(reader);
		// driver.get(pr.getProperty("url"));
		// Using getProperty method we can call object.Properties file
		driver.findElement(By.id(pr.getProperty("EmailAddress_id"))).sendKeys("chenna");
		driver.findElement(By.id(pr.getProperty("Password.id"))).sendKeys("chenna");
		driver.findElement(By.name(pr.getProperty("SignIn.name"))).click();
		driver.close();

	}
}
