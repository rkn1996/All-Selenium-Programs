package rkn;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.Scanner;

public class Test96 
{
	public static void main(String[] args) throws Exception
	{
		//take input from keyboard
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st input");
		String x=sc.nextLine();
		System.out.println("Enter 2nd input");
		String y=sc.nextLine();
		//open calculator
		Runtime.getRuntime().exec("calc.exe");
		Thread.sleep(5000);
		//send 1st input to clip-board
		StringSelection s1=new StringSelection(x);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s1,null);
        //send clip-board data to calculator
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(5000);
		//perform addition
		r.keyPress(KeyEvent.VK_ADD);
		r.keyRelease(KeyEvent.VK_ADD);
		Thread.sleep(5000);
		//send 2nd input to clip-board
		StringSelection s2=new StringSelection(y);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s2,null);
		//send clip-board data to calculator
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);		
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(5000);
		//perform equals
		r.keyPress(KeyEvent.VK_EQUALS);
		r.keyRelease(KeyEvent.VK_EQUALS);
		Thread.sleep(5000);
		//perform right click
		r.mousePress(InputEvent.BUTTON3_MASK);
		r.mouseRelease(InputEvent.BUTTON3_MASK);
		Thread.sleep(3000);
//		r.keyPress(KeyEvent.VK_CONTEXT_MENU);
//		r.keyRelease(KeyEvent.VK_CONTEXT_MENU);
//		Thread.sleep(5000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(5000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		String z=(String) Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor);
		System.out.println("Sum:"+z);
		int a=Integer.parseInt(x);
		int b=Integer.parseInt(y);
		int c=Integer.parseInt(z);
		if(c==a+b)
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.print("Test failed");
		}
	}
}
