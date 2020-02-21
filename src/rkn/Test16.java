package rkn;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test16 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","E:\\Testingtools\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		//launch site
		d.get("https://www.gmail.com");
		d.manage().window().maximize();
		Thread.sleep(5000);
		//fill login fields
		d.findElement(By.name("identifier")).sendKeys("kumarnayakroshan305@gmail.com");
		d.findElement(By.xpath("//*[text()='Next']")).click();
		Thread.sleep(5000);
		d.findElement(By.name("password")).sendKeys("");
		d.findElement(By.xpath("//*[text()='Next']")).click();
		Thread.sleep(5000);
		//Select 3rd mail to delete
		d.findElement(By.xpath("(//*[@class='Cp'])[2]/div/table/tbody/tr[3]/td[2]")).click();
		Thread.sleep(5000);
		//delete mail
		d.findElement(By.xpath("(//*[@class='asa'])[3]")).click();
		Thread.sleep(5000);
		//get the o/p message Conversation moved to Trash
		String s=d.findElement(By.xpath("(//*[@class='vh'])[1]")).getText();
		System.out.print(s);
		//sign out
		d.findElement(By.xpath("//*[contains(@aria-label,'Google Acc')]/span")).click();
		Thread.sleep(5000);
		d.findElement(By.xpath("//*[text()='Sign out']")).click();
		Thread.sleep(5000);
		//close site
		d.close();

	}

}
