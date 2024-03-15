package webelement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nykaa.com/sp/natural-native/natural?root=nav_1");
		
		WebElement link = driver.findElement(By.xpath("(//a[contains(text(),'Lingerie')])[3]"));
		
		 System.out.println(  link.getText());
		link.click();
		
		List<WebElement> link2 = driver.findElements(By.xpath("//a[contains(text(),'Lingerie')]"));
		
		   //for(datatypes variablename:array)
		
		    for(WebElement text:link2) {
		    	
		    	 System.out.println( text.getText());
		    }
		 //xpath by contains by attribute
		    
		    WebElement app = driver.findElement(By.xpath("(//a[contains(@href,\"https://www.nykaa.com/sp/pink\")])[6]"));

		        app.click();
		    
		  List<WebElement> links = driver.findElements(By.xpath("//a"));
		   
            System.out.println(  links.size());
		   
		   for(WebElement all:links) {
		    	
		    	System.out.println( all.getText());
		    
	}

}
}