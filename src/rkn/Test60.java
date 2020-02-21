package rkn;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Test60 
{

	public static void main(String[] args) throws Exception
	{
		//Open Browser
		System.setProperty("webdriver.chrome.driver","E:\\Testingtools\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//launch site
		driver.get("https://www.google.com");
		Thread.sleep(5000);
		//take screenshot of page
		File Src=driver.getScreenshotAs(OutputType.FILE);
		File Des=new File("E:\\Testingtools\\pagescreenshot.png");
		FileHandler.copy(Src,Des);
		//close site
		driver.close();

	}

}
