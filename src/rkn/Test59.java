package rkn;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test59 {

	public static void main(String[] args) throws Exception
	{
		//Open Browser
		System.setProperty("webdriver.chrome.driver","E:\\Testingtools\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//launch site
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		//switch to frame
		driver.switchTo().frame("iframeResult");
		WebElement e=driver.findElement(By.name("cars"));
		Select s=new Select(e);
		List<WebElement> l=s.getOptions();
		System.out.println("Total options are:"+l.size());
		for(WebElement w:l)
		{
			System.out.println(w.getText());
		}
		if(s.isMultiple())
		{
			System.out.println("It is a multiple drop-down");
		}
		else
		{
			System.out.println("It is a single drop-down");
		}
		//back to page
		driver.switchTo().defaultContent();
		//close site
		driver.close();

	}

}
