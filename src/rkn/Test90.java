package rkn;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class Test90 {

	public static void main(String[] args)
	{
		//Take input from keyboard
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a word");
		String s=sc.nextLine();
		//Open Browser
		System.setProperty("webdriver.chrome.driver","E:\\Testingtools\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//fluent wait
		FluentWait w=new FluentWait(driver);
		w.pollingEvery(Duration.ofMillis(100));
		w.withTimeout(Duration.ofSeconds(20));
		driver.get("https://www.w3schools.com/angular/tryit.asp?filename=try_ng_example1");
		//switch to frame
		w.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("iframeResult"));
		//locate element
		driver.findElement(By.xpath("//*[@ng-model='name']")).sendKeys(s);
		try
		{
			w.until(ExpectedConditions.textToBe(By.xpath("//p[contains(text(),'You wrote: ')]"),"You wrote: "+s));
			System.out.println("Test Passed");
		}
		catch(Exception ex)
		{
			System.out.println("Test failed");
		}
		//close site
		driver.close();

	}

}
