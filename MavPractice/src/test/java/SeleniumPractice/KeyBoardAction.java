package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class KeyBoardAction {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://the-internet.herokuapp.com/key_presses");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();

		driver.findElement(By.id("target")).sendKeys(Keys.SPACE);
		String text = driver.findElement(By.id("result")).getText();
		System.out.println(text);
		Assert.assertEquals(text, "You entered: SPACE");

		// Using Action class
		Actions action = new Actions(driver);
		action.sendKeys(Keys.DELETE).build().perform();
		String text1 = driver.findElement(By.id("result")).getText();
		System.out.println(text1);
		
		
		
	}
}