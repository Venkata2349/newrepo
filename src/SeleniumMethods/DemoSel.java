package SeleniumMethods;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DemoSel {
	public static WebDriver driver;

	public static void main(String[] args) throws AWTException, InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Siva\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//driver = new ChromeDriver();//Setting system properties of EdgeDriver
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Siva\\Downloads\\edgedriver_win32\\msedgedriver.exe");

		//Creating an object of EdgeDriver
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
//		driver.navigate().to("https://www.naukri.com/registration/createAccount");
//		driver.manage().window().maximize();
//		
//		String Title = driver.getTitle();
//		System.out.println(Title);
//		
//		String url = driver.getCurrentUrl();
//		System.out.println(url);
//		
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("scroll(0,350)", "");
//		
//		WebElement ele1 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div[1]/form/div[2]/div[5]/div[1]/div[1]/button" ));
//		boolean b1 = ele1.isEnabled();
//		System.out.println(b1);
//		
//		boolean b2= ele1.isDisplayed();
//		System.out.println(b2);
//		
//		
//		WebElement ele2 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div[1]/form/div[2]/div[6]/a/i"));
//		boolean b3 = ele2.isSelected();
//		System.out.println(b3);
//		ele2.click();
		
		driver.navigate().to("https://selenium08.blogspot.com/2019/07/check-box-and-radio-buttons.html");
		WebElement we3 = driver.findElement(By.xpath("//input[@value='IE']"));
		boolean b4 = we3.isSelected();
		System.out.println(b4);
		
		
		
//		driver.navigate().to("https://google.co.in");
//		driver.findElement(By.id("APjFqb")).sendKeys("Sakshi news paper");
//		
//		driver.findElement(By.id("APjFqb")).clear();
//		
//		driver.navigate().back();
//		Thread.sleep(3000);
//		driver.navigate().forward();
//		
//		driver.navigate().refresh();
				
	
		
		
		/*
		 * JavascriptExecutor js = (JavascriptExecutor)driver;
		 * js.executeScript("scroll(0,350)"); Thread.sleep(3000); StringSelection s =
		 * new
		 * StringSelection("C:\\Users\\Siva\\Downloads\\Siva_2 years_Software Testing.pdf"
		 * ); // Clipboard copy
		 * Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s,null); // This
		 * will click on Browse button driver.findElement(By.xpath(
		 * "//*[@id=\"root\"]/div/div/div[2]/div/div/div[1]/form/div[2]/div[5]/div[1]/div[1]/button"
		 * )).click(); System.out.println("Browse button clicked");
		 * 
		 * // Create object of Robot class Robot robot = new Robot();// file path passed
		 * as parameter to StringSelection
		 * 
		 * 
		 * //identify element and click
		 * 
		 * Thread.sleep(4000); // Press Enter robot.keyPress(KeyEvent.VK_ENTER);
		 * 
		 * // Release Enter robot.keyRelease(KeyEvent.VK_ENTER);
		 * 
		 * // Press CTRL+V robot.keyPress(KeyEvent.VK_CONTROL);
		 * robot.keyPress(KeyEvent.VK_V);
		 * 
		 * // Release CTRL+V robot.keyRelease(KeyEvent.VK_CONTROL);
		 * robot.keyRelease(KeyEvent.VK_V); Thread.sleep(1000);
		 * 
		 * 
		 * robot.keyPress(KeyEvent.VK_ENTER); robot.keyRelease(KeyEvent.VK_ENTER);
		 */
		
		Thread.sleep(2000);
		//driver.close();

	}

}
