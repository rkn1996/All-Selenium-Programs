package rkn;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test14 {

	public static void main(String[] args) throws InterruptedException 
	{
		//Open Browser
		System.setProperty("webdriver.chrome.driver","E:\\Testingtools\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		Thread.sleep(5000);
		//launch site
		d.get("https://www.youtube.com");
		d.manage().window().maximize();
		Thread.sleep(5000);
		//click on Trending
		d.findElement(By.xpath("(//*[text()='Trending'])[2]")).click();
		Thread.sleep(5000);
		//Play NO.1 Trending Video
		d.findElement(By.xpath("(//*[@id='title-wrapper']/descendant::*)[3]")).click();
		Thread.sleep(5000);
		//Get text no1 on trending
		String s=d.findElement(By.xpath("//*[text()='#1 ON TRENDING']")).getText();
		System.out.println(s);
		
	}

}
