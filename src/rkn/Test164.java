package rkn;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.Button;
import org.sikuli.script.Location;
import org.sikuli.script.Screen;

public class Test164 
{
	public static void main(String[] args) throws Exception
	{
		//open browser
		System.setProperty("webdriver.chrome.driver","E:\\Testingtools\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//launch site
		driver.get("https://www.youtube.com");
		WebDriverWait w=new WebDriverWait(driver,20);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='search']")));
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("my sql tutorial for beginners");
		driver.findElement(By.xpath("(//button[@aria-label='Search'])[1]")).click();
		//Sikulix2.0
		Screen s=new Screen();
		s.click("capture001.png");
		Location l=new Location(300,400);
		s.wheel(l,Button.LEFT,0);
		if(s.exists("skipadd.png")!=null)
		{
			s.click("skipadd.png");
		}
		s.wheel(l,Button.LEFT,0);
		s.click("youtubemaxscreen.png");
		Location l2=new Location(200,300);
		s.wheel(l2,Button.LEFT,0);
		s.click("pause.png");
		s.wheel(l2,Button.LEFT,0);		
		s.click("play.png");
	}

}
