package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.grtjewels.com/all-jewellery.html?utm_source=google&utm_medium=cpc&utm_campaign=RO-April_GRT-Jewellers_Ecom_Google_Brand%20GRT_Search_Sales_01042023Phrase_AP&HYD&gclid=EAIaIQobChMI9r_slqfvgQMVeheDAx3i7AbwEAAYASAAEgI98PD_BwE");
        Thread.sleep(2000);
        Actions act = new Actions(driver);
        //if we want to perfrom mouseover we need to write below syntax
      act.moveToElement(driver.findElement(By.xpath("//a[@id=\"ui-id-3\"]/span[1]"))).build().perform();
    //if we want to perform click mouse over
      act.moveToElement(driver.findElement(By.linkText("Jhumkas"))).click().build().perform();
        driver.navigate().back();
        act.moveToElement(driver.findElement(By.linkText("Diamond"))).build().perform();
        
        act.moveToElement(driver.findElement(By.linkText("Drops"))).click().build().perform();
        driver.navigate().back();
        
        
        
	}

}
