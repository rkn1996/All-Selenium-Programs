package rkn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test25 
{

	public static void main(String[] args) throws InterruptedException 
	{
		//open browser
		System.setProperty("webdriver.chrome.driver","E:\\Testingtools\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		Thread.sleep(5000);
		//launch site
		d.get("https://www.gmail.com");
		d.manage().window().maximize();
		Thread.sleep(5000);
		//fill login fields
		d.findElement(By.name("identifier")).sendKeys("kumarnayakroshan305@gmail.com");
		d.findElement(By.xpath("//*[text()='Next']")).click();
		Thread.sleep(5000);
		d.findElement(By.name("password")).sendKeys("");
		d.findElement(By.xpath("//*[text()='Next']")).click();
		Thread.sleep(5000);
		//select all mail in a table
		for(int i=1;i<=50;i++)
		{
		      WebElement table=d.findElement(By.xpath("(//table)[7]/tbody"));
			  WebElement row=table.findElement(By.xpath("child::tr["+i+"]"));
			  WebElement col=row.findElement(By.xpath("child::td[2]"));
			  WebElement e=col.findElement(By.xpath("child::div"));
			  e.click();
		}

	}

}
