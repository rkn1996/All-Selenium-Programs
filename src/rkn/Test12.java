package rkn;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Test12 {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		//launch site
		System.setProperty("webdriver.chrome.driver","E:\\Testingtools\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		//launch site
		d.get("http://www.google.com");
		Thread.sleep(5000);
		d.manage().window().maximize();
		d.findElement(By.name("q")).sendKeys("Hrithik");
		Thread.sleep(5000);
		d.findElement(By.xpath("//*[@class='erkvQe']/child::*[3]")).click();
        Thread.sleep(5000);
        d.findElement(By.xpath("(//*[contains(text(),'War Trailer | Hrithik Roshan')])[1]")).click();
        Thread.sleep(5000);
        //get text as output
        String w=d.findElement(By.xpath("(//*[@id='container'])[4]/descendant::*[11]")).getText();
        System.out.println(w);
        Thread.sleep(2000);
        //skip add
        d.findElement(By.xpath("//*[text()='Skip Ad']")).click();
        Thread.sleep(5000);
        //full screen
        d.findElement(By.xpath("//*[@class='ytp-right-controls']/child::*[9]")).click();
        Thread.sleep(2300);
        //pause video
        d.findElement(By.xpath("(//*[@class='ytp-chrome-controls']/div/child::*)[2]")).click();
        //take screen-short of page
        File src=d.getScreenshotAs(OutputType.FILE);
        File dest=new File("E:\\TestingTools\\pic.png");
        FileHandler.copy(src,dest);
	}

}
