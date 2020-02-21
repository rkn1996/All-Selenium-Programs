package rkn;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test15 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","E:\\Testingtools\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		//lunch site
		Thread.sleep(5000);
		d.get("http://www.hotmail.com");
		d.manage().window().maximize();
		Thread.sleep(5000);
		//login
		d.findElement(By.xpath("(//*[text()='Sign in'])[1]")).click();
		Thread.sleep(5000);
		d.findElement(By.name("loginfmt")).sendKeys("roshan305@outlook.com");
		Thread.sleep(5000);
		d.findElement(By.xpath("//*[@type='submit']")).click();
		Thread.sleep(5000);
		d.findElement(By.name("passwd")).sendKeys("roshan@1996");
		Thread.sleep(5000);
		d.findElement(By.xpath("//*[@type='submit']")).click();
		Thread.sleep(5000);
		//Click On New Message
		d.findElement(By.xpath("//*[text()='New message']")).click();
		Thread.sleep(5000);
		//fill fields
		d.findElement(By.xpath("//*[@role='combobox']")).sendKeys("roshan305@outlook.com");
		Thread.sleep(5000);
		d.findElement(By.xpath("//*[@aria-label='Add a subject']")).sendKeys("Hello");
		Thread.sleep(5000);
		d.findElement(By.xpath("//*[@aria-label='Message body']")).sendKeys("Hii\nHow are you buddy?\nByee");
		//Thread.sleep(5000); account not verified
		//d.findElement(By.xpath("(//*[text()='Send'])[2]")).click();
		Thread.sleep(5000);
		d.findElement(By.xpath("//*[text()='RN']")).click();
		Thread.sleep(5000);
		d.findElement(By.xpath("//*[text()='Sign out']")).click();
		Thread.sleep(5000);
		d.close();
	}

}
