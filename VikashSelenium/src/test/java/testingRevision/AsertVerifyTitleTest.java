package testingRevision;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AsertVerifyTitleTest {
	
	@Test(enabled=true)
	public void verify_Title() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","/home/manjit/Downloads/chromedriver_linux64/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		String actual_title=driver.getTitle();
		
		System.out.println(actual_title);
		
		String expected_title="Facebook";
		
		Assert.assertEquals(actual_title, expected_title,"Title didn't matched");
		
		System.out.println("Title verified");
		
		
	}

}
