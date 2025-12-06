package day9;

public class ChildClass extends ParentClass{

	
	public void getAge() 
	{
		System.out.println("Child age is 7");
	}
	
	public static void main(String[] args) {
		
		//ChildClass obj = new ChildClass();
		
		ParentClass obj = new ChildClass();
		obj.getAge();
		
	}
}
