package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {

	public static void main(String[] args) {
         WebDriverManager.chromedriver().setup();
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();


		driver.switchTo().frame(0);
		WebElement source=driver.findElement(By.xpath("//p[text()='Drag me to my target']"));
		WebElement target=driver.findElement(By.id("droppable"));
		Actions action=new Actions(driver);
		
		action.dragAndDrop(source, target).build().perform();
		//action.clickAndHold(source).moveToElement(target).release().build().perform();
		
		
	}

}
