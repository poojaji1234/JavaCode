package installation;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class manage {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com");
		
		Window win=driver.manage().window();
		win.fullscreen();
		win.getPosition();
		win.getSize();
		 Dimension size=win.getSize();
		 System.out.println(win.getSize());
		 
		 size.getHeight();
		 size.getWidth();
		 
		 win.setSize(new Dimension(100,500));
		 win.setPosition(new Point(500,500));
		 
		 
		 
		 Point pos=win.getPosition();
		 System.out.println(pos.getX());
		 System.out.println(pos.getY());
	
	
	}

}
