package rkn;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test70 
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
		//locate element
		WebElement e=driver.findElement(By.xpath("//*[@id='selection']/following-sibling::*[3]"));
		//open that drop-down
		e.click();
		List<WebElement> l=e.findElements(By.xpath("child::div[2]/div"));
		System.out.println(l.size());
		Thread.sleep(5000);
		for(WebElement i:l)
		{
			System.out.println(i.getText());
		}
		//select an item
		String x=l.get(1).getText();
		System.out.println(x);
		Thread.sleep(5000);
		//close site
		driver.close();
			

	}

}
