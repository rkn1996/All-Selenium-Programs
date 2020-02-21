package rkn;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class Test94 
{
	public static void main(String[] args) throws Exception
	{
		//open browser
		System.setProperty("webdriver.chrome.driver","E:\\Testingtools\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//launch site
		driver.get("https://www.google.com");
		//use of relative locator
        driver.findElement(RelativeLocator.withTagName("input").above(By.xpath("(//*[@value='Google Search'])[2]")).name("q")).sendKeys("Roshan");
	}

}
