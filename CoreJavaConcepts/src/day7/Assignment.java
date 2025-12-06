package day7;

public class Assignment {

	// Find the odd and even number between 0 to 100;
	
		public static void findOddOrEven() 
		{
			for(int i = 0; i<=100; i++)
			{
				if(i%2==0)
				{
					System.out.println("The given no is even "+ i);
				}
				else 
				{
					System.out.println("The given no is odd "+ i);
				}
			}
		}
		
		public static void main(String[] args) {
			findOddOrEven();
		}
}
