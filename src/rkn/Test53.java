package rkn;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test53 {

	public static void main(String[] args) throws Exception
	{
		//open browser
		System.setProperty("webdriver.chrome.driver","E:\\Testingtools\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(5000);
		driver.manage().window().maximize();
		//launch site
		driver.get("https://www.goindigo.in");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//label[@for='roundTrip']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='or-src']")).sendKeys("hyderabd",Keys.ENTER);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='or-dest']")).sendKeys("Bhubaneshwar",Keys.ENTER);
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//*[@class='ui-datepicker-calendar'])[2]/tbody/tr[1]/td[4]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//*[@class='ui-datepicker-calendar'])[1]/tbody/tr[3]/td[3]")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("passenger")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//*[@class='icon-plus'])[1]")).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("//button[@class='btn btn-primary pax-done btn-pad-y']")).sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@for='students']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Search Flight']")).click();
		//close site
		driver.close();
		
		

	}

}
