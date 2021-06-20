package SeleniumPractice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinks {

	public static void main(String[] args) throws IOException, IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		List<WebElement> links = driver.findElements(By.tagName("a"));

		links.addAll(driver.findElements(By.tagName("img")));

		System.out.println("Size of all list " + links.size());

		List<WebElement> ActiveLinks = new ArrayList<WebElement>();

		for (int i = 0; i < links.size(); i++) {
			//System.out.println(links.get(i).getText());
			if (links.get(i).getAttribute("href") != null) {
				ActiveLinks.add(links.get(i));
			}

		}

		System.out.println("Size of active list " + ActiveLinks.size());

		for (int j = 0; j < ActiveLinks.size(); j++) {

			HttpURLConnection connection = (HttpURLConnection) new URL(ActiveLinks.get(j).getAttribute("href")).openConnection();
		    connection.connect();
			String response=connection.getResponseMessage();
			connection.disconnect();
		
		    System.out.println(ActiveLinks.get(j).getAttribute("href")+" "+response);
	}

}
}