package day3;

public class Calcualtor_ReturnType {

	// return type - Void (It wont return anything)
	public void add(int i, int j) 
	{
		int sum = i+j;
		System.out.println("Sum of numbers is "+ sum);
	}
	
	//return type is Int 
	public int add1(int i, int j) 
	{
		int sum = i+j;
		System.out.println("Sum of numbers is "+ sum);
		return sum;
	}
	
	public static void main(String[] args) {
		Calcualtor_ReturnType obj = new Calcualtor_ReturnType();
		obj.add(30, 70);
		int myAge = obj.add1(50, 4);
		
		System.out.println("My age is "+ myAge);
	}
	
}
