package rkn;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test58 
{

	public static void main(String[] args) throws Exception 
	{
		//Open Browser
		System.setProperty("webdriver.chrome.driver","E:\\Testingtools\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//launch site
		driver.get("https://www.mercurytravels.co.in");
		WebElement e=driver.findElement(By.name("nights"));
		Select s=new Select(e);
		List<WebElement> l=s.getOptions();
		System.out.println("Total Options are:"+l.size());
		for(WebElement w:l)
		{
			System.out.println(w.getText());
		}
        //Close Site
		driver.close();
	}

}
