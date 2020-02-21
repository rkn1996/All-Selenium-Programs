package rkn;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test11 
{

	public static void main(String[] args) 
	{
		//launch site
		System.setProperty("webdriver.chrome.driver","E:\\Testingtools\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		//launch site
		d.get("http://www.google.com");
		d.manage().window().maximize();
		d.findElement(By.name("q")).sendKeys("Roshana",Keys.BACK_SPACE,Keys.chord(Keys.CONTROL,"a"),Keys.chord(Keys.CONTROL,"x"));
     }

}
