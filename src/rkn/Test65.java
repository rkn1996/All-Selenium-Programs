package rkn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test65 
{

	public static void main(String[] args) throws Exception
	{
		//open browser
		System.setProperty("webdriver.chrome.driver","E:\\Testingtools\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(5000);
		driver.manage().window().maximize();
		//launch site
		driver.get("https://www.flipkart.com");
        driver.findElement(By.xpath("//*[@class='mCRfo9']/descendant::*[3]")).click();
        Thread.sleep(5000);
        //move to women element
        WebElement e=driver.findElement(By.xpath("//*[text()='Men']"));
        Actions a=new Actions(driver);
        //a.moveToElement(e).perform();
        //a.moveToElement(e,20,5).perform();
        int x=e.getLocation().getX();
        int y=e.getLocation().getY();
        a.moveByOffset(x+20,y+5).perform();
        Thread.sleep(5000);
        //close site
        driver.close();
        
	}

}
