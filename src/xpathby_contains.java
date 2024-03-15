import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathby_contains {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.nykaa.com/sp/natural-native/natural?root=nav_1");
		Thread.sleep(4000);
		WebElement link=driver.findElement(By.xpath("(//a[contains(text(),'Lingerie')])[3]"));
		System.out.println(link.getText());
		link.click();
		
		List<WebElement> link1=driver.findElements(By.xpath("//a[contains(text(),'Lingerie')]"));
		//for(datatypes varname:aary)
		for(WebElement text:link1)
		{
			System.out.println(text.getText());
		}
			
		List<WebElement> link2=driver.findElements((By.xpath("//a")));
		
		System.out.println(link2.size());
		for(WebElement all:link2)
		{
			System.out.println(((WebElement) link2).getText());
		}
				
		
		//xpath by group index
		//a[text()=" Lingerie & Accessories "]
	}
	
}
