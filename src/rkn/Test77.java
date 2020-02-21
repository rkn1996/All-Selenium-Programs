package rkn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test77 
{
   public static void main(String[] args) throws Exception
   {
		//open browser
		System.setProperty("webdriver.chrome.driver","E:\\Testingtools\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//Launch site
		driver.get("https://jqueryui.com/slider/");
		//switch to frame
		WebElement f=driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(f);
		//handle Horizontal slider
        WebElement e1=driver.findElement(By.xpath("//*[@id='slider']/span"));
        Actions a=new Actions(driver);
        a.dragAndDropBy(e1,150,0).perform();
        Thread.sleep(5000);
        driver.switchTo().defaultContent();
        //click on vertical slider
        driver.findElement(By.linkText("Vertical slider")).click();
        Thread.sleep(5000);
        //switch to frame
        driver.switchTo().frame(f);
        //handle Vertical slider
        WebElement e2=driver.findElement(By.xpath("//*[@id='slider-vertical']/span"));
        a.dragAndDropBy(e2,0,-100).perform();
        Thread.sleep(5000);
        a.dragAndDropBy(e2,0,100).perform();
        driver.switchTo().defaultContent();
        //close site
        driver.close();
        
	}

}
