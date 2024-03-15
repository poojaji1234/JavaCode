package webelement;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frames {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/frames");
		
		driver.switchTo().frame(0);
		driver.switchTo().frame(0);
		driver.findElement(By.id("a")).click();

		driver.switchTo().parentFrame();
		
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("rrrrr");
		
		driver.switchTo().defaultContent();
		
		WebElement frame2 = driver.findElement(By.id("frame2"));
		
		driver.switchTo().frame(frame2);
		
		driver.findElement(By.id("animals")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//option[text()='Baby Cat']")).click();
		System.out.println("done");
	}

}
