package Capture;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screen {
	
	public static void capture(WebDriver driver,String name) {
		
		try {
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		File source=ts.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(source,new File("./Screen/"+" "+name+" "+".png"));
		
		}
		catch(Exception e) {
			
			System.out.println(e.getMessage());
		}
	}

}
