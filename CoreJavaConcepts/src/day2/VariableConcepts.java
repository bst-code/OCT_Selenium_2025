package day2;

public class VariableConcepts {


	//Variable - Name of memory Location
	//Type of variable - Class or instance variable, Static Variable, Local Variable

	//Datatype variableName = "Data";
	String name = "Bala";   // Instance or class variable
	static int  age = 36; // static variable

	public static void main(String[] args)
	{

		System.out.println("Welcome to Day 2 coding");

		//Classname objname = new classname();
		VariableConcepts obj = new VariableConcepts();

		System.out.println("My name is " + obj.name);

		System.out.println("My age is "+ age);
		
	 	String location = "Chennai"; // local variable
		System.out.println("My location is "+ location);
	}



}
