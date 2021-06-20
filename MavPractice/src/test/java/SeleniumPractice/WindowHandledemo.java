package SeleniumPractice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandledemo {

	public static void main(String[] args) throws InterruptedException {


		 WebDriverManager.chromedriver().setup();
		 
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://seleniumpractise.blogspot.com/2017/07/multiple-window-examples.html");
		 driver.manage().window().maximize();
		 String parent=driver.getWindowHandle();
		 System.out.println("Parent window id "+parent);
		 
		 driver.findElement(By.xpath("//a[contains(@href,'//www.google.com')]")).click();
		 
		 Set<String> allwindows=driver.getWindowHandles();
		 
		 int count=allwindows.size();
		 
		 System.out.println("total window count= "+count);
		 
		 for(String child:allwindows) {
		 
		if(!parent.equalsIgnoreCase(child)) {
			
			driver.switchTo().window(child);
			
			System.out.println("Title of this child window "+driver.getTitle());
			
			driver.findElement(By.name("q")).sendKeys("testing");
			
			Thread.sleep(2000);
		}
		 
	}
          driver.quit();
	}}
