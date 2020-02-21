package rkn;

import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Test89 {

	public static void main(String[] args) throws Exception
	{
		//Open Browser
		System.setProperty("webdriver.chrome.driver","E:\\Testingtools\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//Launch Site
		driver.get("https://www.google.com");
		WebElement e=driver.findElement(By.xpath("//*[@id='hplogo']"));
        File srt=driver.getScreenshotAs(OutputType.FILE);
        BufferedImage fimg=ImageIO.read(srt);
        //get location of the element on the page
        int x=e.getLocation().getX();
        int y=e.getLocation().getY();
        //get width and height of the element
        int w=e.getSize().getWidth();
        int h=e.getSize().getHeight();
        //crop the entire page to get only element screenshot
        BufferedImage esrt=fimg.getSubimage(x,y,w,h);
        ImageIO.write(esrt,"png",srt);
        //copy the element screenshot to disk
        File f=new File("E:\\googlelogo.png");
        FileHandler.copy(srt,f);
        //close site
        driver.close();

	}

}
