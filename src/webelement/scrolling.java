package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrolling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		
		Thread.sleep(5000);
		WebElement img = driver.findElement(By.xpath("//p[text()=\" EXPERIENCE MYNTRA APP ON MOBILE \"]"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		
		//js.executeAsyncScript("window.scrollTo(0, 1000)");
		
		//Thread.sleep(3000);
		//js.executeScript("window.scrollTo(0, -300)");
	
		 // To scroll the bottom page
		//js.executeScript("window.scrollBy(0, document.body.scrollHeight)");
		
		js.executeAsyncScript("arguments[0].scrollIntoView()",img);
		js.executeAsyncScript("arguments[0].scrollIntoView()",img);
		
	}

}