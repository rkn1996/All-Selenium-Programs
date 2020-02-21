package rkn;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test61 {

	public static void main(String[] args) throws Exception
	{
		//open Browser
		System.setProperty("webdriver.chrome.driver","E:\\Testingtools\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//launch site
		driver.get("https://www.goindigo.in");
		//count of add lists
		List<WebElement> l=driver.findElements(By.xpath("(//div[@class='hp-carousel-btn'])[1]/following-sibling::*/div/div/div/div"));
		System.out.println("Count of add-lists are:"+l.size());
		WebElement e=driver.findElement(By.xpath("(//div[@class='hp-carousel-btn'])[1]/following-sibling::*/div/div/div"));
		//Add lists are rotating or not
		String x=e.getCssValue("transform");
		//System.out.println(x);
		if(x!=null)
		{
		  System.out.println("Add list is rotating");
		}
		else
		{
			System.out.println("Add list is not rotating");
		}
		Thread.sleep(5000);
		//3D add lists or 2D add lists
		if(x.contains("matrix3d"))
		{
			System.out.println("It is 3D add list");
		}
		else
		{
			System.out.println("It is a 2D add list");
		}
		Thread.sleep(8000);
		//Direction of rotation "matrix(1, 0, 0, 1, 0, 0)"
		String a=x.substring(7,x.length()-1);
		String[] b=a.split(",");
		int p=Integer.parseInt(b[4].trim());
		int q=Integer.parseInt(b[5].trim());
		//System.out.println(p+" "+q);
		if(p>0 & q==0)
		{
			System.out.println("Rotating from Left to Right");
		}
		else if(p<0 & q==0)
		{
			System.out.println("Rotating from Right to Left");
		}
		else if(p==0 & q>0)
		{
			System.out.println("Rotating from Bottom to Top");
		}
		else if(p==0 & q<0)
		{
			System.out.println("Rotating from Top to Bottom");
		}
		else
		{
			System.out.println("Unknown Rotation");
		}
		//Delay in rotation "all 0s ease 0s"
		String c=e.getCssValue("transition");
		//System.out.println(c);
		String[] d=c.split(" ");
		System.out.println("Delay in Rotation:"+d[1]);
		//Type of Rotation
		if(d[2].contains("ease-in-out"))
		{
			System.out.println("slow start and slow end for every rotation");
		}
		else if(d[2].contains("ease-in"))
		{
			System.out.println("slow start and fast end for every rotation");
		}
		else if(d[2].contains("ease-out"))
		{
			System.out.println("fast start and slow end for every rotation");
		}
		else if(d[2].contains("ease"))
		{
			System.out.println("slow start then fast in middle then slow end for every rotation");
		}
		else
		{
			System.out.println("fast start and fast end for every rotation");
		}
		//close site
		driver.close();

	}

}
