package rkn;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test71 
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
		//locate drop-down
		WebElement dropdown=driver.findElement(By.xpath("//h4[text()='Multiple Selection']/following-sibling::*[4]"));
		//open drop-down list
		dropdown.click();
		//Get all options of drop-down
		List<WebElement> listofdropdown=dropdown.findElements(By.xpath("child::div[2]/div"));
		System.out.println("Count of all Options are:"+listofdropdown.size());
		Thread.sleep(5000);
		//selected multiple items
		listofdropdown.get(0).click();
		Thread.sleep(5000);
		listofdropdown.get(8).click();
		Thread.sleep(5000);
		listofdropdown.get(15).click();
		Thread.sleep(5000);
		listofdropdown.get(17).click();
		Thread.sleep(5000);
		//collect selected items
		List<WebElement> selectedoption1=dropdown.findElements(By.xpath("child::a"));
		System.out.println("Count of selected items before deletion are:"+selectedoption1.size());
		for(WebElement e:selectedoption1)
		{
			System.out.println(e.getText());
		}
		//de-select specific options
		selectedoption1.get(1).findElement(By.xpath("child::i")).click();
		Thread.sleep(5000);
		selectedoption1.get(2).findElement(By.xpath("child::i")).click();
		Thread.sleep(5000);
		//collect existing selected item
		List<WebElement> selectedoption2=dropdown.findElements(By.xpath("child::a"));
		System.out.println("Count of selected options after deletion are:"+selectedoption2.size());
		for(WebElement e:selectedoption2)
		{
			System.out.println(e.getText());
		}
		Thread.sleep(5000);
		//de-select all options
		for(WebElement i:selectedoption2)
		{
			i.findElement(By.xpath("child::i")).click();
		}
		Thread.sleep(5000);
	    //close site
		driver.close();

	}

}
