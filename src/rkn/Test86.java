package rkn;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test86 
{
	public static void main(String[] args) 
	{
		//Open Browser
		System.setProperty("webdriver.chrome.driver","E:\\TestingTools\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//launch site
		driver.get("https://demos.telerik.com/aspnet-ajax/calendar/overview/defaultcs.aspx");
		WebDriverWait w=new WebDriverWait(driver,20);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='rcMain']/table/tbody")));
		//select a date
		driver.findElement(By.linkText("2")).click();
		w.until(ExpectedConditions.invisibilityOfElementLocated(By.className("raDiv")));
		//get text of selected date
		String x=driver.findElement(By.xpath("//span[@class='picked-date']/span")).getText();
		System.out.println(x);
		//close site
		driver.close();
		

	}

}
