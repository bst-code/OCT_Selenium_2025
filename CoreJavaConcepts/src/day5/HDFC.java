package day5;

public class HDFC implements  RBI, WorldBank {

	
	public static void generateAccountNo() 
	{
		System.out.println("HDFC generating new account no for customer");
	}

	@Override
	public void getCustomerDetails()
	{
		System.out.println("HDFC bank get customer mobile no and aadhar no only");
		
	}
	
	public static void main(String[] args) {
		
		//Interfacename objname = new Classname();
		RBI obj = new HDFC();
		obj.getCustomerDetails();
		
		obj = new ICICI();
		//obj.getCustomerDetails();
		
		System.out.println(homeLoan_ROI);
		generateAccountNo();
	}

	@Override
	public void getCurrencyType() {
		
		System.out.println("Curreny Type is rupee");
		
	}
}
