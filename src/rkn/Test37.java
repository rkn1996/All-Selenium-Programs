package rkn;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test37 
{

	public static void main(String[] args) throws Exception 
	{   
		//Take input
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a word to search");
		String x=sc.nextLine();
		System.out.println("Enter expected suggestion");
		String y=sc.nextLine();
		//Open Browser
		System.setProperty("webdriver.chrome.driver","E:\\Testingtools\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		//launch site
		d.get("https://www.google.co.in");
		d.manage().window().maximize();
		Thread.sleep(5000);
		d.findElement(By.name("q")).sendKeys(x);
		Thread.sleep(5000);
		//Handle auto-complete or cache element
		List<WebElement> l=d.findElements(By.xpath("//ul[@role='listbox']/descendant::span"));
		//select expected suggestion in auto-complete list
		int f=0;
		for(WebElement e:l)
		{
			if(y.equalsIgnoreCase(e.getText()))
			{
				f=1;
				//select suggestion
				e.click();
				break;
			}
		}
		if(f==0)
		{
			System.out.println("Expexted Suggestion not found");
		}
		//close site
		d.close();
		//close scanner session
		sc.close();
	}

}
