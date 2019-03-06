package testingRevision;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SelectTest {

	@Test(enabled=false)
	public void test() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","/home/manjit/Downloads/chromedriver_linux64/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement el=driver.findElement(By.id("day"));
		
		Select s=new Select(el);
		
		s.selectByIndex(8);
		
		Thread.sleep(3000);
		
		s.selectByValue("4");
		
		Thread.sleep(3000);
		
		s.selectByVisibleText("21");
	}
	@Test(enabled=false)
	public void test1() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","/home/manjit/Downloads/chromedriver_linux64/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement el=driver.findElement(By.id("month"));
		
		Select s=new Select(el);
		
		WebElement el1=s.getFirstSelectedOption();
		
		System.out.println("Before selecting----"+el1.getText());
		
	     s.selectByIndex(8);
	     
	     WebElement el2=s.getFirstSelectedOption();
	     
	     System.out.println("After secting---"+el2.getText());
		
		Thread.sleep(3000);
		
		driver.close();
	}

@Test(enabled=true)
public void test2() throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","/home/manjit/Downloads/chromedriver_linux64/chromedriver");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	
	WebElement el=driver.findElement(By.id("month"));
	
	Select s=new Select(el);
	
	List<WebElement>value=s.getOptions();
	
	int count=value.size();
	
	System.out.println("Total----"+count);
	
	for(int i=0;i<=count;i++) {
		
		WebElement el1=value.get(i);
		
		String text=el1.getText();
		
		System.out.println(text);
		
		if(text.equalsIgnoreCase("aug")) {
			
			el1.click();
			
			break;
		}
		
	
	}
	Thread.sleep(3000);
	driver.close();
	
	
	
}
}
