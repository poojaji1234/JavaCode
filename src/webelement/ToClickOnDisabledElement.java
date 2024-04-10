package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToClickOnDisabledElement {

	public static void main(String[]args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://oracle.com/in/java/technologies/downloads");
		driver.findElement(By.linkText("jdk-8u401-linux-aarch64.rpm")).click();
		
		
	
		    WebElement link=driver.findElement(By.xpath("//a[text()='Download jdk-8u401-linux-aarch64.rpm']"));
		
			JavascriptExecutor js=(JavascriptExecutor) driver;
			Thread.sleep(5000);
			js.executeScript("arguments[0].click()",link);
			js.executeScript("arguments[0].click()", link);
}
}
	
