package day3;

public class Calculator {
	
	public void add() 
	{
		int i = 10;
		int j = 20;
		int sum = i+j;
		System.out.println("Sum of numbers is "+ sum);
	}
	
	public static void sub() 
	{
		int i = 10;
		int j = 20;
		int diff = i-j;
		System.out.println("Difference of numbers is "+ diff);
	}
	
	public static void main(String[] args) {
		
		Calculator obj = new Calculator();
		obj.add();
		sub();
	}
	

}
