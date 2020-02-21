package rkn;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test26
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
		d.findElement(By.name("password")).sendKeys("babyiloveu@1234#");
		d.findElement(By.xpath("//*[text()='Next']")).click();
		Thread.sleep(5000);
		//count of column in 3rd row of table
		List<WebElement> cols=d.findElement(By.xpath("(//table)[7]/tbody/tr[3]")).findElements(By.xpath("child::td"));
		System.out.println(cols.size());
		//close site
		d.close();
		
	}

}
