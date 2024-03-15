package webelement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class singleselect_dropdown {
	
	public static void main(String args[]) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		
		WebElement drop=driver.findElement(By.tagName("select"));
				
		
				    Select sct=new Select(drop);
				
				    System.out.println(sct.isMultiple());
				    Thread.sleep(2000);
				    sct.selectByIndex(2);
				    Thread.sleep(2000);
				    sct.selectByValue("ATA");
				    Thread.sleep(3000);
				    sct.selectByVisibleText("Bahrain");
				    
				    System.out.println(sct.getOptions());
				    
				    List<WebElement> opt=sct.getOptions();
				    
				    for(WebElement o: opt)
				    {
				    	//System.out.println(o.getText());
				    }
				    
				   // driver.navigate().to("https://demoqa.com/select-menu");
				    //WebElement multi=driver.findElement(By.tagName("cars"));
				    //Select sct=new Select(multi);
				    //System.out.println(sct.isMultiple());
				    
	}

}
