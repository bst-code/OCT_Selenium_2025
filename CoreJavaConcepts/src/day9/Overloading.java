package day9;

public class Overloading {

	// Polymorphism - ploy --> many & morphism --> different form
	//1. Method overloading - A class will have same method name with diffrent parameter or datatype
	//2. Method Overriding - Child class will have same method signature as of parent class
	
	public void add() 
	{
		int i = 10;
		int j = 20;
		int sum = i +j;
		System.out.println(sum);
	}
	public void add(int i, int j) 
	{
		int sum = i +j;
		System.out.println(sum);
	}
	
	public void add(int i, int j, int k) 
	{
		int sum = i +j +k;
		System.out.println(sum);
	}
	
	public void add(String firstname, String lastName) 
	{
		String fullname = firstname + lastName;
		System.out.println(fullname);
	}
	
	public static void main(String[] args) {
		Overloading obj = new Overloading();
		obj.add();
		obj.add(20, 40);
		obj.add(4, 5, 6);
		obj.add("Bala", "murugan");
	}
}
