package NaveenDayChallenge;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day1 {
	

	static WebDriver driver;
	
	public static void main(String[] args) throws Exception {
		
		String Current_xpath_pop="//div[@class='maincounter-number']/span[@class='rts-counter']";
		String Today_xpath_pop="//div[text()='Today']//parent::div//span[@class='rts-counter']";
		String Thisyear_xpath_pop="//div[text()='This year']//parent::div//span[@class='rts-counter']";
		
		String today_Thisyear_xpath_pop="//div[text()='This year' or text()='Today']//parent::div//span[@class='rts-counter']";

		WebDriverManager.chromedriver().setup();

	    driver = new ChromeDriver();

		driver.get("https://www.worldometers.info/world-population/");
		System.out.println("*********Current Population data**********************");
		printPopulationdata(Current_xpath_pop);
		//printPopulationdata(Today_xpath_pop);
		// printPopulationdata(Thisyear_xpath_pop);
		
		System.out.println("*********today and this year data**********************");
		printPopulationdata(today_Thisyear_xpath_pop);
	} 
		
		public static void printPopulationdata(String locator) throws InterruptedException {
			
		int count=1;
			
		while(count<=20) {
			System.out.println(count+" sec");
			if (count==20) break;
			driver.findElements(By.xpath(locator)).stream().forEach(e->System.out.println(e.getText()));
			
		/*List<WebElement> poplist=driver.findElements(By.xpath(locator));
				
				for(WebElement e: poplist) {
					System.out.println(e.getText());
			}*/
				System.out.println("*******************************");
				Thread.sleep(1000);
				count++;
				}}
		
		
}
