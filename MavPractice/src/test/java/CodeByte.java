import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


/*Test Case :

Step1 open "https://www.google.com/"

Step2 Type "COVID-19" in search bar

Step3 Click News in search result page (as highlighted in image)

Step4 Read all the news providing agencies show on the search result page in that ArrayList (as highlighted in image).

Step5 Count unique news agencies found in step4 if the count is < 3  print "Missing Leading News Agencies" else print total number of unique news agencies found along with their names. */
public class CodeByte {
	public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	
	 WebDriver driver =new ChromeDriver();
	
	driver.get("https://www.google.com/");
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	
   driver.findElement(By.name("q")).sendKeys("COVID-19");


   driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
   
   driver.findElement(By.xpath("//a[text()='News']")).click();
   
  List<WebElement> list=driver.findElements(By.xpath("//div[@class='XTjFC WF4CUc']"));
  //List<WebElement> UniqueAgency= list.stream().distinct().collect(Collectors.toList());
	 //System.out.println(UniqueAgency);
 
  int leng=list.size();
  
  for(int i=0;i<=leng-1;i++) {
	  
	  System.out.println(list.get(i).getText());
  }
  
  
	if(leng<3) {
	  System.out.println("Missing Leading News Agencies");
	}
	else {
		System.out.println("all printed");
	}
}}