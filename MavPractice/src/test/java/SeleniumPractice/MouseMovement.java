package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseMovement {

	public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("http://mrbool.com/");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		//driver.manage().window().fullscreen();
		
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.className("menulink"))).build().perform();
		driver.findElement(By.xpath("//ul[@Class='submenu']//child::li//a[text()='Courses']")).click();

	}

}
