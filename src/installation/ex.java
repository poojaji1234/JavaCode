package installation;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.TakesScreenshot;

public class ex {

	public static void main(String[] args) throws IOException {
	
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("123@abc");
		driver.findElement(By.name("login")).click();
		
		//FileInputStream fis=new FileInputStream("file");
		
		
		
		
		
	    File srfile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    //FileUtils.copyFile(srfile,  new File(".//screenshot/screen.png"));
		
		
		driver.quit();

	}

}
