package day10;

import java.util.ArrayList;
import java.util.List;

public class ExceptionHandling {

	
	// 1. CompileTime exception or Checked Exception
	// 2. RunTime Exception or unchecked Exception --->   try catch finally block
	
	public static void main(String[] args) throws InterruptedException {
		
		int i = 0;
		
		//Throws / throw
		
		Thread.sleep(2000);
		
		
		try {
		List<String> students =  new ArrayList<String>();
		students.add("Bala"); //0
		students.add("John"); //1
		
		System.out.println(students.get(1));
		
		throw new ArithmeticException();
		
		}
		catch(NullPointerException e) 
		{
			System.out.println("Please check the object creation...");
		}
		catch(IndexOutOfBoundsException e) 
		{
			System.out.println("Please enter value less than 2");
			
		}
		catch(ArithmeticException e) 
		{
			System.out.println("ArithmeticException called");
		}
		catch(Exception e) 
		{
			System.out.println("Iam Exception block..");
			System.out.println(e.getLocalizedMessage());
		}
		
		finally 
		{
			System.out.println("It runs always");
		}
	
		
	}
}
