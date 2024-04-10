package webelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waittypes {
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		            
		               //implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		 
		                    //explicitly wait
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10) );
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(""))).click();
		
		                    //fluent wait
		Wait<WebDriver> wait1=new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10))
		         .pollingEvery(Duration.ofSeconds(20))
		         .ignoring(NoSuchElementException.class);
		
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(""))).click();
		
	}

}
