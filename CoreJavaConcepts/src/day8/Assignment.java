package day8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Assignment {

	List<String> names = new ArrayList<String>();
	List<String> uniqueNames = new ArrayList<String>(); // []
	
	Set<String> uniqueSetNames =  new HashSet<String>();
	public void storeData() 
	{
		names.add("Bala");    
		names.add("John");   
		names.add("Ajay");  
		names.add("Ajay"); 
		names.add("Shivya");
		names.add(null);       
		names.add("Shivya");   
		names.add(null);     
		names.add("Bala");   
		names.add("Bala");   
		names.add("Bala");  
		names.add("Shivya");  
		names.add("Shivya");
		
//		for (String name : names) {
//			
//			if(!uniqueNames.contains(name)) //[Bala].contains(Bala)
//			{
//				uniqueNames.add(name); //[Bala, John,Ajay,Shivya]
//			}
//			
//		}
		
		for (String name : names)
		{
			uniqueSetNames.add(name);
		}
		
		System.out.println(names);
		//System.out.println(uniqueNames);
		System.out.println(uniqueSetNames);
	}
	
	public static void main(String[] args) {
		Assignment obj = new Assignment();
		obj.storeData();
		
	}
}
