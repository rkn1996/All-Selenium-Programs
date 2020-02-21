package rkn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test76 
{

	public static void main(String[] args) throws Exception
	{
		//open browser
		System.setProperty("webdriver.chrome.driver","E:\\Testingtools\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//Launch site
		driver.get("https://jqueryui.com/droppable/");
		//switch to frame
		WebElement f=driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(f);
		//handle drag and drop
		WebElement e1=driver.findElement(By.id("draggable"));
		WebElement e2=driver.findElement(By.id("droppable"));
		String s1=e2.getCssValue("background");
		//System.out.println(s1);
		Actions a=new Actions(driver);
		Thread.sleep(5000);
		a.dragAndDrop(e1,e2).perform();
		//check color changes or not
		String s2=e2.getCssValue("background");
		//System.out.println(s2);
        if(s1.equals(s2))
        {
        	System.out.println("Test failed because colour is not changed");
        }
        else
        {
        	System.out.println("Test Successfull because colour is changed");
        }
        driver.switchTo().defaultContent();
        //close site
        driver.close();
	}

}
