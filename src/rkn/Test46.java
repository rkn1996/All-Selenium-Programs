package rkn;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test46 
{

	public static void main(String[] args) throws Exception
	{
		//Open Browser
		System.setProperty("webdriver.chrome.driver","E:\\Testingtools\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(5000);
		//Launch site
		driver.get("https://www.snapdeal.com");
		//count of adds
		List<WebElement> l=driver.findElements(By.xpath("//div[@id='top-banner']/child::div"));
		System.out.println("Count of adds are:"+l.size());
		//adds are rotating or not
		WebElement e=driver.findElement(By.xpath("//div[@id='top-banner']"));
		String x=e.getCssValue("transform");
		//System.out.println(x);
		if(x!=null)
		{
			System.out.println("Add list is Rotating");
		}
		else
		{
			System.out.println("Add list not Rotating");
		}
		//2d rotation or 3d rotation
		if(x.contains("matrix3d"))
		{
			System.out.println("It is a 3D Add list");
		}
		else
		{
			System.out.println("It is a 2D Add list");
		}
		//check for rotation direction, matrix(1, 0, 0, 1, -769, 0)
		String t=x.substring(7,x.length()-1);
		String[] p=t.split(",");
		float r=Float.parseFloat(p[4].trim());
		float y=Float.parseFloat(p[5].trim());
		if(r>1 & y==0)
		{
		   System.out.println("Add list is Rotating from Left to Right");
		}
		else if(r<1 & y==0)
		{
			System.out.println("Add list is Rotating from Right to Left");
		}
		else if(r==0 & y>1)
		{
			System.out.println("Add list is Rotating from Bottom to Top");
		}
		else if(r==0 & y<1)
		{
			System.out.println("Add list is Rotating from Top to Buttom");
		}
		else
		{
			System.out.println("Unknown Rotation");
		}
		//Delay in rotation ,all 0s ease 0s
		String m=e.getCssValue("transition");
		//System.out.println(m);
		String[] n=m.split(" ");
		System.out.println("Delay in btwn adds are:"+n[1]);
		if(m.contains("ease-in-out"))
		{
			System.out.println("slow start and slow end for every add");
		}
		else if(m.contains("ease-in"))
		{
			System.out.println("slow start and first end for every add");
		}
		else if(m.contains("ease-out"))
		{
			System.out.println("fast start and slow end for every add");
		}
		else
		{
			System.out.println("fast start and first end for every add");
		}
		
		//close site
		driver.close();
		

	}

}
