package SeleniumPractice;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandleUsingList {

	public static void main(String[] args) {

 WebDriverManager.chromedriver().setup();
		 
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://seleniumpractise.blogspot.com/2017/07/multiple-window-examples.html");
		 driver.manage().window().maximize();
		 String parent=driver.getWindowHandle();
		 System.out.println("Parent window id "+parent);
		 
		 driver.findElement(By.xpath("//a[contains(@href,'//www.google.com')]")).click();
		 
		 Set<String> allwindows=driver.getWindowHandles();
		 
		 ArrayList<String> tabs=new ArrayList<String>(allwindows);
		 
		 driver.switchTo().window(tabs.get(1));
		 
		 System.out.println("Title of this child window is: "+driver.getTitle());
		 
		 driver.close();
		 
		 driver.switchTo().window(tabs.get(0));
		 
		 System.out.println("Title of this parent window is: "+driver.getTitle());

	}

}
