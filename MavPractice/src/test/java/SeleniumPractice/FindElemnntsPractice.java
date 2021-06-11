package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElemnntsPractice {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		//driver.findElement(By.name("q")).sendKeys("Java");
		//List<WebElement> list=driver.findElements(By.xpath("//ul[@role='listbox']//li"));
		
		List<WebElement> list=driver.findElements(By.xpath("//a"));

		
		System.out.println("All Suggestions: "+list.size());
		
		for(int i=1;i<list.size();i++)
		{
		  
		System.out.println(list.get(i).getText());

}
	driver.close();	
	
	}
	
}
