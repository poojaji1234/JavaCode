package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement1 {

	public static void main(String[] args) throws InterruptedException {
		// WebElement is an interface which has 14 abstract methods
		
		//to launch the chrome browser
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		 WebElement ele=driver.findElement(By.name("username"));
		 ele.sendKeys("Admin");
		 String el=ele.getText();
		 System.out.println(ele.getText());
		 System.out.println(el);
		driver.findElement(By.name("password")).sendKeys("admin123");
		WebElement wb=driver.findElement(By.xpath("//button[text()=' Login ']"));
	    wb.click();

		 
		            //login
		// System.out.println(wb.getText());
		           //button
		 //System.out.println(wb.getTagName());
		           //submit
		 //System.out.println(wb.getAttribute("type"));
		 //wb.click(); 
		

	}

}
