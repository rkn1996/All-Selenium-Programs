package rkn;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test40 
{

	public static void main(String[] args) throws Exception 
	{
		//open Browser
		System.setProperty("webdriver.chrome.driver","E:\\testingtools\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//Launch site
		Thread.sleep(5000);
		driver.get("https://www.amazon.in");
		//Locate and add-list spinner
		WebElement element=driver.findElement(By.xpath("//ol[@class='a-carousel']"));
		//count no. of adds
		List<WebElement> list=element.findElements(By.xpath("child::li"));
		System.out.println("Total no. of adds are:"+list.size());
		//check for rotation of add-list
		String s=element.getCssValue("transform");
		if(s!=null)
		{
			System.out.println("Add-list is Rotating");
		}
		else
		{
			System.out.println("Add-list is not Rotating");
		}
		//check for 2D or 3D add rotation matrix(1, 0, 0, 1, -3051, 0)
		if(s.contains("matrix3D"))
		{
			System.out.println("It is a 3D add rotation");
		}
		else
		{
			System.out.println("It is a 2D add rotation");
		}
		//Direction of add rotation
		String m=s.substring(7,s.length()-1);
		String[] n=m.split(",");
		float x=Float.parseFloat(n[4].trim());
		float y=Float.parseFloat(n[5].trim());
		//System.out.println(x+" "+y);
		if(x>0 & y==0)
		{
			System.out.println("Add is rotating from Left To Right");
		}
		else if(x<0 & y==0)
		{
			System.out.println("Add is rotating from Right To Left");
		}
		else if(x==0 & y>0)
		{
			System.out.println("Add is rotating from Top To Bottom");
		}
		else if(x==0 & y<0)
		{
			System.out.println("Add is rotating from Bottom To Top");
		}
		else
		{
			System.out.println("Unknown Rotation");
		}
		//Delay in rotation all 0s ease 0s
		String d=element.getCssValue("transition");
		System.out.println(d);
		String[] f=d.split(" ");
		System.out.println("Delay in between add is:"+f[1]);
		if(f[2].contains("ease-in-out"))
		{
			System.out.println("slow start and slow end for every add");
		}
		else if(f[2].contains("ease-in"))
		{
			System.out.println("slow start and fast end for every add");
		}
		else if(f[2].contains("ease-out"))
		{
			System.out.println("fast start and slow end for every add");
		}
		else
		{
			System.out.println("fast start and fast end for every add");
		}
		//close site
		driver.close();

	}

}
