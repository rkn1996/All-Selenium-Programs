package rkn;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test51 {

	public static void main(String[] args) throws Exception
	{
		//open browser
		System.setProperty("webdriver.chrome.driver","E:\\Testingtools\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(5000);
		//launch site
		driver.get("https://www.flipkart.com");
		Thread.sleep(5000);
		//get size of browser window
		int h=driver.manage().window().getSize().getHeight();
		int w=driver.manage().window().getSize().getWidth();
		System.out.println("Height of the window:"+h);
		System.out.println("Weight of the window:"+w);
		Thread.sleep(5000);
		//set size of the browser window
		Dimension d=new Dimension(600,400);
		driver.manage().window().setSize(d);
		Thread.sleep(5000);
		//get position of the browser window
		int x=driver.manage().window().getPosition().getX();
		int y=driver.manage().window().getPosition().getY();
		System.out.println("Position of the window:"+x);
		System.out.println("Position of the window:"+y);
		Thread.sleep(5000);
		//set position of browser window
		Point p=new Point(500,300);
		driver.manage().window().setPosition(p);
		Thread.sleep(5000);
		//maximize browser window
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//Full screen browser window
		driver.manage().window().fullscreen();
		Thread.sleep(5000);
		//close site
		driver.close();
				
		
	}

}
