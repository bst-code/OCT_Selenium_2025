package day8;

import java.util.ArrayList;
import java.util.List;

public class ListConcept {

	
	String name = "Bala";
	String name1 = "John";
	
	// LIST 
	
	List<String> names = new ArrayList<String>();
	List<Integer> ages = new ArrayList<Integer>();
	
	public void storeData() 
	{
		names.add("Bala");     //0
		names.add("John");     //1
		names.add("Ajay");     //2
		names.add("Shivya");   //3
		names.add(null);       //4
		names.add("Shivya");   //5
		names.add(null);       //6
		
		System.out.println(names);
		
		System.out.println(names.getFirst());
		System.out.println(names.getLast());
		System.out.println(names.get(2));
		
		System.out.println(names.size());
		
		System.out.println(names.contains("Dinesh"));
		System.out.println(names.isEmpty());
		System.out.println(names.remove("Shivya"));
		System.out.println(names.remove(0));
		
		System.out.println(names);
		
		//names.clear();
		//System.out.println(names);
		
		
		// Normal for loop
		for(int i =0; i< names.size(); i++)
		{
			System.out.println("Welcome "+ names.get(i));
		}

		//Enhanced for loop - foreach
		
		for (String name : names)
		{
			System.out.println(name);
		}
		
		
	}
	
	public static void main(String[] args) {
		ListConcept obj = new ListConcept();
		obj.storeData();
		
		
	}
	
	
	
	//Add 10 data to list (Students) -- 2 records duplicate  name
	//Remove duplicate  from above list without using set concept
	
	//Add 10 data to list (Students) -- 2 records duplicate  name
	//Remove duplicate  from above list using set concept
	
}
