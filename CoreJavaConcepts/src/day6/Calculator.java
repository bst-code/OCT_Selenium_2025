package day6;

public class Calculator {

	
	int i ;
	int j ;
	
	
	public Calculator() 
	{
		System.out.println("Iam constructor");
		this.i = 50;
		this.j = 40;
	}
	
	public Calculator(int no1, int no2) 
	{
		System.out.println("Iam constructor");
		this.i = no1;
		this.j = no2;
	}
	
	public Calculator(int no1, int no2, int no3) 
	{
		System.out.println("Iam constructor");
		this.i = no1;
		this.j = no2;
	}
	
	
	//constructor Overloading
	
	public int add() 
	{
		int sum = i +j;
		System.out.println("Sum of values "+ sum);
		return sum;
	}
	
	public static void main(String[] args) {
		
		//classname obj = new constructor
		
		Calculator obj = new Calculator(300, 5000);
		obj.add();
	}
}
