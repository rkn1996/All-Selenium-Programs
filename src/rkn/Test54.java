package rkn;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test54 {

	public static void main(String[] args) throws Exception
	{
		//open browser
		System.setProperty("webdriver.chrome.driver","E:\\Testingtools\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(5000);
		driver.manage().window().maximize();
		//launch site
		driver.get("https://www.tutorialspoint.com/javascript/javascript_dialog_boxes.htm");
		Thread.sleep(5000);
		//driver.switchTo().frame(1);	
		//driver.findElement(By.xpath("//input[@onclick='Warn();']")).click();
		List<WebElement> l=driver.findElements(By.xpath("(//iframe)|(//frame)"));
		System.out.println("Count of frames in page:"+l.size());
		int i=1;
		for(WebElement e:l)
		{
			driver.switchTo().frame(e);
			List<WebElement> cl=driver.findElements(By.xpath("(//iframe)|(//frame)"));
			System.out.println("Count of child frame in "+i+"th element is:"+cl.size());
			if(cl.size()>0)
			{
				int j=1;
				for(WebElement ce:cl)
				{
					driver.switchTo().frame(ce);
					List<WebElement> scl=driver.findElements(By.xpath("(//iframe)|(//frame)"));
					System.out.println("Count of Subchild frame in "+j+"th element is:"+scl.size());
					driver.switchTo().parentFrame();
					j++;
				}
			}
			driver.switchTo().defaultContent();
			i++;
		}
		//close site
		driver.close();
		
	}
}
