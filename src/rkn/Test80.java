package rkn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test80 
{
    public static void main(String[] args) throws Exception
	{
		//open browser
		System.setProperty("webdriver.chrome.driver","E:\\Testingtools\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//Launch site
	    driver.get("https://www.google.com");
	    //Disable Element
	    /*driver.executeScript("document.getElementsByName('q')[0].setAttribute('disabled','true');");
	    Thread.sleep(5000);
	    driver.executeScript("document.getElementsByName('q')[0].removeAttribute('disabled');");*/
	    WebElement e=driver.findElement(By.name("q"));
	    driver.executeScript("arguments[0].setAttribute('disabled','true');",e);
	    Thread.sleep(5000);
	    driver.executeScript("arguments[0].removeAttribute('disabled');",e);
	}

}
