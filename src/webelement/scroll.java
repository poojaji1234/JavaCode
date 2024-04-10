package webelement;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scroll {
	public static void main(String[]args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.selenium.dev/");
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
	   // js.executeAsyncScript("window.scrollTo(0, 600)");
	    //Thread.sleep(3000);
		
		//js.executeScript("window.scrollTo(0, -300)");
	    
	      js.executeScript("window.scrollBy(0, document.body.scrollHeight)");
	    
	}
	
}
