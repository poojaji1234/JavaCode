package webelement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart_dependentnd_independent {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		
	    //driver.findElement(By.xpath("//span[text()='x']")).click();
		
		
	WebElement searchbox=driver.findElement(By.name("q"));
		searchbox.sendKeys("Mobile");
		searchbox.sendKeys(Keys.ENTER);
		
		 WebElement dynamic=driver.findElement(By.xpath("//div[text()=\"realme C67 5G (Dark Purple, 128 GB)\"]/../..//div[.=\"₹11,999\"]"));
		      System.out.println(dynamic.getText());
		      dynamic.click();
	}
}
