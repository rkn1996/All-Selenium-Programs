package rkn;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test10 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","E:\\Testingtools\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		//launch site
		d.get("https://www.gmail.com");
		d.manage().window().maximize();
		Thread.sleep(5000);
		//fill fields
		d.findElement(By.name("identifier")).sendKeys("kumarnayakroshan305@gmail.com");
		d.findElement(By.xpath("//*[text()='Next']")).click();
		Thread.sleep(5000);
		d.findElement(By.name("password")).sendKeys("");
		d.findElement(By.xpath("//*[text()='Next']")).click();
		Thread.sleep(5000);
		//click on compose
		d.findElement(By.xpath("//*[text()='Compose']")).click();
		Thread.sleep(5000);
		//fill fields
		d.findElement(By.xpath("(//*[@class='vO'])[1]")).sendKeys("kumarnayakroshan305@gmail.com");
		Thread.sleep(5000);
		d.findElement(By.xpath("//*[@name='subjectbox']")).sendKeys("Hello");
		Thread.sleep(5000);
		d.findElement(By.xpath("(//*[@aria-label='Message Body'])[2]")).sendKeys("Hii\nHow are you brother.\nByee");
		Thread.sleep(5000);
		d.findElement(By.xpath("//*[text()='Send']")).click();
		Thread.sleep(5000);
		//get the msg send text
		String s=d.findElement(By.xpath("(//*[@class='vh'])[1]")).getText();
		System.out.println(s);
		Thread.sleep(5000);
		//sign out
		d.findElement(By.xpath("//*[contains(@aria-label,'Google Acc')]/span")).click();
		Thread.sleep(5000);
		d.findElement(By.xpath("//*[text()='Sign out']")).click();
		Thread.sleep(5000);
		//close site
		d.close();


		
        

		
		
	}

}
