package rkn;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test32 
{

	public static void main(String[] args) 
	{
		//Open Browser
		System.setProperty("webdriver.chrome.driver","E:\\Testingtools\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		//launch site
		d.get("https://www.amazon.in");
		//get count of all image
		List<WebElement> l=d.findElements(By.xpath("//img"));
		int vimg=0;
		int himg=0;
		for(int i=0;i<l.size();i++)
		{
			if(l.get(i).isDisplayed())
			{
				vimg=vimg+1;
				String s=l.get(i).getAttribute("src");
				System.out.println(s);
			}
			else
			{
				himg=himg+1;
			}
			
		}
		System.out.println("Visible image link are:"+vimg);
		System.out.println("Hidden image link are:"+himg);
		d.close();
		

	}

}
