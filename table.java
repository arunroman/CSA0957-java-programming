import java.util.Scanner;
class table 
{
    	public static void main(String[] args) 
    	{
        	Scanner s = new Scanner(System.in);
		System.out.print("M:");        
		int m=s.nextInt();
            System.out.print("N:");
            int n=s.nextInt();
		if(n>0)
		{
        		for(int i=1; i <= n; i++)
        		{
            		System.out.println(i+" x "+m+" = "+(m*i));
        		}
		}
		if(n<0)
		{
			for(int i=-1; i>=n; i--)
        		{	
            		System.out.println(i+" x "+m+" = "+(m*i));
        		}
		}
		if(m==0 && n==0)
		{
			System.out.println("Invalid");
			return;
		}
		if(n==0)
		{
			System.out.println("Invalid");
			return;			
		}
    	}
}