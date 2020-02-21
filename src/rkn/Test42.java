package rkn;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test42 {

	public static void main(String[] args) throws Exception
	{
		//Open Browser
		System.setProperty("webdriver.chrome.driver","E:\\Testingtools\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(5000);
		//Launch Site
		driver.get("https://www.w3schools.com/css/tryit.asp?filename=trycss_form_width");
		//Get count of frame in page
		Thread.sleep(15000);
		List<WebElement> list=driver.findElements(By.xpath("(//iframe)|(//frame)"));
		System.out.println("Total count of frames in page:"+list.size());
		//Get count of child frame in each frame
		Thread.sleep(10000);
		int i=1;
		for(WebElement e:list)
		{
			driver.switchTo().frame(e);
			List<WebElement> childlist=driver.findElements(By.xpath("(//iframe)|(//frame)"));
			System.out.println("Total count of child frames in "+i+"th frame are"+childlist.size());		
		//Get count sub child frames in each child frame
		if(childlist.size()>0)
		{
			int j=1;
			for(WebElement ce:childlist)
			{
				driver.switchTo().frame(ce);
				List<WebElement> subchildlist=driver.findElements(By.xpath("(//iframe)|(//frame)"));
				System.out.println("Total count of sub child frames in "+j+"th frame are"+subchildlist.size());
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
