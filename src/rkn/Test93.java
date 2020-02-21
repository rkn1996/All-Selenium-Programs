package rkn;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class Test93 
{
	public static void main(String[] args) throws Exception 
	{
		//open browser
		System.setProperty("webdriver.chrome.driver","E:\\Testingtools\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//launch site
		driver.get("https://www.gmail.com");
		//Use of Relative Locator
		driver.findElement(RelativeLocator.withTagName("input").above(By.xpath("//*[text()='Forgot email?']"))).sendKeys("Roshan");
        Thread.sleep(5000);
        driver.findElement(RelativeLocator.withTagName("span").toRightOf(By.xpath("//*[text()='Create account']")).xpath("//*[text()='Next']")).click();

	}

}
