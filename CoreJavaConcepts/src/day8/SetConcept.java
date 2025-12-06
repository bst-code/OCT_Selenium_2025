package day8;
import java.util.HashSet;
import java.util.Set;

public class SetConcept {

	
	String name = "Bala";
	String name1 = "John";
	
	// SET 
	Set<String> names = new HashSet<String>();
	
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
		
		System.out.println(names.size());
		
		System.out.println(names.contains("Dinesh"));
		System.out.println(names.isEmpty());
		System.out.println(names.remove("Shivya"));
		System.out.println(names.remove(null));
		
		System.out.println(names);
		
		//names.clear();
	//	System.out.println(names);
		
	for (String name : names) {
		
		System.out.println(name);
	}
		
	}
	
	public static void main(String[] args) {
		SetConcept obj = new SetConcept();
		obj.storeData();
	}
	
	
	
}
