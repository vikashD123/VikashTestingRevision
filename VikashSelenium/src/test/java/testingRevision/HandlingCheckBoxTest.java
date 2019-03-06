package testingRevision;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Capture.Screen;

public class HandlingCheckBoxTest {
	@Test(enabled=true)
	public void test_radio() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","/home/manjit/Downloads/chromedriver_linux64/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
		
		List<WebElement>check_box=driver.findElements(By.xpath("//input[@name='lang' and @type='checkbox']"));
		
		int count=check_box.size();
		
		System.out.println(count);
		
		for(int i=0;i<count;i++) {
			
			WebElement el=check_box.get(i);
			
			String text=el.getAttribute("id");
			
			if(text.equalsIgnoreCase("sing")) {
				
				el.click();
				
				Screen.capture(driver,"check_box");
				
				break;
			}
		}
		Thread.sleep(3000);
		
		driver.close();
		
	}
}
