package day4;

public class Child extends Parent {

	// multiple inheritance is not possible in class 
	// multiple inheritance is possible in interface ? 
	// only multi level is allowed in java class
	int childAge = 7;
	
	int x = 20;

	public void childProperty() 
	{
		System.out.println("child owns toy car");
		
		System.out.println(this.x);
	}
	
	public static void main(String[] args) 
	{	
		Child obj = new Child();
		obj.parentProperty();
		obj.childProperty();
		obj.grandParentProperty();
		System.out.println(obj.parentAge);
		System.out.println(obj.childAge);
		System.out.println(obj.grandParentAge);
		
		
		
	
	}
	
}
