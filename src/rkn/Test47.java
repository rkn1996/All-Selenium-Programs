package rkn;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test47 
{

	public static void main(String[] args) throws Exception 
	{
		//Open Browser
		System.setProperty("webdriver.chrome.driver","E:\\Testingtools\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(5000);
		//Launch site
		driver.get("http://www.sentia.in");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//*[@class='img-responsive'])[3]")).click();
		Thread.sleep(5000);
		//click on 1st term fee
		driver.findElement(By.xpath("(//a[text()='PAY ONLINE'])[1]")).click();
		//collect browser windows/tabs handles
		Set<String> win1=driver.getWindowHandles();
		ArrayList<String> al1=new ArrayList<String>(win1);
		Thread.sleep(5000);
		//switch to second browser window/tab
		driver.switchTo().window(al1.get(1));
		Thread.sleep(5000);
		driver.findElement(By.name("fetchName")).sendKeys("2303");
		driver.findElement(By.xpath("//*[text()='Submit']")).click();
		Thread.sleep(5000);
		String fee1=driver.findElement(By.xpath("//span[text()='39000.00']")).getText();
		Thread.sleep(5000);
		float f1=Float.parseFloat(fee1);
		Thread.sleep(5000);
		//back to 1st window/tab
		driver.switchTo().window(al1.get(0));
		driver.findElement(By.xpath("//*[contains(@href,'sentia2ndtermfee')]")).click();
		//collect browser windows/tabs handles
		Set<String> win2=driver.getWindowHandles();
		ArrayList<String> al2=new ArrayList<String>(win2);
		Thread.sleep(5000);
		//switch to 3rd browser window/tab
		driver.switchTo().window(al2.get(2));
		Thread.sleep(5000);
		driver.findElement(By.name("fetchName")).sendKeys("2303");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[text()='Submit']")).click();
		Thread.sleep(5000);
		String fee2=driver.findElement(By.xpath("//*[text()='Total Amount:']/following-sibling::span")).getText();
		Thread.sleep(5000);
		float f2=Float.parseFloat(fee2);
		//close site
		driver.quit();
		System.out.println("1st term fees:"+f1);
		System.out.println("2nd term fees:"+f2);
		float total=f1+f2;
		System.out.println("Total fees:"+total);
		
	}

}
