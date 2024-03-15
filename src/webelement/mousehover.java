package webelement;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mousehover {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		
		WebElement women = driver.findElement(By.linkText("WOMEN"));
		
		Actions act=new Actions(driver);
		
		//act.moveToElement(women).perform();
		
		//moveByoffset
		
		act.moveByOffset(468, 38).perform();
		
		Thread.sleep(4000);
		// Actions wo = act.moveToElement(women, 186, 40);
		//wo.click(women).perform();
		
	}
}

	

