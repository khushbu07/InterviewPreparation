package SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadlessUsingChromeOptions {

	public static void main(String[] args) {

       ChromeOptions option=new ChromeOptions();
      // option.addArguments("window-size 1400,800");
       option.addArguments("headless");
	    WebDriverManager.chromedriver().setup();
		
		WebDriver driver =new ChromeDriver(option);
		
		driver.get("https://www.google.com/");
		String title=driver.getTitle();
		System.out.println("Current window title : "+title);
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();

	}

}
