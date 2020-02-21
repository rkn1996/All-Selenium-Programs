package rkn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test69 
{

	public static void main(String[] args) throws Exception
	{
		//open browser
		System.setProperty("webdriver.chrome.driver","E:\\Testingtools\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(5000);
		driver.manage().window().maximize();
		//launch site
		driver.get("https://semantic-ui.com/modules/dropdown.html");
		Thread.sleep(5000);
		WebElement e=driver.findElement(By.xpath("(//*[@class='ui selection dropdown'])[1]"));
		String x=e.getAttribute("class");
		if(x.contains("multiple"))
		{
			System.out.println("It is a multipe select dropdown");
		}
		else
		{
			System.out.println("It is a single select dropdown");
		}
		//close site
		driver.close();
	}

}
