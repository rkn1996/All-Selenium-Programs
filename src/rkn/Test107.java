package rkn;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Location;
import org.sikuli.script.Match;
import org.sikuli.script.Mouse;
import org.sikuli.script.Screen;

public class Test107 
{
	public static void main(String[] args) throws Exception
	{
		//open browser
		System.setProperty("webdriver.chrome.driver","E:\\Testingtools\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//open youtube site
		driver.get("https://www.youtube.com");
		Thread.sleep(5000);
		driver.findElement(By.name("search_query")).sendKeys("marjaavaan tum hi ana");
		Thread.sleep(5000);
		Screen s=new Screen();
		s.click("search.png");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[contains(text(),'Tum Hi Aana Video | Marjaavaan |')]")).click();
		Thread.sleep(5000);
		//skip add if exist
		if(s.exists("skipadd.png")!=null)
		{
		s.click("skipadd.png");
		}
		//click ok
		if(s.exists("clickok.png")!=null)
		{
		s.click("clickok.png");
		}
		Location l=new Location(300,300);
		Thread.sleep(5000);
		//click max screen
		s.wheel(l,Mouse.LEFT,0);
		s.click("youtubemaxscreen.png");
		Thread.sleep(5000);
		//click pause button
		s.wheel(l,Mouse.LEFT,0);
		s.click("pause.png");
		Thread.sleep(5000);
		//click play button
		s.wheel(l,Mouse.LEFT,0);
		s.click("play.png");
		Thread.sleep(5000);
		//increase volume
		s.mouseMove("sound2.png");
		Match m=s.find("bubble.png");
		int x=m.getX();
		int y=m.getY();
		Location l1=new Location(x-20,y);
		s.dragDrop(m,l1);
	}

}
