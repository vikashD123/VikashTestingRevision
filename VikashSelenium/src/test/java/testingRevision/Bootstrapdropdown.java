package testingRevision;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Bootstrapdropdown {

@Test(enabled=true)
public void test2() throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","/home/manjit/Downloads/chromedriver_linux64/chromedriver");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("http://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
	
	driver.findElement(By.xpath("//*[@type='button']")).click();
	
   List<WebElement> el=driver.findElements(By.xpath("//ul[@role='menu']//li/a"));
   
   int count=el.size();
   
   System.out.println(count);
   
   for(int i=0;i<=count;i++) {
	   
	   WebElement drop=el.get(i);
	   
	   String text=drop.getText();
	   
	   System.out.println(text);
	   
	   if(text.equalsIgnoreCase("css")) {
		   
		   drop.click();
		   
		   break;
	   }
   }
   Thread.sleep(3000);
   
   driver.close();
}


}
