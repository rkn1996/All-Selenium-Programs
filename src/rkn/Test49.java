package rkn;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test49 {

	public static void main(String[] args) throws Exception
	{
		//open browser
		System.setProperty("webdriver.chrome.driver","E:\\Testingtools\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(5000);
		//launch site
		driver.get("http://www.sentia.in");
		Thread.sleep(5000);
		String x=driver.getCurrentUrl();
		System.out.println(x);
		if(x.contains("https:"))
		{
			System.out.println("It is a secured site");
		}
		else
		{
			System.out.println("It is a unsecured site");
		}
		driver.findElement(By.xpath("(//img[@class='img-responsive'])[3]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//*[text()='PAY ONLINE'])[1]")).click();
		Thread.sleep(5000);
		Set<String> win=driver.getWindowHandles();
		Thread.sleep(5000);
		ArrayList<String> al=new ArrayList<String>(win);
		Thread.sleep(5000);
		driver.switchTo().window(al.get(1));
		Thread.sleep(5000);
		String y=driver.getCurrentUrl();
		System.out.println(y);
		if(y.contains("https:"))
		{
			System.out.println("Payment tab is secured");
		}
		else
		{
			System.out.println("Payment tab is unsecured");
		}
		//close site
		driver.quit();
		

	}

}
