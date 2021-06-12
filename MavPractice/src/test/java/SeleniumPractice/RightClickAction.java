package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickAction {

	public static void main(String[] args) throws InterruptedException {
        WebDriver driver =new ChromeDriver();
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		Actions action=new Actions(driver);
		
		WebElement rightclick=driver.findElement(By.xpath("//span[text()='right click me']"));
		
		action.contextClick(rightclick).build().perform();
		
		WebElement copy=driver.findElement(By.cssSelector(".context-menu-icon-copy"));
		
		String copytext=copy.getText();
		
		System.out.println(copytext);
		
		copy.click();
		
		Thread.sleep(3000);
		String alert=driver.switchTo().alert().getText();
		System.out.println(alert);
		driver.switchTo().alert().accept();
		
		
	
		
	}
	

}
