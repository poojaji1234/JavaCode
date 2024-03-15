package webelement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class multiselect_dropdown {
	@SuppressWarnings("deprecation")
	public static void main(String args[]) throws InterruptedException
	{
		//WebDriver driver=new ChromeDriver();
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


		
		driver.get("https://demoqa.com/select-menu");
	
		Thread.sleep(3000);
	
	WebElement multi=driver.findElement(By.id("cars"));
    Select sct=new Select(multi);
    Thread.sleep(3000);
    System.out.println(sct.isMultiple());
    
    sct.selectByIndex(0);
    sct.selectByValue("audi");
    sct.selectByVisibleText("Saab");
    
    //to deselect
                  //  sct.deselectAll();
                    sct.deselectByIndex(0);
                    Thread.sleep(3000);
                    sct.deselectByValue("audi");
                    Thread.sleep(3000);
                    sct.deselectByVisibleText("Saab");
}
}

