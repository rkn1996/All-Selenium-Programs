package rkn;

import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Screen;

public class Test106 
{
	public static void main(String[] args) throws Exception
	{
		//open browser
		System.setProperty("webdriver.chrome.driver","E:\\Testingtools\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//launch site
		driver.get("https://www.youtube.com/");
		Thread.sleep(5000);
		//click on video using sikulix
	    Screen s=new Screen();
	    s.click("E:\\Testingtools\\Capture4.png");
	}

}
