package testingRevision;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Capture.Screen;

public class RadioTestScreen {

	@Test(enabled=true)
	public void test_radio() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","/home/manjit/Downloads/chromedriver_linux64/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
		
		List<WebElement>el=driver.findElements(By.xpath("//input[@name='lang' and @type='radio']"));
		
		int count=el.size();
		
		System.out.println(count);
		
		for(int i=0;i<count;i++) {
			
			WebElement value=el.get(i);
			
			String text=value.getAttribute("id");
			
			System.out.println(text);
			
			if(text.equalsIgnoreCase("c#")) {
				
				value.click();
				
				Screen.capture(driver,"radio");
				
				break;
			}
		}
		Thread.sleep(3000);
		
		driver.close();
}
}