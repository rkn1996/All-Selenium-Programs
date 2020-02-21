package rkn;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test39 
{

	public static void main(String[] args) throws Exception
	{
		//launch browser
		System.setProperty("webdriver.chrome.driver","E:\\Testingtools\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//open site
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//Locate an ad-list spinner
		WebElement e=driver.findElement(By.xpath("//div[@class='_1r-M-1']"));
		//count numbers of add
		List<WebElement> l=e.findElements(By.xpath("child::div"));
		//count the no of adds in spinner
		System.out.println("Number of adds in add-spinner are:"+l.size());
		//check for rotation of add-list
		String s=e.getCssValue("transform");
		if(s!=null)
		{
			System.out.println("Add-list is rotating");
		}
		else
		{
			System.out.println("Add-list is not rotating");
			System.exit(0);
		}
		//check for 2D or 3D add rotation
		if(s.contains("matrix3d"))
		{
			System.out.println("It is 3D add rotation");
		}
		else
		{
			System.out.println("It is 2D add rotation");
		}
		//get direction of rotation using matrix(1,0,0,1,-939,0)
		String t=s.substring(7,s.length()-1);
		String[] p=t.split(",");
		int x=Integer.parseInt(p[4].trim());
		int y=Integer.parseInt(p[5].trim());
		if(x>0 & y==0)
		{
			System.out.println("Direction of add rotation: Left to Right ");
		}
		else if(x<0 & y==0)
		{
			System.out.println("Direction of add rotation: Right to Left ");
		}
		else if(x==0 & y>0)
		{
			System.out.println("Direction of add rotation: Bottom to Top ");
		}
		else if(x==0 & y<0)
		{
			System.out.println("Direction of add rotation: Top to Botttom ");
		}
		else
		{
		    System.out.println("Unknown rotation ");
		}
		//delay in rotation
		String z=e.getCssValue("transition");
		String[] w=z.split(" ");
		System.out.println("Delay in between add is:"+w[1]);
		if(w[2].contains("ease-in-out"))
		{
			System.out.println("slow start and slow end for every add");
		}
		else if(w[2].contains("ease-in"))
		{
			System.out.println("slow start and fast end for every add");
		}
		else if(w[2].contains("ease-out"))
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
