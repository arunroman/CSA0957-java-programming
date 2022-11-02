import java.util.Scanner;

 class CountFactors
{
	public static void main(String[] args)
	{
		// create object
		Scanner in = new Scanner(System.in);
		
		// enter integer number here.
	    System.out.print("Enter the number : ");
	    int x = in.nextInt(); 
	    System.out.println("Number of factors of is : " +result(x));
	} 		
	
	// create function to find the factors of given number.
	public static int result(int num) 
	{	
		int ctr = 0;
		for(int i=1; i<=(int)Math.sqrt(num); i++)
	    {
	        if(num%i==0 && i*i!=num)
	        {
	            ctr+=2;
	        } 
	        else if (i*i==num) 
	        {
	            ctr++;
	        }
	    }
	        return ctr;
	}
}