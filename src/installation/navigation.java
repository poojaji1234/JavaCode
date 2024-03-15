package installation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigation {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com");
	Navigation nav=driver.navigate();
	nav.back();
	Thread.sleep(7000);
	nav.forward();
	nav.refresh();
	nav.to("https://www.google.com");
	driver.manage().window().maximize();
	}
}
