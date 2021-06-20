package SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeOptionsDemo {

	public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
		ChromeOptions option=new ChromeOptions();
		option.addArguments("disable-infobars"); 
		//option.addExtensions(paths);
		
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setAcceptInsecureCerts(true);
		option.merge(cap);
	
		WebDriver driver =new ChromeDriver(option);
		
		driver.get("https://google.com/");

	}

}
