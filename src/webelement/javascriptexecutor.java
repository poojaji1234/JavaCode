package webelement;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class javascriptexecutor {
	public static void main(String[]args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(10));
		//wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("")));
		
		Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10))
		        .pollingEvery(Duration.ofSeconds(20))
		        .ignoring(NoSuchElementException.class);
		        
				
		
		
		
		driver.manage().window().maximize();
		
		driver.get("https://demos.jquerymobile.com/1.4.5/forms-disabled/");
		WebElement text=driver.findElement(By.name("textinput-1"));
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		Thread.sleep(2000);
		js.executeScript("arguments[0].value='rajan'",text);
		
			
	}

}
