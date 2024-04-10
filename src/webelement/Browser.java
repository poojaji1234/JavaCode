package webelement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
	public static void main(String[] args)
	{
		//This statement is to used launch the chrome browser. 
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.ebay.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
		System.out.println(driver.getWindowHandles());
		System.out.println(driver.getWindowHandle());
		
		driver.manage().window().maximize();
		System.out.println(driver.manage().window().getSize());
		driver.manage().window().getPosition();
		//driver.navigate().back();
		//Navigation nav = driver.navigate();
		 //nav.back(); 
		//driver.switchTo().window("A2676376387GHG");
	
		driver.close();
		driver.quit();
		
	}

}
