package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import graphql.execution.instrumentation.tracing.TracingInstrumentation.Options;

public class locators {

	public static void main(String[] args) throws InterruptedException   {
	
		//WebDriver driver=new ChromeDriver();
		ChromeDriver driver=new ChromeDriver();
	
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(4000);
		//driver.findElement(By.name("username")).sendKeys("Admin");
		WebElement we=driver.findElement(By.name("username"));
		we.sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.tagName("button")).click();
		System.out.println("yes");
		
		 String yu=we.getAttribute("Username");
		
		System.out.println(yu);

	}

}
