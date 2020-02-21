package rkn;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Test79 {

	public static void main(String[] args) throws Exception
	{
		//open browser
		System.setProperty("webdriver.chrome.driver","E:\\Testingtools\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//Launch site
	    driver.get("https://www.google.com");
	    //highlight an element
	    //driver.executeScript("document.getElementsByName('q')[0].style.border='2px Red groove';");
	    WebElement e=driver.findElement(By.name("q"));
	    driver.executeScript("arguments[0].style.border='2px Red dotted';",e);
	    Thread.sleep(5000);
	    //take screenshot
	    File src=driver.getScreenshotAs(OutputType.FILE);
	    File dest=new File("E:\\Testingtools\\pagescrnshrt1.png");
	    FileHandler.copy(src,dest);
	    Thread.sleep(5000);
	    //close site
	    driver.close();	    

	}

}
