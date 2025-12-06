package test;

public class Test {

	
public static void main(String[] args) {
	
	String a = "Sampath is taking interview";
    
    
    StringBuilder sb = new StringBuilder();
    
    for(int k =0; k<a.split(" ").length;k++)
    {
    	String rev ="";
    String word = a.split(" ")[k].trim();   
    
    for(int i = word.length()-1; i>=0;i--)
    {    
        rev = rev +word.charAt(i);
    }
   
   sb = sb.append(rev +" ");
    
    }
    
    System.out.println(sb);
}
}
