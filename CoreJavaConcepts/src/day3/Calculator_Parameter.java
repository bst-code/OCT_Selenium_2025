package day3;

public class Calculator_Parameter {

	public void add(int i, int j) 
	{
		//int i = 10; // hard coded data
		//int j = 20;
		int sum = i+j;
		System.out.println("Sum of numbers is "+ sum);
	}
	
	public static void sub(int i, int j) 
	{
		int diff = i-j;
		System.out.println("Difference of numbers is "+ diff);
	}
	
	public static void main(String[] args) {
		
		Calculator_Parameter obj = new Calculator_Parameter();
		sub(200, 100);
		sub(300, 400);
		sub(60, 1);
		
		obj.add(40, 70);
		obj.add(3, 0);
		obj.add(90, 8);
	}
}
