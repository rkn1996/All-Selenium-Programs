package rkn;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Test20
{

	public static void main(String[] args) throws Exception 
	{
		//Open Browser
        System.setProperty("webdriver.chrome.driver","E:\\Testingtools\\chromedriver.exe");
	    ChromeDriver d=new ChromeDriver();
	    Thread.sleep(5000);
	    //Launch site
	    d.get("http://www.google.co.in");
	    //Locate element
	    WebElement e=d.findElement(By.name("q"));
	    e.sendKeys("Roshan Kumar Nayak");
	    //get location of element
	    int x=e.getRect().getX();
	    int y=e.getRect().getY();
	    System.out.println("Location of the element are:");
	    System.out.println(x+" "+y);
	    //get size of element
	    int w=e.getRect().getWidth();
	    int h=e.getRect().getHeight();
	    System.out.println("Size of the element are:");
	    System.out.println(w+" "+h);
	    //get screen short of element
	    File src=e.getScreenshotAs(OutputType.FILE);
	    File dest=new File("googletextbox2.png");
	    FileHandler.copy(src,dest);
	    //close site
	    d.close();

	}

}
