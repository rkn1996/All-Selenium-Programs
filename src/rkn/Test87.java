package rkn;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class Test87 
{
	public static void main(String[] args) 
	{
		//Open Browser
		System.setProperty("webdriver.chrome.driver","E:\\Testingtools\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//Launch Site
		driver.get("https://demos.telerik.com/aspnet-ajax/calendar/overview/defaultcs.aspx");
		FluentWait f=new FluentWait(driver);
		f.pollingEvery(Duration.ofMillis(100));
		f.withTimeout(Duration.ofSeconds(20));
		f.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='rcMain']/table/tbody")));
        //select a day
		driver.findElement(By.linkText("12")).click();
		f.until(ExpectedConditions.invisibilityOfElementLocated(By.className("raDiv")));
		//get text of selected date
		String x=driver.findElement(By.xpath("//span[@class='picked-date']/span")).getText();
		System.out.println(x);
		//close site
		driver.close();
	}

}
