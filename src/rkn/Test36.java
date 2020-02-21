package rkn;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test36 
{

	public static void main(String[] args) throws Exception
	{
		//Open Browser
		System.setProperty("webdriver.chrome.driver","E:\\Testingtools\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		//launch site
		d.get("https://www.google.co.in");
		d.manage().window().maximize();
		Thread.sleep(5000);
		//count all suggestion and display in console
        d.findElement(By.name("q")).sendKeys("Roshan");
        Thread.sleep(5000);
        List<WebElement> l1=d.findElements(By.xpath("//ul[@role='listbox']/descendant::span"));
        System.out.println("count of all Suggestion are"+l1.size());
        for(WebElement e:l1)
        {
        	String s=e.getText();
        	System.out.println(s);
        }
        //close site
        d.close();
    }

}
