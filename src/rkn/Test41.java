package rkn;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test41 
{

	public static void main(String[] args) throws Exception
	{
		//Open Browser
		System.setProperty("webdriver.chrome.driver","E:\\Testingtools\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(5000);
		//launch site
		driver.get("https://www.w3schools.com/css/tryit.asp?filename=trycss_form_width");
		//Switch to frame
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.name("fname")).sendKeys("Roshan Kumar Nayak");
        //close site
		driver.close();
	}

}
