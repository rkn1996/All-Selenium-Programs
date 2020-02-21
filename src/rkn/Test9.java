package rkn;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test9 {

	public static void main(String[] args) throws InterruptedException 
	{
		//open browser
		System.setProperty("webdriver.chrome.driver","E://Testingtools//chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.manage().window().maximize();
		//launch site
		d.get("https://in.yahoo.com/?p=us");
		//login
		d.findElement(By.linkText("Sign in")).click();
		d.findElement(By.name("username")).sendKeys("r.nayak305@yahoo.com");
		d.findElement(By.xpath("//*[@value='Next']")).click();
		Thread.sleep(5000);
		d.findElement(By.xpath("//*[@name='password']")).sendKeys("roshan@1996");
		d.findElement(By.xpath("//*[@class='signin-cont']/button")).click();
		Thread.sleep(5000);
		d.findElement(By.xpath("//*[@aria-label='Mail'][1]")).click();
		Thread.sleep(5000);
		//click on compose
		d.findElement(By.xpath("//*[@aria-label='Compose']")).click();
		Thread.sleep(5000);
		//fill fields
		d.findElement(By.xpath("//*[@aria-owns='react-typehead-list-to']")).sendKeys("rajamahana@yahoo.com");
		Thread.sleep(5000);
		d.findElement(By.xpath("//*[@aria-label='Subject']")).sendKeys("Hello");
		Thread.sleep(5000);
		d.findElement(By.xpath("//*[@aria-label='Message body']")).sendKeys("Hello\nHow are you buddy.\nbyee");
		Thread.sleep(5000);
		d.findElement(By.xpath("//*[text()='Send']")).click();
        Thread.sleep(5000);
        //get output message
        String s=d.findElement(By.xpath("//*[@role='status']")).getText();
        System.out.println(s);
        //Logout
        d.findElement(By.xpath("//*[text()='Roshan Kumar']")).click();
        Thread.sleep(5000);
	    d.findElement(By.xpath("//*[text()='Sign out']")).click();
	    //Close Site
	    d.close();
	}

}
