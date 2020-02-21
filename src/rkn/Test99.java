package rkn;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Scanner;

import org.openqa.selenium.chrome.ChromeDriver;

public class Test99 extends Thread
{
		public void run()
		{	
			try
			{
				Thread.sleep(10000);
				Robot r=new Robot();
				//move focus to cancel button in authentication Window
				for(int i=1;i<=3;i++)
				{
					r.keyPress(KeyEvent.VK_TAB);
					r.keyRelease(KeyEvent.VK_TAB);
					Thread.sleep(2000);
				}
				//click on cancel
				r.keyPress(KeyEvent.VK_ENTER);
				r.keyRelease(KeyEvent.VK_ENTER);			
			}
			catch(Exception ex)
			{
				
			}
		}
	public static void main(String[] args)throws Exception
	{
		Test99 obj=new Test99();
		obj.start();
		//open browser
		System.setProperty("webdriver.chrome.driver","E:\\Testingtools\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//open site
		driver.get("https://eforms.agility.com/");
		Thread.sleep(2000);
		//close site
		//driver.close();

	}

}
